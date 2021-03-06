[Space Pack Extended](https://minecraft.curseforge.com/projects/space-extended-mod)
===================================================================================

[![Curse Forge](http://cf.way2muchnoise.eu/short_252607_downloads.svg)](https://minecraft.curseforge.com/projects/space-extended-mod)
[![Build Status](https://gitlab.brainstonemod.com/BrainStone/SpacePackExtended/badges/master/build.svg)](https://gitlab.brainstonemod.com/BrainStone/SpacePackExtended/commits/master)

Starts where all others end

[Issue Reporting](https://github.com/BrainStone/SpacePackExtended/issues)
------------------------------------------------------------------

If you found a bug or even are experiencing a crash please report it so we can fix it. Please check at first if a bug report for the issue already [exits]
(https://github.com/BrainStone/SpacePackExtended/issues). If not just create a [new issue](https://github.com/BrainStone/SpacePackExtended/issues/new) and fill
out the form.

Please include the following:

* Minecraft version
* Brain Stone Mod version
* Forge version/build
* Versions of any mods potentially related to the issue 
* Any relevant screenshots are greatly appreciated.
* For crashes:
  * Steps to reproduce
  * ForgeModLoader-client-0.log (the FML log) from the root folder of the client
 
*(When creating a new issue please follow the template)*

[Feature Requests](https://github.com/BrainStone/SpacePackExtended/issues)
-------------------------------------------------------------------

If you want a new feature added, go ahead an open a [new issue](https://github.com/BrainStone/SpacePackExtended/issues/new), remove the existing form and
describe your feature the best you can. The more details you provide the easier it will be implementing it.  
You can also talk to me on IRC on my channel #BrainStone on esper.net

Developing with My Mod
----------------------

So you want to use items or blocks from my mod, add support or even develop an addon for my mod then you can easily add it to your development environment! All
releases beginning from version 1.11-2.0.0-alpha get uploaded to my maven repository.  
So all you have to do to include the mod is add these lines *(in the appropriate places)* to your build.gradle

    repositories {
        maven { // Space Pack Extended
            url "http://maven.brainstonemod.com"
        }
        // Other repos...
    }
    
    dependencies {
        compile "com.space.extended:SpacePackExtended:<version>:deobf"
        // Other dependencies
    }

Setting up a Workspace/Compiling from Source
--------------------------------------------

* Setup: Run [gradle] in the repository root: `gradlew[.bat] [setupDevWorkspace|setupDecompWorkspace] installLombok [eclipse|idea]`
* Build: Run [gradle] in the repository root: `gradlew[.bat] build`
* If obscure Gradle issues are found try running `gradlew clean` and `gradlew cleanCache`

Licenses
--------

Code, Textures and binaries are licensed under the [GPLv3](https://www.gnu.org/licenses/#GPL).

You are allowed to use the mod in your modpack.  
Any modpack which uses Space Pack Extended takes **full** responsibility for user support queries. For anyone else, we only support official builds from
curseforge, not custom built jars. We do take bug reports for outdated builds of Minecraft. However we cannot promise to fix any issues. We will try regardless.

Any alternate licenses are noted where appropriate.

Jar Signing
-----------

All jars from all official download sources will be signed begining from version 1.11-2.0.0-alpha. The signature will always have a SHA-1 hash of
`2238d4a92d81ab407741a2fdb741cebddfeacba6` and you are free to verify it.
