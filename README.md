This layer depends on:

    URI: git://git.yoctoproject.org/poky.git
    branch: rocko
    commit: 759b36a

    URI: git://git.openembedded.org/meta-openembedded
    branch: rocko
    commit: 6e3fc5b

If using mender

    URI: git://github.com/mendersoftware/meta-mender
    branch: rocko
    commit: 7c187e3

    meta-duovero layer maintainer: Scott Ellis <scott@jumpnowtek.com>

Instructions for using this layer can be found at [jumpnowtek.com][duovero-yocto-build]

[duovero-yocto-build]: http://www.jumpnowtek.com/yocto/Duovero-Systems-with-Yocto.html


--------------------------------------------------------------------------------------------

The tutorial in that link is not using a standard folder structure. To make it simple, you can:
1. clone poky-rocko
~# git clone -b rocko git://git.yoctoproject.org/poky.git poky-rocko

2. in folder poky-rocko, clone layer openembedded
~/poky-rocko$ git clone -b rocko git://git.openembedded.org/meta-openembedded

3. clone/copy/move this layer under poky-rocko
~/poky-rocko$ git clone https://github.com/freedomcondor/meta-stigbot

4. prepare build by setup poky-rocko/build/conf:
~/poky-rocko$ source poky-rocko/oe-init-build-env

5. copy sample files (bblayers.conf and local.conf) from meta-stigbot/conf to poky-rocko/build/conf

6. bitbake console-image-stig

