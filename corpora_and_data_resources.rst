Hebrew NLP Corpora and Data Resources
#####################################

.. contents::

.. section-numbering::

Corpora
=======

Unannotated Corpora
-------------------

General Corpora
^^^^^^^^^^^^^^^

* `HeDC4 used for HeRo <https://huggingface.co/datasets/HeNLP/HeDC4>`_ {`Apache License 2.0`_} - A Hebrew Deduplicated and Cleaned Common Crawl Corpus. A thoroughly cleaned and approximately deduplicated dataset for unsupervised learning.

* `Wikipedia Corpora used for AlephBERT <https://github.com/OnlpLab/AlephBERT/tree/main/data/wikipedia>`_ {`Apache License 2.0`_} - The texts in all of Hebrew Wikipedia was also extracted to pre-train OnlpLab's AlephBERT, using `Attardi's Wikiextractor <https://github.com/attardi/wikiextractor>`_.

* `JPress <http://www.jpress.org.il>`_ {`Custom Terms of Use`_} - `The National Library <http://web.nli.org.il>`_ offers a collection of Jewish newspapers published in various countries, languages, and time periods, including digital versions and full-text search. The texts are published under a `Custom Terms of Use document <http://web.nli.org.il/sites/JPress/English/about/Pages/tems-of-use.aspx>`_ that prohibits commercial use, and additionally requires checking the copyright status and receiving permission from the copyright-holder of the work for any use requiring such permission according to the Copyright Law.

* `The SVLM Hebrew Wikipedia Corpus <https://github.com/NLPH/SVLM-Hebrew-Wikipedia-Corpus>`_ {`CC-BY-SA 3.0`_} - A corpus of 50K sentences from Hebrew Wikipedia chosen to ensure phoneme coverage for the purpose of a sentence recording project.

Specialized Corpora
^^^^^^^^^^^^^^^^^^^

* `Sefaria <https://github.com/Sefaria/Sefaria-Export/>`_ {Each text is licensed separately} - Structured Jewish texts and metadata with free public licenses, exported from Sefaria's database. A Living Library of Jewish Texts. 3,000 years of Jewish texts in Hebrew and English translation.

* `Hebrew Songs Lyrics <https://www.kaggle.com/datasets/guybarash/hebrew-songs-lyrics?fbclid=IwAR1Tji-2oWxeB54wM3YDVViMG7xTM6000yiov_H1AZTQVRiP9VfmiXkyYu4>`_ {`CC BY-SA 4.0 <https://creativecommons.org/licenses/by-sa/4.0/>`_} - ~15,000 israeli songs scrapped from `Shironet <https://shironet.mako.co.il/>`_ website and contains 167 different singers. Contains only Hebrew characters.

* `1001 Israeli Pop Songs Dataset <https://www.kaggle.com/datasets/adamyodfat/1001-israeli-pop-dataset>`_ {`CC BY-NC-ND 4.0`_} - 1001 Israeli pop songs manual analyses 1967-2017.

* `Supreme Court of Israel <https://huggingface.co/datasets/LevMuchnik/SupremeCourtOfIsrael>`_ {OpenRAIL} - This dataset represents a 2022 snapshot of the Supreme Court of Israel public verdicts and decisions supported by rich metadata. The 5.31GB dataset represents 751,194 documents. Overall, the dataset contains 2.68 Gb of text.

* `Heb-Architecture-Corpus <https://github.com/bdar-lab/heb_architecture_corpus>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - Hebrew textual corpus of construction, planning, and architecture. The corpus consists of Hebrew documents from a wide variety of contemporary and historical sources, including legislative decrees, regulatory guidelines, research reports, academic studies, and professional journals. In the development of the corpus, it has been used digitally born as well as scanned printed publications, which go through a process of optical character recognition (OCR), cleaning, and parsing. This work was supported by the Israel Innovation Authority.


Crawls and Dumps
^^^^^^^^^^^^^^^^^

* `Hebrew Wikipedia Dumps <https://dumps.wikimedia.org/hewiki/latest/>`_ {`CC-BY-SA 3.0`_} - Wikipedia, the free encyclopedia, publishes dumps of its content as XML files on a monthly basis.

* `HeWikiBooks Dumps <https://dumps.wikimedia.org/>`_ {`CC0 1.0`_} - Wikimedia dump service.

