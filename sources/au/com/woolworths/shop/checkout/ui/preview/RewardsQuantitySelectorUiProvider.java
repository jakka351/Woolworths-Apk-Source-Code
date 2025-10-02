package au.com.woolworths.shop.checkout.ui.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAction;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsRedeemInfo;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/preview/RewardsQuantitySelectorUiProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData$RewardsQuantitySelector;", "TestCase", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsQuantitySelectorUiProvider implements PreviewParameterProvider<ModalBottomSheetData.RewardsQuantitySelector> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/preview/RewardsQuantitySelectorUiProvider$TestCase;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final ModalBottomSheetData.RewardsQuantitySelector d;

        static {
            TestCase testCase = new TestCase("RewardsRedeemableNotApplied", 0, new ModalBottomSheetData.RewardsQuantitySelector(new CheckoutRewardsAction.CheckoutRewardsRedeem(new CheckoutRewardsRedeemInfo(1000, 5000, 5000, 1000, 0, null), "Rewards dollars", "Available: $30.00", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), 0, true, false, false));
            InsetBannerTypeApiData insetBannerTypeApiData = InsetBannerTypeApiData.WARNING;
            TestCase[] testCaseArr = {testCase, new TestCase("RewardsNotRedeemableNotApplied", 1, new ModalBottomSheetData.RewardsQuantitySelector(new CheckoutRewardsAction.CheckoutRewardsRedeem(new CheckoutRewardsRedeemInfo(1000, 5000, 5000, 1000, 0, new InsetBannerApiData(insetBannerTypeApiData, "The Rewards dollar amount cannot exceed the order total (Excludes restricted items).", null, null, null, null, 32, null)), "Rewards dollars", "Available: $30.00", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), 0, false, false, false)), new TestCase("RewardsRedeemableApplied", 2, new ModalBottomSheetData.RewardsQuantitySelector(new CheckoutRewardsAction.CheckoutRewardsRedeem(new CheckoutRewardsRedeemInfo(1000, 5000, 5000, 1000, 1000, null), "Rewards dollars", "Available: $30.00", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), 0, true, true, false)), new TestCase("RewardsNotRedeemableApplied", 3, new ModalBottomSheetData.RewardsQuantitySelector(new CheckoutRewardsAction.CheckoutRewardsRedeem(new CheckoutRewardsRedeemInfo(1000, 5000, 5000, 1000, 1000, new InsetBannerApiData(insetBannerTypeApiData, "The Rewards dollar amount cannot exceed the order total (Excludes restricted items).", null, null, null, null, 32, null)), "Rewards dollars", "Available: $30.00", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), 0, false, true, false))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, ModalBottomSheetData.RewardsQuantitySelector rewardsQuantitySelector) {
            this.d = rewardsQuantitySelector;
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
