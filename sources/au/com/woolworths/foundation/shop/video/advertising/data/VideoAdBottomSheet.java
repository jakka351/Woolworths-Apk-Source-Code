package au.com.woolworths.foundation.shop.video.advertising.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/video/advertising/data/VideoAdBottomSheet;", "Landroid/os/Parcelable;", "video-advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VideoAdBottomSheet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VideoAdBottomSheet> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final AnalyticsData h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VideoAdBottomSheet> {
        @Override // android.os.Parcelable.Creator
        public final VideoAdBottomSheet createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new VideoAdBottomSheet(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AnalyticsData) parcel.readParcelable(VideoAdBottomSheet.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAdBottomSheet[] newArray(int i) {
            return new VideoAdBottomSheet[i];
        }
    }

    public VideoAdBottomSheet(String contentMarkdown, String title, String str, String accessibilityText, AnalyticsData analyticsData) {
        Intrinsics.h(contentMarkdown, "contentMarkdown");
        Intrinsics.h(title, "title");
        Intrinsics.h(accessibilityText, "accessibilityText");
        this.d = contentMarkdown;
        this.e = title;
        this.f = str;
        this.g = accessibilityText;
        this.h = analyticsData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdBottomSheet)) {
            return false;
        }
        VideoAdBottomSheet videoAdBottomSheet = (VideoAdBottomSheet) obj;
        return Intrinsics.c(this.d, videoAdBottomSheet.d) && Intrinsics.c(this.e, videoAdBottomSheet.e) && Intrinsics.c(this.f, videoAdBottomSheet.f) && Intrinsics.c(this.g, videoAdBottomSheet.g) && Intrinsics.c(this.h, videoAdBottomSheet.h);
    }

    public final int hashCode() {
        int iC = b.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        AnalyticsData analyticsData = this.h;
        return iC2 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("VideoAdBottomSheet(contentMarkdown=", this.d, ", title=", this.e, ", buttonText=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", accessibilityText=", this.g, ", impressionAnalytics=");
        return au.com.woolworths.android.onesite.a.n(sbV, this.h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeParcelable(this.h, i);
    }
}
