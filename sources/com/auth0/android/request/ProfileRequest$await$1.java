package com.auth0.android.request;

import com.auth0.android.result.Authentication;
import com.auth0.android.result.Credentials;
import com.auth0.android.result.UserProfile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.auth0.android.request.ProfileRequest", f = "ProfileRequest.kt", l = {126, 129}, m = "await")
/* loaded from: classes4.dex */
final class ProfileRequest$await$1 extends ContinuationImpl {
    public ProfileRequest p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ProfileRequest r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRequest$await$1(ProfileRequest profileRequest, Continuation continuation) {
        super(continuation);
        this.r = profileRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProfileRequest$await$1 profileRequest$await$1;
        this.q = obj;
        int i = this.s | Integer.MIN_VALUE;
        this.s = i;
        int i2 = i & Integer.MIN_VALUE;
        ProfileRequest profileRequest = this.r;
        if (i2 != 0) {
            this.s = i - Integer.MIN_VALUE;
            profileRequest$await$1 = this;
        } else {
            profileRequest$await$1 = new ProfileRequest$await$1(profileRequest, this);
        }
        Object obj2 = profileRequest$await$1.q;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i3 = profileRequest$await$1.s;
        if (i3 == 0) {
            ResultKt.b(obj2);
            profileRequest$await$1.p = profileRequest;
            profileRequest$await$1.s = 1;
            throw null;
        }
        if (i3 == 1) {
            ProfileRequest profileRequest2 = profileRequest$await$1.p;
            ResultKt.b(obj2);
            profileRequest2.getClass();
            ((Credentials) obj2).getClass();
            throw null;
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj2);
        UserProfile profile = (UserProfile) obj2;
        Intrinsics.h(profile, "profile");
        Intrinsics.h(null, "credentials");
        return new Authentication();
    }
}
