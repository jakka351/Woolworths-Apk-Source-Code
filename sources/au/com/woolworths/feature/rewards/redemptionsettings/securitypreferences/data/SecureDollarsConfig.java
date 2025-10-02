package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/data/SecureDollarsConfig;", "", "Companion", "$serializer", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class SecureDollarsConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final SecureDollarsText f6467a;
    public final SecureDollarsText b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/data/SecureDollarsConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/data/SecureDollarsConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<SecureDollarsConfig> serializer() {
            return SecureDollarsConfig$$serializer.f6468a;
        }
    }

    public /* synthetic */ SecureDollarsConfig(int i, SecureDollarsText secureDollarsText, SecureDollarsText secureDollarsText2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, SecureDollarsConfig$$serializer.f6468a.getDescriptor());
            throw null;
        }
        this.f6467a = secureDollarsText;
        this.b = secureDollarsText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureDollarsConfig)) {
            return false;
        }
        SecureDollarsConfig secureDollarsConfig = (SecureDollarsConfig) obj;
        return Intrinsics.c(this.f6467a, secureDollarsConfig.f6467a) && Intrinsics.c(this.b, secureDollarsConfig.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6467a.hashCode() * 31);
    }

    public final String toString() {
        return "SecureDollarsConfig(lock=" + this.f6467a + ", unlock=" + this.b + ")";
    }

    public SecureDollarsConfig(SecureDollarsText secureDollarsText, SecureDollarsText secureDollarsText2) {
        this.f6467a = secureDollarsText;
        this.b = secureDollarsText2;
    }
}
