package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.auth.internal.zzcf;

/* loaded from: classes6.dex */
final class zzac extends zzbo<AuthResult> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15217a;
    public final /* synthetic */ FirebaseUser b;
    public final /* synthetic */ EmailAuthCredential c;
    public final /* synthetic */ FirebaseAuth d;

    public zzac(FirebaseAuth firebaseAuth, boolean z, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.f15217a = z;
        this.b = firebaseUser;
        this.c = emailAuthCredential;
        this.d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task b(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        boolean z = this.f15217a;
        EmailAuthCredential emailAuthCredential = this.c;
        FirebaseAuth firebaseAuth = this.d;
        return z ? firebaseAuth.e.zzb(firebaseAuth.f15191a, (FirebaseUser) Preconditions.checkNotNull(this.b), emailAuthCredential, str, (zzcf) new FirebaseAuth.zzb(firebaseAuth)) : firebaseAuth.e.zza(firebaseAuth.f15191a, emailAuthCredential, str, (com.google.firebase.auth.internal.zzl) new FirebaseAuth.zza(firebaseAuth));
    }
}
