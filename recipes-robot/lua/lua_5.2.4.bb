SUMMARY = "BeBot Power Management Status"
LICENSE = "CLOSED"

SRC_URI = "file://lua-5.2.4/src \
           file://lua-5.2.4/Makefile \
          "
          
#S = "${WORKDIR}"

do_compile() {
        oe_runmake 'CC=${CC}'
}

do_install() {
        oe_runmake install 'DESTDIR=${D}'
}

