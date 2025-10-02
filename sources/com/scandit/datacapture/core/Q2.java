package com.scandit.datacapture.core;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Q2 implements P2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18363a = ", ";

    public Q2(int i) {
    }

    public final HashMap a(Map headers) {
        Intrinsics.h(headers, "headers");
        HashMap map = new HashMap();
        for (Map.Entry entry : headers.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                map.put(lowerCase, CollectionsKt.M(list, this.f18363a, null, null, null, 62));
            }
        }
        return map;
    }
}
