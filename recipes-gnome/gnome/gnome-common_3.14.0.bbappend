do_install_append_class-native() {
	find ${D} -name ax_check_enable_debug.m4 | xargs rm
	find ${D} -name ax_code_coverage.m4 | xargs rm
}
