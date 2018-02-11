Hebrew NLP Resources
####################

This repository collects resources for NLP in Hebrew, as part of the `NLPH project <https://github.com/NLPH/NLPH>`_, which you can `read more about here <https://github.com/NLPH/NLPH>`_. Resources are divided to folders by type. If you have a resource you can contribute, to be released under some open license, please submit a pull request, or contact us at `NLPH.Project@gmail.com <mailto:NLPH.Project@gmail.com>`_.

This specific document is meant to be a list of Hebrew NLP resources, both for general use and to be used as reference when discussing what existing tools can be opened, adapted or integrated to help create a good Open Source foundation for NLP in Hebrew, as part of the `NLPH Project <https://github.com/NLPH/NLPH>`_.

When contributing to the list, please add a link to the license, e.g. {`AGPL-3.0`_} or {?} for an unkonwn licesnse, for all non-paper resources. For code resource, please also add the main language in which the tool is written, e.g. [Python] or [?] for an unknown programming language.


.. contents::

.. section-numbering::



Corpora
=======


Structured Corpora
------------------

* `The MILA corpora collection <http://www.mila.cs.technion.ac.il/resources_corpora.html>`_ {`GPLv3`_} - The MILA center has 20 different corpora available for free for non-commercial use. All are available in plain text format, and most have tokenized, morphologically-analyzed, and morphologically-disambiguated versions available too.

* `Hebrew Wikipedia dumps <https://dumps.wikimedia.org/hewiki/latest/>`_ {`CC-BY-SA 3.0`_} - Wikipedia, the free encyclopedia, publishes dumps of its content as XML files on a monthly basis.

* `שתי שקל <https://he.wikipedia.org/wiki/%D7%95%D7%99%D7%A7%D7%99%D7%A4%D7%93%D7%99%D7%94:%D7%AA%D7%97%D7%96%D7%95%D7%A7%D7%94/%D7%A9%D7%AA%D7%99_%D7%A9%D7%A7%D7%9C>`_ {?} - Wikiproject for correcting grammar mistakes. (Heuristic) positive annotions can be derived from  `query <https://quarry.wmflabs.org/query/21957>`_. 

* `UD Hebrew Treebank <https://github.com/UniversalDependencies/UD_Hebrew>`_ {`CC BY-NC-SA 4.0`_} - The Hebrew Universal Dependencies Treebank.

* `SHEBANQ <https://shebanq.ancient-data.org/>`_ - System for HEBrew Text: ANnotations for Queries and Markup. SHEBANQ is an online environment for studying the Hebrew Bible.


Corpora Sources
---------------

* `JPress <http://www.jpress.org.il>`_ {`Custom Terms of Use <http://web.nli.org.il/sites/JPress/English/about/Pages/tems-of-use.aspx>`_} - `The National Library <http://web.nli.org.il>`_ offers a collection of Jewish newspapers published in various countries, languages, and time periods, including digital versions and full-text search. The texts are published under a `custom Terms of Use document <http://web.nli.org.il/sites/JPress/English/about/Pages/tems-of-use.aspx>`_ that prohibits commercial use, and additionally requires checking the copyright status and receiving permission from the copyright-holder of the work for any use requiring such permission according to the Copyright Law.

* `DICTA <http://dicta.org.il/>`_ {?} - Analytical tools for Jewish texts. They also have a `GitHub organization <https://github.com/Dicta-Israel-Center-for-Text-Analysis>`_.

* `Sefaria <https://www.sefaria.org.il/>`_ {Various} - A Living Library of Jewish Texts. 3,000 years of Jewish texts in Hebrew and English translation.

* `HaArchion <http://www.haarchion.co.il/>`_ {?} - Recording of various Hebrew prose and poetry being read.