* `Project Ben Yehuda Public Dumps <https://github.com/projectbenyehuda/public_domain_dump>`_ {`Public Domain`_} - A repository containing dumps of thousands of public domain works in Hebrew, from `Project Ben-Yehuda <https://bybe.benyehuda.org/>`_, in plaintext UTF-8 files, with and without diacritics (nikkud), and in HTML files.

Multilingual Corpora
----------------------------

* `OSCAR <https://oscar-corpus.com/>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - OSCAR or Open Super-large Crawled Aggregated coRpus is a huge multilingual corpus obtained by language classification and filtering of the Common Crawl corpus using the Ungoliant architecture.

* `CC100 <https://data.statmt.org/cc-100/?fbclid=IwAR2czQ8iHkINcK3oAoYTtIRcsj0TaiKOedor6S3Xzb-9-djTnHrK5D69lD0>`_ {`MIT`_} - This corpus is an attempt to recreate the dataset used for training XLM-R. This corpus comprises monolingual data for 100+ languages, including Hebrew. This was constructed using the urls and paragraph indices provided by the CC-Net repository by processing January-December 2018 Commoncrawl snapshots.

* `Old Newspapers <https://www.kaggle.com/datasets/alvations/old-newspapers?select=old-newspaper.tsv>`_ {`CC0 1.0`_} - The HC Corpora was a great resource that contains natural language text from various newspapers, social media posts and blog pages in multiple languages. This is a cleaned version of the raw data from the newspaper subset of the HC corpus.

* `TED Talks Transcripts for NLP <https://www.kaggle.com/datasets/miguelcorraljr/ted-ultimate-dataset>`_ {`CC BY-NC 4.0`_} - Transcripts and more in 12 languages including Hebrew.

* `ParaNames <https://github.com/bltlab/paranames>`_ {`MIT`_} - A massively multilingual dataset consisting of parallel names of over 16.8 million named entities in over 400 languages. This README contains links to corpus releases as well as code used in our canonical name translation and named entity recognition experiments.


Annotated Datasets by Task
----------------------------------------

Dependency Treebanks
^^^^^^^^^^^^^^^^^

* `Knesset 2004-2005 <https://github.com/NLPH/knesset-2004-2005>`_ {`Public Domain`_} - A corpus of transcriptions of Knesset (Israeli parliament) meetings between January 2004 and November 2005. Includes tokenized and morphologically tagged versions of most of the documents in the corpus. `<MILA> <http://www.mila.cs.technion.ac.il/eng/resources_corpora_haknesset.html>`_ `<Zenodo> <https://zenodo.org/record/2707356>`_

* `The Hebrew Treebank <http://www.mila.cs.technion.ac.il/resources_treebank.html>`_ {`GPLv3`_} - The Hebrew Treebank Version 2.0 contains 6500 hand-annotated sentences of news items from the MILA HaAretz Corpus, with full word segmentation and morpho-syntactic analysis. Morphological features that are not directly relevant for syntactic structures, like roots, templates and patterns, are not analyzed. This resource can be used freely for research purposes only. (temporarily down)

* `UD Hebrew Treebank <https://github.com/UniversalDependencies/UD_Hebrew>`_ {`CC BY-NC-SA 4.0`_} - The Hebrew Universal Dependencies Treebank.

* `IAHLT-HTB <https://github.com/IAHLT/UD_Hebrew>`_ {`CC BY-NC-SA 4.0`_} - IAHLT version of the UD Hebrew Treebank. This is a revised fork of the Universal Dependencies version of the Hebrew Treebank, with some important changes and a consistency overhaul involving substantial manual corrections. The dataset was prepared as part of the Hebrew & Arabic Corpus Linguistics Infrastructure project at the Israeli Association of Human Language Technologies (IAHLT). 

* `Modern Hebrew Dependency Treebank V.1 <https://www.cs.bgu.ac.il/~yoavg/data/hebdeptb/>`_ {`GPLv3`_} - This is the Modern Hebrew Dependency Treebank which was created and used in Yoav Goldberg's `PhD thesis <http://www.cs.bgu.ac.il/~nlpproj/yoav-phd.pdf>`_.

