package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;

/* loaded from: classes6.dex */
final class zzz extends zzbo<AuthResult> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15220a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FirebaseUser c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ FirebaseAuth f;

    public zzz(FirebaseAuth firebaseAuth, String str, boolean z, FirebaseUser firebaseUser, String str2, String str3) {
        this.f15220a = str;
        this.b = z;
        this.c = firebaseUser;
        this.d = str2;
        this.e = str3;
        this.f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task b(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = this.f15220a;
        if (zIsEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z = this.b;
        FirebaseAuth firebaseAuth = this.f;
        if (!z) {
            return firebaseAuth.e.zzb(firebaseAuth.f15191a, this.f15220a, this.d, this.e, str, new FirebaseAuth.zza(firebaseAuth));
        }
        return firebaseAuth.e.zzb(firebaseAuth.f15191a, (FirebaseUser) Preconditions.checkNotNull(this.c), this.f15220a, this.d, this.e, str, new FirebaseAuth.zzb(firebaseAuth));
    }
}
