# Copyright (C) 2015 Aananth Chellapa Natarajan <aananth.cn@visteon.com>
# Released under the MIT license (see COPYING.MIT for the terms)

# Base this image on core-image-weston
include recipes-core/images/core-image-weston.bb
include recipes-yocto-ivi/images/ivi-image.bb

LICENSE = "MIT"


# Include modules in rootfs
IMAGE_INSTALL += " \
        kernel-modules \
"

#SPLASH = "psplash-raspberrypi"

#RDEPENDS += " "


IMAGE_FEATURES += " ssh-server-dropbear"

IMAGE_INSTALL_append = " \
	qtbase qtbase-plugins qtwayland cinematicexperience \
"
