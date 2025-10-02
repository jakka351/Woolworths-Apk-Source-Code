package com.woolworths.scanlibrary.data.firebase.auth;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzca;
import com.google.firebase.auth.internal.zzcb;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/firebase/auth/FirebaseAuthenticationRepositoryImpl;", "Lcom/woolworths/scanlibrary/data/firebase/auth/FirebaseAuthenticationRepository;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FirebaseAuthenticationRepositoryImpl implements FirebaseAuthenticationRepository {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAuth f21157a;

    public FirebaseAuthenticationRepositoryImpl(FirebaseAuth firebaseAuth) {
        this.f21157a = firebaseAuth;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws com.google.firebase.auth.FirebaseAuthException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.woolworths.scanlibrary.data.firebase.auth.FirebaseAuthenticationRepositoryImpl$authenticateWithToken$1
            if (r0 == 0) goto L13
            r0 = r7
            com.woolworths.scanlibrary.data.firebase.auth.FirebaseAuthenticationRepositoryImpl$authenticateWithToken$1 r0 = (com.woolworths.scanlibrary.data.firebase.auth.FirebaseAuthenticationRepositoryImpl$authenticateWithToken$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            com.woolworths.scanlibrary.data.firebase.auth.FirebaseAuthenticationRepositoryImpl$authenticateWithToken$1 r0 = new com.woolworths.scanlibrary.data.firebase.auth.FirebaseAuthenticationRepositoryImpl$authenticateWithToken$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            com.google.firebase.auth.FirebaseAuth r3 = r5.f21157a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r7)
            goto L46
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.b(r7)
            com.google.android.gms.tasks.Task r6 = r3.e(r6)
            java.lang.String r7 = "signInWithCustomToken(...)"
            kotlin.jvm.internal.Intrinsics.g(r6, r7)
            r0.r = r4
            java.lang.Object r6 = kotlinx.coroutines.tasks.TasksKt.a(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            com.google.firebase.auth.FirebaseUser r6 = r3.f
            if (r6 == 0) goto L4b
            return r6
        L4b:
            com.google.firebase.auth.FirebaseAuthException r6 = new com.google.firebase.auth.FirebaseAuthException
            java.lang.String r7 = "FB_AUTH_FAILED"
            java.lang.String r0 = "User Authentication Failed"
            r6.<init>(r7, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.data.firebase.auth.FirebaseAuthenticationRepositoryImpl.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b() {
        if (this.f21157a.f != null) {
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
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
