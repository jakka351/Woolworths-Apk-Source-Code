package au.com.woolworths.shop.lists.ui.shoppinglist.sort;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewModel", f = "SortByViewModel.kt", l = {204}, m = "checkAndDisplayMagicMatchOnboarding")
/* loaded from: classes4.dex */
final class SortByViewModel$checkAndDisplayMagicMatchOnboarding$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SortByViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortByViewModel$checkAndDisplayMagicMatchOnboarding$1(SortByViewModel sortByViewModel, Continuation continuation) {
        super(continuation);
        this.q = sortByViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return SortByViewModel.p6(this.q, this);
    }
}
