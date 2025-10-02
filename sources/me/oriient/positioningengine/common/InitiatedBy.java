package me.oriient.positioningengine.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/common/InitiatedBy;", "", "(Ljava/lang/String;I)V", "CLIENT", "AUTO_START", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InitiatedBy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InitiatedBy[] $VALUES;
    public static final InitiatedBy CLIENT = new InitiatedBy("CLIENT", 0);
    public static final InitiatedBy AUTO_START = new InitiatedBy("AUTO_START", 1);

    private static final /* synthetic */ InitiatedBy[] $values() {
        return new InitiatedBy[]{CLIENT, AUTO_START};
    }

    static {
        InitiatedBy[] initiatedByArr$values = $values();
        $VALUES = initiatedByArr$values;
        $ENTRIES = EnumEntriesKt.a(initiatedByArr$values);
    }

    private InitiatedBy(String str, int i) {
    }

    @NotNull
    public static EnumEntries<InitiatedBy> getEntries() {
        return $ENTRIES;
    }

    public static InitiatedBy valueOf(String str) {
        return (InitiatedBy) Enum.valueOf(InitiatedBy.class, str);
    }

    public static InitiatedBy[] values() {
        return (InitiatedBy[]) $VALUES.clone();
    }
}
