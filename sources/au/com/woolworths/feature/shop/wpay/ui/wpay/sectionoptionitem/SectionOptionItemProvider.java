package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderIconType;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionHeaderSelectionType;
import com.woolworths.R;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionItemProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderItem;", "TestCase", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SectionOptionItemProvider implements PreviewParameterProvider<SectionOptionHeaderItem> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionItemProvider$TestCase;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final SectionOptionHeaderItem d;

        static {
            TestCase[] testCaseArr = {new TestCase("CreditCard", 0, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.Radio(false, true, new au.com.woolworths.feature.shop.bundles.ui.a(7)), new SectionOptionHeaderIconType.ImageUrl("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/mastercard.png", R.drawable.ic_card_type), "Visa …1234", "Exp: 08/27", new au.com.woolworths.feature.shop.bundles.ui.a(7))), new TestCase("CreditCardSelected", 1, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.Radio(true, true, new au.com.woolworths.feature.shop.bundles.ui.a(7)), new SectionOptionHeaderIconType.ImageUrl("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/mastercard.png", R.drawable.ic_card_type), "Visa …1234", "Exp: 08/27", new au.com.woolworths.feature.shop.bundles.ui.a(7))), new TestCase("CreditCardTitleOnly", 2, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.Radio(false, true, new au.com.woolworths.feature.shop.bundles.ui.a(7)), new SectionOptionHeaderIconType.ImageUrl("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/mastercard.png", R.drawable.ic_card_type), "Visa …1234", null, new au.com.woolworths.feature.shop.bundles.ui.a(7))), new TestCase("CreditCardTitleOnlySelected", 3, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.Radio(true, true, new au.com.woolworths.feature.shop.bundles.ui.a(7)), new SectionOptionHeaderIconType.ImageUrl("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/mastercard.png", R.drawable.ic_card_type), "Visa …1234", null, new au.com.woolworths.feature.shop.bundles.ui.a(7))), new TestCase("ExpiredCreditCard", 4, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.Radio(false, false, new au.com.woolworths.feature.shop.bundles.ui.a(7)), new SectionOptionHeaderIconType.ImageUrl("https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/mastercard.png", R.drawable.ic_card_type), "Visa …1234", "Card expired", new au.com.woolworths.feature.shop.bundles.ui.a(7))), new TestCase("GiftCard", 5, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.CheckBox(new au.com.woolworths.feature.shop.recipes.recipes.list.b(20), false), new SectionOptionHeaderIconType.Resource(R.drawable.ic_gift_card), "Gift card …1234", null, new au.com.woolworths.feature.shop.bundles.ui.a(7))), new TestCase("GiftCardSelected", 6, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.CheckBox(new au.com.woolworths.feature.shop.recipes.recipes.list.b(20), true), new SectionOptionHeaderIconType.Resource(R.drawable.ic_gift_card), "Gift card …1234", null, new au.com.woolworths.feature.shop.bundles.ui.a(7))), new TestCase("PayPal", 7, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.Radio(false, true, new au.com.woolworths.feature.shop.bundles.ui.a(7)), new SectionOptionHeaderIconType.Resource(R.drawable.paypal), "johndoe@gmail.com", null, new au.com.woolworths.feature.shop.bundles.ui.a(7))), new TestCase("PayPalSelected", 8, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.Radio(true, true, new au.com.woolworths.feature.shop.bundles.ui.a(7)), new SectionOptionHeaderIconType.Resource(R.drawable.paypal), "johndoe@gmail.com", null, new au.com.woolworths.feature.shop.bundles.ui.a(7))), new TestCase("GooglePay", 9, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.Radio(false, true, new au.com.woolworths.feature.shop.bundles.ui.a(7)), new SectionOptionHeaderIconType.Resource(R.drawable.google_pay), "Google Pay", null, null)), new TestCase("GooglePaySelected", 10, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.Radio(true, true, new au.com.woolworths.feature.shop.bundles.ui.a(7)), new SectionOptionHeaderIconType.Resource(R.drawable.google_pay), "Google Pay", null, new au.com.woolworths.feature.shop.bundles.ui.a(7))), new TestCase("SectionOptionRadioOverflow", 11, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.Radio(true, true, new au.com.woolworths.feature.shop.bundles.ui.a(7)), new SectionOptionHeaderIconType.Resource(R.drawable.ic_card_type), "Title and very long text that should overflow", "Card expired and very long title that should overflow", new au.com.woolworths.feature.shop.bundles.ui.a(7))), new TestCase("SectionOptionCheckBoxOverflow", 12, new SectionOptionHeaderItem(new SectionOptionHeaderSelectionType.CheckBox(new au.com.woolworths.feature.shop.recipes.recipes.list.b(20), true), new SectionOptionHeaderIconType.Resource(R.drawable.ic_gift_card), "Title and very long text that should overflow", null, new au.com.woolworths.feature.shop.bundles.ui.a(7)))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, SectionOptionHeaderItem sectionOptionHeaderItem) {
            this.d = sectionOptionHeaderItem;
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
