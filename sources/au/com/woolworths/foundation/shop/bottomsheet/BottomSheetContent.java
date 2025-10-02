package au.com.woolworths.foundation.shop.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent;", "", "FinchInfo", "Marketplace", "MarketplacePickUp", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$FinchInfo;", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$MarketplacePickUp;", "Lau/com/woolworths/foundation/shop/bottomsheet/CheckoutRefundInfo;", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BottomSheetContent {
    /* renamed from: getBannerAsset */
    public abstract DownloadableAsset getD();

    /* renamed from: getBannerIcon */
    public abstract BottomSheetBannerIcon getF();

    public abstract String getBottomSheetBody();

    public abstract String getBottomSheetTitle();

    /* renamed from: getPresentationStyle */
    public abstract PresentationStyle getE();

    public abstract ContentCta getPrimaryCta();

    public abstract ContentCta getSecondaryCta();

    @Parcelize
    @Keep
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003Jh\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020-HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020-R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00068"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent;", "Landroid/os/Parcelable;", "showOnceOnly", "", "bottomSheetTitle", "", "bottomSheetBody", "primaryCta", "Lau/com/woolworths/android/onesite/data/ContentCta;", "secondaryCta", "bannerAsset", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "presentationStyle", "Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;", "bannerIcon", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;)V", "getShowOnceOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBottomSheetTitle", "()Ljava/lang/String;", "getBottomSheetBody", "getPrimaryCta", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "getSecondaryCta", "getBannerAsset", "()Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "getPresentationStyle", "()Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;", "getBannerIcon", "()Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;)Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$Marketplace;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Marketplace extends BottomSheetContent implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Marketplace> CREATOR = new Creator();

        @Nullable
        private final DownloadableAsset bannerAsset;

        @NotNull
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

        @SerializedName("secondaryCta")
        @Nullable
        private final ContentCta secondaryCta;

        @SerializedName("showOnceOnly")
        @Nullable
        private final Boolean showOnceOnly;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Marketplace> {
            @Override // android.os.Parcelable.Creator
            public final Marketplace createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.h(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Marketplace(boolValueOf, parcel.readString(), parcel.readString(), (ContentCta) parcel.readParcelable(Marketplace.class.getClassLoader()), (ContentCta) parcel.readParcelable(Marketplace.class.getClassLoader()), (DownloadableAsset) parcel.readParcelable(Marketplace.class.getClassLoader()), parcel.readInt() != 0 ? PresentationStyle.valueOf(parcel.readString()) : null, BottomSheetBannerIcon.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Marketplace[] newArray(int i) {
                return new Marketplace[i];
            }
        }

        public Marketplace(@Nullable Boolean bool, @NotNull String bottomSheetTitle, @NotNull String bottomSheetBody, @Nullable ContentCta contentCta, @Nullable ContentCta contentCta2, @Nullable DownloadableAsset downloadableAsset, @Nullable PresentationStyle presentationStyle, @NotNull BottomSheetBannerIcon bannerIcon) {
            Intrinsics.h(bottomSheetTitle, "bottomSheetTitle");
            Intrinsics.h(bottomSheetBody, "bottomSheetBody");
            Intrinsics.h(bannerIcon, "bannerIcon");
            this.showOnceOnly = bool;
            this.bottomSheetTitle = bottomSheetTitle;
            this.bottomSheetBody = bottomSheetBody;
            this.primaryCta = contentCta;
            this.secondaryCta = contentCta2;
            this.bannerAsset = downloadableAsset;
            this.presentationStyle = presentationStyle;
            this.bannerIcon = bannerIcon;
        }

        public static /* synthetic */ Marketplace copy$default(Marketplace marketplace, Boolean bool, String str, String str2, ContentCta contentCta, ContentCta contentCta2, DownloadableAsset downloadableAsset, PresentationStyle presentationStyle, BottomSheetBannerIcon bottomSheetBannerIcon, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = marketplace.showOnceOnly;
            }
            if ((i & 2) != 0) {
                str = marketplace.bottomSheetTitle;
            }
            if ((i & 4) != 0) {
                str2 = marketplace.bottomSheetBody;
            }
            if ((i & 8) != 0) {
                contentCta = marketplace.primaryCta;
            }
            if ((i & 16) != 0) {
                contentCta2 = marketplace.secondaryCta;
            }
            if ((i & 32) != 0) {
                downloadableAsset = marketplace.bannerAsset;
            }
            if ((i & 64) != 0) {
                presentationStyle = marketplace.presentationStyle;
            }
            if ((i & 128) != 0) {
                bottomSheetBannerIcon = marketplace.bannerIcon;
            }
            PresentationStyle presentationStyle2 = presentationStyle;
            BottomSheetBannerIcon bottomSheetBannerIcon2 = bottomSheetBannerIcon;
            ContentCta contentCta3 = contentCta2;
            DownloadableAsset downloadableAsset2 = downloadableAsset;
            return marketplace.copy(bool, str, str2, contentCta, contentCta3, downloadableAsset2, presentationStyle2, bottomSheetBannerIcon2);
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

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final BottomSheetBannerIcon getBannerIcon() {
            return this.bannerIcon;
        }

        @NotNull
        public final Marketplace copy(@Nullable Boolean showOnceOnly, @NotNull String bottomSheetTitle, @NotNull String bottomSheetBody, @Nullable ContentCta primaryCta, @Nullable ContentCta secondaryCta, @Nullable DownloadableAsset bannerAsset, @Nullable PresentationStyle presentationStyle, @NotNull BottomSheetBannerIcon bannerIcon) {
            Intrinsics.h(bottomSheetTitle, "bottomSheetTitle");
            Intrinsics.h(bottomSheetBody, "bottomSheetBody");
            Intrinsics.h(bannerIcon, "bannerIcon");
            return new Marketplace(showOnceOnly, bottomSheetTitle, bottomSheetBody, primaryCta, secondaryCta, bannerAsset, presentationStyle, bannerIcon);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Marketplace)) {
                return false;
            }
            Marketplace marketplace = (Marketplace) other;
            return Intrinsics.c(this.showOnceOnly, marketplace.showOnceOnly) && Intrinsics.c(this.bottomSheetTitle, marketplace.bottomSheetTitle) && Intrinsics.c(this.bottomSheetBody, marketplace.bottomSheetBody) && Intrinsics.c(this.primaryCta, marketplace.primaryCta) && Intrinsics.c(this.secondaryCta, marketplace.secondaryCta) && Intrinsics.c(this.bannerAsset, marketplace.bannerAsset) && this.presentationStyle == marketplace.presentationStyle && this.bannerIcon == marketplace.bannerIcon;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        @Nullable
        /* renamed from: getBannerAsset */
        public DownloadableAsset getD() {
            return this.bannerAsset;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        @NotNull
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
            return this.bannerIcon.hashCode() + ((iHashCode3 + (presentationStyle != null ? presentationStyle.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "Marketplace(showOnceOnly=" + this.showOnceOnly + ", bottomSheetTitle=" + this.bottomSheetTitle + ", bottomSheetBody=" + this.bottomSheetBody + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", bannerAsset=" + this.bannerAsset + ", presentationStyle=" + this.presentationStyle + ", bannerIcon=" + this.bannerIcon + ")";
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
            dest.writeString(this.bannerIcon.name());
        }

        public /* synthetic */ Marketplace(Boolean bool, String str, String str2, ContentCta contentCta, ContentCta contentCta2, DownloadableAsset downloadableAsset, PresentationStyle presentationStyle, BottomSheetBannerIcon bottomSheetBannerIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, str, str2, contentCta, contentCta2, (i & 32) != 0 ? null : downloadableAsset, (i & 64) != 0 ? null : presentationStyle, (i & 128) != 0 ? BottomSheetBannerIcon.d : bottomSheetBannerIcon);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$MarketplacePickUp;", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent;", "Landroid/os/Parcelable;", "", "showOnceOnly", "", "bottomSheetTitle", "bottomSheetBody", "Lau/com/woolworths/android/onesite/data/ContentCta;", "primaryCta", "secondaryCta", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "bannerAsset", "Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;", "presentationStyle", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;", "bannerIcon", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;)V", "Ljava/lang/Boolean;", "getShowOnceOnly", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getBottomSheetTitle", "()Ljava/lang/String;", "getBottomSheetBody", "Lau/com/woolworths/android/onesite/data/ContentCta;", "getPrimaryCta", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "getSecondaryCta", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplacePickUp extends BottomSheetContent implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<MarketplacePickUp> CREATOR = new Creator();

        @SerializedName("bottomSheetBody")
        @NotNull
        private final String bottomSheetBody;

        @SerializedName("bottomSheetTitle")
        @NotNull
        private final String bottomSheetTitle;
        public final DownloadableAsset d;
        public final PresentationStyle e;
        public final BottomSheetBannerIcon f;

        @SerializedName("primaryCta")
        @Nullable
        private final ContentCta primaryCta;

        @SerializedName("secondaryCta")
        @Nullable
        private final ContentCta secondaryCta;

        @SerializedName("showOnceOnly")
        @Nullable
        private final Boolean showOnceOnly;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MarketplacePickUp> {
            @Override // android.os.Parcelable.Creator
            public final MarketplacePickUp createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.h(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new MarketplacePickUp(boolValueOf, parcel.readString(), parcel.readString(), (ContentCta) parcel.readParcelable(MarketplacePickUp.class.getClassLoader()), (ContentCta) parcel.readParcelable(MarketplacePickUp.class.getClassLoader()), (DownloadableAsset) parcel.readParcelable(MarketplacePickUp.class.getClassLoader()), parcel.readInt() == 0 ? null : PresentationStyle.valueOf(parcel.readString()), parcel.readInt() != 0 ? BottomSheetBannerIcon.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final MarketplacePickUp[] newArray(int i) {
                return new MarketplacePickUp[i];
            }
        }

        public MarketplacePickUp(@Nullable Boolean bool, @NotNull String bottomSheetTitle, @NotNull String bottomSheetBody, @Nullable ContentCta contentCta, @Nullable ContentCta contentCta2, @Nullable DownloadableAsset downloadableAsset, @Nullable PresentationStyle presentationStyle, @Nullable BottomSheetBannerIcon bottomSheetBannerIcon) {
            Intrinsics.h(bottomSheetTitle, "bottomSheetTitle");
            Intrinsics.h(bottomSheetBody, "bottomSheetBody");
            this.showOnceOnly = bool;
            this.bottomSheetTitle = bottomSheetTitle;
            this.bottomSheetBody = bottomSheetBody;
            this.primaryCta = contentCta;
            this.secondaryCta = contentCta2;
            this.d = downloadableAsset;
            this.e = presentationStyle;
            this.f = bottomSheetBannerIcon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketplacePickUp)) {
                return false;
            }
            MarketplacePickUp marketplacePickUp = (MarketplacePickUp) obj;
            return Intrinsics.c(this.showOnceOnly, marketplacePickUp.showOnceOnly) && Intrinsics.c(this.bottomSheetTitle, marketplacePickUp.bottomSheetTitle) && Intrinsics.c(this.bottomSheetBody, marketplacePickUp.bottomSheetBody) && Intrinsics.c(this.primaryCta, marketplacePickUp.primaryCta) && Intrinsics.c(this.secondaryCta, marketplacePickUp.secondaryCta) && Intrinsics.c(this.d, marketplacePickUp.d) && this.e == marketplacePickUp.e && this.f == marketplacePickUp.f;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        /* renamed from: getBannerAsset, reason: from getter */
        public final DownloadableAsset getD() {
            return this.d;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        /* renamed from: getBannerIcon, reason: from getter */
        public final BottomSheetBannerIcon getF() {
            return this.f;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        public final String getBottomSheetBody() {
            return this.bottomSheetBody;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        public final String getBottomSheetTitle() {
            return this.bottomSheetTitle;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        /* renamed from: getPresentationStyle, reason: from getter */
        public final PresentationStyle getE() {
            return this.e;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        public final ContentCta getPrimaryCta() {
            return this.primaryCta;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        public final ContentCta getSecondaryCta() {
            return this.secondaryCta;
        }

        public final int hashCode() {
            Boolean bool = this.showOnceOnly;
            int iC = b.c(b.c((bool == null ? 0 : bool.hashCode()) * 31, 31, this.bottomSheetTitle), 31, this.bottomSheetBody);
            ContentCta contentCta = this.primaryCta;
            int iHashCode = (iC + (contentCta == null ? 0 : contentCta.hashCode())) * 31;
            ContentCta contentCta2 = this.secondaryCta;
            int iHashCode2 = (iHashCode + (contentCta2 == null ? 0 : contentCta2.hashCode())) * 31;
            DownloadableAsset downloadableAsset = this.d;
            int iHashCode3 = (iHashCode2 + (downloadableAsset == null ? 0 : downloadableAsset.hashCode())) * 31;
            PresentationStyle presentationStyle = this.e;
            int iHashCode4 = (iHashCode3 + (presentationStyle == null ? 0 : presentationStyle.hashCode())) * 31;
            BottomSheetBannerIcon bottomSheetBannerIcon = this.f;
            return iHashCode4 + (bottomSheetBannerIcon != null ? bottomSheetBannerIcon.hashCode() : 0);
        }

        public final String toString() {
            return "MarketplacePickUp(showOnceOnly=" + this.showOnceOnly + ", bottomSheetTitle=" + this.bottomSheetTitle + ", bottomSheetBody=" + this.bottomSheetBody + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", bannerAsset=" + this.d + ", presentationStyle=" + this.e + ", bannerIcon=" + this.f + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
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
            dest.writeParcelable(this.primaryCta, i);
            dest.writeParcelable(this.secondaryCta, i);
            dest.writeParcelable(this.d, i);
            PresentationStyle presentationStyle = this.e;
            if (presentationStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(presentationStyle.name());
            }
            BottomSheetBannerIcon bottomSheetBannerIcon = this.f;
            if (bottomSheetBannerIcon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bottomSheetBannerIcon.name());
            }
        }

        public /* synthetic */ MarketplacePickUp(Boolean bool, String str, String str2, ContentCta contentCta, ContentCta contentCta2, DownloadableAsset downloadableAsset, PresentationStyle presentationStyle, BottomSheetBannerIcon bottomSheetBannerIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, str, str2, contentCta, contentCta2, (i & 32) != 0 ? null : downloadableAsset, (i & 64) != 0 ? null : presentationStyle, (i & 128) != 0 ? null : bottomSheetBannerIcon);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b+\u0010\u001f¨\u0006,"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent$FinchInfo;", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetContent;", "Landroid/os/Parcelable;", "", "showOnceOnly", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "bannerAsset", "", "bottomSheetTitle", "bottomSheetBody", "Lau/com/woolworths/android/onesite/data/ContentCta;", "primaryCta", "secondaryCta", "Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;", "presentationStyle", "", "Lau/com/woolworths/foundation/shop/bottomsheet/FinchInfoItem;", "items", "footer", "Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;", "bannerIcon", "<init>", "(Ljava/lang/Boolean;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;Ljava/util/List;Ljava/lang/String;Lau/com/woolworths/foundation/shop/bottomsheet/BottomSheetBannerIcon;)V", "Ljava/lang/Boolean;", "getShowOnceOnly", "()Ljava/lang/Boolean;", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "getBannerAsset", "()Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "Ljava/lang/String;", "getBottomSheetTitle", "()Ljava/lang/String;", "getBottomSheetBody", "Lau/com/woolworths/android/onesite/data/ContentCta;", "getPrimaryCta", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "getSecondaryCta", "Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;", "getPresentationStyle", "()Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;", "Ljava/util/List;", "b", "()Ljava/util/List;", "a", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FinchInfo extends BottomSheetContent implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FinchInfo> CREATOR = new Creator();

        @SerializedName("bannerAsset")
        @Nullable
        private final DownloadableAsset bannerAsset;

        @SerializedName("bottomSheetBody")
        @NotNull
        private final String bottomSheetBody;

        @SerializedName("bottomSheetTitle")
        @NotNull
        private final String bottomSheetTitle;
        public final BottomSheetBannerIcon d;

        @SerializedName("footer")
        @Nullable
        private final String footer;

        @SerializedName("items")
        @NotNull
        private final List<FinchInfoItem> items;

        @SerializedName("presentationStyle")
        @Nullable
        private final PresentationStyle presentationStyle;

        @SerializedName("primaryCta")
        @Nullable
        private final ContentCta primaryCta;

        @SerializedName("secondaryCta")
        @Nullable
        private final ContentCta secondaryCta;

        @SerializedName("showOnceOnly")
        @Nullable
        private final Boolean showOnceOnly;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FinchInfo> {
            @Override // android.os.Parcelable.Creator
            public final FinchInfo createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.h(parcel, "parcel");
                int iE = 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                DownloadableAsset downloadableAsset = (DownloadableAsset) parcel.readParcelable(FinchInfo.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                ContentCta contentCta = (ContentCta) parcel.readParcelable(FinchInfo.class.getClassLoader());
                ContentCta contentCta2 = (ContentCta) parcel.readParcelable(FinchInfo.class.getClassLoader());
                PresentationStyle presentationStyleValueOf = parcel.readInt() == 0 ? null : PresentationStyle.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iE != i) {
                    iE = a.e(FinchInfoItem.CREATOR, parcel, arrayList, iE, 1);
                }
                return new FinchInfo(boolValueOf, downloadableAsset, string, string2, contentCta, contentCta2, presentationStyleValueOf, arrayList, parcel.readString(), parcel.readInt() != 0 ? BottomSheetBannerIcon.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final FinchInfo[] newArray(int i) {
                return new FinchInfo[i];
            }
        }

        public FinchInfo(@Nullable Boolean bool, @Nullable DownloadableAsset downloadableAsset, @NotNull String bottomSheetTitle, @NotNull String bottomSheetBody, @Nullable ContentCta contentCta, @Nullable ContentCta contentCta2, @Nullable PresentationStyle presentationStyle, @NotNull List<FinchInfoItem> items, @Nullable String str, @Nullable BottomSheetBannerIcon bottomSheetBannerIcon) {
            Intrinsics.h(bottomSheetTitle, "bottomSheetTitle");
            Intrinsics.h(bottomSheetBody, "bottomSheetBody");
            Intrinsics.h(items, "items");
            this.showOnceOnly = bool;
            this.bannerAsset = downloadableAsset;
            this.bottomSheetTitle = bottomSheetTitle;
            this.bottomSheetBody = bottomSheetBody;
            this.primaryCta = contentCta;
            this.secondaryCta = contentCta2;
            this.presentationStyle = presentationStyle;
            this.items = items;
            this.footer = str;
            this.d = bottomSheetBannerIcon;
        }

        /* renamed from: a, reason: from getter */
        public final String getFooter() {
            return this.footer;
        }

        /* renamed from: b, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinchInfo)) {
                return false;
            }
            FinchInfo finchInfo = (FinchInfo) obj;
            return Intrinsics.c(this.showOnceOnly, finchInfo.showOnceOnly) && Intrinsics.c(this.bannerAsset, finchInfo.bannerAsset) && Intrinsics.c(this.bottomSheetTitle, finchInfo.bottomSheetTitle) && Intrinsics.c(this.bottomSheetBody, finchInfo.bottomSheetBody) && Intrinsics.c(this.primaryCta, finchInfo.primaryCta) && Intrinsics.c(this.secondaryCta, finchInfo.secondaryCta) && this.presentationStyle == finchInfo.presentationStyle && Intrinsics.c(this.items, finchInfo.items) && Intrinsics.c(this.footer, finchInfo.footer) && this.d == finchInfo.d;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        /* renamed from: getBannerAsset, reason: from getter */
        public final DownloadableAsset getD() {
            return this.bannerAsset;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        /* renamed from: getBannerIcon, reason: from getter */
        public final BottomSheetBannerIcon getF() {
            return this.d;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        public final String getBottomSheetBody() {
            return this.bottomSheetBody;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        public final String getBottomSheetTitle() {
            return this.bottomSheetTitle;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        /* renamed from: getPresentationStyle, reason: from getter */
        public final PresentationStyle getE() {
            return this.presentationStyle;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        public final ContentCta getPrimaryCta() {
            return this.primaryCta;
        }

        @Override // au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent
        public final ContentCta getSecondaryCta() {
            return this.secondaryCta;
        }

        public final int hashCode() {
            Boolean bool = this.showOnceOnly;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            DownloadableAsset downloadableAsset = this.bannerAsset;
            int iC = b.c(b.c((iHashCode + (downloadableAsset == null ? 0 : downloadableAsset.hashCode())) * 31, 31, this.bottomSheetTitle), 31, this.bottomSheetBody);
            ContentCta contentCta = this.primaryCta;
            int iHashCode2 = (iC + (contentCta == null ? 0 : contentCta.hashCode())) * 31;
            ContentCta contentCta2 = this.secondaryCta;
            int iHashCode3 = (iHashCode2 + (contentCta2 == null ? 0 : contentCta2.hashCode())) * 31;
            PresentationStyle presentationStyle = this.presentationStyle;
            int iD = b.d((iHashCode3 + (presentationStyle == null ? 0 : presentationStyle.hashCode())) * 31, 31, this.items);
            String str = this.footer;
            int iHashCode4 = (iD + (str == null ? 0 : str.hashCode())) * 31;
            BottomSheetBannerIcon bottomSheetBannerIcon = this.d;
            return iHashCode4 + (bottomSheetBannerIcon != null ? bottomSheetBannerIcon.hashCode() : 0);
        }

        public final String toString() {
            Boolean bool = this.showOnceOnly;
            DownloadableAsset downloadableAsset = this.bannerAsset;
            String str = this.bottomSheetTitle;
            String str2 = this.bottomSheetBody;
            ContentCta contentCta = this.primaryCta;
            ContentCta contentCta2 = this.secondaryCta;
            PresentationStyle presentationStyle = this.presentationStyle;
            List<FinchInfoItem> list = this.items;
            String str3 = this.footer;
            StringBuilder sb = new StringBuilder("FinchInfo(showOnceOnly=");
            sb.append(bool);
            sb.append(", bannerAsset=");
            sb.append(downloadableAsset);
            sb.append(", bottomSheetTitle=");
            androidx.constraintlayout.core.state.a.B(sb, str, ", bottomSheetBody=", str2, ", primaryCta=");
            sb.append(contentCta);
            sb.append(", secondaryCta=");
            sb.append(contentCta2);
            sb.append(", presentationStyle=");
            sb.append(presentationStyle);
            sb.append(", items=");
            sb.append(list);
            sb.append(", footer=");
            sb.append(str3);
            sb.append(", bannerIcon=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            Boolean bool = this.showOnceOnly;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            dest.writeParcelable(this.bannerAsset, i);
            dest.writeString(this.bottomSheetTitle);
            dest.writeString(this.bottomSheetBody);
            dest.writeParcelable(this.primaryCta, i);
            dest.writeParcelable(this.secondaryCta, i);
            PresentationStyle presentationStyle = this.presentationStyle;
            if (presentationStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(presentationStyle.name());
            }
            Iterator itU = au.com.woolworths.android.onesite.a.u(this.items, dest);
            while (itU.hasNext()) {
                ((FinchInfoItem) itU.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.footer);
            BottomSheetBannerIcon bottomSheetBannerIcon = this.d;
            if (bottomSheetBannerIcon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bottomSheetBannerIcon.name());
            }
        }

        public /* synthetic */ FinchInfo(Boolean bool, DownloadableAsset downloadableAsset, String str, String str2, ContentCta contentCta, ContentCta contentCta2, PresentationStyle presentationStyle, List list, String str3, BottomSheetBannerIcon bottomSheetBannerIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, downloadableAsset, str, str2, contentCta, contentCta2, presentationStyle, list, str3, (i & 512) != 0 ? null : bottomSheetBannerIcon);
        }
    }
}
