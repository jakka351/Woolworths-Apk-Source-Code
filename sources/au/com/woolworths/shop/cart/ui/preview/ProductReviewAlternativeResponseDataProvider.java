package au.com.woolworths.shop.cart.ui.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerError;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeResponseData;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeResponseInfoCta;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeResponseInfoData;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.ui.preview.ProductReviewCardProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/ProductReviewAlternativeResponseDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/cart/domain/model/PageResult;", "Lau/com/woolworths/shop/cart/domain/model/ProductReviewAlternativeResponseData;", "TestCase", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewAlternativeResponseDataProvider implements PreviewParameterProvider<PageResult<? extends ProductReviewAlternativeResponseData>> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/ProductReviewAlternativeResponseDataProvider$TestCase;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final PageResult d;

        static {
            TestCase testCase = new TestCase("Loading", 0, PageResult.Uninitialized.f10439a);
            TestCase testCase2 = new TestCase("Alternatives", 1, new PageResult.Success(new ProductReviewAlternativeResponseData(ProductReviewCardProvider.Companion.a("1"), CollectionsKt.R(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 3), ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3)), "Search for something specific", "8 suggested products", "", "", new ProductReviewAlternativeResponseInfoData("Suggested products", "These items are suggested based on similar characteristics to your original item. Please check the product label for product allergens or warnings", new ProductReviewAlternativeResponseInfoCta("Got it", null), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))));
            ProductReviewCard productReviewCardA = ProductReviewCardProvider.Companion.a("1");
            ProductReviewAlternativeResponseInfoData productReviewAlternativeResponseInfoData = new ProductReviewAlternativeResponseInfoData("Suggested products", "These items are suggested based on similar characteristics to your original item. Please check the product label for product allergens or warnings", new ProductReviewAlternativeResponseInfoCta("Got it", null), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null));
            AnalyticsData analyticsData = new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null);
            EmptyList emptyList = EmptyList.d;
            TestCase[] testCaseArr = {testCase, testCase2, new TestCase("UnableToLoadProducts", 2, new PageResult.Success(new ProductReviewAlternativeResponseData(productReviewCardA, emptyList, "Search for something specific", null, "We had an issue loading product suggestions, try again or search for something specific.", "Try again", productReviewAlternativeResponseInfoData, analyticsData))), new TestCase("NoProducts", 3, new PageResult.Success(new ProductReviewAlternativeResponseData(ProductReviewCardProvider.Companion.a("1"), emptyList, "Search for something specific", null, "Unfortunately we were unable to return alternatives for your original product.\nTry search for something specific.", null, new ProductReviewAlternativeResponseInfoData("Suggested products", "These items are suggested based on similar characteristics to your original item. Please check the product label for product allergens or warnings", new ProductReviewAlternativeResponseInfoCta("Got it", null), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)))), new TestCase("NoConnection", 4, new PageResult.Fail(new NoConnectivityException())), new TestCase("ServerError", 5, new PageResult.Fail(new ServerErrorException(new ServerError(ServerErrorCode.d, null))))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, PageResult pageResult) {
            this.d = pageResult;
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
