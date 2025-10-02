package au.com.woolworths.foundation.force.upgrade.data;

import au.com.woolworths.feature.shop.bundles.ui.a;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/data/UpgradeType;", "", "Companion", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final class UpgradeType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Object d;
    public static final UpgradeType e;
    public static final UpgradeType f;
    public static final /* synthetic */ UpgradeType[] g;
    public static final /* synthetic */ EnumEntries h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/data/UpgradeType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/force/upgrade/data/UpgradeType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer<UpgradeType> serializer() {
            return (KSerializer) UpgradeType.d.getD();
        }
    }

    static {
        UpgradeType upgradeType = new UpgradeType("APP", 0);
        e = upgradeType;
        UpgradeType upgradeType2 = new UpgradeType("OS", 1);
        f = upgradeType2;
        UpgradeType[] upgradeTypeArr = {upgradeType, upgradeType2};
        g = upgradeTypeArr;
        h = EnumEntriesKt.a(upgradeTypeArr);
        INSTANCE = new Companion();
        d = LazyKt.a(LazyThreadSafetyMode.d, new a(14));
    }

    public static UpgradeType valueOf(String str) {
        return (UpgradeType) Enum.valueOf(UpgradeType.class, str);
    }

    public static UpgradeType[] values() {
        return (UpgradeType[]) g.clone();
    }
}
