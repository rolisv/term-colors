Prints out 256 indexed terminal color pallete. Built with [Scala Native].

# Build and install

The application uses [mill] build system. Install it [here].

After that, run:
```bash
$ mill nativeLink
```

Application executable is placed in `out/termcolors/nativeLink/dest/out`.
Rename and copy it somewhere on your `$PATH`.
