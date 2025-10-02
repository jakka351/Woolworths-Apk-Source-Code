package au.com.woolworths.shop.deliveryunlimited.signup.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerError;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodSection;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpFooter;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeTerms;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.model.DeliveryUnlimitedPaymentResponse;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/preview/PaymentProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$ViewState;", "TestCase", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PaymentProvider implements PreviewParameterProvider<PaymentContract.ViewState> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/preview/PaymentProvider$TestCase;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final PaymentContract.ViewState d;

        static {
            ButtonStyleApiData buttonStyleApiData = ButtonStyleApiData.PRIMARY;
            DeliveryUnlimitedSignUpFooter deliveryUnlimitedSignUpFooter = new DeliveryUnlimitedSignUpFooter(new ButtonApiData("Subscribe", null, buttonStyleApiData, true, null, null, null, null, null, 448, null), "By tapping on the button above, you agree to this payment method being saved and used for my subscription payments. You agree to Woolworths Delivery Unlimited Terms & Conditions and Privacy Policy");
            ButtonApiData buttonApiData = new ButtonApiData("Terms Subscribe", null, buttonStyleApiData, true, null, null, null, null, null, 448, null);
            EmptyList emptyList = EmptyList.d;
            TestCase[] testCaseArr = {new TestCase("SuccessPageResultWithCardSelected", 0, new PaymentContract.ViewState(new PageResult.Success(new DeliveryUnlimitedPaymentResponse("Confirm Subscription", "", "", null, deliveryUnlimitedSignUpFooter, new DeliveryUnlimitedSubscribeTerms("Terms", emptyList, buttonApiData, null), new PaymentMethodSection("Saved payment methods", CollectionsKt.R(new PaymentMethodItem.CreditCard.Linked("1234", "Visa ...1234", "Exp: 09/25", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/mastercard.png", true, "Paying", "$100.00", ModuleDescriptor.MODULE_VERSION, "todo"), new PaymentMethodItem.CreditCard.Expired("4321", "Visa ...5678", "Card Expired", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/mastercard.png"), new PaymentMethodItem.CreditCard.Add("Add credit card", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)))), emptyList, null, 256, null)), "1234", null, 505)), new TestCase("SuccessPageResultWithNoCardSelected", 1, new PaymentContract.ViewState(new PageResult.Success(new DeliveryUnlimitedPaymentResponse("Confirm Subscription", "", "", null, new DeliveryUnlimitedSignUpFooter(new ButtonApiData("Subscribe", null, buttonStyleApiData, true, null, null, null, null, null, 448, null), "By tapping on the button above, you agree to this payment method being saved and used for my subscription payments. You agree to Woolworths Delivery Unlimited Terms & Conditions and Privacy Policy"), new DeliveryUnlimitedSubscribeTerms("Terms", emptyList, new ButtonApiData("Terms Subscribe", null, buttonStyleApiData, true, null, null, null, null, null, 448, null), null), new PaymentMethodSection("Saved payment methods", CollectionsKt.Q(new PaymentMethodItem.CreditCard.Add("Add credit card", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)))), emptyList, null, 256, null)), null, null, 505)), new TestCase("ErrorBanner", 2, new PaymentContract.ViewState(new PageResult.Success(new DeliveryUnlimitedPaymentResponse("Confirm Subscription", "", "", null, new DeliveryUnlimitedSignUpFooter(new ButtonApiData("Subscribe", null, buttonStyleApiData, true, null, null, null, null, null, 448, null), "By tapping on the button above, you agree to this payment method being saved and used for my subscription payments. You agree to Woolworths Delivery Unlimited Terms & Conditions and Privacy Policy"), new DeliveryUnlimitedSubscribeTerms("Terms", emptyList, new ButtonApiData("Terms Subscribe", null, buttonStyleApiData, true, null, null, null, null, null, 448, null), null), new PaymentMethodSection("Saved payment methods", CollectionsKt.R(new PaymentMethodItem.CreditCard.Linked("1234", "Visa ...1234", "Exp: 09/25", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/checkout/pay/mastercard.png", true, "Paying", "$100.00", ModuleDescriptor.MODULE_VERSION, "todo"), new PaymentMethodItem.CreditCard.Add("Add credit card", new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null)))), emptyList, null, 256, null)), "1234", null, 249)), new TestCase("NoConnection", 3, new PaymentContract.ViewState(new PageResult.Fail(new NoConnectivityException()), null, null, 509)), new TestCase("ServerError", 4, new PaymentContract.ViewState(new PageResult.Fail(new ServerErrorException(new ServerError(ServerErrorCode.d, null))), null, null, 509))};
            e = testCaseArr;
            f = EnumEntriesKt.a(testCaseArr);
        }

        public TestCase(String str, int i, PaymentContract.ViewState viewState) {
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
