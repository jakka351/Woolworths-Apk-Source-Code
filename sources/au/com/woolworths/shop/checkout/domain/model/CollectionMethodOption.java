package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CollectionMethodOption;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CollectionMethodOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f10594a;
    public final CollectionMethodOptionModeId b;
    public final boolean c;
    public final Integer d;

    public CollectionMethodOption(String str, CollectionMethodOptionModeId collectionMethodOptionModeId, boolean z, Integer num) {
        this.f10594a = str;
        this.b = collectionMethodOptionModeId;
        this.c = z;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionMethodOption)) {
            return false;
        }
        CollectionMethodOption collectionMethodOption = (CollectionMethodOption) obj;
        return Intrinsics.c(this.f10594a, collectionMethodOption.f10594a) && this.b == collectionMethodOption.b && this.c == collectionMethodOption.c && Intrinsics.c(this.d, collectionMethodOption.d);
    }

    public final int hashCode() {
        int iE = b.e((this.b.hashCode() + (this.f10594a.hashCode() * 31)) * 31, 31, this.c);
        Integer num = this.d;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CollectionMethodOption(title=" + this.f10594a + ", modeId=" + this.b + ", isSelected=" + this.c + ", addressId=" + this.d + ")";
    }
}
