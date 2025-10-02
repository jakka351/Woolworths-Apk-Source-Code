package au.com.woolworths.sdui.shop.broadcastbanner;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.sdui.shop.broadcastbanner.DismissableBannerStateImpl", f = "DismissibleBannerState.kt", l = {31}, m = "dismiss")
/* loaded from: classes4.dex */
final class DismissableBannerStateImpl$dismiss$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ DismissableBannerStateImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissableBannerStateImpl$dismiss$1(DismissableBannerStateImpl dismissableBannerStateImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = dismissableBannerStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
