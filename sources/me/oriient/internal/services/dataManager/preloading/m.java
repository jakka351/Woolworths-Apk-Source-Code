package me.oriient.internal.services.dataManager.preloading;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m NOT_STARTED = new m("NOT_STARTED", 0);
    public static final m IN_PROGRESS = new m("IN_PROGRESS", 1);
    public static final m DONE = new m("DONE", 2);
    public static final m FAILED = new m("FAILED", 3);

    private static final /* synthetic */ m[] $values() {
        return new m[]{NOT_STARTED, IN_PROGRESS, DONE, FAILED};
    }

    static {
        m[] mVarArr$values = $values();
        $VALUES = mVarArr$values;
        $ENTRIES = EnumEntriesKt.a(mVarArr$values);
    }

    private m(String str, int i) {
    }

    @NotNull
    public static EnumEntries<m> getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    @NotNull
    public final DataPreloadingManager.PreloadingStatus toPreloadingStatus() {
        int i = l.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return DataPreloadingManager.PreloadingStatus.NOT_PRELOADED;
        }
        if (i == 3) {
            return DataPreloadingManager.PreloadingStatus.IN_PROGRESS;
        }
        if (i == 4) {
            return DataPreloadingManager.PreloadingStatus.READY;
        }
        throw new NoWhenBranchMatchedException();
    }
}
