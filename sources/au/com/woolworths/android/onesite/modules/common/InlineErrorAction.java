package au.com.woolworths.android.onesite.modules.common;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction;", "Landroid/os/Parcelable;", "AppLocal", "Link", "None", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction$AppLocal;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction$Link;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction$None;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InlineErrorAction implements Parcelable {

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction$AppLocal;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AppLocal extends InlineErrorAction {

        @NotNull
        public static final Parcelable.Creator<AppLocal> CREATOR = new Creator();
        public final Text d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AppLocal> {
            @Override // android.os.Parcelable.Creator
            public final AppLocal createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new AppLocal((Text) parcel.readParcelable(AppLocal.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AppLocal[] newArray(int i) {
                return new AppLocal[i];
            }
        }

        public AppLocal(Text label) {
            Intrinsics.h(label, "label");
            this.d = label;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppLocal) && Intrinsics.c(this.d, ((AppLocal) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("AppLocal(label=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeParcelable(this.d, i);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction$Link;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link extends InlineErrorAction {

        @NotNull
        public static final Parcelable.Creator<Link> CREATOR = new Creator();
        public final Text d;
        public final String e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Link> {
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Link((Text) parcel.readParcelable(Link.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i) {
                return new Link[i];
            }
        }

        public Link(Text label, String uri) {
            Intrinsics.h(label, "label");
            Intrinsics.h(uri, "uri");
            this.d = label;
            this.e = uri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return Intrinsics.c(this.d, link.d) && Intrinsics.c(this.e, link.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "Link(label=" + this.d + ", uri=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction$None;", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorAction;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class None extends InlineErrorAction {
        public static final None d = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<None> {
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                parcel.readInt();
                return None.d;
            }

            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i) {
                return new None[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeInt(1);
        }
    }

    public final Text a() {
        if (this instanceof AppLocal) {
            return ((AppLocal) this).d;
        }
        if (this instanceof Link) {
            return ((Link) this).d;
        }
        if (this instanceof None) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
