#!/usr/bin/env bash

for word in $(cat /usr/share/dict/words)
do
  curl -H 'content-type: application/json' http://localhost:8080/hello?name=${word}
  sleep 2
done
