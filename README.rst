Hebrew NLP Resources
####################

This repository collects resources for NLP in Hebrew, as part of the `NLPH project <https://github.com/NLPH/NLPH>`_, which you can `read more about here <https://github.com/NLPH/NLPH>`_. Resources are divided to folders by type. If you have a resource you can contribute, to be released under some open license, please submit a pull request, or contact us at `contact@nlph.org.il <mailto:contact@nlph.org.il>`_. See `here for a list of companies operating in the field <https://github.com/NLPH/NLPH_Resources/blob/master/Industry.rst>`_.

This specific document is meant to be a list of Hebrew NLP resources, both for general use and to be used as reference when discussing what existing tools can be opened, adapted or integrated to help create a good open source foundation for NLP in Hebrew, as part of the `NLPH Project <https://github.com/NLPH/NLPH>`_.

When contributing to the list, please add a link to the license for all non-paper resources, e.g. {`AGPL-3.0`_}, {?} for an unkonwn licesnse or {X} for unreleased/closed/copyrighted resources. For code resource, please also add the main language in which the tool is written, e.g. [Python] or [?] for an unknown programming language. Please add hosting mirrors with pointy brackets, e.g. `<Zenodo mirror> <https://zenodo.org/record/2707356>`_.


.. contents::

.. section-numbering::



Corpora
=======


Structured Corpora
------------------

* `The MILA corpora collection <http://www.mila.cs.technion.ac.il/resources_corpora.html>`_ {`GPLv3`_} - The MILA center has 20 different corpora available for free for non-commercial use. All are available in plain text format, and most have tokenized, morphologically-analyzed, and morphologically-disambiguated versions available too.

* `Hebrew Wikipedia dumps <https://dumps.wikimedia.org/hewiki/latest/>`_ {`CC-BY-SA 3.0`_} - Wikipedia, the free encyclopedia, publishes dumps of its content as XML files on a monthly basis.

* `שתי שקל <https://he.wikipedia.org/wiki/%D7%95%D7%99%D7%A7%D7%99%D7%A4%D7%93%D7%99%D7%94:%D7%AA%D7%97%D7%96%D7%95%D7%A7%D7%94/%D7%A9%D7%AA%D7%99_%D7%A9%D7%A7%D7%9C>`_ {?} - Wikiproject for correcting grammar mistakes. (Heuristic) positive annotions can be derived from  `query <https://quarry.wmflabs.org/query/21957>`_.

* `Hebrew Speech Databases (HSD) <http://www.ee.bgu.ac.il/~hebspdb/Catolog/>`_ {?} - The HSD contains several Hebrew Speech Databases designed for the development and evaluation of Hebrew Speech Recognition Systems. 

* `CoSIH - The Corpus of Spoken Hebrew <http://cosih.com/table-3.html>`_ {?} - The Corpus of Spoken Israeli Hebrew (CoSIH) is a database of recordings of spoken Israeli Hebrew

* `hebrew corpus <http://hebrewcorpus.nmelrc.org/search.php>`_ {?} - HebrewCorpus is a new corpus with 150 million words from NMELRC.

* `The Haifa Corpus of Spoken Hebrew <http://weblx2.haifa.ac.il/~corpus/corpus_website/>`_ {X} - A corpus of recorded spoken Hebrew and transcripts. Protected under rights reserved to Prof. Yael Maschler.

* `Eran Tomer's Digital Vocalized Text Corpus <https://www.dropbox.com/sh/rlg0k0flz0675ho/AADvfxmY3SN8lqmkGAWr0hd2a?dl=0>`_ {`Apache License 2.0`_} - A corpus of digital vocalized Hebrew texts created by Eran Tomer as part of his Master thesis. The corpus is found in the ``resources`` folder.

* `The SVLM Hebrew Wikipedia Courpus <https://github.com/NLPH/SVLM-Hebrew-Wikipedia-Corpus>`_ {`CC-BY-SA 3.0`_} - A corpus of 50K sentences from Hebrew Wikipedia chosen to ensure phoneme coverage for the purpose of a sentence recording project.

