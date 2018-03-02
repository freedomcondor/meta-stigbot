DESCRIPTION = "argos"

LICENSE = "CLOSED"
BB_STRICT_CHECKSUM = "0"

DEPENDS += "lua"
DEPENDS += "gcc-runtime"

inherit cmake

SRC_URI = "git://github.com/ilpincy/argos3;protocol=http"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git/src"
EXTRA_OECMAKE = "-DARGOS_BUILD_FOR=stigbot -DARGOS_BUILD_ARM=ON"



