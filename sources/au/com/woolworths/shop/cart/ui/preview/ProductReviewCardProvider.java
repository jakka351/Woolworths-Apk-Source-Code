package au.com.woolworths.shop.cart.ui.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.base.shopapp.modules.badge.BadgeTypeApiData;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityInfo;
import au.com.woolworths.shop.cart.domain.model.ProductAlternative;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeType;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/ProductReviewCardProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/cart/domain/model/ProductReviewCard;", "TestCase", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewCardProvider implements PreviewParameterProvider<ProductReviewCard> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/ProductReviewCardProvider$Companion;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ProductReviewCard a(String str) {
            return new ProductReviewCard("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed varius, ante non aliquam posuere, ante justo lacinia ligula, et aliquet tortor dui id nulla.", str, 3.0d, "", null, null, null, true, null, null, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/preview/ProductReviewCardProvider$TestCase;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final TestCase e;
        public static final TestCase f;
        public static final TestCase g;
        public static final TestCase h;
        public static final TestCase i;
        public static final TestCase j;
        public static final TestCase k;
        public static final TestCase l;
        public static final TestCase m;
        public static final TestCase n;
        public static final /* synthetic */ TestCase[] o;
        public static final /* synthetic */ EnumEntries p;
        public final ProductReviewCard d;

        static {
            ProductReviewCard productReviewCardA = Companion.a("0");
            BadgeTypeApiData badgeTypeApiData = BadgeTypeApiData.DISABLED;
            TestCase testCase = new TestCase("UnavailableAlternativeNone", 0, ProductReviewCard.a(productReviewCardA, 0.0d, new BadgeApiData("Out of Stock", badgeTypeApiData, null), null, null, null, 2031));
            e = testCase;
            ProductReviewCard productReviewCardA2 = Companion.a("1");
            BadgeApiData badgeApiData = new BadgeApiData("Out of Stock", badgeTypeApiData, null);
            ProductReviewAlternativeType productReviewAlternativeType = ProductReviewAlternativeType.e;
            TestCase testCase2 = new TestCase("UnavailableAlternativeSearch", 1, ProductReviewCard.a(productReviewCardA2, 0.0d, badgeApiData, null, new ProductAlternative("Search for similar", productReviewAlternativeType), null, 1775));
            f = testCase2;
            ProductReviewCard productReviewCardA3 = Companion.a("2");
            BadgeApiData badgeApiData2 = new BadgeApiData("Out of Stock", badgeTypeApiData, null);
            ProductReviewAlternativeType productReviewAlternativeType2 = ProductReviewAlternativeType.d;
            TestCase testCase3 = new TestCase("UnavailableAlternativeAvailable", 2, ProductReviewCard.a(productReviewCardA3, 0.0d, badgeApiData2, null, new ProductAlternative("8 similar available", productReviewAlternativeType2), null, 1775));
            g = testCase3;
            TestCase testCase4 = new TestCase("RestrictedAlternativeNone", 3, ProductReviewCard.a(Companion.a("3"), 2.0d, null, new CartProductQuantityInfo(2.0d), null, null, 1947));
            h = testCase4;
            TestCase testCase5 = new TestCase("RestrictedAlternativeSearch", 4, ProductReviewCard.a(Companion.a("4"), 2.0d, null, new CartProductQuantityInfo(2.0d), new ProductAlternative("Search for similar", productReviewAlternativeType), null, 1691));
            i = testCase5;
            TestCase testCase6 = new TestCase("RestrictedAlternativeAvailable", 5, ProductReviewCard.a(Companion.a("5"), 2.0d, null, new CartProductQuantityInfo(2.0d), new ProductAlternative("8 similar available", productReviewAlternativeType2), null, 1691));
            j = testCase6;
            TestCase testCase7 = new TestCase("AtpItemLimit", 6, ProductReviewCard.a(Companion.a("6"), 3.0d, null, new CartProductQuantityInfo(2.0d), new ProductAlternative("8 similar available", productReviewAlternativeType2), "2 items left", 667));
            k = testCase7;
            TestCase testCase8 = new TestCase("AtpWeightLimit", 7, ProductReviewCard.a(Companion.a("7"), 8.0d, null, new CartProductQuantityInfo(1.0d, 7.3d, 1.0d, 1.0d, "kg"), new ProductAlternative("8 similar available", productReviewAlternativeType2), "7.3kg left", 667));
            l = testCase8;
            TestCase testCase9 = new TestCase("AtpItemLimitTrader", 8, ProductReviewCard.a(Companion.a("8"), 38.0d, null, new CartProductQuantityInfo(36.0d), null, "36 item limit", 923));
            m = testCase9;
            TestCase testCase10 = new TestCase("AtpWeightLimitTrader", 9, ProductReviewCard.a(Companion.a("9"), 11.0d, null, new CartProductQuantityInfo(1.0d, 7.3d, 1.0d, 1.0d, "kg"), null, "10kg limit", 923));
            n = testCase10;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3, testCase4, testCase5, testCase6, testCase7, testCase8, testCase9, testCase10};
            o = testCaseArr;
            p = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i2, ProductReviewCard productReviewCard) {
            this.d = productReviewCard;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) o.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        List list = TestCase.p;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = ((AbstractList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((TestCase) it.next()).d);
        }
        return CollectionsKt.n(arrayList);
    }
}
