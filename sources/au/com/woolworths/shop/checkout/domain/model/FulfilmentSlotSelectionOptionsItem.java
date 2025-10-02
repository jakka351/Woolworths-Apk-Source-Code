package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentSlotSelectionOptionsItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentSlotSelectionOptionsItem {

    /* renamed from: a, reason: collision with root package name */
    public final FulfilmentSlotSelectionOptionId f10607a;
    public final boolean b;
    public final boolean c;

    public FulfilmentSlotSelectionOptionsItem(FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId, boolean z, boolean z2) {
        this.f10607a = fulfilmentSlotSelectionOptionId;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentSlotSelectionOptionsItem)) {
            return false;
        }
        FulfilmentSlotSelectionOptionsItem fulfilmentSlotSelectionOptionsItem = (FulfilmentSlotSelectionOptionsItem) obj;
        return this.f10607a == fulfilmentSlotSelectionOptionsItem.f10607a && this.b == fulfilmentSlotSelectionOptionsItem.b && this.c == fulfilmentSlotSelectionOptionsItem.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + b.e(this.f10607a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FulfilmentSlotSelectionOptionsItem(id=");
        sb.append(this.f10607a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return a.k(")", sb, this.c);
    }
}
