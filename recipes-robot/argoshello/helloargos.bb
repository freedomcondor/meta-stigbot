DESCRIPTION = "helloharry, local src, cmake"

LICENSE = "CLOSED"

inherit cmake
DEPENDS += "argos"

SRC_URI = "file://helloargos.cpp \
           file://CMakeLists.txt \
          "
S = "${WORKDIR}"
TARGET_CC_ARCH += "${LDFLAGS}" 
