### FlagSecureBug
### Sample app to reproduce a bug in android regarding FLAG_SECURE

#Steps to reproduce:
####\#1. launch the app
####\#2. see the blue bg activity, click the "Get In!" button
####\#3. press power button (screen shuts down)
####\#4. press power button again (screen opens)
####\#5. unlock device (the blue bg activity is being launched)
####\#6. click on recent apps button 
#  ===> the red bg activity is displayed.

#### Expected behaviour: a blank screenshot should have been displayed.