* `Knesset 2004-2005 <https://github.com/NLPH/knesset-2004-2005>`_ {`Public Domain`_} - A corpus of transcriptions of Knesset (Israeli parliament) meetings between January 2004 and November 2005. Includes tokenized and morphologically tagged versions of most of the documents in the corpus. `<MILA> <http://www.mila.cs.technion.ac.il/eng/resources_corpora_haknesset.html>`_ `<Zenodo> <https://zenodo.org/record/2707356>`_


Corpora Sources
---------------

* `JPress <http://www.jpress.org.il>`_ {`Custom Terms of Use <http://web.nli.org.il/sites/JPress/English/about/Pages/tems-of-use.aspx>`_} - `The National Library <http://web.nli.org.il>`_ offers a collection of Jewish newspapers published in various countries, languages, and time periods, including digital versions and full-text search. The texts are published under a `custom Terms of Use document <http://web.nli.org.il/sites/JPress/English/about/Pages/tems-of-use.aspx>`_ that prohibits commercial use, and additionally requires checking the copyright status and receiving permission from the copyright-holder of the work for any use requiring such permission according to the Copyright Law.

* `DICTA <http://dicta.org.il/>`_ {?} - Analytical tools for Jewish texts. They also have a `GitHub organization <https://github.com/Dicta-Israel-Center-for-Text-Analysis>`_.

* `Sefaria <https://www.sefaria.org.il/>`_ {Various} - A Living Library of Jewish Texts. 3,000 years of Jewish texts in Hebrew and English translation.

* `HaArchion <http://www.haarchion.co.il/>`_ {?} - Recording of various Hebrew prose and poetry being read.

* `Project Ben Yehuda public dumps <https://github.com/projectbenyehuda/public_domain_dump>`_ {`Public Domain`_} - A repository containing dumps of thousands of public domain works in Hebrew, from `Project Ben-Yehuda <https://bybe.benyehuda.org/>`_, in plaintext UTF-8 files, with and without diacritics (nikkud), and in HTML files.

* `ThinkIL <http://thinkil.co.il/the-website/credits_and_sponsors/>`_ {`CC-BY-SA 3.0`_} - An archive of the writings of Zvi Yanai.

* `"Ha'Olam Ha'Ze" Newspaper Archive <http://magazine.thisworld.online/>`_ {?} - An online archive of issues of "Ha'Olam Ha'Ze" ("This World") Israeli newspaper.


Linguistic Resources
====================


Lexicons
--------

* The BGU morphological lexicon {?} - Is it released?

* The morphological lexicon of the Israeli National Institute for Testing and Evaluation - Unreleased.

* `The MILA lexicon of Hebrew words <http://www.mila.cs.technion.ac.il/resources_lexicons_mila.html>`_ {`GPLv3`_} - The lexicon was designed mainly for usage by morphological analyzers, but is being constantly extended to facilitate other applications as well. The lexicon contains about 25,000 lexicon items and is extended regularly. Free for non-commercial use.

* `Hebrew WordNet <http://www.mila.cs.technion.ac.il/resources_lexicons_wordnet.html>`_ {`GPLv3`_} -  Hebrew WordNet uses the MultiWordNet methodology and is aligned with the one developed at IRST (and therefore is aligned with English, Italian and Spanish). Free for non-commercial use.

* `MILA's Verb Complements Lexicon <http://www.mila.cs.technion.ac.il/resources_lexicons_verbcomplements.html>`_ {`GPLv3`_} - `NLPH backup here <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/lexicons/MILA_verb_complements%20_lexicon>`_.


Dictionaries & Word Lists
-------------------------

* `MILA's Hebrew Stopwords List <http://www.mila.cs.technion.ac.il/resources_lexicons_stopwords.html>`_ - An Excel XLSX file containing 23,327 Hebrew tokens in descending order of frequency. `[NLPH backup] <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/word_lists/MILA_stopwords>`_

* Uniform {?} - An inflection dictionary. Missing details: Creating organization? Is it released?

* `Hebrew verb lists <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/word_lists/hebrew_verbs_eran_tomer>`_ {`CC-BY 4.0`_} - Created by Eran Tomer (erantom@gmail.com).

* `Hebrew name lists <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/word_lists/dday>`_ {`CC-BY 4.0`_} - Lists of street, company, given and last names. Created by Guy Laybovitz.

* `1000 most frequent words in Hebrew tweets during (roughly) 2018 <https://github.com/NLPH/NLPH_Resources/blob/master/linguistic_resources/word_lists/top_1000_hebrew_words_twitter_2018.txt>`_.

