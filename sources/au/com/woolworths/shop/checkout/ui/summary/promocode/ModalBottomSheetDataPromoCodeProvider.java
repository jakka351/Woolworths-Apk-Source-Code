package au.com.woolworths.shop.checkout.ui.summary.promocode;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionPlacementTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionTypeApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCodeResult;
import au.com.woolworths.shop.checkout.domain.model.ApplyPromoCodeBannerTypeData;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.ui.components.compose.CheckoutPromoCodeProvider;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/promocode/ModalBottomSheetDataPromoCodeProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/checkout/ui/content/ModalBottomSheetData$PromoCode;", "TestCase", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ModalBottomSheetDataPromoCodeProvider implements PreviewParameterProvider<ModalBottomSheetData.PromoCode> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/promocode/ModalBottomSheetDataPromoCodeProvider$TestCase;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final ModalBottomSheetData.PromoCode d;

        static {
            CheckoutPromoCodeProvider.TestCase testCase = CheckoutPromoCodeProvider.TestCase.e;
            TestCase testCase2 = new TestCase("Empty", 0, new ModalBottomSheetData.PromoCode(testCase.d, "", null, null, null, null));
            TestCase testCase3 = new TestCase("NonEmpty", 1, new ModalBottomSheetData.PromoCode(CheckoutPromoCodeProvider.TestCase.f.d, "", null, null, null, null));
            CheckoutRewardsAndDiscount.PromoCode promoCode = testCase.d;
            TestCase[] testCaseArr = {testCase2, testCase3, new TestCase("ErrorSingleLine", 2, new ModalBottomSheetData.PromoCode(promoCode, "", null, new PlainText("No network connection. Please retry."), null, null)), new TestCase("ErrorMultiline", 3, new ModalBottomSheetData.PromoCode(promoCode, "", null, new PlainText("Sorry, you've reached the maximum number of promo codes allowed per order"), null, null)), new TestCase("EditMode", 4, new ModalBottomSheetData.PromoCode(promoCode, "NEW10", null, null, null, null)), new TestCase("CreditLinkedInsetBanner", 5, new ModalBottomSheetData.PromoCode(promoCode, "CREDIT215", null, null, null, new ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo(ApplyPromoCodeBannerTypeData.CREDIT, new InsetBannerApiData(InsetBannerTypeApiData.INFO, "This store credit is already linked to your account.", null, new InsetBannerActionApiData("View available credit", null, InsetBannerActionTypeApiData.APPLOCAL, InsetBannerActionPlacementTypeApiData.BOTTOM, null), null, null, 32, null), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, ModalBottomSheetData.PromoCode promoCode) {
            this.d = promoCode;
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