* `Project Ben Yehuda public dumps <https://github.com/projectbenyehuda/public_domain_dump>`_ {`Public Domain`_} - A repository containing dumps of thousands of public domain works in Hebrew, from `Project Ben-Yehuda <https://bybe.benyehuda.org/>`_, in plaintext UTF-8 files, with and without diacritics (nikkud), and in HTML files.



Linguistic Resources
====================


Lexicons
--------

* The BGU morphological lexicon {?} - Is it released?

* The morphological lexicon of the Israeli National Institute for Testing and Evaluation - Unreleased.

* `The MILA lexicon of Hebrew words <http://www.mila.cs.technion.ac.il/resources_lexicons_mila.html>`_ {`GPLv3`_} - The lexicon was designed mainly for usage by morphological analyzers, but is being constantly extended to facilitate other applications as well. The lexicon contains about 25,000 lexicon items and is extended regularly. Free for non-commercial use.

* `Hebrew WordNet <http://www.mila.cs.technion.ac.il/resources_lexicons_wordnet.html>`_ {`GPLv3`_} -  Hebrew WordNet uses the MultiWordNet methodology and is aligned with the one developed at IRST (and therefore is aligned with English, Italian and Spanish). Free for non-commercial use.

* `MILA's Verb Complements Lexicon <http://www.mila.cs.technion.ac.il/resources_lexicons_verbcomplements.html>`_ {`GPLv3`_} - Free for non-commercial use.


Dictionaries
------------

* Uniform {?} - An inflection dictionary. Missing details: Creating organization? Is it released?
* `Hebrew verb lists <https://github.com/NLPH/NLPH_Resources/tree/master/word_lists/hebrew_verbs_eran_tomer>`_ {`CC-BY 4.0`_} - Created by Eran Tomer (erantom@gmail.com).

Treebanks
---------

* `The Hebrew Treebank <http://www.mila.cs.technion.ac.il/resources_treebank.html>`_ {`GPLv3`_} - The Hebrew Treebank Version 2.0 contains 6500 hand-annotated sentences of news items from the MILA HaAretz Corpus, with full word segmentation and morpho-syntactic analysis. Morphological features that are not directly relevant for syntactic structures, like roots, templates and patterns, are not analyzed. This resource can be used freely for research purposes only.


Embeddings
----------

* `fastText pre-trained word vectors <https://github.com/facebookresearch/fastText/blob/master/pretrained-vectors.md>`_ for Hebrew {`CC-BY-SA 3.0`_} - Trained on `Wikipedia <https://www.wikipedia.org/>`_ using `fastText <https://github.com/facebookresearch/fastText>`_. Comes in both the binary and text default formats of fastText: `binary+text <https://s3-us-west-1.amazonaws.com/fasttext-vectors/wiki.he.zip>`_, `text <https://s3-us-west-1.amazonaws.com/fasttext-vectors/wiki.he.vec>`_. In the text format, each line contains a word followed by its embedding; Each value is space separated; Words are ordered by their frequency in a descending order.

* `hebrew-word2vec pre-trained word vectors <https://github.com/Ronshm/hebrew-word2vec/blob/master/api/README.md>`_ {?} - Trained on data from Twitter. Developed by Ron Shemesh in Bar-Ilan University's NLP lab under the instruction of Dr. Yoav Goldberg. Contains vectors for over 1.4M words (as of January 2018). Comes in a zip with two files: a text file with a word list and a NumPy array file (npy file).

Papers
======


Corpora, Lexicon and Dictionary Generation
------------------------------------------

* `Hebrew Dependency Parsing: Initial Results <https://www.cs.bgu.ac.il/~yoavg/publications/iwpt2009depbaseline.pdf>`_, IWPT-2009 (Short Paper), Yoav Goldberg and Michael Elhadad.

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


Other
-----

* Eran Tomer. `Automatic Hebrew Text Vocalization <http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.357.7101&rep=rep1&type=pdf>`_. Thesis submitted as part of the requirements for the M.Sc. degree of Ben-Gurion University of the Negev, 2012.

Code
====

