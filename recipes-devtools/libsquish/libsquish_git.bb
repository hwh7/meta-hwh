SECTION = "libs/multimedia"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README;endline=6;md5=7b9bc01c081a0274df1c217b21a03ce2"

SRC_URI = "git://github.com/hwh7/libsquish.git;protocol=https;branch=kodi_internal"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

do_configure() {
}

do_compile() {
	cd ${S}
	make -j${BB_NUMBER_THREADS}
}

do_install() {
	cd ${S}
	install -d ${D}/lib
	install libsquish.a ${D}/lib/libsquish.a

	install -d ${D}/usr/include
	install squish.h ${D}/usr/include

	install -d ${D}/usr/lib/pkgconfig
	install squish.pc ${D}/usr/lib/pkgconfig
}
