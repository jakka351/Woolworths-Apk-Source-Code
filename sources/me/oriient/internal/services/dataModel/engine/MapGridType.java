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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/MapGridType;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "PUBLIC", "LATEST", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapGridType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MapGridType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String rawValue;
    public static final MapGridType PUBLIC = new MapGridType("PUBLIC", 0, "public");
    public static final MapGridType LATEST = new MapGridType("LATEST", 1, "latest");

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/dataModel/engine/MapGridType$Companion;", "", "()V", "from", "Lme/oriient/internal/services/dataModel/engine/MapGridType;", "rawValue", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final MapGridType from(@Nullable String rawValue) {
            MapGridType mapGridType = MapGridType.PUBLIC;
            if (Intrinsics.c(rawValue, mapGridType.getRawValue())) {
                return mapGridType;
            }
            MapGridType mapGridType2 = MapGridType.LATEST;
            if (Intrinsics.c(rawValue, mapGridType2.getRawValue())) {
                return mapGridType2;
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MapGridType[] $values() {
        return new MapGridType[]{PUBLIC, LATEST};
    }

    static {
        MapGridType[] mapGridTypeArr$values = $values();
        $VALUES = mapGridTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(mapGridTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private MapGridType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static EnumEntries<MapGridType> getEntries() {
        return $ENTRIES;
    }

    public static MapGridType valueOf(String str) {
        return (MapGridType) Enum.valueOf(MapGridType.class, str);
    }

    public static MapGridType[] values() {
        return (MapGridType[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
