package com.scandit.datacapture.core;

import java.util.Map;

/* renamed from: com.scandit.datacapture.core.w4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1156w4 extends AbstractC0953a {

    /* renamed from: a, reason: collision with root package name */
    final Object f18984a;
    Object b;
    final /* synthetic */ ConcurrentMapC1165x4 c;

    public C1156w4(ConcurrentMapC1165x4 concurrentMapC1165x4, Object obj, Object obj2) {
        this.c = concurrentMapC1165x4;
        this.f18984a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.f18984a.equals(entry.getKey()) && this.b.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18984a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f18984a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.c.put(this.f18984a, obj);
        this.b = obj;
        return objPut;
    }
}
