package au.com.woolworths.foundation.rewards.onboarding;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;", "", "Companion", "$serializer", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class ProgressiveCoachMarkContent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f8632a;
    public final String b;
    public final DownloadableAsset c;
    public final String d;
    public final String e;
    public final ContentCta f;
    public final ContentCta g;
    public final String h;
    public String i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ProgressiveCoachMarkContent> serializer() {
            return ProgressiveCoachMarkContent$$serializer.f8633a;
        }
    }

    public /* synthetic */ ProgressiveCoachMarkContent(int i, String str, String str2, DownloadableAsset downloadableAsset, String str3, String str4, ContentCta contentCta, ContentCta contentCta2, String str5) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.a(i, 127, ProgressiveCoachMarkContent$$serializer.f8633a.getB());
            throw null;
        }
        this.f8632a = str;
        this.b = str2;
        this.c = downloadableAsset;
        this.d = str3;
        this.e = str4;
        this.f = contentCta;
        this.g = contentCta2;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        this.i = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressiveCoachMarkContent)) {
            return false;
        }
        ProgressiveCoachMarkContent progressiveCoachMarkContent = (ProgressiveCoachMarkContent) obj;
        return Intrinsics.c(this.f8632a, progressiveCoachMarkContent.f8632a) && Intrinsics.c(this.b, progressiveCoachMarkContent.b) && Intrinsics.c(this.c, progressiveCoachMarkContent.c) && Intrinsics.c(this.d, progressiveCoachMarkContent.d) && Intrinsics.c(this.e, progressiveCoachMarkContent.e) && Intrinsics.c(this.f, progressiveCoachMarkContent.f) && Intrinsics.c(this.g, progressiveCoachMarkContent.g) && Intrinsics.c(this.h, progressiveCoachMarkContent.h) && Intrinsics.c(this.i, progressiveCoachMarkContent.i);
    }

    public final int hashCode() {
        int iC = b.c(this.f8632a.hashCode() * 31, 31, this.b);
        DownloadableAsset downloadableAsset = this.c;
        int iC2 = b.c(b.c((iC + (downloadableAsset == null ? 0 : downloadableAsset.hashCode())) * 31, 31, this.d), 31, this.e);
        ContentCta contentCta = this.f;
        int iHashCode = (iC2 + (contentCta == null ? 0 : contentCta.hashCode())) * 31;
        ContentCta contentCta2 = this.g;
        int iHashCode2 = (iHashCode + (contentCta2 == null ? 0 : contentCta2.hashCode())) * 31;
        String str = this.h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.i;
        StringBuilder sbV = a.v("ProgressiveCoachMarkContent(pageId=", this.f8632a, ", elementId=", this.b, ", bannerImage=");
        sbV.append(this.c);
        sbV.append(", contentTitle=");
        sbV.append(this.d);
        sbV.append(", contentBody=");
        sbV.append(this.e);
        sbV.append(", leftCta=");
        sbV.append(this.f);
        sbV.append(", rightCta=");
        sbV.append(this.g);
        sbV.append(", coachMarkId=");
        sbV.append(this.h);
        sbV.append(", textBetweenCtas=");
        return a.o(sbV, str, ")");
    }
}
