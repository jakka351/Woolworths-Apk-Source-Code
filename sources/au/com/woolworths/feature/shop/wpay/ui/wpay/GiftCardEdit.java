package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/GiftCardEdit;", "", "Linked", "Unlinked", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GiftCardEdit {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/GiftCardEdit$Linked;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/GiftCardEdit;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Linked implements GiftCardEdit {

        /* renamed from: a, reason: collision with root package name */
        public final String f8362a;
        public final boolean b;
        public final String c;
        public final boolean d;

        public Linked(String id, String str, boolean z, boolean z2) {
            Intrinsics.h(id, "id");
            this.f8362a = id;
            this.b = z;
            this.c = str;
            this.d = z2;
        }

        public static Linked a(Linked linked, boolean z, String amountRedeemedText, int i) {
            String id = linked.f8362a;
            if ((i & 2) != 0) {
                z = linked.b;
            }
            boolean z2 = (i & 8) != 0 ? linked.d : true;
            linked.getClass();
            Intrinsics.h(id, "id");
            Intrinsics.h(amountRedeemedText, "amountRedeemedText");
            return new Linked(id, amountRedeemedText, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Linked)) {
                return false;
            }
            Linked linked = (Linked) obj;
            return Intrinsics.c(this.f8362a, linked.f8362a) && this.b == linked.b && Intrinsics.c(this.c, linked.c) && this.d == linked.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.e(this.f8362a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return au.com.woolworths.dynamic.page.ui.content.d.r(this.c, ", isUpdated=", ")", androidx.constraintlayout.core.state.a.q("Linked(id=", this.f8362a, ", selected=", ", amountRedeemedText=", this.b), this.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/GiftCardEdit$Unlinked;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/GiftCardEdit;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unlinked implements GiftCardEdit {

        /* renamed from: a, reason: collision with root package name */
        public final String f8363a;
        public final String b;
        public final boolean c;
        public final String d;
        public final boolean e;

        public Unlinked(String str, String str2, String str3, boolean z, boolean z2) {
            this.f8363a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = z2;
        }

        public static Unlinked a(Unlinked unlinked, boolean z, String amountRedeemedText, int i) {
            String str = unlinked.f8363a;
            String str2 = unlinked.b;
            if ((i & 4) != 0) {
                z = unlinked.c;
            }
            boolean z2 = z;
            boolean z3 = (i & 16) != 0 ? unlinked.e : true;
            unlinked.getClass();
            Intrinsics.h(amountRedeemedText, "amountRedeemedText");
            return new Unlinked(str, str2, amountRedeemedText, z2, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unlinked)) {
                return false;
            }
            Unlinked unlinked = (Unlinked) obj;
            return Intrinsics.c(this.f8363a, unlinked.f8363a) && Intrinsics.c(this.b, unlinked.b) && this.c == unlinked.c && Intrinsics.c(this.d, unlinked.d) && this.e == unlinked.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.c(this.f8363a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Unlinked(number=", this.f8363a, ", pin=", this.b, ", selected=");
            au.com.woolworths.android.onesite.a.y(", amountRedeemedText=", this.d, ", isUpdated=", sbV, this.c);
            return YU.a.k(")", sbV, this.e);
        }
    }
}
