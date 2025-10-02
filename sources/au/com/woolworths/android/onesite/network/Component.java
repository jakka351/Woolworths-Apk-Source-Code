package au.com.woolworths.android.onesite.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001c\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000b\u0010\u0006\u001a\u00078\u0000¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\u00078\u0000¢\u0006\u0002\b\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/android/onesite/network/Component;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/os/Parcelable;", "", "type", "Lkotlinx/parcelize/RawValue;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Component<T> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Component<?>> CREATOR = new Creator();

    @SerializedName("data")
    private final T data;

    @SerializedName("type")
    @NotNull
    private final String type;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Component<?>> {
        @Override // android.os.Parcelable.Creator
        public final Component<?> createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new Component<>(parcel.readString(), parcel.readValue(Component.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Component<?>[] newArray(int i) {
            return new Component[i];
        }
    }

    public Component(@NotNull String type, T t) {
        Intrinsics.h(type, "type");
        this.type = type;
        this.data = t;
    }

    /* renamed from: a, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    public final Object b() {
        return this.data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Component)) {
            return false;
        }
        Component component = (Component) obj;
        return Intrinsics.c(this.type, component.type) && Intrinsics.c(this.data, component.data);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        T t = this.data;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        return "Component(type=" + this.type + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.type);
        dest.writeValue(this.data);
    }
}
