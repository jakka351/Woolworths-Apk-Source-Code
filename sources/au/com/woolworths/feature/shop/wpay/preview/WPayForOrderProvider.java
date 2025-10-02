package au.com.woolworths.feature.shop.wpay.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerError;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.AddPayPalAlert;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardSection;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentTotalDetails;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodSection;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PlaceOrderButton;
import au.com.woolworths.feature.shop.wpay.ui.wpay.GiftCardEdit;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/preview/WPayForOrderProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderContract$ViewState;", "TestCase", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WPayForOrderProvider implements PreviewParameterProvider<WPayForOrderContract.ViewState> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/preview/WPayForOrderProvider$TestCase;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final WPayForOrderContract.ViewState d;

        static {
            GiftCardSection giftCardSection = new GiftCardSection("Saved gift cards", CollectionsKt.Q(new GiftCardItem.AddGiftCard("Add gift card", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))));
            PaymentMethodSection paymentMethodSection = new PaymentMethodSection("Select payment methods", CollectionsKt.R(new PaymentMethodItem.CreditCard.Add("Add credit card", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), new PaymentMethodItem.PayPal.Add("iconUrl", "Add paypal", new AddPayPalAlert("“Woolworths” Wants to Use “paypal.com” to Sign In", "This allows the app and website to share information about you.", "Continue", "Cancel", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)))));
            PaymentInstrumentTotalDetails paymentInstrumentTotalDetails = new PaymentInstrumentTotalDetails("$100.00", new PlaceOrderButton.Default(true, "Place order", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)));
            Map map = EmptyMap.d;
            EmptyList emptyList = EmptyList.d;
            TestCase testCase = new TestCase("Empty", 0, new WPayForOrderContract.ViewState(new PageResult.Success(new PaymentInstrumentsResponse.Success(giftCardSection, paymentMethodSection, paymentInstrumentTotalDetails, emptyList, "There is currently a value of **$100.00** outstanding", null, map)), null, null, null, "1234", 4091));
            TestCase testCase2 = new TestCase("GiftCard", 1, new WPayForOrderContract.ViewState(new PageResult.Success(new PaymentInstrumentsResponse.Success(new GiftCardSection("Saved gift cards", CollectionsKt.R(new GiftCardItem.AddGiftCard("Add gift card", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), new GiftCardItem.LinkedGiftCard("123", "Gift card ...1234", true, "Available", "$40.00", 1000, null, null), new GiftCardItem.LinkedGiftCard("456", "Gift card ...456", false, "Available", "$40.00", 1000, null, null), new GiftCardItem.UnlinkedGiftCard("789", "789", "Gift card ...789", true, "Available", "$23.21", 2321, null, null), new GiftCardItem.UnlinkedGiftCard("987", "987", "Gift card ...987", false, "Available", "$23.21", 2321, null, null))), new PaymentMethodSection("Select payment method", emptyList), new PaymentInstrumentTotalDetails("$36.79", new PlaceOrderButton.Default(true, "Place order", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), emptyList, "There is currently a value of **$100.00** outstanding", null, EmptyMap.d)), MapsKt.i(new Pair("123", new GiftCardEdit.Linked("123", "40.00", true, false))), MapsKt.i(new Pair("789", new GiftCardEdit.Unlinked("789", "789", "23.21", true, false))), null, "1234", 3995));
            InsetBannerTypeApiData insetBannerTypeApiData = InsetBannerTypeApiData.ERROR;
            TestCase[] testCaseArr = {testCase, testCase2, new TestCase("GiftCardError", 2, new WPayForOrderContract.ViewState(new PageResult.Success(new PaymentInstrumentsResponse.Success(new GiftCardSection("Saved gift cards", CollectionsKt.R(new GiftCardItem.AddGiftCard("Add gift card", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), new GiftCardItem.LinkedGiftCard("123", "Gift card ...1234", true, "Available", "$40.00", 5000, null, null), new GiftCardItem.LinkedGiftCard("456", "Gift card ...456", false, "Available", "$40.00", 1000, null, null), new GiftCardItem.UnlinkedGiftCard("789", "789", "Gift card ...789", true, "Available", "$23.21", 2322, null, null), new GiftCardItem.UnlinkedGiftCard("987", "987", "Gift card ...987", false, "Available", "$23.21", 2321, null, null))), new PaymentMethodSection("Select payment method", emptyList), new PaymentInstrumentTotalDetails("$100.00", new PlaceOrderButton.Default(true, "Place order", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), emptyList, "There is currently a value of **$100.00** outstanding", null, EmptyMap.d)), MapsKt.i(new Pair("123", new GiftCardEdit.Linked("123", "50.00", true, false))), MapsKt.i(new Pair("789", new GiftCardEdit.Unlinked("789", "789", "23.22", true, false))), MapsKt.j(new Pair("123", new InsetBannerApiData(insetBannerTypeApiData, "The amount value can not exceed $40.00", null, null, null, null)), new Pair("789", new InsetBannerApiData(insetBannerTypeApiData, "The amount value can not exceed $23.21", null, null, null, null))), "1234", 3867)), new TestCase("CreditCard", 3, new WPayForOrderContract.ViewState(new PageResult.Success(new PaymentInstrumentsResponse.Success(new GiftCardSection("Saved gift cards", emptyList), new PaymentMethodSection("Select payment method", CollectionsKt.R(new PaymentMethodItem.CreditCard.Unlinked(8000, "5678", "Visa ...5678", "Exp: 09/27", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/visa.png", "Paying", "$80.00", true), new PaymentMethodItem.CreditCard.Unlinked(8000, "9120", "Visa ...9120", null, "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/visa.png", "Paying", "$80.00", false), new PaymentMethodItem.CreditCard.Linked("8721", "Visa ...2133", "Exp: 09/28", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/visa.png", true, "Paying", "$100.00", ModuleDescriptor.MODULE_VERSION, "CVV Url"), new PaymentMethodItem.CreditCard.Linked("8912", "Visa ...8912", null, "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/visa.png", false, "Paying", "$120.00", 12000, "CVV Url"), new PaymentMethodItem.CreditCard.Expired("4321", "Visa ...5678", "Card Expired", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/mastercard.png"), new PaymentMethodItem.CreditCard.Add("Add credit card", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), new PaymentMethodItem.PayPal.Add("iconUrl", "Add paypal", new AddPayPalAlert("“Woolworths” Wants to Use “paypal.com” to Sign In", "This allows the app and website to share information about you.", "Continue", "Cancel", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))))), new PaymentInstrumentTotalDetails("$120.00", new PlaceOrderButton.Default(true, "Place order", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), emptyList, null, null, EmptyMap.d)), null, null, null, "5678", 4091)), new TestCase("CreditCardLoadingError", 4, new WPayForOrderContract.ViewState(new PageResult.Success(new PaymentInstrumentsResponse.Success(new GiftCardSection("Saved gift cards", emptyList), new PaymentMethodSection("Select payment method", CollectionsKt.R(new PaymentMethodItem.CreditCard.Linked("1234", "Visa ...1234", "Exp: 09/25", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/mastercard.png", true, "Paying", "$100.00", ModuleDescriptor.MODULE_VERSION, "CVV url"), new PaymentMethodItem.CreditCard.Add("Add credit card", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), new PaymentMethodItem.PayPal.Add("iconUrl", "Add paypal", new AddPayPalAlert("“Woolworths” Wants to Use “paypal.com” to Sign In", "This allows the app and website to share information about you.", "Continue", "Cancel", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))))), new PaymentInstrumentTotalDetails("$100.00", new PlaceOrderButton.Default(true, "Place order", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), emptyList, null, null, EmptyMap.d)), null, null, null, "1234", 3835)), new TestCase("CreditCardValidationError", 5, new WPayForOrderContract.ViewState(new PageResult.Success(new PaymentInstrumentsResponse.Success(new GiftCardSection("Saved gift cards", emptyList), new PaymentMethodSection("Select payment method", CollectionsKt.R(new PaymentMethodItem.CreditCard.Linked("1234", "Visa ...1234", "Exp: 09/25", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/mastercard.png", true, "Paying", "$100.00", ModuleDescriptor.MODULE_VERSION, "todo"), new PaymentMethodItem.CreditCard.Add("Add credit card", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), new PaymentMethodItem.PayPal.Add("iconUrl", "Add paypal", new AddPayPalAlert("“Woolworths” Wants to Use “paypal.com” to Sign In", "This allows the app and website to share information about you.", "Continue", "Cancel", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))))), new PaymentInstrumentTotalDetails("$100.00", new PlaceOrderButton.Default(true, "Place order", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), emptyList, null, null, EmptyMap.d)), null, null, null, "1234", 3579)), new TestCase("GooglePay", 6, new WPayForOrderContract.ViewState(new PageResult.Success(new PaymentInstrumentsResponse.Success(new GiftCardSection("Saved gift cards", emptyList), new PaymentMethodSection("Select payment method", CollectionsKt.R(new PaymentMethodItem.GooglePay("Google Pay", "Paying", "$100.00", "GooglePay", true, ModuleDescriptor.MODULE_VERSION, emptyList), new PaymentMethodItem.GooglePay("Google Pay", "Paying", "$100.00", "GooglePayInactive", false, ModuleDescriptor.MODULE_VERSION, emptyList), new PaymentMethodItem.CreditCard.Add("Add credit card", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)), new PaymentMethodItem.PayPal.Add("iconUrl", "Add paypal", new AddPayPalAlert("“Woolworths” Wants to Use “paypal.com” to Sign In", "This allows the app and website to share information about you.", "Continue", "Cancel", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))))), new PaymentInstrumentTotalDetails("$100.00", new PlaceOrderButton.GooglePay(new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null))), emptyList, null, null, EmptyMap.d)), null, null, null, "GooglePay", 3579)), new TestCase("NoConnection", 7, new WPayForOrderContract.ViewState(new PageResult.Fail(new NoConnectivityException()), null, null, null, null, 4091)), new TestCase("ServerError", 8, new WPayForOrderContract.ViewState(new PageResult.Fail(new ServerErrorException(new ServerError(ServerErrorCode.d, null))), null, null, null, null, 4091))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, WPayForOrderContract.ViewState viewState) {
            this.d = viewState;
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
