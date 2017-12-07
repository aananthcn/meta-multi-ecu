# multi-ecu

## Setup
1. Clone this git repo  
2. cd multi-ecu  
3. repo init -u https://github.com/aananthcn/multi-ecu -m manifest.xml  
4. repo sync  

## Build
1. source layers/poky/oe-init-build-env build  
2. copy .conf files from conf-multi-ecu directory to build/conf directory  
3. bitbake multi-ecu-image or core-image-weston  

## Run
1. ../scripts/scripts/run-multi-ecu  
