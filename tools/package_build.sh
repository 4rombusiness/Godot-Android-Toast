#!bin/bash

if [[ ! -e "releases" ]]; then
    mkdir -p "releases"
fi

zip -j --must-match  "releases/GodotToastPlugin-${1}.zip" ../config/GodotToast.gdap ../share-plugin/godottoast/build/outputs/aar/GodotToast.release.aar