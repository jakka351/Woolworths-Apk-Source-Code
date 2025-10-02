package au.com.woolworths.foundation.wxid.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.wxid.impl.WxidClientImpl", f = "WxidClientImpl.kt", l = {64}, m = "getStoredWxidNextFetchAt")
/* loaded from: classes4.dex */
final class WxidClientImpl$getStoredWxidNextFetchAt$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ WxidClientImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxidClientImpl$getStoredWxidNextFetchAt$1(WxidClientImpl wxidClientImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = wxidClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.f(this);
    }
}
