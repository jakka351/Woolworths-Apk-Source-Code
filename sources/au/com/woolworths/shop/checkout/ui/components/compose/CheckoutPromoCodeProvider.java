package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromoCode;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromoCodeDetail;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/compose/CheckoutPromoCodeProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutRewardsAndDiscount$PromoCode;", "TestCase", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutPromoCodeProvider implements PreviewParameterProvider<CheckoutRewardsAndDiscount.PromoCode> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/compose/CheckoutPromoCodeProvider$TestCase;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final TestCase e;
        public static final TestCase f;
        public static final /* synthetic */ TestCase[] g;
        public static final /* synthetic */ EnumEntries h;
        public final CheckoutRewardsAndDiscount.PromoCode d;

        static {
            TestCase testCase = new TestCase("PromoCodeNotApplied", 0, new CheckoutRewardsAndDiscount.PromoCode("Promo codes", "", false, null, new CheckoutPromoCodeDetail("Enter promo code", "Apply", EmptyList.d)));
            e = testCase;
            Boolean bool = Boolean.FALSE;
            TestCase testCase2 = new TestCase("PromoCodeApplied", 1, new CheckoutRewardsAndDiscount.PromoCode("Promo codes", "Applied: SAVE10", true, null, new CheckoutPromoCodeDetail("Enter promo code", "Apply", CollectionsKt.Q(new CheckoutPromoCode.CheckoutPromoCodeItem("SAVE10", "", "T&Cs apply", "Expires on 07/09/26", true, "SAVE10", bool)))));
            TestCase testCase3 = new TestCase("PromoCodeMixed", 2, new CheckoutRewardsAndDiscount.PromoCode("Promo codes", "Applied: SAVE10, ENJOY20, HELLO30, NEW40, TEAM50, MEMBER60", true, null, new CheckoutPromoCodeDetail("Enter promo code", "Apply", CollectionsKt.R(new CheckoutPromoCode.CheckoutPromoCodeItem("SAVE10", "", "T&Cs apply", "Expires on 07/09/26", true, "SAVE10", bool), new CheckoutPromoCode.CheckoutPromoCodeItem("EXTRA15", "", "T&Cs apply", "Expires on 07/09/26", false, "EXTRA15", bool), new CheckoutPromoCode.CheckoutPromoCodeItem("ENJOY20", "", "T&Cs apply", "Expires on 07/09/26", true, "ENJOY20", bool), new CheckoutPromoCode.CheckoutPromoCodeItem("HELLO30", "", "T&Cs apply", "Expires on 07/09/26", true, "HELLO30", bool), new CheckoutPromoCode.CheckoutPromoCodeItem("TEAM50", "", "T&Cs apply", "Expires on 07/09/26", true, "TEAM50", bool)))));
            f = testCase3;
            TestCase[] testCaseArr = {testCase, testCase2, testCase3};
            g = testCaseArr;
            h = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, CheckoutRewardsAndDiscount.PromoCode promoCode) {
            this.d = promoCode;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) g.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        List list = TestCase.h;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = ((AbstractList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((TestCase) it.next()).d);
        }
        return CollectionsKt.n(arrayList);
    }
}
