package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.auth.internal.zzcf;

/* loaded from: classes6.dex */
final class zzo extends zzbo<AuthResult> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f15218a;
    public final /* synthetic */ EmailAuthCredential b;
    public final /* synthetic */ FirebaseAuth c;

    public zzo(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.f15218a = firebaseUser;
        this.b = emailAuthCredential;
        this.c = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task b(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        FirebaseAuth firebaseAuth = this.c;
        return firebaseAuth.e.zza(firebaseAuth.f15191a, this.f15218a, (AuthCredential) this.b, str, (zzcf) new FirebaseAuth.zzb(firebaseAuth));
    }
}
