Hebrew NLP Models, Tools, Commercial and Online Services
########################################################

.. contents::

.. section-numbering::

Models and Tools
================

Models and Tools by Task
------------------------

Text Preprocessing and Morphological Analysis
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Tokenization
~~~~~~~~~~~~

* `Yonti Levin's Hebrew Tokenizer <https://github.com/YontiLevin/Hebrew-Tokenizer>`_ [Python] {`MIT`_} - A very simple python tokenizer for Hebrew text. No batteries included - No dependencies needed! 

* `Hebrew Tokenizer <https://github.com/eyaler/hebrew_tokenizer?fbclid=IwAR1vbBpU9SOzQ71ZaxAjyBwNVuyhuYs3dMQsAUlZXCINy4TSg2BVWvoBARc>`_ {?} - Eyal Gruss's Hebrew tokenizer. A field-tested Hebrew tokenizer for dirty texts (ben-yehuda project, bible, cc100, mc4, opensubs, oscar, twitter) focused on multi-word expression extraction. 

* `RFTokenizer <https://github.com/amir-zeldes/RFTokenizer>`_ [Python] {`Apache License 2.0`_} - A highly accurate morphological segmenter to break up complex word forms

Transliteration
~~~~~~~~~~~~~~~~~~~~~~~~

* `TaatikNet <https://github.com/morrisalp/taatiknet>`_ {`CC BY-SA 3.0 <https://creativecommons.org/licenses/by-sa/3.0/>`_} - Sequence-to-sequence learning for Hebrew transliteration (converting between Hebrew text and Latin transliteration). See also `post <https://towardsdatascience.com/taatiknet-sequence-to-sequence-learning-for-hebrew-transliteration-4c9175a90c23>`_ and an `interactive demo <https://huggingface.co/spaces/malper/taatiknet>`_.


Morphological Segmentation
~~~~~~~~~~~~~~~~~~~~~~~~~~

* `RFTokenizer <https://github.com/amir-zeldes/RFTokenizer>`_ [Python] {`Apache License 2.0`_} - A highly accurate morphological segmenter to break up complex word forms

* `HebPipe <https://github.com/amir-zeldes/HebPipe>`_ [Python] {`Apache License 2.0`_} - End-to-end pipeline for Hebrew NLP using off the shelf tools, including morphological analysis, tagging, lemmatization, parsing and more.

* `YAP morpho-syntactic parser <https://github.com/OnlpLab/yap>`_ [Go] {`Apache License 2.0`_} - Morphological Analysis, disambiguation and dependency Parser. Morphological Analyzer relies on the BGU Lexicon. [`original repository <http://github.com/habeanf/yap>`_] `Demo <https://nlp.biu.ac.il/~rtsarfaty/onlp/hebrew/>`_

* `DictaBERT-seg <https://huggingface.co/dicta-il/dictabert-seg?fbclid=IwAR0wgvGU_nYgKbRNfyN59NUdtpzP1RtqfNPp-pPqKL6xWQIlonSz2apGtiw>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - A fine-tuned model for prefix segmentation task.

* `OtoBERT <https://huggingface.co/dicta-il/otobert>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - Designed specifically for identifying suffixed verbal forms in Modern Hebrew.


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

* `DictaBERT-morph <https://huggingface.co/dicta-il/dictabert-morph?fbclid=IwAR1Z-SCa645l_Yw_JtTt9ksoHT8NgxTjoGMzVKT0OWcoU6j2n5ALLOL_-2w>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - A fine-tuned model for mophological tagging task.

* `OtoBERT <https://huggingface.co/dicta-il/otobert>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - Designed specifically for identifying suffixed verbal forms in Modern Hebrew.


Part-of-speech (POS) Tagging
~~~~~~~~~~~~~~~~~~~~~~~~~~~~

* `AlephBERT <https://huggingface.co/onlplab/alephbert-base?fbclid=IwAR3gP64XJEDvRcJ9UQm2DIttOnv7Y-6I5R-t7djj9TTTsXlcIA8qyx8PzSQ>`_ {`Apache License 2.0`_} - a large pre-trained language model for Modern Hebrew, publicly available, pre-training on Oscar, Texts of Hebrew tweets, all of Hebrew Wikipedia, published by the OnlpLab team. This model obtains state-of-the- art results on the tasks of segmentation and Part of Speech Tagging. Github: https://github.com/OnlpLab/AlephBERT

