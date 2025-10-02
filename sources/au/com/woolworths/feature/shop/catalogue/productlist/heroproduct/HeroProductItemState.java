package au.com.woolworths.feature.shop.catalogue.productlist.heroproduct;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.extensions.FloatExtKt;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/heroproduct/HeroProductItemState;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$BaseItemState;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HeroProductItemState implements CatalogueProductListContract.BaseItemState {

    /* renamed from: a, reason: collision with root package name */
    public final HeroProductTile f6936a;
    public final boolean b;
    public final ProductCard c;
    public final boolean d;
    public final String e;

    static {
        int i = ProductCard.$stable;
        int i2 = MemberPriceInfo.$stable;
    }

    public HeroProductItemState(HeroProductTile heroProductTile, boolean z, ProductCard productCard, boolean z2) {
        String strA;
        this.f6936a = heroProductTile;
        this.b = z;
        this.c = productCard;
        this.d = z2;
        String str = heroProductTile.b.b;
        this.e = (str == null || (strA = FloatExtKt.a(Float.parseFloat(str))) == null) ? "" : strA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroProductItemState)) {
            return false;
        }
        HeroProductItemState heroProductItemState = (HeroProductItemState) obj;
        return Intrinsics.c(this.f6936a, heroProductItemState.f6936a) && this.b == heroProductItemState.b && Intrinsics.c(this.c, heroProductItemState.c) && this.d == heroProductItemState.d;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract.BaseItemState
    /* renamed from: getItemType */
    public final CatalogueProductListContract.ItemStateType getE() {
        return CatalogueProductListContract.ItemStateType.d;
    }

    public final int hashCode() {
        int iE = b.e(this.f6936a.hashCode() * 31, 31, this.b);
        ProductCard productCard = this.c;
        return Boolean.hashCode(this.d) + ((iE + (productCard == null ? 0 : productCard.hashCode())) * 31);
    }

    public final String toString() {
        return "HeroProductItemState(heroProductTile=" + this.f6936a + ", validAdditionalItemAvailable=" + this.b + ", productCard=" + this.c + ", aisleActionable=" + this.d + ")";
    }
}
