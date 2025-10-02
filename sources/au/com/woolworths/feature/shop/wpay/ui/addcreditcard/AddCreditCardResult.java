package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardResult;", "", "None", "UnlinkedCard", "LinkedCard", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardResult$LinkedCard;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardResult$None;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardResult$UnlinkedCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AddCreditCardResult {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardResult$LinkedCard;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardResult;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkedCard extends AddCreditCardResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f8330a;

        public LinkedCard(String str) {
            this.f8330a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkedCard) && Intrinsics.c(this.f8330a, ((LinkedCard) obj).f8330a);
        }

        public final int hashCode() {
            String str = this.f8330a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return YU.a.h("LinkedCard(creditCardId=", this.f8330a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardResult$None;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardResult;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class None extends AddCreditCardResult {

        /* renamed from: a, reason: collision with root package name */
        public static final None f8331a = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 1832430099;
        }

        public final String toString() {
            return "None";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardResult$UnlinkedCard;", "Lau/com/woolworths/feature/shop/wpay/ui/addcreditcard/AddCreditCardResult;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnlinkedCard extends AddCreditCardResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f8332a;

        public UnlinkedCard(String checkoutSessionId) {
            Intrinsics.h(checkoutSessionId, "checkoutSessionId");
            this.f8332a = checkoutSessionId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnlinkedCard) && Intrinsics.c(this.f8332a, ((UnlinkedCard) obj).f8332a);
        }

        public final int hashCode() {
            return this.f8332a.hashCode();
        }

        public final String toString() {
            return YU.a.h("UnlinkedCard(checkoutSessionId=", this.f8332a, ")");
        }
    }
}
