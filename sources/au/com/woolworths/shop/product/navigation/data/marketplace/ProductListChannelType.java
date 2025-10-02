package au.com.woolworths.shop.product.navigation.data.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/product/navigation/data/marketplace/ProductListChannelType;", "", "<init>", "(Ljava/lang/String;I)V", "MARKETPLACE", "WOW", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductListChannelType {

    @SerializedName("Marketplace")
    public static final ProductListChannelType MARKETPLACE;

    @SerializedName("WOW")
    public static final ProductListChannelType WOW;
    public static final /* synthetic */ ProductListChannelType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ProductListChannelType productListChannelType = new ProductListChannelType("MARKETPLACE", 0);
        MARKETPLACE = productListChannelType;
        ProductListChannelType productListChannelType2 = new ProductListChannelType("WOW", 1);
        WOW = productListChannelType2;
        ProductListChannelType[] productListChannelTypeArr = {productListChannelType, productListChannelType2, new ProductListChannelType("UNKNOWN", 2)};
        d = productListChannelTypeArr;
        e = EnumEntriesKt.a(productListChannelTypeArr);
    }

    private ProductListChannelType(String str, int i) {
    }

    public static ProductListChannelType valueOf(String str) {
        return (ProductListChannelType) Enum.valueOf(ProductListChannelType.class, str);
    }

    public static ProductListChannelType[] values() {
        return (ProductListChannelType[]) d.clone();
    }
}
