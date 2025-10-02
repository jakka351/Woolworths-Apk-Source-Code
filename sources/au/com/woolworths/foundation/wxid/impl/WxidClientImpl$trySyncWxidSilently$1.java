package au.com.woolworths.foundation.wxid.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.wxid.impl.WxidClientImpl", f = "WxidClientImpl.kt", l = {82, 83, 86, 87, 95}, m = "trySyncWxidSilently")
/* loaded from: classes4.dex */
final class WxidClientImpl$trySyncWxidSilently$1 extends ContinuationImpl {
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ WxidClientImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxidClientImpl$trySyncWxidSilently$1(WxidClientImpl wxidClientImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = wxidClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return WxidClientImpl.d(this.r, this);
    }
}
