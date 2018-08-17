<img src="icon.png" align="right" width="180px"/>

[>> Downloads <<](https://github.com/b0undarybreaker/ProbeDataProvider/releases)

# ProbeDataProviderAPI

A system and associated gadgetry for providing structured data
to mods, for automation, informational HUD elements, and much more.

Structured data is very useful!

## Using ProbeDataProviderAPI

The IProbeDataProvider interface is intended to be used as ~~a
standard Forge capability~~ a standalone interface while Capabilities are
redeveloped. [FruitPhone](https://github.com/elytra/FruitPhone)
(not yet ported to 1.13)
is essentially a reference implementation for a data *reader*.

Either add the jar itself to your /libs folder and import it to your
build.gradle as a file, or import it through Jitpack or the Curse maven. Add
the dependency as `deobfCompile 'com.elytradev:probedataproviderapi:1.0'`.
