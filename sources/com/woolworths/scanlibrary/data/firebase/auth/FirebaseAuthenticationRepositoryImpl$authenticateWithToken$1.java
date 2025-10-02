package com.woolworths.scanlibrary.data.firebase.auth;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.data.firebase.auth.FirebaseAuthenticationRepositoryImpl", f = "FirebaseAuthenticationRepositoryImpl.kt", l = {15}, m = "authenticateWithToken")
/* loaded from: classes7.dex */
final class FirebaseAuthenticationRepositoryImpl$authenticateWithToken$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ FirebaseAuthenticationRepositoryImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseAuthenticationRepositoryImpl$authenticateWithToken$1(FirebaseAuthenticationRepositoryImpl firebaseAuthenticationRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = firebaseAuthenticationRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