* `AlephBERTGimmel <https://arxiv.org/pdf/2211.15199.pdf>`_ {`CC0 1.0`_} - a new Hebrew pre-trained language model, trained on the same dataset as the previous SOTA Hebrew PLM AlephBERT, consisting od approximiately 2 billion words of text but with a substantially increased vocabulary of 128,000 word pieces. Published as a collaboration of the OnlpLab team and Dicta. Github: https://github.com/Dicta-Israel-Center-for-Text-Analysis/alephbertgimmel

* `TavBERT <https://github.com/omrikeren/TavBERT>`_ {`MIT`_} - a BERT-style masked language model over character sequences, published by Omri Keren, Tal Avinari, Prof. Reut Tsarfaty and Dr. Omer Levy.

* `The MILA Morphological Analysis Tool <http://www.mila.cs.technion.ac.il/tools_analysis.html>`_ [?] {`GPLv3`_} - Takes as input undotted Hebrew text (formatted either as plain text or as tokenized XML following MILA's standards). The Analyzer then returns, for each token, all the possible morphological analyses of the token, reflecting part of speech, transliteration, gender, number, definiteness, and possessive suffix. Free for non-commercial use. (temporarily down)

* `HebPipe <https://github.com/amir-zeldes/HebPipe>`_ [Python] {`Apache License 2.0`_} - End-to-end pipeline for Hebrew NLP using off the shelf tools, including morphological analysis, tagging, lemmatization, parsing and more

* `YAP morpho-syntactic parser <https://github.com/OnlpLab/yap>`_ [Go] {`Apache License 2.0`_} - Morphological Analysis, disambiguation and dependency Parser. Morphological Analyzer relies on the BGU Lexicon. [`original repository <http://github.com/habeanf/yap>`_] `Demo <https://nlp.biu.ac.il/~rtsarfaty/onlp/hebrew/>`_

* `DictaBERT-morph <https://huggingface.co/dicta-il/dictabert-morph?fbclid=IwAR1Z-SCa645l_Yw_JtTt9ksoHT8NgxTjoGMzVKT0OWcoU6j2n5ALLOL_-2w>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - A fine-tuned model for mophological tagging task.


Stemming and Lemmatization
~~~~~~~~~~~~~~~~~~~~~~~~~~

* `HebPipe <https://github.com/amir-zeldes/HebPipe>`_ [Python] {`Apache License 2.0`_} - End-to-end pipeline for Hebrew NLP using off the shelf tools, including morphological analysis, tagging, lemmatization, parsing and more.

* `YAP morpho-syntactic parser <https://github.com/OnlpLab/yap>`_ [Go] {`Apache License 2.0`_} - Morphological Analysis, disambiguation and dependency Parser. Morphological Analyzer relies on the BGU Lexicon. [`original repository <http://github.com/habeanf/yap>`_] `Demo <https://nlp.biu.ac.il/~rtsarfaty/onlp/hebrew/>`_

* `OtoBERT <https://huggingface.co/dicta-il/otobert>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - Designed specifically for identifying suffixed verbal forms in Modern Hebrew.

Spell Checking and Correction
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

* `Shtey Shekel <https://he.wikipedia.org/wiki/%D7%95%D7%99%D7%A7%D7%99%D7%A4%D7%93%D7%99%D7%94:%D7%AA%D7%97%D7%96%D7%95%D7%A7%D7%94/%D7%A9%D7%AA%D7%99_%D7%A9%D7%A7%D7%9C>`_ {`MIT`_} - Wikiproject for correcting grammar mistakes. (Heuristic) positive annotions can be derived from  `query <https://quarry.wmflabs.org/query/21957>`_. 

* `Hspell <http://hspell.ivrix.org.il/>`_ [?] {`AGPL-3.0`_} - Free Hebrew linguistic project including spell checker and  morphological analyzer. `HspellPy <https://github.com/eranroz/HspellPy/>`_ [Python] {`AGPL-3.0`_} - Python wrapper for Hspell.

Diacritization/Vocalization
~~~~~~~~~~~~~~~~~~~~~~~~~~~

* `Nakdan <https://nakdan.dicta.org.il/>`_ (`Paper <https://aclanthology.org/2020.acl-demos.23.pdf>`_) - Tool for Automatic and semi-automatic Nikud for Hebrew texts. Avi Shmidman, Shaltiel Shmidman, Moshe Koppel, and Yoav Goldberg. 2020. Nakdan: Professional Hebrew diacritizer. In Proceedings of the 58th Annual Meeting of the Association for Computational Linguistics: System Demonstrations, pages 197–203, Online. Association for Computational Linguistics.

* `Nakdimon <https://www.nakdimon.org/>`_ (`Paper <https://arxiv.org/abs/2105.05209/>`_ , `code <https://github.com/elazarg/nakdimon/>`_ ,  `data <https://github.com/elazarg/hebrew-diacritize/>`_) - Hebrew diacritizer. Elazar Gershuni and Yuval Pinter: Restoring Hebrew Diacritics Without a Dictionary. `Demo in Replicate <https://replicate.com/elazarg/nakdimon/>`_.

* `UNIKUD <https://dagshub.com/morrisalp/unikud>`_ {`MIT`_} - Morris Alper's open-source tool for adding vowel signs (Nikud) to Hebrew text, uses no rule-based logic, built with a CANINE transformer network. An interactive demo is available at https://huggingface.co/spaces/malper/unikud Blog post: https://towardsdatascience.com/unikud-adding-vowels-to-hebrew-text-with-deep-learning-powered-by-dagshub-56d238e22d3f .

* `Hebrew OCR with Nikud <https://www.cs.bgu.ac.il/~elhadad/hocr/>`_ [Python] {?} - A program to convert Hebrew text files (without Nikud) to text files with the correct Nikud. Developed by Adi Oz and Vered Shani.

* `Hebrew Punctuation Model <https://huggingface.co/verbit/hebrew_punctuation>`_ {`Apache License 2.0`_} - A fine-tuned version of AlephBERT, designed to restore punctuation in Hebrew spoken language transcripts. It is specifically trained as a post-processing step for Automatic Speech Recognition (ASR) outputs, where punctuation is often missing in raw transcriptions.


Stopwords Removal
~~~~~~~~~~~~~~~~~~~~~~~~

Language modeling
~~~~~~~~~~~~~~~~~~~~~~~~

* `Legal-HeBERT <https://github.com/avichaychriqui/Legal-HeBERT?fbclid=IwAR3sFizNJEfPIXm0Agg5HpELUm49v11kfksjes72-Q-9CxMwv8hdR8I5ahg>`_ {?} - a BERT model for Hebrew legal and legislative domains. It is intended to improve the legal NLP research and tools development in Hebrew. Avichay Chriqui, Dr. Inbal Yahav Shenberger and Dr. Ittai Bar-Siman-Tov release two versions of Legal-HeBERT: `The first version <https://huggingface.co/avichr/Legal-heBERT_ft?fbclid=IwAR3K16AoiBYtZlpf2C6TjSstOv7ZuaWLIwCOq93_fRV6bGA3ssDA8NfuHmY>`_ is a fine-tuned model of HeBERT applied on legal and legislative documents. `The second version <https://huggingface.co/avichr/Legal-heBERT?fbclid=IwAR3r-QUCMSdzCoAjomifrk2hCPX7kvGJk47raHHfqBI511QXXchaOkL8rFo>`_ uses HeBERT's architecture guidlines to train a BERT model from scratch.

Text Normalization
~~~~~~~~~~~~~~~~~~~~~~~~

* `NeMo-text-processing <https://github.com/verbit-ai/NeMo-text-processing>`_ {`Apache License 2.0`_} - Verbit extended NeMo-text-processing python package with WFST-based Hebrew inverse text normalization (ITN). ITN is a part of Automatic Speech Recognition (ASR) post-processing pipeline and can be used to convert spoken to written form to improve text readability.


Text Analysis
^^^^^^^^^^^^^^^

Question Answering (QA)
~~~~~~~~~~~~~~~~~~~~~~~~

* `HeRo <https://huggingface.co/HeNLP/HeRo>`_ {?} - RoBERTa based language model for Hebrew; Fine-tuned for sentiment analysis, named entity recognition and question answering.

* `Webiks Hebrew RAGbot KolZchut QA Embedder <https://drive.google.com/file/d/1eFAddJWBWDvoid-Gyn6ZT5jPwf-vNPI8/view>`_ {`MIT`_} - A fine-tuned embedding model for information retrieval in Hebrew compatible with the sentence-transformers library, specifically tailored for QA Retrieval on the Kol-Zchut (כל זכות) website. This is a fine-tuned model based on the me5-large model.

* `Webiks Hebrew RAGbot Trainer <https://github.com/NNLP-IL/Webiks-Hebrew-RAGbot-Trainer>`_ {`MIT`_} - The code for fine-tuning an me5-large model using the sentence-transformers library, specifically tailored for Q&A Retrieval on the Kol-Zchut (כל זכות) website pages. However, the code can be adapted for various datasets, or even different models within the sentence-transformers framework.

* `Webiks-Hebrew-RAGbot <https://github.com/NNLP-IL/Webiks-Hebrew-RAGbot>`_ {`MIT`_} - This project is a search engine that uses machine learning models and Elasticsearch to provide advanced document retrieval.


Information Rerieval
~~~~~~~~~~~~~~~~~~~~~~~~

* `Webiks Hebrew RAGbot KolZchut QA Embedder <https://drive.google.com/file/d/1eFAddJWBWDvoid-Gyn6ZT5jPwf-vNPI8/view>`_ {`MIT`_} - A fine-tuned embedding model for information retrieval in Hebrew compatible with the sentence-transformers library, specifically tailored for QA Retrieval on the Kol-Zchut (כל זכות) website. This is a fine-tuned model based on the me5-large model.

* `Webiks Hebrew RAGbot Trainer <https://github.com/NNLP-IL/Webiks-Hebrew-RAGbot-Trainer>`_ {`MIT`_} - The code for fine-tuning an me5-large model using the sentence-transformers library, specifically tailored for Q&A Retrieval on the Kol-Zchut (כל זכות) website pages. However, the code can be adapted for various datasets, or even different models within the sentence-transformers framework.

* `Webiks-Hebrew-RAGbot <https://github.com/NNLP-IL/Webiks-Hebrew-RAGbot>`_ {`MIT`_} - This project is a search engine that uses machine learning models and Elasticsearch to provide advanced document retrieval.


Sentiment Analysis
~~~~~~~~~~~~~~~~~~~~~~~~

* `HeRo <https://huggingface.co/HeNLP/HeRo>`_ {?} - RoBERTa based language model for Hebrew; Fine-tuned for sentiment analysis, named entity recognition and question answering.

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

* `Summarization Experiments for Hebrew <https://medium.com/@imvladikon/sequence-to-sequence-learning-for-hebrew-abstractive-summarization-86e3d0d4e8a4>`_ {?} - sequence-to-sequence models (mT5 models) training for Hebrew summarization.


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
~~~~~~~~~~~~~~~~~~~~~~~

Discourse Analysis
~~~~~~~~~~~~~~~~~~~~~~~~

Dialogue Modeling
~~~~~~~~~~~~~~~~~~~~~~~~

Information Extraction
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Named Entity Recognition (NER)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

* `HeRo <https://huggingface.co/HeNLP/HeRo>`_ {?} - RoBERTa based language model for Hebrew, present state-of-the-art results on sentiment analysis, named entity recognition and question answering.

* `AlephBERT <https://huggingface.co/onlplab/alephbert-base?fbclid=IwAR3gP64XJEDvRcJ9UQm2DIttOnv7Y-6I5R-t7djj9TTTsXlcIA8qyx8PzSQ>`_ {`Apache License 2.0`_} - a large pre-trained language model for Modern Hebrew, publicly available, pre-training on Oscar, Texts of Hebrew tweets, all of Hebrew Wikipedia, published by the OnlpLab team. This model obtains state-of-the-art results on the tasks of segmentation, Part of Speech Tagging, Named Entity Recognition, and Sentiment Analysis. Github: https://github.com/OnlpLab/AlephBERT

* `AlephBERTGimmel <https://arxiv.org/pdf/2211.15199.pdf>`_ {`CC0 1.0`_} - a new Hebrew pre-trained language model, trained on the same dataset as the previous SOTA Hebrew PLM AlephBERT, consisting od approximiately 2 billion words of text but with a substantially increased vocabulary of 128,000 word pieces. Published as a collaboration of the OnlpLab team and Dicta. Github: https://github.com/Dicta-Israel-Center-for-Text-Analysis/alephbertgimmel

* `TavBERT <https://github.com/omrikeren/TavBERT>`_ {`MIT`_} - a BERT-style masked language model over character sequences, published by Omri Keren, Tal Avinari, Prof. Reut Tsarfaty and Dr. Omer Levy.

* `Neural Modeling for Named Entities and Morphology (NEMO2) <https://github.com/OnlpLab/NEMO>`_ {`Apache License 2.0`_} - OnlpLab's code and models for neural modeling of Hebrew NER. Described in the TACL paper `Neural Modeling for Named Entities and Morphology (NEMO2) <https://direct.mit.edu/tacl/article/doi/10.1162/tacl_a_00404/107206/Neural-Modeling-for-Named-Entities-and-Morphology>`_.

* `MDTEL <https://github.com/yonatanbitton/mdtel?fbclid=IwAR3Npi5lG4hGy1dcQwdr2RWuEFUArjmQ_bo3FXQ9KhYZUpK5OO67-aT-e5k>`_ {?} - Yonatan Bitton's code that recognizes medical entities in a Hebrew text.

* `HebSpacy <https://github.com/8400TheHealthNetwork/HebSpacy>`_ {`MIT`_} - A custom spaCy pipeline for Hebrew text including a transformer-based multitask NER model that recognizes 16 entity types in Hebrew, including GPE, PER, LOC and ORG.

* `HebSafeHarbor <https://github.com/8400TheHealthNetwork/HebSafeHarbor>`_ {`MIT`_} - A de-identification toolkit for clinical text in Hebrew. `Demo <https://hebsafeharbor-demo.azurewebsites.net/>`_   

* `HebSafeHarbor_Clalit_Validation <https://github.com/ChenMordehai/HebSafeHarbor_Clalit_Validation_Improvment>`_ {`MIT`_} - A de-identification toolkit for clinical text in Hebrew. An improved version of Microsoft's HebSafeHarbor project.   



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

* `HebTTS <https://pages.cs.huji.ac.il/adiyoss-lab/HebTTS/>`_ [Python] {`Apache License 2.0`_} - A language modeling Diacritics (`Niqqud’) free Text-To-Speech (TTS) approach, for the task of Hebrew TTS. The model operates on discrete speech representations and is conditioned on a word-piece tokenizer.

Text-to-Speech (TTS)
~~~~~~~~~~~~~~~~~~~~~~~~

* `HebTTS <https://pages.cs.huji.ac.il/adiyoss-lab/HebTTS/>`_ [Python] {`Apache License 2.0`_} - A language modeling Diacritics (`Niqqud’) free Text-To-Speech (TTS) approach, for the task of Hebrew TTS. The model operates on discrete speech representations and is conditioned on a word-piece tokenizer.


Speech-to-Text (STT)
~~~~~~~~~~~~~~~~~~~~~~~~~

* `The Automatic Hebrew Transcriber <http://hebrew-transcriber.online/>`_ - Automatically transcribes text from Hebrew audio and video files. (down, link not found)

* `ivrit.ai Free and Open Transcription Tool <https://transcribe.ivrit.ai/>`_ - This website enables users to transcribe easily Hebrew audio files for free using ivrit.ai models, fostering accessibility and innovation in language technology.

* `ivrit-ai-whisper-large-v3-turbo-ct2 <https://huggingface.co/ivrit-ai/whisper-large-v3-turbo-ct2?fbclid=IwY2xjawIansFleHRuA2FlbQIxMAABHTx1sne4jKPy02QVVrowEbKt_NJX7c8jjGu_Cr1WhF5QPXZSm8UxZOjoEw_aem_s8wvjt3ssCFBddtanYNjbQ>`_ {`Apache License 2.0`_} - This is ivrit.ai's faster-whisper model, based on the ivrit-ai/whisper-large-v3-turbo Whisper model. Training data includes 295 hours of volunteer-transcribed speech from the ivrit-ai/crowd-transcribe-v5 dataset, as well as 93 hours of professional transcribed speech from other sources.



Optical Character Recognition (OCR)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

* `Text-Fabric <https://annotation.github.io/text-fabric/tf/>`_ [Python] {`CC BY-NC 4.0`_} - A Python package for browsing and processing ancient corpora, focused on the Hebrew Bible Database.

* `Hebrew OCR with Nikud <https://www.cs.bgu.ac.il/~elhadad/hocr/>`_ [Python] {?} - A program to convert Hebrew text files (without Nikud) to text files with the correct Nikud. Developed by Adi Oz and Vered Shani.

Language Generation
~~~~~~~~~~~~~~~~~~~~~~~~

* `HebMorph <https://github.com/synhershko/HebMorph>`_ [Lucene] {`AGPL-3.0`_} - An open-source effort to make Hebrew properly searchable by various IR software libraries. Includes Hebrew Analyzer for Lucene. 

* `Hebrew-Mistral-7B-200K <https://huggingface.co/yam-peleg/Hebrew-Mistral-7B-200K?fbclid=IwZXh0bgNhZW0CMTAAAR0WLosQ-lH6djTjyJt8Dh_OM6UeGviNgRdOADqzNZrzpM4mct6LERVuwnI_aem_AbrocYENzx8vXw1tXH84aMSxE-r6pURLuwPXgxTdxLZMYfyK1uudydCSpa19_Z5uOEMn8mRtENFI-cof8LHHf3m8>`_ {`Apache License 2.0`_} - An open-source Large Language Model (LLM) pretrained in Hebrew and English and created by yam Peleg. It has been pretrained with 7B billion parameters and with 200K context length, based on Mistral-7B-v1.0 from Mistral. It has an extended hebrew tokenizer with 64,000 tokens and is continuesly pretrained from Mistral-7B on tokens in both English and Hebrew. The resulting model is a powerful general-purpose language model suitable for a wide range of natural language processing tasks, with a focus on Hebrew language understanding and generation.

* `Dicta-LM 2.0 Collection <https://huggingface.co/collections/dicta-il/dicta-lm-20-collection-661bbda397df671e4a430c27>`_ {`Apache License 2.0`_} - Generative language models specifically optimized for Hebrew.

Machine Translation
~~~~~~~~~~~~~~~~~~~~~~~~

* `word2word <https://github.com/Kyubyong/word2word>`_ {`Apache License 2.0`_} - Easy-to-use Python interface for accessing top-k word translations and for building a new bilingual lexicon from a custom parallel corpus. 

* `HeArBERT <https://huggingface.co/aviadrom/HeArBERT>`_ {?} - A bilingual BERT for Arabic and Hebrew, pretrained on the respective parts of the OSCAR corpus.


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

* `DictaBERT <https://huggingface.co/dicta-il/dictabert?fbclid=IwAR3EeeOnqM3NoKw1vRwT1NT5unv1dDs9woby0NExeQnjyIpnstfNrM6w59A>`_ {`CC BY 4.0 <https://creativecommons.org/licenses/by/4.0/>`_} - A  base model pretrained with the masked-language-modeling objective.

* `Criminal Sentence Classification <https://github.com/Maximbrg/legalAI>`_ {OpenRAIL} - This project classifies key aspects of criminal cases within the Israeli legal framework. The project leverages a few-shot learning approach for accurate sentence classification relevant to sentencing decisions.

* `MsBERT <https://huggingface.co/dicta-il/MsBERT>`_ {`CC BY 4.0`_} - A pretrained dedicated BERT model, dubbed MsBERT (short for: Manuscript BERT), designed from the ground up to handle Hebrew manuscript text. MsBERT substantially outperforms all existing Hebrew BERT models regarding the prediction of missing words in fragmentary Hebrew manuscript transcriptions in multiple genres, as well as regarding the task of differentiating between quoted passages and exegetical elaborations. We provide MsBERT for free download and unrestricted use, and we also provide an interactive and user-friendly website to allow manuscript scholars to leverage the power of MsBERT in their scholarly work of reconstructing fragmentary Hebrew manuscripts.


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

Commercial and Online Services
==============================

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
