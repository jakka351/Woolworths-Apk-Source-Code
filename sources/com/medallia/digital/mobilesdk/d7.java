package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class d7<T> implements m8 {
    private static final String b = "com.medallia.digital.sharedpreference.SHARED_PREFS_KEY";
    public static final String c = "customParameterType";
    public static final String d = "TypeNull";
    private static d7 e;
    private static SharedPreferences f;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<a, Object> f16433a = new HashMap<>();

    public enum a {
        API_TOKEN,
        ACCESS_TOKEN,
        SESSION_ID,
        PROPERTY_ID,
        SESSION_COUNTER,
        PREVIOUS_SESSION_ID,
        DEVICE_ID,
        CUSTOM_PARAMETERS,
        TARGET_ENGINE,
        UUID,
        LOCAL_CONFIGURATION_TIMESTAMP,
        UUID_URL,
        LENNY,
        NALA,
        LAST_SDK_VERSION,
        LAST_OS_VERSION,
        SDK_KILL_TIMESTAMP,
        SDK_RECOVER_TIMESTAMP,
        IS_SDK_KILLED,
        SHOULD_CHECK_OS,
        SDK_STOPPED,
        MISSING_EVENTS,
        MISSING_EVENTS_V2,
        PREVIOUS_ANALYTICS_V2,
        PREVIOUS_DIGITAL_ANALYTICS,
        PREVIOUS_SEND_USER_JOURNEY,
        INIT_CALLBACK_EVENT,
        IS_BLACKBOX_ENABLED,
        CUSTOM_LOCALE,
        OS_LOCALE,
        CUSTOM_APPEARANCE,
        OS_APPEARANCE,
        IS_DEBUG_FORM,
        IS_ON_DESTROY_CALLED,
        BG_STARTED_TIMESTAMP,
        LN_DISPLAYED_IDS,
        LN_DEFERRED_IDS,
        OCQ_USER_ID,
        OCQ_PREVIOUS_USER_ID,
        OCQ_UUID,
        OCQ_UUID_URL,
        C_UUID
    }

    private d7() {
        if (i4.c().b() != null) {
            f = i4.c().b().getSharedPreferences(b, 0);
        }
    }

    public static d7 b() {
        if (e == null || f == null) {
            e = new d7();
        }
        return e;
    }

    public int a(a aVar, int i) {
        return d() ? f.getInt(aVar.toString(), i) : i;
    }

    public SharedPreferences c() {
        return f;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a(getClass().getSimpleName());
        a();
        f = null;
        e = null;
    }

    public boolean d() {
        return f != null;
    }

    public void e() {
        a key;
        long jLongValue;
        if (d()) {
            for (Map.Entry<a, Object> entry : this.f16433a.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    b(entry.getKey(), (String) value);
                } else if (value instanceof Boolean) {
                    b(entry.getKey(), ((Boolean) value).booleanValue());
                } else {
                    if (value instanceof Long) {
                        key = entry.getKey();
                        jLongValue = ((Long) value).longValue();
                    } else if (value instanceof Integer) {
                        key = entry.getKey();
                        jLongValue = ((Integer) value).intValue();
                    }
                    b(key, jLongValue);
                }
            }
        }
    }

    public long a(a aVar, long j) {
        return d() ? f.getLong(aVar.toString(), j) : j;
    }

    public JSONArray b(a aVar) {
        if (d() && !TextUtils.isEmpty(f.getString(aVar.toString(), null))) {
            try {
                return new JSONArray(f.getString(aVar.toString(), null));
            } catch (JSONException e2) {
                a4.c(e2.getMessage());
            }
        }
        return null;
    }

    public void c(a aVar, String str) {
        if (!d()) {
            this.f16433a.put(aVar, str);
            return;
        }
        HashSet hashSet = new HashSet(f.getStringSet(aVar.toString(), new HashSet()));
        hashSet.add(str);
        f.edit().putStringSet(aVar.toString(), hashSet).commit();
    }

    public String a(a aVar, String str) {
        return d() ? f.getString(aVar.toString(), str) : str;
    }

    public void b(a aVar, int i) {
        if (d()) {
            f.edit().putInt(aVar.toString(), i).commit();
        } else {
            this.f16433a.put(aVar, Integer.valueOf(i));
        }
    }

    public Set<String> a(a aVar, Set<String> set) {
        return d() ? f.getStringSet(aVar.toString(), set) : set;
    }

    public void b(a aVar, long j) {
        if (d()) {
            f.edit().putLong(aVar.toString(), j).commit();
        } else {
            this.f16433a.put(aVar, Long.valueOf(j));
        }
    }

    public void a() {
        if (d()) {
            f.edit().clear().commit();
        }
    }

    public void b(a aVar, String str) {
        if (d()) {
            f.edit().putString(aVar.toString(), str).commit();
        } else {
            this.f16433a.put(aVar, str);
        }
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        f = context.getSharedPreferences(b, 0);
    }

    public void b(a aVar, Set<String> set) {
        if (d()) {
            f.edit().putStringSet(aVar.toString(), set).commit();
        } else {
            this.f16433a.put(aVar, set);
        }
    }

    public boolean a(a aVar) {
        if (!d()) {
            return false;
        }
        f.edit().remove(aVar.toString()).commit();
        return true;
    }

    public void b(a aVar, boolean z) {
        if (d()) {
            f.edit().putBoolean(aVar.toString(), z).commit();
        } else {
            this.f16433a.put(aVar, Boolean.valueOf(z));
        }
    }

    public boolean a(a aVar, JSONArray jSONArray) throws JSONException {
        SharedPreferences.Editor editorPutString;
        if (!d() || jSONArray == null || jSONArray.length() == 0) {
            return false;
        }
        if (TextUtils.isEmpty(f.getString(aVar.toString(), null))) {
            editorPutString = f.edit().putString(aVar.toString(), jSONArray.toString());
        } else {
            JSONArray jSONArrayB = b(aVar);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= jSONArrayB.length()) {
                                jSONArrayB.put(jSONObject);
                                break;
                            }
                            JSONObject jSONObject2 = jSONArrayB.getJSONObject(i2);
                            if (a(jSONObject, jSONObject2, AppMeasurementSdk.ConditionalUserProperty.NAME) && a(jSONObject, jSONObject2, c)) {
                                jSONArrayB.put(i2, jSONObject);
                                break;
                            }
                            i2++;
                        }
                    }
                } catch (Exception e2) {
                    a4.c(e2.getMessage());
                }
            }
            editorPutString = f.edit().putString(aVar.toString(), jSONArrayB.toString());
        }
        editorPutString.commit();
        return true;
    }

    public boolean a(a aVar, boolean z) {
        return d() ? f.getBoolean(aVar.toString(), z) : z;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (jSONObject2 != null) {
            try {
                if (jSONObject.isNull(str)) {
                    return false;
                }
                if (!str.equals(c) || (!jSONObject.getString(c).equals(d) && !jSONObject2.getString(c).equals(d))) {
                    return jSONObject.getString(str).equals(jSONObject2.getString(str));
                }
                return true;
            } catch (JSONException e2) {
                a4.c(e2.getMessage());
            }
        }
        return false;
    }
}
