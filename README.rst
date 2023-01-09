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

**1.1.1 Unannotated Corpora**

* `Hebrew Wikipedia dumps <https://dumps.wikimedia.org/hewiki/latest/>`_ {`CC-BY-SA 3.0`_} - Wikipedia, the free encyclopedia, publishes dumps of its content as XML files on a monthly basis.

* `hewikibooks dump <https://dumps.wikimedia.org/hewikibooks/20220520/>`_ - Wikimedia dump service.

* `Wikipedia Corpora used for AlephBERT <https://github.com/OnlpLab/AlephBERT/tree/main/data/wikipedia>`_ - The texts in all of Hebrew Wikipedia was also extracted to pre-train OnlpLab's AlephBERT, using `Attardi's Wikiextractor <https://github.com/attardi/wikiextractor>`_.

* `OSCAR <https://oscar-corpus.com/>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - OSCAR or Open Super-large Crawled Aggregated coRpus is a huge multilingual corpus obtained by language classification and filtering of the Common Crawl corpus using the Ungoliant architecture.

* `Project Ben Yehuda public dumps <https://github.com/projectbenyehuda/public_domain_dump>`_ {`Public Domain`_} - A repository containing dumps of thousands of public domain works in Hebrew, from `Project Ben-Yehuda <https://bybe.benyehuda.org/>`_, in plaintext UTF-8 files, with and without diacritics (nikkud), and in HTML files.

* `CC100 <https://data.statmt.org/cc-100/?fbclid=IwAR2czQ8iHkINcK3oAoYTtIRcsj0TaiKOedor6S3Xzb-9-djTnHrK5D69lD0>`_ {MIT} - This corpus is an attempt to recreate the dataset used for training XLM-R. This corpus comprises of monolingual data for 100+ languages, including Hebrew. This was constructed using the urls and paragraph indices provided by the CC-Net repository by processing January-December 2018 Commoncrawl snapshots.

* `Sefaria <https://github.com/Sefaria/Sefaria-Export/>`_ {Each text is licensed separately} - Structured Jewish texts and metadata with free public licenses, exported from Sefaria's database.


**1.1.2 Annotated Datasets**

1.1.2.1 Annotated by Parts of Speech, Morphological Features, and/or Syntactic Dependencies

* `Knesset 2004-2005 <https://github.com/NLPH/knesset-2004-2005>`_ {`Public Domain`_} - A corpus of transcriptions of Knesset (Israeli parliament) meetings between January 2004 and November 2005. Includes tokenized and morphologically tagged versions of most of the documents in the corpus. `<MILA> <http://www.mila.cs.technion.ac.il/eng/resources_corpora_haknesset.html>`_ `<Zenodo> <https://zenodo.org/record/2707356>`_

* `The GOV.il Corpus <https://data.gov.il/dataset/corpus>`_ {`CC-BY-SA 3.0`_} - קורפוס השפה העברית -    מאגר שפה מתויגת, חלק מפרוייקט קורפוס השפה העברית של רשות התקשוב הממשלתי. התיוג מבוצע על ידי האקדמיה ללשון העברית. תוצר ראשון זה כולל 600 משפטים מתוייגים


1.1.2.2 Annotated by Entites

* `NEMO <https://github.com/OnlpLab/NEMO-Corpus>`_ {?} - Named Entity (NER) annotations of the Hebrew Treebank (Haaretz newspaper) corpus, including: morpheme and token level NER labels, nested mentions, and more. The following entity types are tagged: Person, Organization, Geo-Political Entity, Location, Facility, Work-of-Oart, Event, Product, Language.

* `MDTEL <https://github.com/yonatanbitton/mdtel?fbclid=IwAR3Npi5lG4hGy1dcQwdr2RWuEFUArjmQ_bo3FXQ9KhYZUpK5OO67-aT-e5k>`_ {?} - A dataset of posts from the www.camoni.co.il, tagged with medical entities from the UMLS, and a code that recognize medical entities in the Hebrew text.

* `Ben-Mordecai and Elhadad's Corpus <https://www.cs.bgu.ac.il/~elhadad/nlpproj/naama/>`_ {?} - Newspaper articles in different fields: news, economy, fashion and gossip. The following entity types are tagged: entity names (person, location, organization), temporal experssion (date, time) and number experession (percent, money).


1.1.2.3 Question Answering Datasets

* `ParaShoot <https://github.com/omrikeren/ParaShoot>`_ {?} - A Hebrew question and answering dataset in the style of `SQuAD <https://arxiv.org/abs/1606.05250>`_, created by Omri Keren and Omer Levy. ParaShoot is based on articles scraped from Wikipedia. The dataset contains 3K crowdsource-annotated pairs of questions and answers, in a setting suitable for few-shot learning.

* `tdklab <https://github.com/TechnionTDK/hebwiki-qa?fbclid=IwAR0Xbq-s1xu2gH8BS35zgFgNCeHIJ6wVZws4gqHCZ_VucbgiIngpHNTWApU>`_ {?} translated (by google translation API) SQUAD dataset from English to Hebrew. The translation process included fixation and removal of bad translations.


1.1.2.4 Sentiment

* `Hebrew-Sentiment-Data Amram et al. <https://github.com/OnlpLab/Hebrew-Sentiment-Data>`_ {?} - A sentiment analysis benchmark (positive, negative and neutral sentiment) for Hebrew, based on 12K social media comments, containing two instances of input items: token-based and morpheme-based. A cleaned version of the Hebrew Sentiment dataset - a test-train data leakage was cleaned.

