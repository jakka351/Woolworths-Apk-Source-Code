package au.com.woolworths.android.onesite.modules.rewards.data;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLiteCardData;", "", "Companion", "$serializer", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class RewardsLiteCardData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f4396a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLiteCardData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLiteCardData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RewardsLiteCardData> serializer() {
            return RewardsLiteCardData$$serializer.f4397a;
        }
    }

    public /* synthetic */ RewardsLiteCardData(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        if (59 != (i & 59)) {
            PluginExceptionsKt.a(i, 59, RewardsLiteCardData$$serializer.f4397a.getB());
            throw null;
        }
        this.f4396a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    /* renamed from: a, reason: from getter */
    public final String getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsLiteCardData)) {
            return false;
        }
        RewardsLiteCardData rewardsLiteCardData = (RewardsLiteCardData) obj;
        return Intrinsics.c(this.f4396a, rewardsLiteCardData.f4396a) && Intrinsics.c(this.b, rewardsLiteCardData.b) && Intrinsics.c(this.c, rewardsLiteCardData.c) && Intrinsics.c(this.d, rewardsLiteCardData.d) && Intrinsics.c(this.e, rewardsLiteCardData.e) && Intrinsics.c(this.f, rewardsLiteCardData.f);
    }

    public final int hashCode() {
        int iC = b.c(this.f4396a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + b.c(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbV = a.v("RewardsLiteCardData(created=", this.f4396a, ", expires=", this.b, ", campaignID=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", cardNumber=", this.d, ", displayCardNumber=");
        return androidx.constraintlayout.core.state.a.l(sbV, this.e, ", registerID=", this.f, ")");
    }
}
