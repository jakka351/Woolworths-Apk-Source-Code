package com.medallia.digital.mobilesdk;

import android.util.Pair;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.d7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class x3 {
    protected static final String c = "Language not available. Language fallback logic applied";
    protected static final String d = "PreInit";
    private static final String e = "^[a-zA-Z]{2,3}";
    private static final String f = "^[a-zA-Z]{2,3}_[a-zA-Z]{2,3}";
    private static final String g = "^[a-zA-Z]{2,3}-[a-zA-Z]{2,3}";
    private static x3 h;

    /* renamed from: a, reason: collision with root package name */
    private boolean f16764a;
    private Pair<Boolean, String> b = new Pair<>(Boolean.FALSE, null);

    /* loaded from: classes6.dex */
    public enum a {
        CANCEL("cancel"),
        ALERT_TITLE_DELETE_MEDIA_CAPTURE("alertTitleDeleteMediaCapture"),
        DELETE("delete"),
        ALERT_TITLE_REPLACE_MEDIA_CAPTURE("alertTitleReplaceMediaCapture"),
        ALERT_BODY_REPLACE_MEDIA_CAPTURE("alertBodyReplaceMediaCapture"),
        REPLACE("replace"),
        WIFI_ALERT_TITLE("wifiAlertTitle"),
        WIFI_ALERT_BODY("wifiAlertBody"),
        GOT_IT("gotIt"),
        VIDEO_LIMITATION_ALERT_TITLE("videoLimitationAlertTitle"),
        VIDEO_LIMITATION_ALERT_BODY("videoLimitationAlertBody"),
        PERMISSION_DENY_TITLE("permissionDenyTitle"),
        PERMISSION_DENY_BODY("permissionDenyBody");


        /* renamed from: a, reason: collision with root package name */
        private final String f16765a;

        a(String str) {
            this.f16765a = str;
        }

        public String a() {
            return this.f16765a;
        }
    }

    /* loaded from: classes6.dex */
    public enum b {
        SQ,
        AR,
        AR_DZ,
        AR_BH,
        AR_EG,
        AR_IQ,
        AR_JO,
        AR_KW,
        AR_LB,
        AR_LY,
        AR_MA,
        AR_OM,
        AR_QA,
        AR_SA,
        AR_SY,
        AR_TN,
        AR_AE,
        AR_YE,
        HY,
        AS,
        AST,
        AZ,
        EU,
        BG,
        BE,
        BN,
        BS,
        BR,
        MY,
        CA,
        CH,
        CE,
        ZH,
        ZH_HK,
        ZH_CN,
        ZH_SG,
        ZH_TW,
        CV,
        CO,
        CR,
        HR,
        CS,
        DA,
        NL,
        NL_BE,
        EN,
        EN_AU,
        EN_BZ,
        EN_CA,
        EN_IE,
        EN_JM,
        EN_NZ,
        EN_PH,
        EN_ZA,
        EN_TT,
        EN_GB,
        EN_US,
        EN_ZW,
        EN_IN,
        EN_SG,
        EN_HK,
        EN_MY,
        EO,
        ET,
        FO,
        FA,
        FJ,
        FI,
        FR,
        FR_BE,
        FR_CA,
        FR_FR,
        FR_LU,
        FR_MC,
        FR_CH,
        FY,
        FUR,
        GD,
        GD_IE,
        GL,
        KA,
        DE,
        DE_AT,
        DE_DE,
        DE_LI,
        DE_LU,
        DE_CH,
        EL,
        GU,
        HT,
        HE,
        HI,
        HU,
        IS,
        ID,
        IU,
        GA,
        IT,
        IT_CH,
        JA,
        KN,
        KS,
        KK,
        KM,
        KY,
        TLH,
        KO,
        KO_KP,
        KO_KR,
        LA,
        LV,
        LT,
        LB,
        MK,
        MS,
        ML,
        MT,
        MI,
        MR,
        MO,
        NV,
        NG,
        NE,
        NO,
        NB,
        NN,
        OC,
        OR,
        OM,
        FA_IR,
        PL,
        PT,
        PT_BR,
        PA,
        PA_IN,
        PA_PK,
        QU,
        RM,
        RO,
        RO_MO,
        RU,
        RU_MO,
        RU_UA,
        SZ,
        SG,
        SA,
        SC,
        SD,
        SI,
        SR,
        SK,
        SL,
        SO,
        SB,
        ES,
        ES_AR,
        ES_BO,
        ES_CL,
        ES_CO,
        ES_CR,
        ES_DO,
        ES_EC,
        ES_SV,
        ES_GT,
        ES_HN,
        ES_MX,
        ES_NI,
        ES_PA,
        ES_PY,
        ES_PE,
        ES_PR,
        ES_ES,
        ES_UY,
        ES_VE,
        SX,
        SW,
        SV,
        SV_FI,
        SV_SV,
        TA,
        TT,
        TE,
        TH,
        TIG,
        TS,
        TN,
        TR,
        TK,
        UK,
        UZ,
        HSB,
        UR,
        VE,
        VI,
        VO,
        WA,
        CY,
        XH,
        JI,
        ZU
    }

    /* loaded from: classes6.dex */
    public enum c {
        SUBMIT("feedbackSubmitted"),
        CLOSE("close"),
        RATE_APP("rateApp"),
        PROVIDE_FEEDBACK("provideFeedback"),
        MAYBE_LATER("noThanks"),
        NO_THANKS("maybeLater"),
        BACK("back"),
        ALERT("alert");


        /* renamed from: a, reason: collision with root package name */
        private final String f16767a;

        c(String str) {
            this.f16767a = str;
        }

        public String a() {
            return this.f16767a;
        }
    }

    public String a() {
        String country = Locale.getDefault().getCountry();
        return country != null ? country : "";
    }

    public String b() {
        String strC = c();
        return strC != null ? strC : c(h());
    }

    public String c() {
        return (this.f16764a || !((Boolean) this.b.first).booleanValue()) ? d7.b().a(d7.a.CUSTOM_LOCALE, (String) null) : (String) this.b.second;
    }

    public String d() {
        String string = Locale.getDefault().toString();
        return (string == null || !string.contains("_#")) ? string : c(string);
    }

    public MDExternalError e(String str) {
        if (str == null) {
            d7.b().b(d7.a.CUSTOM_LOCALE, (String) null);
            return null;
        }
        if (str.matches(e)) {
            if (this.f16764a) {
                d7.b().b(d7.a.CUSTOM_LOCALE, str);
            } else {
                this.b = new Pair<>(Boolean.TRUE, str);
            }
            return null;
        }
        if (str.matches(f)) {
            str = str.replace("_", "-");
        }
        if (!str.matches(g)) {
            if (this.f16764a) {
                d7.b().b(d7.a.CUSTOM_LOCALE, (String) null);
            } else {
                this.b = new Pair<>(Boolean.TRUE, null);
            }
            return new MDExternalError(MDExternalError.ExternalError.TRANSLATION_INVALID_FORMAT);
        }
        d7 d7VarB = d7.b();
        d7.a aVar = d7.a.CUSTOM_LOCALE;
        d7VarB.b(aVar, str);
        if (this.f16764a) {
            d7.b().b(aVar, str);
        } else {
            this.b = new Pair<>(Boolean.TRUE, str);
        }
        return null;
    }

    public String f() {
        String upperCase = b() != null ? b().toUpperCase() : null;
        return upperCase != null ? upperCase : "";
    }

    public String g() {
        return (String) this.b.second;
    }

    public String h() {
        return d7.b().a(d7.a.OS_LOCALE, (String) null);
    }

    public boolean i() {
        String strH = h();
        return strH == null || !strH.equals(Locale.getDefault().toString());
    }

    public boolean j() {
        return ((Boolean) this.b.first).booleanValue();
    }

    private String a(c cVar, a aVar, JSONObject jSONObject, String str) throws JSONException {
        try {
            if (!jSONObject.has(str)) {
                return null;
            }
            String string = jSONObject.getJSONObject(str).getString(aVar != null ? aVar.a() : cVar.a());
            if (string != null) {
                return string;
            }
            return null;
        } catch (Exception e2) {
            a4.c(e2.getMessage());
            return null;
        }
    }

    private String c(String str) {
        return (str == null || !str.contains("_#")) ? str : str.split("_#")[0].replace("_", "-").toLowerCase();
    }

    private String d(String str) {
        if (!str.contains("-")) {
            return str;
        }
        String[] strArrSplit = str.split("-");
        return strArrSplit.length > 0 ? strArrSplit[0] : str;
    }

    public static x3 e() {
        if (h == null) {
            h = new x3();
        }
        return h;
    }

    public boolean b(String str) {
        if (str == null) {
            return false;
        }
        String upperCase = str.toUpperCase();
        if (str.contains("-")) {
            upperCase = upperCase.replace("-", "_");
        }
        for (b bVar : b.values()) {
            if (bVar.toString().equals(upperCase)) {
                return true;
            }
        }
        return false;
    }

    public String a(String str, String str2, c cVar, a aVar) {
        String strE;
        if (str == null || str2 == null) {
            return "";
        }
        try {
            strE = g2.e(g2.d(str));
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
        if (strE == null) {
            a4.b("staticFieldsString loaded from file is null");
            return "";
        }
        JSONObject jSONObject = new JSONObject(strE);
        String strA = a(cVar, aVar, jSONObject, str2);
        if (strA != null) {
            return strA;
        }
        String strA2 = a(cVar, aVar, jSONObject, d(str2));
        if (strA2 != null) {
            return strA2;
        }
        String strB = b();
        String strA3 = a(cVar, aVar, jSONObject, strB);
        if (strA3 != null) {
            return strA3;
        }
        String strA4 = a(cVar, aVar, jSONObject, d(strB));
        if (strA4 != null) {
            return strA4;
        }
        return aVar != null ? "" : "Feedback Submitted Successfully";
    }

    public String a(String str, ArrayList<String> arrayList) {
        if (str != null && arrayList != null) {
            String strReplaceAll = str.toLowerCase().replaceAll("_", "-");
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.equals(strReplaceAll)) {
                    return next;
                }
            }
            if (strReplaceAll.contains("-")) {
                String[] strArrSplit = strReplaceAll.split("-");
                if (strArrSplit.length > 0) {
                    strReplaceAll = strArrSplit[0];
                }
            }
            if (strReplaceAll.contains("_")) {
                String[] strArrSplit2 = strReplaceAll.split("_");
                if (strArrSplit2.length > 0) {
                    strReplaceAll = strArrSplit2[0];
                }
            }
            Iterator<String> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.equals(strReplaceAll)) {
                    return next2;
                }
            }
            return null;
        }
        return null;
    }

    public void a(Locale locale) {
        if (locale == null) {
            return;
        }
        d7.b().b(d7.a.OS_LOCALE, Locale.getDefault().toString());
    }

    public void a(boolean z) {
        this.f16764a = z;
    }

    public boolean a(String str) {
        String strC = c();
        if (str == null && strC == null) {
            return false;
        }
        return str == null || !str.equals(strC);
    }
}
