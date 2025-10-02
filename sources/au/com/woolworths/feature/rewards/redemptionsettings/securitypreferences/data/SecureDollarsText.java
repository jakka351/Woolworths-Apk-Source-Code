package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/data/SecureDollarsText;", "", "Companion", "$serializer", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class SecureDollarsText {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f6469a;
    public final String b;
    public final String c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/data/SecureDollarsText$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/data/SecureDollarsText;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SecureDollarsText> serializer() {
            return SecureDollarsText$$serializer.f6470a;
        }
    }

    public /* synthetic */ SecureDollarsText(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f6469a = "";
        } else {
            this.f6469a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureDollarsText)) {
            return false;
        }
        SecureDollarsText secureDollarsText = (SecureDollarsText) obj;
        return Intrinsics.c(this.f6469a, secureDollarsText.f6469a) && Intrinsics.c(this.b, secureDollarsText.b) && Intrinsics.c(this.c, secureDollarsText.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f6469a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.o(a.v("SecureDollarsText(loading=", this.f6469a, ", error=", this.b, ", success="), this.c, ")");
    }

    public SecureDollarsText(String str, String str2, String str3) {
        this.f6469a = str;
        this.b = str2;
        this.c = str3;
    }
}
