package au.com.woolworths.feature.product.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListFragment e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k(ProductListFragment productListFragment, Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.e = productListFragment;
        this.f = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        ProductListFragment productListFragment = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                float f = ProductListFragment.u;
                productListFragment.I2((LazyPagingItems) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(9));
                break;
            case 1:
                ((Integer) obj2).getClass();
                float f2 = ProductListFragment.u;
                productListFragment.h2((String) obj4, (IngredientCardApiData) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                float f3 = ProductListFragment.u;
                productListFragment.i2((String) obj4, (ListSectionHeaderApiData) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                float f4 = ProductListFragment.u;
                productListFragment.Q1((String) obj4, (DynamicSizeCardData) obj3, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return unit;
    }
}
