package com.auth0.android.request.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.auth0.android.request.internal.BaseAuthenticationRequest", f = "BaseAuthenticationRequest.kt", l = {164}, m = "await$suspendImpl")
/* loaded from: classes4.dex */
final class BaseAuthenticationRequest$await$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.q |= Integer.MIN_VALUE;
        throw null;
    }
}
