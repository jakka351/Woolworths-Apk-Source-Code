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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/data/UpgradePromptType;", "", "Companion", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final class UpgradePromptType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Object d;
    public static final UpgradePromptType e;
    public static final UpgradePromptType f;
    public static final UpgradePromptType g;
    public static final /* synthetic */ UpgradePromptType[] h;
    public static final /* synthetic */ EnumEntries i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/data/UpgradePromptType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/force/upgrade/data/UpgradePromptType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer<UpgradePromptType> serializer() {
            return (KSerializer) UpgradePromptType.d.getD();
        }
    }

    static {
        UpgradePromptType upgradePromptType = new UpgradePromptType("FLEXIBLE_DIALOG", 0);
        e = upgradePromptType;
        UpgradePromptType upgradePromptType2 = new UpgradePromptType("FORCED_DIALOG", 1);
        f = upgradePromptType2;
        UpgradePromptType upgradePromptType3 = new UpgradePromptType("FORCED_FULLSCREEN", 2);
        g = upgradePromptType3;
        UpgradePromptType[] upgradePromptTypeArr = {upgradePromptType, upgradePromptType2, upgradePromptType3};
        h = upgradePromptTypeArr;
        i = EnumEntriesKt.a(upgradePromptTypeArr);
        INSTANCE = new Companion();
        d = LazyKt.a(LazyThreadSafetyMode.d, new a(13));
    }

    public static UpgradePromptType valueOf(String str) {
        return (UpgradePromptType) Enum.valueOf(UpgradePromptType.class, str);
    }

    public static UpgradePromptType[] values() {
        return (UpgradePromptType[]) h.clone();
    }
}
