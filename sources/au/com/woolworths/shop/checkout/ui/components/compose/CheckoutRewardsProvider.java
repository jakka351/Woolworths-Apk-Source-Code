package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAction;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsRedeemInfo;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/compose/CheckoutRewardsProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount$CheckoutRewards;", "TestCase", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutRewardsProvider implements PreviewParameterProvider<CheckoutRewardsAndDiscount.CheckoutRewards> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/compose/CheckoutRewardsProvider$TestCase;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final CheckoutRewardsAndDiscount.CheckoutRewards d;

        static {
            TestCase[] testCaseArr = {new TestCase("RewardsDollarsRedeemable", 0, new CheckoutRewardsAndDiscount.CheckoutRewards("Rewards dollars", "Available: $30", false, new CheckoutRewardsAction.CheckoutRewardsRedeem(new CheckoutRewardsRedeemInfo(10, 30, 30, 10, 0, null), "Rewards dollars", "Available: $30", null), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), new TestCase("RewardsDollarsRedeemed", 1, new CheckoutRewardsAndDiscount.CheckoutRewards("Rewards dollars", "Using: $10", true, new CheckoutRewardsAction.CheckoutRewardsRedeem(new CheckoutRewardsRedeemInfo(10, 30, 30, 10, 10, null), "Rewards dollars", "Using: $10", null), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), new TestCase("RewardsDollarsUnavailable", 2, new CheckoutRewardsAndDiscount.CheckoutRewards("Rewards dollars", "Available: $0", false, null, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), new TestCase("BankForChristmas", 3, new CheckoutRewardsAndDiscount.CheckoutRewards("Bank for Christmas", "Total banked: $80", false, new CheckoutRewardsAction.CheckoutRewardsInfo("Bank for Christmas", "Get all your money off at Christmas, available from 01/12/24", "Got it", null, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), new TestCase("QantasPoints", 4, new CheckoutRewardsAndDiscount.CheckoutRewards("Qantas points", "Converting to Qantas Points", false, new CheckoutRewardsAction.CheckoutRewardsInfo("Qantas points", "Convert to Qantas Points. 2000 Everyday Rewards Points = 1000 Qantas Points", "Got it", null, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), new TestCase("EverydayRewardsLink", 5, new CheckoutRewardsAndDiscount.CheckoutRewards("Everyday Rewards", "Join or link Everyday Rewards", false, CheckoutRewardsAction.CheckoutRewardsLink.d, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, CheckoutRewardsAndDiscount.CheckoutRewards checkoutRewards) {
            this.d = checkoutRewards;
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
