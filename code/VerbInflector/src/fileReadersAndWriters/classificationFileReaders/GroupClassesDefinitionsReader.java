package classificationFileReaders;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import MyFileReader.MyFileReader;

/**
 * 
 * @author ערן
 * this object reads the class clusters definitions from a configuration file.
 * newClassNames = the new defined cluster name
 * oldClassNames = each list contains the class names corresponding to the cluster with the
 * 				   same index
 */
public class GroupClassesDefinitionsReader {

	List<String> groupedClasses;
	HashMap<String, List<String>> newGraoupNameToGroup;
	HashMap<String, String> groupedClassToNewGraoup;
	
	public GroupClassesDefinitionsReader(String filePathAndName){
		try {
			this.groupedClasses = new ArrayList<String>();
			this.newGraoupNameToGroup = new HashMap<String, List<String>>();
			this.groupedClassToNewGraoup = new HashMap<String, String>();
			String file = MyFileReader.readFileAsString(filePathAndName);
			file = file.replaceAll(" ", "");
			file = file.replaceAll("\t", "");
			file = file.replaceAll("\r", "");
			String[] lines = file.split("\n");
			for(int i=0; i<lines.length;i++){
				// if the current line is (not empty)&(deos not start with "#")
				if(lines[i].length()>0&&!lines[i].substring(0, 1).equals("#")){
					String[] line = lines[i].split("=");
					String newClassName = line[0];
					String[] mappedClassesToNew = line[1].split(",");
					List<String> currGroup = new ArrayList<String>();
					for(int j=0; j<mappedClassesToNew.length;j++){
						String cls = mappedClassesToNew[j];
						currGroup.add(cls);
						this.groupedClasses.add(cls);
						this.groupedClassToNewGraoup.put(cls, newClassName);
					}
					this.newGraoupNameToGroup.put(newClassName, currGroup);
					
				}
			}
		} catch (IOException e) {
			System.out.println("No such file: " + filePathAndName);
			e.printStackTrace();
		}
	}
	
	public String getGroupName(String className){
		return this.groupedClassToNewGraoup.get(className);
	}
	
	public List<String> getGroupNames(){
		List<String> ret =  new ArrayList<String>();
		for(String name: this.newGraoupNameToGroup.keySet()){
			ret.add(name);
		}
		return ret;
	}
	
	public List<String> getGroup(String newClassName){
		return this.newGraoupNameToGroup.get(newClassName);
	}
	
	public boolean isInGroup(String cls){
		return this.groupedClasses.contains(cls);
	}
}
