[![Build Status](https://travis-ci.com/vladbbb/mathApp.svg?branch=master)](https://travis-ci.com/vladbbb/mathApp)

## 15.10.2018 Release Notes (Iteration 2)
This document gives an overview of the product state as of 15.10.2018 (end of 2nd iteration).
### About This Release
In this release, calculators are implemented and tested (functional requirements #5 and #6), and left sidebar tree view menu is constantly available through menu button (functional requirements #3 and #9).
### Upgrades
The following upgrades are present in this release:
* Previous menu is replaced with expandableListView menu
* Menu option remains visible while clicking on (currently blank) definition names
* Opening menu does not affect current state of application (current page remains opened while clicking on menu button)
### New Features
The following features appear in this release:
* Quadratic Calculator
* Interest Calculator
### Known Bugs & Limitations
* APK installation might not work properly on devices with Android version < 6.0 (tested on tablets with version 4.0.3 and 5.0.1)
* Some devices might have layout problems when using calculators in landscape mode (properly tested only with Nexus and Pixel devices)
* Calculators open in new view instead of continuing being part of the menu (back button brings back to main screen)
* Upper right-side menu is redundant (has options "Settings" and "Ruutvõrrandi Lahendaja", but they are not clickable)
### Next Release
For the next release (12.11.2018) we have planned the following upgrades:
* Opening calculators will keep the menu bar instead of opening in separate view
* Improved user interface design

For the next release (12.11.2018) we have planned the following features:
* Definitions are added to corresponding menu categories and sub-categories ("Hello World!" text is currently displayed instead)
* Search field (TF-IDF and cosine similarity algorithms)
* Favorites system: add definitions to folder "Lemmikud"
* Send bug reports (via GitHub API)