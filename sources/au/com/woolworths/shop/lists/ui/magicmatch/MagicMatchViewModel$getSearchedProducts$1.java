package au.com.woolworths.shop.lists.ui.magicmatch;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel", f = "MagicMatchViewModel.kt", l = {64}, m = "getSearchedProducts")
/* loaded from: classes4.dex */
final class MagicMatchViewModel$getSearchedProducts$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ MagicMatchViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicMatchViewModel$getSearchedProducts$1(MagicMatchViewModel magicMatchViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = magicMatchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.p6(this);
    }
}
