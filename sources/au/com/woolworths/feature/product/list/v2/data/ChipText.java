package au.com.woolworths.feature.product.list.v2.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/data/ChipText;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChipText {

    /* renamed from: a, reason: collision with root package name */
    public final String f5620a;
    public final String b;

    public ChipText(String str, String str2) {
        this.f5620a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipText)) {
            return false;
        }
        ChipText chipText = (ChipText) obj;
        return Intrinsics.c(this.f5620a, chipText.f5620a) && Intrinsics.c(this.b, chipText.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5620a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("ChipText(text=", this.f5620a, ", altText=", this.b, ")");
    }
}
