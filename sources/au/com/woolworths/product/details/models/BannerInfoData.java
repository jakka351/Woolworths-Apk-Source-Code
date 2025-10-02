package au.com.woolworths.product.details.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lau/com/woolworths/product/details/models/BannerInfoData;", "Landroid/os/Parcelable;", "style", "Lau/com/woolworths/product/details/models/BannerStyle;", "content", "", "hasIcon", "", "<init>", "(Lau/com/woolworths/product/details/models/BannerStyle;Ljava/lang/String;Z)V", "getStyle", "()Lau/com/woolworths/product/details/models/BannerStyle;", "getContent", "()Ljava/lang/String;", "getHasIcon", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BannerInfoData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<BannerInfoData> CREATOR = new Creator();

    @NotNull
    private final String content;
    private final boolean hasIcon;

    @NotNull
    private final BannerStyle style;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BannerInfoData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerInfoData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new BannerInfoData(BannerStyle.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerInfoData[] newArray(int i) {
            return new BannerInfoData[i];
        }
    }

    public BannerInfoData(@NotNull BannerStyle style, @NotNull String content, boolean z) {
        Intrinsics.h(style, "style");
        Intrinsics.h(content, "content");
        this.style = style;
        this.content = content;
        this.hasIcon = z;
    }

    public static /* synthetic */ BannerInfoData copy$default(BannerInfoData bannerInfoData, BannerStyle bannerStyle, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bannerStyle = bannerInfoData.style;
        }
        if ((i & 2) != 0) {
            str = bannerInfoData.content;
        }
        if ((i & 4) != 0) {
            z = bannerInfoData.hasIcon;
        }
        return bannerInfoData.copy(bannerStyle, str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BannerStyle getStyle() {
        return this.style;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasIcon() {
        return this.hasIcon;
    }

    @NotNull
    public final BannerInfoData copy(@NotNull BannerStyle style, @NotNull String content, boolean hasIcon) {
        Intrinsics.h(style, "style");
        Intrinsics.h(content, "content");
        return new BannerInfoData(style, content, hasIcon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerInfoData)) {
            return false;
        }
        BannerInfoData bannerInfoData = (BannerInfoData) other;
        return this.style == bannerInfoData.style && Intrinsics.c(this.content, bannerInfoData.content) && this.hasIcon == bannerInfoData.hasIcon;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final boolean getHasIcon() {
        return this.hasIcon;
    }

    @NotNull
    public final BannerStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasIcon) + b.c(this.style.hashCode() * 31, 31, this.content);
    }

    @NotNull
    public String toString() {
        BannerStyle bannerStyle = this.style;
        String str = this.content;
        boolean z = this.hasIcon;
        StringBuilder sb = new StringBuilder("BannerInfoData(style=");
        sb.append(bannerStyle);
        sb.append(", content=");
        sb.append(str);
        sb.append(", hasIcon=");
        return a.k(")", sb, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        this.style.writeToParcel(dest, flags);
        dest.writeString(this.content);
        dest.writeInt(this.hasIcon ? 1 : 0);
    }
}
