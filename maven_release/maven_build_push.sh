#!/usr/bin/env sh
set -e
set -u

SCRIPT_DIR="$(dirname "$(readlink -f "$0")")"

cd $SCRIPT_DIR/..
mvn -s $SCRIPT_DIR/settings.xml deploy
