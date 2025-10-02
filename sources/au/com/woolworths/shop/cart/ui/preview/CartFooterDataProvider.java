package au.com.woolworths.shop.cart.ui.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.foundation.shop.cart.data.model.CartFooterData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/CartFooterDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartFooterData;", "TestCase", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartFooterDataProvider implements PreviewParameterProvider<CartFooterData> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/CartFooterDataProvider$TestCase;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final CartFooterData d;

        static {
            ButtonStyleApiData buttonStyleApiData = ButtonStyleApiData.PRIMARY;
            TestCase[] testCaseArr = {new TestCase("WithSavings", 0, new CartFooterData(new ButtonApiData("Checkout", null, buttonStyleApiData, true, null, null, null, null, null, 448, null), "Excl. service fees", "🎉 SAVING $42.00", 16)), new TestCase("WithoutSavings", 1, new CartFooterData(new ButtonApiData("Checkout", null, buttonStyleApiData, true, null, null, null, null, null, 448, null), "Excl. service fees", null, 16)), new TestCase("WithoutTotalDescription", 2, new CartFooterData(new ButtonApiData("Checkout", null, buttonStyleApiData, true, null, null, null, null, null, 448, null), null, "🎉 SAVING $42.00", 16)), new TestCase("WithNeitherDescriptionNorSavings", 3, new CartFooterData(new ButtonApiData("Checkout", null, buttonStyleApiData, true, null, null, null, null, null, 448, null), null, null, 16)), new TestCase("WithDisclaimerMarkdownText", 4, new CartFooterData(new ButtonApiData("Checkout", null, buttonStyleApiData, true, null, null, null, null, null, 448, null), "Estimated Total", "$420.00", "Excl. service fees", "**About estimated totals**\n\nWhen you place your order, we’ll put a hold on your card for your estimated total. After you receive your order, we’ll charge the final total.\n\nReasons your final total might be different from your estimated total:\n - our team weighs products you’ve ordered by weight\n - any out of stock products are removed or substituted", "🎉 SAVING $42.00"))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, CartFooterData cartFooterData) {
            this.d = cartFooterData;
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
