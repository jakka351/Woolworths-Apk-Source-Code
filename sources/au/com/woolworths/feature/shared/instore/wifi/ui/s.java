package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplaceProductCarouselUiKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ s(ProductCard productCard, String str, ProductClickListener productClickListener, ProductCardButtonsState productCardButtonsState, ProductCardConfig productCardConfig, boolean z, boolean z2, Modifier modifier, int i) {
        this.i = productCard;
        this.e = str;
        this.j = productClickListener;
        this.k = productCardButtonsState;
        this.l = productCardConfig;
        this.f = z;
        this.g = z2;
        this.m = modifier;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                JoinInStoreWifiScreenKt.k((Function0) this.i, this.f, (Function1) this.k, (Function0) this.j, this.e, (String) this.l, (Function2) this.m, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                MarketplaceProductCarouselUiKt.b((ProductCard) this.i, this.e, (ProductClickListener) this.j, (ProductCardButtonsState) this.k, (ProductCardConfig) this.l, this.f, this.g, (Modifier) this.m, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ s(Function0 function0, boolean z, Function1 function1, Function0 function02, String str, String str2, Function2 function2, boolean z2, int i) {
        this.i = function0;
        this.f = z;
        this.k = function1;
        this.j = function02;
        this.e = str;
        this.l = str2;
        this.m = function2;
        this.g = z2;
        this.h = i;
    }
}
