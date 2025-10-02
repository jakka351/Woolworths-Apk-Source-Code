package com.swrve.sdk;

import android.content.ContextWrapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes6.dex */
class SwrvePushSidDeDuper {

    /* renamed from: a, reason: collision with root package name */
    public final int f19072a;
    public final String b;

    /* renamed from: com.swrve.sdk.SwrvePushSidDeDuper$1, reason: invalid class name */
    class AnonymousClass1 extends TypeToken<LinkedList<String>> {
    }

    public SwrvePushSidDeDuper(ContextWrapper contextWrapper, Map map) {
        this.f19072a = 100;
        if (map != null && map.containsKey(NotificationMessage.NOTIF_KEY_SID)) {
            this.b = (String) map.get(NotificationMessage.NOTIF_KEY_SID);
        }
        if (map == null || !map.containsKey("_sid_max_cache")) {
            return;
        }
        this.f19072a = Integer.valueOf((String) map.get("_sid_max_cache")).intValue();
    }

    public static boolean a(ContextWrapper contextWrapper, Map map) {
        SwrvePushSidDeDuper swrvePushSidDeDuper = new SwrvePushSidDeDuper(contextWrapper, map);
        String str = swrvePushSidDeDuper.b;
        if (SwrveHelper.p(str)) {
            return false;
        }
        LinkedList linkedList = (LinkedList) new Gson().f(contextWrapper.getSharedPreferences("swrve_sids", 0).getString("_sids", ""), new AnonymousClass1().getType());
        if (linkedList == null) {
            linkedList = new LinkedList();
        }
        if (linkedList.contains(str)) {
            SwrveLogger.h("SwrveSDK: SwrvePushSidDeDuper - duplicate _sid id: %s", str);
            return true;
        }
        linkedList.add(str);
        while (linkedList.size() > swrvePushSidDeDuper.f19072a) {
            linkedList.remove();
        }
        contextWrapper.getSharedPreferences("swrve_sids", 0).edit().putString("_sids", new Gson().j(linkedList)).apply();
        return false;
    }
}
