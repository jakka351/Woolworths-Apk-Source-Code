package au.com.woolworths.promotion.banner.ui;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.promotion.banner.data.PromotionMarkdownContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/promotion/banner/ui/PromotionBannerAction;", "Landroid/os/Parcelable;", "LaunchPromotionDetails", "Link", "None", "Lau/com/woolworths/promotion/banner/ui/PromotionBannerAction$LaunchPromotionDetails;", "Lau/com/woolworths/promotion/banner/ui/PromotionBannerAction$Link;", "Lau/com/woolworths/promotion/banner/ui/PromotionBannerAction$None;", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class PromotionBannerAction implements Parcelable {

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/promotion/banner/ui/PromotionBannerAction$LaunchPromotionDetails;", "Lau/com/woolworths/promotion/banner/ui/PromotionBannerAction;", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LaunchPromotionDetails extends PromotionBannerAction {

        @NotNull
        public static final Parcelable.Creator<LaunchPromotionDetails> CREATOR = new Creator();
        public final PromotionMarkdownContent d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LaunchPromotionDetails> {
            @Override // android.os.Parcelable.Creator
            public final LaunchPromotionDetails createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new LaunchPromotionDetails(PromotionMarkdownContent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchPromotionDetails[] newArray(int i) {
                return new LaunchPromotionDetails[i];
            }
        }

        public LaunchPromotionDetails(PromotionMarkdownContent content) {
            Intrinsics.h(content, "content");
            this.d = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchPromotionDetails) && Intrinsics.c(this.d, ((LaunchPromotionDetails) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "LaunchPromotionDetails(content=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            this.d.writeToParcel(dest, i);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/promotion/banner/ui/PromotionBannerAction$Link;", "Lau/com/woolworths/promotion/banner/ui/PromotionBannerAction;", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link extends PromotionBannerAction {

        @NotNull
        public static final Parcelable.Creator<Link> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Link> {
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Link(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i) {
                return new Link[i];
            }
        }

        public Link(String uri) {
            Intrinsics.h(uri, "uri");
            this.d = uri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Link) && Intrinsics.c(this.d, ((Link) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("Link(uri=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/promotion/banner/ui/PromotionBannerAction$None;", "Lau/com/woolworths/promotion/banner/ui/PromotionBannerAction;", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class None extends PromotionBannerAction {
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
}
