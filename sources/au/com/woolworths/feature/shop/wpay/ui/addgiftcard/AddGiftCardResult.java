package au.com.woolworths.feature.shop.wpay.ui.addgiftcard;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardResult;", "", "UnlinkedCard", "LinkedCard", "None", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardResult$LinkedCard;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardResult$None;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardResult$UnlinkedCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AddGiftCardResult {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardResult$LinkedCard;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardResult;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkedCard extends AddGiftCardResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f8341a;

        public LinkedCard(String id) {
            Intrinsics.h(id, "id");
            this.f8341a = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkedCard) && Intrinsics.c(this.f8341a, ((LinkedCard) obj).f8341a);
        }

        public final int hashCode() {
            return this.f8341a.hashCode();
        }

        public final String toString() {
            return YU.a.h("LinkedCard(id=", this.f8341a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardResult$None;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardResult;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class None extends AddGiftCardResult {

        /* renamed from: a, reason: collision with root package name */
        public static final None f8342a = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return -410894619;
        }

        public final String toString() {
            return "None";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardResult$UnlinkedCard;", "Lau/com/woolworths/feature/shop/wpay/ui/addgiftcard/AddGiftCardResult;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnlinkedCard extends AddGiftCardResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f8343a;
        public final String b;

        public UnlinkedCard(String str, String str2) {
            this.f8343a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnlinkedCard)) {
                return false;
            }
            UnlinkedCard unlinkedCard = (UnlinkedCard) obj;
            return Intrinsics.c(this.f8343a, unlinkedCard.f8343a) && Intrinsics.c(this.b, unlinkedCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8343a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("UnlinkedCard(cardNumber=", this.f8343a, ", pin=", this.b, ")");
        }
    }
}
