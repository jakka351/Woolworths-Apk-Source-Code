package au.com.woolworths.rewards.base.coachmark.legacy;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import com.google.gson.annotations.SerializedName;
import io.jsonwebtoken.Claims;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/legacy/CoachMarkContent;", "", "", "id", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "bannerImage", "contentTitle", "contentBody", "Lau/com/woolworths/android/onesite/data/ContentCta;", "primaryCta", "targetTab", "", Claims.ISSUED_AT, "<init>", "(Ljava/lang/String;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Ljava/lang/String;J)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "getBannerImage", "()Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "getContentTitle", "getContentBody", "Lau/com/woolworths/android/onesite/data/ContentCta;", "getPrimaryCta", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "getTargetTab", "J", "getIat", "()J", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoachMarkContent {

    @SerializedName("bannerImage")
    @Nullable
    private final DownloadableAsset bannerImage;

    @SerializedName("contentBody")
    @NotNull
    private final String contentBody;

    @SerializedName("contentTitle")
    @NotNull
    private final String contentTitle;

    @SerializedName(Claims.ISSUED_AT)
    private final long iat;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("primaryCta")
    @Nullable
    private final ContentCta primaryCta;

    @SerializedName("targetTab")
    @NotNull
    private final String targetTab;

    public CoachMarkContent(@NotNull String id, @Nullable DownloadableAsset downloadableAsset, @NotNull String contentTitle, @NotNull String contentBody, @Nullable ContentCta contentCta, @NotNull String targetTab, long j) {
        Intrinsics.h(id, "id");
        Intrinsics.h(contentTitle, "contentTitle");
        Intrinsics.h(contentBody, "contentBody");
        Intrinsics.h(targetTab, "targetTab");
        this.id = id;
        this.bannerImage = downloadableAsset;
        this.contentTitle = contentTitle;
        this.contentBody = contentBody;
        this.primaryCta = contentCta;
        this.targetTab = targetTab;
        this.iat = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoachMarkContent)) {
            return false;
        }
        CoachMarkContent coachMarkContent = (CoachMarkContent) obj;
        return Intrinsics.c(this.id, coachMarkContent.id) && Intrinsics.c(this.bannerImage, coachMarkContent.bannerImage) && Intrinsics.c(this.contentTitle, coachMarkContent.contentTitle) && Intrinsics.c(this.contentBody, coachMarkContent.contentBody) && Intrinsics.c(this.primaryCta, coachMarkContent.primaryCta) && Intrinsics.c(this.targetTab, coachMarkContent.targetTab) && this.iat == coachMarkContent.iat;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DownloadableAsset downloadableAsset = this.bannerImage;
        int iC = b.c(b.c((iHashCode + (downloadableAsset == null ? 0 : downloadableAsset.hashCode())) * 31, 31, this.contentTitle), 31, this.contentBody);
        ContentCta contentCta = this.primaryCta;
        return Long.hashCode(this.iat) + b.c((iC + (contentCta != null ? contentCta.hashCode() : 0)) * 31, 31, this.targetTab);
    }

    public final String toString() {
        String str = this.id;
        DownloadableAsset downloadableAsset = this.bannerImage;
        String str2 = this.contentTitle;
        String str3 = this.contentBody;
        ContentCta contentCta = this.primaryCta;
        String str4 = this.targetTab;
        long j = this.iat;
        StringBuilder sb = new StringBuilder("CoachMarkContent(id=");
        sb.append(str);
        sb.append(", bannerImage=");
        sb.append(downloadableAsset);
        sb.append(", contentTitle=");
        a.B(sb, str2, ", contentBody=", str3, ", primaryCta=");
        sb.append(contentCta);
        sb.append(", targetTab=");
        sb.append(str4);
        sb.append(", iat=");
        return android.support.v4.media.session.a.l(j, ")", sb);
    }
}
