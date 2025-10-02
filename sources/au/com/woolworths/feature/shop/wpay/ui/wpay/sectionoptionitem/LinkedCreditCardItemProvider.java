package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/LinkedCreditCardItemProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard$Linked;", "TestCase", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LinkedCreditCardItemProvider implements PreviewParameterProvider<PaymentMethodItem.CreditCard.Linked> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/LinkedCreditCardItemProvider$TestCase;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final PaymentMethodItem.CreditCard.Linked d;

        static {
            TestCase[] testCaseArr = {new TestCase("Unselected", 0, new PaymentMethodItem.CreditCard.Linked("1", "Credit Card Unselected", "1234", "https://some.url", false, "Amount to pay", "$10.00", 1000, "https://some.url")), new TestCase("NonZeroPayment", 1, new PaymentMethodItem.CreditCard.Linked("1", "Credit Card Selected", "1234", "https://some.url", true, "Amount to pay", "$10.00", 1000, "https://some.url")), new TestCase("ZeroPayment", 2, new PaymentMethodItem.CreditCard.Linked("1", "Credit Card Paying Zero", "1234", "https://some.url", true, "Amount to pay", "$0.00", 0, "https://some.url"))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, PaymentMethodItem.CreditCard.Linked linked) {
            this.d = linked;
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
