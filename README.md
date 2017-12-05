# multi-ecu

## Steps to Build
1. Clone this git repo  
2. cd multi-ecu  
3. repo init -u https://github.com/aananthcn/multi-ecu -m manifest.xml  
4. repo sync  
5. source layers/poky/oe-init-build-env build  
6. copy .conf files from conf-multi-ecu directory to build/conf directory  
7. bibake core-image-weston  
