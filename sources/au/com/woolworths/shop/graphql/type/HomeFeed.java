package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/HomeFeed;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeFeed {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f11458a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/HomeFeed$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static UnionType a() {
            return HomeFeed.f11458a;
        }
    }

    static {
        int i = ActionableCard.f11000a;
        int i2 = AddRewardsCard.f11010a;
        ObjectType objectType = BroadcastBanner.f11060a;
        int i3 = BoosterHorizontalList.f11052a;
        int i4 = Carousel.f11097a;
        int i5 = CatalogueCard.f11135a;
        ObjectType objectType2 = DividerCard.f11348a;
        ObjectType objectType3 = GoogleAdBannerCard.f11435a;
        ObjectType objectType4 = InsetBanner.f11509a;
        int i6 = MarketplaceCard.f11553a;
        int i7 = MyShoppingLists.f11612a;
        int i8 = OrderHorizontalList.f11653a;
        int i9 = ProductHorizontalList.f11744a;
        int i10 = QuickLinkList.f11812a;
        int i11 = QuickLinkHorizontalList.f11811a;
        int i12 = RecipeHorizontalList.f11861a;
        int i13 = RegistrationCard.f11876a;
        int i14 = RewardsBalanceCard.f11882a;
        int i15 = RewardsSummaryCard.f11885a;
        f11458a = new UnionType("HomeFeed");
    }
}
