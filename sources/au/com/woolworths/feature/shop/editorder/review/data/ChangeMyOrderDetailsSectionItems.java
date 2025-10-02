package au.com.woolworths.feature.shop.editorder.review.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems;", "", "FulfilmentMethod", "DeliveryInstructions", "FulfilmentTimeSlot", "Cart", "Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems$Cart;", "Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems$DeliveryInstructions;", "Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems$FulfilmentMethod;", "Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems$FulfilmentTimeSlot;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ChangeMyOrderDetailsSectionItems {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems$Cart;", "Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems;", "ActionTile", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cart implements ChangeMyOrderDetailsSectionItems {

        /* renamed from: a, reason: collision with root package name */
        public final String f7121a;
        public final String b;
        public final int c;
        public final List d;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems$Cart$ActionTile;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ActionTile {

            /* renamed from: a, reason: collision with root package name */
            public final String f7122a;
            public final String b;
            public final String c;

            public ActionTile(String str, String str2, String str3) {
                this.f7122a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionTile)) {
                    return false;
                }
                ActionTile actionTile = (ActionTile) obj;
                return Intrinsics.c(this.f7122a, actionTile.f7122a) && Intrinsics.c(this.b, actionTile.b) && Intrinsics.c(this.c, actionTile.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + b.c(this.f7122a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return a.o(a.v("ActionTile(id=", this.f7122a, ", title=", this.b, ", iconUrl="), this.c, ")");
            }
        }

        public Cart(String str, String str2, int i, List list) {
            this.f7121a = str;
            this.b = str2;
            this.c = i;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cart)) {
                return false;
            }
            Cart cart = (Cart) obj;
            return Intrinsics.c(this.f7121a, cart.f7121a) && Intrinsics.c(this.b, cart.b) && this.c == cart.c && Intrinsics.c(this.d, cart.d);
        }

        public final int hashCode() {
            int iHashCode = this.f7121a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + b.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Cart(title=", this.f7121a, ", subtitle=", this.b, ", numberOfItems=");
            sbV.append(this.c);
            sbV.append(", actionTiles=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems$DeliveryInstructions;", "Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryInstructions implements ChangeMyOrderDetailsSectionItems {

        /* renamed from: a, reason: collision with root package name */
        public final String f7123a;
        public final String b;
        public final String c;

        public DeliveryInstructions(String str, String str2, String str3) {
            this.f7123a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryInstructions)) {
                return false;
            }
            DeliveryInstructions deliveryInstructions = (DeliveryInstructions) obj;
            return Intrinsics.c(this.f7123a, deliveryInstructions.f7123a) && Intrinsics.c(this.b, deliveryInstructions.b) && Intrinsics.c(this.c, deliveryInstructions.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7123a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return a.o(a.v("DeliveryInstructions(title=", this.f7123a, ", subtitle=", this.b, ", iconUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems$FulfilmentMethod;", "Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentMethod implements ChangeMyOrderDetailsSectionItems {

        /* renamed from: a, reason: collision with root package name */
        public final String f7124a;
        public final String b;
        public final String c;

        public FulfilmentMethod(String str, String str2, String str3) {
            this.f7124a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentMethod)) {
                return false;
            }
            FulfilmentMethod fulfilmentMethod = (FulfilmentMethod) obj;
            return Intrinsics.c(this.f7124a, fulfilmentMethod.f7124a) && Intrinsics.c(this.b, fulfilmentMethod.b) && Intrinsics.c(this.c, fulfilmentMethod.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7124a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return a.o(a.v("FulfilmentMethod(title=", this.f7124a, ", subtitle=", this.b, ", iconUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems$FulfilmentTimeSlot;", "Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderDetailsSectionItems;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentTimeSlot implements ChangeMyOrderDetailsSectionItems {

        /* renamed from: a, reason: collision with root package name */
        public final TextWithAltApiData f7125a;
        public final String b;
        public final String c;

        public FulfilmentTimeSlot(TextWithAltApiData textWithAltApiData, String str, String str2) {
            this.f7125a = textWithAltApiData;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentTimeSlot)) {
                return false;
            }
            FulfilmentTimeSlot fulfilmentTimeSlot = (FulfilmentTimeSlot) obj;
            return Intrinsics.c(this.f7125a, fulfilmentTimeSlot.f7125a) && Intrinsics.c(this.b, fulfilmentTimeSlot.b) && Intrinsics.c(this.c, fulfilmentTimeSlot.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7125a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FulfilmentTimeSlot(fulfilmentTimeSlotTitle=");
            sb.append(this.f7125a);
            sb.append(", subtitle=");
            sb.append(this.b);
            sb.append(", iconUrl=");
            return a.o(sb, this.c, ")");
        }
    }
}
