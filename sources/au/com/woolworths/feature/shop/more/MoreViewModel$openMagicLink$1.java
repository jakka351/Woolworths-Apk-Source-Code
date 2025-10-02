package au.com.woolworths.feature.shop.more;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.more.MoreViewModel", f = "MoreViewModel.kt", l = {846}, m = "openMagicLink")
/* loaded from: classes3.dex */
final class MoreViewModel$openMagicLink$1 extends ContinuationImpl {
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ MoreViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreViewModel$openMagicLink$1(MoreViewModel moreViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = moreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.u6(null, this);
    }
}