* `Emotion User Generated Content (UGC) <https://github.com/avichaychriqui/HeBERT?fbclid=IwAR0GVuSWEvYWimkV4Z22h6-GSEznY2G2eIRz7gDGcAcHT3hB4vgUkxkBCPg>`_ {MIT} - collected for HeBERT model and includes comments posted on news articles collected from 3 major Israeli news sites, between January 2020 to August 2020. The total size of the data is ~150 MB, including over 7 millions words and 350K sentences. ~2000 sentences were annotated by crowd members (3-10 annotators per sentence) **for overall sentiment (polarity)** and eight emotions.


1.1.2.5 Emotion

* `Emotion User Generated Content (UGC) <https://github.com/avichaychriqui/HeBERT?fbclid=IwAR0GVuSWEvYWimkV4Z22h6-GSEznY2G2eIRz7gDGcAcHT3hB4vgUkxkBCPg>`_ {MIT} - collected for HeBERT model and includes comments posted on news articles collected from 3 major Israeli news sites, between January 2020 to August 2020. The total size of the data is ~150 MB, including over 7 millions words and 350K sentences. ~2000 sentences were annotated by crowd members (3-10 annotators per sentence) for overall sentiment (polarity) and **eight emotions: anger, disgust, expectation , fear, happy, sadness, surprise and trust.**

1.1.2.6 Recorded Spoken Hebrew

* `The HUJI Corpus of Spoken Hebrew <https://huji-corpus.com/>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - The corpus project, created by Dr Michal Marmorstein, Nadav Matalon, Amir Efrati, Itamar Folman and Yuval Geva, and hosted by the Hebrew University of Jerusalem (HUJI), aims at documenting naturally occurring speech and interaction in Modern Hebrew. Data come from telephone conversations recorded during the years 2020–2021. Data annotation followed standard methods of Interactional Linguistics (Couper-Kuhlen and Selting 2018). Audio files and transcripts were made freely accessible online.

* `CoSIH - The Corpus of Spoken Hebrew <http://cosih.com/table-3.html>`_ {?} - The Corpus of Spoken Israeli Hebrew (CoSIH) is a database of recordings of spoken Israeli Hebrew

* `MaTaCOp <https://www.openu.ac.il/en/academicstudies/matacop/pages/default.aspx>`_ {?} - a corpus of Hebrew dialogues within the Map Task framework (allowed for non-commercial research and teaching purposes only)


1.1.2.7 Other

* `Eran Tomer's Digital Vocalized Text Corpus <https://www.dropbox.com/sh/rlg0k0flz0675ho/AADvfxmY3SN8lqmkGAWr0hd2a?dl=0>`_ {`Apache License 2.0`_} - A corpus of digital vocalized Hebrew texts created by Eran Tomer as part of his Master thesis. The corpus is found in the ``resources`` folder.

* `The SVLM Hebrew Wikipedia Corpus <https://github.com/NLPH/SVLM-Hebrew-Wikipedia-Corpus>`_ {`CC-BY-SA 3.0`_} - A corpus of 50K sentences from Hebrew Wikipedia chosen to ensure phoneme coverage for the purpose of a sentence recording project.


Corpora Sources
---------------

* `The MILA corpora collection <http://www.mila.cs.technion.ac.il/resources_corpora.html>`_ {`GPLv3`_} - The MILA center has 20 different corpora available for free for non-commercial use. All are available in plain text format, and most have tokenized, morphologically-analyzed, and morphologically-disambiguated versions available too.

* `JPress <http://www.jpress.org.il>`_ {`Custom Terms of Use <http://web.nli.org.il/sites/JPress/English/about/Pages/tems-of-use.aspx>`_} - `The National Library <http://web.nli.org.il>`_ offers a collection of Jewish newspapers published in various countries, languages, and time periods, including digital versions and full-text search. The texts are published under a `custom Terms of Use document <http://web.nli.org.il/sites/JPress/English/about/Pages/tems-of-use.aspx>`_ that prohibits commercial use, and additionally requires checking the copyright status and receiving permission from the copyright-holder of the work for any use requiring such permission according to the Copyright Law.

* `DICTA <http://dicta.org.il/>`_ {?} - Analytical tools for Jewish texts. They also have a `GitHub organization <https://github.com/Dicta-Israel-Center-for-Text-Analysis>`_.

* `Sefaria <https://www.sefaria.org.il/>`_ {Various} - A Living Library of Jewish Texts. 3,000 years of Jewish texts in Hebrew and English translation.

* `HaArchion <http://www.haarchion.co.il/>`_ {?} - Recording of various Hebrew prose and poetry being read.

* `ThinkIL <http://thinkil.co.il/the-website/credits_and_sponsors/>`_ {`CC-BY-SA 3.0`_} - An archive of the writings of Zvi Yanai.



Linguistic Resources
====================


Lexicons
--------

* The BGU morphological lexicon {?} - Is it released?

* The morphological lexicon of the Israeli National Institute for Testing and Evaluation - Unreleased.

* `The MILA lexicon of Hebrew words <http://www.mila.cs.technion.ac.il/resources_lexicons_mila.html>`_ {`GPLv3`_} - The lexicon was designed mainly for usage by morphological analyzers, but is being constantly extended to facilitate other applications as well. The lexicon contains about 25,000 lexicon items and is extended regularly. Free for non-commercial use.