* `KIMA - the Historical Hebrew Gazetteer <http://data.geo-kima.org/>`_ - Place Names in the Hebrew Script. An open, attestation based, historical database. Kima currently holds 27,239 Places, with 94,650 alternate variants of their names and 236,744 attestations of these variants.

Treebanks
---------

* `The Hebrew Treebank <http://www.mila.cs.technion.ac.il/resources_treebank.html>`_ {`GPLv3`_} - The Hebrew Treebank Version 2.0 contains 6500 hand-annotated sentences of news items from the MILA HaAretz Corpus, with full word segmentation and morpho-syntactic analysis. Morphological features that are not directly relevant for syntactic structures, like roots, templates and patterns, are not analyzed. This resource can be used freely for research purposes only.

* `UD Hebrew Treebank <https://github.com/UniversalDependencies/UD_Hebrew>`_ {`CC BY-NC-SA 4.0`_} - The Hebrew Universal Dependencies Treebank.

* `Modern Hebrew Dependency Treebank v.1 <https://www.cs.bgu.ac.il/~yoavg/data/hebdeptb/>`_ {`GPLv3`_} - This is the Modern Hebrew Dependency Treebank which was created and used in Yoav Goldberg's `PhD thesis <http://www.cs.bgu.ac.il/~nlpproj/yoav-phd.pdf>`_.

Embeddings
----------

* `fastText pre-trained word vectors <https://github.com/facebookresearch/fastText/blob/master/pretrained-vectors.md>`_ for Hebrew {`CC-BY-SA 3.0`_} - Trained on `Wikipedia <https://www.wikipedia.org/>`_ using `fastText <https://github.com/facebookresearch/fastText>`_. Comes in both the binary and text default formats of fastText: `binary+text <https://s3-us-west-1.amazonaws.com/fasttext-vectors/wiki.he.zip>`_, `text <https://s3-us-west-1.amazonaws.com/fasttext-vectors/wiki.he.vec>`_. In the text format, each line contains a word followed by its embedding; Each value is space separated; Words are ordered by their frequency in a descending order.

* `hebrew-word2vec pre-trained word vectors <https://github.com/Ronshm/hebrew-word2vec>`_ {`Apache License 2.0`_} - Trained on data from Twitter. Developed by Ron Shemesh in Bar-Ilan University's NLP lab under the instruction of Dr. Yoav Goldberg. Contains vectors for over 1.4M words (as of January 2018). Comes in a zip with two files: a text file with a word list and a NumPy array file (npy file).

* `NLPL word embeddings <http://vectors.nlpl.eu/repository/>`_ - Trained on the Hebrew CoNLL17 corpus using Word2Vec continuous skipgram, with a vecotor dimension of 100 and a window size of 10. The vocabulary includes 672,384 words.

* `Hebrew Word Embeddings by Lior Shkiller <https://github.com/liorshk/wordembedding-hebrew>`_ - Read more in `this blog post <https://www.oreilly.com/learning/capturing-semantic-meanings-using-deep-learning>`_.

* `Hebrew Subword Embeddings <https://nlp.h-its.org/bpemb/he/>`_

* `LASER Language-Agnostic SEntence Representations <https://github.com/facebookresearch/LASER>`_ {`CC BY-NC 4.0`_} - LASER is a library to calculate and use multilingual sentence embeddings.

* Hebrew word embeddings by Dr. Oren Glickman {?} - Trained on Twitter. Unreleased. Presented in his lecture in yearly conference of The Israel Statistical Association for 2018 (`presentation file <https://github.com/NLPH/NLPH_Resources/blob/master/linguistic_resources/other/Hebrew-Word_Embedding-Glickman.pptx>`_).


Other
-----

* `Hebrew SimLex-999 <https://drive.google.com/drive/folders/0B_pyA_IW4g-jTlJzOHlSWVZWbTQ>`_ - A Hebrew version of the `Simlex-999 <https://fh295.github.io/simlex.html>`_ resource for the evaluation of models that learn the meaning of words and concepts. A copy can also be found in the `Attract-Repel repository <https://github.com/nmrksic/attract-repel>`_. Another copy is found in `this repository <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/other/hebrew_simlex-999>`_.


