
SRC_URI += "file://omap4-duovero-stig.dts;subdir=git/arch/${ARCH}/boot/dts"
SRC_URI += "file://i2ccs16is7xx.cfg"
SRC_URI += "file://0001-markedsc16.patch"
SRC_URI += "file://0001-markedclk.patch"
SRC_URI += "file://0001-marked-irq.patch"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

KERNEL_DEVICETREE = "omap4-duovero-stig.dtb"

