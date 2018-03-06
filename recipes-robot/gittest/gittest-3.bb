DESCRIPTION = "a CVector for git test"

LICENSE = "CLOSED"
BB_STRICT_CHECKSUM = "0"
inherit cmake

SRC_URI = "git://github.com/freedomcondor/CVector;protocol=http"
#SRCREV = "c5697655bc745e3a4a2416bd337f9979106bd512"
#SRCREV = "HEAD"
SRCREV = "${AUTOREV}"
#SRC_URI[md5sum] = "c917b30ed1e36debf6b982c96982899d"
S = "${WORKDIR}/git"
#EXTRA_OECMAKE = "-DCMAKEFLAG=AAA"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 cVector ${D}${bindir}
}


