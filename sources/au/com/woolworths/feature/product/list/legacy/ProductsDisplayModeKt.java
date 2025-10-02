package au.com.woolworths.feature.product.list.legacy;

import android.content.Context;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsDisplayModeKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProductsDisplayMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProductsDisplayMode productsDisplayMode = ProductsDisplayMode.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final String a(ProductsDisplayMode productsDisplayMode) {
        Intrinsics.h(productsDisplayMode, "<this>");
        int iOrdinal = productsDisplayMode.ordinal();
        if (iOrdinal == 0) {
            return "List";
        }
        if (iOrdinal == 1) {
            return "Grid";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(ProductsDisplayMode productsDisplayMode, Context context) {
        int i;
        Intrinsics.h(productsDisplayMode, "<this>");
        Intrinsics.h(context, "context");
        int iOrdinal = productsDisplayMode.ordinal();
        if (iOrdinal == 0) {
            i = com.woolworths.R.string.product_list_list_mode;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.woolworths.R.string.product_list_grid_mode;
        }
        String string = context.getString(i);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    public static final int c(ProductsDisplayMode productsDisplayMode) {
        Intrinsics.h(productsDisplayMode, "<this>");
        int iOrdinal = productsDisplayMode.ordinal();
        if (iOrdinal == 0) {
            return com.woolworths.R.drawable.ic_products_display_mode_list;
        }
        if (iOrdinal == 1) {
            return com.woolworths.R.drawable.ic_products_display_mode_grid;
        }
        throw new NoWhenBranchMatchedException();
    }
}
