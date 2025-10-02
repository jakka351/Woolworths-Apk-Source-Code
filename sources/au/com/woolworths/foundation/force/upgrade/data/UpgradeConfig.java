package au.com.woolworths.foundation.force.upgrade.data;

import au.com.woolworths.feature.shop.bundles.ui.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/data/UpgradeConfig;", "", "Companion", "$serializer", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class UpgradeConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* renamed from: a, reason: collision with root package name */
    public final UpgradeType f8501a;
    public final UpgradePromptType b;
    public final UpgradePrompt c;
    public final String d;
    public final String e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/data/UpgradeConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/force/upgrade/data/UpgradeConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<UpgradeConfig> serializer() {
            return UpgradeConfig$$serializer.f8502a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        f = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new a(11)), LazyKt.a(lazyThreadSafetyMode, new a(12)), null, null, null};
    }

    public /* synthetic */ UpgradeConfig(int i, UpgradeType upgradeType, UpgradePromptType upgradePromptType, UpgradePrompt upgradePrompt, String str, String str2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, UpgradeConfig$$serializer.f8502a.getDescriptor());
            throw null;
        }
        this.f8501a = upgradeType;
        this.b = upgradePromptType;
        this.c = upgradePrompt;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final UpgradePrompt getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final UpgradePromptType getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final UpgradeType getF8501a() {
        return this.f8501a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpgradeConfig)) {
            return false;
        }
        UpgradeConfig upgradeConfig = (UpgradeConfig) obj;
        return this.f8501a == upgradeConfig.f8501a && this.b == upgradeConfig.b && Intrinsics.c(this.c, upgradeConfig.c) && Intrinsics.c(this.d, upgradeConfig.d) && Intrinsics.c(this.e, upgradeConfig.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f8501a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpgradeConfig(type=");
        sb.append(this.f8501a);
        sb.append(", promptType=");
        sb.append(this.b);
        sb.append(", prompt=");
        sb.append(this.c);
        sb.append(", bffDetails=");
        sb.append(this.d);
        sb.append(", detectedRegion=");
        return YU.a.o(sb, this.e, ")");
    }

    public UpgradeConfig(UpgradeType upgradeType, UpgradePromptType upgradePromptType, UpgradePrompt upgradePrompt, String str) {
        this.f8501a = upgradeType;
        this.b = upgradePromptType;
        this.c = upgradePrompt;
        this.d = str;
        this.e = null;
    }
}
