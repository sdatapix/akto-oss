package com.akto.dto;

public class BackwardCompatibility {
    private int id;

    public static final String DROP_FILTER_SAMPLE_DATA = "dropFilterSampleData";
    private int dropFilterSampleData;
    private int resetSingleTypeInfoCount;
    public static final String RESET_SINGLE_TYPE_INFO_COUNT = "resetSingleTypeInfoCount";

    public static final String DROP_WORKFLOW_TEST_RESULT = "dropWorkflowTestResult";
    private int dropWorkflowTestResult;

    public static final String READY_FOR_NEW_TESTING_FRAMEWORK = "readyForNewTestingFramework";
    private int readyForNewTestingFramework;

    public static final String ADD_AKTO_DATA_TYPES = "addAktoDataTypes";
    private int addAktoDataTypes;

    public static final String MERGE_ON_HOST_INIT = "mergeOnHostInit";
    private int mergeOnHostInit;

    public static final String DEPLOYMENT_STATUS_UPDATED = "deploymentStatusUpdated";
    private boolean deploymentStatusUpdated;

    public static final String AUTH_MECHANISM_DATA  = "authMechanismData";
    private int authMechanismData;

    public static final String MIRRORING_LAMBDA_TRIGGERED = "mirroringLambdaTriggered";
    private boolean mirroringLambdaTriggered;

    public static final String DELETE_ACCESS_LIST_FROM_API_TOKEN = "deleteAccessListFromApiToken";
    private int deleteAccessListFromApiToken;

    public static final String DELETE_NULL_SUB_CATEGORY_ISSUES = "deleteNullSubCategoryIssues";
    private int deleteNullSubCategoryIssues;

    public static final String ENABLE_NEW_MERGING = "enableNewMerging";
    private int enableNewMerging;

    public static final String ENABLE_ASYNC_MERGE_OUTSIDE = "enableMergeAsyncOutside";
    private int enableMergeAsyncOutside;
    public static final String LOAD_TEMPLATES_FILES_FROM_DIRECTORY = "loadTemplateFilesFromDirectory";

    public static final String DEFAULT_NEW_UI = "aktoDefaultNewUI";
    private int aktoDefaultNewUI;

    public static final String COMPUTE_INTEGRATED_CONNECTIONS = "computeIntegratedConnections";
    private int computeIntegratedConnections;
    public static final String INITIALIZE_ORGANIZATION_ACCOUNT_BELONGS_TO = "initializeOrganizationAccountBelongsTo";
    private int initializeOrganizationAccountBelongsTo;

    public static final String ORGS_IN_BILLING = "orgsInBilling";
    private int orgsInBilling;

    public static final String DELETE_LAST_CRON_RUN_INFO= "deleteLastCronRunInfo";
    private int deleteLastCronRunInfo;

    public static final String DEFAULT_TELEMETRY_SETTINGS = "defaultTelemetrySettings";
    private int defaultTelemetrySettings;
    public static final String MOVE_AUTH_MECHANISM_TO_ROLE = "moveAuthMechanismToRole";
    private int moveAuthMechanismToRole;
    public static final String LOGIN_SIGNUP_GROUPS = "loginSignupGroups";
    private int loginSignupGroups;

    public static final String VULNERABLE_API_UPDATION_VERSION_V1 = "vulnerableApiUpdationVersionV1";
    private int vulnerableApiUpdationVersionV1;

    public static final String RISK_SCORE_GROUPS = "riskScoreGroups";
    private int riskScoreGroups;
    public static final String DEACTIVATE_COLLECTIONS = "deactivateCollections";
    private int deactivateCollections;
    public static final String DISABLE_AWS_SECRET_PII = "disableAwsSecretPii";
    private int disableAwsSecretPii;

    public static final String API_COLLECTION_AUTOMATED_FIELD = "apiCollectionAutomatedField";
    private int apiCollectionAutomatedField;
    public static final String AUTOMATED_API_GROUPS = "automatedApiGroups";
    private int automatedApiGroups;

    public static final String DROP_API_DEPENDENCIES = "dropApiDependencies";
    private int dropApiDependencies;

