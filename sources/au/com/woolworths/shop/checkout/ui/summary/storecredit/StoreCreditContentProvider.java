package au.com.woolworths.shop.checkout.ui.summary.storecredit;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.shop.checkout.domain.model.CheckoutStoreCreditDetail;
import au.com.woolworths.shop.checkout.ui.content.StoreCreditContent;
import au.com.woolworths.shop.checkout.ui.details.d;
import au.com.woolworths.shop.checkout.ui.summary.common.CheckoutStoreCreditItemProvider;
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
import kotlin.sequences.SequencesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/storecredit/StoreCreditContentProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/checkout/ui/content/StoreCreditContent;", "TestCase", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StoreCreditContentProvider implements PreviewParameterProvider<StoreCreditContent> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/storecredit/StoreCreditContentProvider$TestCase;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class TestCase {
        public static final TestCase e = new TestCase("Loading", 0, StoreCreditContent.Loading.f10765a);
        public static final TestCase f = new TestCase("ConnectionError", 1, StoreCreditContent.ConnectionError.f10764a);
        public static final TestCase g = new TestCase("ServerError", 2, StoreCreditContent.ServerError.f10766a);
        public static final TestCase h = new TestCase("SuccessEmpty", 3, new StoreCreditContent.Success(new CheckoutStoreCreditDetail.Empty("No available store credit", "Store credit that has been issued to your account by our Customer Care Team will appear here.")));
        public static final TestCase i = new TestCase("SuccessUnavailable", 4, new StoreCreditContent.Success(new CheckoutStoreCreditDetail.Unavailable("Unable to load store credit", "We were unable to load store credits, please try again", "Try again")));
        public static final /* synthetic */ TestCase[] j;
        public static final /* synthetic */ EnumEntries k;
        public final StoreCreditContent d;

        static {
            List list = CheckoutStoreCreditItemProvider.TestCase.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = ((AbstractList) list).iterator();
            while (it.hasNext()) {
                arrayList.add(((CheckoutStoreCreditItemProvider.TestCase) it.next()).d);
            }
            TestCase[] testCaseArr = {e, f, g, h, i, new TestCase("SuccessItems", 5, new StoreCreditContent.Success(new CheckoutStoreCreditDetail.Items("Available balance:", "$24.30", arrayList)))};
            j = testCaseArr;
            k = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i2, StoreCreditContent storeCreditContent) {
            this.d = storeCreditContent;
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) j.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return SequencesKt.r(CollectionsKt.n(TestCase.k), new d(24));
    }
}
