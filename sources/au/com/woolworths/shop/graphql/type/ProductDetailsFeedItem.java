package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductDetailsFeedItem;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f11725a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductDetailsFeedItem$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = ActionableCard.f11000a;
        ObjectType objectType = CouponBanner.f11295a;
        ObjectType objectType2 = ProductCard.f11717a;
        int i2 = ProductNutritionInfo.f11759a;
        int i3 = ProductOriginAndHealthInfo.f11760a;
        ObjectType objectType3 = ProductRatingsAndReviewsSummary.f11766a;
        ObjectType objectType4 = ImageContent.f11485a;
        int i4 = FormattedContent.f11398a;
        int i5 = FormattedBanner.f11397a;
        int i6 = ProductDisclaimer.f11738a;
        int i7 = HealthierHorizontalList.f11446a;
        int i8 = ProductHorizontalList.f11744a;
        ObjectType objectType5 = InsetBanner.f11509a;
        int i9 = PromotionBanner.f11798a;
        int i10 = ProductDetailsMarketplace.f11727a;
        ObjectType objectType6 = DividerCard.f11348a;
        int i11 = Footer.f11395a;
        f11725a = new UnionType("ProductDetailsFeedItem");
    }
}
