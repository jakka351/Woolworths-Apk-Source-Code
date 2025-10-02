package au.com.woolworths.shop.graphql.type;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/UpdateListInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateListInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11994a;
    public final String b;
    public final String c;
    public final double d;
    public final Optional e;

    public UpdateListInput(double d, String str, String title, String str2) {
        Intrinsics.h(title, "title");
        this.f11994a = str;
        this.b = title;
        this.c = str2;
        this.d = d;
        this.e = Optional.Absent.f13523a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateListInput)) {
            return false;
        }
        UpdateListInput updateListInput = (UpdateListInput) obj;
        return Intrinsics.c(this.f11994a, updateListInput.f11994a) && Intrinsics.c(this.b, updateListInput.b) && Intrinsics.c(this.c, updateListInput.c) && Double.compare(this.d, updateListInput.d) == 0 && Intrinsics.c(this.e, updateListInput.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a.a(this.d, b.c(b.c(this.f11994a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("UpdateListInput(id=", this.f11994a, ", title=", this.b, ", color=");
        sbV.append(this.c);
        sbV.append(", timestamp=");
        sbV.append(this.d);
        sbV.append(", isWatching=");
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }
}