* `UD Hebrew IAHLTwiki <https://github.com/UniversalDependencies/UD_Hebrew-IAHLTwiki>`_ {`CC-BY-SA 4.0`_} - Publicly available subset of the IAHLT UD Hebrew Treebank's Wikipedia section. The UD Hebrew-IAHLTWiki treebank consists of 5,000 contemporary Hebrew sentences representing a variety of texts originating from Wikipedia entries, compiled by the Israeli Association of Human Language Technology. It includes various text domains, such as: biography, law, finance, health, places, events and miscellaneous. 

* `UD Hebrew - IAHLTKnesset <https://github.com/IAHLT/UD_Hebrew-IAHLTKnesset>`_ {`CC BY 4.0`_} - A Universal Dependencies treebank with named entities for contemporary Hebrew covering Knesset protocols. 

* `The MILA corpora collection <http://www.mila.cs.technion.ac.il/resources_corpora.html>`_ {`GPLv3`_} - The MILA center has 20 different corpora available for free for non-commercial use. All are available in plain text format, and most have tokenized, morphologically-analyzed, and morphologically-disambiguated versions available too. (temporarily down)

Named Entity Recognition (NER)
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `NEMO <https://github.com/OnlpLab/NEMO-Corpus>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - Named Entity (NER) annotations of the Hebrew Treebank (Haaretz newspaper) corpus, including: morpheme and token level NER labels, nested mentions, and more. The following entity types are tagged: Person, Organization, Geo-Political Entity, Location, Facility, Work-of-Art, Event, Product, Language.

* `MDTEL <https://github.com/yonatanbitton/mdtel?fbclid=IwAR3Npi5lG4hGy1dcQwdr2RWuEFUArjmQ_bo3FXQ9KhYZUpK5OO67-aT-e5k>`_ {`MIT`_} - A dataset of posts from the www.camoni.co.il, tagged with medical entities from the UMLS, and a code that recognize medical entities in the Hebrew text.

* `Ben-Mordecai and Elhadad's Corpus <https://www.cs.bgu.ac.il/~elhadad/nlpproj/naama/>`_ {?} - Newspaper articles in different fields: news, economy, fashion and gossip. The following entity types are tagged: entity names (person, location, organization), temporal expression (date, time) and number expression (percent, money). `Demo <https://www.cs.bgu.ac.il/~elhadad/nlpproj/naama/demo/demo.html>`_

* `UD Hebrew - IAHLTKnesset <https://github.com/IAHLT/UD_Hebrew-IAHLTKnesset>`_ {`CC BY 4.0`_} - A Universal Dependencies treebank with named entities for contemporary Hebrew covering Knesset protocols.

Part-of-speech (POS) tagging and Morphological Analysis
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `ParaNames <https://github.com/bltlab/paranames>`_ {`MIT`_} - A massively multilingual dataset consisting of parallel names of over 16.8 million named entities in over 400 languages. This README contains links to corpus releases as well as code used in our canonical name translation and named entity recognition experiments.

* `Knesset 2004-2005 <https://github.com/NLPH/knesset-2004-2005>`_ {`Public Domain`_} - A corpus of transcriptions of Knesset (Israeli parliament) meetings between January 2004 and November 2005. Includes tokenized and morphologically tagged versions of most of the documents in the corpus. `<MILA> <http://www.mila.cs.technion.ac.il/eng/resources_corpora_haknesset.html>`_ `<Zenodo> <https://zenodo.org/record/2707356>`_

* `The Hebrew Treebank <http://www.mila.cs.technion.ac.il/resources_treebank.html>`_ {`GPLv3`_} - The Hebrew Treebank Version 2.0 contains 6500 hand-annotated sentences of news items from the MILA HaAretz Corpus, with full word segmentation and morpho-syntactic analysis. Morphological features that are not directly relevant for syntactic structures, like roots, templates and patterns, are not analyzed. This resource can be used freely for research purposes only. (temporarily down)

* `UD Hebrew Treebank <https://github.com/UniversalDependencies/UD_Hebrew>`_ {`CC BY-NC-SA 4.0`_} - The Hebrew Universal Dependencies Treebank.

* `IAHLT-HTB <https://github.com/IAHLT/UD_Hebrew>`_ {`CC BY-NC-SA 4.0`_} - IAHLT version of the UD Hebrew Treebank. This is a revised fork of the Universal Dependencies version of the Hebrew Treebank, with some important changes and a consistency overhaul involving substantial manual corrections. The dataset was prepared as part of the Hebrew & Arabic Corpus Linguistics Infrastructure project at the Israeli Association of Human Language Technologies (IAHLT). 

