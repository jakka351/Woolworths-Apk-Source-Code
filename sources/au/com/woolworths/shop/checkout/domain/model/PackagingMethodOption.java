package au.com.woolworths.shop.checkout.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/PackagingMethodOption;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PackagingMethodOption {

    /* renamed from: a, reason: collision with root package name */
    public final int f10624a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public PackagingMethodOption(int i, boolean z, String str, String str2, String str3, String str4) {
        this.f10624a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackagingMethodOption)) {
            return false;
        }
        PackagingMethodOption packagingMethodOption = (PackagingMethodOption) obj;
        return this.f10624a == packagingMethodOption.f10624a && this.b == packagingMethodOption.b && Intrinsics.c(this.c, packagingMethodOption.c) && Intrinsics.c(this.d, packagingMethodOption.d) && Intrinsics.c(this.e, packagingMethodOption.e) && Intrinsics.c(this.f, packagingMethodOption.f);
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.e(Integer.hashCode(this.f10624a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PackagingMethodOption(id=");
        sb.append(this.f10624a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", title=");
        a.B(sb, this.c, ", price=", this.d, ", description=");
        return a.l(sb, this.e, ", imageUrl=", this.f, ")");
    }
}
