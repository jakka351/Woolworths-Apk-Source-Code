package au.com.woolworths.feature.shop.weblink.model;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import com.medallia.digital.mobilesdk.q2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/weblink/model/Cookie;", "Landroid/os/Parcelable;", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Cookie implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Cookie> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;
    public final boolean j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Cookie> {
        @Override // android.os.Parcelable.Creator
        public final Cookie createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new Cookie(string, string2, string3, string4, i, z2, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Cookie[] newArray(int i) {
            return new Cookie[i];
        }
    }

    public /* synthetic */ Cookie() {
        this("new_login_exp", "true", ".woolworths.com.au", q2.c, 3600, false, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return Intrinsics.c(this.d, cookie.d) && Intrinsics.c(this.e, cookie.e) && Intrinsics.c(this.f, cookie.f) && Intrinsics.c(this.g, cookie.g) && this.h == cookie.h && this.i == cookie.i && this.j == cookie.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + b.e(b.a(this.h, b.c(b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbV = a.v("Cookie(name=", this.d, ", value=", this.e, ", domain=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", path=", this.g, ", maxAge=");
        sbV.append(this.h);
        sbV.append(", httpOnly=");
        sbV.append(this.i);
        sbV.append(", secure=");
        return a.k(")", sbV, this.j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeInt(this.h);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.j ? 1 : 0);
    }

    public Cookie(String name, String value, String domain, String path, int i, boolean z, boolean z2) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        Intrinsics.h(domain, "domain");
        Intrinsics.h(path, "path");
        this.d = name;
        this.e = value;
        this.f = domain;
        this.g = path;
        this.h = i;
        this.i = z;
        this.j = z2;
    }
}
