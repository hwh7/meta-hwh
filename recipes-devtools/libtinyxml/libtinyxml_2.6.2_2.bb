SECTION = "libs/multimedia"
LICENSE = "zlib"
LIC_FILES_CHKSUM = "file://src/tinyxml.cpp;endline=23;md5=b97285d8fafcc49b761ca785816cc397"

DEPENDS = "freetype libpng"

SRC_URI = "http://mirrors.xbmc.org/build-deps/sources/tinyxml-2.6.2_2.tar.gz"
SRC_URI[md5sum] = "f3c96bd9a99acb19497da252c90281f8"
SRC_URI[sha256sum] = "8164c9ad48b9028667768a584d62f7760cfbfb90d0dd6214ad174403058da10c"

inherit autotools pkgconfig

S = "${WORKDIR}/${PN}-${PV}_${PR}"

do_configure() {
        cd ${S}

	autoreconf --install

	install -d build
	cd build
	../configure \
	--build=${BUILD_SYS} \
	--host=${HOST_SYS} \
	--target=${TARGET_SYS}
}

do_compile() {
        cd ${S}/build

	make -j${BB_NUMBER_THREADS}
}

do_install() {
	cd ${S}/build/src/.libs

        install -d ${D}/lib
        install libtinyxml.so libtinyxml.so.0 libtinyxml.so.0.0.0 ${D}/lib

	cd ..
	install -d ${D}/usr/lib/pkgconfig
	install tinyxml.pc ${D}/usr/lib/pkgconfig

	cd ${S}
        install -d ${D}/usr/include
	install include/tinyxml.h ${D}/usr/include
}