* `Modern Hebrew Dependency Treebank V.1 <https://www.cs.bgu.ac.il/~yoavg/data/hebdeptb/>`_ {`GPLv3`_} - This is the Modern Hebrew Dependency Treebank which was created and used in Yoav Goldberg's `PhD thesis <http://www.cs.bgu.ac.il/~nlpproj/yoav-phd.pdf>`_.

* `UD Hebrew IAHLTwiki <https://github.com/UniversalDependencies/UD_Hebrew-IAHLTwiki>`_ {`CC-BY-SA 4.0`_} - Publicly available subset of the IAHLT UD Hebrew Treebank's Wikipedia section. The UD Hebrew-IAHLTWiki treebank consists of 5,000 contemporary Hebrew sentences representing a variety of texts originating from Wikipedia entries, compiled by the Israeli Association of Human Language Technology. It includes various text domains, such as: biography, law, finance, health, places, events and miscellaneous. 

* `UD Hebrew - IAHLTKnesset <https://github.com/IAHLT/UD_Hebrew-IAHLTKnesset>`_ {`CC BY 4.0`_} - A Universal Dependencies treebank with named entities for contemporary Hebrew covering Knesset protocols. 

* `The Hebrew Language Corpus - Morphological Annotation (קורפוס השפה העברית - תיוג מורפולוגי) <https://data.gov.il/dataset/corpus?fbclid=IwAR0wdLSYk-v43SiZI1c2s4Pq0LPlPHP0HJ6MVHzKwn5l7GEXNVScRSyjUSk>`_ {`Open`_} - An annotated Hebrew database published as part of the Hebrew Language Corpus Project of Israel National Digital Agency and The Academy of the Hebrew Language.

* `The MILA corpora collection <http://www.mila.cs.technion.ac.il/resources_corpora.html>`_ {`GPLv3`_} - The MILA center has 20 different corpora available for free for non-commercial use. All are available in plain text format, and most have tokenized, morphologically-analyzed, and morphologically-disambiguated versions available too. (temporarily down)


Question Answering (QA)
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `HeQ <https://github.com/NNLP-IL/Hebrew-Question-Answering-Dataset>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - a question answering dataset in Modern Hebrew, consisting of 30,147 questions. The dataset follows the format and crowdsourcing methodology of SQuAD (Stanford Question Answering Dataset) and the original ParaShoot. A team of crowdworkers formulated and answered reading comprehension questions based on random paragraphs in Hebrew. The answer to each question is a segment of text (span) included in the relevant paragraph. The paragraphs are sourced from two different platforms: (1) Hebrew Wikipedia, and (2) Geektime, an online Israeli news channel specializing in technology.

* `ParaShoot <https://github.com/omrikeren/ParaShoot>`_ {?} - A Hebrew question and answering dataset in the style of `SQuAD <https://arxiv.org/abs/1606.05250>`_, created by Omri Keren and Omer Levy. ParaShoot is based on articles scraped from Wikipedia. The dataset contains 3K crowdsource-annotated pairs of questions and answers, in a setting suitable for few-shot learning.

* `HebWiki QA <https://github.com/TechnionTDK/hebwiki-qa?fbclid=IwAR0Xbq-s1xu2gH8BS35zgFgNCeHIJ6wVZws4gqHCZ_VucbgiIngpHNTWApU>`_ {?} Translated (by google translation API) SQUAD dataset from English to Hebrew. The translation process included fixation and removal of bad translations.

Sentiment Analysis
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `Hebrew-Sentiment-Data Amram et al. <https://github.com/OnlpLab/Hebrew-Sentiment-Data>`_ {?} - A sentiment analysis benchmark (positive, negative and neutral sentiment) for Hebrew, based on 12K social media comments, containing two instances of input items: token-based and morpheme-based. A cleaned version of the Hebrew Sentiment dataset - a test-train data leakage was cleaned.

* `Emotion User Generated Content (UGC) <https://github.com/avichaychriqui/HeBERT?fbclid=IwAR0GVuSWEvYWimkV4Z22h6-GSEznY2G2eIRz7gDGcAcHT3hB4vgUkxkBCPg>`_ {`MIT`_} - collected for HeBERT model and includes comments posted on news articles collected from 3 major Israeli news sites, between January 2020 to August 2020. The total size of the data is ~150 MB, including over 7 millions words and 350K sentences. ~2000 sentences were annotated by crowd members (3-10 annotators per sentence) **for overall sentiment (polarity)** and eight emotions.

