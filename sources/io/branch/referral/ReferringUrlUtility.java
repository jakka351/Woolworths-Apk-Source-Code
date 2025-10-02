package io.branch.referral;

import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/branch/referral/ReferringUrlUtility;", "", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReferringUrlUtility {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f23861a;
    public final PrefHelper b;
    public final SimpleDateFormat c;

    public ReferringUrlUtility(PrefHelper prefHelper) throws JSONException {
        String str;
        Intrinsics.h(prefHelper, "prefHelper");
        this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
        this.b = prefHelper;
        JSONObject jSONObjectH = prefHelper.h();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = null;
        try {
            Iterator<String> itKeys = jSONObjectH.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObject = jSONObjectH.getJSONObject(itKeys.next());
                BranchUrlQueryParameter branchUrlQueryParameter = new BranchUrlQueryParameter(null, 31);
                branchUrlQueryParameter.f23856a = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (jSONObject.has("value")) {
                    branchUrlQueryParameter.b = jSONObject.getString("value");
                }
                if (jSONObject.has("timestamp")) {
                    try {
                        branchUrlQueryParameter.c = this.c.parse(jSONObject.getString("timestamp"));
                    } catch (ParseException e) {
                        BranchLogger.b("Caught JSONException when parsing referring URL query parameter timestamp " + e.getMessage());
                    }
                }
                if (jSONObject.has("validityWindow")) {
                    branchUrlQueryParameter.e = jSONObject.getLong("validityWindow");
                }
                if (jSONObject.has("isDeeplink")) {
                    branchUrlQueryParameter.d = jSONObject.getBoolean("isDeeplink");
                } else {
                    branchUrlQueryParameter.d = false;
                }
                String str2 = branchUrlQueryParameter.f23856a;
                if (str2 != null) {
                    linkedHashMap.put(str2, branchUrlQueryParameter);
                }
            }
        } catch (JSONException e2) {
            BranchLogger.b("Caught JSONException when deserializing JSON for referring URL query parameters " + e2.getMessage());
        }
        this.f23861a = linkedHashMap;
        PrefHelper prefHelper2 = this.b;
        BranchUrlQueryParameter branchUrlQueryParameter2 = (BranchUrlQueryParameter) linkedHashMap.get("gclid");
        if ((branchUrlQueryParameter2 != null ? branchUrlQueryParameter2.b : null) == null) {
            String strJ = prefHelper2.j("bnc_gclid_json_object");
            SharedPreferences.Editor editor = prefHelper2.b;
            if (strJ.equals("bnc_no_value")) {
                str = "bnc_no_value";
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject(strJ);
                    if (((Long) jSONObject2.get("bnc_gclid_expiration_date")).longValue() - System.currentTimeMillis() > 0) {
                        string = jSONObject2.getString("bnc_gclid_value");
                    } else {
                        editor.remove("bnc_gclid_json_object").apply();
                    }
                } catch (JSONException e3) {
                    editor.remove("bnc_gclid_json_object").apply();
                    e3.printStackTrace();
                }
                str = string;
            }
            if (str == null || str.equals("bnc_no_value")) {
                return;
            }
            BranchUrlQueryParameter branchUrlQueryParameter3 = new BranchUrlQueryParameter("gclid", str, new Date(), prefHelper2.f23860a.getLong("bnc_gclid_expiration_window", 2592000000L));
            linkedHashMap.put("gclid", branchUrlQueryParameter3);
            prefHelper2.o(c(linkedHashMap));
            editor.remove("bnc_gclid_json_object").apply();
            BranchLogger.e("Updated old Gclid (" + str + ") to new BranchUrlQueryParameter (" + branchUrlQueryParameter3 + ')');
        }
    }

    public final JSONObject a(ServerRequest serverRequest) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject();
        if ((serverRequest instanceof ServerRequestLogEvent) || (serverRequest instanceof ServerRequestRegisterOpen)) {
            LinkedHashMap linkedHashMap2 = this.f23861a;
            BranchUrlQueryParameter branchUrlQueryParameter = (BranchUrlQueryParameter) linkedHashMap2.get("gclid");
            if (branchUrlQueryParameter != null && (str = branchUrlQueryParameter.b) != null && !str.equals("bnc_no_value")) {
                long time = new Date().getTime();
                Date date = branchUrlQueryParameter.c;
                Long lValueOf = date != null ? Long.valueOf(date.getTime()) : null;
                long j = branchUrlQueryParameter.e;
                long j2 = 1000 * j;
                if (lValueOf != null) {
                    PrefHelper prefHelper = this.b;
                    if (j == 0 || time < lValueOf.longValue() + j2) {
                        jSONObject.put("gclid", branchUrlQueryParameter.b);
                        if (serverRequest instanceof ServerRequestRegisterOpen) {
                            jSONObject.put("is_deeplink_gclid", branchUrlQueryParameter.d);
                        }
                        branchUrlQueryParameter.d = false;
                        prefHelper.o(c(linkedHashMap2));
                    } else {
                        linkedHashMap2.remove("gclid");
                        prefHelper.o(c(linkedHashMap2));
                    }
                }
            }
        }
        if (jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Intrinsics.g(key, "key");
                Object obj = jSONObject.get(key);
                Intrinsics.g(obj, "gclid.get(key)");
                linkedHashMap.put(key, obj);
            }
        }
        return new JSONObject(linkedHashMap);
    }

    public final void b(String urlString) {
        Intrinsics.h(urlString, "urlString");
        if (Branch.i().l.f23868a) {
            BranchLogger.a("Skipping referring URL query parameter parsing due to disabled tracking.");
            return;
        }
        Uri uri = Uri.parse(urlString);
        if (!uri.isHierarchical()) {
            BranchLogger.a("Skipping referring URL query parameter parsing because the URI is not hierarchical. URI: ".concat(urlString));
            return;
        }
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            PrefHelper prefHelper = this.b;
            LinkedHashMap linkedHashMap = this.f23861a;
            if (!zHasNext) {
                prefHelper.o(c(linkedHashMap));
                BranchLogger.e("Current referringURLQueryParameters: " + prefHelper.h());
                return;
            }
            String originalParamName = it.next();
            Intrinsics.g(originalParamName, "originalParamName");
            Locale locale = Locale.ROOT;
            String lowerCase = originalParamName.toLowerCase(locale);
            Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String queryParameter = uri.getQueryParameter(originalParamName);
            BranchLogger.e("Found URL Query Parameter - Key: " + lowerCase + ", Value: " + queryParameter);
            String lowerCase2 = lowerCase.toLowerCase(locale);
            Intrinsics.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (CollectionsKt.Q("gclid").contains(lowerCase2)) {
                BranchUrlQueryParameter branchUrlQueryParameter = (BranchUrlQueryParameter) linkedHashMap.get(lowerCase);
                if (branchUrlQueryParameter == null) {
                    branchUrlQueryParameter = new BranchUrlQueryParameter(lowerCase, 30);
                }
                branchUrlQueryParameter.b = queryParameter;
                branchUrlQueryParameter.c = new Date();
                branchUrlQueryParameter.d = true;
                if (branchUrlQueryParameter.e == 0) {
                    branchUrlQueryParameter.e = lowerCase.equals("gclid") ? prefHelper.f23860a.getLong("bnc_gclid_expiration_window", 2592000000L) / 1000 : 0L;
                }
                linkedHashMap.put(lowerCase, branchUrlQueryParameter);
            }
        }
    }

    public final JSONObject c(LinkedHashMap urlQueryParameters) throws JSONException {
        Intrinsics.h(urlQueryParameters, "urlQueryParameters");
        JSONObject jSONObject = new JSONObject();
        try {
            for (BranchUrlQueryParameter branchUrlQueryParameter : urlQueryParameters.values()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, branchUrlQueryParameter.f23856a);
                Object obj = branchUrlQueryParameter.b;
                if (obj == null) {
                    obj = JSONObject.NULL;
                }
                jSONObject2.put("value", obj);
                Date date = branchUrlQueryParameter.c;
                jSONObject2.put("timestamp", date != null ? this.c.format(date) : null);
                jSONObject2.put("isDeeplink", branchUrlQueryParameter.d);
                jSONObject2.put("validityWindow", branchUrlQueryParameter.e);
                jSONObject.put(String.valueOf(branchUrlQueryParameter.f23856a), jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            BranchLogger.b("Caught JSONException when serializing JSON for referring URL query parameters " + e.getMessage());
            return jSONObject;
        }
    }
}
