SECTION = "libs/multimedia"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/README;endline=6;md5=7b9bc01c081a0274df1c217b21a03ce2"

SRC_URI = "git://github.com/xbmc/xbmc.git;protocol=https;branch=Isengard"
SRCREV = "cf72616385ea60d9996212ec853032ba23198c5f"

S = "${WORKDIR}/git/tools/depends/native/libsquish-native/"

inherit pkgconfig gettext

do_configure() {
	echo
}


BBCLASSEXTEND = "native"
