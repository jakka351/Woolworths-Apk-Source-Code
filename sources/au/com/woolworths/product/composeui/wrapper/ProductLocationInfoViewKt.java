package au.com.woolworths.product.composeui.wrapper;

import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductLocationInfoViewKt {
    public static final void a(ProductLocationInfoView productLocationInfoView, Function0 actionListener) {
        Intrinsics.h(productLocationInfoView, "<this>");
        Intrinsics.h(actionListener, "actionListener");
        productLocationInfoView.setActionListener(actionListener);
    }

    public static final void b(ProductLocationInfoView productLocationInfoView, boolean z) {
        Intrinsics.h(productLocationInfoView, "<this>");
        productLocationInfoView.setActionable(z);
    }

    public static final void c(ProductLocationInfoView productLocationInfoView, ProductCard productCard) {
        Intrinsics.h(productLocationInfoView, "<this>");
        productLocationInfoView.setProductCard(productCard);
    }
}
