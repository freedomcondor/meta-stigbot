
SRC_URI += "file://omap4-duovero-stig.dts;subdir=git/arch/${ARCH}/boot/dts"
SRC_URI += "file://stig.cfg"
SRC_URI += "file://0001-vcnl-match.patch"
SRC_URI += "file://0001-omap4isschanged.patch"
SRC_URI += "file://0001-omap4dtschanged.patch"
SRC_URI += "file://0001-regulatorchanged.patch"
SRC_URI += "file://0001-ov5640changed.patch"
SRC_URI += "file://0001-v4l2changed.patch"
SRC_URI += "file://0001-mediachanged.patch"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

KERNEL_DEVICETREE = "omap4-duovero-stig.dtb"

