package au.com.woolworths.feature.product.list.legacy.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/ChipText;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChipText {

    /* renamed from: a, reason: collision with root package name */
    public final String f5353a;
    public final String b;

    public ChipText(String text, String altText) {
        Intrinsics.h(text, "text");
        Intrinsics.h(altText, "altText");
        this.f5353a = text;
        this.b = altText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipText)) {
            return false;
        }
        ChipText chipText = (ChipText) obj;
        return Intrinsics.c(this.f5353a, chipText.f5353a) && Intrinsics.c(this.b, chipText.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5353a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("ChipText(text=", this.f5353a, ", altText=", this.b, ")");
    }
}
