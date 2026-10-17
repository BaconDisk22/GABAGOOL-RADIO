# GABAGOOL RADIO 2.0 — implementation contract

This document scopes a nonbreaking upgrade to Android and Intel macOS. **It is a plan, not a claim that these features are implemented.** Do not merge UI changes until both target builds pass.

## Delivery rules
- Changes belong exclusively to `BaconDisk22/GABAGOOL-RADIO`; never push to upstream Meshtastic.
- Preserve radio configuration, message storage, encryption, and the existing connection lifecycle.
- Build the Android F-Droid debug APK and Intel macOS DMG on every feature PR.
- Do not introduce network requests or Bluetooth discovery in demo mode.
- Feature flags default to existing behavior until a feature passes its tests.
- Rebase feature branches on the latest main and avoid touching the release/screenshot workflows while those are being stabilized.

## Six workstreams and acceptance criteria

### 1. Cleaner dashboard
- Single, accessible connection status and device name.
- Node count, recent messages, radio battery, and quick navigation with empty/loading/error states.
- Compact layout for narrow Android screens and resizable desktop windows.
- No extra polling of the radio from the dashboard.
- UI screenshot tests or deterministic offline screenshot fixture.

### 2. Mesh monitoring
- Node online/last-seen state based on existing telemetry; explicitly label stale/unknown readings.
- Favorites stored locally, with deterministic ordering and no packet transmission.
- RSSI/SNR and hop data only when actually supplied; never fabricate values.
- Unit tests for stale node calculations, missing telemetry, and sorting.

### 3. Smart notifications
- Opt-in alerts for connection loss, battery thresholds, and new nodes.
- Debounce and deduplicate alerts; honor OS notification permissions and quiet hours.
- Never claim a device is disconnected during initial discovery or demo mode.
- Unit tests for alert thresholds, cooldowns, and notification suppression.

### 4. Customization
- Persist light/dark/system theme, compact layout, and accessible color choices.
- Jersey-themed wording with a profanity preference defaulting to OFF.
- Profanity affects only local optional copy, never user messages or mesh packets.
- Ensure UI contrast and screen-reader labels.

### 5. Demo and screenshots
- Explicit offline demo entry point for both Android and desktop.
- Prominent `DEMO — SIMULATED DATA` banner.
- Deterministic fixture data, screenshot capture in GitHub Actions, and README display.
- Screenshot publishing only from trusted successful main-branch runs; no PR-token writes.

### 6. Android and Intel Mac usability
- Predictable startup and actionable connection errors.
- Desktop keyboard navigation and accessible window sizing.
- Intel macOS packaging and first-launch guidance; verify on actual Intel hardware before claiming compatibility.
- Regression test real-radio connection, reconnect, messaging, and settings persistence.

## Release gate
- All required CI checks green on main.
- Latest APK and Intel macOS DMG downloadable from this fork's GitHub Releases.
- Android and macOS demo screenshots actually render in the README.
- A human verifies radio connectivity and messaging on supported physical hardware.
- No release is labeled production-ready until hardware validation is recorded.

## Suggested implementation order
1. Stabilize existing PR #8 screenshot/demo work and release automation.
2. Dashboard + accessibility + shared theme.
3. Local monitoring + favorites and their tests.
4. Opt-in notifications with throttling.
5. Preferences, Jersey copy, and profanity toggle.
6. Desktop usability and release validation.
