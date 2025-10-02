package au.com.woolworths.base.shopapp.modules.button;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/button/Analytics;", "Landroid/os/Parcelable;", "", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Analytics implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Analytics> CREATOR = new Creator();

    @SerializedName("analytics")
    @Nullable
    private final String label;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Analytics> {
        @Override // android.os.Parcelable.Creator
        public final Analytics createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new Analytics(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Analytics[] newArray(int i) {
            return new Analytics[i];
        }
    }

    public Analytics() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Analytics) && Intrinsics.c(this.label, ((Analytics) obj).label);
    }

    public final int hashCode() {
        String str = this.label;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.h("Analytics(label=", this.label, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.label);
    }

    public Analytics(@Nullable String str) {
        this.label = str;
    }

    public /* synthetic */ Analytics(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
