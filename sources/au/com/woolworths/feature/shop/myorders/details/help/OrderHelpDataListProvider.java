package au.com.woolworths.feature.shop.myorders.details.help;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.myorders.details.help.models.ContactItem;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpContactTimes;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemData;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpItemType;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderHelpDataListProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/myorders/details/help/models/OrderHelpDataList;", "TestCase", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderHelpDataListProvider implements PreviewParameterProvider<OrderHelpDataList> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/OrderHelpDataListProvider$TestCase;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final OrderHelpDataList d;

        static {
            TestCase[] testCaseArr = {new TestCase(new OrderHelpDataList("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/order/order_help_chat.png", "Get help from Olive, our virtual assistant, or connect with our team", EmptyList.d, CollectionsKt.R(new OrderHelpItemData("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/order/help_faqs.png", "Read frequently asked questions", "", "https://uatsite.woolworths.com.au/shop/page/help-and-support-faq", OrderHelpItemType.FAQ), new OrderHelpItemData("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/order/help_live_chat.png", "Message us", "", "https://chatwidget-test.woolworths.com.au/templates/wowo.html?currentPage=past-orders-page", OrderHelpItemType.CHAT), new OrderHelpItemData("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/order/help_call_us.png", "Call us", "", "https://uatsite.woolworths.com.au/shop/discover/about-us/contact-us", OrderHelpItemType.CALL_US)), new OrderHelpContactTimes("Our team is available:", "Public holidays may differ.", CollectionsKt.R(new ContactItem("Monday - Friday", "5am - 1am (AEDT)"), new ContactItem("Saturday", "5am - 10:30pm (AEDT)"), new ContactItem("Sunday", "5am - 10pm (AEDT)")))))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(OrderHelpDataList orderHelpDataList) {
            this.d = orderHelpDataList;
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
