package me.oriient.navigation.turnByTurn.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/navigation/turnByTurn/models/TurnAroundState;", "", "(Ljava/lang/String;I)V", "NO_TURN_AROUND", "TURN_AROUND", "TURN_RIGHT", "TURN_LEFT", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TurnAroundState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TurnAroundState[] $VALUES;
    public static final TurnAroundState NO_TURN_AROUND = new TurnAroundState("NO_TURN_AROUND", 0);
    public static final TurnAroundState TURN_AROUND = new TurnAroundState("TURN_AROUND", 1);
    public static final TurnAroundState TURN_RIGHT = new TurnAroundState("TURN_RIGHT", 2);
    public static final TurnAroundState TURN_LEFT = new TurnAroundState("TURN_LEFT", 3);

    private static final /* synthetic */ TurnAroundState[] $values() {
        return new TurnAroundState[]{NO_TURN_AROUND, TURN_AROUND, TURN_RIGHT, TURN_LEFT};
    }

    static {
        TurnAroundState[] turnAroundStateArr$values = $values();
        $VALUES = turnAroundStateArr$values;
        $ENTRIES = EnumEntriesKt.a(turnAroundStateArr$values);
    }

    private TurnAroundState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TurnAroundState> getEntries() {
        return $ENTRIES;
    }

    public static TurnAroundState valueOf(String str) {
        return (TurnAroundState) Enum.valueOf(TurnAroundState.class, str);
    }

    public static TurnAroundState[] values() {
        return (TurnAroundState[]) $VALUES.clone();
    }
}
