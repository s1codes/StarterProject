# StarterProject (for Kotlin)

This is a starter template for creating Minecraft plugins for Bukkit, Spigot, or Paper using Kotlin. It includes useful features:
## Features
- **Kotlin-ready**: Write plugins in Kotlin with ease.

- **shadowJar**: Bundles your plugin with Kotlin and any other dependecy in one single jar file. You can also relocate dependencies if you want to.
 
- **Debugging setup**: Run `./gradlew build :runServer` and test your plugin in a live server! without any hassle of setting up server yourself!

## Getting Started

1. **Clone the repo**
   ```bash
   git clone https://github.com/s1codes/StarterProject.git
   ```
2. Open the folder as project in Intellij IDEA (or any other IDE you prefer)

3. Modify `build.gradle.kts`,`settings.gradle.kts` to match your project setting

4. Then rename package `change.me.StarterProject` to your project settings

5. Inside `src/main/` go to `/resources` and modify the plugin.yml.

6. Test your project by running `./gradlew build :runServer`, then startup minecraft 1.21.3, go to multiplayer > direct connect > put localhost as ip > connect > and test any functionality you put in your plugin.

7. After you are done testing and making your plugin. Build it using `./gradlew build`. Your jar file will be inside `build/libs/`

8. Do whatever you want

## License

```
This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or
distribute this software, either in source code form or as a compiled
binary, for any purpose, commercial or non-commercial, and by any
means.

In jurisdictions that recognize copyright laws, the author or authors
of this software dedicate any and all copyright interest in the
software to the public domain. We make this dedication for the benefit
of the public at large and to the detriment of our heirs and
successors. We intend this dedication to be an overt act of
relinquishment in perpetuity of all present and future rights to this
software under copyright law.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.

For more information, please refer to <https://unlicense.org>
```
