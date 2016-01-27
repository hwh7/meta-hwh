SUMMARY = "library for handling OpenGL function pointer management"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=58ef4c80d401e07bd9ee8b6b58cf464b"

SRC_URI = "https://github.com/anholt/libepoxy/releases/download/v${PV}/${BP}.tar.bz2"
SRC_URI[md5sum] = "96f6620a9b005a503e7b44b0b528287d"
SRC_URI[sha256sum] = "1d8668b0a259c709899e1c4bab62d756d9002d546ce4f59c9665e2fc5f001a64"

inherit autotools pkgconfig

DEPENDS = "util-macros"
