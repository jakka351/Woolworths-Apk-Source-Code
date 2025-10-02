package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsData;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.preview.YourGroceriesListPreviewProvider;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/yourgroceries/preview/YourGroceriesScreenPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$ViewState;", "TestCase", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesScreenPreviewProvider implements PreviewParameterProvider<YourGroceriesContract.ViewState> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/yourgroceries/preview/YourGroceriesScreenPreviewProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            List list = YourGroceriesListPreviewProvider.TestCase.e.d.f7807a;
            EmptyList emptyList = EmptyList.d;
            new YourGroceriesContract.ViewState(false, list, new YourGroceriesContract.PaymentSummaryInfo("Total (Incl. GST)", "$123.45", new OrderPaymentDetailsData(emptyList, emptyList, emptyList, emptyList, emptyList, emptyList, emptyList, emptyList, null)), new OrderHelpDataList(null, null, emptyList, emptyList, null), null, null, 48);
            TestCase testCase = new TestCase("Content", 0);
            new YourGroceriesContract.ViewState(false, YourGroceriesListPreviewProvider.TestCase.f.d.f7807a, null, null, null, null, 60);
            TestCase testCase2 = new TestCase("ContentWithNoPaymentInfoAndNoHelp", 1);
            new YourGroceriesContract.ViewState(false, YourGroceriesListPreviewProvider.TestCase.g.d.f7807a, new YourGroceriesContract.PaymentSummaryInfo("Total (Incl. GST)", "$123.45", new OrderPaymentDetailsData(emptyList, emptyList, emptyList, emptyList, emptyList, emptyList, emptyList, emptyList, null)), new OrderHelpDataList(null, null, emptyList, emptyList, null), null, null, 48);
            TestCase testCase3 = new TestCase("ContentWithCurrentOrder", 2);
            new YourGroceriesContract.ViewState(true, emptyList, null, null, null, null, 60);
            TestCase testCase4 = new TestCase("Loading", 3);
            new YourGroceriesContract.ViewState(false, emptyList, null, null, YourGroceriesContract.ErrorState.d, null, 44);
            TestCase testCase5 = new TestCase("ServerError", 4);
            new YourGroceriesContract.ViewState(false, emptyList, null, null, YourGroceriesContract.ErrorState.e, null, 44);
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, new TestCase("NetworkError", 5)};
            d = testCaseArr;
            e = EnumEntriesKt.a(testCaseArr);
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) d.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
