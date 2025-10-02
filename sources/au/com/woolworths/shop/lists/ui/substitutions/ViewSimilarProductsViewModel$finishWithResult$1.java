package au.com.woolworths.shop.lists.ui.substitutions;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel", f = "ViewSimilarProductsViewModel.kt", l = {381, 383}, m = "finishWithResult")
/* loaded from: classes4.dex */
final class ViewSimilarProductsViewModel$finishWithResult$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ViewSimilarProductsViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSimilarProductsViewModel$finishWithResult$1(ViewSimilarProductsViewModel viewSimilarProductsViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = viewSimilarProductsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return ViewSimilarProductsViewModel.q6(this.q, null, this);
    }
}
