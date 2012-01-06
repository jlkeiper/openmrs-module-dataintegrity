package org.openmrs.module.dataintegrity;

import java.util.HashMap;
import java.util.Map;

public class DataIntegrityConstants {

	public static final Integer MAX_RECORDS = 250000;
	public static final String NONE = "none";
	public static final String CHECK_LANGUAGE_SQL = "sql";
	
//	public static final String REPAIR_TYPE_SCRIPT = "script";
//	public static final String REPAIR_TYPE_LINK = "link";
//	public static final String REPAIR_TYPE_INSTRUCTIONS = "instructions";
//	public static final String REPAIR_TYPE_NONE = "none";

	public static final String FAILURE_TYPE_NUMBER = "number";
	public static final String FAILURE_TYPE_COUNT = "count";
	public static final String FAILURE_TYPE_STRING = "string";
	public static final String FAILURE_TYPE_BOOLEAN = "boolean";
	public static final String FAILURE_OPERATOR_LESS_THAN = "less than";
	public static final String FAILURE_OPERATOR_GREATER_THAN = "greater than";
	public static final String FAILURE_OPERATOR_EQUALS = "equals";
	public static final String FAILURE_OPERATOR_NOT_EQUALS = "not equals";
	public static final String FAILURE_OPERATOR_CONTAINS = "contains";
	public static final String FAILURE_OPERATOR_NOT_CONTAINS = "not contains";
	public static final String RESULTS_LANGUAGE_SQL = "sql";
	public static final String RESULTS_LANGUAGE_SAME = "same";
	public static final String DATA_INTEGRITY_ERROR_STACK_TRACE = "stacktrace";
	public static final String DATA_INTEGRITY_ERROR = "error";
	public static final String PRIV_MANAGE_INTEGRITY_CHECKS = "Manage Integrity Checks";
	public static final String PRIV_RUN_INTEGRITY_CHECKS = "Run Integrity Checks";
	public static final String PRIV_VIEW_INTEGRITY_CHECKS = "View Integrity Checks";
	public static final String PRIV_VIEW_INTEGRITY_CHECK_RESULTS = "View Integrity Check Results";
	public static final String PRIV_RUN_INTEGRITY_CHECK_REPAIRS = "Run Integrity Check Repairs";
	public static final String TEMPLATE_FOLDER = "/org/openmrs/module/dataintegrity/templates/";
	public static final String TEMPLATE_EMAIL_HTML = "email-html.vm";
	public static final String TEMPLATE_EMAIL_PLAIN = "email-plain.vm";
	public static final String SCHEDULED_CHECKS_PROPERTY = "checkIds";
	public static final Integer TEST_QUERY_LIMIT = 2;

	public static final Integer RESULT_STATUS_NEW = 0;
	public static final Integer RESULT_STATUS_IGNORED = 1;
	public static final Integer RESULT_STATUS_VOIDED = 2;
}
