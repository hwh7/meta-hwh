SUMMARY = "A very basic Wayland image with a terminal"

IMAGE_FEATURES += "splash package-management ssh-server-dropbear hwcodecs"

LICENSE = "MIT"

inherit core-image distro_features_check

#REQUIRED_DISTRO_FEATURES = "x11"
REQUIRED_DISTRO_FEATURES = "wayland"

#CORE_IMAGE_BASE_INSTALL += "weston weston-init weston-examples"
#CORE_IMAGE_BASE_INSTALL += "gtk+3-demo clutter-1.0-examples"
#CORE_IMAGE_BASE_INSTALL += "gdm gnome-shell gtk+3-demo clutter-1.0-examples"
#IMAGE_FEATURES += "splash package-management x11-base x11-sato ssh-server-dropbear hwcodecs"

#IMAGE_INSTALL += "xbmc"
#IMAGE_INSTALL += "kodi gnome-desktop3"
IMAGE_INSTALL += "libcurl kodi omxplayer transmission"
