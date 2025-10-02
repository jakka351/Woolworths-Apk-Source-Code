package au.com.woolworths.product.details.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/product/details/models/HealthierLink;", "Landroid/os/Parcelable;", "url", "", TextBundle.TEXT_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "getText", "setText", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HealthierLink implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<HealthierLink> CREATOR = new Creator();

    @NotNull
    private String text;

    @NotNull
    private String url;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HealthierLink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthierLink createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new HealthierLink(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthierLink[] newArray(int i) {
            return new HealthierLink[i];
        }
    }

    public HealthierLink(@NotNull String url, @NotNull String text) {
        Intrinsics.h(url, "url");
        Intrinsics.h(text, "text");
        this.url = url;
        this.text = text;
    }

    public static /* synthetic */ HealthierLink copy$default(HealthierLink healthierLink, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthierLink.url;
        }
        if ((i & 2) != 0) {
            str2 = healthierLink.text;
        }
        return healthierLink.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final HealthierLink copy(@NotNull String url, @NotNull String text) {
        Intrinsics.h(url, "url");
        Intrinsics.h(text, "text");
        return new HealthierLink(url, text);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthierLink)) {
            return false;
        }
        HealthierLink healthierLink = (HealthierLink) other;
        return Intrinsics.c(this.url, healthierLink.url) && Intrinsics.c(this.text, healthierLink.text);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.url.hashCode() * 31);
    }

    public final void setText(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.text = str;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.url = str;
    }

    @NotNull
    public String toString() {
        return a.j("HealthierLink(url=", this.url, ", text=", this.text, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.url);
        dest.writeString(this.text);
    }
}
