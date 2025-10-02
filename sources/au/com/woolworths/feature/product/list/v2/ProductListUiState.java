package au.com.woolworths.feature.product.list.v2;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.product.list.v2.data.ProductListData;
import au.com.woolworths.feature.product.list.v2.ui.ProductsDisplayMode;
import au.com.woolworths.product.models.ProductCardConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiState;", "", "Companion", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListUiState {
    public static final ProductListUiState j = new ProductListUiState(null, null, false, false, null, false, ProductsDisplayMode.e, ProductCardConfig.INSTANCE.getDefault(), EmptyList.d);

    /* renamed from: a, reason: collision with root package name */
    public final String f5522a;
    public final ProductListData b;
    public final boolean c;
    public final boolean d;
    public final Integer e;
    public final boolean f;
    public final ProductsDisplayMode g;
    public final ProductCardConfig h;
    public final List i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListUiState$Companion;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductListUiState(String str, ProductListData productListData, boolean z, boolean z2, Integer num, boolean z3, ProductsDisplayMode productsDisplayMode, ProductCardConfig productCardConfig, List list) {
        Intrinsics.h(productCardConfig, "productCardConfig");
        this.f5522a = str;
        this.b = productListData;
        this.c = z;
        this.d = z2;
        this.e = num;
        this.f = z3;
        this.g = productsDisplayMode;
        this.h = productCardConfig;
        this.i = list;
    }

    public static ProductListUiState a(ProductListUiState productListUiState, String str, ProductListData productListData, boolean z, boolean z2, Integer num, boolean z3, ProductsDisplayMode productsDisplayMode, ProductCardConfig productCardConfig, List list, int i) {
        if ((i & 1) != 0) {
            str = productListUiState.f5522a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            productListData = productListUiState.b;
        }
        ProductListData productListData2 = productListData;
        if ((i & 4) != 0) {
            z = productListUiState.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = productListUiState.d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            num = productListUiState.e;
        }
        Integer num2 = num;
        boolean z6 = (i & 32) != 0 ? productListUiState.f : z3;
        ProductsDisplayMode productsDisplayMode2 = (i & 64) != 0 ? productListUiState.g : productsDisplayMode;
        ProductCardConfig productCardConfig2 = (i & 128) != 0 ? productListUiState.h : productCardConfig;
        List watchlistProductIds = (i & 256) != 0 ? productListUiState.i : list;
        productListUiState.getClass();
        Intrinsics.h(productsDisplayMode2, "productsDisplayMode");
        Intrinsics.h(productCardConfig2, "productCardConfig");
        Intrinsics.h(watchlistProductIds, "watchlistProductIds");
        return new ProductListUiState(str2, productListData2, z4, z5, num2, z6, productsDisplayMode2, productCardConfig2, watchlistProductIds);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListUiState)) {
            return false;
        }
        ProductListUiState productListUiState = (ProductListUiState) obj;
        return Intrinsics.c(this.f5522a, productListUiState.f5522a) && Intrinsics.c(this.b, productListUiState.b) && this.c == productListUiState.c && this.d == productListUiState.d && Intrinsics.c(this.e, productListUiState.e) && this.f == productListUiState.f && this.g == productListUiState.g && Intrinsics.c(this.h, productListUiState.h) && Intrinsics.c(this.i, productListUiState.i);
    }

    public final int hashCode() {
        String str = this.f5522a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ProductListData productListData = this.b;
        int iE = b.e(b.e((iHashCode + (productListData == null ? 0 : productListData.hashCode())) * 31, 31, this.c), 31, this.d);
        Integer num = this.e;
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + b.e((iE + (num != null ? num.hashCode() : 0)) * 31, 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductListUiState(pageTitle=");
        sb.append(this.f5522a);
        sb.append(", pageData=");
        sb.append(this.b);
        sb.append(", showCartIcon=");
        au.com.woolworths.android.onesite.a.D(sb, this.c, ", showSearchBar=", this.d, ", cartQuantity=");
        sb.append(this.e);
        sb.append(", showVoiceSearchButton=");
        sb.append(this.f);
        sb.append(", productsDisplayMode=");
        sb.append(this.g);
        sb.append(", productCardConfig=");
        sb.append(this.h);
        sb.append(", watchlistProductIds=");
        return android.support.v4.media.session.a.t(sb, this.i, ")");
    }
}
