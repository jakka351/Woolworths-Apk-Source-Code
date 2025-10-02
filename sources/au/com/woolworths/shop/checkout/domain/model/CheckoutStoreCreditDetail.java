package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditDetail;", "", "Empty", "Items", "Unavailable", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditDetail$Empty;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditDetail$Items;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditDetail$Unavailable;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CheckoutStoreCreditDetail {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditDetail$Empty;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditDetail;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Empty extends CheckoutStoreCreditDetail {

        /* renamed from: a, reason: collision with root package name */
        public final String f10584a;
        public final String b;

        public Empty(String str, String str2) {
            this.f10584a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) obj;
            return Intrinsics.c(this.f10584a, empty.f10584a) && Intrinsics.c(this.b, empty.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10584a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Empty(title=", this.f10584a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditDetail$Items;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditDetail;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Items extends CheckoutStoreCreditDetail {

        /* renamed from: a, reason: collision with root package name */
        public final String f10585a;
        public final String b;
        public final List c;

        public Items(String str, String str2, List list) {
            this.f10585a = str;
            this.b = str2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Items)) {
                return false;
            }
            Items items = (Items) obj;
            return Intrinsics.c(this.f10585a, items.f10585a) && Intrinsics.c(this.b, items.b) && Intrinsics.c(this.c, items.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f10585a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.t(a.v("Items(title=", this.f10585a, ", subtitle=", this.b, ", items="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditDetail$Unavailable;", "Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditDetail;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unavailable extends CheckoutStoreCreditDetail {

        /* renamed from: a, reason: collision with root package name */
        public final String f10586a;
        public final String b;
        public final String c;

        public Unavailable(String str, String str2, String str3) {
            this.f10586a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unavailable)) {
                return false;
            }
            Unavailable unavailable = (Unavailable) obj;
            return Intrinsics.c(this.f10586a, unavailable.f10586a) && Intrinsics.c(this.b, unavailable.b) && Intrinsics.c(this.c, unavailable.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f10586a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("Unavailable(title=", this.f10586a, ", message=", this.b, ", retryButtonTitle="), this.c, ")");
        }
    }
}
