package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductListFeed;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductListFeed {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f11751a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductListFeed$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static UnionType a() {
            return ProductListFeed.f11751a;
        }
    }

    static {
        int i = AdobeAdBannerCard.f11014a;
        int i2 = ActionableCard.f11000a;
        int i3 = DietaryDisclaimer.f11345a;
        ObjectType objectType = GoogleAdBannerCard.f11435a;
        int i4 = WebViewCard.f12018a;
        ObjectType objectType2 = ProductCard.f11717a;
        int i5 = ProductTile.f11790a;
        ObjectType objectType3 = InsetBanner.f11509a;
        int i6 = IngredientCard.f11505a;
        int i7 = ListSectionHeader.f11537a;
        int i8 = ImageTextBanner.f11486a;
        int i9 = UniversalInventoryContainer.f11979a;
        int i10 = VideoAdUnit.f12010a;
        int i11 = MerchCard.f11570a;
        ObjectType objectType4 = HorizontalList.f11472a;
        f11751a = new UnionType("ProductListFeed");
    }
}
