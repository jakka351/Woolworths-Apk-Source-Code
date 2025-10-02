package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/FeedItem;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FeedItem {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f11385a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/FeedItem$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static UnionType a() {
            return FeedItem.f11385a;
        }
    }

    static {
        ObjectType objectType = HorizontalList.f11472a;
        int i = OrderDetails.f11643a;
        ObjectType objectType2 = OrderTime.f11675a;
        int i2 = EditOrderButton.f11365a;
        ObjectType objectType3 = InsetBanner.f11509a;
        int i3 = OrderDetailsDivider.f11644a;
        ObjectType objectType4 = OrderDetailsStatus.f11647a;
        ObjectType objectType5 = DeliveryInstructions.f11312a;
        int i4 = PickupInstructions.f11696a;
        ObjectType objectType6 = Button.f11080a;
        int i5 = OrderRewardsSummary.f11672a;
        ObjectType objectType7 = OrderPaymentDetails.f11661a;
        ObjectType objectType8 = RecipeSummaryCard.f11871a;
        int i6 = FreshMagTile.f11403a;
        int i7 = DualImageBanner.f11354a;
        int i8 = Spacer.f11925a;
        int i9 = OrderFulfilmentDetails.f11648a;
        ObjectType objectType9 = OrderDetailSummary.f11642a;
        ObjectType objectType10 = OrderStoreDetails.f11673a;
        ObjectType objectType11 = OrderCollectionDetails.f11634a;
        int i10 = OrderOverview.f11659a;
        int i11 = CurrentPickupOrderOverview.f11305a;
        int i12 = OrderNumberDetails.f11658a;
        int i13 = CurrentDeliveryOrderOverview.f11301a;
        int i14 = PastOrderOverview.f11682a;
        int i15 = CurrentPickupOrderFulfilmentDetails.f11304a;
        int i16 = DeliveryDriverDetails.f11311a;
        int i17 = CurrentPickupLocationTrackingStatus.f11303a;
        int i18 = OrderProofOfDeliveryDetails.f11671a;
        int i19 = PastPickupOrderFulfilmentDetails.f11683a;
        int i20 = DeliveryOrderFulfilmentDetails.f11316a;
        int i21 = DriverRating.f11350a;
        f11385a = new UnionType("FeedItem");
    }
}
