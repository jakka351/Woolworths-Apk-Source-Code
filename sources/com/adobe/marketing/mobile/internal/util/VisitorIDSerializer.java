package com.adobe.marketing.mobile.internal.util;

import com.adobe.marketing.mobile.VisitorID;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class VisitorIDSerializer {
    public static HashMap a(VisitorID visitorID) {
        HashMap map = new HashMap();
        map.put("ID", visitorID.b);
        map.put("ID_ORIGIN", visitorID.c);
        map.put("ID_TYPE", visitorID.d);
        map.put("STATE", Integer.valueOf(visitorID.f13164a.d));
        return map;
    }
}
