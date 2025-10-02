package au.com.woolworths.foundation.rewards.onboarding;

import androidx.camera.core.impl.b;
import au.com.woolworths.feature.shop.bundles.ui.a;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/CoachMarkBanner;", "", "Companion", "$serializer", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes4.dex */
public final /* data */ class CoachMarkBanner {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.d, new a(19)), null, null, null, null};
    public static final CoachMarkBanner m = new CoachMarkBanner("home_onboarding", "MOB-XXX", "", "Learn how to earn Rewards", "Explore", "Continue", EmptyList.d, false, false, "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f8630a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/CoachMarkBanner$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/rewards/onboarding/CoachMarkBanner;", "serializer", "()Lkotlinx/serialization/KSerializer;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<CoachMarkBanner> serializer() {
            return CoachMarkBanner$$serializer.f8631a;
        }
    }

    public CoachMarkBanner(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2, String str7, boolean z3) {
        if (125 != (i & 125)) {
            PluginExceptionsKt.a(i, 125, CoachMarkBanner$$serializer.f8631a.getB());
            throw null;
        }
        this.f8630a = str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
        int i2 = 0;
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z2;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str7;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z3;
        }
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            ProgressiveCoachMarkContent progressiveCoachMarkContent = (ProgressiveCoachMarkContent) obj;
            progressiveCoachMarkContent.i = this.g.size() > 1 ? i3 + " of " + this.g.size() : null;
            i2 = i3;
        }
    }

    public static CoachMarkBanner a(CoachMarkBanner coachMarkBanner, boolean z, boolean z2, String str, int i) {
        String bannerId = coachMarkBanner.f8630a;
        String campaignId = coachMarkBanner.b;
        String iconUrl = coachMarkBanner.c;
        String title = coachMarkBanner.d;
        String initialActionLabel = coachMarkBanner.e;
        String str2 = coachMarkBanner.f;
        List coachMarks = coachMarkBanner.g;
        if ((i & 256) != 0) {
            z2 = coachMarkBanner.i;
        }
        boolean z3 = z2;
        if ((i & 512) != 0) {
            str = coachMarkBanner.j;
        }
        String lastElementId = str;
        boolean z4 = coachMarkBanner.k;
        coachMarkBanner.getClass();
        Intrinsics.h(bannerId, "bannerId");
        Intrinsics.h(campaignId, "campaignId");
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(initialActionLabel, "initialActionLabel");
        Intrinsics.h(coachMarks, "coachMarks");
        Intrinsics.h(lastElementId, "lastElementId");
        return new CoachMarkBanner(bannerId, campaignId, iconUrl, title, initialActionLabel, str2, coachMarks, z, z3, lastElementId, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoachMarkBanner)) {
            return false;
        }
        CoachMarkBanner coachMarkBanner = (CoachMarkBanner) obj;
        return Intrinsics.c(this.f8630a, coachMarkBanner.f8630a) && Intrinsics.c(this.b, coachMarkBanner.b) && Intrinsics.c(this.c, coachMarkBanner.c) && Intrinsics.c(this.d, coachMarkBanner.d) && Intrinsics.c(this.e, coachMarkBanner.e) && Intrinsics.c(this.f, coachMarkBanner.f) && Intrinsics.c(this.g, coachMarkBanner.g) && this.h == coachMarkBanner.h && this.i == coachMarkBanner.i && Intrinsics.c(this.j, coachMarkBanner.j) && this.k == coachMarkBanner.k;
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(b.c(this.f8630a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.k) + b.c(b.e(b.e(b.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("CoachMarkBanner(bannerId=", this.f8630a, ", campaignId=", this.b, ", iconUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", title=", this.d, ", initialActionLabel=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", continueActionLabel=", this.f, ", coachMarks=");
        sbV.append(this.g);
        sbV.append(", completed=");
        sbV.append(this.h);
        sbV.append(", completedReported=");
        au.com.woolworths.android.onesite.a.y(", lastElementId=", this.j, ", oneOff=", sbV, this.i);
        return YU.a.k(")", sbV, this.k);
    }

    public CoachMarkBanner(String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2, String str7, boolean z3) {
        this.f8630a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
        this.h = z;
        this.i = z2;
        this.j = str7;
        this.k = z3;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            String str8 = null;
            if (i >= 0) {
                ProgressiveCoachMarkContent progressiveCoachMarkContent = (ProgressiveCoachMarkContent) obj;
                if (this.g.size() > 1) {
                    str8 = i2 + " of " + this.g.size();
                }
                progressiveCoachMarkContent.i = str8;
                i = i2;
            } else {
                CollectionsKt.z0();
                throw null;
            }
        }
    }
}
