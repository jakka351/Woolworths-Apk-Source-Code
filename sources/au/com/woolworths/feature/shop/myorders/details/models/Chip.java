package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/Chip;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Chip {

    /* renamed from: a, reason: collision with root package name */
    public final String f7746a;
    public final ChipText b;
    public final boolean c;

    public Chip(String str, ChipText chipText, boolean z) {
        this.f7746a = str;
        this.b = chipText;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Chip)) {
            return false;
        }
        Chip chip = (Chip) obj;
        return Intrinsics.c(this.f7746a, chip.f7746a) && Intrinsics.c(this.b, chip.b) && this.c == chip.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f7746a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chip(id=");
        sb.append(this.f7746a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return a.k(")", sb, this.c);
    }
}
