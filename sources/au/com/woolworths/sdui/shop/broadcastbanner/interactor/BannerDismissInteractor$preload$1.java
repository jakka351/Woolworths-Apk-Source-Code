package au.com.woolworths.sdui.shop.broadcastbanner.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.sdui.shop.broadcastbanner.interactor.BannerDismissInteractor", f = "BannerDismissInteractor.kt", l = {26}, m = "preload")
/* loaded from: classes.dex */
final class BannerDismissInteractor$preload$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ BannerDismissInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerDismissInteractor$preload$1(BannerDismissInteractor bannerDismissInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = bannerDismissInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(this);
    }
}
