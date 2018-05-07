# Hebrew Verb Lists from Eran Tomer's Master thesis

This folder contains Hebrew verb lists created as part of Eran Tomer's (erantom@gmail.com) Master Thesis,
performed at Ben-Gurion University under the supervision of Prof. Michael Elhadad, and released under the [CC-BY 4.0 license](https://creativecommons.org/licenses/by/4.0/).

Downloadable PDF:
http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.357.7101&rep=rep1&type=pdf

> We present a comprehensive generation mechanism, 
> which produces vocalized and morphologically tagged Hebrew verbs given a non-vocalized verb 
> in base-form and an indication of which pattern the verb follows. 
> Given a classification of verbs into about 300 distinct clusters, 
> our generation mechanism generates fully vocalized inflected verbal forms. 
> Using our implementation of this method, we have produced a lexical resource for modern Hebrew 
> that includes all inflected forms for over 4,000 distinct verbs. 
> This database contains about 250,000 fully inflected and fully vocalized verbal forms, 
> with an accuracy estimate of over 99.4.


## List of Files
* TheVerbIndex.csv - a manually constructed list including over 4k base-forms of
verbs (deficiently spelled verbs in their past, masculine, singular, 3rd person form). Verbs
in the list are non-vocalized, but do include Shin dots, and a corresponding inflection table
indicator.

  * Variables in the file:
    * base_form - base-form of verb
    * pattern_1, pattern_2 - patterns (Binyanim) for the verb, according to this list:
      * A - Paal
      * B - Nifal
      * C - Piel
      * D - Pual
      * E - Hitpael
      * F - Hifil
      * G - Hufal

* InflectedVerbsExtended.csv - an automatically generated 250k dataset of inflected and
fully vocalized verbs along with their corresponding morphological attributes
(Time+Person+Gender+Number+Spelling):
  * Variables in the file:
    * pattern of the verb
    * table_number
    * vocalized_inflection - the inflected verb with diacritics
    * morphology - including Time+Person+Gender+Number+Spelling
    * base_form - of verb (vocalized past, masculine, singular, 3rd person form of verb).



