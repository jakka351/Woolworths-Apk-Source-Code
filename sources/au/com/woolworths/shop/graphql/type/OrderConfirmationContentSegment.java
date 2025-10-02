package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OrderConfirmationContentSegment;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderConfirmationContentSegment {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f11639a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/OrderConfirmationContentSegment$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = OrderConfirmationBannerImage.f11636a;
        ObjectType objectType = IconTextBanner.f11479a;
        int i2 = OrderConfirmationHeader.f11641a;
        int i3 = CheckoutOrderAddresses.f11218a;
        int i4 = CheckoutOrderSummary.f11222a;
        int i5 = OrderConfirmationFooterText.f11640a;
        int i6 = ActionableCard.f11000a;
        ObjectType objectType2 = GoogleAdBannerCard.f11435a;
        int i7 = UniversalInventoryContainer.f11979a;
        int i8 = OrderConfirmationCMOBroadcastBanner.f11637a;
        f11639a = new UnionType("OrderConfirmationContentSegment");
    }
}