* `Sentiment HebrewDataset <https://github.com/shlomisumit/HebrewDatasets>`_ {`MIT`_} -  The sentiment analysis dataset contains 75,152 tagged sentences from 3 categories: economy, news (mostly politics) and sport. All the sentences were annotated by crowd members (2-5 annotators) to sentiment: positive, negative or neutral. This dataset was created by SUMIT-AI company, thanks to joint funding of the `NNLP-IL <https://nnlp-il.mafat.ai/>`_.

* `HebrewSentiment <https://github.com/NNLP-IL/HebrewSentiment>`_ {?}

Emotion Detection
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `Emotion User Generated Content (UGC) <https://github.com/avichaychriqui/HeBERT?fbclid=IwAR0GVuSWEvYWimkV4Z22h6-GSEznY2G2eIRz7gDGcAcHT3hB4vgUkxkBCPg>`_ {`MIT`_} - collected for HeBERT model and includes comments posted on news articles collected from 3 major Israeli news sites, between January 2020 to August 2020. The total size of the data is ~150 MB, including over 7 millions words and 350K sentences. ~2000 sentences were annotated by crowd members (3-10 annotators per sentence) for overall sentiment (polarity) and eight emotions: anger, disgust, expectation , fear, happiness, sadness, surprise and trust.

Topic Classification
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `Knesset Topic Classification <https://github.com/NitzanBarzilay/KnessetTopicClassification/>`_ {?} - This data was collected as a part of Nitzan Barzilay's project and contains about 2,700 quotes from Knesset meetings, manually classified into eight topics: education, Covid-19, welfare, economic, women and LGBT, health, security, internal security.

* `Criminal Sentence Classification <https://github.com/Maximbrg/legalAI>`_ {OpenRAIL} - This project classifies key aspects of criminal cases within the Israeli legal framework. The project leverages a few-shot learning approach for accurate sentence classification relevant to sentencing decisions.


* `ThinkIL <http://thinkil.co.il/the-website/credits_and_sponsors/>`_ {`CC-BY-SA 3.0`_} - An archive of the writings of Zvi Yanai.

Textual Geolocation Identification
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `HeGeL <https://github.com/OnlpLab/HeGeL>`_ {?} - A novel dataset for Hebrew Geo-Location, the first ever Hebrew NLU benchmark involving both grounding and geospatial reasoning, created with crowdsourced 5,649 geospatially-oriented Hebrew place descriptions of various place types from three cities in Israel.

Natural Language Inference
^^^^^^^^^^^^^^^^^^^^^^^^^^

* `HebNLI <https://github.com/NNLP-IL/HebNLI>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - Based on MultiNLI, a large crowd-sourced corpus of sentences from varied genres and writing styles in the English language. To adapt this resource for Hebrew, the corpus was translated from English using machine translation (Google Gemini). This dataset was created by Webiks for MAFAT, as part of the National Natural Language Processing Plan of Israel.

Text Summarization
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `HeSum <https://github.com/OnlpLab/HeSum>`_ {?} - A novel benchmark specifically designed for abstractive text summarization in Modern Hebrew. HeSum consists of 10,000 articles paired with their corresponding summaries, all of which have been sourced from three different Hebrew news websites, all written by professional journalists.


Semantic Role Labeling (SRL)
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Coreference Resolution
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Relation Extraction
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Text Classification
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Dialogue Modeling
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Machine Translation
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Aligned/Parallel Corpora
-----------------------------------

Recorded Speech and Audio Corpora
----------------------------------------------------

* `The HUJI Corpus of Spoken Hebrew <https://huji-corpus.com/>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - The corpus project, created by Dr Michal Marmorstein, Nadav Matalon, Amir Efrati, Itamar Folman and Yuval Geva, and hosted by the Hebrew University of Jerusalem (HUJI), aims at documenting naturally occurring speech and interaction in Modern Hebrew. Data come from telephone conversations recorded during the years 2020–2021. Data annotation followed standard methods of Interactional Linguistics (Couper-Kuhlen and Selting 2018). Audio files and transcripts were made freely accessible online.

* `CoSIH - The Corpus of Spoken Hebrew <http://cosih.com/table-3.html>`_ {?} - The Corpus of Spoken Israeli Hebrew (CoSIH) is a database of recordings of spoken Israeli Hebrew

