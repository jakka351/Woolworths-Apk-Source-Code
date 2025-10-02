package au.com.woolworths.product.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/product/models/InfoSheet;", "Landroid/os/Parcelable;", "title", "", "message", "button", "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getButton", "()Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoSheet implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<InfoSheet> CREATOR = new Creator();

    @SerializedName("button")
    @NotNull
    private final ButtonApiData button;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InfoSheet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoSheet createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new InfoSheet(parcel.readString(), parcel.readString(), (ButtonApiData) parcel.readParcelable(InfoSheet.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoSheet[] newArray(int i) {
            return new InfoSheet[i];
        }
    }

    public InfoSheet(@NotNull String title, @NotNull String message, @NotNull ButtonApiData button) {
        Intrinsics.h(title, "title");
        Intrinsics.h(message, "message");
        Intrinsics.h(button, "button");
        this.title = title;
        this.message = message;
        this.button = button;
    }

    public static /* synthetic */ InfoSheet copy$default(InfoSheet infoSheet, String str, String str2, ButtonApiData buttonApiData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoSheet.title;
        }
        if ((i & 2) != 0) {
            str2 = infoSheet.message;
        }
        if ((i & 4) != 0) {
            buttonApiData = infoSheet.button;
        }
        return infoSheet.copy(str, str2, buttonApiData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonApiData getButton() {
        return this.button;
    }

    @NotNull
    public final InfoSheet copy(@NotNull String title, @NotNull String message, @NotNull ButtonApiData button) {
        Intrinsics.h(title, "title");
        Intrinsics.h(message, "message");
        Intrinsics.h(button, "button");
        return new InfoSheet(title, message, button);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoSheet)) {
            return false;
        }
        InfoSheet infoSheet = (InfoSheet) other;
        return Intrinsics.c(this.title, infoSheet.title) && Intrinsics.c(this.message, infoSheet.message) && Intrinsics.c(this.button, infoSheet.button);
    }

    @NotNull
    public final ButtonApiData getButton() {
        return this.button;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.button.hashCode() + b.c(this.title.hashCode() * 31, 31, this.message);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.message;
        ButtonApiData buttonApiData = this.button;
        StringBuilder sbV = a.v("InfoSheet(title=", str, ", message=", str2, ", button=");
        sbV.append(buttonApiData);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.message);
        dest.writeParcelable(this.button, flags);
    }
}
