
SRC_URI += "file://omap4-duovero-stig.dts;subdir=git/arch/${ARCH}/boot/dts"
SRC_URI += "file://stig.cfg"
SRC_URI += "file://0001-vcnldriver.patch"
SRC_URI += "file://0001-iss-match.patch"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

KERNEL_DEVICETREE = "omap4-duovero-stig.dtb"

