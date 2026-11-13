#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"
mvn -B clean package
java -jar target/executable-app-1.0.0.jar
