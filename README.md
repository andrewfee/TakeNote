[ScreenshotMainActivity]: https://cloud.githubusercontent.com/assets/19656425/16587184/39b89ec6-427e-11e6-908f-2ed130040e91.png
[ScreenshotEditActivity]: https://cloud.githubusercontent.com/assets/19656425/16587190/4631f878-427e-11e6-9989-b927ee200124.png
[AppIcon]: https://cloud.githubusercontent.com/assets/19656425/16603591/0fd636c8-42d2-11e6-9b7a-5a450b9a871d.png

# Take Note ![Take Note][AppIcon]

A simple note taking application for Android devices. The main activity contains a list view displaying all notes sorted by the last modificaiton date. A floating action button in the main activity allows the user to create a new note. The edit activity allows the user to modify the note's title and body.

## Building on the command-line with gradle

The wrapper script can be found in the project's root folder. On Windows, you should use ``gradlew.bat``, on all other operating system you should ``gradlew``. 
Gradle will download the project's dependencies automatically when building the project.  You can build the debug APK using the following command:

```
gradlew.bat assembleDebug
```

## Screenshots
![Main Activity][ScreenshotMainActivity]

![Editing a Note][ScreenshotEditActivity]

## Author
Andrew Fee

## Future Enhancements
* Search functionality
* Share notes with other apps
* Flagging/prioritizing notes
* User experience improvements
