# GABAGOOL RADIO visual identity

This file specifies the shared palette for future Android and Desktop UI changes. **The theme is not yet wired into the app's Compose components.**

| Token | Color |
|---|---|
| Parkway Black | `#101820` |
| Garden State Green | `#24834B` |
| Turnpike Gold | `#F5B335` |
| Shore Blue | `#168DB0` |
| Taylor Ham Red | `#C83C40` |
| Diner White | `#F5F3EA` |

## Implementation gates
- Replace existing Compose Material3 light/dark color schemes without reducing contrast.
- Verify maps, alerts, settings, messaging and navigation in both modes.
- Replace icon assets across Android density variants and macOS .icns.
- Check splash screen, app menus, permission dialogs and accessibility.
- Preserve upstream copyright and Meshtastic attribution.
- Verify clean installation alongside upstream app with the new Android application ID.
- Run CI and physical-device smoke tests before tagging a release.
