package com.adobe.marketing.mobile;

import YU.a;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.internal.DataMarshaller;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.internal.context.App;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/LaunchInfoCollector;", "Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityLifecycleCallbacks;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LaunchInfoCollector implements App.ActivityLifecycleCallbacks {
    @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        LinkedHashMap linkedHashMap;
        Set<String> queryParameterNames;
        List<String> queryParameters;
        String string;
        ArrayList arrayList = DataMarshaller.f13173a;
        Intent intent = activity.getIntent();
        if (intent == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Set<String> setKeySet = extras.keySet();
                if (setKeySet != null) {
                    for (String str : setKeySet) {
                        String newKey = Intrinsics.c(str, "adb_m_id") ? "pushmessageid" : Intrinsics.c(str, "NOTIFICATION_IDENTIFIER") ? "notificationid" : str;
                        try {
                            Object obj = extras.get(str);
                            if (obj != null && (string = obj.toString()) != null && string.length() > 0) {
                                Intrinsics.g(newKey, "newKey");
                                linkedHashMap.put(newKey, obj);
                            }
                        } catch (Exception e) {
                            Log.b("MobileCore", "DataMarshaller", a.f(e, a.u("Failed to retrieve data (key = ", str, ") from Activity, error is: ")), new Object[0]);
                        }
                    }
                }
                extras.remove("adb_m_id");
                extras.remove("NOTIFICATION_IDENTIFIER");
            }
            ArrayList arrayList2 = DataMarshaller.f13173a;
            Uri data = intent.getData();
            if (data != null) {
                String string2 = data.toString();
                Intrinsics.g(string2, "data.toString()");
                if (string2.length() != 0) {
                    data.toString();
                    Log.c();
                    String string3 = data.toString();
                    Intrinsics.g(string3, "data.toString()");
                    linkedHashMap.put("deeplink", string3);
                    if (data.isHierarchical() && (queryParameterNames = data.getQueryParameterNames()) != null && (arrayList2 == null || !arrayList2.isEmpty())) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (queryParameterNames.contains((String) it.next())) {
                                if (data.isHierarchical()) {
                                    try {
                                        Set<String> queryParameterNames2 = data.getQueryParameterNames();
                                        if (queryParameterNames2 != null && !queryParameterNames2.isEmpty()) {
                                            Uri.Builder builderBuildUpon = data.buildUpon();
                                            builderBuildUpon.clearQuery();
                                            for (String str2 : queryParameterNames2) {
                                                if (!arrayList2.contains(str2) && (queryParameters = data.getQueryParameters(str2)) != null) {
                                                    Iterator<T> it2 = queryParameters.iterator();
                                                    while (it2.hasNext()) {
                                                        builderBuildUpon.appendQueryParameter(str2, (String) it2.next());
                                                    }
                                                }
                                            }
                                            Uri uriBuild = builderBuildUpon.build();
                                            Intrinsics.g(uriBuild, "cleanUriBuilder.build()");
                                            data = uriBuild;
                                        }
                                    } catch (UnsupportedOperationException unused) {
                                    }
                                }
                                intent.setData(data);
                            }
                        }
                    }
                }
            }
        }
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            Log.a();
            return;
        }
        Event.Builder builder = new Event.Builder("Collect Data", "com.adobe.eventType.generic.data", "com.adobe.eventSource.os", null);
        builder.d(linkedHashMap);
        MobileCore.a(builder.a());
    }
}