* `Hebrew WordNet <http://www.mila.cs.technion.ac.il/resources_lexicons_wordnet.html>`_ {`GPLv3`_} -  Hebrew WordNet uses the MultiWordNet methodology and is aligned with the one developed at IRST (and therefore is aligned with English, Italian and Spanish). Free for non-commercial use.

* `MILA's Verb Complements Lexicon <http://www.mila.cs.technion.ac.il/resources_lexicons_verbcomplements.html>`_ {`GPLv3`_} - `NLPH backup here <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/lexicons/MILA_verb_complements%20_lexicon>`_.

* `Hebrew Psychological Lexicons <https://github.com/natalieShapira/HebrewPsychologicalLexicons?fbclid=IwAR20aH6v8MY9rZH9H03-DetxPYVEjispaH5n2Zrs-rSnjOFyv4zNiawlpIU>`_ {CC-BY-SA} - Natalie Shapira's large collection of Hebrew psychological lexicons and word lists. Useful for various psychology applications such as detecting emotional state, well being, relationship quality in conversation, identifying topics (e.g., family, work) and many more.


Dictionaries & Word Lists
-------------------------

* `MILA's Hebrew Stopwords List <http://www.mila.cs.technion.ac.il/resources_lexicons_stopwords.html>`_ - An Excel XLSX file containing 23,327 Hebrew tokens in descending order of frequency. `[NLPH backup] <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/word_lists/MILA_stopwords>`_

* `Tapuz Hebrew Stop Words <https://www.kaggle.com/datasets/danofer/hebrew-stop-words?fbclid=IwAR2DpSsgJuYyPdaJ9K2WUpZY324pjkXOAuWKv4sUhgkZVjY7n6ej6UK7pwQ>`_ - a list of the 500 most common words (stop words) computed from discussions from the Tapuz People website, on a variety of subjects.

* `Stop words <https://www.kaggle.com/datasets/heeraldedhia/stop-words-in-28-languages?select=hebrew.txt>`_ {`GPL 2`} - Text-preprocessing for Natural Language Processing.

* Uniform {?} - An inflection dictionary. Missing details: Creating organization? Is it released?

* `Hebrew verb lists <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/word_lists/hebrew_verbs_eran_tomer>`_ {`CC-BY 4.0`_} - Created by Eran Tomer (erantom@gmail.com).

* `Hebrew name lists <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/word_lists/dday>`_ {`CC-BY 4.0`_} - Lists of street, company, given and last names. Created by Guy Laybovitz.

* `1000 most frequent words in Hebrew tweets during (roughly) 2018 <https://github.com/NLPH/NLPH_Resources/blob/master/linguistic_resources/word_lists/top_1000_hebrew_words_twitter_2018.txt>`_.

* `KIMA - the Historical Hebrew Gazetteer <http://data.geo-kima.org/>`_ - Place Names in the Hebrew Script. An open, attestation based, historical database. Kima currently holds 27,239 Places, with 94,650 alternate variants of their names and 236,744 attestations of these variants.

* `Wikidata Lexemes - over 500K conjugations with morphological analysis, mainly based on Hspell. Can be queried using http://query.wikidata.org/ {'CC0'} - Uploaded by Uziel302

* `Hebrew most common words by Twitter <https://github.com/YontiLevin/Hebrew-most-common-words-by-Twitter?fbclid=IwAR2oZcojNddFzs4Cd6cMI-Zyp1Mh8h2s2Ih61mQ3vQMDyw-2wf6Dd3DmIMw>`_ - based on tweets from March 2018 to March 2019.

* `wordfreq <https://pypi.org/project/wordfreq/?fbclid=IwAR0XRlwXQlzbrVoodjatJTrcKwnxvoA4dVBSZyiQuB-qEzXAiizDX63hLGc>`_ {MIT} - wordfreq is a Python library for looking up the frequencies of words in 44 languages, including Hebrew. The Hebrew data is based on Wikipedia, OPUS OpenSubtitles 2018 and SUBTLEX, Google Books Ngrams 2012, Web text from OSCAR and Twitter.

* `Hebrew WordLists <https://github.com/eyaler/hebrew_wordlists?fbclid=IwAR3QlqD_MDPxhiK7IktW7Sp8fnlgANT3TCYX6R_Rg_gzK9t8vXAqDuAbP90>`_ {?} - Useful word lists extracted from Hspell 1.4 by Eyal Gruss.

* `Hebrew stop word base on the UD <https://github.com/NNLP-IL/Stop-Words-Hebrew>`_ {'CC0'} - List of stop words in Hebrew produced by using Universal Dependencies of the The Israeli Association of Human Language Technologies (IAHLT)

* `OpenSubtitles <https://opus.nlpl.eu/OpenSubtitles2018.php>`_ {?} - This is a collection of translated movie subtitles from http://www.opensubtitles.org/.


Treebanks
---------

* `The Hebrew Treebank <http://www.mila.cs.technion.ac.il/resources_treebank.html>`_ {`GPLv3`_} - The Hebrew Treebank Version 2.0 contains 6500 hand-annotated sentences of news items from the MILA HaAretz Corpus, with full word segmentation and morpho-syntactic analysis. Morphological features that are not directly relevant for syntactic structures, like roots, templates and patterns, are not analyzed. This resource can be used freely for research purposes only.

* `UD Hebrew Treebank <https://github.com/UniversalDependencies/UD_Hebrew>`_ {`CC BY-NC-SA 4.0`_} - The Hebrew Universal Dependencies Treebank.

