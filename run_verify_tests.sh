#!/bin/sh

set -e


mvn -Djacoco.skip=true verify
