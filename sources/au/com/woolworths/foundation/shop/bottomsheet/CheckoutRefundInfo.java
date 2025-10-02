package au.com.woolworths.foundation.shop.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jj\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020-HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020-R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00068"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/CheckoutRefundInfo;", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent;", "Landroid/os/Parcelable;", "showOnceOnly", "", "bottomSheetTitle", "", "bottomSheetBody", "primaryCta", "Lau/com/woolworths/android/onesite/data/ContentCta;", "secondaryCta", "bannerAsset", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "presentationStyle", "Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;", "bannerIcon", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;)V", "getShowOnceOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBottomSheetTitle", "()Ljava/lang/String;", "getBottomSheetBody", "getPrimaryCta", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "getSecondaryCta", "getBannerAsset", "()Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "getPresentationStyle", "()Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;", "getBannerIcon", "()Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;)Lau/com/woolworths/foundation/shop/bottomsheet/CheckoutRefundInfo;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutRefundInfo extends BottomSheetContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CheckoutRefundInfo> CREATOR = new Creator();

    @Nullable
    private final DownloadableAsset bannerAsset;

    @Nullable
    private final BottomSheetBannerIcon bannerIcon;

    @SerializedName("bottomSheetBody")
    @NotNull
    private final String bottomSheetBody;

    @SerializedName("bottomSheetTitle")
    @NotNull
    private final String bottomSheetTitle;

    @Nullable
    private final PresentationStyle presentationStyle;

    @SerializedName("primaryCta")
    @Nullable
    private final ContentCta primaryCta;

    @Nullable
    private final ContentCta secondaryCta;

    @Nullable
    private final Boolean showOnceOnly;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CheckoutRefundInfo> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutRefundInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.h(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CheckoutRefundInfo(boolValueOf, parcel.readString(), parcel.readString(), (ContentCta) parcel.readParcelable(CheckoutRefundInfo.class.getClassLoader()), (ContentCta) parcel.readParcelable(CheckoutRefundInfo.class.getClassLoader()), (DownloadableAsset) parcel.readParcelable(CheckoutRefundInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : PresentationStyle.valueOf(parcel.readString()), parcel.readInt() != 0 ? BottomSheetBannerIcon.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutRefundInfo[] newArray(int i) {
            return new CheckoutRefundInfo[i];
        }
    }

    public CheckoutRefundInfo(@Nullable Boolean bool, @NotNull String bottomSheetTitle, @NotNull String bottomSheetBody, @Nullable ContentCta contentCta, @Nullable ContentCta contentCta2, @Nullable DownloadableAsset downloadableAsset, @Nullable PresentationStyle presentationStyle, @Nullable BottomSheetBannerIcon bottomSheetBannerIcon) {
        Intrinsics.h(bottomSheetTitle, "bottomSheetTitle");
        Intrinsics.h(bottomSheetBody, "bottomSheetBody");
        this.showOnceOnly = bool;
        this.bottomSheetTitle = bottomSheetTitle;
        this.bottomSheetBody = bottomSheetBody;
        this.primaryCta = contentCta;
        this.secondaryCta = contentCta2;
        this.bannerAsset = downloadableAsset;
        this.presentationStyle = presentationStyle;
        this.bannerIcon = bottomSheetBannerIcon;
    }

    public static /* synthetic */ CheckoutRefundInfo copy$default(CheckoutRefundInfo checkoutRefundInfo, Boolean bool, String str, String str2, ContentCta contentCta, ContentCta contentCta2, DownloadableAsset downloadableAsset, PresentationStyle presentationStyle, BottomSheetBannerIcon bottomSheetBannerIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = checkoutRefundInfo.showOnceOnly;
        }
        if ((i & 2) != 0) {
            str = checkoutRefundInfo.bottomSheetTitle;
        }
        if ((i & 4) != 0) {
            str2 = checkoutRefundInfo.bottomSheetBody;
        }
        if ((i & 8) != 0) {
            contentCta = checkoutRefundInfo.primaryCta;
        }
        if ((i & 16) != 0) {
            contentCta2 = checkoutRefundInfo.secondaryCta;
        }
        if ((i & 32) != 0) {
            downloadableAsset = checkoutRefundInfo.bannerAsset;
        }
        if ((i & 64) != 0) {
            presentationStyle = checkoutRefundInfo.presentationStyle;
        }
        if ((i & 128) != 0) {
            bottomSheetBannerIcon = checkoutRefundInfo.bannerIcon;
        }
        PresentationStyle presentationStyle2 = presentationStyle;
        BottomSheetBannerIcon bottomSheetBannerIcon2 = bottomSheetBannerIcon;
        ContentCta contentCta3 = contentCta2;
        DownloadableAsset downloadableAsset2 = downloadableAsset;
        return checkoutRefundInfo.copy(bool, str, str2, contentCta, contentCta3, downloadableAsset2, presentationStyle2, bottomSheetBannerIcon2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getShowOnceOnly() {
        return this.showOnceOnly;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBottomSheetBody() {
        return this.bottomSheetBody;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ContentCta getPrimaryCta() {
        return this.primaryCta;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final ContentCta getSecondaryCta() {
        return this.secondaryCta;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final DownloadableAsset getBannerAsset() {
        return this.bannerAsset;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final PresentationStyle getPresentationStyle() {
        return this.presentationStyle;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final BottomSheetBannerIcon getBannerIcon() {
        return this.bannerIcon;
    }

    @NotNull
    public final CheckoutRefundInfo copy(@Nullable Boolean showOnceOnly, @NotNull String bottomSheetTitle, @NotNull String bottomSheetBody, @Nullable ContentCta primaryCta, @Nullable ContentCta secondaryCta, @Nullable DownloadableAsset bannerAsset, @Nullable PresentationStyle presentationStyle, @Nullable BottomSheetBannerIcon bannerIcon) {
        Intrinsics.h(bottomSheetTitle, "bottomSheetTitle");
        Intrinsics.h(bottomSheetBody, "bottomSheetBody");
        return new CheckoutRefundInfo(showOnceOnly, bottomSheetTitle, bottomSheetBody, primaryCta, secondaryCta, bannerAsset, presentationStyle, bannerIcon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutRefundInfo)) {
            return false;
        }
        CheckoutRefundInfo checkoutRefundInfo = (CheckoutRefundInfo) other;
        return Intrinsics.c(this.showOnceOnly, checkoutRefundInfo.showOnceOnly) && Intrinsics.c(this.bottomSheetTitle, checkoutRefundInfo.bottomSheetTitle) && Intrinsics.c(this.bottomSheetBody, checkoutRefundInfo.bottomSheetBody) && Intrinsics.c(this.primaryCta, checkoutRefundInfo.primaryCta) && Intrinsics.c(this.secondaryCta, checkoutRefundInfo.secondaryCta) && Intrinsics.c(this.bannerAsset, checkoutRefundInfo.bannerAsset) && this.presentationStyle == checkoutRefundInfo.presentationStyle && this.bannerIcon == checkoutRefundInfo.bannerIcon;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
    @Nullable
    /* renamed from: getBannerAsset */
    public DownloadableAsset getD() {
        return this.bannerAsset;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
    @Nullable
    /* renamed from: getBannerIcon */
    public BottomSheetBannerIcon getF() {
        return this.bannerIcon;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
    @NotNull
    public String getBottomSheetBody() {
        return this.bottomSheetBody;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
    @NotNull
    public String getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
    @Nullable
    /* renamed from: getPresentationStyle */
    public PresentationStyle getE() {
        return this.presentationStyle;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
    @Nullable
    public ContentCta getPrimaryCta() {
        return this.primaryCta;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
    @Nullable
    public ContentCta getSecondaryCta() {
        return this.secondaryCta;
    }

    @Nullable
    public Boolean getShowOnceOnly() {
        return this.showOnceOnly;
    }

    public int hashCode() {
        Boolean bool = this.showOnceOnly;
        int iC = b.c(b.c((bool == null ? 0 : bool.hashCode()) * 31, 31, this.bottomSheetTitle), 31, this.bottomSheetBody);
        ContentCta contentCta = this.primaryCta;
        int iHashCode = (iC + (contentCta == null ? 0 : contentCta.hashCode())) * 31;
        ContentCta contentCta2 = this.secondaryCta;
        int iHashCode2 = (iHashCode + (contentCta2 == null ? 0 : contentCta2.hashCode())) * 31;
        DownloadableAsset downloadableAsset = this.bannerAsset;
        int iHashCode3 = (iHashCode2 + (downloadableAsset == null ? 0 : downloadableAsset.hashCode())) * 31;
        PresentationStyle presentationStyle = this.presentationStyle;
        int iHashCode4 = (iHashCode3 + (presentationStyle == null ? 0 : presentationStyle.hashCode())) * 31;
        BottomSheetBannerIcon bottomSheetBannerIcon = this.bannerIcon;
        return iHashCode4 + (bottomSheetBannerIcon != null ? bottomSheetBannerIcon.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CheckoutRefundInfo(showOnceOnly=" + this.showOnceOnly + ", bottomSheetTitle=" + this.bottomSheetTitle + ", bottomSheetBody=" + this.bottomSheetBody + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", bannerAsset=" + this.bannerAsset + ", presentationStyle=" + this.presentationStyle + ", bannerIcon=" + this.bannerIcon + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        Boolean bool = this.showOnceOnly;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.bottomSheetTitle);
        dest.writeString(this.bottomSheetBody);
        dest.writeParcelable(this.primaryCta, flags);
        dest.writeParcelable(this.secondaryCta, flags);
        dest.writeParcelable(this.bannerAsset, flags);
        PresentationStyle presentationStyle = this.presentationStyle;
        if (presentationStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(presentationStyle.name());
        }
        BottomSheetBannerIcon bottomSheetBannerIcon = this.bannerIcon;
        if (bottomSheetBannerIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bottomSheetBannerIcon.name());
        }
    }

    public /* synthetic */ CheckoutRefundInfo(Boolean bool, String str, String str2, ContentCta contentCta, ContentCta contentCta2, DownloadableAsset downloadableAsset, PresentationStyle presentationStyle, BottomSheetBannerIcon bottomSheetBannerIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, str, str2, contentCta, (i & 16) != 0 ? null : contentCta2, (i & 32) != 0 ? null : downloadableAsset, (i & 64) != 0 ? null : presentationStyle, (i & 128) != 0 ? null : bottomSheetBannerIcon);
    }
}
