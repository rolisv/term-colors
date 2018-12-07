Prints out 256 indexed terminal color palette. Built with [Scala Native](https://www.scala-native.org/en/latest/index.html).

# Build and install

The application uses [mill](https://www.lihaoyi.com/mill/index.html) build tool. Install it [here](https://www.lihaoyi.com/mill/index.html#installation).

After that, run:
```bash
$ mill termcolors.nativeLink
```

Application executable is placed in `./out/termcolors/nativeLink/dest/out`.
Rename and copy it somewhere on your `$PATH`.

## (Optional) Compress executable with `upx`

Run:
```bash
$ mill termcolors.upx
```
to compress the application executable produced by `termcolors.nativeLink` with [upx](https://upx.github.io/).
This requires having [upx installed](https://github.com/upx/upx/releases/latest).

The output is stored in `./out/termcolors/upx/dest/term-colors`.
