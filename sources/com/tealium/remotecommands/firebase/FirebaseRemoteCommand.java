package com.tealium.remotecommands.firebase;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import com.tealium.remotecommands.RemoteCommand;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FirebaseRemoteCommand extends RemoteCommand {
    public static Activity e;
    public final b d;

    final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            FirebaseRemoteCommand.e = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            FirebaseRemoteCommand.e = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            FirebaseRemoteCommand.e = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    public FirebaseRemoteCommand(Application application) {
        super("firebaseAnalytics", null, 0);
        application.registerActivityLifecycleCallbacks(new a());
        this.d = new b(application.getApplicationContext());
    }

    public static JSONArray d(JSONObject jSONObject) {
        try {
            return jSONObject.get("param_item_id") instanceof JSONArray ? e(jSONObject, jSONObject.getJSONArray("param_item_id").length()) : e(jSONObject, 1);
        } catch (JSONException e2) {
            Log.d("Tealium-Firebase", "Error formatting items param: " + e2.toString());
            return new JSONArray();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONArray e(org.json.JSONObject r17, int r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.remotecommands.firebase.FirebaseRemoteCommand.e(org.json.JSONObject, int):org.json.JSONArray");
    }

    @Override // com.tealium.remotecommands.RemoteCommand
    public final void b(RemoteCommand.Response response) throws JSONException {
        int iHashCode;
        b bVar;
        Bundle bundleA;
        JSONObject jSONObject = response.d;
        for (String str : jSONObject.optString("command_name", "").split(",")) {
            String lowerCase = str.trim().toLowerCase();
            try {
                Log.i("Tealium-Firebase", "Processing command: " + lowerCase + " with payload: " + jSONObject.toString());
                iHashCode = lowerCase.hashCode();
                bVar = this.d;
                bundleA = null;
            } catch (Exception e2) {
                Log.w("Tealium-Firebase", "Error processing command: " + lowerCase, e2);
            }
            switch (iHashCode) {
                case -1933685031:
                    if (lowerCase.equals("setscreenname")) {
                        String strOptString = jSONObject.optString("firebase_screen_name", null);
                        String strOptString2 = jSONObject.optString("firebase_screen_class", null);
                        Activity activity = e;
                        if (strOptString != null) {
                            bVar.f19205a.setCurrentScreen(activity, strOptString, strOptString2);
                        }
                    }
                    break;
                case -1354792126:
                    if (lowerCase.equals(MlModel.MODEL_FILE_SUFFIX)) {
                        bVar.b(Integer.valueOf(jSONObject.optInt("firebase_session_timeout_seconds", -1) * 1000), Integer.valueOf(jSONObject.optInt("firebase_session_minimum_seconds", -1) * 1000), Boolean.valueOf(jSONObject.optBoolean("firebase_analytics_enabled", true)));
                    } else {
                        continue;
                    }
                case 547227650:
                    if (lowerCase.equals("setuserproperty")) {
                        String strOptString3 = jSONObject.optString("firebase_property_name", null);
                        String strOptString4 = jSONObject.optString("firebase_property_value", null);
                        bVar.getClass();
                        if (strOptString3 != null && strOptString4 != null) {
                            bVar.f19205a.f15179a.zzk(null, strOptString3, strOptString4, false);
                        }
                    } else {
                        continue;
                    }
                    break;
                case 1561500936:
                    if (lowerCase.equals("setuserid")) {
                        String strOptString5 = jSONObject.optString("firebase_user_id", null);
                        if (strOptString5 != null) {
                            bVar.f19205a.f15179a.zzo(strOptString5);
                        }
                    }
                    break;
                case 2019310038:
                    if (lowerCase.equals("logevent")) {
                        String strOptString6 = jSONObject.optString("firebase_event_name", null);
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("event");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("items");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = jSONObject.optJSONObject("firebase_event_params");
                        }
                        if (jSONObjectOptJSONObject2 != null) {
                            jSONObjectOptJSONObject.put("param_items", d(jSONObjectOptJSONObject2));
                        }
                        bVar.getClass();
                        try {
                            bundleA = b.a(jSONObjectOptJSONObject);
                        } catch (NullPointerException | JSONException unused) {
                        }
                        if (strOptString6 != null) {
                            String str2 = (String) b.b.get(strOptString6);
                            if (str2 != null) {
                                strOptString6 = str2;
                            }
                            bVar.f19205a.f15179a.zzh(strOptString6, bundleA);
                        }
                    } else {
                        continue;
                    }
                case 2024263033:
                    if (lowerCase.equals("resetdata")) {
                        bVar.f19205a.f15179a.zzs();
                    } else {
                        continue;
                    }
                default:
            }
            bVar.getClass();
        }
        response.a();
    }
}
