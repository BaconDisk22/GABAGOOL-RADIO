# GABAGOOL RADIO — Test and Release Checklist

## Current status

- Android F-Droid debug APK: built successfully in [Actions run 38512973952](https://github.com/BaconDisk22/GABAGOOL-RADIO/actions/runs/38512973952).
- Intel macOS DMG: built successfully in the same run.
- Installation, radio communication, app identity and compatibility: **not yet verified on physical hardware**.
- Neither artifact is a signed, supported production release. Do not use for critical/emergency communications.

## Install the test artifacts

1. Open the build run and download the `gabagool-android-debug` or `gabagool-macos-intel-dmg` artifact ZIP.
2. Extract the ZIP. Verify the expected APK or DMG is present.
3. Android: install the debug APK only on a test device. It may conflict with existing Meshtastic installations until a unique Android application ID is configured.
4. Intel Mac: open the DMG and test the app. macOS may warn about unsigned or unnotarized software. Do not disable system-wide security protections.
5. Record the app version, macOS/Android version, radio model, firmware, connection transport and any errors.

## Acceptance gates before a public prerelease

- [ ] Android debug app opens and stays running.
- [ ] macOS Intel app opens on Tahoe, including a clean-machine launch test.
- [ ] Confirm package identifiers and branding are unique to this fork.
- [ ] USB radio connect, disconnect, reconnect and message send/receive tested on macOS.
- [ ] BLE connect, disconnect, reconnect and message send/receive tested on Android.
- [ ] Message acknowledgements and encryption indicators are not overstated.
- [ ] Location permission, telemetry privacy and backups reviewed.
- [ ] New reconnect policy is integrated into the actual transport lifecycle and tested.
- [ ] License, copyright and Meshtastic trademark attribution reviewed.
- [ ] Both release builds and SHA256SUMS generated from the same commit.
- [ ] Test installers manually reviewed before promoting beyond prerelease.

## Release process

The `Gabagool Candidate Release` workflow runs **manually** on `main`.
It requires a tag matching `gabagool-vX.Y.Z-rcN` and the confirmation text
`PUBLISH-PRERELEASE`. It builds both platforms and publishes a GitHub prerelease
only if both builds succeed. Publishing is not evidence of hardware testing.

The guarded merge workflow is opt-in via `safe-automerge` and requires
successful Android and macOS checks on the exact PR head, a non-draft PR,
and a conflict-free merge. Configure GitHub branch rules separately to enforce
reviews and required checks; this workflow does not substitute for them.
