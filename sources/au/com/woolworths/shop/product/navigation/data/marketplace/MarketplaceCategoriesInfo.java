package au.com.woolworths.shop.product.navigation.data.marketplace;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/product/navigation/data/marketplace/MarketplaceCategoriesInfo;", "", "Lau/com/woolworths/shop/graphql/type/ProductListChannelType;", "channel", "Lau/com/woolworths/shop/graphql/type/ProductListFacetType;", "facet", "<init>", "(Lau/com/woolworths/shop/graphql/type/ProductListChannelType;Lau/com/woolworths/shop/graphql/type/ProductListFacetType;)V", "Lau/com/woolworths/shop/graphql/type/ProductListChannelType;", "a", "()Lau/com/woolworths/shop/graphql/type/ProductListChannelType;", "Lau/com/woolworths/shop/graphql/type/ProductListFacetType;", "b", "()Lau/com/woolworths/shop/graphql/type/ProductListFacetType;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MarketplaceCategoriesInfo {

    @SerializedName("channel")
    @NotNull
    private final au.com.woolworths.shop.graphql.type.ProductListChannelType channel;

    @SerializedName("facet")
    @NotNull
    private final au.com.woolworths.shop.graphql.type.ProductListFacetType facet;

    public MarketplaceCategoriesInfo(@NotNull au.com.woolworths.shop.graphql.type.ProductListChannelType channel, @NotNull au.com.woolworths.shop.graphql.type.ProductListFacetType facet) {
        Intrinsics.h(channel, "channel");
        Intrinsics.h(facet, "facet");
        this.channel = channel;
        this.facet = facet;
    }

    /* renamed from: a, reason: from getter */
    public final au.com.woolworths.shop.graphql.type.ProductListChannelType getChannel() {
        return this.channel;
    }

    /* renamed from: b, reason: from getter */
    public final au.com.woolworths.shop.graphql.type.ProductListFacetType getFacet() {
        return this.facet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceCategoriesInfo)) {
            return false;
        }
        MarketplaceCategoriesInfo marketplaceCategoriesInfo = (MarketplaceCategoriesInfo) obj;
        return this.channel == marketplaceCategoriesInfo.channel && this.facet == marketplaceCategoriesInfo.facet;
    }

    public final int hashCode() {
        return this.facet.hashCode() + (this.channel.hashCode() * 31);
    }

    public final String toString() {
        return "MarketplaceCategoriesInfo(channel=" + this.channel + ", facet=" + this.facet + ")";
    }
}
