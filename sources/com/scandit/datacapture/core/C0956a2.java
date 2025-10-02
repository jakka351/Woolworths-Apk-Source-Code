package com.scandit.datacapture.core;

/* renamed from: com.scandit.datacapture.core.a2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0956a2 {

    /* renamed from: a, reason: collision with root package name */
    private final long f18405a;

    private /* synthetic */ C0956a2(long j) {
        this.f18405a = j;
    }

    public static final /* synthetic */ C0956a2 a(long j) {
        return new C0956a2(j);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0956a2) && this.f18405a == ((C0956a2) obj).f18405a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18405a);
    }

    public final String toString() {
        return "Timestamp(value=" + this.f18405a + ')';
    }
}