* `MaTaCOp <https://www.openu.ac.il/en/academicstudies/matacop/pages/default.aspx>`_ {?} - a corpus of Hebrew dialogues within the Map Task framework (allowed for non-commercial research and teaching purposes only)

* `HaArchion <http://www.haarchion.co.il/>`_ {?} - Recording of various Hebrew prose and poetry being read. (temporarily down)

* `Robo-Shaul (רובו-שאול) <https://story.kan.org.il/robo_shaul>`_ {?} - Transcribed audio recordings (30 hours) of an Israeli economics podcast (חיות כיס).

* `ivrit.ai <https://huggingface.co/ivrit-ai?fbclid=IwAR0zSlDARL6-pLyTInF8vQBxfQdFHU9WD7AwUjF0MMWSMGMjf8Q3Mo-NjWk>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - A comprehensive Hebrew speech dataset designed for AI research and development.  It contains approximately 3,300 hours of Hebrew speech, collected from a diverse range of online platforms including podcasts and other audio content.

* `Hebrew Medical Audio Dataset - Verbit <https://huggingface.co/datasets/verbit/hebrew_medical_audio>`_ {`CC BY-NC 4.0`_} - This dataset is published by Verbit.ai and contains over one thousand audio recordings of invented clinical summaries by 41 different speakers. Each recording is in Hebrew and represents a summary of a patient's visit, providing valuable insights into clinical interactions, diagnosis, treatment plans, and follow-up procedures. The recordings do not contain any personal or private information.

* `HebDB <https://pages.cs.huji.ac.il/adiyoss-lab/HebDB/>`_ {`CC BY 4.0`_} - Weakly supervised dataset for spoken language processing in the Hebrew language. HebDB offers roughly 2500 hours of natural and spontaneous speech recordings in the Hebrew language. Raw recordings are provided together with a pre-processed, weakly supervised, and filtered version.

**Lexical Resources**
================

Lexicons
--------------

Monolingual Lexicons
^^^^^^^^^^^^^^^^^^^^^^^^^

* The BGU morphological lexicon (not yet released)

* The morphological lexicon of the Israeli National Institute for Testing and Evaluation (not yet released)

* `The MILA lexicon of Hebrew words <http://www.mila.cs.technion.ac.il/resources_lexicons_mila.html>`_ {`GPLv3`_} - The lexicon was designed mainly for usage by morphological analyzers, but is being constantly extended to facilitate other applications as well. The lexicon contains about 25,000 lexicon items and is extended regularly. Free for non-commercial use. (temporarily down)

* `MILA's Verb Complements Lexicon <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/lexicons/MILA_verb_complements%20_lexicon>`_ {`GPLv3`_}

* `Hebrew Psychological Lexicons <https://github.com/natalieShapira/HebrewPsychologicalLexicons?fbclid=IwAR20aH6v8MY9rZH9H03-DetxPYVEjispaH5n2Zrs-rSnjOFyv4zNiawlpIU>`_ {`CC-BY-SA 4.0`_} - Natalie Shapira's large collection of Hebrew psychological lexicons and word lists. Useful for various psychology applications such as detecting emotional state, well being, relationship quality in conversation, identifying topics (e.g., family, work) and many more.

Bilingual/Multilingual Lexicons
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `Hebrew WordNet <http://www.mila.cs.technion.ac.il/resources_lexicons_wordnet.html>`_ {`GPLv3`_} -  Hebrew WordNet uses the MultiWordNet methodology and is aligned with the one developed at IRST (and therefore is aligned with English, Italian and Spanish). Free for non-commercial use. (temporarily down)

* `Sentiment lexicon <https://www.kaggle.com/datasets/rtatman/sentiment-lexicons-for-81-languages>`_ {`GPLv3`_} - Sentiment analysis, the task of automatically detecting whether a piece of text is positive or negative, generally relies on a hand-curated list of words with positive sentiment (good, great, awesome) and negative sentiment (bad, gross, awful). This dataset contains both positive and negative sentiment lexicons for 81 languages.

* `word2word <https://github.com/Kyubyong/word2word>`_ {`Apache License 2.0`_} - Easy-to-use word-to-word translations for 3,564 language pairs. Hebrew is one of the 62 supported languages, and thus word-to-word translation to/from Hebrew is supported for 61 languages.

