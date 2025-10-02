package au.com.woolworths.feature.shop.modeselector.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeButton;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeButton {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingModeButtonType f7530a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public ShoppingModeButton(ShoppingModeButtonType id, boolean z, String title, boolean z2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        this.f7530a = id;
        this.b = z;
        this.c = title;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeButton)) {
            return false;
        }
        ShoppingModeButton shoppingModeButton = (ShoppingModeButton) obj;
        return this.f7530a == shoppingModeButton.f7530a && this.b == shoppingModeButton.b && Intrinsics.c(this.c, shoppingModeButton.c) && this.d == shoppingModeButton.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + b.c(b.e(this.f7530a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShoppingModeButton(id=");
        sb.append(this.f7530a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", title=");
        return d.r(this.c, ", isEnabled=", ")", sb, this.d);
    }
}
