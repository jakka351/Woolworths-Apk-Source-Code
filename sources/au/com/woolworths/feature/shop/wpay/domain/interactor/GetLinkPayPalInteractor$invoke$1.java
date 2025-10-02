package au.com.woolworths.feature.shop.wpay.domain.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.domain.interactor.GetLinkPayPalInteractor", f = "GetLinkPayPalInteractor.kt", l = {25}, m = "invoke")
/* loaded from: classes3.dex */
final class GetLinkPayPalInteractor$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ GetLinkPayPalInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLinkPayPalInteractor$invoke$1(GetLinkPayPalInteractor getLinkPayPalInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = getLinkPayPalInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
