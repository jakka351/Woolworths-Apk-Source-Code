package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes6.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.e = str4;
        this.f = j;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String d() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        return this.b.equals(rolloutAssignment.e()) && this.c.equals(rolloutAssignment.c()) && this.d.equals(rolloutAssignment.d()) && this.e.equals(rolloutAssignment.g()) && this.f == rolloutAssignment.f();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final long f() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String g() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return android.support.v4.media.session.a.l(this.f, "}", sb);
    }
}
