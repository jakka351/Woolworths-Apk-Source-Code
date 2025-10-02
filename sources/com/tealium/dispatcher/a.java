package com.tealium.dispatcher;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/dispatcher/a;", "Lcom/tealium/dispatcher/Dispatch;", "a", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a implements Dispatch {

    /* renamed from: a, reason: collision with root package name */
    public final String f19188a;
    public final Long b;
    public final LinkedHashMap c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/dispatcher/a$a;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.tealium.dispatcher.a$a, reason: collision with other inner class name */
    public static final class C0394a {
    }

    public a(Dispatch dispatch) {
        this.f19188a = dispatch.getF19188a();
        Long b = dispatch.getB();
        this.b = b == null ? Long.valueOf(System.currentTimeMillis()) : b;
        LinkedHashMap linkedHashMapS = MapsKt.s(dispatch.a());
        for (Map.Entry entry : linkedHashMapS.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Collection) {
                linkedHashMapS.put(entry.getKey(), CollectionsKt.J0((Collection) value));
            } else if (value instanceof Map) {
                linkedHashMapS.put(entry.getKey(), MapsKt.s((Map) value));
            } else if (value instanceof Object[]) {
                Object key = entry.getKey();
                Object[] objArr = (Object[]) value;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.g(objArrCopyOf, "copyOf(this, size)");
                linkedHashMapS.put(key, objArrCopyOf);
            }
        }
        this.c = linkedHashMapS;
    }

    @Override // com.tealium.dispatcher.Dispatch
    public final Map a() {
        return MapsKt.q(this.c);
    }

    @Override // com.tealium.dispatcher.Dispatch
    public final void b(Map data) {
        Intrinsics.h(data, "data");
        this.c.putAll(data);
    }

    @Override // com.tealium.dispatcher.Dispatch
    public final Object get() {
        return a().get("tealium_event");
    }

    @Override // com.tealium.dispatcher.Dispatch
    /* renamed from: getId, reason: from getter */
    public final String getF19188a() {
        return this.f19188a;
    }

    @Override // com.tealium.dispatcher.Dispatch
    /* renamed from: getTimestamp, reason: from getter */
    public final Long getB() {
        return this.b;
    }
}
