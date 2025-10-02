package au.com.woolworths.feature.shop.wpay.domain.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.domain.interactor.GetAddGiftCardInteractor", f = "GetAddGiftCardInteractor.kt", l = {23}, m = "invoke")
/* loaded from: classes3.dex */
final class GetAddGiftCardInteractor$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ GetAddGiftCardInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAddGiftCardInteractor$invoke$1(GetAddGiftCardInteractor getAddGiftCardInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = getAddGiftCardInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, false, this);
    }
}