* `Modern Hebrew Dependency Treebank v.1 <https://www.cs.bgu.ac.il/~yoavg/data/hebdeptb/>`_ {`GPLv3`_} - This is the Modern Hebrew Dependency Treebank which was created and used in Yoav Goldberg's `PhD thesis <http://www.cs.bgu.ac.il/~nlpproj/yoav-phd.pdf>`_.

* `UD Hebrew IAHLTwiki <https://github.com/UniversalDependencies/UD_Hebrew-IAHLTwiki>`_ {`Attribution-ShareAlike 4.0 International <https://creativecommons.org/licenses/by-sa/4.0/legalcode>`_} - Publicly available subset of the IAHLT UD Hebrew Treebank's Wikipedia section. The UD Hebrew-IAHLTWiki treebank consists of 5,000 contemporary Hebrew sentences representing a variety of texts originating from Wikipedia entries, compiled by the Israeli Association of Human Language Technology. It includes various text domains, such as: biography, law, finance, health, places, events and miscellaneous.

Embeddings 
----------

* `fastText pre-trained word vectors <https://github.com/facebookresearch/fastText/blob/master/docs/pretrained-vectors.md>`_ for Hebrew {`CC-BY-SA 3.0`_} - Trained on `Wikipedia <https://www.wikipedia.org/>`_ using `fastText <https://github.com/facebookresearch/fastText>`_. Comes in both the binary and text default formats of fastText: `binary+text <https://dl.fbaipublicfiles.com/fasttext/vectors-wiki/wiki.he.zip>`_, `text <https://dl.fbaipublicfiles.com/fasttext/vectors-wiki/wiki.he.vec>`_. In the text format, each line contains a word followed by its embedding; Each value is space separated; Words are ordered by their frequency in a descending order.

* `hebrew-word2vec pre-trained word vectors <https://github.com/Ronshm/hebrew-word2vec>`_ {`Apache License 2.0`_} - Trained on data from Twitter. Developed by Ron Shemesh in Bar-Ilan University's NLP lab under the instruction of Dr. Yoav Goldberg. Contains vectors for over 1.4M words (as of January 2018). Comes in a zip with two files: a text file with a word list and a NumPy array file (npy file).

* `CoNLL17 word2vec word embeddings <http://vectors.nlpl.eu/repository/>`_ - Trained on the Hebrew CoNLL17 corpus using Word2Vec continuous skipgram, with a vecotor dimension of 100 and a window size of 10. The vocabulary includes 672,384 words.

* `CoNLL17 ELMO word embeddings <https://github.com/ltgoslo/simple_elmo/>`_ - Trained on the Hebrew CoNLL17 corpus using ELMO. **NOTE:** The link at the repository might not work. To download a concerete version of the Hebrew embeddings, `press here <http://vectors.nlpl.eu/repository/20/154.zip>`_.

* `Hebrew Word Embeddings by Lior Shkiller <https://github.com/liorshk/wordembedding-hebrew>`_ - Read more in `this blog post <https://www.oreilly.com/learning/capturing-semantic-meanings-using-deep-learning>`_.

* `Hebrew Subword Embeddings <https://nlp.h-its.org/bpemb/he/>`_

* `LASER Language-Agnostic SEntence Representations <https://github.com/facebookresearch/LASER>`_ {`CC BY-NC 4.0`_} - LASER is a library to calculate and use multilingual sentence embeddings.

* `Multilingual BERT <https://github.com/google-research/bert/blob/master/multilingual.md?fbclid=IwAR3Tm1UQjzZtz0XcH7NsR5DvWqfxDxuc3DJkxwmWpwZtkYXFC2bc5HRut_0>`_ - BERT, or Bidirectional Encoder Representations from Transformers, is a new method of pre-training language representations which obtains state-of-the-art results on a wide array of Natural Language Processing (NLP) tasks.

* Hebrew word embeddings by Dr. Oren Glickman {?} - Trained on Twitter. Unreleased. Presented in his lecture in yearly conference of The Israel Statistical Association for 2018 (`presentation file <https://github.com/NLPH/NLPH_Resources/blob/master/linguistic_resources/other/Hebrew-Word_Embedding-Glickman.pptx>`_).


* `hebrew-word2vec <https://github.com/Ronshm/hebrew-word2vec>`_ [C, Python] {`Apache License 2.0`_} - Developed by Ron Shemesh in Bar-Ilan University's NLP lab under the instruction of Dr. Yoav Goldberg. Contains `pre-trained vectors <https://github.com/Ronshm/hebrew-word2vec/blob/master/api/README.md>`_ and an online demo.


* `hebrew-w2v <https://github.com/Iddoyadlin/hebrew-w2v?fbclid=IwAR3QIwzgcziyANpq8-YEPeO1eQzBboDCLeIiSPnenqrFEedCNCgB3QEo44o>`_ {`Apache License 2.0`_} - Iddo Yadlin and Itamar Shefi's word2vec model for Hebrew, trained on a corpus which is the Hebrew wikipedia dump only tokenized with hebpipe.


Other
-----

* `Hebrew SimLex-999 <https://drive.google.com/drive/folders/0B_pyA_IW4g-jTlJzOHlSWVZWbTQ>`_ - A Hebrew version of the `Simlex-999 <https://fh295.github.io/simlex.html>`_ resource for the evaluation of models that learn the meaning of words and concepts. A copy can also be found in the `Attract-Repel repository <https://github.com/nmrksic/attract-repel>`_. Another copy is found in `this repository <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/other/hebrew_simlex-999>`_.

