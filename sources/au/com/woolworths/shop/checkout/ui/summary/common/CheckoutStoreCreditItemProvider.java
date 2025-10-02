package au.com.woolworths.shop.checkout.ui.summary.common;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.shop.checkout.domain.model.CheckoutStoreCreditItem;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/common/CheckoutStoreCreditItemProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditItem;", "TestCase", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutStoreCreditItemProvider implements PreviewParameterProvider<CheckoutStoreCreditItem> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/common/CheckoutStoreCreditItemProvider$TestCase;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final CheckoutStoreCreditItem d;

        static {
            Boolean bool = Boolean.FALSE;
            TestCase[] testCaseArr = {new TestCase("CreditApplied", 0, new CheckoutStoreCreditItem("$9.10 Store credit", "SCHUTC-143", "Expires on 07/09/26", "Issued on 07/09/23", true, "SCHUTC-143", "$9.10", bool)), new TestCase("CreditNotApplied", 1, new CheckoutStoreCreditItem("$15.20 Store credit", "SCHUTC-143", "Expires on 07/09/26", "Issued on 07/09/23", false, "SCHUTC-143", "$15.20", bool)), new TestCase("CreditAppliedMultilineProcessing", 2, new CheckoutStoreCreditItem("$15.20 Store Lorem ipsum odor amet, consectetuer adipiscing elit.", "SCHUTC-143 Lorem ipsum odor amet, consectetuer adipiscing elit.", "Expires on 07/09/26", "Issued on 07/09/23", true, "SCHUTC-143", "$15.20", Boolean.TRUE))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, CheckoutStoreCreditItem checkoutStoreCreditItem) {
            this.d = checkoutStoreCreditItem;
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
