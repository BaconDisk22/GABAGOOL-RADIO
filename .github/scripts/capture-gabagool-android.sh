#!/usr/bin/env bash
set -euo pipefail
./gradlew :androidApp:assembleFdroidDebug --stacktrace
echo "Built APK locations:"
find androidApp/build/outputs -type f -name '*.apk' -print
apk=$(find androidApp/build/outputs -type f -name '*universal*debug.apk' -print -quit)
if [[ -z "$apk" ]]; then apk=$(find androidApp/build/outputs -type f -name '*.apk' -print -quit); fi
test -n "$apk"
adb install -r "$apk"
pkg=com.bacondisk22.gabagoolradio.fdroid.debug
adb shell am start -n "$pkg/org.meshtastic.app.GabagoolDemoActivity"
sleep 8
mkdir -p screenshots
adb exec-out screencap -p > screenshots/gabagool-android-demo.png
test -s screenshots/gabagool-android-demo.png
