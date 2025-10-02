package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesBroadcastBannerData;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesCategoryItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFullfilmentStatusItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesHeaderGroupItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.preview.YourGroceriesProductItemPreviewProvider;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/yourgroceries/preview/YourGroceriesListPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/myorders/details/ui/compose/yourgroceries/preview/YourGroceriesListPreviewConfig;", "TestCase", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesListPreviewProvider implements PreviewParameterProvider<YourGroceriesListPreviewConfig> {

    /* renamed from: a, reason: collision with root package name */
    public static final YourGroceriesFilterGroupItem f7808a = new YourGroceriesFilterGroupItem(CollectionsKt.R(new YourGroceriesFilterGroupItem.YourGroceriesFilterItem("all", "All", true, 4), new YourGroceriesFilterGroupItem.YourGroceriesFilterItem("outofstock", "Out of Stock", false, 2), new YourGroceriesFilterGroupItem.YourGroceriesFilterItem("substitutions", "Substitution", false, 1), new YourGroceriesFilterGroupItem.YourGroceriesFilterItem("supplied", "Supplied", false, 1)));
    public static final YourGroceriesFilterGroupItem b = new YourGroceriesFilterGroupItem(CollectionsKt.R(new YourGroceriesFilterGroupItem.YourGroceriesFilterItem("all", "All", true, 4), new YourGroceriesFilterGroupItem.YourGroceriesFilterItem("supplied", "Supplied", false, 1)));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/yourgroceries/preview/YourGroceriesListPreviewProvider$Companion;", "", "Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesFilterGroupItem;", "allFilters", "Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesFilterGroupItem;", "fewFilters", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/yourgroceries/preview/YourGroceriesListPreviewProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final TestCase e;
        public static final TestCase f;
        public static final TestCase g;
        public static final /* synthetic */ TestCase[] h;
        public static final /* synthetic */ EnumEntries i;
        public final YourGroceriesListPreviewConfig d;

        static {
            YourGroceriesFilterGroupItem yourGroceriesFilterGroupItem = YourGroceriesListPreviewProvider.f7808a;
            YourGroceriesHeaderGroupItem yourGroceriesHeaderGroupItem = new YourGroceriesHeaderGroupItem(yourGroceriesFilterGroupItem, "");
            YourGroceriesFullfilmentStatusItem yourGroceriesFullfilmentStatusItem = new YourGroceriesFullfilmentStatusItem("Out of stock", null);
            YourGroceriesCategoryItem yourGroceriesCategoryItem = new YourGroceriesCategoryItem("BAKERY");
            YourGroceriesProductItem yourGroceriesProductItem = YourGroceriesProductItemPreviewProvider.TestCase.f.d;
            YourGroceriesFullfilmentStatusItem yourGroceriesFullfilmentStatusItem2 = new YourGroceriesFullfilmentStatusItem("Substitutions", null);
            YourGroceriesBroadcastBannerData yourGroceriesBroadcastBannerData = new YourGroceriesBroadcastBannerData("Substitution preference", "Some items couldn't be substituted to match your preferences. We're continually improving the substitution experience and we apologise that we may not have got it right this time. If you're unsatisfied with your substitutes, chat with Olive to request a refund.", null, null, null, null, "image", null, null);
            YourGroceriesCategoryItem yourGroceriesCategoryItem2 = new YourGroceriesCategoryItem("DIARY");
            YourGroceriesProductItemPreviewProvider.TestCase testCase = YourGroceriesProductItemPreviewProvider.TestCase.h;
            YourGroceriesProductItem yourGroceriesProductItem2 = testCase.d;
            YourGroceriesFullfilmentStatusItem yourGroceriesFullfilmentStatusItem3 = new YourGroceriesFullfilmentStatusItem("Supplied", null);
            YourGroceriesCategoryItem yourGroceriesCategoryItem3 = new YourGroceriesCategoryItem("HOUSEHOLD");
            YourGroceriesProductItemPreviewProvider.TestCase testCase2 = YourGroceriesProductItemPreviewProvider.TestCase.e;
            TestCase testCase3 = new TestCase("AllItems", 0, new YourGroceriesListPreviewConfig(CollectionsKt.R(yourGroceriesHeaderGroupItem, yourGroceriesFullfilmentStatusItem, yourGroceriesCategoryItem, yourGroceriesProductItem, yourGroceriesFullfilmentStatusItem2, yourGroceriesBroadcastBannerData, yourGroceriesCategoryItem2, yourGroceriesProductItem2, yourGroceriesFullfilmentStatusItem3, yourGroceriesCategoryItem3, testCase2.d)));
            e = testCase3;
            YourGroceriesFilterGroupItem yourGroceriesFilterGroupItem2 = YourGroceriesListPreviewProvider.b;
            YourGroceriesHeaderGroupItem yourGroceriesHeaderGroupItem2 = new YourGroceriesHeaderGroupItem(yourGroceriesFilterGroupItem2, "");
            YourGroceriesFullfilmentStatusItem yourGroceriesFullfilmentStatusItem4 = new YourGroceriesFullfilmentStatusItem("Supplied", null);
            YourGroceriesCategoryItem yourGroceriesCategoryItem4 = new YourGroceriesCategoryItem("HOUSEHOLD");
            YourGroceriesProductItem yourGroceriesProductItem3 = testCase2.d;
            TestCase testCase4 = new TestCase("LessItems", 1, new YourGroceriesListPreviewConfig(CollectionsKt.R(yourGroceriesHeaderGroupItem2, yourGroceriesFullfilmentStatusItem4, yourGroceriesCategoryItem4, yourGroceriesProductItem3)));
            f = testCase4;
            YourGroceriesHeaderGroupItem yourGroceriesHeaderGroupItem3 = new YourGroceriesHeaderGroupItem(yourGroceriesFilterGroupItem2, "");
            YourGroceriesFullfilmentStatusItem yourGroceriesFullfilmentStatusItem5 = new YourGroceriesFullfilmentStatusItem("Supplied", null);
            YourGroceriesCategoryItem yourGroceriesCategoryItem5 = new YourGroceriesCategoryItem("HOUSEHOLD");
            YourGroceriesProductItemPreviewProvider.TestCase testCase5 = YourGroceriesProductItemPreviewProvider.TestCase.g;
            TestCase testCase6 = new TestCase("SubstituteItems", 2, new YourGroceriesListPreviewConfig(CollectionsKt.R(yourGroceriesHeaderGroupItem3, yourGroceriesFullfilmentStatusItem5, yourGroceriesCategoryItem5, testCase5.d)));
            TestCase testCase7 = new TestCase("MultipleSubstituteItems", 3, new YourGroceriesListPreviewConfig(CollectionsKt.R(new YourGroceriesHeaderGroupItem(yourGroceriesFilterGroupItem, ""), new YourGroceriesFullfilmentStatusItem("Substitutions", null), new YourGroceriesCategoryItem("DIARY"), testCase.d, testCase5.d)));
            TestCase testCase8 = new TestCase("CurrentOrder", 4, new YourGroceriesListPreviewConfig(CollectionsKt.R(new YourGroceriesCategoryItem("HOUSEHOLD"), yourGroceriesProductItem3, yourGroceriesProductItem3, yourGroceriesProductItem3, yourGroceriesProductItem3)));
            g = testCase8;
            TestCase[] testCaseArr = {testCase3, testCase4, testCase6, testCase7, testCase8};
            h = testCaseArr;
            i = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i2, YourGroceriesListPreviewConfig yourGroceriesListPreviewConfig) {
            this.d = yourGroceriesListPreviewConfig;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) h.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
