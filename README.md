[![Build Status](https://travis-ci.com/vladbbb/mathApp.svg?branch=master)](https://travis-ci.com/vladbbb/mathApp)

## 12.11.2018 Release Notes (Iteration 3)
This document gives an overview of the product state as of 12.11.2018 (end of 3rd iteration).
### About This Release
In this release, the main implemented functionality includes search system for definitions we added (functional requirements 7 and 8) and way of sending bug reports (functional requirement 12). Sending bugs as GitHub issues via API is still on development. Favorites system is postponed due bigger priorities discussed with the client (see [notes](https://docs.google.com/document/d/1Wpniv_zZG24TU9w6vMISmeK86o5STdCChBJv2FH7XPU/edit))
### Fixed Bugs and Limitations
* Opening calculators keeps the menu bar instead of opening in separate view
* Application name is corrected from math_app to Matemaatika Minileksikon
* Redundant right-side menu is removed
### Upgrades and New Features
The following upgrades are present in this release:
* Menu style and UI are improved, color-scheme is gray and orange
* Expandable menu is tested, each category has only relevant fragments
* App has relevant logo and icon
* Main introductions screen is present

The following new features are present in this release:
* All definitions are converted from lyx and added into application
* Search system is present
* Bug report template
### Known Bugs & Limitations
* APK installation might not work properly on devices with Android version < 7.0 (tested on tablets with version 4.0.3, 4.2.2 and 5.0.1)
* Occasional crashes on older devices
* Although bug report template is generated for selected definition, sending it to GitHub via API does not work yet
* Search algorithm sometimes returns reduntant results as it returns the closest matches
* Title Matemaatika Minileksikon is not fully visible on smaller devices
### Next Release
For the next release (10.12.2018) the main planned features are:
* Bug reports can be sent via GitHub AP
* Favorites system
* Improved search algorithm (TF-IDF)
