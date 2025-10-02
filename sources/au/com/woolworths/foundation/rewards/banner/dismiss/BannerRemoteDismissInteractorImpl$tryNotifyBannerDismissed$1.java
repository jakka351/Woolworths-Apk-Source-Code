package au.com.woolworths.foundation.rewards.banner.dismiss;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl", f = "BannerRemoteDismissInteractorImpl.kt", l = {25}, m = "tryNotifyBannerDismissed")
/* loaded from: classes4.dex */
final class BannerRemoteDismissInteractorImpl$tryNotifyBannerDismissed$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ BannerRemoteDismissInteractorImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerRemoteDismissInteractorImpl$tryNotifyBannerDismissed$1(BannerRemoteDismissInteractorImpl bannerRemoteDismissInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = bannerRemoteDismissInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
