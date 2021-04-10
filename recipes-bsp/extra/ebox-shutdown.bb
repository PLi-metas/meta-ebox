require conf/license/license-gplv2.inc


SRC_URI = "file://ebox-shutdown.sh"

INITSCRIPT_NAME = "ebox-shutdown"
INITSCRIPT_PARAMS = "start 39 0 ."

inherit pkgconfig update-rc.d

do_install() {
    install -d ${D}${INIT_D_DIR}/
    install -m 0755 ${WORKDIR}/ebox-shutdown.sh ${D}${INIT_D_DIR}/ebox-shutdown
}

COMPATIBLE_MACHINE = "^(ebox5000|ebox5100|ebox7358|eboxlumi)$"
