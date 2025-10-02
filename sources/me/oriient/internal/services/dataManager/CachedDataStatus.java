package me.oriient.internal.services.dataManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/CachedDataStatus;", "", "(Ljava/lang/String;I)V", "VALID", "REFRESH_RECOMMENDED", "INVALID", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CachedDataStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CachedDataStatus[] $VALUES;
    public static final CachedDataStatus VALID = new CachedDataStatus("VALID", 0);
    public static final CachedDataStatus REFRESH_RECOMMENDED = new CachedDataStatus("REFRESH_RECOMMENDED", 1);
    public static final CachedDataStatus INVALID = new CachedDataStatus("INVALID", 2);

    private static final /* synthetic */ CachedDataStatus[] $values() {
        return new CachedDataStatus[]{VALID, REFRESH_RECOMMENDED, INVALID};
    }

    static {
        CachedDataStatus[] cachedDataStatusArr$values = $values();
        $VALUES = cachedDataStatusArr$values;
        $ENTRIES = EnumEntriesKt.a(cachedDataStatusArr$values);
    }

    private CachedDataStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CachedDataStatus> getEntries() {
        return $ENTRIES;
    }

    public static CachedDataStatus valueOf(String str) {
        return (CachedDataStatus) Enum.valueOf(CachedDataStatus.class, str);
    }

    public static CachedDataStatus[] values() {
        return (CachedDataStatus[]) $VALUES.clone();
    }
}
