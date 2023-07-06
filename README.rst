Hebrew NLP Resources
####################

**An online interface of this resource index is also available** `HERE <https://resources.nnlp-il.mafat.ai/>`_.

This repository collects resources for NLP in Hebrew, as part of the `NLPH project <https://github.com/NLPH/NLPH>`_, which you can `read more about here <https://github.com/NLPH/NLPH>`_. Resources are divided to folders by type. If you have a resource you can contribute, to be released under some open license, please submit a pull request, or contact us at `contact@nlph.org.il <mailto:contact@nlph.org.il>`_. See `here for a list of companies operating in the field <https://github.com/NLPH/NLPH_Resources/blob/master/Industry.rst>`_.

This specific document is meant to be a list of Hebrew NLP resources, both for general use and to be used as reference when discussing what existing tools can be opened, adapted or integrated to help create a good open source foundation for NLP in Hebrew, as part of the `NLPH Project <https://github.com/NLPH/NLPH>`_.

When contributing to the list, please add a link to the license for all non-paper resources, e.g. {`AGPL-3.0`_}, {?} for an unkonwn licesnse or {X} for unreleased/closed/copyrighted resources. For code resource, please also add the main language in which the tool is written, e.g. [Python] or [?] for an unknown programming language. Please add hosting mirrors with pointy brackets, e.g. `<Zenodo mirror> <https://zenodo.org/record/2707356>`_.


.. contents::

.. section-numbering::


**Corpora**
========== 

Unannotated Corpora
------------------------------

General Corpora
^^^^^^^^^^^^^^

* `HeDC4 used for HeRo <https://huggingface.co/datasets/HeNLP/HeDC4>`_ {`Apache License 2.0`_} - A Hebrew Deduplicated and Cleaned Common Crawl Corpus. A thoroughly cleaned and approximately deduplicated dataset for unsupervised learning.

* `Wikipedia Corpora used for AlephBERT <https://github.com/OnlpLab/AlephBERT/tree/main/data/wikipedia>`_ {`Apache License 2.0`_} - The texts in all of Hebrew Wikipedia was also extracted to pre-train OnlpLab's AlephBERT, using `Attardi's Wikiextractor <https://github.com/attardi/wikiextractor>`_.

* `JPress <http://www.jpress.org.il>`_ {`Custom Terms of Use`_} - `The National Library <http://web.nli.org.il>`_ offers a collection of Jewish newspapers published in various countries, languages, and time periods, including digital versions and full-text search. The texts are published under a `Custom Terms of Use document <http://web.nli.org.il/sites/JPress/English/about/Pages/tems-of-use.aspx>`_ that prohibits commercial use, and additionally requires checking the copyright status and receiving permission from the copyright-holder of the work for any use requiring such permission according to the Copyright Law.

* `The SVLM Hebrew Wikipedia Corpus <https://github.com/NLPH/SVLM-Hebrew-Wikipedia-Corpus>`_ {`CC-BY-SA 3.0`_} - A corpus of 50K sentences from Hebrew Wikipedia chosen to ensure phoneme coverage for the purpose of a sentence recording project.

Specialized Corpora
^^^^^^^^^^^^^^^^^

* `Sefaria <https://github.com/Sefaria/Sefaria-Export/>`_ {Each text is licensed separately} - Structured Jewish texts and metadata with free public licenses, exported from Sefaria's database. A Living Library of Jewish Texts. 3,000 years of Jewish texts in Hebrew and English translation.

* `Hebrew Songs Lyrics <https://www.kaggle.com/datasets/guybarash/hebrew-songs-lyrics?fbclid=IwAR1Tji-2oWxeB54wM3YDVViMG7xTM6000yiov_H1AZTQVRiP9VfmiXkyYu4>`_ {`CC BY-SA 4.0 <https://creativecommons.org/licenses/by-sa/4.0/>`_} - ~15,000 israeli songs scrapped from `Shironet <https://shironet.mako.co.il/>`_ website and contains 167 different singers. Contains only Hebrew characters.

* `1001 Israeli Pop Songs Dataset <https://www.kaggle.com/datasets/adamyodfat/1001-israeli-pop-dataset>`_ {`CC BY-NC-ND 4.0`_} - 1001 Israeli pop songs manual analyses 1967-2017.

* `Supreme Court of Israel <https://huggingface.co/datasets/LevMuchnik/SupremeCourtOfIsrael>`_ {OpenRAIL} - This dataset represents a 2022 snapshot of the Supreme Court of Israel public verdicts and decisions supported by rich metadata. The 5.31GB dataset represents 751,194 documents. Overall, the dataset contains 2.68 Gb of text.

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
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

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

Emotion Detection
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `Emotion User Generated Content (UGC) <https://github.com/avichaychriqui/HeBERT?fbclid=IwAR0GVuSWEvYWimkV4Z22h6-GSEznY2G2eIRz7gDGcAcHT3hB4vgUkxkBCPg>`_ {`MIT`_} - collected for HeBERT model and includes comments posted on news articles collected from 3 major Israeli news sites, between January 2020 to August 2020. The total size of the data is ~150 MB, including over 7 millions words and 350K sentences. ~2000 sentences were annotated by crowd members (3-10 annotators per sentence) for overall sentiment (polarity) and eight emotions: anger, disgust, expectation , fear, happiness, sadness, surprise and trust.

Topic Classification
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `Knesset Topic Classification <https://github.com/NitzanBarzilay/KnessetTopicClassification/>`_ {?} - This data was collected as a part of Nitzan Barzilay's project and contains about 2,700 quotes from Knesset meetings, manually classified into eight topics: education, Covid-19, welfare, economic, women and LGBT, health, security, internal security.

* `ThinkIL <http://thinkil.co.il/the-website/credits_and_sponsors/>`_ {`CC-BY-SA 3.0`_} - An archive of the writings of Zvi Yanai.

Textual Geolocation Identification
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `HeGeL <https://github.com/OnlpLab/HeGeL>`_ {?} - A novel dataset for Hebrew Geo-Location, the first ever Hebrew NLU benchmark involving both grounding and geospatial reasoning, created with crowdsourced 5,649 geospatially-oriented Hebrew place descriptions of various place types from three cities in Israel.


Text Summarization
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Transliteration
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
* `TaatikNet <https://github.com/morrisalp/taatiknet>`_ {`CC BY-SA 3.0`_} - Sequence-to-sequence learning for Hebrew transliteration (converting between Hebrew text and Latin transliteration). See also `post<https://towardsdatascience.com/taatiknet-sequence-to-sequence-learning-for-hebrew-transliteration-4c9175a90c23>`_ and for an interactive demo, see `https://huggingface.co/spaces/malper/taatiknet>`_

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

