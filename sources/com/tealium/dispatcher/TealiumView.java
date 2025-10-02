package com.tealium.dispatcher;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/dispatcher/TealiumView;", "Lcom/tealium/dispatcher/Dispatch;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TealiumView implements Dispatch {

    /* renamed from: a, reason: collision with root package name */
    public final String f19187a;
    public final String b;
    public final Long c;
    public final LinkedHashMap d;

    /* JADX WARN: Multi-variable type inference failed */
    public TealiumView(String viewName, HashMap map) {
        Intrinsics.h(viewName, "viewName");
        this.f19187a = viewName;
        String strH = androidx.constraintlayout.core.state.a.h("randomUUID().toString()");
        this.b = strH;
        this.c = Long.valueOf(System.currentTimeMillis());
        this.d = MapsKt.l(new Pair("tealium_event_type", "view"), new Pair("tealium_event", viewName), new Pair("screen_title", viewName), new Pair("request_uuid", strH));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = this.d;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, value);
            }
        }
        LinkedHashMap linkedHashMap2 = this.d;
        Object obj = map.get("screen_title");
        linkedHashMap2.put("screen_title", obj != 0 ? obj : viewName);
    }

    @Override // com.tealium.dispatcher.Dispatch
    public final Map a() {
        return MapsKt.q(this.d);
    }

    @Override // com.tealium.dispatcher.Dispatch
    public final void b(Map data) {
        Intrinsics.h(data, "data");
        this.d.putAll(data);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TealiumView) && Intrinsics.c(this.f19187a, ((TealiumView) obj).f19187a);
    }

    @Override // com.tealium.dispatcher.Dispatch
    public final Object get() {
        return a().get("tealium_event");
    }

    @Override // com.tealium.dispatcher.Dispatch
    /* renamed from: getId, reason: from getter */
    public final String getF19189a() {
        return this.b;
    }

    @Override // com.tealium.dispatcher.Dispatch
    /* renamed from: getTimestamp, reason: from getter */
    public final Long getB() {
        return this.c;
    }

    public final int hashCode() {
        return this.f19187a.hashCode();
    }

    public final String toString() {
        return YU.a.h("TealiumView(viewName=", this.f19187a, ")");
    }
}
