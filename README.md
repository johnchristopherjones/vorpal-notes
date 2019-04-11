### Develop

Run in developmeent:

```bash
yarn
yarn html
yarn watch:style &
yarn shadow-cljs watch app
```

### REPL

After page is loaded, you may also start a REPL connected to browser with:

```bash
yarn shadow-cljs cljs-repl app
```

### Release

Compile with optimizations with `release` sub-command:

```bash
yarn shadow-cljs release app
yarn html
yarn style
yarn serve # serving target/ on http://localhost:8080
```