* `hebrew-w2v <https://github.com/Iddoyadlin/hebrew-w2v?fbclid=IwAR3QIwzgcziyANpq8-YEPeO1eQzBboDCLeIiSPnenqrFEedCNCgB3QEo44o>`_ {`Apache License 2.0`_} - Iddo Yadlin and Itamar Shefi's word2vec model for Hebrew, trained on a corpus which is the Hebrew wikipedia dump only tokenized with hebpipe.

* `BEREL <https://www.dropbox.com/sh/us98wjb178itjk1/AACWu62ffHJ0zk19i77_rV06a?dl=0&fbclid=IwAR0GbzbyASH8bA_lCadXA-2l09oXtg_NNm4QTQ69WDfdtG77gWx9WufB_II>`_ {?} - BERT Embeddings for Rabbinic-Encoded Language - DICTA's pre-trained language model (PLM) for Rabbinic Hebrew.

**Models and Tools**
================

Models and Tools by Task
------------------------------------------

Text Preprocessing and Morphological Analysis
^^^^^^^^^^^^^^^^^^^^^^

Tokenization
~~~~~~~~~~~~

* `Yonti Levin's Hebrew Tokenizer <https://github.com/YontiLevin/Hebrew-Tokenizer>`_ [Python] {`MIT`_} - A very simple python tokenizer for Hebrew text. No batteries included - No dependencies needed! 

* `Hebrew Tokenizer <https://github.com/eyaler/hebrew_tokenizer?fbclid=IwAR1vbBpU9SOzQ71ZaxAjyBwNVuyhuYs3dMQsAUlZXCINy4TSg2BVWvoBARc>`_ {?} - Eyal Gruss's Hebrew tokenizer. A field-tested Hebrew tokenizer for dirty texts (ben-yehuda project, bible, cc100, mc4, opensubs, oscar, twitter) focused on multi-word expression extraction. 

* `RFTokenizer <https://github.com/amir-zeldes/RFTokenizer>`_ [Python] {`Apache License 2.0`_} - A highly accurate morphological segmenter to break up complex word forms

Morphological Analysis
~~~~~~~~~~~~~~~~~~~~~~~~

