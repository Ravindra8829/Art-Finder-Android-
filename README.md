

# Art Finder Android Application

A modern Android application for discovering, browsing, and managing art pieces. This project is designed for educational and demonstration purposes, showcasing Android app architecture, UI design, and integration with Firebase and other Android libraries.

---

## 🏗️ Architecture

- **Platform:** Android (Kotlin, XML)
- **Architecture:** MVVM (Model-View-ViewModel)
- **Backend:** Firebase (Authentication, Firestore, Storage)
- **UI:** Material Design, Custom Views
- **Image Handling:** Glide, Crop Image
- **Security:** Firebase Auth, Proguard

---

## 🚀 Features

### Core Modules

1. **User Authentication** – Sign up, login, and secure session management
2. **Art Discovery** – Browse and search art pieces by category
3. **Art Upload** – Add new art with images and details
4. **Profile Management** – Edit user profile, view uploads
5. **Admin Panel** – Manage users and art pieces (admin only)
6. **Favorites** – Save and view favorite art
7. **Cart & Orders** – Add to cart, place orders (if e-commerce enabled)
8. **Notifications** – Push notifications for updates
9. **Image Cropping & Compression** – Efficient image uploads
10. **Dark Mode** – Material dark theme support

---

## 📋 Prerequisites

- Android Studio (Giraffe or newer recommended)
- JDK 17 or higher
- Gradle 8+
- Firebase Project (with google-services.json)
- Internet connection

---

## 🛠️ Setup Instructions

1. **Clone the repository**
   ```sh
   git clone https://github.com/Ravindra8829/Art-Finder-Android-.git
   ```
2. **Open in Android Studio**
   - File > Open > Select the project folder
3. **Configure Firebase**
   - Add your `google-services.json` to `app/`
   - Ensure Firebase Auth, Firestore, and Storage are enabled in your Firebase console
4. **Build the project**
   - Sync Gradle and build the project
5. **Run on emulator or device**
   - Select a device and click Run

---

## 🔧 Configuration

- **Firebase:**
  - Place your `google-services.json` in `app/`
  - Configure rules for Firestore and Storage as needed
- **Proguard:**
  - Custom rules in `app/proguard-rules.pro`
- **API Keys:**
  - Store sensitive keys securely (do not hardcode in source)

---

## 📁 Project Structure

```
Art-Finder-Android-
├── app/
│   ├── build.gradle.kts
│   ├── google-services.json
│   ├── proguard-rules.pro
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml
│       │   ├── java/
│       │   │   └── com/
│       │   │       └── example/           # Main app package
│       │   │           ├── hololo/        # Image cropping
│       │   │           └── theartofdev/   # Additional image tools
│       │   └── res/
│       │       ├── color/                 # Color selectors
│       │       ├── drawable/              # Images, icons, backgrounds
│       │       ├── layout/                # XML UI layouts
│       │       ├── menu/                  # Menu XMLs
│       │       ├── mipmap-hdpi/           # App icons
│       │       ├── values/                # Strings, styles, colors
│       │       ├── values-night/          # Dark theme values
│       │       └── xml/                   # XML configs
│       ├── test/
│       │   └── java/
│       └── androidTest/
│           └── java/
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── README.md
├── settings.gradle.kts
└── gradle/
    └── wrapper/
        ├── gradle-wrapper.jar
        └── gradle-wrapper.properties
```

---

## 🔐 Authentication

- Uses Firebase Authentication (Email/Password, Google Sign-In)
- User roles: User, Admin (admin features protected)
- Secure session management

---

## 📊 Main Screens & Navigation

- **Splash Screen** – App launch
- **Login/Signup** – User authentication
- **Home** – Art discovery, categories
- **Art Details** – View art, add to favorites/cart
- **Upload Art** – Add new art (with image crop)
- **Profile** – User info, uploads, settings
- **Admin Panel** – Manage users/art (admin only)

---

## 🚀 Deployment

- Build APK: `./gradlew assembleRelease`
- Deploy to Play Store: Follow [Google Play guidelines](https://developer.android.com/distribute/best-practices/launch/launch-checklist)

---

## 🔒 Security Considerations

- All sensitive operations require authentication
- Firebase rules restrict access by user role
- Proguard enabled for code obfuscation
- No sensitive data stored in source code

---

## 📝 License

This project is for educational and demonstration purposes only. Not for production or commercial use.

---

## 🤝 Support

For questions or support, contact on [LinkedIn](https://www.linkedin.com/in/ravindra-kumar-suthar-882ravi/)

---

*Note: All features and modules are for learning and demonstration purposes only.*
