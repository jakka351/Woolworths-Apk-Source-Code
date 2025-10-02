package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.sdui.common.IconAsset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentSlotSelectionOption;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentSlotSelectionOption {

    /* renamed from: a, reason: collision with root package name */
    public final FulfilmentSlotSelectionOptionId f10605a;
    public final String b;
    public final IconAsset.CoreIcon c;
    public final String d;
    public final List e;
    public final BadgeApiData f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final String l;
    public final boolean m;
    public final boolean n;

    public FulfilmentSlotSelectionOption(FulfilmentSlotSelectionOptionId fulfilmentSlotSelectionOptionId, String str, IconAsset.CoreIcon coreIcon, String str2, List list, BadgeApiData badgeApiData, String str3, String str4, boolean z, boolean z2) {
        this.f10605a = fulfilmentSlotSelectionOptionId;
        this.b = str;
        this.c = coreIcon;
        this.d = str2;
        this.e = list;
        this.f = badgeApiData;
        this.g = str3;
        this.h = str4;
        this.i = z;
        this.j = z2;
        this.k = z ? str2 : str3;
        str = z2 ? str : z ? "" : str4;
        this.l = str;
        this.m = z && !list.isEmpty();
        this.n = str.length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentSlotSelectionOption)) {
            return false;
        }
        FulfilmentSlotSelectionOption fulfilmentSlotSelectionOption = (FulfilmentSlotSelectionOption) obj;
        return this.f10605a == fulfilmentSlotSelectionOption.f10605a && Intrinsics.c(this.b, fulfilmentSlotSelectionOption.b) && Intrinsics.c(this.c, fulfilmentSlotSelectionOption.c) && Intrinsics.c(this.d, fulfilmentSlotSelectionOption.d) && Intrinsics.c(this.e, fulfilmentSlotSelectionOption.e) && Intrinsics.c(this.f, fulfilmentSlotSelectionOption.f) && Intrinsics.c(this.g, fulfilmentSlotSelectionOption.g) && Intrinsics.c(this.h, fulfilmentSlotSelectionOption.h) && this.i == fulfilmentSlotSelectionOption.i && this.j == fulfilmentSlotSelectionOption.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + b.e(b.c(b.c((this.f.hashCode() + b.d(b.c(b.c(b.c(this.f10605a.hashCode() * 31, 31, this.b), 31, this.c.d), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FulfilmentSlotSelectionOption(selectionOptionId=");
        sb.append(this.f10605a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", tags=");
        sb.append(this.e);
        sb.append(", disabledBadge=");
        sb.append(this.f);
        sb.append(", disabledTitle=");
        a.B(sb, this.g, ", disabledDescription=", this.h, ", isEnabled=");
        return au.com.woolworths.android.onesite.a.q(sb, this.i, ", isSelected=", this.j, ")");
    }
}