    public BackwardCompatibility(int id, int dropFilterSampleData, int resetSingleTypeInfoCount, int dropWorkflowTestResult,
                                 int readyForNewTestingFramework,int addAktoDataTypes, boolean deploymentStatusUpdated,
                                 int authMechanismData, boolean mirroringLambdaTriggered, int deleteAccessListFromApiToken,
                                 int deleteNullSubCategoryIssues, int enableNewMerging,
                                 int aktoDefaultNewUI, int initializeOrganizationAccountBelongsTo, int orgsInBilling,
                                 int computeIntegratedConnections, int deleteLastCronRunInfo, int moveAuthMechanismToRole,
                                 int loginSignupGroups, int vulnerableApiUpdationVersionV1, int riskScoreGroups,
                                 int deactivateCollections, int disableAwsSecretPii, int apiCollectionAutomatedField, 
                                 int automatedApiGroups) {
        this.id = id;
        this.dropFilterSampleData = dropFilterSampleData;
        this.resetSingleTypeInfoCount = resetSingleTypeInfoCount;
        this.dropWorkflowTestResult = dropWorkflowTestResult;
        this.readyForNewTestingFramework = readyForNewTestingFramework;
        this.addAktoDataTypes = addAktoDataTypes;
        this.deploymentStatusUpdated = deploymentStatusUpdated;
        this.mirroringLambdaTriggered = mirroringLambdaTriggered;
        this.authMechanismData = authMechanismData;
        this.deleteAccessListFromApiToken = deleteAccessListFromApiToken;
        this.deleteNullSubCategoryIssues = deleteNullSubCategoryIssues;
        this.enableNewMerging = enableNewMerging;
        this.enableMergeAsyncOutside = enableMergeAsyncOutside;
        this.aktoDefaultNewUI = aktoDefaultNewUI;
        this.computeIntegratedConnections = computeIntegratedConnections;
        this.initializeOrganizationAccountBelongsTo = initializeOrganizationAccountBelongsTo;
        this.orgsInBilling = orgsInBilling;
        this.deleteLastCronRunInfo = deleteLastCronRunInfo;
        this.moveAuthMechanismToRole = moveAuthMechanismToRole;
        this.loginSignupGroups = loginSignupGroups;
        this.vulnerableApiUpdationVersionV1 = vulnerableApiUpdationVersionV1;
        this.riskScoreGroups = riskScoreGroups;
        this.deactivateCollections = deactivateCollections;
        this.disableAwsSecretPii = disableAwsSecretPii;
        this.apiCollectionAutomatedField = apiCollectionAutomatedField;
        this.automatedApiGroups = automatedApiGroups;
    }

    public BackwardCompatibility() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDropFilterSampleData() {
        return dropFilterSampleData;
    }

    public void setDropFilterSampleData(int dropFilterSampleData) {
        this.dropFilterSampleData = dropFilterSampleData;
    }

    public int getResetSingleTypeInfoCount() {
        return resetSingleTypeInfoCount;
    }

    public void setResetSingleTypeInfoCount(int resetSingleTypeInfoCount) {
        this.resetSingleTypeInfoCount = resetSingleTypeInfoCount;
    }

    public int getDropWorkflowTestResult() {
        return dropWorkflowTestResult;
    }

    public void setDropWorkflowTestResult(int dropWorkflowTestResult) {
        this.dropWorkflowTestResult = dropWorkflowTestResult;
    }

    public int getReadyForNewTestingFramework() {
        return this.readyForNewTestingFramework;
    }

    public void setReadyForNewTestingFramework(int readyForNewTestingFramework) {
        this.readyForNewTestingFramework = readyForNewTestingFramework;
    }

    public int getAddAktoDataTypes() {
        return addAktoDataTypes;
    }

    public void setAddAktoDataTypes(int addAktoDataTypes) {
        this.addAktoDataTypes = addAktoDataTypes;
    }
    
    public int getMergeOnHostInit() {
        return this.mergeOnHostInit;
    }

    public void setMergeOnHostInit(int mergeOnHostInit) {
        this.mergeOnHostInit = mergeOnHostInit;
    }

    public boolean isDeploymentStatusUpdated() {
        return deploymentStatusUpdated;
    }

    public void setDeploymentStatusUpdated(boolean deploymentStatusUpdated) {
        this.deploymentStatusUpdated = deploymentStatusUpdated;
    }

    public boolean isMirroringLambdaTriggered() {
        return mirroringLambdaTriggered;
    }

    public void setMirroringLambdaTriggered(boolean mirroringLambdaTriggered) {
        this.mirroringLambdaTriggered = mirroringLambdaTriggered;
    }

    public int getAuthMechanismData() {
        return this.authMechanismData;
    }

    public void setAuthMechanismData(int authMechanismData) {
        this.authMechanismData = authMechanismData;
    }

    public int getDeleteAccessListFromApiToken() {
        return deleteAccessListFromApiToken;
    }

