package au.com.woolworths.shop.digipay.creditcard;

import au.com.woolworths.shop.digipay.models.SavedCreditCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract;", "", "Actions", "ViewState", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CreditCardContract {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$Actions;", "", "RemoveSavedCreditCard", "ClearCardCaptureView", "ClearCvvStepUpViewForSelectedCard", "Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$Actions$ClearCardCaptureView;", "Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$Actions$ClearCvvStepUpViewForSelectedCard;", "Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$Actions$RemoveSavedCreditCard;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$Actions$ClearCardCaptureView;", "Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$Actions;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ClearCardCaptureView extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ClearCardCaptureView f10911a = new ClearCardCaptureView();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$Actions$ClearCvvStepUpViewForSelectedCard;", "Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$Actions;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ClearCvvStepUpViewForSelectedCard extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ClearCvvStepUpViewForSelectedCard f10912a = new ClearCvvStepUpViewForSelectedCard();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$Actions$RemoveSavedCreditCard;", "Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$Actions;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RemoveSavedCreditCard extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final SavedCreditCard f10913a;

            public RemoveSavedCreditCard(SavedCreditCard savedCreditCard) {
                Intrinsics.h(savedCreditCard, "savedCreditCard");
                this.f10913a = savedCreditCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoveSavedCreditCard) && Intrinsics.c(this.f10913a, ((RemoveSavedCreditCard) obj).f10913a);
            }

            public final int hashCode() {
                return this.f10913a.hashCode();
            }

            public final String toString() {
                return "RemoveSavedCreditCard(savedCreditCard=" + this.f10913a + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CreditCardContract$ViewState;", "", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final List f10914a;

        public ViewState(List list) {
            this.f10914a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f10914a, ((ViewState) obj).f10914a);
        }

        public final int hashCode() {
            return this.f10914a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.l("ViewState(content=", ")", this.f10914a);
        }
    }
}
