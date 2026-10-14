# FUGGEDABOUTIT MESH — Jersey Rebrand Specification

**Tagline:** No Towers. No Service. No Problem. Fuggedaboutit.

An independent New Jersey-themed Android client fork based on Meshtastic Android. Preserve radio compatibility, core navigation, accessibility, and clear safety/error messages.

## Palette
| Token | Hex | Meaning |
|---|---|---|
| jerseyBlue | #2484C6 | Primary |
| jerseyBuff | #F1D6A2 | Secondary |
| parkwayAsphalt | #14191F | Dark background |
| turnpikeCharcoal | #242B33 | Cards |
| gardenStateGreen | #21865A | Success |
| porkRollRed | #C63D35 | Error |
| boardwalkGold | #F5B942 | Accent |

## Interface copy (optional Jersey mode)
- Home: The Garden State
- Nodes: The Crew
- Messages: Yo, You There?
- Direct messages: Talk to Tony
- Channels: The Neighborhood
- Map: What Exit?
- Settings: The Back Office
- Network diagnostics: Parkway Patrol
- Connection success: Ayyy! We're in business!
- Disconnected: Fuggedaboutit!
- No nodes: Where's everybody at?
- Weak signal: You're breakin' up, Tony!

Keep technical terminology discoverable, use accessible labels, and never replace critical safety or emergency text with jokes. Avoid quoting protected film/TV dialogue or using third-party logos.

## Delivery checklist
- [ ] Update application display name and in-app identity
- [ ] Apply theme tokens for light/dark mode
- [ ] Create original app icon and splash artwork
- [ ] Make Jersey phrasing opt-in with standard terminology available
- [ ] Update README, screenshots, release notes and repository description
- [ ] Review upstream licenses and Meshtastic trademark guidance
- [ ] Keep unique package/application ID for independent installation
- [ ] Validate Bluetooth, messaging, GPS, maps and Android build
- [ ] Publish signed or unsigned test APK via CI

**Scope:** BaconDisk22 fork only. Do not modify upstream.
