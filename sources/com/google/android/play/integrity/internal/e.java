package com.google.android.play.integrity.internal;

/* loaded from: classes6.dex */
final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    public final int f14774a;
    public final long b;

    public e(int i, long j) {
        this.f14774a = i;
        this.b = j;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.f14774a;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f14774a == fVar.a() && this.b == fVar.b();
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ ((this.f14774a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.f14774a);
        sb.append(", eventTimestamp=");
        return android.support.v4.media.session.a.l(this.b, "}", sb);
    }
}