    public void setDeleteAccessListFromApiToken(int deleteAccessListFromApiToken) {
        this.deleteAccessListFromApiToken = deleteAccessListFromApiToken;
    }

    public int getDeleteNullSubCategoryIssues() {
        return deleteNullSubCategoryIssues;
    }

    public void setDeleteNullSubCategoryIssues(int deleteNullSubCategoryIssues) {
        this.deleteNullSubCategoryIssues = deleteNullSubCategoryIssues;
    }

    public int getEnableNewMerging() {
        return enableNewMerging;
    }

    public void setEnableNewMerging(int enableNewMerging) {
        this.enableNewMerging = enableNewMerging;
    }

    public int getEnableMergeAsyncOutside() {
        return enableMergeAsyncOutside;
    }

    public void setEnableMergeAsyncOutside(int enableMergeAsyncOutside) {
        this.enableMergeAsyncOutside = enableMergeAsyncOutside;
    }

    public int getAktoDefaultNewUI() {
        return aktoDefaultNewUI;
    }

    public void setAktoDefaultNewUI(int aktoDefaultNewUI) {
        this.aktoDefaultNewUI = aktoDefaultNewUI;
    }

    public int getComputeIntegratedConnections() {
        return computeIntegratedConnections;
    }

    public void setComputeIntegratedConnections(int computeIntegratedConnections) {
        this.computeIntegratedConnections = computeIntegratedConnections;
    }

    public int getInitializeOrganizationAccountBelongsTo() {
        return initializeOrganizationAccountBelongsTo;
    }

    public void setInitializeOrganizationAccountBelongsTo(int initializeOrganizationAccountBelongsTo) {
        this.initializeOrganizationAccountBelongsTo = initializeOrganizationAccountBelongsTo;
    }

    public int getOrgsInBilling() {
        return orgsInBilling;
    }

    public void setOrgsInBilling(int orgsInBilling) {
        this.orgsInBilling = orgsInBilling;
    }

    public int getDeleteLastCronRunInfo() {
        return deleteLastCronRunInfo;
    }

    public void setDeleteLastCronRunInfo(int deleteLastCronRunInfo) {
        this.deleteLastCronRunInfo = deleteLastCronRunInfo;
    }

    public int getDefaultTelemetrySettings() {
        return defaultTelemetrySettings;
    }

    public void setDefaultTelemetrySettings(int defaultTelemetrySettings) {
        this.defaultTelemetrySettings = defaultTelemetrySettings;
    }

    public int getMoveAuthMechanismToRole() {
        return this.moveAuthMechanismToRole;
    }

    public void setMoveAuthMechanismToRole(int moveAuthMechanismToRole) {
        this.moveAuthMechanismToRole = moveAuthMechanismToRole;
    }

    public int getLoginSignupGroups() {
        return loginSignupGroups;
    }

    public void setLoginSignupGroups(int loginSignupGroups) {
        this.loginSignupGroups = loginSignupGroups;
    }
    
    public int getVulnerableApiUpdationVersionV1() {
        return vulnerableApiUpdationVersionV1;
    }

    public void setVulnerableApiUpdationVersionV1(int vulnerableApiUpdationVersionV1) {
        this.vulnerableApiUpdationVersionV1 = vulnerableApiUpdationVersionV1;
    }

    public int getRiskScoreGroups() {
        return riskScoreGroups;
    }

    public void setRiskScoreGroups(int riskScoreGroups) {
        this.riskScoreGroups = riskScoreGroups;
    }
    
    public int getDeactivateCollections() {
        return deactivateCollections;
    }

    public void setDeactivateCollections(int deactivateCollections) {
        this.deactivateCollections = deactivateCollections;
    }

    public int getDisableAwsSecretPii() {
        return disableAwsSecretPii;
    }

    public void setDisableAwsSecretPii(int disableAwsSecretPii) {
        this.disableAwsSecretPii = disableAwsSecretPii;
    }

    public int getApiCollectionAutomatedField() {
        return apiCollectionAutomatedField;
    }

    public void setApiCollectionAutomatedField(int apiCollectionAutomatedField) {
        this.apiCollectionAutomatedField = apiCollectionAutomatedField;
    }

    public int getAutomatedApiGroups() {
        return automatedApiGroups;
    }

    public void setAutomatedApiGroups(int automatedApiGroups) {
        this.automatedApiGroups = automatedApiGroups;
    }

    public int getDropApiDependencies() {
        return dropApiDependencies;
    }

    public void setDropApiDependencies(int dropApiDependencies) {
        this.dropApiDependencies = dropApiDependencies;
    }
}
