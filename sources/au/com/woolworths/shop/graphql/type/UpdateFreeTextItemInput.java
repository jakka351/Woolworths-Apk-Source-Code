package au.com.woolworths.shop.graphql.type;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/UpdateFreeTextItemInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateFreeTextItemInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11993a;
    public final String b;
    public final boolean c;
    public final double d;

    public UpdateFreeTextItemInput(String str, String text, boolean z, double d) {
        Intrinsics.h(text, "text");
        this.f11993a = str;
        this.b = text;
        this.c = z;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateFreeTextItemInput)) {
            return false;
        }
        UpdateFreeTextItemInput updateFreeTextItemInput = (UpdateFreeTextItemInput) obj;
        return Intrinsics.c(this.f11993a, updateFreeTextItemInput.f11993a) && Intrinsics.c(this.b, updateFreeTextItemInput.b) && this.c == updateFreeTextItemInput.c && Double.compare(this.d, updateFreeTextItemInput.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + b.e(b.c(this.f11993a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbV = a.v("UpdateFreeTextItemInput(id=", this.f11993a, ", text=", this.b, ", checked=");
        sbV.append(this.c);
        sbV.append(", timestamp=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
