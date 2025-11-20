#!/bin/zsh
set -euo pipefail

# Compile all Java sources under src/ into bin/ using javac -d
mkdir -p bin

# Collect java files
files=()
while IFS= read -r -d $'\0' f; do
  files+=("$f")
done < <(find src -name "*.java" -print0)

if [ ${#files[@]} -eq 0 ]; then
  echo "No Java sources found under src/"
  exit 1
fi

echo "Compiling ${#files[@]} Java source(s) to bin/ ..."
javac -d bin "${files[@]}"

echo "Done. .class files are in bin/"
