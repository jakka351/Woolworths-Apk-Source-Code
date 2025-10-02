package com.auth0.android.request;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.auth0.android.request.SignUpRequest", f = "SignUpRequest.kt", l = {164, 165}, m = "await")
/* loaded from: classes4.dex */
final class SignUpRequest$await$1 extends ContinuationImpl {
    public SignUpRequest p;
    public /* synthetic */ Object q;
    public final /* synthetic */ SignUpRequest r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpRequest$await$1(SignUpRequest signUpRequest, Continuation continuation) {
        super(continuation);
        this.r = signUpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SignUpRequest$await$1 signUpRequest$await$1;
        this.q = obj;
        int i = this.s | Integer.MIN_VALUE;
        this.s = i;
        int i2 = i & Integer.MIN_VALUE;
        SignUpRequest signUpRequest = this.r;
        if (i2 != 0) {
            this.s = i - Integer.MIN_VALUE;
            signUpRequest$await$1 = this;
        } else {
            signUpRequest$await$1 = new SignUpRequest$await$1(signUpRequest, this);
        }
        Object obj2 = signUpRequest$await$1.q;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i3 = signUpRequest$await$1.s;
        if (i3 == 0) {
            ResultKt.b(obj2);
            signUpRequest$await$1.p = signUpRequest;
            signUpRequest$await$1.s = 1;
            throw null;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return obj2;
        }
        SignUpRequest signUpRequest2 = signUpRequest$await$1.p;
        ResultKt.b(obj2);
        signUpRequest2.getClass();
        signUpRequest$await$1.p = null;
        signUpRequest$await$1.s = 2;
        throw null;
    }
}
