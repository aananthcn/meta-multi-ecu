DESCRIPTION = "Append file for kernel for multi-ecu-simulation project"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}/${MACHINE}:"
COMPATIBLE_MACHINE = "qemux86|qemux86_64"


SRC_URI_append_qemux86-64 = " \
	file://defconfig \
"

SRC_URI_append_qemux86 = " \
	file://defconfig \
"

do_copy_multi_ecu_files() {
	cp ${WORKDIR}/defconfig ${S}/arch/arm64/configs/defconfig
}


addtask copy_multi_ecu_files after do_unpack

