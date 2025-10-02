package au.com.woolworths.shop.cart.ui.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.foundation.shop.cart.data.model.BundlePromotionInfo;
import au.com.woolworths.foundation.shop.cart.data.model.BundleType;
import au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMorePromotionInfo;
import au.com.woolworths.foundation.shop.cart.data.model.BuyMoreSaveMoreType;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityInfo;
import au.com.woolworths.foundation.shop.cart.data.model.MemberPricePromotionInfo;
import au.com.woolworths.foundation.shop.cart.data.model.MultiBuyPromotionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/CartProductCardProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartProductCard;", "TestCase", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartProductCardProvider implements PreviewParameterProvider<CartProductCard> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/CartProductCardProvider$TestCase;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final CartProductCard d;

        static {
            TestCase testCase = new TestCase("Available", 0, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, null, null, null, null, null, null, 458528));
            TestCase testCase2 = new TestCase("Unavailable", 1, new CartProductCard(false, new CartProductQuantityInfo(0.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, null, null, null, null, null, null, 458592));
            TestCase testCase3 = new TestCase("Specials", 2, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), "Was $585858", null, null, null, null, null, null, 455456));
            TestCase testCase4 = new TestCase("BuyMoreSaveMoreNotApplied", 3, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, null, null, new MultiBuyPromotionInfo("Buy More Save More", "2 for $8.00", false), null, null, null, 507680));
            TestCase testCase5 = new TestCase("BuyMoreSaveMoreApplied", 4, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, null, null, new MultiBuyPromotionInfo("Buy More Save More applied", "2 for $8.00", true), null, null, null, 507680));
            TestCase testCase6 = new TestCase("MemberPricingNotApplied", 5, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, new MemberPricePromotionInfo("Member Price", "2 for $8.00", false), null, null, null, null, null, 519968));
            TestCase testCase7 = new TestCase("MemberPricingApplied", 6, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, new MemberPricePromotionInfo("Member Price", "2 for $8.00", true), null, null, null, null, null, 519968));
            TestCase testCase8 = new TestCase("AtpLimit", 7, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, null, null, null, "3 items left", null, null, 458528));
            TestCase testCase9 = new TestCase("MemberBundle", 8, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, null, null, null, "3 items left", new BundlePromotionInfo("Bundle offer applied", true, BundleType.d, true), null, 327456));
            CartProductQuantityInfo cartProductQuantityInfo = new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm");
            BundleType bundleType = BundleType.e;
            TestCase testCase10 = new TestCase("OnlineBundle", 9, new CartProductCard(true, cartProductQuantityInfo, "Non-bundle price $2.30", null, null, null, "3 items left", new BundlePromotionInfo("Bundle offer applied", true, bundleType, true), null, 325408));
            TestCase testCase11 = new TestCase("OnlineBundleShowBannerFalse", 10, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), "Non-bundle price $2.30", null, null, null, "3 items left", new BundlePromotionInfo("Bundle offer applied", true, bundleType, false), null, 325408));
            CartProductQuantityInfo cartProductQuantityInfo2 = new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm");
            BuyMoreSaveMoreType buyMoreSaveMoreType = BuyMoreSaveMoreType.e;
            TestCase testCase12 = new TestCase("NewBuyMoreSaveMoreNotApplied", 11, new CartProductCard(true, cartProductQuantityInfo2, null, null, null, null, null, null, new BuyMoreSaveMorePromotionInfo("offer123", "Buy 2 or more for $3.50 each", "Pick any 2", false, buyMoreSaveMoreType, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), 261920));
            TestCase testCase13 = new TestCase("NewBuyMoreSaveMoreApplied", 12, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, null, null, null, null, null, new BuyMoreSaveMorePromotionInfo("offer123", "Enjoy more savings", "Pick any at $3.50", true, buyMoreSaveMoreType, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), 261920));
            CartProductQuantityInfo cartProductQuantityInfo3 = new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm");
            BuyMoreSaveMoreType buyMoreSaveMoreType2 = BuyMoreSaveMoreType.d;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, testCase6, testCase7, testCase8, testCase9, testCase10, testCase11, testCase12, testCase13, new TestCase("MemberBuyMoreSaveMoreNotApplied", 13, new CartProductCard(true, cartProductQuantityInfo3, null, null, null, null, null, null, new BuyMoreSaveMorePromotionInfo("offer123", "Member Price\nBuy 2 or more for $3.50 each", "Pick any 2", false, buyMoreSaveMoreType2, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), 261920)), new TestCase("MemberBuyMoreSaveMoreApplied", 14, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, null, null, null, null, null, new BuyMoreSaveMorePromotionInfo("offer123", "Enjoy your Member Price", "Pick any at $3.50", true, buyMoreSaveMoreType2, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), 261920)), new TestCase("SingleMemberPricingNotApplied", 15, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, null, new MemberPricePromotionInfo("Member Price", "2 for $8.00", false), null, null, null, null, 515872)), new TestCase("SingleMemberPricingApplied", 16, new CartProductCard(true, new CartProductQuantityInfo(1.0d, 4.0d, 1.0d, 0.0d, "kpm"), null, null, new MemberPricePromotionInfo("Member Price", "2 for $8.00", true), null, null, null, null, 515872))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, CartProductCard cartProductCard) {
            this.d = cartProductCard;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) e.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        List list = TestCase.f;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = ((AbstractList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((TestCase) it.next()).d);
        }
        return CollectionsKt.n(arrayList);
    }
}