Code
====

Also see here:  https://github.com/iddoberger/awesome-hebrew-nlp


Tokenization
------------

* `Yoav Goldberg's Hebrew Tokenizer <https://www.cs.bgu.ac.il/~yoavg/software/hebtokenizer/>`_

* Jonathan Laserson's sentence separator [Python] {?}- Not a tokenizer per-se, but an important part in the tokenization of documents. Jonathan is kindly checking the possibility of open sourcing this tool.

* `The MILA Hebrew Tokenization Tool <http://www.mila.cs.technion.ac.il/tools_token.html>`_ [?] {`GPLv3`_} - Free for non-commercial use.


Morphological and Syntactic Analysis
------------------------------------

* `Morphological and Syntactic Analysis of Hebrew Texts by ONLP <http://onlp.openu.org.il>`_

* `yap morpho-syntactic parser <http://github.com/habeanf/yap>`_ [Go] {`Apache License 2.0`_} - Morphological Analysis, disambiguation and dependency Parser. Morphological Analyzer relies on the BGU Lexicon.

* `Yoav Goldberg's syntactic parsers <https://www.cs.bgu.ac.il/~yoavg/uni/hebrewparsing.he.html>`_ [Python, Java] {`GPLv3`_} - Two syntactic parsers for Hebrew, one is dependency-based and the other is constituency-based. Distributed under the `GPLv3`_ license, free for academic use only.

  * `Yoav Goldberg's Hebrew Dependency Parsing <https://www.cs.bgu.ac.il/~yoavg/software/hebparsers/hebdepparser/>`_ [Python, Java] {`GPLv3`_} 

  * `Yoav Goldberg's Hebrew Constituency Parsing <https://www.cs.bgu.ac.il/~yoavg/software/hebparsers/hebconstparser/>`_ [Python, Java] {`GPLv3`_} 