Dictionaries & Word Lists
-------------------------------------------

* `Eran Tomer's Digital Vocalized Text Corpus <https://www.dropbox.com/sh/rlg0k0flz0675ho/AADvfxmY3SN8lqmkGAWr0hd2a?dl=0>`_ {`Apache License 2.0`_} - A corpus of digital vocalized Hebrew texts created by Eran Tomer as part of his Master thesis. The corpus is found in the ``resources`` folder.

* `MILA's Hebrew Stopwords List <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/word_lists/MILA_stopwords>`_ {`GPLv3`_} - An Excel XLSX file containing 23,327 Hebrew tokens in descending order of frequency.

* `Tapuz Hebrew Stop Words <https://www.kaggle.com/datasets/danofer/hebrew-stop-words?fbclid=IwAR2DpSsgJuYyPdaJ9K2WUpZY324pjkXOAuWKv4sUhgkZVjY7n6ej6UK7pwQ>`_ - a list of the 500 most common words (stop words) computed from discussions from the Tapuz People website, on a variety of subjects. (Data files © Original Authors)

* `Stop words <https://www.kaggle.com/datasets/heeraldedhia/stop-words-in-28-languages?select=hebrew.txt>`_ {`GPLv2`_} - Stop words in 28 languages.

* `Hebrew verb lists <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/word_lists/hebrew_verbs_eran_tomer>`_ {`CC-BY 4.0`_} - Created by Eran Tomer (erantom@gmail.com).

* `Hebrew name lists <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/word_lists/dday>`_ {`CC-BY 4.0`_} - Lists of street, company, given and last names. Created by Guy Laybovitz.

* `Most Common Hebrew Verbs on Twitter <https://github.com/NLPH/NLPH_Resources/blob/master/linguistic_resources/word_lists/top_1000_hebrew_words_twitter_2018.txt>`_ - 1000 most frequent words in Hebrew tweets during (roughly) 2018.

* `KIMA - the Historical Hebrew Gazetteer <http://data.geo-kima.org/>`_ - Place Names in the Hebrew Script. An open, attestation based, historical database. Kima currently holds 27,239 Places, with 94,650 alternate variants of their names and 236,744 attestations of these variants.

* Wikidata Lexemes {`CC0 1.0`_} - over 500K conjugations with morphological analysis, mainly based on Hspell. Can be queried using http://query.wikidata.org/ - Uploaded by Uziel302

* `Most Common Hebrew Words on Twitter <https://github.com/YontiLevin/Hebrew-most-common-words-by-Twitter?fbclid=IwAR2oZcojNddFzs4Cd6cMI-Zyp1Mh8h2s2Ih61mQ3vQMDyw-2wf6Dd3DmIMw>`_ - Hebrew most common words by Twitter based on tweets from March 2018 to March 2019.

* `Hebrew WordLists <https://github.com/eyaler/hebrew_wordlists?fbclid=IwAR3QlqD_MDPxhiK7IktW7Sp8fnlgANT3TCYX6R_Rg_gzK9t8vXAqDuAbP90>`_ {`AGPL-3.0`_} - Useful word lists extracted from Hspell 1.4 by Eyal Gruss.

* `Hebrew stop word base on the UD <https://github.com/NNLP-IL/Stop-Words-Hebrew>`_ {`CC-BY-SA 4.0`_} - List of stop words in Hebrew produced by using Universal Dependencies of the The Israeli Association of Human Language Technologies (IAHLT).

* `The Word-Frequency Database for Printed Hebrew <https://github.com/eranroz/BotMisparim>`_ - supplies the frequency of occurrence of any Hebrew letter cluster (mean occurrence per million). The corpus was assembled throughout the year 2001, and consists of text downloaded from 914 editions of the three major daily online Hebrew newspapers (Haaretz, Maariv, and Yediot Acharonot). After removing abbreviations, single characters, forms with counts that are less than 3 (mostly typos), and splitting hyphenated forms (vast majority were two words), the corpus totals 554,270 types and 619,835,788 tokens. (©The Hebrew University of Jerusalem)

Word Embeddings
------------------------------