* `The MILA Morphological Analysis Tool <http://www.mila.cs.technion.ac.il/tools_analysis.html>`_ [?] {`GPLv3`_} - Takes as input undotted Hebrew text (formatted either as plain text or as tokenized XML following MILA's standards). The Analyzer then returns, for each token, all the possible morphological analyses of the token, reflecting part of speech, transliteration, gender, number, definiteness, and possessive suffix. Free for non-commercial use. (temporarily down)

* `The MILA Morphological Disambiguation Tool <http://www.mila.cs.technion.ac.il/tools_disambiguation.html>`_ [?] {`GPLv3`_} - Takes as input morphologically-analyzed text and uses a Hidden Markov Model (HMM) to assign scores for each analysis, considering contextual information from the rest of the sentence. For a given token, all analyses deemed impossible are given scores of 0; all n analyses deemed possible are given positive scores. Free for non-commercial use. (temporarily down)

* `BGU Tagger: Morphological Tagging of Hebrew <https://www.cs.bgu.ac.il/~elhadad/nlp12/hebrew/TagHebrew.html>`_ [Java] {?} - Morphological Analysis, Disambiguation.

* `AlephBERT <https://huggingface.co/onlplab/alephbert-base?fbclid=IwAR3gP64XJEDvRcJ9UQm2DIttOnv7Y-6I5R-t7djj9TTTsXlcIA8qyx8PzSQ>`_ {`Apache License 2.0`_} - a large pre-trained language model for Modern Hebrew, publicly available, pre-training on Oscar, Texts of Hebrew tweets, all of Hebrew Wikipedia, published by the OnlpLab team. This model obtains state-of-the- art results on the tasks of segmentation and Part of Speech Tagging. Github: https://github.com/OnlpLab/AlephBERT 

* `AlephBERTGimmel <https://arxiv.org/pdf/2211.15199.pdf>`_ {`CC0 1.0`_} - a new Hebrew pre-trained language model, trained on the same dataset as the previous SOTA Hebrew PLM AlephBERT, consisting of approximately 2 billion words of text but with a substantially increased vocabulary of 128,000 word pieces. Published as a collaboration of the OnlpLab team and Dicta. Github: https://github.com/Dicta-Israel-Center-for-Text-Analysis/alephbertgimmel

* `TavBERT <https://github.com/omrikeren/TavBERT>`_ {`MIT`_} - a BERT-style masked language model over character sequences, published by Omri Keren, Tal Avinari, Prof. Reut Tsarfaty and Dr. Omer Levy.

* `Verb Inflector <https://github.com/NLPH/NLPH_Resources/tree/master/code/VerbInflector>`_ [Java] {`Apache License 2.0`_} - A generation mechanism, created as part of Eran Tomer's (erantom@gmail.com) Master thesis, which produces vocalized and morphologically tagged Hebrew verbs given a non-vocalized verb in base-form and an indication of which pattern the verb follows.

* `HebPipe <https://github.com/amir-zeldes/HebPipe>`_ [Python] {`Apache License 2.0`_} - End-to-end pipeline for Hebrew NLP using off the shelf tools, including morphological analysis, tagging, lemmatization, parsing and more.

* `YAP morpho-syntactic parser <https://github.com/OnlpLab/yap>`_ [Go] {`Apache License 2.0`_} - Morphological Analysis, disambiguation and dependency Parser. Morphological Analyzer relies on the BGU Lexicon. [`original repository <http://github.com/habeanf/yap>`_] `Demo <https://nlp.biu.ac.il/~rtsarfaty/onlp/hebrew/>`_

* `SPMRL to UD <https://github.com/shovalsa/SPMRL-to-UD>`_ {`Apache License 2.0`_} - Converts YAP's output from the SPMRL scheme to UD v2.

* `HebMorph <https://github.com/synhershko/HebMorph>`_ [Lucene] {`AGPL-3.0`_} - An open-source effort to make Hebrew properly searchable by various IR software libraries. Includes Hebrew Analyzer for Lucene.

* `Hspell <http://hspell.ivrix.org.il/>`_ [?] {`AGPL-3.0`_} - Free Hebrew linguistic project including spell checker and  morphological analyzer. `HspellPy <https://github.com/eranroz/HspellPy/>`_ [Python] {`AGPL-3.0`_} - Python wrapper for Hspell.

Part-of-speech (POS) Tagging
~~~~~~~~~~~~~~~~~~~~~~~~

* `AlephBERT <https://huggingface.co/onlplab/alephbert-base?fbclid=IwAR3gP64XJEDvRcJ9UQm2DIttOnv7Y-6I5R-t7djj9TTTsXlcIA8qyx8PzSQ>`_ {`Apache License 2.0`_} - a large pre-trained language model for Modern Hebrew, publicly available, pre-training on Oscar, Texts of Hebrew tweets, all of Hebrew Wikipedia, published by the OnlpLab team. This model obtains state-of-the- art results on the tasks of segmentation and Part of Speech Tagging. Github: https://github.com/OnlpLab/AlephBERT

* `AlephBERTGimmel <https://arxiv.org/pdf/2211.15199.pdf>`_ {`CC0 1.0`_} - a new Hebrew pre-trained language model, trained on the same dataset as the previous SOTA Hebrew PLM AlephBERT, consisting od approximiately 2 billion words of text but with a substantially increased vocabulary of 128,000 word pieces. Published as a collaboration of the OnlpLab team and Dicta. Github: https://github.com/Dicta-Israel-Center-for-Text-Analysis/alephbertgimmel

* `TavBERT <https://github.com/omrikeren/TavBERT>`_ {`MIT`_} - a BERT-style masked language model over character sequences, published by Omri Keren, Tal Avinari, Prof. Reut Tsarfaty and Dr. Omer Levy.

* `The MILA Morphological Analysis Tool <http://www.mila.cs.technion.ac.il/tools_analysis.html>`_ [?] {`GPLv3`_} - Takes as input undotted Hebrew text (formatted either as plain text or as tokenized XML following MILA's standards). The Analyzer then returns, for each token, all the possible morphological analyses of the token, reflecting part of speech, transliteration, gender, number, definiteness, and possessive suffix. Free for non-commercial use. (temporarily down)

* `HebPipe <https://github.com/amir-zeldes/HebPipe>`_ [Python] {`Apache License 2.0`_} - End-to-end pipeline for Hebrew NLP using off the shelf tools, including morphological analysis, tagging, lemmatization, parsing and more

* `YAP morpho-syntactic parser <https://github.com/OnlpLab/yap>`_ [Go] {`Apache License 2.0`_} - Morphological Analysis, disambiguation and dependency Parser. Morphological Analyzer relies on the BGU Lexicon. [`original repository <http://github.com/habeanf/yap>`_] `Demo <https://nlp.biu.ac.il/~rtsarfaty/onlp/hebrew/>`_

Stemming and Lemmatization
~~~~~~~~~~~~~~~~~~~~~~~~

* `HebPipe <https://github.com/amir-zeldes/HebPipe>`_ [Python] {`Apache License 2.0`_} - End-to-end pipeline for Hebrew NLP using off the shelf tools, including morphological analysis, tagging, lemmatization, parsing and more.

* `YAP morpho-syntactic parser <https://github.com/OnlpLab/yap>`_ [Go] {`Apache License 2.0`_} - Morphological Analysis, disambiguation and dependency Parser. Morphological Analyzer relies on the BGU Lexicon. [`original repository <http://github.com/habeanf/yap>`_] `Demo <https://nlp.biu.ac.il/~rtsarfaty/onlp/hebrew/>`_

Spell Checking and Correction
~~~~~~~~~~~~~~~~~~~~~~~~

* `Shtey Shekel <https://he.wikipedia.org/wiki/%D7%95%D7%99%D7%A7%D7%99%D7%A4%D7%93%D7%99%D7%94:%D7%AA%D7%97%D7%96%D7%95%D7%A7%D7%94/%D7%A9%D7%AA%D7%99_%D7%A9%D7%A7%D7%9C>`_ {`MIT`_} - Wikiproject for correcting grammar mistakes. (Heuristic) positive annotions can be derived from  `query <https://quarry.wmflabs.org/query/21957>`_. 

* `Hspell <http://hspell.ivrix.org.il/>`_ [?] {`AGPL-3.0`_} - Free Hebrew linguistic project including spell checker and  morphological analyzer. `HspellPy <https://github.com/eranroz/HspellPy/>`_ [Python] {`AGPL-3.0`_} - Python wrapper for Hspell.

Diacritization\Vocalization
~~~~~~~~~~~~~~~~~~~~~~~~

* `Nakdan <https://nakdan.dicta.org.il/>`_ (`Paper <https://aclanthology.org/2020.acl-demos.23.pdf>`_) - Tool for Automatic and semi-automatic Nikud for Hebrew texts. Avi Shmidman, Shaltiel Shmidman, Moshe Koppel, and Yoav Goldberg. 2020. Nakdan: Professional Hebrew diacritizer. In Proceedings of the 58th Annual Meeting of the Association for Computational Linguistics: System Demonstrations, pages 197–203, Online. Association for Computational Linguistics.

* `Nakdimon <https://www.nakdimon.org/>`_ (`Paper <https://arxiv.org/abs/2105.05209/>`_ , `code <https://github.com/elazarg/nakdimon/>`_ ,  `data <https://github.com/elazarg/hebrew-diacritize/>`_) - Hebrew diacritizer. Elazar Gershuni and Yuval Pinter: Restoring Hebrew Diacritics Without a Dictionary. `Demo in Replicate <https://replicate.com/elazarg/nakdimon/>`_.

* `UNIKUD <https://dagshub.com/morrisalp/unikud>`_ {`MIT`_} - Morris Alper's open-source tool for adding vowel signs (Nikud) to Hebrew text, uses no rule-based logic, built with a CANINE transformer network. An interactive demo is available at https://huggingface.co/spaces/malper/unikud Blog post: https://towardsdatascience.com/unikud-adding-vowels-to-hebrew-text-with-deep-learning-powered-by-dagshub-56d238e22d3f .

* `Hebrew OCR with Nikud <https://www.cs.bgu.ac.il/~elhadad/hocr/>`_ [Python] {?} - A program to convert Hebrew text files (without Nikud) to text files with the correct Nikud. Developed by Adi Oz and Vered Shani.

Stopwords Removal
~~~~~~~~~~~~~~~~~~~~~~~~

Language modeling
~~~~~~~~~~~~~~~~~~~~~~~~

* `Legal-HeBERT <https://github.com/avichaychriqui/Legal-HeBERT?fbclid=IwAR3sFizNJEfPIXm0Agg5HpELUm49v11kfksjes72-Q-9CxMwv8hdR8I5ahg>`_ {?} - a BERT model for Hebrew legal and legislative domains. It is intended to improve the legal NLP research and tools development in Hebrew. Avichay Chriqui, Dr. Inbal Yahav Shenberger and Dr. Ittai Bar-Siman-Tov release two versions of Legal-HeBERT: `The first version <https://huggingface.co/avichr/Legal-heBERT_ft?fbclid=IwAR3K16AoiBYtZlpf2C6TjSstOv7ZuaWLIwCOq93_fRV6bGA3ssDA8NfuHmY>`_ is a fine-tuned model of HeBERT applied on legal and legislative documents. `The second version <https://huggingface.co/avichr/Legal-heBERT?fbclid=IwAR3r-QUCMSdzCoAjomifrk2hCPX7kvGJk47raHHfqBI511QXXchaOkL8rFo>`_ uses HeBERT's architecture guidlines to train a BERT model from scratch.

Text Normalization
~~~~~~~~~~~~~~~~~~~~~~~~

Text Analysis
^^^^^^^^^^^^^^^

Question Answering (QA)
~~~~~~~~~~~~~~~~~~~~~~~~

* `HeRo <https://huggingface.co/HeNLP/HeRo>`_ {?} - RoBERTa based language model for Hebrew, present state-of-the-art results on sentiment analysis, named entity recognition and question answering.

Sentiment Analysis
~~~~~~~~~~~~~~~~~~~~~~~~

* `HeRo <https://huggingface.co/HeNLP/HeRo>`_ {?} - RoBERTa based language model for Hebrew, present state-of-the-art results on sentiment analysis, named entity recognition and question answering.

* `AlephBERT <https://huggingface.co/onlplab/alephbert-base?fbclid=IwAR3gP64XJEDvRcJ9UQm2DIttOnv7Y-6I5R-t7djj9TTTsXlcIA8qyx8PzSQ>`_ {`Apache License 2.0`_} - a large pre-trained language model for Modern Hebrew, publicly available, pre-training on Oscar, Texts of Hebrew tweets, all of Hebrew Wikipedia, published by the OnlpLab team. Github: https://github.com/OnlpLab/AlephBERT

* `AlephBERTGimmel <https://arxiv.org/pdf/2211.15199.pdf>`_ {`CC0 1.0`_} - a new Hebrew pre-trained language model, trained on the same dataset as the previous SOTA Hebrew PLM AlephBERT, consisting od approximiately 2 billion words of text but with a substantially increased vocabulary of 128,000 word pieces. Published as a collaboration of the OnlpLab team and Dicta. Github: https://github.com/Dicta-Israel-Center-for-Text-Analysis/alephbertgimmel

* `Neural Sentiment Analyzer for Modern Hebrew <https://github.com/omilab/Neural-Sentiment-Analyzer-for-Modern-Hebrew>`_ [?] {`MIT`_} - This code and dataset provide an established benchmark for neural sentiment analysis for Modern Hebrew.

* `HeBERT <https://github.com/avichaychriqui/HeBERT>`_ {`MIT`_} - HeBERT is a Hebrew pretrained language model for Polarity Analysis and Emotion Recognition, published by Dr. Inbal Yahav Shenberger and Avichay Chriqui. It is based on Google's BERT architecture and it is BERT-Base config. HeBert was trained on three dataset: OSCAR, A Hebrew dump of Wikipedia, Emotion User Generated Content (UGC) data that was collected for the purpose of this study. The model was evaluated on downstream tasks: `HebEMO - emotion recognition model <https://huggingface.co/avichr/hebEMO_anticipation?fbclid=IwAR00bGmLoASpEjpCOoWjuZ6q4xhlu6wwZR4Miau2RV2nVsam-o7oVt4jYkY>`_ and `sentiment analysis <https://huggingface.co/avichr/heBERT_sentiment_analysis?fbclid=IwAR1IhvCmosiapbA3iosHc0nJHM6nM-0m7Ew3Zeqw2V4wg-3cWKuB_Qf8OuY>`_. (https://huggingface.co/avichr/heBERT?fbclid=IwAR2Lo9pkN5HLZmtFiFwcIDWyXR9gyP646pyFzNSUUP_djalAkewvB9p8E_o)

Emotion Detection
~~~~~~~~~~~~~~~~~~~~~~~~

* `Hebrew Psychological Lexicons <https://github.com/natalieShapira/HebrewPsychologicalLexicons?fbclid=IwAR20aH6v8MY9rZH9H03-DetxPYVEjispaH5n2Zrs-rSnjOFyv4zNiawlpIU>`_ {`Apache License 2.0`_} - Easy-to-use Python interface for Hebrew clinical psychology text analysis. Useful for various psychology applications such as detecting emotional state, well being, relationship quality in conversation, identifying topics (e.g., family, work) and many more.

* `HeBERT <https://github.com/avichaychriqui/HeBERT>`_ {`MIT`_} - HeBERT is a Hebrew pretrained language model for Polarity Analysis and Emotion Recognition, published by Dr. Inbal Yahav Shenberger and Avichay Chriqui. It is based on Google's BERT architecture and it is BERT-Base config. HeBert was trained on three dataset: OSCAR, A Hebrew dump of Wikipedia, Emotion User Generated Content (UGC) data that was collected for the purpose of this study. The model was evaluated on downstream tasks: `HebEMO - emotion recognition model <https://huggingface.co/avichr/hebEMO_anticipation?fbclid=IwAR00bGmLoASpEjpCOoWjuZ6q4xhlu6wwZR4Miau2RV2nVsam-o7oVt4jYkY>`_ and `sentiment analysis <https://huggingface.co/avichr/heBERT_sentiment_analysis?fbclid=IwAR1IhvCmosiapbA3iosHc0nJHM6nM-0m7Ew3Zeqw2V4wg-3cWKuB_Qf8OuY>`_. (https://huggingface.co/avichr/heBERT?fbclid=IwAR2Lo9pkN5HLZmtFiFwcIDWyXR9gyP646pyFzNSUUP_djalAkewvB9p8E_o)

Text Summarization
~~~~~~~~~~~~~~~~~~~~~~~~

Text Classification
~~~~~~~~~~~~~~~~~~~~~~~~

* `LongHeRo <https://huggingface.co/HeNLP/LongHeRo>`_ {?} - State-of-the-art Longformer language model for Hebrew.

* `Legal-HeBERT <https://github.com/avichaychriqui/Legal-HeBERT?fbclid=IwAR3sFizNJEfPIXm0Agg5HpELUm49v11kfksjes72-Q-9CxMwv8hdR8I5ahg>`_ {?} - a BERT model for Hebrew legal and legislative domains. It is intended to improve the legal NLP research and tools development in Hebrew. Avichay Chriqui, Dr. Inbal Yahav Shenberger and Dr. Ittai Bar-Siman-Tov release two versions of Legal-HeBERT: `The first version <https://huggingface.co/avichr/Legal-heBERT_ft?fbclid=IwAR3K16AoiBYtZlpf2C6TjSstOv7ZuaWLIwCOq93_fRV6bGA3ssDA8NfuHmY>`_ is a fine-tuned model of HeBERT applied on legal and legislative documents. `The second version <https://huggingface.co/avichr/Legal-heBERT?fbclid=IwAR3r-QUCMSdzCoAjomifrk2hCPX7kvGJk47raHHfqBI511QXXchaOkL8rFo>`_ uses HeBERT's architecture guidlines to train a BERT model from scratch.

* `Universal Language Model Fine-tuning for Text Classification (ULMFiT) in Hebrew <https://github.com/hanan9m/hebrew_ULMFiT?fbclid=IwAR0wJkoxmaCmhuZnSVOLBo1Mo362v6-66PmXutOr9FhhoItIHoqG_2MzV8E>`_ - The weights (e.g. a trained model) for a Hebrew version for Howard's and Ruder's ULMFiT model. Trained on the Hebrew Wikipedia corpus.

Topic Classification
~~~~~~~~~~~~~~~~~~~~~~~~

* `Hebrew Psychological Lexicons <https://github.com/natalieShapira/HebrewPsychologicalLexicons?fbclid=IwAR20aH6v8MY9rZH9H03-DetxPYVEjispaH5n2Zrs-rSnjOFyv4zNiawlpIU>`_ {`Apache License 2.0`_} - Easy-to-use Python interface for Hebrew clinical psychology text analysis. Useful for various psychology applications such as detecting emotional state, well being, relationship quality in conversation, identifying topics (e.g., family, work) and many more.

Topic Modeling
~~~~~~~~~~~~~~~~~~~~~~~~

* `BGU NLP - LemLDA: an LDA Package for Hebrew <https://www.cs.bgu.ac.il/~elhadad/nlpproj/LDAforHebrew.html>`_ [?] {`GPLv3`_} - The package is based on Heinrich's java implementation of collapsed Gibbs sampling with an extra variable to model the generative nature of lemmas in Hebrew.

Irony/Sarcasm Detection
~~~~~~~~~~~~~~~~~~~~~

Discourse Analysis
~~~~~~~~~~~~~~~~~~~~~~~~

Dialogue Modeling
~~~~~~~~~~~~~~~~~~~~~~~~

Information Extraction
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Named Entity Recognition (NER)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~

* `HeRo <https://huggingface.co/HeNLP/HeRo>`_ {?} - RoBERTa based language model for Hebrew, present state-of-the-art results on sentiment analysis, named entity recognition and question answering.

* `AlephBERT <https://huggingface.co/onlplab/alephbert-base?fbclid=IwAR3gP64XJEDvRcJ9UQm2DIttOnv7Y-6I5R-t7djj9TTTsXlcIA8qyx8PzSQ>`_ {`Apache License 2.0`_} - a large pre-trained language model for Modern Hebrew, publicly available, pre-training on Oscar, Texts of Hebrew tweets, all of Hebrew Wikipedia, published by the OnlpLab team. This model obtains state-of-the-art results on the tasks of segmentation, Part of Speech Tagging, Named Entity Recognition, and Sentiment Analysis. Github: https://github.com/OnlpLab/AlephBERT

* `AlephBERTGimmel <https://arxiv.org/pdf/2211.15199.pdf>`_ {`CC0 1.0`_} - a new Hebrew pre-trained language model, trained on the same dataset as the previous SOTA Hebrew PLM AlephBERT, consisting od approximiately 2 billion words of text but with a substantially increased vocabulary of 128,000 word pieces. Published as a collaboration of the OnlpLab team and Dicta. Github: https://github.com/Dicta-Israel-Center-for-Text-Analysis/alephbertgimmel

* `TavBERT <https://github.com/omrikeren/TavBERT>`_ {`MIT`_} - a BERT-style masked language model over character sequences, published by Omri Keren, Tal Avinari, Prof. Reut Tsarfaty and Dr. Omer Levy.

* `Neural Modeling for Named Entities and Morphology (NEMO2) <https://github.com/OnlpLab/NEMO>`_ {`Apache License 2.0`_} - OnlpLab's code and models for neural modeling of Hebrew NER. Described in the TACL paper `Neural Modeling for Named Entities and Morphology (NEMO2) <https://direct.mit.edu/tacl/article/doi/10.1162/tacl_a_00404/107206/Neural-Modeling-for-Named-Entities-and-Morphology>`_.

* `MDTEL <https://github.com/yonatanbitton/mdtel?fbclid=IwAR3Npi5lG4hGy1dcQwdr2RWuEFUArjmQ_bo3FXQ9KhYZUpK5OO67-aT-e5k>`_ {?} - Yonatan Bitton's code that recognizes medical entities in a Hebrew text.

* `HebSpacy <https://github.com/8400TheHealthNetwork/HebSpacy>`_ {`MIT`_} - A custom spaCy pipeline for Hebrew text including a transformer-based multitask NER model that recognizes 16 entity types in Hebrew, including GPE, PER, LOC and ORG.

* `HebSafeHarbor <https://github.com/8400TheHealthNetwork/HebSafeHarbor>`_ {`MIT`_} - A de-identification toolkit for clinical text in Hebrew. `Demo <https://hebsafeharbor-demo.azurewebsites.net/>`_ 

Semantic Role Labeling (SRL)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Temporal Information Extraction
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

* `HebSafeHarbor <https://github.com/8400TheHealthNetwork/HebSafeHarbor>`_ {`MIT`_} - A de-identification toolkit for clinical text in Hebrew. `Demo <https://hebsafeharbor-demo.azurewebsites.net/>`_

Event Extraction
~~~~~~~~~~~~~~~~~~~~~~~~

Coreference Resolution
~~~~~~~~~~~~~~~~~~~~~~~~
* `HebPipe <https://github.com/amir-zeldes/HebPipe>`_ [Python] {`Apache License 2.0`_} - End-to-end pipeline for Hebrew NLP using off the shelf tools, including morphological analysis, tagging, lemmatization, parsing and more.

Relation Extraction
~~~~~~~~~~~~~~~~~~~~~~~~

Speech and Image Processing
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Speech Recognition
~~~~~~~~~~~~~~~~~~~~~~~~

Speech Synthesis
~~~~~~~~~~~~~~~~~~~~~~~~

Text-to-Speech (TTS)
~~~~~~~~~~~~~~~~~~~~~~~~

Speech-to-Text (STT)
~~~~~~~~~~~~~~~~~~~~~~~~~

* `The Automatic Hebrew Transcriber <http://hebrew-transcriber.online/>`_ - Automatically transcribes text from Hebrew audio and video files. (down, link not found)

Optical Character Recognition (OCR)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

* `Text-Fabric <https://annotation.github.io/text-fabric/tf/>`_ [Python] {`CC BY-NC 4.0`_} - A Python package for browsing and processing ancient corpora, focused on the Hebrew Bible Database.

* `Hebrew OCR with Nikud <https://www.cs.bgu.ac.il/~elhadad/hocr/>`_ [Python] {?} - A program to convert Hebrew text files (without Nikud) to text files with the correct Nikud. Developed by Adi Oz and Vered Shani.

Language Generation
~~~~~~~~~~~~~~~~~~~~~~~~

* `Verb Inflector <https://github.com/NLPH/NLPH_Resources/tree/master/code/VerbInflector>`_ [Java] {`Apache License 2.0`_} - A generation mechanism, created as part of Eran Tomer's (erantom@gmail.com) Master thesis, which produces vocalized and morphologically tagged Hebrew verbs given a non-vocalized verb in base-form and an indication of which pattern the verb follows.

* `HebMorph <https://github.com/synhershko/HebMorph>`_ [Lucene] {`AGPL-3.0`_} - An open-source effort to make Hebrew properly searchable by various IR software libraries. Includes Hebrew Analyzer for Lucene. 

Machine Translation
~~~~~~~~~~~~~~~~~~~~~~~~

* `word2word <https://github.com/Kyubyong/word2word>`_ {`Apache License 2.0`_} - Easy-to-use Python interface for accessing top-k word translations and for building a new bilingual lexicon from a custom parallel corpus. 

Models by Type
----------------------------

Pre-Trained Language Models
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `AlephBERT <https://huggingface.co/onlplab/alephbert-base?fbclid=IwAR3gP64XJEDvRcJ9UQm2DIttOnv7Y-6I5R-t7djj9TTTsXlcIA8qyx8PzSQ>`_ {`Apache License 2.0`_} - a large pre-trained language model for Modern Hebrew, publicly available, pre-training on Oscar, Texts of Hebrew tweets, all of Hebrew Wikipedia, published by the OnlpLab team. This model obtains state-of-the- art results on the tasks of segmentation, Part of Speech Tagging, Named Entity Recognition, and Sentiment Analysis. Github: https://github.com/OnlpLab/AlephBERT

* `AlephBERTGimmel <https://arxiv.org/pdf/2211.15199.pdf>`_ {`CC0 1.0`_} - a new Hebrew pre-trained language model, trained on the same dataset as the previous SOTA Hebrew PLM AlephBERT, consisting od approximiately 2 billion words of text but with a substantially increased vocabulary of 128,000 word pieces. Published as a collaboration of the OnlpLab team and Dicta. Github: https://github.com/Dicta-Israel-Center-for-Text-Analysis/alephbertgimmel

* `HeBERT <https://github.com/avichaychriqui/HeBERT>`_ {`MIT`_} - HeBERT is a Hebrew pretrained language model for Polarity Analysis and Emotion Recognition, published by Dr. Inbal Yahav Shenberger and Avichay Chriqui. It is based on Google's BERT architecture and it is BERT-Base config. HeBert was trained on three dataset: OSCAR, A Hebrew dump of Wikipedia, Emotion User Generated Content (UGC) data that was collected for the purpose of this study. The model was evaluated on downstream tasks: `HebEMO - emotion recognition model <https://huggingface.co/avichr/hebEMO_anticipation?fbclid=IwAR00bGmLoASpEjpCOoWjuZ6q4xhlu6wwZR4Miau2RV2nVsam-o7oVt4jYkY>`_ and `sentiment analysis <https://huggingface.co/avichr/heBERT_sentiment_analysis?fbclid=IwAR1IhvCmosiapbA3iosHc0nJHM6nM-0m7Ew3Zeqw2V4wg-3cWKuB_Qf8OuY>`_. (https://huggingface.co/avichr/heBERT?fbclid=IwAR2Lo9pkN5HLZmtFiFwcIDWyXR9gyP646pyFzNSUUP_djalAkewvB9p8E_o)

* `TavBERT <https://github.com/omrikeren/TavBERT>`_ {`MIT`_} - a BERT-style masked language model over character sequences, published by Omri Keren, Tal Avinari, Prof. Reut Tsarfaty and Dr. Omer Levy.

* `BEREL <https://www.dropbox.com/sh/us98wjb178itjk1/AACWu62ffHJ0zk19i77_rV06a?dl=0&fbclid=IwAR0GbzbyASH8bA_lCadXA-2l09oXtg_NNm4QTQ69WDfdtG77gWx9WufB_II>`_ {?} - BERT Embeddings for Rabbinic-Encoded Language - DICTA's pre-trained language model (PLM) for Rabbinic Hebrew.

* `Legal-HeBERT <https://github.com/avichaychriqui/Legal-HeBERT?fbclid=IwAR3sFizNJEfPIXm0Agg5HpELUm49v11kfksjes72-Q-9CxMwv8hdR8I5ahg>`_ {?} - a BERT model for Hebrew legal and legislative domains. It is intended to improve the legal NLP research and tools development in Hebrew. Avichay Chriqui, Dr. Inbal Yahav Shenberger and Dr. Ittai Bar-Siman-Tov release two versions of Legal-HeBERT: `The first version <https://huggingface.co/avichr/Legal-heBERT_ft?fbclid=IwAR3K16AoiBYtZlpf2C6TjSstOv7ZuaWLIwCOq93_fRV6bGA3ssDA8NfuHmY>`_ is a fine-tuned model of HeBERT applied on legal and legislative documents. `The second version <https://huggingface.co/avichr/Legal-heBERT?fbclid=IwAR3r-QUCMSdzCoAjomifrk2hCPX7kvGJk47raHHfqBI511QXXchaOkL8rFo>`_ uses HeBERT's architecture guidlines to train a BERT model from scratch.

Fine-Tuned Language Models
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `TavBERT <https://github.com/omrikeren/TavBERT>`_ {`MIT`_} - a BERT-style masked language model over character sequences, published by Omri Keren, Tal Avinari, Prof. Reut Tsarfaty and Dr. Omer Levy.

* `Legal-HeBERT <https://github.com/avichaychriqui/Legal-HeBERT?fbclid=IwAR3sFizNJEfPIXm0Agg5HpELUm49v11kfksjes72-Q-9CxMwv8hdR8I5ahg>`_ {?} - a BERT model for Hebrew legal and legislative domains. It is intended to improve the legal NLP research and tools development in Hebrew. Avichay Chriqui, Dr. Inbal Yahav Shenberger and Dr. Ittai Bar-Siman-Tov release two versions of Legal-HeBERT: `The first version <https://huggingface.co/avichr/Legal-heBERT_ft?fbclid=IwAR3K16AoiBYtZlpf2C6TjSstOv7ZuaWLIwCOq93_fRV6bGA3ssDA8NfuHmY>`_ is a fine-tuned model of HeBERT applied on legal and legislative documents. `The second version <https://huggingface.co/avichr/Legal-heBERT?fbclid=IwAR3r-QUCMSdzCoAjomifrk2hCPX7kvGJk47raHHfqBI511QXXchaOkL8rFo>`_ uses HeBERT's architecture guidlines to train a BERT model from scratch.

* `Universal Language Model Fine-tuning for Text Classification (ULMFiT) in Hebrew <https://github.com/hanan9m/hebrew_ULMFiT?fbclid=IwAR0wJkoxmaCmhuZnSVOLBo1Mo362v6-66PmXutOr9FhhoItIHoqG_2MzV8E>`_ - The weights (e.g. a trained model) for a Hebrew version for Howard's and Ruder's ULMFiT model. Trained on the Hebrew Wikipedia corpus.

Multilingual Models
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `BERT's multilingual model <https://github.com/google-research/bert/blob/master/multilingual.md>`_ - Trained (also) on Hebrew.

* `Universal Language Model Fine-tuning for Text Classification (ULMFiT) in Hebrew <https://github.com/hanan9m/hebrew_ULMFiT?fbclid=IwAR0wJkoxmaCmhuZnSVOLBo1Mo362v6-66PmXutOr9FhhoItIHoqG_2MzV8E>`_ - The weights (e.g. a trained model) for a Hebrew version for Howard's and Ruder's ULMFiT model. Trained on the Hebrew Wikipedia corpus.

Pipelines\Parsers
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `HebPipe <https://github.com/amir-zeldes/HebPipe>`_ [Python] {`Apache License 2.0`_} - End-to-end pipeline for Hebrew NLP using off the shelf tools, including morphological analysis, tagging, lemmatization, parsing and more

* `YAP morpho-syntactic parser <https://github.com/OnlpLab/yap>`_ [Go] {`Apache License 2.0`_} - Morphological Analysis, disambiguation and dependency Parser. Morphological Analyzer relies on the BGU Lexicon. [`original repository <http://github.com/habeanf/yap>`_] `Demo <https://nlp.biu.ac.il/~rtsarfaty/onlp/hebrew/>`_

* `SPMRL to UD <https://github.com/shovalsa/SPMRL-to-UD>`_ {`Apache License 2.0`_} - Converts YAP's output from the SPMRL scheme to UD v2.

* `HebSpacy <https://github.com/8400TheHealthNetwork/HebSpacy>`_ {`MIT`_} - A custom spaCy pipeline for Hebrew text including a transformer-based multitask NER model that recognizes 16 entity types in Hebrew, including GPE, PER, LOC and ORG.

* `HebSafeHarbor <https://github.com/8400TheHealthNetwork/HebSafeHarbor>`_ {`MIT`_} - A de-identification toolkit for clinical text in Hebrew. `Demo <https://hebsafeharbor-demo.azurewebsites.net/>`_ 

Causal Language Models (CLM)
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

* `Hebrew GPT neo <https://github.com/Norod/hebrew-gpt_neo>`_ {`MIT`_} - Doron Adler's Hebrew text generation model based on EleutherAI's gpt-neo.

**Commercial and Online Services**
===========================

* `DICTA <http://dicta.org.il/>`_ {`CC-BY-SA 4.0`_} - Analytical tools for Jewish texts. They also have a `GitHub organization <https://github.com/Dicta-Israel-Center-for-Text-Analysis>`_.

* `wordfreq 3.0.3 <https://pypi.org/project/wordfreq/?fbclid=IwAR0XRlwXQlzbrVoodjatJTrcKwnxvoA4dVBSZyiQuB-qEzXAiizDX63hLGc>`_ {`MIT`_} - wordfreq is a Python library for looking up the frequencies of words in 44 languages, including Hebrew. The Hebrew data is based on Wikipedia, OPUS OpenSubtitles 2018 and SUBTLEX, Google Books Ngrams 2012, Web text from OSCAR and Twitter.

* `Eyfo <https://ey.fo/search>`_ - A commercial engine for search and entity tagging in Hebrew. 

* `Melingo's ICA (Intelligent Content Analysis) <https://melingo.com/text-analysis/morfix_insights/>`_ - A text analysis and textual categorized entity extraction API for Hebrew, Arabic and Farsi texts.

* `Genius <https://www.genius.co.il>`_ - Automatic analysis of free text in Hebrew. 

* `AlmaReader <https://app.almareader.com/>`_ - Online text-to-speech service for Hebrew.

* `Amnon The Transcriber <https://api.whatsapp.com/send/?phone=972523362105&text&type=phone_number&app_absent=0>`_ - a WhatsApp bot that receives a voice note and transcribe it to text.

* `Callee <https://www.geektime.co.il/callee-whatsapp-bot/>`_ - a WhatsApp bot that receives a voice note, transcribes it to text also summarize it (as a text).

* `verbit.ai <https://verbit.ai/>`_ - Transcription.

* `Text Analytics for health containers <https://learn.microsoft.com/en-us/azure/cognitive-services/language-service/text-analytics-for-health/how-to/use-containers?tabs=language>`_ 

* `Hebrew-Nlp <http://hebrew-nlp.co.il/>`_

* `HebMorph <https://code972.com/hebmorph>`_ [Lucene] {`AGPL-3.0`_} - An open-source effort to make Hebrew properly searchable by various IR software libraries. Includes Hebrew Analyzer for Lucene.

**Annotation Tools**
=================

* `LightTag <https://www.lighttag.io/>`_  - A tool for managing annotation projects. Handles right-to-left and part-of-word marking. Tutorial video: https://www.youtube.com/watch?v=eTlrTC_n_yg

* `Recogito <http://recogito.pelagios.org/>`_ [Scala, JavaScript, HTML] {`Apache License 2.0`_} - A tool for linked data annotation.

* `CATMA <http://catma.de/>`_ [HTML, Java] {unclear} - A web-based tool for research and collaboration over text data. Handles right-to-left and part-of-word marking. See the system itself here: http://portal.catma.de/catma/, and the code here: https://github.com/mpetris/catma

* `WebAnno <https://webanno.github.io/>`_ [Java] {`Apache License 2.0`_} - Web-based. Support RTL and project management. Repository: https://github.com/webanno/webanno

* `Arethusa: Annotation Environment <https://www.perseids.org/tools/arethusa/app/#/>`_ [JavaScript] {`MIT`_} - A backend-independent client-side annotation framework. `Repository here <https://github.com/alpheios-project/arethusa>`_.

* `rasa-nlu-trainer <https://github.com/RasaHQ/rasa-nlu-trainer>`_ [JavaScript] {`MIT`_} - A tool to edit training examples for `rasa NLU <https://github.com/rasahq/rasa_nlu>`_. Handles right-to-left and part-of-word marking.

* `brat <http://brat.nlplab.org/>`_ [Python, JavaScript] {`MIT`_} - An online environment for collaborative text annotation. Does not support right-to-left. `Repository here <https://github.com/nlplab/brat>`_.

* `openNLP <https://opennlp.apache.org/>`_ [Java] {`Apache License 2.0`_} - OpenNLP has a tagging tool.

* `opeNER <http://www.opener-project.eu/>`_ [Ruby, HTML, Java, Python] - opeNER has a tagging tool.

* `pybossa <http://pybossa.com/>`_ [Python] {`AGPL-3.0`_} - A framework for crowdsourcing of data analysis and enrichment tasks. `GitHub <https://github.com/Scifabric/pybossa>`_.

* `TextThrasher <https://github.com/Goodly/TextThresher>`_ [JavaScript, Python] - A crowdsourced text annotator. Built with React and Redux (possibly also with pybossa). 

* `SHEBANQ <https://shebanq.ancient-data.org/>`_ - System for HEBrew Text: ANnotations for Queries and Markup. SHEBANQ is an online environment for studying the Hebrew Bible.

* `doccano <https://github.com/doccano/doccano>`_ {MIT} - an open source text annotation tool for humans. It provides annotation features for text classification, sequence labeling and sequence to sequence tasks. So, you can create labeled data for sentiment analysis, named entity recognition, text summarization and so on.

**Evaluation**
============

Benchmark Datasets
-----------------------------------

* `Hebrew SimLex-999 <https://drive.google.com/drive/folders/0B_pyA_IW4g-jTlJzOHlSWVZWbTQ>`_ - A Hebrew version of the `Simlex-999 <https://fh295.github.io/simlex.html>`_ resource for the evaluation of models that learn the meaning of words and concepts. A copy can also be found in the `Attract-Repel repository <https://github.com/nmrksic/attract-repel>`_. Another copy is found in `this repository <https://github.com/NLPH/NLPH_Resources/tree/master/linguistic_resources/other/hebrew_simlex-999>`_.

Evaluation Metrics
--------------------------------

**Labs & Researchers**
=====================

Academia
--------------------

* Bar Ilan University:

  * `The ONLP Lab <https://nlp.biu.ac.il/~rtsarfaty/onlp>`_

    * `Prof. Reut Tsarfaty <https://nlp.biu.ac.il/~rtsarfaty/>`_ - Head of the ONLP Lab.

    * Dan Bareket - Data Scientist.
 
  * `The Natural Language Processing Lab at Bar Ilan University <http://u.cs.biu.ac.il/~nlp/>`_ [`Twitter <https://twitter.com/biunlp/>`_]:

    * `Prof. Ido Dagan <http://u.cs.biu.ac.il/~dagan/>`_
  
    * `Prof. Yoav Goldberg <http://u.cs.biu.ac.il/~yogo/>`_
  
    * `Graduate Students & Researchers <http://u.cs.biu.ac.il/~nlp/people/graduate-students-researchers/>`_

  * `Prof. Moshe Koppel <https://www1.biu.ac.il/indexE.php?id=8041&pt=30&cPath=7702>`_
  
  * `Dr. Avi Shmidman <http://dsi.biu.ac.il/team/dr-avi-shmidman/>`_
  
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

  * `Prof. Joseph (Yossi) Keshet <http://u.cs.biu.ac.il/~jkeshet/>`_
    
* The Hebrew University of Jerusalem:

  * `Prof. Ronen Feldman <http://pluto.huji.ac.il/~rfeldman/>`_ - Feldman's main areas of research are natural language processing, entity extraction and text relations, text sentiment analysis, and language processing for algorithmic trading. He is one of the founder of the discipline of text mining.

  * `Prof. Ari Rappoport <http://www.cs.huji.ac.il/~arir/>`_ - With his main contribution in the area of Neuroscience, where he developed a comprehensive theory of the brain, Prof. Rappoport's Computer Science area of interest is language (Computational Linguistics, Natural Language Processing (NLP)), from cognitive science and machine learning perspectives.

  * `Prof. Omri Abend <http://www.cs.huji.ac.il/~oabend/>`_ - My fields of interest are Computational Linguistics and Natural Language Processing. Specifically, I conduct research on semantic (meaning) representation from a computational perspective. My research is tightly linked to statistical learning, language technology (such as Machine Translation and Information Extraction), and computational modeling of child language acquisition.
  
  * `Prof. Dafna Shahaf <http://www.cs.huji.ac.il/~dshahaf/>`_ - Prof. Shahaf's research focuses on helping people make sense of the world. She designs algorithms that help people understand the underlying structure of complex topics, and connect the dots between different pieces. She also likes to formalize intuitive notions; see recent work on Computational Humor.

  * `The Neurolinguistics Laboratory at the Edmond and Lily Safra Center for Brain Sciences (ELSC) <https://www.grodzinskylab.com/>`_:

    * `Prof. Yosef Grodzinsky <https://en.cognitive.huji.ac.il/people/yosef-grodzinsky?ref_tid=3172>`_ - Research fields: functional anatomy of language, linguistic theory (syntax, semantics), language acquisition, aphasia, individual variation.

Non-Profit
--------------------

* `Allen Institute for AI - Israel <https://allenai.org/ai2-israel>`_

  * Prof. Yoav Goldberg
  
  * Dr. Jonathan Berant

Industry
--------------------

Researching natural language processing in the industry? Open a pull request and add yourself here now!

**Courses, Presentations and Meetups**
===================================

Meetup & Discussion Groups
----------------------------------------

* `The NLPH Facebook Group <https://www.facebook.com/groups/157877988136954/>`_

* `The Israeli Natural Language Processing Meetup <https://www.meetup.com/The-Israeli-Natural-Language-Processing-Meetup/>`_

Specific Talks
----------------------------------------

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
.. _CC0 1.0: https://creativecommons.org/publicdomain/zero/1.0/
.. _CC BY-NC-ND 4.0: https://creativecommons.org/licenses/by-nc-nd/4.0/
.. _CC-BY-SA 4.0: https://creativecommons.org/licenses/by-sa/4.0/legalcode
.. _Custom Terms of Use: http://web.nli.org.il/sites/JPress/English/about/Pages/tems-of-use.aspx
.. _GPLv2: https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html
.. _Open: https://opendefinition.org/od/2.1/en/
