package au.com.woolworths.android.onesite.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.products.Instoreprice;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.foundation.shop.cart.data.model.MarketplaceProductInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/repository/TrolleyResultMapper;", "", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TrolleyResultMapper {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/repository/TrolleyResultMapper$Companion;", "", "", "CENTS_IN_DOLLAR", "I", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public static TrolleyResult.TrolleyItem a(CartProductCard cartProductCard) {
        TrolleyResult.TrolleyItem.Marketplace marketplace;
        TrolleyResult.TrolleyItem trolleyItem = new TrolleyResult.TrolleyItem();
        trolleyItem.setMArticle(cartProductCard.getF8679a());
        trolleyItem.setName(cartProductCard.getB());
        trolleyItem.setItemQuantityInTrolley((float) cartProductCard.getD());
        Instoreprice instoreprice = new Instoreprice();
        Integer f = cartProductCard.getF();
        float fIntValue = BitmapDescriptorFactory.HUE_RED;
        instoreprice.setPriceGst(Float.valueOf(f != null ? f.intValue() / 100 : 0.0f));
        trolleyItem.setInstorePrice(instoreprice);
        Integer g = cartProductCard.getG();
        if (g != null) {
            fIntValue = g.intValue() / 100;
        }
        trolleyItem.setTotalItemPrice(fIntValue);
        trolleyItem.setAvailable(cartProductCard.getE());
        MarketplaceProductInfo j = cartProductCard.getJ();
        if (j != null) {
            marketplace = new TrolleyResult.TrolleyItem.Marketplace();
            marketplace.setBrandName(j.getB());
            marketplace.setSellerName(j.getF8695a());
        } else {
            marketplace = null;
        }
        trolleyItem.setMarketplace(marketplace);
        return trolleyItem;
    }
}
