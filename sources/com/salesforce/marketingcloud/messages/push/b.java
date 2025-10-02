package com.salesforce.marketingcloud.messages.push;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17022a = "com.google.android.c2dm.intent.RECEIVE";
    private static final String b = "com.google.firebase.INSTANCE_ID_EVENT";
    private static final String c = "com.google.firebase.MESSAGING_EVENT";

    private b() {
    }

    @SuppressLint
    public static JSONObject a(Context context, String str, String str2) throws JSONException {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        JSONObject jSONObject = new JSONObject();
        Object obj = str;
        if (str == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("senderId", obj);
        Object obj2 = str2;
        if (str2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("deviceToken", obj2);
        jSONObject.put("firebaseApps", a(context));
        jSONObject.put("c2dmReceiver", a(packageName, packageManager.queryBroadcastReceivers(new Intent(f17022a), 0)));
        jSONObject.put("instanceIdService", a(packageName, packageManager.queryIntentServices(new Intent(b), 0)));
        jSONObject.put("messagingService", a(packageName, packageManager.queryIntentServices(new Intent(c), 0)));
        return jSONObject;
    }

    private static JSONArray a(String str, List<ResolveInfo> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            for (ResolveInfo resolveInfo : list) {
                ComponentInfo componentInfoA = a(resolveInfo);
                if (componentInfoA != null && str.equals(componentInfoA.processName)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, componentInfoA.name);
                    jSONObject.put("priority", resolveInfo.priority);
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    private static JSONArray a(Context context) {
        ArrayList arrayList;
        JSONArray jSONArray = new JSONArray();
        try {
            synchronized (FirebaseApp.k) {
                arrayList = new ArrayList(FirebaseApp.l.values());
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((FirebaseApp) it.next()).toString());
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    private static ComponentInfo a(ResolveInfo resolveInfo) {
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo != null) {
            return activityInfo;
        }
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            return serviceInfo;
        }
        return null;
    }
}
