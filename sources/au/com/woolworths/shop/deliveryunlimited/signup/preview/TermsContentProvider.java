package au.com.woolworths.shop.deliveryunlimited.signup.preview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.TermItemUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeLink;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/preview/TermsContentProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$ViewState;", "TestCase", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TermsContentProvider implements PreviewParameterProvider<PaymentContract.ViewState> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/preview/TermsContentProvider$TestCase;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] e;
        public static final /* synthetic */ EnumEntries f;
        public final PaymentContract.ViewState d;

        static {
            EmptyList emptyList = EmptyList.d;
            TermsBottomSheetData.Terms terms = new TermsBottomSheetData.Terms(new ConfirmSubscriptionTermsUiModel(CollectionsKt.R(new TermItemUiModel("I agree to this payment method being saved and used.", true, emptyList), new TermItemUiModel("I agree to Woolworths Delivery Unlimited Terms & Conditions.", false, CollectionsKt.Q(new DeliveryUnlimitedSubscribeLink("Delivery Unlimited Terms & Conditions", "")))), new ButtonApiData("Confirm", null, null, false, null, null, null, null, null, 502, null)));
            PageResult.Uninitialized uninitialized = PageResult.Uninitialized.f8286a;
            TestCase[] testCaseArr = {new TestCase("TermsContentConfirmDisabled", 0, new PaymentContract.ViewState(uninitialized, null, terms, 381)), new TestCase("TermsContentConfirmEnables", 1, new PaymentContract.ViewState(uninitialized, null, new TermsBottomSheetData.Terms(new ConfirmSubscriptionTermsUiModel(CollectionsKt.R(new TermItemUiModel("I agree to this payment method being saved and used.", true, emptyList), new TermItemUiModel("I agree to Woolworths Delivery Unlimited Terms & Conditions.", true, CollectionsKt.Q(new DeliveryUnlimitedSubscribeLink("Delivery Unlimited Terms & Conditions", "")))), new ButtonApiData("Confirm", null, null, true, null, null, null, null, null, 502, null))), 381))};
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
