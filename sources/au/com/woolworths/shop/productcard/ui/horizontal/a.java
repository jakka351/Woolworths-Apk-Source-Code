package au.com.woolworths.shop.productcard.ui.horizontal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.productcard.data.MarketplaceInfo;
import au.com.woolworths.shop.productcard.data.ProductPriceInfo;
import au.com.woolworths.shop.productcard.ui.vertical.VerticalProductTileContentUiKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ String e;
    public final /* synthetic */ ProductPriceInfo f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ MarketplaceInfo i;
    public final /* synthetic */ Modifier j;
    public final /* synthetic */ Function3 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ a(String str, ProductPriceInfo productPriceInfo, String str2, String str3, MarketplaceInfo marketplaceInfo, Modifier modifier, Function3 function3, int i, int i2) {
        this.e = str;
        this.f = productPriceInfo;
        this.g = str2;
        this.h = str3;
        this.i = marketplaceInfo;
        this.j = modifier;
        this.k = function3;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                HorizontalProductTileContentUiKt.a(RecomposeScopeImplKt.a(this.l | 1), this.m, (Composer) obj, this.j, this.i, this.f, this.e, this.g, this.h, this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                VerticalProductTileContentUiKt.a(RecomposeScopeImplKt.a(this.l | 1), this.m, (Composer) obj, this.j, this.i, this.f, this.e, this.g, this.h, this.k);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(String str, String str2, String str3, ProductPriceInfo productPriceInfo, MarketplaceInfo marketplaceInfo, Modifier modifier, Function3 function3, int i, int i2) {
        this.e = str;
        this.g = str2;
        this.h = str3;
        this.f = productPriceInfo;
        this.i = marketplaceInfo;
        this.j = modifier;
        this.k = function3;
        this.l = i;
        this.m = i2;
    }
}
