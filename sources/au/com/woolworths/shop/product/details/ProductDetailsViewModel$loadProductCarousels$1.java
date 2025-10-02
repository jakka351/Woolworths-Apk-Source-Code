package au.com.woolworths.shop.product.details;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsViewModel", f = "ProductDetailsViewModel.kt", l = {314, 335}, m = "loadProductCarousels")
/* loaded from: classes4.dex */
final class ProductDetailsViewModel$loadProductCarousels$1 extends ContinuationImpl {
    public Collection p;
    public Iterator q;
    public Object r;
    public Object s;
    public Object t;
    public Collection u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ProductDetailsViewModel w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsViewModel$loadProductCarousels$1(ProductDetailsViewModel productDetailsViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.w = productDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.y6(this);
    }
}
