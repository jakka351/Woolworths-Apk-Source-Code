package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutSubstitutionPreferences;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionState;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/compose/CheckoutSubstitutesRowPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/checkout/ui/components/compose/CheckoutSubstitutesRowPreviewData;", "TestCases", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutSubstitutesRowPreviewProvider implements PreviewParameterProvider<CheckoutSubstitutesRowPreviewData> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/compose/CheckoutSubstitutesRowPreviewProvider$TestCases;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCases {
        public static final /* synthetic */ TestCases[] e;
        public static final /* synthetic */ EnumEntries f;
        public final CheckoutSubstitutesRowPreviewData d;

        static {
            TestCases[] testCasesArr = {new TestCases("Selected", 0, new CheckoutSubstitutesRowPreviewData(new CheckoutSubstitutionPreferences("Allow substitutions", "1 of 1 items", SubstitutionState.d))), new TestCases("Unselected", 1, new CheckoutSubstitutesRowPreviewData(new CheckoutSubstitutionPreferences("Allow substitutions", "", SubstitutionState.e))), new TestCases("Error", 2, new CheckoutSubstitutesRowPreviewData(new CheckoutSubstitutionPreferences("Substitutions", "There was an issue loading substitution preferences.", SubstitutionState.f)))};
            e = testCasesArr;
            f = EnumEntriesKt.a(testCasesArr);
        }

        public TestCases(String str, int i, CheckoutSubstitutesRowPreviewData checkoutSubstitutesRowPreviewData) {
            this.d = checkoutSubstitutesRowPreviewData;
        }

        public static TestCases valueOf(String str) {
            return (TestCases) Enum.valueOf(TestCases.class, str);
        }

        public static TestCases[] values() {
            return (TestCases[]) e.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        List list = TestCases.f;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = ((AbstractList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((TestCases) it.next()).d);
        }
        return CollectionsKt.n(arrayList);
    }
}
