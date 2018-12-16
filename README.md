[![Build Status](https://travis-ci.com/vladbbb/mathApp.svg?branch=master)](https://travis-ci.com/vladbbb/mathApp)

[Materials](https://github.com/hendrikhiir/Lexicon-Pipeline)

## 10.12.2018 Release Notes (Iteration 4)
This document gives an overview of the product state as of 10.12.2018 (end of 4th iteration).
### About This Release
* This is the release of tested version of the product. All [functional requirements](https://github.com/vladbbb/mathApp/wiki/Functional-Requirements) are implemented and [non-functional requirements](https://github.com/vladbbb/mathApp/wiki/Non-Functional-Requirements) are [tested](https://github.com/vladbbb/mathApp/wiki/Acceptance-Testing-&-NF-Requirements-Verification) with help of target audience.
### Fixed Bugs & Limitations
* Application can be installed to devices running on lower Android version than 7.0.0. This was done by adding V1 (Jar Signature) to release APK file. Related issues: [#40](https://github.com/vladbbb/mathApp/issues/40) [#41](https://github.com/vladbbb/mathApp/issues/41) [#42](https://github.com/vladbbb/mathApp/issues/42)
* Quadratic equation calculator and Interest calculator no longer crash when trying to enter -/. in Samsung devices or . as the first symbol in any devices. 
Related issues: [#16](https://github.com/vladbbb/mathApp/issues/16) [#18](https://github.com/vladbbb/mathApp/issues/18) [#41](https://github.com/vladbbb/mathApp/issues/41) [#42](https://github.com/vladbbb/mathApp/issues/42) [#56](https://github.com/vladbbb/mathApp/issues/56) [#57](https://github.com/vladbbb/mathApp/issues/57)
* Navigating to definition with search field always opens correct definition. Related issue: [#22](https://github.com/vladbbb/mathApp/issues/22)
* Bug reports icon is removed from pages that you cannot report (main page, licence). Related issues: [#33](https://github.com/vladbbb/mathApp/issues/33) [#34](https://github.com/vladbbb/mathApp/issues/34)
* Bug report pages have better alignment, labels and enhanced landscape mode. Related issues: [#35](https://github.com/vladbbb/mathApp/issues/35) [#62](https://github.com/vladbbb/mathApp/issues/62)
* It is now possible to send bug reports with Estonian letters (õ, ä, ö, ü). Related issue: [#33](https://github.com/vladbbb/mathApp/issues/33)
* Definitions are now better visible in tablets after adding zoom functionality. Related issues: [#40](https://github.com/vladbbb/mathApp/issues/40) [#61](https://github.com/vladbbb/mathApp/issues/61)
### New Features
* Zoom is available in definitions which makes definitions easier to see in big screens. Related issue: [#55](https://github.com/vladbbb/mathApp/issues/55)
* New search field design which is easier to click on. Related issues: [#21](https://github.com/vladbbb/mathApp/issues/21) [#26](https://github.com/vladbbb/mathApp/issues/26)
* Previous search algorithm that searched similar words is replaced to find correct only matching definitions. Related issues: [#22](https://github.com/vladbbb/mathApp/issues/22) [#55](https://github.com/vladbbb/mathApp/issues/55)
* Bug reports system now sends reports to [GitHub](https://github.com/Teemant/minilex/issues/168). Related issues: [#33](https://github.com/vladbbb/mathApp/issues/33) [#34](https://github.com/vladbbb/mathApp/issues/34)
* Bug reports system gives notification when trying to submit anything without internet connection. Related issues: [#33](https://github.com/vladbbb/mathApp/issues/33) [#34](https://github.com/vladbbb/mathApp/issues/34)
* Bug reports system redirects to definition and gives confirmation after submitting the report. Related issue: [#67](https://github.com/vladbbb/mathApp/issues/67)
* Bug reports icon is replaced after testers found it to be too similar with information button. Related issues: [#40](https://github.com/vladbbb/mathApp/issues/40) [#41](https://github.com/vladbbb/mathApp/issues/41) [#66](https://github.com/vladbbb/mathApp/issues/66)
* [Pipeline](https://github.com/hendrikhiir/Lexicon-Pipeline/blob/master/pipeline.py) to automatize generating suitable assets folders after exporting edited definitions to HTML in LyX. Related issues: [#36](https://github.com/vladbbb/mathApp/issues/36) [#63](https://github.com/vladbbb/mathApp/issues/63)
* Page about Open-source software licence introduction is added. Related issue: [#43](https://github.com/vladbbb/mathApp/issues/43)
