package au.com.woolworths.feature.product.list.v2.ui;

import au.com.woolworths.feature.product.list.v2.ProductListUiEvent;
import au.com.woolworths.feature.product.list.v2.data.ProductListZeroResults;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ProductCardConfig productCardConfig = (ProductCardConfig) this.e;
                ProductCard productCard = (ProductCard) this.f;
                ProductClickListener productClickListener = (ProductClickListener) this.g;
                if (productCardConfig.isInMappedStore()) {
                    InStoreLocationData inStoreLocation = productCard.getInStoreLocation();
                    if ((inStoreLocation != null ? inStoreLocation.getDetails() : null) != null) {
                        productClickListener.T0(productCard);
                    }
                }
                break;
            default:
                ((Function1) this.e).invoke(new ProductListUiEvent.OnErrorScreenClearFiltersClicked(((LinkData) this.f).b, ((ProductListZeroResults.ProductListFullScreenError) this.g).e));
                break;
        }
        return Unit.f24250a;
    }
}
