package me.oriient.internal.services.dataModel.engine;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "ALWAYS_ENFORCE", "ENFORCE_MAJOR", "NEVER_ENFORCE", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapGridFetchingStrategy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MapGridFetchingStrategy[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String rawValue;
    public static final MapGridFetchingStrategy ALWAYS_ENFORCE = new MapGridFetchingStrategy("ALWAYS_ENFORCE", 0, "alwaysEnforce");
    public static final MapGridFetchingStrategy ENFORCE_MAJOR = new MapGridFetchingStrategy("ENFORCE_MAJOR", 1, "enforceMajor");
    public static final MapGridFetchingStrategy NEVER_ENFORCE = new MapGridFetchingStrategy("NEVER_ENFORCE", 2, "neverEnforce");

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy$Companion;", "", "()V", "from", "Lme/oriient/internal/services/dataModel/engine/MapGridFetchingStrategy;", "rawValue", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final MapGridFetchingStrategy from(@Nullable String rawValue) {
            MapGridFetchingStrategy mapGridFetchingStrategy = MapGridFetchingStrategy.ALWAYS_ENFORCE;
            if (Intrinsics.c(rawValue, mapGridFetchingStrategy.getRawValue())) {
                return mapGridFetchingStrategy;
            }
            MapGridFetchingStrategy mapGridFetchingStrategy2 = MapGridFetchingStrategy.ENFORCE_MAJOR;
            if (Intrinsics.c(rawValue, mapGridFetchingStrategy2.getRawValue())) {
                return mapGridFetchingStrategy2;
            }
            MapGridFetchingStrategy mapGridFetchingStrategy3 = MapGridFetchingStrategy.NEVER_ENFORCE;
            if (Intrinsics.c(rawValue, mapGridFetchingStrategy3.getRawValue())) {
                return mapGridFetchingStrategy3;
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MapGridFetchingStrategy[] $values() {
        return new MapGridFetchingStrategy[]{ALWAYS_ENFORCE, ENFORCE_MAJOR, NEVER_ENFORCE};
    }

    static {
        MapGridFetchingStrategy[] mapGridFetchingStrategyArr$values = $values();
        $VALUES = mapGridFetchingStrategyArr$values;
        $ENTRIES = EnumEntriesKt.a(mapGridFetchingStrategyArr$values);
        INSTANCE = new Companion(null);
    }

    private MapGridFetchingStrategy(String str, int i, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static EnumEntries<MapGridFetchingStrategy> getEntries() {
        return $ENTRIES;
    }

    public static MapGridFetchingStrategy valueOf(String str) {
        return (MapGridFetchingStrategy) Enum.valueOf(MapGridFetchingStrategy.class, str);
    }

    public static MapGridFetchingStrategy[] values() {
        return (MapGridFetchingStrategy[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
