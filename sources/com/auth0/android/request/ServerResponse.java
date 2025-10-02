package com.auth0.android.request;

import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/request/ServerResponse;", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final /* data */ class ServerResponse {

    /* renamed from: a, reason: collision with root package name */
    public final int f13680a;
    public final InputStream b;
    public final TreeMap c;

    public ServerResponse(int i, InputStream body, TreeMap treeMap) {
        Intrinsics.h(body, "body");
        this.f13680a = i;
        this.b = body;
        this.c = treeMap;
    }

    public final boolean a() {
        TreeMap treeMap = this.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(treeMap.size()));
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            Locale locale = Locale.getDefault();
            Intrinsics.g(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        List list = (List) linkedHashMap.get("content-type");
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (StringsKt.o((String) it.next(), "application/json", true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerResponse)) {
            return false;
        }
        ServerResponse serverResponse = (ServerResponse) obj;
        return this.f13680a == serverResponse.f13680a && Intrinsics.c(this.b, serverResponse.b) && this.c.equals(serverResponse.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f13680a) * 31)) * 31);
    }

    public final String toString() {
        return "ServerResponse(statusCode=" + this.f13680a + ", body=" + this.b + ", headers=" + this.c + ')';
    }
}
