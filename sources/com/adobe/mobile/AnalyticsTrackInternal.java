package com.adobe.mobile;

import androidx.constraintlayout.core.state.a;
import java.util.HashMap;

/* loaded from: classes4.dex */
final class AnalyticsTrackInternal {
    public static void a(String str, HashMap map, long j) {
        HashMap map2 = new HashMap(map);
        map2.put("a.internalaction", str);
        HashMap mapR = a.r("pe", "lnk_o");
        mapR.put("pev2", "ADBINTERNAL:".concat(str));
        mapR.put("pageName", StaticMethods.j());
        RequestBuilder.a(map2, mapR, j);
    }
}
