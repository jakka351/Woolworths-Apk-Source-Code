package com.google.firebase.auth.internal;

import YU.a;

/* loaded from: classes6.dex */
final class zzn extends zzj {

    /* renamed from: a, reason: collision with root package name */
    public final String f15212a;
    public final String b;
    public final String c;

    public zzn(String str, String str2, String str3) {
        this.f15212a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String a() {
        return this.b;
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String b() {
        return this.c;
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final String c() {
        return this.f15212a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        String str = this.f15212a;
        if (str == null) {
            if (zzjVar.c() != null) {
                return false;
            }
        } else if (!str.equals(zzjVar.c())) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (zzjVar.a() != null) {
                return false;
            }
        } else if (!str2.equals(zzjVar.a())) {
            return false;
        }
        String str3 = this.c;
        return str3 == null ? zzjVar.b() == null : str3.equals(zzjVar.b());
    }

    public final int hashCode() {
        String str = this.f15212a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        return (str3 != null ? str3.hashCode() : 0) ^ iHashCode2;
    }

    public final String toString() {
        return a.o(a.v("AttestationResult{recaptchaV2Token=", this.f15212a, ", playIntegrityToken=", this.b, ", recaptchaEnterpriseToken="), this.c, "}");
    }
}