* `The MILA Morphological Analysis Tool <http://www.mila.cs.technion.ac.il/tools_analysis.html>`_ [?] {`GPLv3`_} - Takes as input undotted Hebrew text (formatted either as plain text or as tokenized XML following MILA's standards). The Analyzer then returns, for each token, all the possible morphological analyses of the token, reflecting part of speech, transliteration, gender, number, definiteness, and possessive suffix. Free for non-commercial use. 

* `The MILA Morphological Disambiguation Tool <http://www.mila.cs.technion.ac.il/tools_disambiguation.html>`_ [?] {`GPLv3`_} - Takes as input morphologically-analyzed text and uses a Hidden Markov Model (HMM) to assign scores for each analysis, considering contextual information from the rest of the sentence. For a given token, all analyses deemed impossible are given scores of 0; all n analyses deemed possible are given positive scores. Free for non-commercial use.

* `Hspell <http://hspell.ivrix.org.il/>`_ [?] {`AGPL-3.0`_} - Free Hebrew linguistic project including spell checker and  morphological analyzer. 

  * `HspellPy <https://github.com/eranroz/HspellPy/>`_ [Python] {`AGPL-3.0`_} - Python wrapper for hspell.

* `BGU Tagger: Morphological Tagging of Hebrew <https://www.cs.bgu.ac.il/~elhadad/nlp12/hebrew/TagHebrew.html>`_ [Java] {?} - Morphological Analysis, Disambiguation.


Tagging Tools
-------------

* `LightTag <nlph.lighttag.io>`_ [?] {not open source} - A tool for managing annotation projects. Handles right-to-left and part-of-word marking. `Tutorial video here <https://www.youtube.com/watch?v=eTlrTC_n_yg>`_.

* `Recogito <http://recogito.pelagios.org/>`_ [Scala, JavaScript, HTML] {`Apache License 2.0`_} - A tool for linked data annotation.

* `CATMA <http://catma.de/>`_ [HTML, Java] {unclear} - A web-based tool for research and collaboration over text data. Handles right-to-left and part-of-word marking.

  * See the system itself here: http://portal.catma.de/catma/
  * And the code here: https://github.com/mpetris/catma

* `WebAnno <https://webanno.github.io/>`_ [Java] {`Apache License 2.0`_} - Web-based. Support RTL and project management.
  
  * Repository: https://github.com/webanno/webanno

* `Arethusa: Annotation Environment <https://www.perseids.org/tools/arethusa/app/#/>`_ [JavaScript] {`MIT`_} - A backend-independent client-side annotation framework. `Repository here <https://github.com/alpheios-project/arethusa>`_.

* `rasa-nlu-trainer <https://github.com/RasaHQ/rasa-nlu-trainer>`_ [JavaScript] {`MIT`_} - A tool to edit training examples for `rasa NLU <https://github.com/rasahq/rasa_nlu>`_. Handles right-to-left and part-of-word marking.

* `brat <http://brat.nlplab.org/>`_ [Python, JavaScript] {`MIT`_} - An online environment for collaborative text annotation. Does not support right-to-left. `Repository here <https://github.com/nlplab/brat>`_.

* `openNLP <https://opennlp.apache.org/>`_ [Java] {`Apache License 2.0`_} - OpenNLP has a tagging tool.

* `opeNER <http://www.opener-project.eu/>`_ [Ruby, HTML, Java, Python] - opeNER has a tagging tool.

* `pybossa <http://pybossa.com/>`_ [Python] {`AGPL-3.0`_} - A framework for crowdsourcing of data analysis and enrichment tasks. `GitHub <https://github.com/Scifabric/pybossa>`_.

* `TextThrasher <https://github.com/Goodly/TextThresher>`_ [JavaScript, Python] - A crowdsourced text annotator. Built with React and Redux (possibly also with pybossa). 

* `SHEBANQ <https://shebanq.ancient-data.org/>`_ - System for HEBrew Text: ANnotations for Queries and Markup. SHEBANQ is an online environment for studying the Hebrew Bible.


Models
------

* `Neural Sentiment Analyzer for Modern Hebrew <https://github.com/omilab/Neural-Sentiment-Analyzer-for-Modern-Hebrew>`_ [?] {`MIT`_} - This code and dataset provide an established benchmark for neural sentiment analysis for Modern Hebrew.

* `hebrew-word2vec <https://github.com/Ronshm/hebrew-word2vec>`_ [C, Python] {`Apache License 2.0`_} - Developed by Ron Shemesh in Bar-Ilan University's NLP lab under the instruction of Dr. Yoav Goldberg. Contains `pre-trained vectors <https://github.com/Ronshm/hebrew-word2vec/blob/master/api/README.md>`_ and an online demo.

* `Universal Language Model Fine-tuning for Text Classification (ULMFiT) in Hebrew <https://github.com/hanan9m/hebrew_ULMFiT?fbclid=IwAR0wJkoxmaCmhuZnSVOLBo1Mo362v6-66PmXutOr9FhhoItIHoqG_2MzV8E>`_ - The weights (e.g. a trained model) for a Hebrew version for  Howard's and Ruder's ULMFiT model. Trained on the Hebrew Wikipedia corpus.

* `BERT's multilingual model <https://github.com/google-research/bert/blob/master/multilingual.md>`_ - Trained (also) on Hebrew.


Other
-----

* `Verb Inflector <https://github.com/NLPH/NLPH_Resources/tree/master/code/VerbInflector>`_ [Java] {`Apache License 2.0`_} - A generation mechanism, created as part of Eran Tomer's (erantom@gmail.com) Master thesis, which produces vocalized and morphologically tagged Hebrew verbs given a non-vocalized verb in base-form and an indication of which pattern the verb follows.

* `HebMorph <https://github.com/synhershko/HebMorph>`_ [Lucene] {`AGPL-3.0`_} - An open-source effort to make Hebrew properly searchable by various IR software libraries. Includes Hebrew Analyzer for Lucene.


* `Hebrew OCR with Nikud <https://www.cs.bgu.ac.il/~elhadad/hocr/>`_ [Python] {?} - A program to convert Hebrew text files (without Nikud) to text files with the correct Nikud. Developed by Adi Oz and Vered Shani.

* `Text-Fabric <https://dans-labs.github.io/text-fabric/>`_ [Python] {`CC BY-NC 4.0`_} - A Python package for browsing and processing ancient corpora, focused on the Hebrew Bible Database.

* `Nakdan <https://nakdan.dicta.org.il/>`_ - Automatic Nikud for Hebrew texts.

* `The Automatic Hebrew Transriber <http://hebrew-transcriber.online/>`_ - Automatically transcribes text from Hebrew audio and video files.

* `word2word <https://github.com/Kyubyong/word2word>`_ {`Apache License 2.0`_} - Easy-to-use word-to-word translations for 3,564 language pairs. Hebrew is one of the 62 supported language, and thus word-to-word translation to/from Hebrew is supported for 61 languages.

Commercial services
-------------------

* `Eyfo <https://ey.fo/search>`_ - A commercial engine for search and entity tagging in Hebrew.

* `Melingo's ICA (Intelligent Content Analysis) <http://www.melingo.com/text-analysis/ica/>`_ - A text analysis and textual categorized entity extraction API for Hebrew, Arabic and Farsi texts.

* `Genius <https://www.genius.co.il>`_ - Automatic analysis of free text in Hebrew.

* `AlmaReader <https://app.almareader.com/>`_ - Online text-to-speech service for Hebrew.


Labs & Researchers
==================

This list is meant to cover both researchers in the field of natural language processing, and in various related fields, including neurolinguistics and speech science. It also aims to cover researchers in both academia and industry.

Academia
--------

* The Open University of Israel:

  * `The ONLP Lab <https://www.openu.ac.il/en/onlp/pages/default.aspx>`_ [`Twitter <https://twitter.com/OnlpLab/>`_]:

    * `Dr. Reut Tsarfaty <https://www.openu.ac.il/en/personalsites/ReutTsarfaty.aspx>`_ - Head of the ONLP Lab.

    * Dan Bareket - Research assistant.

  * `The Open Media and Information Lab (OMILab) at the Open University of Israel <https://www.openu.ac.il/en/omilab/pages/default.aspx>`_ - An interdisciplinary center for research and for teaching in new media and related areas, such as big data, information science, network cultures and digital sociology.

    * `Dr. Vered Silber-Varod <https://www.openu.ac.il/en/personalsites/VeredSilberVarod.aspx>`_ - Director of the Open Media and Information Lab (OMILab). Research interests and publications focus on various aspects of speech sciences, with expertise in speech prosody, acoustic phonetics, and speech communication and text analytics.
  
  * `Dr. Anat Lerner, Senior Lecturer <https://www.openu.ac.il/en/personalsites/AnatLerner.aspx>`_ - Interested in speech prosody analyses, combinatorial auctions and computer Networks (especially Ad-Hoc networks, mobile and cellular networks).

* Bar Ilan University:

  * `The Natural Language Processing Lab at Bar Ilan University <http://u.cs.biu.ac.il/~nlp/>`_ [`Twitter <https://twitter.com/biunlp/>`_]:

    * `Prof. Ido Dagan <http://u.cs.biu.ac.il/~dagan/>`_
  
    * `Prof. Yoav Goldberg <http://u.cs.biu.ac.il/~yogo/>`_
  
    * `Graduate Students & Researchers <http://u.cs.biu.ac.il/~nlp/people/graduate-students-researchers/>`_

  * `Prof. Moshe Koppel <https://www1.biu.ac.il/indexE.php?id=8041&pt=30&cPath=7702>`_
  
  * `Dr. Avi Shmidman <http://dsi.biu.ac.il/team/dr-avi-shmidman/>`_
  
  * `The Speech, Language and Deep Learning Lab at Bar Ilan University <http://u.cs.biu.ac.il/~jkeshet/#lab>`_ [`GitHub <https://github.com/MLSpeech>`_]:

    * `Prof. Joseph (Yossi) Keshet <http://u.cs.biu.ac.il/~jkeshet/>`_
  
* Ben-Gurion University:

  * `Natural Language Processing Lab at Ben Gurion University <https://www.cs.bgu.ac.il/~elhadad/nlpproj/>`_

    * `Prof. Michael Elhadad <https://www.cs.bgu.ac.il/~elhadad/>`_
  
    * `Dr. Yael Netzer <https://www.cs.bgu.ac.il/~yaeln/>`_
  
    * `Dr. Meni Adler <https://www.cs.bgu.ac.il/~adlerm/>`_

  * `Dr. Oren Tzur <http://www.ise.bgu.ac.il/OrenTsur/>`_

* University of Haifa:

  * `Prof. Shuly Wintner <http://cs.haifa.ac.il/~shuly/Shuly_Wintner/Home.html>`_
  
  * `Dr. Einat Minkov <https://sites.google.com/hevra.haifa.ac.il/einatm/>`_ - My main interests are in Information Extraction and Semantics, as well as in other Natural Language Processing applications. I am also interested in Machine Learning - and the application of learning to NLP problems. 

* Tel Aviv University:

  * `Dr. Jonathan Berant <http://www.cs.tau.ac.il/~joberant/>`_

* The Technion:

  * `Prof. Alon Itai <http://www.cs.technion.ac.il/~itai/>`_ (retired)

  * `Dr. Roi Reichart <https://ie.technion.ac.il/~roiri/>`_ - An Assistant Professor at the faculty of Industrial Engineering and Management of the Technion. Working on Natural Language Processing (NLP). Interested in language learning in its context and design models that integrate domain and world knowledge with data-driven methods.
  
  
* The Hebrew University of Jerusalem:

  * `Prof. Ronen Feldman <http://pluto.huji.ac.il/~rfeldman/>`_ - Feldman's main areas of research are natural language processing, entity extraction and text relations, text sentiment analysis, and language processing for algorithmic trading. He is one of the founder of the discipline of text mining.

  * `Prof. Ari Rappoport <http://www.cs.huji.ac.il/~arir/>`_ - With his main contribution in the area of Neuroscience, where he developed a comprehensive theory of the brain, Prof. Rappoport's Computer Science area of interest is language (Computational Linguistics, Natural Language Processing (NLP)), from cognitive science and machine learning perspectives.

  * `Dr. Omri Abend <http://www.cs.huji.ac.il/~oabend/>`_ - My fields of interest are Computational Linguistics and Natural Language Processing. Specifically, I conduct research on semantic (meaning) representation from a computational perspective. My research is tightly linked to statistical learning, language technology (such as Machine Translation and Information Extraction), and computational modeling of child language acquisition.
  
  * `Dr. Dafna Shahaf <http://www.cs.huji.ac.il/~dshahaf/>`_ - Dr. Shahaf's research focuses on helping people make sense of the world. She designs algorithms that help people understand the underlying structure of complex topics, and connect the dots between different pieces. She also likes to formalize intuitive notions; see recent work on Computational Humor.

  * `The Neurolinguistics Laboratory at the Edmond and Lily Safra Center for Brain Sciences (ELSC) <https://www.grodzinskylab.com/>`_:

    * `Prof. Yosef Grodzinsky <https://en.cognitive.huji.ac.il/people/yosef-grodzinsky?ref_tid=3172>`_ - Research fields: functional anatomy of language, linguistic theory (syntax, semantics), language acquisition, aphasia, individual variation.
 

Non-Profit
----------

* Allen Institute for AI - Israel

  * Prof. Yoav Goldberg
  
  * Dr. Jonathan Berant


Industry
--------

Researching natural language processing in the industry? Open a pull request and add yourself here now!


Papers
======


Corpora, Lexicon and Dictionary Generation
------------------------------------------

* `Hebrew Dependency Parsing: Initial Results <https://www.cs.bgu.ac.il/~yoavg/publications/iwpt2009depbaseline.pdf>`_, IWPT-2009 (Short Paper), Yoav Goldberg and Michael Elhadad.

* Itai, A., S. Wintner, and S. Yona: 2006, `‘A Computational Lexicon of Contemporary Hebrew’ <http://www.cs.technion.ac.il/~itai/publications/NLP/lexicon-final.pdf?fbclid=IwAR1bBcwEA7A__fWG1a1fwDdcqKZj375YcMdCrhYrdBkUw_SZTrB8flHnf9M>`_. In: Proceedings of The fifth international conference on Language Resources and Evaluation (LREC-2006). Genoa, Italy.

* Alon Itai and Shuly Wintner. `"Language Resources for Hebrew." <http://cs.haifa.ac.il/~shuly/publications/lre4h.pdf>`_ Language Resources and Evaluation 42(1):75-98, March 2008.

* Noam Ordan and Shuly Wintner. `"Hebrew WordNet: A Test Case of Aligning Lexical Databases Across Languages." <http://cs.haifa.ac.il/~shuly/publications/wordnet.pdf>`_ International Journal of Translation 19(1):39-58, 2007.

* Noam Ordan and Shuly Wintner. `"Representing Natural Gender in Multilingual Lexical Databases." <http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.81.8099&rep=rep1&type=pdf>`_ International Journal of Lexicography 18(3):357-370, September 2005.

* Khalil Sima'an, Alon Itai, Yoad Winter, Alon Altman and Noa Nativ. `"Building a Tree-Bank of Modern Hebrew Text." <http://www.cs.technion.ac.il/~winter/Corpus-Project/paper.pdf>`_ Traitment Automatique des Langues, 42, 347-380. 2001.


Morphological Analysis & Disambiguation
---------------------------------------

* Shlomo Yona and Shuly Wintner. `"A Finite-State Morphological Grammar of Hebrew." <http://cs.haifa.ac.il/~shuly/publications/morphgram.pdf>`_ Natural Language Engineering 14(2):173-190, April 2008. Language Resources and Evaluation 42(1):75-98, March 2008.

* Meni Adler. `Hebrew Morphological Disambiguation: An Unsupervised Stochastic Word-based Approach. <https://www.cs.bgu.ac.il/~adlerm/dat/thesis.pdf>`_ Ph.D. Thesis, Ben-Gurion University of the Negev, 2007.

* Roy Bar-Haim, Khalil Sima'an and Yoad Winter. `Part-of-Speech Tagging of Modern Hebrew Text. <http://www.cs.technion.ac.il/~barhaim/MorphTagger/HebrewPOSTaggingNLE.pdf>`_ Natural Language Engineering 14 (2):223-251. Copyright Cambridge University Press, 2008.

* Amir More and Reut Tsarfaty. `Data-Driven Morphological Analysis and Disambiguation for Morphologically Rich Languages and Universal Dependencies <http://aclweb.org/anthology/C16-1033>`_. Proceedings of COLING 2016, the 26th International Conference on Computational Linguistics: Technical Papers. December 2016.


Word Embeddings
---------------

* Oded Avraham and Yoav Goldberg. `The Interplay of Semantics and Morphology in Word Embeddings <https://arxiv.org/abs/1704.01938>`_. Proceedings of the 15th Conference of the European Chapter of the Association for Computational Linguistics (EACL 2017).


Methodology
-----------

* `Named Entities Tagging Guidelines for Hebrew <https://github.com/NLPH/NLPH_Resources/blob/master/methodology/hebrew_named_entity_tagging_guidelines.doc?raw=true>`_ {`Apache License 2.0`_} - Written during M.Sc. research by Naama Ben-Mordecai advised by Dr. Michael Elhadad at the Department of Computer Science, Ben-Gurion University.


Other
-----

* Eran Tomer. `Automatic Hebrew Text Vocalization <http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.357.7101&rep=rep1&type=pdf>`_. Thesis submitted as part of the requirements for the M.Sc. degree of Ben-Gurion University of the Negev, 2012.


Courses, presnetations and meetups
===================================

* `Bar Ilan University's NLP course <https://www.youtube.com/playlist?list=PLM96W_EHEqh78zJ0bPqT3Wy8DPHbJU-Zh>`_

* `ONLP April 2019 Meetup lecture slides <https://drive.google.com/file/d/1YxZeeFjQJzdJQKabzSelm-ojm1LfM2Sy/view?usp=sharing&fbclid=IwAR3Y9a3BiHNxmxGyL65Vq_KKqCNkmyZnP_0dKTzbk_ZQPzfu6yb5BHbGsyw>`_




.. _Public Domain: https://en.wikipedia.org/wiki/Public_domain
.. _CC-BY-SA 3.0: https://creativecommons.org/licenses/by-sa/3.0/
.. _AGPL-3.0: https://opensource.org/licenses/AGPL-3.0
.. _GPLv3: http://www.gnu.org/copyleft/gpl.html
.. _CC BY-NC-SA 4.0: https://creativecommons.org/licenses/by-nc-sa/4.0/
.. _CC BY-NC 4.0: https://creativecommons.org/licenses/by-nc/4.0/
.. _Apache License 2.0: https://www.apache.org/licenses/LICENSE-2.0
.. _MIT: https://en.wikipedia.org/wiki/MIT_License
.. _CC-BY 4.0: https://creativecommons.org/licenses/by/4.0/
