package com.google.firebase;

/* loaded from: classes.dex */
final class AutoValue_StartupTime extends StartupTime {

    /* renamed from: a, reason: collision with root package name */
    public final long f15168a;
    public final long b;
    public final long c;

    public AutoValue_StartupTime(long j, long j2, long j3) {
        this.f15168a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // com.google.firebase.StartupTime
    public final long a() {
        return this.b;
    }

    @Override // com.google.firebase.StartupTime
    public final long b() {
        return this.f15168a;
    }

    @Override // com.google.firebase.StartupTime
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartupTime)) {
            return false;
        }
        StartupTime startupTime = (StartupTime) obj;
        return this.f15168a == startupTime.b() && this.b == startupTime.a() && this.c == startupTime.c();
    }

    public final int hashCode() {
        long j = this.f15168a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f15168a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return android.support.v4.media.session.a.l(this.c, "}", sb);
    }
}
