#!/bin/bash

if [ ! -x "drivers" ];
then
	echo "This script needs to be run from the behave directory."
	exit 1;
fi

if [ -z "$1" ];
then
	echo "Feature file is required";
	exit 2;
fi

BASEDIR=`pwd`;
FEATURE=$1;

export PATH="$PATH:$BASEDIR/drivers";

behave --format=plain --show-timings --no-capture $FEATURE
