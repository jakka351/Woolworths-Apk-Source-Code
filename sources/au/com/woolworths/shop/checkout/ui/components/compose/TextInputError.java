package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/compose/TextInputError;", "", "CharsRemaining", "Default", "Lau/com/woolworths/shop/checkout/ui/components/compose/TextInputError$CharsRemaining;", "Lau/com/woolworths/shop/checkout/ui/components/compose/TextInputError$Default;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TextInputError {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/compose/TextInputError$CharsRemaining;", "Lau/com/woolworths/shop/checkout/ui/components/compose/TextInputError;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CharsRemaining extends TextInputError {

        /* renamed from: a, reason: collision with root package name */
        public final int f10707a;

        public CharsRemaining(int i) {
            this.f10707a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CharsRemaining) && this.f10707a == ((CharsRemaining) obj).f10707a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f10707a);
        }

        public final String toString() {
            return YU.a.e(this.f10707a, "CharsRemaining(chars=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/compose/TextInputError$Default;", "Lau/com/woolworths/shop/checkout/ui/components/compose/TextInputError;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Default extends TextInputError {

        /* renamed from: a, reason: collision with root package name */
        public final String f10708a;

        public Default(String label) {
            Intrinsics.h(label, "label");
            this.f10708a = label;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Default) && Intrinsics.c(this.f10708a, ((Default) obj).f10708a);
        }

        public final int hashCode() {
            return this.f10708a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Default(label=", this.f10708a, ")");
        }
    }
}