* `שתי שקל <https://he.wikipedia.org/wiki/%D7%95%D7%99%D7%A7%D7%99%D7%A4%D7%93%D7%99%D7%94:%D7%AA%D7%97%D7%96%D7%95%D7%A7%D7%94/%D7%A9%D7%AA%D7%99_%D7%A9%D7%A7%D7%9C>`_ {?} - Wikiproject for correcting grammar mistakes. (Heuristic) positive annotions can be derived from  `query <https://quarry.wmflabs.org/query/21957>`_.

* `The Word-Frequency Database for Printed Hebrew <http://word-freq.huji.ac.il/index.html?fbclid=IwAR2Bl_-8eNKmxUBts1S3hipWm63_0TSPk3lmweVW1q5XcblmezjtREWS24s>`_ {?} - supplies the frequency of occurrence of any Hebrew letter cluster (mean occurrence per million). The corpus was assembled throughout the year 2001, and consists of text downloaded from 914 editions of the three major daily online Hebrew newspapers (Haaretz, Maariv, and Yediot Acharonot). After removing abbreviations, single characters, forms with counts that are less than 3 (mostly typos), and splitting hyphenated forms (vast majority were two words), the corpus totals 554,270 types and 619,835,788 tokens. 



Code
====

Also see here:  https://github.com/iddoberger/awesome-hebrew-nlp


Tokenization
------------

* `Yonti Levin's Hebrew Tokenizer <https://github.com/YontiLevin/Hebrew-Tokenizer>`_ [Python] {`MIT License`_}

* `Hebrew Tokenizer <https://github.com/eyaler/hebrew_tokenizer?fbclid=IwAR1vbBpU9SOzQ71ZaxAjyBwNVuyhuYs3dMQsAUlZXCINy4TSg2BVWvoBARc>`_ {?} - Eyal Gruss's Hebrew tokenizer. A field-tested Hebrew tokenizer for dirty texts (ben-yehuda project, bible, cc100, mc4, opensubs, oscar, twitter) focused on multi-word expression extraction.


Morphological and Syntactic Analysis
------------------------------------

* `Morphological and Syntactic Analysis of Hebrew Texts by ONLP <https://nlp.biu.ac.il/~rtsarfaty/onlp/hebrew/>`_

* `yap morpho-syntactic parser <https://github.com/OnlpLab/yap>`_ [Go] {`Apache License 2.0`_} - Morphological Analysis, disambiguation and dependency Parser. Morphological Analyzer relies on the BGU Lexicon. [`original repository <http://github.com/habeanf/yap>`_]

