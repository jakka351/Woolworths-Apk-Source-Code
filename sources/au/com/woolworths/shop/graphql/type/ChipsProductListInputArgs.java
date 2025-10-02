package au.com.woolworths.shop.graphql.type;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ChipsProductListInputArgs;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChipsProductListInputArgs {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f11272a;
    public final java.util.List b;
    public final java.util.List c;

    public ChipsProductListInputArgs(java.util.List selected, java.util.List list, java.util.List list2) {
        Intrinsics.h(selected, "selected");
        this.f11272a = selected;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipsProductListInputArgs)) {
            return false;
        }
        ChipsProductListInputArgs chipsProductListInputArgs = (ChipsProductListInputArgs) obj;
        return Intrinsics.c(this.f11272a, chipsProductListInputArgs.f11272a) && Intrinsics.c(this.b, chipsProductListInputArgs.b) && Intrinsics.c(this.c, chipsProductListInputArgs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.d(this.f11272a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChipsProductListInputArgs(selected=");
        sb.append(this.f11272a);
        sb.append(", toggleOn=");
        sb.append(this.b);
        sb.append(", toggleOff=");
        return a.t(sb, this.c, ")");
    }
}
