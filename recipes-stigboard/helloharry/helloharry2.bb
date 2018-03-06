DESCRIPTION = "Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://helloHarry2.c"

S = "${WORKDIR}"

do_compile() {
	${CC} helloHarry2.c ${LDFLAGS} -o helloHarry2
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 helloHarry2 ${D}${bindir}
}
TARGET_CC_ARCH += "${LDFLAGS}" 
