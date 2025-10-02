package au.com.woolworths.feature.product.list.legacy.compose.filter;

import au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel;
import au.com.woolworths.feature.product.list.legacy.ProductsDisplayMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListOptionsScreenKt$ProductListOptionsScreen$2$6$1 extends FunctionReferenceImpl implements Function1<ProductsDisplayMode, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductsDisplayMode p0 = (ProductsDisplayMode) obj;
        Intrinsics.h(p0, "p0");
        ((ProductListOptionsViewModel) this.receiver).Q1(p0);
        return Unit.f24250a;
    }
}