Also see here:  https://github.com/iddoberger/awesome-hebrew-nlp


Tokenization
------------

* Jonathan Laserson's sentence separator [Python] {?}- Not a tokenizer per-se, but an important part in the tokenization of documents. Jonathan is kindly checking the possibility of open sourcing this tool.

* `The MILA Hebrew Tokenization Tool <http://www.mila.cs.technion.ac.il/tools_token.html>`_ [?] {`GPLv3`_} - Free for non-commercial use.


Morphological and Syntactic Analysis
------------------------------------

* `The MILA Morphological Analysis Tool <http://www.mila.cs.technion.ac.il/tools_analysis.html>`_ [?] {`GPLv3`_} - Takes as input undotted Hebrew text (formatted either as plain text or as tokenized XML following MILA's standards). The Analyzer then returns, for each token, all the possible morphological analyses of the token, reflecting part of speech, transliteration, gender, number, definiteness, and possessive suffix. Free for non-commercial use. 

* `The MILA Morphological Disambiguation Tool <http://www.mila.cs.technion.ac.il/tools_disambiguation.html>`_ [?] {`GPLv3`_} - Takes as input morphologically-analyzed text and uses a Hidden Markov Model (HMM) to assign scores for each analysis, considering contextual information from the rest of the sentence. For a given token, all analyses deemed impossible are given scores of 0; all n analyses deemed possible are given positive scores. Free for non-commercial use.

* `Hspell <http://hspell.ivrix.org.il/>`_ [?] {`AGPL-3.0`_} - Free Hebrew linguistic project including spell checker and  morphological analyzer. 

  * `HspellPy <https://github.com/eranroz/HspellPy/>`_ [Python] {`AGPL-3.0`_} - Python wrapper for hspell.

* `BGU Tagger: Morphological Tagging of Hebrew <https://www.cs.bgu.ac.il/~elhadad/nlp12/hebrew/TagHebrew.html>`_ [Java] {?} - Morphological Analysis, Disambiguation.

* `yap morpho-syntactic parser <http://github.com/habeanf/yap>`_ [Go] {`Apache License 2.0`_} - Morphological Analysis, disambiguation and dependency Parser. Morphological Analyzer relies on the BGU Lexicon.

* `Yoav Goldberg's syntactic parsers <https://www.cs.bgu.ac.il/~yoavg/uni/hebrewparsing.he.html>`_ [Python, Java] {`GPLv3`_} - Two syntactic parsers for Hebrew, one is dependency-based and the other is constituency-based. Distributed under the `GPLv3`_ license, free for academic use only.


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


Other
-----

* `HebMorph <https://github.com/synhershko/HebMorph>`_ [Lucene] {`AGPL-3.0`_} - An open-source effort to make Hebrew properly searchable by various IR software libraries. Includes Hebrew Analyzer for Lucene.

* `hebrew-word2vec <https://github.com/Ronshm/hebrew-word2vec>`_ [C, Python] {?} - Developed by Ron Shemesh in Bar-Ilan University's NLP lab under the instruction of Dr. Yoav Goldberg. Contains `pre-trained vectors <https://github.com/Ronshm/hebrew-word2vec/blob/master/api/README.md>`_ and an online demo.

.. _Public Domain: https://en.wikipedia.org/wiki/Public_domain
.. _CC-BY-SA 3.0: https://creativecommons.org/licenses/by-sa/3.0/
.. _AGPL-3.0: https://opensource.org/licenses/AGPL-3.0
.. _GPLv3: http://www.gnu.org/copyleft/gpl.html
.. _CC BY-NC-SA 4.0: https://creativecommons.org/licenses/by-nc-sa/4.0/
.. _Apache License 2.0: https://www.apache.org/licenses/LICENSE-2.0
.. _MIT: https://en.wikipedia.org/wiki/MIT_License
.. _CC-BY 4.0: https://creativecommons.org/licenses/by/4.0/

