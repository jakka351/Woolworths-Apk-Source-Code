package au.com.woolworths.feature.shop.more;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.more.MoreViewModel", f = "MoreViewModel.kt", l = {837}, m = "openMyAccountWebView")
/* loaded from: classes3.dex */
final class MoreViewModel$openMyAccountWebView$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ MoreViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreViewModel$openMyAccountWebView$1(MoreViewModel moreViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = moreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return MoreViewModel.p6(this.q, this);
    }
}
