package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutSegmentContent;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutSegmentContent {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f11255a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckoutSegmentContent$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ObjectType objectType = InsetBanner.f11509a;
        int i = CheckoutMarketFulfilmentAddress.f11214a;
        int i2 = CheckoutCollectionMethod.f11189a;
        ObjectType objectType2 = CheckoutFulfilmentWindows.f11210a;
        int i3 = CheckoutFulfilmentWindowsEmptyState.f11211a;
        int i4 = CheckoutFulfilmentWindowsSelectedState.f11212a;
        int i5 = CheckoutDeliveryPreferenceToggle.f11201a;
        int i6 = CheckoutDeliveryPreferenceText.f11200a;
        int i7 = CheckoutPackagingMethod.f11227a;
        int i8 = CheckoutPromotionCode.f11240a;
        int i9 = CheckoutProductCampaigns.f11230a;
        int i10 = CheckoutProducts.f11236a;
        ObjectType objectType3 = CheckoutSectionHeader.f11254a;
        int i11 = CheckoutCollectionAddressDelivery.f11186a;
        int i12 = CheckoutMarketProducts.f11216a;
        int i13 = CheckoutCollectionAddressEmpty.f11187a;
        int i14 = CheckoutSummaryBillingAddress.f11262a;
        int i15 = CheckoutSummaryBillingAddressEmpty.f11263a;
        int i16 = CheckoutRewardsAndDiscounts.f11248a;
        int i17 = CheckoutSummaryRewards.f11264a;
        int i18 = CheckoutSummaryRewardsUnregistered.f11268a;
        int i19 = CheckoutOrderAddresses.f11218a;
        int i20 = CheckoutOrderSummary.f11222a;
        int i21 = CheckoutTermsConditions.f11270a;
        int i22 = ImageTextBanner.f11486a;
        int i23 = CheckoutContactDetails.f11191a;
        f11255a = new UnionType("CheckoutSegmentContent");
    }
}
