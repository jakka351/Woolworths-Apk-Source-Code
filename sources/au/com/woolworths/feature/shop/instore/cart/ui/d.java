package au.com.woolworths.feature.shop.instore.cart.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.sdui.legacy.scrollablelist.MoreCardTileUiKt;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import au.com.woolworths.shop.aem.components.ui.categorytile.ProductCategoryTileKt;
import au.com.woolworths.shop.product.details.ui.linkdedicatedviews.NutritionalInfoScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import me.onebone.toolbar.CollapsingToolbarScaffoldState;
import me.onebone.toolbar.CollapsingToolbarScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d = 3;
    public final /* synthetic */ Object e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ d(float f, TextStyle textStyle, String str, Modifier modifier, String str2, int i, int i2) {
        this.f = f;
        this.j = textStyle;
        this.e = str;
        this.k = modifier;
        this.g = str2;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).intValue();
                InstoreCartScreenKt.f((CollapsingToolbarScope) this.j, this.f, (CollapsingToolbarScaffoldState) this.k, (String) this.e, this.h, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                MoreCardTileUiKt.a((String) this.e, (Modifier) this.j, (SharedIntrinsicHeightState) this.k, this.f, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ProductCategoryTileKt.a((ProductCategoryTileData) this.j, (Modifier) this.k, (CoreElevation) this.e, this.f, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                NutritionalInfoScreenKt.c(this.f, (TextStyle) this.j, (String) this.e, (Modifier) this.k, (String) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(ProductCategoryTileData productCategoryTileData, Modifier modifier, CoreElevation coreElevation, float f, Function1 function1, int i, int i2) {
        this.j = productCategoryTileData;
        this.k = modifier;
        this.e = coreElevation;
        this.f = f;
        this.g = function1;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ d(String str, Modifier modifier, SharedIntrinsicHeightState sharedIntrinsicHeightState, float f, Function0 function0, int i, int i2) {
        this.e = str;
        this.j = modifier;
        this.k = sharedIntrinsicHeightState;
        this.f = f;
        this.g = function0;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ d(CollapsingToolbarScope collapsingToolbarScope, float f, CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, String str, int i, Function0 function0, int i2) {
        this.j = collapsingToolbarScope;
        this.f = f;
        this.k = collapsingToolbarScaffoldState;
        this.e = str;
        this.h = i;
        this.g = function0;
        this.i = i2;
    }
}
