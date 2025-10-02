package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityManager;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.google.android.gms.ads.AdError;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.c5;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.x3;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class BaseFormCommunicator implements LifeCycle.h {
    public static final String DEFAULT_FONT_SCALE = "1.0";
    static final int DELAY = 500;
    j2 formData;
    String formId;
    FormTriggerType formTriggerType;
    FormViewType formViewType;
    private final boolean isFeedbackSubmitIndicatorEnabled;
    i2 listener;
    y3 localizationContract;
    e5 mediaData;
    g5 mediaDataFromJS;
    private final Integer textAreaLimit;
    ArrayList<String> unSupportedVideoFormats;
    Map<String, JSONObject> runAsyncResults = new ConcurrentHashMap();
    String uniqueFunctionResult = null;
    String feedbackClientCorrelationId = null;
    boolean audioRecording = false;
    boolean hasMediaData = false;
    final Handler handler = new Handler(Looper.getMainLooper());

    public class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16314a;

        public a(String str) {
            this.f16314a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            Toast.makeText(i4.c().b(), this.f16314a, 0).show();
        }
    }

    public class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f16315a;

        public b(ArrayList arrayList) {
            this.f16315a = arrayList;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            a4.e("List of Permissions Granted : " + this.f16315a);
            Activity activity = (Activity) i4.c().d().getBaseContext();
            String strD = BaseFormCommunicator.this.mediaDataFromJS.d();
            if (this.f16315a.isEmpty() || strD == null) {
                int i = c.b[j5.a(strD).ordinal()];
                c5.b().b(i != 1 ? i != 2 ? null : "android.permission.RECORD_AUDIO" : "android.permission.CAMERA");
                BaseFormCommunicator.this.handlePermissionsDenied();
                return;
            }
            int i2 = c.b[j5.a(strD).ordinal()];
            if (i2 == 1) {
                if (this.f16315a.contains("android.permission.CAMERA")) {
                    c5.b().a(activity, BaseFormCommunicator.this.mediaDataFromJS.e());
                }
            } else if (i2 == 2 && this.f16315a.contains("android.permission.RECORD_AUDIO")) {
                BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                c5 c5VarB = c5.b();
                BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
                baseFormCommunicator.mediaData = c5VarB.a(strD, baseFormCommunicator2.formId, baseFormCommunicator2.formData.b(), BaseFormCommunicator.this.mediaDataFromJS.c());
                BaseFormCommunicator baseFormCommunicator3 = BaseFormCommunicator.this;
                baseFormCommunicator3.handleResponse(baseFormCommunicator3.mediaData, c5.k.allowAudioPermission);
                BaseFormCommunicator.this.audioRecording = true;
            }
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16316a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j5.values().length];
            b = iArr;
            try {
                iArr[j5.video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[j5.audio.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[z4.values().length];
            f16316a = iArr2;
            try {
                iArr2[z4.select.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16316a[z4.end.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class d extends v4 {
        public d() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            a4.b(YU.a.o(new StringBuilder("FormId: "), BaseFormCommunicator.this.formId, " ready"));
            i2 i2Var = BaseFormCommunicator.this.listener;
            if (i2Var != null) {
                i2Var.onReady();
            }
        }
    }

    public class e extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16318a;

        public e(String str) {
            this.f16318a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (d7.b().a(d7.a.SDK_STOPPED, false)) {
                a4.e("Feedback can’t be sent because of stop sdk");
                return;
            }
            if (new m3().b()) {
                a4.e("Submit sdk was cancelled by sdk kill");
                return;
            }
            a4.e("FormId: " + BaseFormCommunicator.this.formId + " sendFeedbackToMobileSdk was called - feedbackData = " + this.f16318a);
            BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
            if (baseFormCommunicator.mediaData != null) {
                baseFormCommunicator.hasMediaData = true;
            }
            baseFormCommunicator.notifySendFeedback();
            s7.e().b(BaseFormCommunicator.this.formId);
            String str = this.f16318a;
            if (str == null || str.equals(AdError.UNDEFINED_DOMAIN) || this.f16318a.isEmpty()) {
                a4.e("Submit feedback data - null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(this.f16318a);
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject.has("uuid") && !jSONObject.isNull("uuid")) {
                    BaseFormCommunicator.this.feedbackClientCorrelationId = jSONObject.getString("uuid");
                    jSONObject2.put("uuid", l3.a((Object) BaseFormCommunicator.this.feedbackClientCorrelationId));
                }
                if (jSONObject.has("dynamicData") && !jSONObject.isNull("dynamicData")) {
                    jSONObject2.put("dynamicData", l3.a(jSONObject.getJSONObject("dynamicData")));
                }
                t4 t4VarE = t4.e();
                d7.a aVar = d7.a.OCQ_USER_ID;
                if (t4VarE.a(aVar) != null && !t4.e().a(aVar).isEmpty()) {
                    jSONObject.put("cuid", t4.e().a(aVar));
                }
                BaseFormCommunicator.this.sendFeedbackPayloadAndUpdateRatingCollectors(jSONObject2);
                BaseFormCommunicator.this.addMobileDeviceData(jSONObject);
                BaseFormCommunicator.this.addFormMissingData(jSONObject);
                BaseFormCommunicator.this.addBridgeData(jSONObject);
                BaseFormCommunicator.this.separateCustomParams(jSONObject);
                jSONObject.put("appearanceMode", v7.c().a());
                j2 j2Var = BaseFormCommunicator.this.formData;
                if (j2Var != null && j2Var.getInviteData() != null) {
                    jSONObject.put("mobileInvitationType", BaseFormCommunicator.this.formData.getInviteData().getType());
                }
                BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
                String string = jSONObject.toString();
                String string2 = jSONObject2.has("uuid") ? jSONObject2.getString("uuid") : null;
                BaseFormCommunicator baseFormCommunicator3 = BaseFormCommunicator.this;
                baseFormCommunicator2.sendFeedback(new c2(string, string2, baseFormCommunicator3.formId, baseFormCommunicator3.formTriggerType, System.currentTimeMillis(), 0));
                BaseFormCommunicator baseFormCommunicator4 = BaseFormCommunicator.this;
                e5 e5Var = baseFormCommunicator4.mediaData;
                if (e5Var != null) {
                    if (baseFormCommunicator4.audioRecording) {
                        c5.b().a(BaseFormCommunicator.this.mediaData.e());
                        return;
                    }
                    e5Var.a(baseFormCommunicator4.feedbackClientCorrelationId);
                    p4 p4VarD = p4.d();
                    BaseFormCommunicator baseFormCommunicator5 = BaseFormCommunicator.this;
                    p4VarD.a(baseFormCommunicator5.mediaData, baseFormCommunicator5.getMediaCapture(), Boolean.valueOf(BaseFormCommunicator.this.isPreviewApp()));
                    if (BaseFormCommunicator.this.isPreviewApp()) {
                        return;
                    }
                    AnalyticsBridge.getInstance().reportMediaCaptureCollectedEvent(BaseFormCommunicator.this.mediaData);
                }
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
    }

    public class f extends v4 {
        public f() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            a4.e(YU.a.o(new StringBuilder("FormId: "), BaseFormCommunicator.this.formId, " submitSuccess was called"));
            BaseFormCommunicator.this.notifySendFeedback();
        }
    }

    public class g extends v4 {
        public g() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            i2 i2Var = BaseFormCommunicator.this.listener;
            if (i2Var != null) {
                i2Var.onClose();
                a4.e(YU.a.o(new StringBuilder("FormId: "), BaseFormCommunicator.this.formId, " close was called"));
            }
        }
    }

    public class h implements a5<z4> {
        public h() {
        }

        @Override // com.medallia.digital.mobilesdk.a5
        public void a(z4 z4Var) {
            BaseFormCommunicator.this.createMediaData();
        }
    }

    public class i extends v4 {
        public i() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
            c5 c5VarB = c5.b();
            BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
            baseFormCommunicator.mediaData = c5VarB.a(baseFormCommunicator2.mediaDataFromJS, baseFormCommunicator2.formData, baseFormCommunicator2.isPreviewApp());
            BaseFormCommunicator baseFormCommunicator3 = BaseFormCommunicator.this;
            if (baseFormCommunicator3.mediaData != null) {
                baseFormCommunicator3.handleResponse(null, c5.k.allowAudioPermission);
                BaseFormCommunicator.this.audioRecording = true;
            }
        }
    }

    public class j implements a5<z4> {
        public j() {
        }

        @Override // com.medallia.digital.mobilesdk.a5
        public void a(z4 z4Var) {
            try {
                BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                baseFormCommunicator.invokeJSResponse(baseFormCommunicator.uniqueFunctionResult, new JSONObject().put("response", z4Var));
                e5 e5Var = BaseFormCommunicator.this.mediaData;
                if (e5Var != null) {
                    g2.c(e5Var.e());
                    BaseFormCommunicator.this.mediaData = null;
                }
            } catch (JSONException e) {
                a4.c("Message" + e.getMessage());
            }
        }
    }

    public class k extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z4 f16324a;
        final /* synthetic */ a5 b;
        final /* synthetic */ j2 c;

        public k(z4 z4Var, a5 a5Var, j2 j2Var) {
            this.f16324a = z4Var;
            this.b = a5Var;
            this.c = j2Var;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            c5.b().a(this.f16324a, this.b, this.c, BaseFormCommunicator.this.isPreviewApp());
        }
    }

    public class l extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f16325a;

        public class a extends v4 {
            public a() {
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                c5.b().c();
            }
        }

        public class b extends v4 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f16327a;
            final /* synthetic */ String b;

            public class a implements a5<z4> {
                public a() {
                }

                @Override // com.medallia.digital.mobilesdk.a5
                public void a(z4 z4Var) {
                    if (b.this.f16327a.equals(j5.upload.toString())) {
                        g2.c(b.this.b);
                        c5.b().a((Activity) i4.c().d().getBaseContext());
                    } else {
                        g2.c(b.this.b);
                        c5.b().a((Activity) i4.c().d().getBaseContext(), BaseFormCommunicator.this.mediaDataFromJS.e());
                    }
                }
            }

            public b(String str, String str2) {
                this.f16327a = str;
                this.b = str2;
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                c5.b().a();
                BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                baseFormCommunicator.showCustomAlert(z4.videoTimeLimitation, baseFormCommunicator.formData, new a());
            }
        }

        public l(Intent intent) {
            this.f16325a = intent;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            String string = UUID.randomUUID().toString();
            String strD = BaseFormCommunicator.this.mediaDataFromJS.d();
            Intent intent = this.f16325a;
            if (intent == null || strD == null || intent.getData() == null) {
                a4.c("Can not handle Video Media Capture");
                return;
            }
            BaseFormCommunicator.this.handler.postDelayed(new a(), 1L);
            try {
                boolean zA = c5.b().a(this.f16325a.getData(), BaseFormCommunicator.this.unSupportedVideoFormats);
                String strA = c5.b().a(this.f16325a.getData(), string, strD);
                if (c5.b().a(this.f16325a.getData(), BaseFormCommunicator.this.mediaDataFromJS.e())) {
                    BaseFormCommunicator.this.handler.postDelayed(new b(strD, strA), 500L);
                } else if (strA != null) {
                    BaseFormCommunicator baseFormCommunicator = BaseFormCommunicator.this;
                    baseFormCommunicator.mediaData = new e5(string, null, strA, baseFormCommunicator.formId, baseFormCommunicator.formData.b(), j5.b(strD), System.currentTimeMillis(), BaseFormCommunicator.this.mediaDataFromJS.c(), 0);
                    BaseFormCommunicator baseFormCommunicator2 = BaseFormCommunicator.this;
                    baseFormCommunicator2.handleResponse(baseFormCommunicator2.mediaData, zA ? c5.k.finishMediaRecording : c5.k.unSupportedMediaFormat);
                }
            } catch (Exception e) {
                a4.c(e.getMessage());
                BaseFormCommunicator.this.handleResponse(null, c5.k.finishMediaRecording);
            }
        }
    }

    public enum m {
        MOBILE_DEVICE_DATA("mobileDeviceData"),
        DEVICE_RESOLUTION("deviceResolution"),
        DEVICE_LOCALE("deviceLocale"),
        DEVICE_VENDOR("deviceVendor");


        /* renamed from: a, reason: collision with root package name */
        private final String f16329a;

        m(String str) {
            this.f16329a = str;
        }

        public String a() {
            return this.f16329a;
        }
    }

    public enum n {
        FORM_LANGUAGE("formLanguage");


        /* renamed from: a, reason: collision with root package name */
        private final String f16330a;

        n(String str) {
            this.f16330a = str;
        }

        public String a() {
            return this.f16330a;
        }
    }

    public BaseFormCommunicator(j2 j2Var, i2 i2Var, FormTriggerType formTriggerType, FormViewType formViewType, y3 y3Var, boolean z, Integer num) {
        this.listener = i2Var;
        this.formData = j2Var;
        if (j2Var != null) {
            this.formId = j2Var.getFormId();
        }
        this.formTriggerType = formTriggerType;
        this.formViewType = formViewType;
        this.localizationContract = y3Var;
        this.isFeedbackSubmitIndicatorEnabled = z;
        this.textAreaLimit = num;
        LifeCycle.b().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCustomAlert(z4 z4Var, j2 j2Var, a5<z4> a5Var) {
        w7.b().a().execute(new k(z4Var, a5Var, j2Var));
    }

    public void addBridgeData(JSONObject jSONObject) throws JSONException {
        x6 x6Var = x6.f16771a;
        if (x6Var.h() && x6Var.i() && jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (x6Var.d() != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("leadId", x6Var.d());
                    jSONObject2.put("decibel", jSONObject3);
                }
                if (x6Var.e() != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("sessionId", x6Var.e());
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("integrationName", "decibelInsight");
                    jSONObject5.put("parameters", jSONObject4);
                    jSONObject2.put("recordedSessions", jSONObject5);
                }
                if (x6Var.f() != null) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("tid", x6Var.f());
                    jSONObject2.put("mxo", jSONObject6);
                }
                jSONObject.put("integrations", jSONObject2);
            } catch (Exception e2) {
                a4.b(e2.getMessage());
            }
        }
    }

    public void addFormMissingData(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            try {
                j2 j2Var = this.formData;
                if (j2Var != null && j2Var.getFormLanguage() != null) {
                    jSONObject.put(n.FORM_LANGUAGE.a(), l3.a((Object) this.formData.getFormLanguage()));
                }
            } catch (Exception e2) {
                a4.b(e2.getMessage());
            }
        }
    }

    public void addMobileDeviceData(JSONObject jSONObject) throws JSONException {
        try {
            m mVar = m.MOBILE_DEVICE_DATA;
            JSONObject jSONObject2 = (!jSONObject.has(mVar.a()) || jSONObject.isNull(mVar.a())) ? null : jSONObject.getJSONObject(mVar.a());
            if (jSONObject2 != null) {
                jSONObject2.put(m.DEVICE_RESOLUTION.a(), l3.a((Object) CollectorsInfrastructure.getInstance().getDeviceResolution()));
                jSONObject2.put(m.DEVICE_LOCALE.a(), l3.a((Object) CollectorsInfrastructure.getInstance().getLanguage()));
                jSONObject2.put(m.DEVICE_VENDOR.a(), l3.a((Object) CollectorsInfrastructure.getInstance().getDeviceVendor()));
                jSONObject.put(mVar.a(), jSONObject2);
            }
        } catch (JSONException e2) {
            a4.c(e2.getMessage());
        }
    }

    @JavascriptInterface
    public String asyncMediaAlertResponse(String str) {
        return asyncMediaResultResponse(str);
    }

    @JavascriptInterface
    public String asyncMediaCaptureResult(String str) {
        return asyncMediaResultResponse(str);
    }

    public String asyncMediaResultResponse(String str) {
        JSONObject jSONObject = this.runAsyncResults.get(str);
        this.runAsyncResults.remove(str);
        c5.b().a();
        return jSONObject != null ? jSONObject.toString() : "";
    }

    public void checkWhichPermissionsGranted(ArrayList<String> arrayList) {
        w7.b().a().execute(new b(arrayList));
    }

    @JavascriptInterface
    public void close() {
        w7.b().a().execute(new g());
    }

    public void createMediaData() {
        w7.b().a().execute(new i());
    }

    @JavascriptInterface
    public String getCustomParams() {
        return getCustomParamsString();
    }

    public abstract String getCustomParamsString();

    @JavascriptInterface
    public String getDeviceData() {
        return provideDeviceData();
    }

    @JavascriptInterface
    public String getFontScale() {
        if (i4.c().b() == null || i4.c().b().getResources() == null || i4.c().b().getResources().getConfiguration() == null) {
            a4.e("can't get font scale - returning default value 1.0");
            return "1.0";
        }
        a4.e("font scale: " + i4.c().b().getResources().getConfiguration().fontScale);
        return String.valueOf(i4.c().b().getResources().getConfiguration().fontScale);
    }

    public boolean getHasMediaData() {
        return this.hasMediaData;
    }

    public abstract b5 getMediaCapture();

    public e5 getMediaData() {
        return this.mediaData;
    }

    @JavascriptInterface
    public String getProvisions() {
        return getProvisionsData();
    }

    public abstract String getProvisionsData();

    @JavascriptInterface
    public String getSDKData() {
        return provideSdkData();
    }

    @JavascriptInterface
    public String getSecretToken() {
        com.medallia.digital.mobilesdk.b bVarA = w2.c().a();
        a4.b(YU.a.o(new StringBuilder("FormId: "), this.formId, " getSecretToken was called"));
        if (bVarA != null) {
            return bVarA.a();
        }
        return null;
    }

    @JavascriptInterface
    public String getTextAreaLimit() {
        return String.valueOf(getTextAreaLimitInteger());
    }

    public Integer getTextAreaLimitInteger() {
        return this.textAreaLimit;
    }

    public void handlePermissionsDenied() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            showCustomAlert(z4.permission, this.formData, null);
            jSONObject.put(UrlHandler.ACTION, c5.k.denyPermission.a());
            jSONObject.put("captureData", "");
            invokeJSResponse(this.uniqueFunctionResult, jSONObject);
            a4.e("No Permissions Granted - result: " + jSONObject);
        } catch (JSONException e2) {
            a4.c(e2.getMessage());
        }
    }

    public void handleResponse(e5 e5Var, c5.k kVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String strB = getMediaCapture() == null ? "" : getMediaCapture().b();
        try {
            jSONObject.put(UrlHandler.ACTION, kVar.a());
            jSONObject.put("captureData", jSONObject2.put(com.salesforce.marketingcloud.config.a.j, e5Var != null ? e5Var.e() : "").put("mediaCaptureClientCorrelationId", e5Var != null ? e5Var.d() : "").put("llChannelId", strB));
            invokeJSResponse(this.uniqueFunctionResult, jSONObject);
        } catch (JSONException e2) {
            a4.c(e2.getMessage());
        }
    }

    public void handleStopAudioMediaCapture() throws JSONException {
        try {
            this.audioRecording = false;
            c5.b().d();
            handleResponse(this.mediaData, c5.k.finishMediaRecording);
        } catch (Exception e2) {
            a4.c(YU.a.f(e2, new StringBuilder("Failed to recording audio ")));
            g2.c(this.mediaData.e());
            handleResponse(null, c5.k.allowAudioPermission);
        }
    }

    public void handleVideoMediaCapture(Intent intent) {
        w7.b().a().execute(new l(intent));
    }

    public void invokeJSResponse(String str, JSONObject jSONObject) {
        try {
            jsResolve(str, true, jSONObject);
        } catch (Exception e2) {
            try {
                jsResolve(str, false, jSONObject.put("error", e2.toString()));
            } catch (JSONException unused) {
                a4.c(e2.getMessage());
            }
        }
    }

    public abstract boolean isDarkMode();

    public abstract boolean isPreviewApp();

    public void jsResolve(String str, boolean z, JSONObject jSONObject) {
        this.runAsyncResults.put(str, jSONObject);
        this.listener.mediaCaptureResult("javascript:" + str + ".callback(" + z + ")");
    }

    @JavascriptInterface
    public void mediaCaptureDeleted(String str, String str2) {
        this.uniqueFunctionResult = str;
        try {
            g5 g5Var = new g5(new JSONObject(str2));
            this.mediaDataFromJS = g5Var;
            if (z4.valueOf(g5Var.a()) != z4.forceDelete) {
                showCustomAlert(z4.valueOf(this.mediaDataFromJS.a()), this.formData, new j());
            } else {
                g2.c(this.mediaData.e());
                this.mediaData = null;
            }
        } catch (Exception e2) {
            a4.c(YU.a.f(e2, new StringBuilder("Can not create response object ")));
        }
    }

    @JavascriptInterface
    public void mediaCaptureSelected(String str, String str2) throws JSONException {
        boolean zIsRequestMediaCapturePermissions;
        b5 mediaCaptureConfiguration;
        this.uniqueFunctionResult = str;
        boolean zA = x8.a();
        if (isPreviewApp() || t0.c().a() == null || t0.c().a().getSdkConfiguration() == null) {
            zIsRequestMediaCapturePermissions = true;
        } else {
            zIsRequestMediaCapturePermissions = t0.c().a().getSdkConfiguration().getMedalliaDigitalBrain() != null ? t0.c().a().getSdkConfiguration().getMedalliaDigitalBrain().isRequestMediaCapturePermissions() : true;
            if (t0.c().a().getSdkConfiguration().getMedalliaDigitalClientConfig() != null && (mediaCaptureConfiguration = t0.c().a().getSdkConfiguration().getMedalliaDigitalClientConfig().getMediaCaptureConfiguration()) != null) {
                this.unSupportedVideoFormats = mediaCaptureConfiguration.g();
            }
        }
        if (!zIsRequestMediaCapturePermissions) {
            showCustomAlert(z4.permission, this.formData, null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(UrlHandler.ACTION, c5.k.denyPermission.a());
                jSONObject.put("captureData", "");
                invokeJSResponse(this.uniqueFunctionResult, jSONObject);
                a4.e("No Permissions Granted - result: " + jSONObject);
                return;
            } catch (JSONException e2) {
                a4.c(e2.getMessage());
                return;
            }
        }
        if (str2 == null || str2.equals(AdError.UNDEFINED_DOMAIN) || str2.isEmpty()) {
            a4.e("Media Data is not valid");
            return;
        }
        a4.b("Media data: ".concat(str2));
        try {
            g5 g5Var = new g5(new JSONObject(str2));
            this.mediaDataFromJS = g5Var;
            int i2 = c.f16316a[z4.valueOf(g5Var.a()).ordinal()];
            if (i2 == 1) {
                if (zA) {
                    showCustomAlert(z4.select, this.formData, new h());
                    return;
                } else {
                    createMediaData();
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            if (this.audioRecording) {
                handleStopAudioMediaCapture();
            } else {
                handlePermissionsDenied();
            }
        } catch (Exception e3) {
            a4.c(YU.a.f(e3, new StringBuilder("Can not parse media data object ")));
        }
    }

    public abstract void notifySendFeedback();

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        a4.e("From is in background");
        if (!this.audioRecording || this.mediaData == null) {
            return;
        }
        c5.b().a(this.mediaData.e());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
    }

    public abstract String provideDeviceData();

    public abstract String provideSdkData();

    @JavascriptInterface
    public void ready() {
        w7.b().a().execute(new d());
    }

    @JavascriptInterface
    public void sendErrorToMobileSdk(String str) {
        a4.c(YU.a.A("Live Form Error: ", str));
    }

    public abstract void sendFeedback(c2 c2Var);

    public abstract void sendFeedbackPayloadAndUpdateRatingCollectors(JSONObject jSONObject);

    @JavascriptInterface
    public void sendFeedbackToMobileSdk(String str) {
        w7.b().a().execute(new e(str));
    }

    public abstract void separateCustomParams(JSONObject jSONObject);

    public void setListener(i2 i2Var) {
        this.listener = i2Var;
    }

    public void showAccessibilityToastIfNeeded() {
        y3 y3Var;
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) i4.c().b().getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && this.isFeedbackSubmitIndicatorEnabled) {
                String strA = "Feedback Submitted Successfully";
                if (this.formData != null && (y3Var = this.localizationContract) != null) {
                    ResourceContract resourceContractF = y3Var.f();
                    strA = x3.e().a(resourceContractF != null ? resourceContractF.getLocalUrl() : null, this.formData.getFormLanguage(), x3.c.SUBMIT, (x3.a) null);
                }
                if (this.formData != null) {
                    w7.b().c().execute(new a(strA));
                }
            }
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    @JavascriptInterface
    public void submitFailed() {
        a4.e(YU.a.o(new StringBuilder("FormId: "), this.formId, " submitFailed was called"));
    }

    @JavascriptInterface
    public void submitPending() {
        submitPending(true);
    }

    @JavascriptInterface
    public void submitSuccess() {
        w7.b().a().execute(new f());
    }

    public BaseFormCommunicator(String str, i2 i2Var, FormTriggerType formTriggerType, FormViewType formViewType, y3 y3Var, boolean z, Integer num) {
        this.listener = i2Var;
        this.formId = str;
        this.formData = r2.e().c(str);
        this.formTriggerType = formTriggerType;
        this.formViewType = formViewType;
        this.localizationContract = y3Var;
        this.isFeedbackSubmitIndicatorEnabled = z;
        this.textAreaLimit = num;
        LifeCycle.b().a(this);
    }

    @JavascriptInterface
    public void submitPending(boolean z) {
        i2 i2Var;
        a4.e("FormId: " + this.formId + " submitPending was called - shouldClose = " + z);
        if (z && (i2Var = this.listener) != null) {
            i2Var.onClose();
        }
        showAccessibilityToastIfNeeded();
    }
}
