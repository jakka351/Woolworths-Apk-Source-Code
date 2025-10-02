package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct;
import au.com.woolworths.feature.shop.myorders.details.models.OrderProductListProductPriceStyle;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/yourgroceries/preview/YourGroceriesProductItemPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesProductItem;", "TestCase", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesProductItemPreviewProvider implements PreviewParameterProvider<YourGroceriesProductItem> {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f7809a = MapsKt.j(new Pair("product1", Boolean.TRUE), new Pair("product2", Boolean.FALSE));

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/yourgroceries/preview/YourGroceriesProductItemPreviewProvider$Companion;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/ui/compose/yourgroceries/preview/YourGroceriesProductItemPreviewProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final TestCase e;
        public static final TestCase f;
        public static final TestCase g;
        public static final TestCase h;
        public static final /* synthetic */ TestCase[] i;
        public static final /* synthetic */ EnumEntries j;
        public final YourGroceriesProductItem d;

        static {
            OrderProductListProductPriceStyle orderProductListProductPriceStyle = OrderProductListProductPriceStyle.d;
            TestCase testCase = new TestCase("SuppliedProduct", 0, new YourGroceriesProductItem("Qty Supplied", "1", "$12.00", orderProductListProductPriceStyle));
            e = testCase;
            TestCase testCase2 = new TestCase("OutOfStockProduct", 1, new YourGroceriesProductItem("Qty Refunded", "1 of 1", "-$4.00", OrderProductListProductPriceStyle.e));
            f = testCase2;
            Boolean bool = Boolean.TRUE;
            TestCase testCase3 = new TestCase("SubstitutedProduct", 2, new YourGroceriesProductItem("productId", "Sacred Grounds Grover Blend Ground Coffee 200g", "", "Qty Supplied", "0 of 2", "$24.00", orderProductListProductPriceStyle, CollectionsKt.Q(new YourGroceriesSubstitutedProduct("product1", "", "Sacred Grounds Breezy Blend Ground Coffee 200g", "$24.00", "Sacred Grounds Breezy Blend Ground Coffee 200g", bool, "Substituted with", "Price match", "Qty Supplied", "3", bool))));
            g = testCase3;
            YourGroceriesSubstitutedProduct yourGroceriesSubstitutedProduct = new YourGroceriesSubstitutedProduct("product1", "", "Sacred Grounds Breezy Blend Ground Coffee 200g", "$12.00", "Sacred Grounds Breezy Blend Ground Coffee 200g", bool, "Substituted with", "Price match", "Qty Supplied", "3", bool);
            Boolean bool2 = Boolean.FALSE;
            TestCase testCase4 = new TestCase("SubstitutedWithTwoProduct", 3, new YourGroceriesProductItem("productId", "Sacred Grounds Grover Blend Ground Coffee 200g", "", "Qty Supplied", "0 of 2", "$24.00", orderProductListProductPriceStyle, CollectionsKt.R(yourGroceriesSubstitutedProduct, new YourGroceriesSubstitutedProduct("product2", "", "Sacred Grounds Breezy Blend Ground Coffee 200g", "$12.00", "Sacred Grounds Breezy Blend Ground Coffee 200g", bool2, "Substituted with", "Price match", "Qty Supplied", "3", bool), new YourGroceriesSubstitutedProduct("product3", "", "Sacred Grounds Breezy Blend Ground Coffee 200g", "$12.00", "Sacred Grounds Breezy Blend Ground Coffee 200g", bool2, "Substituted with", "Price match", "Qty Supplied", "3", bool))));
            h = testCase4;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4};
            i = testCaseArr;
            j = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i2, YourGroceriesProductItem yourGroceriesProductItem) {
            this.d = yourGroceriesProductItem;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) i.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