* `The MILA Morphological Analysis Tool <http://www.mila.cs.technion.ac.il/tools_analysis.html>`_ [?] {`GPLv3`_} - Takes as input undotted Hebrew text (formatted either as plain text or as tokenized XML following MILA's standards). The Analyzer then returns, for each token, all the possible morphological analyses of the token, reflecting part of speech, transliteration, gender, number, definiteness, and possessive suffix. Free for non-commercial use. 

* `The MILA Morphological Disambiguation Tool <http://www.mila.cs.technion.ac.il/tools_disambiguation.html>`_ [?] {`GPLv3`_} - Takes as input morphologically-analyzed text and uses a Hidden Markov Model (HMM) to assign scores for each analysis, considering contextual information from the rest of the sentence. For a given token, all analyses deemed impossible are given scores of 0; all n analyses deemed possible are given positive scores. Free for non-commercial use.

* `Hspell <http://hspell.ivrix.org.il/>`_ [?] {`AGPL-3.0`_} - Free Hebrew linguistic project including spell checker and  morphological analyzer. 

  * `HspellPy <https://github.com/eranroz/HspellPy/>`_ [Python] {`AGPL-3.0`_} - Python wrapper for hspell.

* `BGU Tagger: Morphological Tagging of Hebrew <https://www.cs.bgu.ac.il/~elhadad/nlp12/hebrew/TagHebrew.html>`_ [Java] {?} - Morphological Analysis, Disambiguation.

* `RFTokenizer <https://github.com/amir-zeldes/RFTokenizer>`_ [Python] {`Apache License 2.0`} - A highly accurate morphological segmenter to break up complex word forms

* `HebPipe <https://github.com/amir-zeldes/HebPipe>`_ [Python] {`Apache License 2.0`} - End-to-end pipeline for Hebrew NLP using off the shelf tools, including morphological analysis, tagging, lemmatization, parsing and more

Diacritization / Nikkud / Vocalization
--------------------------------------

* `Nakdan <https://nakdan.dicta.org.il/>`_ (`Paper <https://aclanthology.org/2020.acl-demos.23.pdf>`_) - Tool for Automatic and semi-automatic Nikud for Hebrew texts. Avi Shmidman, Shaltiel Shmidman, Moshe Koppel, and Yoav Goldberg. 2020. Nakdan: Professional Hebrew diacritizer. In Proceedings of the 58th Annual Meeting of the Association for Computational Linguistics: System Demonstrations, pages 197–203, Online. Association for Computational Linguistics.

* `Nakdimon <https://www.nakdimon.org/>`_ (`Paper <https://arxiv.org/abs/2105.05209/>`_ , `code <https://github.com/elazarg/nakdimon/>`_ ,  `data <https://github.com/elazarg/hebrew-diacritize/>`_) - Hebrew diacritizer. Elazar Gershuni and Yuval Pinter: Restoring Hebrew Diacritics Without a Dictionary. `Demo in Replicate <https://replicate.com/elazarg/nakdimon/>`_.

* `UNIKUD <https://dagshub.com/morrisalp/unikud>`_ {?} - Morris Alper's open-source tool for adding vowel signs (Nikud) to Hebrew text, uses no rule-based logic, built with a CANINE transformer network. An interactive demo is available at `Huggingface Spaces <https://huggingface.co/spaces/malper/unikud>`_. Blog post: `UNIKUD: Adding Vowels to Hebrew Text with Deep Learning <https://towardsdatascience.com/unikud-adding-vowels-to-hebrew-text-with-deep-learning-powered-by-dagshub-56d238e22d3f>`_.

Models
------

* `Neural Sentiment Analyzer for Modern Hebrew <https://github.com/omilab/Neural-Sentiment-Analyzer-for-Modern-Hebrew>`_ [?] {`MIT`_} - This code and dataset provide an established benchmark for neural sentiment analysis for Modern Hebrew.

* `Universal Language Model Fine-tuning for Text Classification (ULMFiT) in Hebrew <https://github.com/hanan9m/hebrew_ULMFiT?fbclid=IwAR0wJkoxmaCmhuZnSVOLBo1Mo362v6-66PmXutOr9FhhoItIHoqG_2MzV8E>`_ - The weights (e.g. a trained model) for a Hebrew version for  Howard's and Ruder's ULMFiT model. Trained on the Hebrew Wikipedia corpus.

* `BERT's multilingual model <https://github.com/google-research/bert/blob/master/multilingual.md>`_ - Trained (also) on Hebrew.

* `MDTEL <https://github.com/yonatanbitton/mdtel?fbclid=IwAR3Npi5lG4hGy1dcQwdr2RWuEFUArjmQ_bo3FXQ9KhYZUpK5OO67-aT-e5k>`_ {?} - Yonatan Bitton's code that recognize medical entities in a Hebrew text.

* `HebSpacy <https://github.com/8400TheHealthNetwork/HebSpacy>`_ {MIT} - A custom spaCy pipeline for Hebrew text including a transformer-based multitask NER model that recognizes 16 entity types in Hebrew, including GPE, PER, LOC and ORG.

* `HeBERT <https://huggingface.co/avichr/heBERT?fbclid=IwAR2Lo9pkN5HLZmtFiFwcIDWyXR9gyP646pyFzNSUUP_djalAkewvB9p8E_o>`_ {MIT} - HeBERT is a Hebrew pretrained language model for Polarity Analysis and Emotion Recognition, published by Dr. Inbal Yahav Shenberger and Avichay Chriqui. It is based on Google's BERT architecture and it is BERT-Base config. HeBert was trained on three dataset: OSCAR, A Hebrew dump of Wikipedia, Emotion User Generated Content (UGC) data that was collected for the purpose of this study. The model was evaluated on downstream tasks: `HebEMO - emotion recognition model <https://huggingface.co/avichr/hebEMO_anticipation?fbclid=IwAR00bGmLoASpEjpCOoWjuZ6q4xhlu6wwZR4Miau2RV2nVsam-o7oVt4jYkY>`_ and `sentiment analysis <https://huggingface.co/avichr/heBERT_sentiment_analysis?fbclid=IwAR1IhvCmosiapbA3iosHc0nJHM6nM-0m7Ew3Zeqw2V4wg-3cWKuB_Qf8OuY>`_. Github: https://github.com/avichaychriqui/HeBERT

* `AlephBERT <https://huggingface.co/onlplab/alephbert-base?fbclid=IwAR3gP64XJEDvRcJ9UQm2DIttOnv7Y-6I5R-t7djj9TTTsXlcIA8qyx8PzSQ>`_ {?} - a large pre-trained language model for Modern Hebrew, publicly available, pre-training on Oscar, Texts of Hebrew tweets, all of Hebrew Wikipedia, published by the OnlpLab team. This model obtains stateof-the- art results on the tasks of segmentation, Part of Speech Tagging, Named Entity Recognition, and Sentiment Analysis. Github: https://github.com/OnlpLab/AlephBERT

* `hebrew-gpt_neo-small <https://huggingface.co/Norod78/hebrew-gpt_neo-small>`_ {?} - Doron Adler's Hebrew text generation model based on EleutherAI's gpt-neo.

* `Legal-HeBERT <https://github.com/avichaychriqui/Legal-HeBERT?fbclid=IwAR3sFizNJEfPIXm0Agg5HpELUm49v11kfksjes72-Q-9CxMwv8hdR8I5ahg>`_ {?} - a BERT model for Hebrew legal and legislative domains. It is intended to improve the legal NLP research and tools development in Hebrew. Avichay Chriqui, Dr. Inbal Yahav Shenberger and Dr. Ittai Bar-Siman-Tov release two versions of Legal-HeBERT: `The first version <https://huggingface.co/avichr/Legal-heBERT_ft?fbclid=IwAR3K16AoiBYtZlpf2C6TjSstOv7ZuaWLIwCOq93_fRV6bGA3ssDA8NfuHmY>`_ is a fine-tuned model of HeBERT applied on legal and legislative documents. `The second version <https://huggingface.co/avichr/Legal-heBERT?fbclid=IwAR3r-QUCMSdzCoAjomifrk2hCPX7kvGJk47raHHfqBI511QXXchaOkL8rFo>`_ uses HeBERT's architecture guidlines to train a BERT model from scratch.

* `BEREL <https://www.dropbox.com/sh/us98wjb178itjk1/AACWu62ffHJ0zk19i77_rV06a?dl=0&fbclid=IwAR0GbzbyASH8bA_lCadXA-2l09oXtg_NNm4QTQ69WDfdtG77gWx9WufB_II>`_ {?} - BERT Embeddings for Rabbinic-Encoded Language - DICTA's pre-trained language model (PLM) for Rabbinic Hebrew.

Other
-----

* `Verb Inflector <https://github.com/NLPH/NLPH_Resources/tree/master/code/VerbInflector>`_ [Java] {`Apache License 2.0`_} - A generation mechanism, created as part of Eran Tomer's (erantom@gmail.com) Master thesis, which produces vocalized and morphologically tagged Hebrew verbs given a non-vocalized verb in base-form and an indication of which pattern the verb follows.

* `HebMorph <https://github.com/synhershko/HebMorph>`_ [Lucene] {`AGPL-3.0`_} - An open-source effort to make Hebrew properly searchable by various IR software libraries. Includes Hebrew Analyzer for Lucene.

* `Hebrew OCR with Nikud <https://www.cs.bgu.ac.il/~elhadad/hocr/>`_ [Python] {?} - A program to convert Hebrew text files (without Nikud) to text files with the correct Nikud. Developed by Adi Oz and Vered Shani.

* `Text-Fabric <https://dans-labs.github.io/text-fabric/>`_ [Python] {`CC BY-NC 4.0`_} - A Python package for browsing and processing ancient corpora, focused on the Hebrew Bible Database.

* `The Automatic Hebrew Transcriber <http://hebrew-transcriber.online/>`_ - Automatically transcribes text from Hebrew audio and video files.

* `word2word <https://github.com/Kyubyong/word2word>`_ {`Apache License 2.0`_} - Easy-to-use word-to-word translations for 3,564 language pairs. Hebrew is one of the 62 supported language, and thus word-to-word translation to/from Hebrew is supported for 61 languages.

* `SPMRL to UD <https://github.com/shovalsa/SPMRL-to-UD>`_ {`Apache License 2.0`_} - converts YAP's output from the SPMRL scheme to UD v2.

Commercial services
-------------------

* `Eyfo <https://ey.fo/search>`_ - A commercial engine for search and entity tagging in Hebrew.

* `Melingo's ICA (Intelligent Content Analysis) <https://melingo.com/text-analysis/morfix_insights/>`_ - A text analysis and textual categorized entity extraction API for Hebrew, Arabic and Farsi texts.

* `Genius <https://www.genius.co.il>`_ - Automatic analysis of free text in Hebrew.

* `AlmaReader <https://app.almareader.com/>`_ - Online text-to-speech service for Hebrew.


Tagging Tools
=============

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

* `doccano <https://github.com/doccano/doccano>`_ {MIT} - an open source text annotation tool for humans. It provides annotation features for text classification, sequence labeling and sequence to sequence tasks. So, you can create labeled data for sentiment analysis, named entity recognition, text summarization and so on.


Labs & Researchers
==================

This list is meant to cover both researchers in the field of natural language processing, and in various related fields, including neurolinguistics and speech science. It also aims to cover researchers in both academia and industry.

Academia
--------

* Bar Ilan University:

  * `The ONLP Lab <https://nlp.biu.ac.il/~rtsarfaty/onlp#>`_:

    * `Prof. Reut Tsarfaty <https://nlp.biu.ac.il/~rtsarfaty/>`_ - Head of the ONLP Lab.

    * Dan Bareket - Data Scientist.
 
  * `The Natural Language Processing Lab at Bar Ilan University <http://u.cs.biu.ac.il/~nlp/>`_ [`Twitter <https://twitter.com/biunlp/>`_]:

    * `Prof. Ido Dagan <http://u.cs.biu.ac.il/~dagan/>`_
  
    * `Prof. Yoav Goldberg <http://u.cs.biu.ac.il/~yogo/>`_
  
    * `Graduate Students & Researchers <http://u.cs.biu.ac.il/~nlp/people/graduate-students-researchers/>`_

  * `Prof. Moshe Koppel <https://www1.biu.ac.il/indexE.php?id=8041&pt=30&cPath=7702>`_
  
  * `Dr. Avi Shmidman <http://dsi.biu.ac.il/team/dr-avi-shmidman/>`_
  
  * `The Speech, Language and Deep Learning Lab at Bar Ilan University <http://u.cs.biu.ac.il/~jkeshet/#lab>`_ [`GitHub <https://github.com/MLSpeech>`_]:

    * `Prof. Joseph (Yossi) Keshet <http://u.cs.biu.ac.il/~jkeshet/>`_
  
* The Open University of Israel

  * `The Open Media and Information Lab (OMILab) at the Open University of Israel <https://www.openu.ac.il/en/omilab/pages/default.aspx>`_ - An interdisciplinary center for research and for teaching in new media and related areas, such as big data, information science, network cultures and digital sociology.

    * `Dr. Vered Silber-Varod <https://www.openu.ac.il/en/personalsites/VeredSilberVarod.aspx>`_ - Director of the Open Media and Information Lab (OMILab). Research interests and publications focus on various aspects of speech sciences, with expertise in speech prosody, acoustic phonetics, and speech communication and text analytics.
  
  * `Dr. Anat Lerner, Senior Lecturer <https://www.openu.ac.il/en/personalsites/AnatLerner.aspx>`_ - Interested in speech prosody analyses, combinatorial auctions and computer Networks (especially Ad-Hoc networks, mobile and cellular networks).

* Ben-Gurion University:

  * `Natural Language Processing Lab at Ben Gurion University <https://www.cs.bgu.ac.il/~elhadad/nlpproj/>`_

    * `Prof. Michael Elhadad <https://www.cs.bgu.ac.il/~elhadad/>`_
  
    * `Dr. Yael Netzer <https://www.cs.bgu.ac.il/~yaeln/>`_
  
    * `Dr. Meni Adler <https://www.cs.bgu.ac.il/~adlerm/>`_

  * `Dr. Oren Tzur <http://www.ise.bgu.ac.il/OrenTsur/>`_

* University of Haifa:

  * `Prof. Shuly Wintner <http://cs.haifa.ac.il/~shuly/Shuly_Wintner/Home.html>`_
  
  * `Dr. Einat Minkov <https://sites.google.com/hevra.haifa.ac.il/einatm/>`_ - Working on Information Extraction and Semantics, as well as in other Natural Language Processing applications. I am also interested in Machine Learning - and the application of learning to NLP problems. 

* Tel Aviv University:

  * `Prof. Jonathan Berant <http://www.cs.tau.ac.il/~joberant/>`_

* The Technion:

  * `Dr Yonatan Belinkov <https://www.cs.technion.ac.il/~belinkov/>`_ - Assistant Professor at the faculty of Computer Science. Focus: interpretability and robustness.

  * `Prof. Alon Itai <http://www.cs.technion.ac.il/~itai/>`_ (retired)

  * `Prof. Roi Reichart <https://ie.technion.ac.il/~roiri/>`_ - An Assistant Professor at the faculty of Industrial Engineering and Management of the Technion. Working on Natural Language Processing (NLP). Interested in language learning in its context and design models that integrate domain and world knowledge with data-driven methods.
  
  
* The Hebrew University of Jerusalem:

  * `Prof. Ronen Feldman <http://pluto.huji.ac.il/~rfeldman/>`_ - Feldman's main areas of research are natural language processing, entity extraction and text relations, text sentiment analysis, and language processing for algorithmic trading. He is one of the founder of the discipline of text mining.

  * `Prof. Ari Rappoport <http://www.cs.huji.ac.il/~arir/>`_ - With his main contribution in the area of Neuroscience, where he developed a comprehensive theory of the brain, Prof. Rappoport's Computer Science area of interest is language (Computational Linguistics, Natural Language Processing (NLP)), from cognitive science and machine learning perspectives.


  * `Prof. Omri Abend <http://www.cs.huji.ac.il/~oabend/>`_ - My fields of interest are Computational Linguistics and Natural Language Processing. Specifically, I conduct research on semantic (meaning) representation from a computational perspective. My research is tightly linked to statistical learning, language technology (such as Machine Translation and Information Extraction), and computational modeling of child language acquisition.

  
  * `Prof. Dafna Shahaf <http://www.cs.huji.ac.il/~dshahaf/>`_ - Prof. Shahaf's research focuses on helping people make sense of the world. She designs algorithms that help people understand the underlying structure of complex topics, and connect the dots between different pieces. She also likes to formalize intuitive notions; see recent work on Computational Humor.

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

* Amir Zeldes. `A Characterwise Windowed Approach to Hebrew Morphological Segmentation <http://aclweb.org/anthology/W18-5811>`_. Proceedings of the 15th SIGMORPHON Workshop on Computational Research in Phonetics, Phonology, and Morphology. Brussels, Belgium, 101-110. October 2018.  


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

Meetup & Discussion Groups
--------------------------

* `The NLPH Facebook Group <https://www.facebook.com/groups/157877988136954/>`_

* `The Israeli Natural Language Processing Meetup <https://www.meetup.com/The-Israeli-Natural-Language-Processing-Meetup/>`_

Specific Talks
--------------

* `Bar Ilan University's NLP course <https://www.youtube.com/playlist?list=PLM96W_EHEqh78zJ0bPqT3Wy8DPHbJU-Zh>`_

* `ONLP April 2019 Meetup lecture slides <https://drive.google.com/file/d/1YxZeeFjQJzdJQKabzSelm-ojm1LfM2Sy/view?usp=sharing&fbclid=IwAR3Y9a3BiHNxmxGyL65Vq_KKqCNkmyZnP_0dKTzbk_ZQPzfu6yb5BHbGsyw>`_

* `Big DataNights NLP 2020 <https://www.youtube.com/watch?v=8YYnkd50LwM&list=PLZYkt7161wEJ8zW_TgD3v0r7GwkXgFFWb>`_




.. _Public Domain: https://en.wikipedia.org/wiki/Public_domain
.. _CC-BY-SA 3.0: https://creativecommons.org/licenses/by-sa/3.0/
.. _AGPL-3.0: https://opensource.org/licenses/AGPL-3.0
.. _GPLv3: http://www.gnu.org/copyleft/gpl.html
.. _CC BY-NC-SA 4.0: https://creativecommons.org/licenses/by-nc-sa/4.0/
.. _CC BY-NC 4.0: https://creativecommons.org/licenses/by-nc/4.0/
.. _Apache License 2.0: https://www.apache.org/licenses/LICENSE-2.0
.. _MIT: https://en.wikipedia.org/wiki/MIT_License
.. _CC-BY 4.0: https://creativecommons.org/licenses/by/4.0/
