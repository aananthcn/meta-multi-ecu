DESCRIPTION = "Recipe to build instrument cluster graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=57d76440fc5c9183c79d1747d18d2410"


S = "${WORKDIR}/git"

inherit autotools-brokensep
ALLOW_EMPTY_${PN} = "1"

DEPENDS = " mesa wayland "


SRC_URI = "git://github.com/aananthcn/instrument-cluster.git;protocol=https"

SRC_URI[md5sum] = "22952b1c27a3669b1916bf71d538163e"

SRCREV = "master"

FILES_${PN} = "${bindir}/instrument-cluster"
INSANE_SKIP_${PN} = "ldflags"