package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lme/oriient/navigation/common/models/FloorTransitionType;", "", "(Ljava/lang/String;I)V", "STAIRS", "ELEVATOR", "ESCALATOR", "RAMP", "UNKNOWN", "Companion", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final class FloorTransitionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FloorTransitionType[] $VALUES;

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final FloorTransitionType STAIRS = new FloorTransitionType("STAIRS", 0);
    public static final FloorTransitionType ELEVATOR = new FloorTransitionType("ELEVATOR", 1);
    public static final FloorTransitionType ESCALATOR = new FloorTransitionType("ESCALATOR", 2);
    public static final FloorTransitionType RAMP = new FloorTransitionType("RAMP", 3);
    public static final FloorTransitionType UNKNOWN = new FloorTransitionType("UNKNOWN", 4);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/navigation/common/models/FloorTransitionType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/navigation/common/models/FloorTransitionType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FloorTransitionType> serializer() {
            return (KSerializer) FloorTransitionType.$cachedSerializer$delegate.getD();
        }
    }

    private static final /* synthetic */ FloorTransitionType[] $values() {
        return new FloorTransitionType[]{STAIRS, ELEVATOR, ESCALATOR, RAMP, UNKNOWN};
    }

    static {
        FloorTransitionType[] floorTransitionTypeArr$values = $values();
        $VALUES = floorTransitionTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(floorTransitionTypeArr$values);
        INSTANCE = new Companion();
        $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.d, new Function0() { // from class: me.oriient.navigation.common.models.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EnumsKt.b(FloorTransitionType.values(), "me.oriient.navigation.common.models.FloorTransitionType");
            }
        });
    }

    private FloorTransitionType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<FloorTransitionType> getEntries() {
        return $ENTRIES;
    }

    public static FloorTransitionType valueOf(String str) {
        return (FloorTransitionType) Enum.valueOf(FloorTransitionType.class, str);
    }

    public static FloorTransitionType[] values() {
        return (FloorTransitionType[]) $VALUES.clone();
    }
}
