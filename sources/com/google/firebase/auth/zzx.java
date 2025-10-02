package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.internal.zzca;
import com.google.firebase.auth.internal.zzcb;

/* loaded from: classes6.dex */
final class zzx implements com.google.firebase.auth.internal.zzau, com.google.firebase.auth.internal.zzl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f15219a;

    public zzx(FirebaseAuth firebaseAuth) {
        this.f15219a = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzl
    public final void a(zzahv zzahvVar, FirebaseUser firebaseUser) {
        FirebaseAuth firebaseAuth = this.f15219a;
        firebaseAuth.getClass();
        FirebaseAuth.h(firebaseAuth, firebaseUser, zzahvVar, true, true);
    }

    @Override // com.google.firebase.auth.internal.zzau
    public final void zza(Status status) {
        int statusCode = status.getStatusCode();
        if (statusCode == 17011 || statusCode == 17021 || statusCode == 17005) {
            FirebaseAuth firebaseAuth = this.f15219a;
            zzcb zzcbVar = firebaseAuth.n;
            Preconditions.checkNotNull(zzcbVar);
            FirebaseUser firebaseUser = firebaseAuth.f;
            if (firebaseUser != null) {
                zzcbVar.h(firebaseUser);
                firebaseAuth.f = null;
            }
            zzcbVar.g();
            FirebaseAuth.j(firebaseAuth, null);
            FirebaseAuth.g(firebaseAuth, null);
            zzca zzcaVar = firebaseAuth.q;
            if (zzcaVar != null) {
                zzcaVar.a();
            }
        }
    }
}
