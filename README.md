# Re-Winder

**Re-Winder** is a Java-based application that captures screenshots of the user's display at regular intervals, stores them in a folder named by the current date, and creates a time-lapse video. Users can adjust the frames per second (FPS) for playback and save the resulting video. The app runs in the background with a system tray icon for seamless operation.

## Features

- **Screenshot Capture**: Capture the screen at user-defined intervals (e.g., every 5 seconds) throughout the day.
- **Folder Management**: Automatically creates and manages a folder for each day's screenshots.
- **Timelapse Playback**: Play the screenshots in sequence with adjustable FPS.
- **Save as Video**: Export the time-lapse as a video file (e.g., MP4).
- **Background Operation**: Runs in the background with a system tray icon for easy access, similar to the Bluetooth icon.

## Technologies & Tools

- **Java**: The application is built using Java, with Swing for the GUI and AWT for capturing screenshots.
- **Java NIO**: For managing file I/O operations (creating folders, saving screenshots).
- **Xuggler or FFmpeg**: For converting screenshots to video format.
- **System Tray (java.awt.SystemTray)**: To provide background operation with a taskbar icon.

## Installation

1. Download the latest release from the [Releases](https://github.com/parasar33/Re-Winder/releases) section.
2. Extract the downloaded archive to a directory of your choice.
3. Run the `ReWinder.jar` file to start the application.

## Usage

1. Set the screenshot interval (`n` seconds) from the main UI.
2. Start capturing screenshots by clicking the "Start" button.
3. Once enough screenshots are captured, adjust the FPS and hit "Play" to view the time-lapse.
4. Optionally, click "Save Video" to export the time-lapse as a video file.
5. The app can also run in the background, minimized to the system tray for seamless operation.

## Future Enhancements

- **Cloud Syncing**: Allow users to upload their screenshots and time-lapses to cloud storage.
- **Mobile Version**: A mobile version for iOS/Android devices.
- **Video Editing**: Add basic video editing tools (e.g., trimming, transitions) before saving.

## Contributing

Contributions are welcome! If you have suggestions, improvements, or bug fixes, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

