package me.oriient.internal.infra.scheduler;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/infra/scheduler/ExistingWorkPolicy;", "", "(Ljava/lang/String;I)V", "KEEP_EXISTING_AND_DO_NOTHING", "REPLACE", "APPEND", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExistingWorkPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExistingWorkPolicy[] $VALUES;
    public static final ExistingWorkPolicy KEEP_EXISTING_AND_DO_NOTHING = new ExistingWorkPolicy("KEEP_EXISTING_AND_DO_NOTHING", 0);
    public static final ExistingWorkPolicy REPLACE = new ExistingWorkPolicy("REPLACE", 1);
    public static final ExistingWorkPolicy APPEND = new ExistingWorkPolicy("APPEND", 2);

    private static final /* synthetic */ ExistingWorkPolicy[] $values() {
        return new ExistingWorkPolicy[]{KEEP_EXISTING_AND_DO_NOTHING, REPLACE, APPEND};
    }

    static {
        ExistingWorkPolicy[] existingWorkPolicyArr$values = $values();
        $VALUES = existingWorkPolicyArr$values;
        $ENTRIES = EnumEntriesKt.a(existingWorkPolicyArr$values);
    }

    private ExistingWorkPolicy(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ExistingWorkPolicy> getEntries() {
        return $ENTRIES;
    }

    public static ExistingWorkPolicy valueOf(String str) {
        return (ExistingWorkPolicy) Enum.valueOf(ExistingWorkPolicy.class, str);
    }

    public static ExistingWorkPolicy[] values() {
        return (ExistingWorkPolicy[]) $VALUES.clone();
    }
}