* `fastText pre-trained word vectors <https://github.com/facebookresearch/fastText/blob/master/docs/pretrained-vectors.md>`_ for Hebrew {`CC-BY-SA 3.0`_} - Trained on `Wikipedia <https://www.wikipedia.org/>`_ using `fastText <https://github.com/facebookresearch/fastText>`_. Comes in both the binary and text default formats of fastText: `binary+text <https://dl.fbaipublicfiles.com/fasttext/vectors-wiki/wiki.he.zip>`_, `text <https://dl.fbaipublicfiles.com/fasttext/vectors-wiki/wiki.he.vec>`_. In the text format, each line contains a word followed by its embedding; Each value is space separated; Words are ordered by their frequency in a descending order.

* `hebrew-word2vec pre-trained word vectors <https://github.com/Ronshm/hebrew-word2vec>`_ {`Apache License 2.0`_} - Trained on data from Twitter. Developed by Ron Shemesh in Bar-Ilan University's NLP lab under the instruction of Dr. Yoav Goldberg. Contains vectors for over 1.4M words (as of January 2018). Comes in a zip with two files: a text file with a word list and a NumPy array file (npy file).

* `CoNLL17 word2vec word embeddings <http://vectors.nlpl.eu/repository/>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - Trained on the Hebrew CoNLL17 corpus using Word2Vec continuous skipgram, with a vecotor dimension of 100 and a window size of 10. The vocabulary includes 672,384 words.

* `CoNLL17 ELMO word embeddings <https://github.com/ltgoslo/simple_elmo/>`_ {`GPLv3`_} - Trained on the Hebrew CoNLL17 corpus using ELMO. **NOTE:** The link at the repository might not work. To download a concerete version of the Hebrew embeddings, `press here <http://vectors.nlpl.eu/repository/20/154.zip>`_.

* `Hebrew Word Embeddings by Lior Shkiller <https://github.com/liorshk/wordembedding-hebrew>`_ - Read more in `this blog post <https://www.oreilly.com/learning/capturing-semantic-meanings-using-deep-learning>`_.

* `Hebrew Subword Embeddings <https://nlp.h-its.org/bpemb/he/>`_

* `LASER Language-Agnostic SEntence Representations <https://github.com/facebookresearch/LASER>`_ {`CC BY-NC 4.0`_} - LASER is a library to calculate and use multilingual sentence embeddings.

.. _Public Domain: https://en.wikipedia.org/wiki/Public_domain
.. _CC-BY-SA 3.0: https://creativecommons.org/licenses/by-sa/3.0/
.. _AGPL-3.0: https://opensource.org/licenses/AGPL-3.0
.. _GPLv3: http://www.gnu.org/copyleft/gpl.html
.. _CC BY-NC-SA 4.0: https://creativecommons.org/licenses/by-nc-sa/4.0/
.. _CC BY-NC 4.0: https://creativecommons.org/licenses/by-nc/4.0/
.. _Apache License 2.0: https://www.apache.org/licenses/LICENSE-2.0
.. _MIT: https://en.wikipedia.org/wiki/MIT_License
.. _CC-BY 4.0: https://creativecommons.org/licenses/by/4.0/
.. _CC0 1.0: https://creativecommons.org/publicdomain/zero/1.0/
.. _CC BY-NC-ND 4.0: https://creativecommons.org/licenses/by-nc-nd/4.0/
.. _CC-BY-SA 4.0: https://creativecommons.org/licenses/by-sa/4.0/legalcode
.. _Custom Terms of Use: http://web.nli.org.il/sites/JPress/English/about/Pages/tems-of-use.aspx
.. _GPLv2: https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html
.. _Open: https://opendefinition.org/od/2.1/en/

* `hebrew-w2v <https://github.com/Iddoyadlin/hebrew-w2v?fbclid=IwAR3QIwzgcziyANpq8-YEPeO1eQzBboDCLeIiSPnenqrFEedCNCgB3QEo44o>`_ {`Apache License 2.0`_} - Iddo Yadlin and Itamar Shefi's word2vec model for Hebrew, trained on a corpus which is the Hebrew wikipedia dump only tokenized with hebpipe.

* `BEREL <https://www.dropbox.com/sh/us98wjb178itjk1/AACWu62ffHJ0zk19i77_rV06a?dl=0&fbclid=IwAR0GbzbyASH8bA_lCadXA-2l09oXtg_NNm4QTQ69WDfdtG77gWx9WufB_II>`_ {?} - BERT Embeddings for Rabbinic-Encoded Language - DICTA's pre-trained language model (PLM) for Rabbinic Hebrew.
