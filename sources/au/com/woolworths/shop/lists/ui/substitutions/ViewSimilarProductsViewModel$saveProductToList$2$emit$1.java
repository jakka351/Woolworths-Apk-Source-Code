package au.com.woolworths.shop.lists.ui.substitutions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$saveProductToList$2", f = "ViewSimilarProductsViewModel.kt", l = {369, 376}, m = "emit")
/* loaded from: classes4.dex */
final class ViewSimilarProductsViewModel$saveProductToList$2$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ViewSimilarProductsViewModel$saveProductToList$2 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSimilarProductsViewModel$saveProductToList$2$emit$1(ViewSimilarProductsViewModel$saveProductToList$2 viewSimilarProductsViewModel$saveProductToList$2, Continuation continuation) {
        super(continuation);
        this.q = viewSimilarProductsViewModel$saveProductToList$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.emit(null, this);
    }
}
