package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/HorizontalListItem;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HorizontalListItem {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f11475a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/HorizontalListItem$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static UnionType a() {
            return HorizontalListItem.f11475a;
        }
    }

    static {
        int i = ContentCard.f11279a;
        int i2 = MerchCardFullImage.f11571a;
        int i3 = MoreCard.f11579a;
        int i4 = NavRoundel.f11615a;
        int i5 = OfferCard.f11618a;
        int i6 = OrderCard.f11632a;
        int i7 = OrderDetailsProductCard.f11646a;
        int i8 = Pill.f11701a;
        ObjectType objectType = ProductCard.f11717a;
        int i9 = ProductTile.f11790a;
        ObjectType objectType2 = ProductCategoryTile.f11720a;
        int i10 = PromotionCard.f11799a;
        int i11 = RecipeGroupTile.f11860a;
        int i12 = RecipeMoreCard.f11865a;
        ObjectType objectType3 = RecipeSummaryCard.f11871a;
        ObjectType objectType4 = QuickLinkCard.f11810a;
        f11475a = new UnionType("HorizontalListItem");
    }
}
