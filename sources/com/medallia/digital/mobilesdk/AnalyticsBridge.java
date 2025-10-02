package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.j2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class AnalyticsBridge extends Observable implements m8 {
    private static final String ANALYTICS_TABLE_SIZE = "analyticsSize";
    private static final String CLEAR_DATA = "clearData";
    private static final String JSON_ACTION = "action";
    private static final String JSON_ACTION_BUTTONS_ENABLED = "actionButtonsEnabled";
    private static final String JSON_ACTIVITY_NAME = "activityName";
    private static final String JSON_APPEARANCE_MODE = "appearanceMode";
    private static final String JSON_APP_RATING_ID = "appRatingId";
    private static final String JSON_CUSTOM_PARAMETER_NAME = "customParameterName";
    private static final String JSON_CUSTOM_PARAMETER_NAMES = "customParameterNames";
    private static final String JSON_DB_SIZE = "dbSize";
    private static final String JSON_DEFERRED_REASON = "deferredReason";
    private static final String JSON_DELAY = "delay";
    private static final String JSON_DELIVERED_TIMESTAMP = "deliveredTimestamp";
    private static final String JSON_DURATION = "duration";
    private static final String JSON_END_TIME = "endTime";
    private static final String JSON_ENGAGEMENT_ID = "engagementId";
    private static final String JSON_ENGAGEMENT_TYPE = "engagementType";
    private static final String JSON_ERROR_CODE = "errorCode";
    private static final String JSON_ERROR_MESSAGE = "errorMessage";
    private static final String JSON_FEEDBACK_CLIENT_CORRELATION_ID = "feedbackClientCorrelationId";
    private static final String JSON_FEEDBACK_UUID = "feedbackUUID";
    private static final String JSON_FILE_PATH = "filePath";
    private static final String JSON_FORMS_RESOURCES_SIZE = "formsResourcesSize";
    private static final String JSON_FORM_ID = "formId";
    private static final String JSON_FORM_LOADING_TIME = "formLoadingTime";
    private static final String JSON_FORM_LOCALE_DISPLAY = "formLocaleDisplay";
    private static final String JSON_FORM_LOCALE_SET = "formLocaleSet";
    private static final String JSON_FORM_STATUS = "formStatus";
    private static final String JSON_FORM_TIME_TO_DISPLAY = "timeToDisplay";
    private static final String JSON_FORM_TRIGGER_TYPE = "formTriggerType";
    private static final String JSON_FORM_VIEW_TYPE = "formViewType";
    private static final String JSON_ID = "id";
    private static final String JSON_INITIATOR = "initiator";
    private static final String JSON_INTERFACE_TYPE = "interfaceType";
    private static final String JSON_INVITATION_SKIPPED_REASON = "invitationSkippedReason";
    private static final String JSON_INVITATION_TYPE = "invitationType";
    private static final String JSON_INVITE_TYPE = "inviteType";
    private static final String JSON_IS_FAST_LOADING_FORM = "isFastLoadingForm";
    private static final String JSON_IS_USER_ID_EMPTY = "isUserIdEmpty";
    private static final String JSON_IS_VALID = "isValid";
    private static final String JSON_KILLED_OS_VERSION = "killedOsVersion";
    private static final String JSON_KILLED_SDK_VERSION = "killedSdkVersion";
    private static final String JSON_KILL_SDK_TIMESTAMP = "killSdkTimestamp";
    private static final String JSON_LAST_SUBMIT_TIMESTAMP = "lastSubmitTimestamp";
    private static final String JSON_LOCALE = "locale";
    private static final String JSON_LOG_LEVEL = "logLevel";
    private static final String JSON_MEDIA_CAPTURE_CLIENT_CORRELATION_ID = "mediaCaptureClientCorrelationId";
    private static final String JSON_MEDIA_CHANNEL_ID = "channelId";
    private static final String JSON_MEDIA_TYPE_CAPTURE = "mediaTypeCapture";
    private static final String JSON_METHOD = "method";
    private static final String JSON_NUMBER_OF_FEEDBACKS = "numberOfFeedbacks";
    private static final String JSON_NUMBER_OF_RETRIES = "numberOfRetries";
    private static final String JSON_PAYLOAD_SIZE = "payloadSizeInKB";
    private static final String JSON_PREVIOUS_SESSION_ID = "previousSessionId";
    private static final String JSON_PRE_INIT = "preInit";
    private static final String JSON_REASON = "reason";
    private static final String JSON_RELOADING_FORM_NUMBER = "reloadingFormNumber";
    private static final String JSON_RESPONSE_CODE = "responseCode";
    private static final String JSON_RESTORE_TIME = "restoreTime";
    private static final String JSON_RESULT = "result";
    private static final String JSON_RESULT_FROM_JS = "resultFromJs";
    private static final String JSON_SESSION_INACTIVITY_TIME = "sessionInactivityTime";
    private static final String JSON_START_TIME = "startTime";
    private static final String JSON_STATUS = "status";
    private static final String JSON_STICKY_MODE = "stickyMode";
    private static final String JSON_SUBMISSION_BLOCK_REASON = "blockReason";
    private static final String JSON_SUBMISSION_TRIGGER = "submissionTrigger";
    private static final String JSON_SUBMITTED_TIMESTAMP = "submittedTimestamp";
    private static final String JSON_TARGET_ENGINE_SIZE = "targetEngineSize";
    private static final String JSON_TEMPLATES_SIZE = "templatesSize";
    private static final String JSON_TIMESTAMP_LAST_CACHED_DATA = "timestampLastCachedData";
    private static final String JSON_TIME_IN_BACKGROUND = "timeInBackground";
    private static final String JSON_TOTAL_DIRECTORY_SIZE = "totalDirectorySize";
    private static final String JSON_TYP_CLOSE_BUTTON = "closeButtonSelected";
    private static final String JSON_TYP_IMAGE = "image";
    private static final String JSON_URL = "url";
    private static final String UJ_TABLE_SIZE = "ujSize";
    private static AnalyticsBridge instance;
    private boolean isDigitalAnalyticsEnabled;
    private boolean isSdkRunning;
    private final ArrayList<k> pendingEvents = new ArrayList<>();
    private final ArrayList<Pair<b, JSONObject>> preInitEvents = new ArrayList<>();
    private final j analyticsGenerator = new j();
    private boolean isTreResourceReady = false;
    private boolean isFormResourcesReady = false;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16311a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.pending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.failure.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f16311a = iArr2;
            try {
                iArr2[b.init.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16311a[b.initCallback.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16311a[b.initOfflineMechanism.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16311a[b.disableIntercept.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16311a[b.enableIntercept.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16311a[b.logger.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16311a[b.setCustomParameter.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16311a[b.setCustomParameters.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16311a[b.updateCustomLocale.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16311a[b.setCustomAppearance.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16311a[b.internalError.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16311a[b.setActivity.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16311a[b.stopSDK.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16311a[b.revertStopSDK.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16311a[b.setFormListener.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f16311a[b.setFeedbackListener.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f16311a[b.setInvitationListener.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f16311a[b.setInterceptListener.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f16311a[b.setCustomInterceptListener.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f16311a[b.preloadMechanism.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f16311a[b.deleteStorage.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f16311a[b.restoreFromKillSDK.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f16311a[b.restClient.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f16311a[b.setUserId.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public enum b {
        init,
        initCallback,
        initOfflineMechanism,
        disableIntercept,
        enableIntercept,
        logger,
        setCustomParameter,
        setCustomParameters,
        updateCustomLocale,
        internalError,
        crash,
        setActivity,
        stopSDK,
        revertStopSDK,
        setFormListener,
        setFeedbackListener,
        setInvitationListener,
        setInterceptListener,
        setCustomInterceptListener,
        preloadMechanism,
        deleteStorage,
        restoreFromKillSDK,
        setCustomAppearance,
        restClient,
        setUserId,
        setTouchEventListener
    }

    public enum c {
        success,
        failure,
        pending
    }

    private void deleteStorageV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.i(jSONObject));
    }

    private void disableInterceptV2() {
        reportOrStashToPending(this.analyticsGenerator.a());
    }

    private void enableInterceptV2() {
        reportOrStashToPending(this.analyticsGenerator.b());
    }

    private JSONArray getAndClearInitCallbackEventsFromStorage() {
        String strA;
        SharedPreferences sharedPreferencesC = d7.b().c();
        d7.a aVar = d7.a.INIT_CALLBACK_EVENT;
        JSONArray jSONArray = null;
        if (sharedPreferencesC.contains(aVar.toString()) && (strA = d7.b().a(aVar, (String) null)) != null) {
            try {
                JSONArray jSONArray2 = new JSONArray(strA);
                try {
                    d7.b().a(aVar);
                    return jSONArray2;
                } catch (Exception e) {
                    e = e;
                    jSONArray = jSONArray2;
                    a4.c(e.getMessage());
                    return jSONArray;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return jSONArray;
    }

    public static AnalyticsBridge getInstance() {
        if (instance == null) {
            instance = new AnalyticsBridge();
        }
        return instance;
    }

    private void initCallbackV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.s(jSONObject));
    }

    private void initOfflineMechanismV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.t(jSONObject));
    }

    private void initV2() {
        reportOrStashToPending(this.analyticsGenerator.c());
    }

    private void internalErrorV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.v(jSONObject));
    }

    private void loggerV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.E(jSONObject));
    }

    private void preloadMechanismV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.J(jSONObject));
    }

    private void report(k kVar) {
        if (this.isDigitalAnalyticsEnabled) {
            setChanged();
            notifyObservers(kVar);
        }
    }

    private void reportRestClientV2Event(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.R(jSONObject));
    }

    private void restoreFromKillSDKV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.S(jSONObject));
    }

    private void revertStopSDKV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.T(jSONObject));
    }

    private void setActivityV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.U(jSONObject));
    }

    private void setCustomAppearanceV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.V(jSONObject));
    }

    private void setCustomInterceptListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.d());
    }

    private void setCustomParameterV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.X(jSONObject));
    }

    private void setCustomParametersV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.Y(jSONObject));
    }

    private void setFeedbackListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.e());
    }

    private void setFormListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.f());
    }

    private void setInterceptListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.g());
    }

    private void setInvitationListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.h());
    }

    private void setTouchEventListenerV2() {
        reportOrStashToPending(this.analyticsGenerator.i());
    }

    private void setUserIdV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.c0(jSONObject));
    }

    private void stopSDKV2(JSONObject jSONObject) throws JSONException {
        f1.a().b(this.analyticsGenerator.f0(jSONObject));
    }

    private void updateCustomLocaleV2(JSONObject jSONObject) {
        reportOrStashToPending(this.analyticsGenerator.l0(jSONObject));
    }

    public void addObserverToAnalyticsItems(Observer observer) {
        addObserver(observer);
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a(getClass().getSimpleName());
        deleteObservers();
        this.pendingEvents.clear();
        this.isSdkRunning = false;
        instance = null;
    }

    public String exportPendingEventsToJson() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<k> it = this.pendingEvents.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next != null) {
                    jSONArray.put(next.toJsonString());
                }
            }
            return jSONArray.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public void initAnalytics(boolean z, r1 r1Var, i iVar, HashMap<String, Object> map) {
        this.isDigitalAnalyticsEnabled = z;
        this.isSdkRunning = true;
        this.analyticsGenerator.a(iVar, map, z, r1Var);
    }

    public void regeneratePreInitEvents() throws JSONException {
        if (!this.preInitEvents.isEmpty()) {
            Iterator<Pair<b, JSONObject>> it = this.preInitEvents.iterator();
            while (it.hasNext()) {
                Pair<b, JSONObject> next = it.next();
                b bVar = (b) next.first;
                if (bVar != null) {
                    switch (a.f16311a[bVar.ordinal()]) {
                        case 1:
                            initV2();
                            break;
                        case 2:
                            initCallbackV2((JSONObject) next.second);
                            break;
                        case 3:
                            initOfflineMechanismV2((JSONObject) next.second);
                            break;
                        case 4:
                            disableInterceptV2();
                            break;
                        case 5:
                            enableInterceptV2();
                            break;
                        case 6:
                            loggerV2((JSONObject) next.second);
                            break;
                        case 7:
                            setCustomParameterV2((JSONObject) next.second);
                            break;
                        case 8:
                            setCustomParametersV2((JSONObject) next.second);
                            break;
                        case 9:
                            updateCustomLocaleV2((JSONObject) next.second);
                            break;
                        case 10:
                            setCustomAppearanceV2((JSONObject) next.second);
                            break;
                        case 11:
                            internalErrorV2((JSONObject) next.second);
                            break;
                        case 12:
                            setActivityV2((JSONObject) next.second);
                            break;
                        case 13:
                            stopSDKV2((JSONObject) next.second);
                            break;
                        case 14:
                            revertStopSDKV2((JSONObject) next.second);
                            break;
                        case 15:
                            setFormListenerV2();
                            break;
                        case 16:
                            setFeedbackListenerV2();
                            break;
                        case 17:
                            setInvitationListenerV2();
                            break;
                        case 18:
                            setInterceptListenerV2();
                            break;
                        case 19:
                            setCustomInterceptListenerV2();
                            break;
                        case 20:
                            preloadMechanismV2((JSONObject) next.second);
                            break;
                        case 21:
                            deleteStorageV2((JSONObject) next.second);
                            break;
                        case 22:
                            restoreFromKillSDKV2((JSONObject) next.second);
                            break;
                        case 23:
                            reportRestClientV2Event((JSONObject) next.second);
                            break;
                        case 24:
                            setUserIdV2((JSONObject) next.second);
                            break;
                    }
                }
            }
            this.preInitEvents.clear();
        }
        JSONArray andClearInitCallbackEventsFromStorage = getAndClearInitCallbackEventsFromStorage();
        if (andClearInitCallbackEventsFromStorage != null) {
            for (int i = 0; i < andClearInitCallbackEventsFromStorage.length(); i++) {
                try {
                    initCallbackV2(andClearInitCallbackEventsFromStorage.getJSONObject(i));
                } catch (Exception e) {
                    a4.c(e.getMessage());
                }
            }
        }
    }

    public void reportAnalyticsSubmissionBlockedEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = com.salesforce.marketingcloud.messages.iam.j.h;
            }
            jSONObject.put(JSON_SUBMISSION_TRIGGER, str);
            jSONObject.put(JSON_SUBMISSION_BLOCK_REASON, "submissionInProgress");
            reportOrStashToPending(this.analyticsGenerator.a(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportCloseEngagementEvent(String str, String str2, String str3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INTERFACE_TYPE, str2);
            jSONObject.put(JSON_ENGAGEMENT_ID, str3);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str);
            reportOrStashToPending(this.analyticsGenerator.b(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportCodeFormReadyEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.c(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportCustomInterceptAcceptedEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(this.analyticsGenerator.d(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportCustomInterceptDeclinedEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(this.analyticsGenerator.e(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportCustomInterceptDeferredEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(this.analyticsGenerator.f(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportCustomInterceptSkippedEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_ENGAGEMENT_ID, str);
            reportOrStashToPending(this.analyticsGenerator.g(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportCustomInterceptTriggerCallbackEvent(c cVar, String str, String str2, Integer num, String str3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, cVar);
            jSONObject.put("id", str);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str2);
            jSONObject.put("errorCode", num);
            jSONObject.put("errorMessage", str3);
            reportOrStashToPending(this.analyticsGenerator.h(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportDeleteStorageEvent(String str, boolean z) throws JSONException {
        try {
            c cVar = z ? c.success : c.failure;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FILE_PATH, str);
            jSONObject.put(JSON_STATUS, cVar);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                deleteStorageV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.deleteStorage, jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportDisableInterceptEvent() {
        if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
            disableInterceptV2();
        } else {
            this.preInitEvents.add(new Pair<>(b.disableIntercept, null));
        }
    }

    public void reportEnableInterceptEvent() {
        if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
            enableInterceptV2();
        } else {
            this.preInitEvents.add(new Pair<>(b.enableIntercept, null));
        }
    }

    public void reportFeedbackRetryMechanismEvent(int i) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_NUMBER_OF_FEEDBACKS, i);
            reportOrStashToPending(this.analyticsGenerator.j(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportFormClosedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.k(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportFormDismissedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.l(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportFormDisplayedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType, long j, String str2, String str3, MDAppearanceMode mDAppearanceMode) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_TIME_TO_DISPLAY, j);
            jSONObject.put(JSON_FORM_LOCALE_SET, str2);
            jSONObject.put(JSON_FORM_LOCALE_DISPLAY, str3);
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            reportOrStashToPending(this.analyticsGenerator.m(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportFormLoadSpinnerEvent(String str, Long l, FormViewType formViewType, FormTriggerType formTriggerType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_DELAY, l);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType);
            reportOrStashToPending(this.analyticsGenerator.n(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportFormLoadedEvent(String str, FormTriggerType formTriggerType, long j, FormViewType formViewType, boolean z, int i) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_LOADING_TIME, j);
            jSONObject.put(JSON_IS_FAST_LOADING_FORM, z ? 1 : 0);
            jSONObject.put(JSON_RELOADING_FORM_NUMBER, i);
            reportOrStashToPending(this.analyticsGenerator.o(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportFormSubmittedEvent(String str, FormTriggerType formTriggerType, long j, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_LAST_SUBMIT_TIMESTAMP, j);
            reportOrStashToPending(this.analyticsGenerator.p(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportFormThankYouPromptEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType, boolean z, boolean z2, MDAppearanceMode mDAppearanceMode) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_TYP_CLOSE_BUTTON, z);
            jSONObject.put(JSON_TYP_IMAGE, z2);
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            reportOrStashToPending(this.analyticsGenerator.q(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportHandleNotificationEvent(String str, FormViewType formViewType, boolean z, c cVar, MDExternalError mDExternalError) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_PRE_INIT, z);
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put("errorCode", mDExternalError != null ? Integer.valueOf(mDExternalError.getErrorCode()) : null);
            jSONObject.put("errorMessage", mDExternalError != null ? mDExternalError.getMessage() : null);
            reportOrStashToPending(this.analyticsGenerator.r(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportInitCallbackEvent(c cVar, Integer num, String str, long j) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put("errorCode", num);
            jSONObject.put("errorMessage", str);
            jSONObject.put(JSON_DURATION, j);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                initCallbackV2(jSONObject);
                return;
            }
            if (cVar != c.failure) {
                this.preInitEvents.add(new Pair<>(b.initCallback, jSONObject));
                return;
            }
            d7 d7VarB = d7.b();
            d7.a aVar = d7.a.INIT_CALLBACK_EVENT;
            String strA = d7VarB.a(aVar, (String) null);
            JSONArray jSONArray = strA == null ? new JSONArray() : new JSONArray(strA);
            jSONArray.put(jSONObject);
            d7.b().b(aVar, jSONArray.toString());
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportInitEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                initV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.init, null));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportInitOfflineMechanismEvent(long j) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_TIMESTAMP_LAST_CACHED_DATA, j);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                initOfflineMechanismV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.initOfflineMechanism, jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportInterceptMechanismEvent(long j, long j2, String str, Reason reason, c cVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_INVITATION_SKIPPED_REASON, reason == null ? null : reason.name());
            jSONObject.put(JSON_STATUS, cVar != null ? cVar.name() : null);
            reportOrStashToPending(this.analyticsGenerator.u(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportInternalErrorEvent(int i, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", i);
            jSONObject.put("errorMessage", str);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                internalErrorV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.internalError, jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportInvitationAcceptedEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_STICKY_MODE, e3Var != null ? e3Var.b() : e3.c.No.toString());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var != null && e3Var.c());
            reportOrStashToPending(this.analyticsGenerator.w(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportInvitationDeclinedEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            jSONObject.put(JSON_REASON, e3Var.a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.x(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportInvitationDeferredEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            jSONObject.put(JSON_REASON, e3Var.a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            reportOrStashToPending(this.analyticsGenerator.y(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportInvitationDisplayedEvent(String str, String str2, e3 e3Var, MDAppearanceMode mDAppearanceMode) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var != null && e3Var.c());
            jSONObject.put(JSON_STICKY_MODE, e3Var != null ? e3Var.b() : e3.c.No.toString());
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode != null ? mDAppearanceMode.toString() : "null");
            reportOrStashToPending(this.analyticsGenerator.z(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportLoadingIndicatorClosedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.A(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportLoadingIndicatorCompletedEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.B(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportLoadingIndicatorShownEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.C(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportLoadingIndicatorTimeoutEvent(String str, FormTriggerType formTriggerType, FormViewType formViewType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            reportOrStashToPending(this.analyticsGenerator.D(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportLoggerEvent(MDLogLevel mDLogLevel) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_LOG_LEVEL, mDLogLevel != null ? mDLogLevel.toString() : null);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                loggerV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.logger, jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public boolean reportMedalliaCrashEventImmediate(String str, long j, String str2, Long l) throws JSONException {
        try {
            if (!this.isSdkRunning) {
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_REASON, str);
            jSONObject.put("propertyId", l);
            jSONObject.put("deviceId", d7.b().a(d7.a.DEVICE_ID, (String) null));
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("osName", "Android");
            jSONObject.put(lllqqql.cc006300630063cc, "4.8.1");
            k kVarA = this.analyticsGenerator.a(jSONObject, str2, j);
            if (kVarA != null) {
                return f1.a().b(kVarA);
            }
            return true;
        } catch (Exception e) {
            a4.c(e.getMessage());
            return false;
        }
    }

    public void reportMediaCaptureCollectedEvent(e5 e5Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_ID, e5Var.getFormId());
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, e5Var.b() != null ? e5Var.b() : UUID.randomUUID().toString());
            jSONObject.put(JSON_MEDIA_TYPE_CAPTURE, j5.d(e5Var.f()));
            jSONObject.put(JSON_MEDIA_CAPTURE_CLIENT_CORRELATION_ID, e5Var.d());
            reportOrStashToPending(this.analyticsGenerator.F(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportMediaCaptureSubmitEvent(e5 e5Var, c cVar, MDExternalError mDExternalError, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_ID, e5Var.getFormId());
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, e5Var.b() != null ? e5Var.b() : UUID.randomUUID().toString());
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put(JSON_MEDIA_CHANNEL_ID, str);
            jSONObject.put(JSON_MEDIA_CAPTURE_CLIENT_CORRELATION_ID, e5Var.d());
            jSONObject.put("errorMessage", mDExternalError != null ? mDExternalError.getMessage() : null);
            reportOrStashToPending(this.analyticsGenerator.G(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportMediaFeedbackRetryMechanismEvent(int i) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_NUMBER_OF_FEEDBACKS, i);
            reportOrStashToPending(this.analyticsGenerator.H(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportNativeTargetEvaluatorEvent(long j, long j2, String str, j2.a aVar, String str2, String str3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_STATUS, aVar != null ? aVar.name() : null);
            jSONObject.put("result", str2);
            jSONObject.put(JSON_INITIATOR, str3);
            reportOrStashToPending(this.analyticsGenerator.I(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportOrStashToPending(k kVar) {
        if (!this.isDigitalAnalyticsEnabled || kVar == null) {
            return;
        }
        if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
            report(kVar);
        } else {
            this.pendingEvents.add(kVar);
        }
    }

    public void reportPreloadMechanismEvent(long j, long j2, String str, j2.a aVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_STATUS, aVar != null ? aVar.name() : null);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                preloadMechanismV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.preloadMechanism, jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportPromptAcceptedEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            reportOrStashToPending(this.analyticsGenerator.K(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportPromptDeclinedEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            jSONObject.put(JSON_REASON, e3Var.a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            reportOrStashToPending(this.analyticsGenerator.L(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportPromptDeferredEvent(String str, String str2, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            jSONObject.put(JSON_REASON, e3Var.a());
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            reportOrStashToPending(this.analyticsGenerator.M(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportPromptDisplayedEvent(String str, String str2, e3 e3Var, MDAppearanceMode mDAppearanceMode) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_INVITATION_TYPE, str2);
            jSONObject.put(JSON_APP_RATING_ID, str);
            jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
            jSONObject.put(JSON_STICKY_MODE, e3Var.b());
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            reportOrStashToPending(this.analyticsGenerator.N(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportPromptTriggeredEvent(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_APP_RATING_ID, str);
            reportOrStashToPending(this.analyticsGenerator.O(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportRefreshSessionEvent(long j, long j2, long j3, long j4, String str, c cVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put(JSON_TIME_IN_BACKGROUND, j3);
            jSONObject.put(JSON_SESSION_INACTIVITY_TIME, j4);
            jSONObject.put(JSON_PREVIOUS_SESSION_ID, str);
            jSONObject.put(JSON_STATUS, cVar != null ? cVar.name() : null);
            reportOrStashToPending(this.analyticsGenerator.P(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportResourcesSizeEvent() throws JSONException {
        Double maxDbFileSizeInMb;
        if (!this.isTreResourceReady || !this.isFormResourcesReady) {
            a4.e("Can't report ResourcesSizeEvent, Resources not ready yet");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_TARGET_ENGINE_SIZE, g2.e());
            jSONObject.put(JSON_FORMS_RESOURCES_SIZE, g2.c());
            jSONObject.put(JSON_TEMPLATES_SIZE, g2.f());
            jSONObject.put(JSON_TOTAL_DIRECTORY_SIZE, g2.b());
            jSONObject.put(JSON_DB_SIZE, f1.a().c());
            try {
                maxDbFileSizeInMb = t0.c().a().getSdkConfiguration().getMedalliaDigitalBrain().getMaxDbFileSizeInMb();
            } catch (Exception unused) {
                a4.b("Unable to get maxDbFileSize from config, use default value");
                maxDbFileSizeInMb = null;
            }
            if (f1.a().a(maxDbFileSizeInMb)) {
                jSONObject.put(ANALYTICS_TABLE_SIZE, f1.a().c(b0.a.AnalyticsData));
                jSONObject.put(UJ_TABLE_SIZE, f1.a().c(b0.a.UserJourneyData));
            }
            reportOrStashToPending(this.analyticsGenerator.Q(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportRestClientEvent(long j, long j2, String str, int i, int i2, Double d) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put("url", str);
            jSONObject.put(JSON_RESPONSE_CODE, i);
            jSONObject.put(JSON_NUMBER_OF_RETRIES, i2);
            jSONObject.put(JSON_PAYLOAD_SIZE, d);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                reportRestClientV2Event(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.restClient, jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportRestoreFromKillSDKEvent(long j) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_RESTORE_TIME, j);
            jSONObject.put(JSON_KILL_SDK_TIMESTAMP, d7.b().a(d7.a.SDK_KILL_TIMESTAMP, 0L));
            jSONObject.put(JSON_KILLED_SDK_VERSION, d7.b().a(d7.a.LAST_SDK_VERSION, (String) null));
            jSONObject.put(JSON_KILLED_OS_VERSION, d7.b().a(d7.a.LAST_OS_VERSION, (String) null));
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                restoreFromKillSDKV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.restoreFromKillSDK, jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportRevertStopSdkEvent() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                revertStopSDKV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.revertStopSDK, jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetActivityEvent(Activity activity) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (activity != null) {
                jSONObject.put(JSON_ACTIVITY_NAME, activity.getClass().getSimpleName());
            }
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setActivityV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setActivity, jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetCustomAppearanceEvent(MDAppearanceMode mDAppearanceMode) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_APPEARANCE_MODE, mDAppearanceMode.toString());
            setCustomAppearanceV2(jSONObject);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetCustomInterceptCallbackEvent(String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", str);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str2);
            reportOrStashToPending(this.analyticsGenerator.W(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetCustomInterceptListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setCustomInterceptListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setCustomInterceptListener, null));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetCustomParameterEvent(String str) throws JSONException {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_CUSTOM_PARAMETER_NAME, str);
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setCustomParameterV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setCustomParameter, jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetCustomParametersEvent(Map<String, Object> map, boolean z) throws JSONException {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = map.keySet().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put(JSON_CUSTOM_PARAMETER_NAMES, jSONArray);
                jSONObject.put(JSON_PRE_INIT, z);
                if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                    setCustomParametersV2(jSONObject);
                    return;
                }
                this.preInitEvents.add(new Pair<>(b.setCustomParameters, jSONObject));
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
    }

    public void reportSetFeedbackCallbackEvent(String str, String str2, FormTriggerType formTriggerType, String str3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, str);
            jSONObject.put(JSON_FORM_ID, str2);
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, str3);
            reportOrStashToPending(this.analyticsGenerator.Z(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetFeedbackListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setFeedbackListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setFeedbackListener, null));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetFormCallbackEvent(String str, String str2, FormTriggerType formTriggerType) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, str);
            jSONObject.put(JSON_FORM_ID, str2);
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, formTriggerType != null ? formTriggerType.toString() : null);
            reportOrStashToPending(this.analyticsGenerator.a0(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetFormListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setFormListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setFormListener, null));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetInterceptCallbackEvent(String str, String str2, String str3, String str4, e3 e3Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, str);
            jSONObject.put("id", str2);
            jSONObject.put(JSON_INVITE_TYPE, str3);
            jSONObject.put(JSON_ENGAGEMENT_TYPE, str4);
            if (e3Var != null) {
                jSONObject.put(JSON_STICKY_MODE, e3Var.b());
                jSONObject.put(JSON_ACTION_BUTTONS_ENABLED, e3Var.c());
                if (e3Var.d()) {
                    jSONObject.put(JSON_DEFERRED_REASON, e3Var.a());
                }
            }
            reportOrStashToPending(this.analyticsGenerator.b0(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetInterceptListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setInterceptListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setInterceptListener, null));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    @Deprecated
    public void reportSetInvitationListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setInvitationListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setInvitationListener, null));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetTouchEventListenerEvent() {
        try {
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                setTouchEventListenerV2();
                return;
            }
            this.preInitEvents.add(new Pair<>(b.setTouchEventListener, null));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSetUserIdEvent(Boolean bool) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_IS_USER_ID_EMPTY, bool);
            setUserIdV2(jSONObject);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportShowFormCallbackEvent(c cVar, Integer num, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_METHOD, cVar != null ? cVar.name() : null);
            jSONObject.put("errorCode", num);
            jSONObject.put("errorMessage", str);
            reportOrStashToPending(this.analyticsGenerator.d0(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportShowFormEvent(String str, FormViewType formViewType, boolean z) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FORM_VIEW_TYPE, formViewType != null ? formViewType.toString() : null);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_IS_FAST_LOADING_FORM, z ? 1 : 0);
            reportOrStashToPending(this.analyticsGenerator.e0(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportStopSDKEventImmediated(boolean z) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CLEAR_DATA, z);
            f1.a().b(new c0(jSONObject, GroupType.api, Lifetime.Application, "StopSDK"));
            if (this.isSdkRunning && CollectorsInfrastructure.getInstance().isInitialized()) {
                stopSDKV2(jSONObject);
                return;
            }
            this.preInitEvents.add(new Pair<>(b.stopSDK, jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportSubmitFeedbackEvent(c2 c2Var, long j, c cVar, String str) throws JSONException {
        k kVarI0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_FEEDBACK_CLIENT_CORRELATION_ID, c2Var.b() != null ? c2Var.b() : UUID.randomUUID().toString());
            jSONObject.put(JSON_FEEDBACK_UUID, str);
            jSONObject.put(JSON_SUBMITTED_TIMESTAMP, c2Var.e());
            jSONObject.put(JSON_DELIVERED_TIMESTAMP, j);
            jSONObject.put(JSON_NUMBER_OF_RETRIES, c2Var.d());
            jSONObject.put(JSON_FORM_TRIGGER_TYPE, c2Var.c() != null ? c2Var.c().toString() : null);
            jSONObject.put(JSON_FORM_ID, c2Var.getFormId());
            int i = a.b[cVar.ordinal()];
            if (i == 1) {
                kVarI0 = this.analyticsGenerator.i0(jSONObject);
            } else if (i == 2) {
                kVarI0 = this.analyticsGenerator.h0(jSONObject);
            } else if (i != 3) {
                return;
            } else {
                kVarI0 = this.analyticsGenerator.g0(jSONObject);
            }
            reportOrStashToPending(kVarI0);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportTargetEvaluatorEvent(long j, long j2, String str, j2.a aVar, String str2, String str3) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_START_TIME, j);
            jSONObject.put(JSON_END_TIME, j2);
            jSONObject.put(JSON_FORM_ID, str);
            jSONObject.put(JSON_FORM_STATUS, aVar != null ? aVar.name() : null);
            jSONObject.put(JSON_RESULT_FROM_JS, str2);
            jSONObject.put(JSON_INITIATOR, str3);
            reportOrStashToPending(this.analyticsGenerator.j0(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void reportTouchEventCallbackEvent(int i) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", i);
            reportOrStashToPending(this.analyticsGenerator.k0(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public void setFormResourcesReady(boolean z) {
        this.isFormResourcesReady = z;
    }

    public void setTreResourceReady(boolean z) {
        this.isTreResourceReady = z;
    }

    public void updateCustomLocaleEvent(String str, boolean z) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("locale", str);
            jSONObject.put(JSON_IS_VALID, z);
            reportOrStashToPending(this.analyticsGenerator.l0(jSONObject));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }
}
