package au.com.woolworths.shop.checkout.ui.idverification;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationContract;", "", "Action", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IdVerificationContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationContract$Action;", "", "VerificationSuccess", "VerificationFailed", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationContract$Action$VerificationFailed;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationContract$Action$VerificationSuccess;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationContract$Action$VerificationFailed;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class VerificationFailed implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final IdVerificationCompleteFail f10795a;

            public VerificationFailed(IdVerificationCompleteFail idVerificationCompleteFail) {
                this.f10795a = idVerificationCompleteFail;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VerificationFailed) && Intrinsics.c(this.f10795a, ((VerificationFailed) obj).f10795a);
            }

            public final int hashCode() {
                return this.f10795a.d.hashCode();
            }

            public final String toString() {
                return "VerificationFailed(data=" + this.f10795a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationContract$Action$VerificationSuccess;", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationContract$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class VerificationSuccess implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final IdVerificationCompleteSuccess f10796a;

            public VerificationSuccess(IdVerificationCompleteSuccess idVerificationCompleteSuccess) {
                this.f10796a = idVerificationCompleteSuccess;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VerificationSuccess) && Intrinsics.c(this.f10796a, ((VerificationSuccess) obj).f10796a);
            }

            public final int hashCode() {
                return this.f10796a.d.hashCode();
            }

            public final String toString() {
                return "VerificationSuccess(data=" + this.f10796a + ")";
            }
        }
    }
}
