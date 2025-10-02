package au.com.woolworths.foundation.force.upgrade.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/data/SoftUpgradeAlertBanner;", "", "Companion", "$serializer", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class SoftUpgradeAlertBanner {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8499a;
    public final UpgradeConfig b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/data/SoftUpgradeAlertBanner$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/force/upgrade/data/SoftUpgradeAlertBanner;", "serializer", "()Lkotlinx/serialization/KSerializer;", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        @NotNull
        public final KSerializer<SoftUpgradeAlertBanner> serializer() {
            return SoftUpgradeAlertBanner$$serializer.f8500a;
        }
    }

    public /* synthetic */ SoftUpgradeAlertBanner(int i, boolean z, UpgradeConfig upgradeConfig) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, SoftUpgradeAlertBanner$$serializer.f8500a.getDescriptor());
            throw null;
        }
        this.f8499a = z;
        this.b = upgradeConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftUpgradeAlertBanner)) {
            return false;
        }
        SoftUpgradeAlertBanner softUpgradeAlertBanner = (SoftUpgradeAlertBanner) obj;
        return this.f8499a == softUpgradeAlertBanner.f8499a && Intrinsics.c(this.b, softUpgradeAlertBanner.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f8499a) * 31);
    }

    public final String toString() {
        return "SoftUpgradeAlertBanner(isSeen=" + this.f8499a + ", config=" + this.b + ")";
    }

    public SoftUpgradeAlertBanner(boolean z, UpgradeConfig config) {
        Intrinsics.h(config, "config");
        this.f8499a = z;
        this.b = config;
    }
}
