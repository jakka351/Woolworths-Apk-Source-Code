package me.oriient.navigation.turnByTurn.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lme/oriient/navigation/turnByTurn/models/NavigationDirection;", "", "(Ljava/lang/String;I)V", "TURN_RIGHT", "TURN_LEFT", "TURN_AROUND", "TURN_AROUND_RIGHT", "TURN_AROUND_LEFT", "CONTINUE_STRAIGHT_TO_DESTINATION", "CONTINUE_STRAIGHT_TO_NEXT_TURN", "ARRIVED", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavigationDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavigationDirection[] $VALUES;
    public static final NavigationDirection TURN_RIGHT = new NavigationDirection("TURN_RIGHT", 0);
    public static final NavigationDirection TURN_LEFT = new NavigationDirection("TURN_LEFT", 1);
    public static final NavigationDirection TURN_AROUND = new NavigationDirection("TURN_AROUND", 2);
    public static final NavigationDirection TURN_AROUND_RIGHT = new NavigationDirection("TURN_AROUND_RIGHT", 3);
    public static final NavigationDirection TURN_AROUND_LEFT = new NavigationDirection("TURN_AROUND_LEFT", 4);
    public static final NavigationDirection CONTINUE_STRAIGHT_TO_DESTINATION = new NavigationDirection("CONTINUE_STRAIGHT_TO_DESTINATION", 5);
    public static final NavigationDirection CONTINUE_STRAIGHT_TO_NEXT_TURN = new NavigationDirection("CONTINUE_STRAIGHT_TO_NEXT_TURN", 6);
    public static final NavigationDirection ARRIVED = new NavigationDirection("ARRIVED", 7);

    private static final /* synthetic */ NavigationDirection[] $values() {
        return new NavigationDirection[]{TURN_RIGHT, TURN_LEFT, TURN_AROUND, TURN_AROUND_RIGHT, TURN_AROUND_LEFT, CONTINUE_STRAIGHT_TO_DESTINATION, CONTINUE_STRAIGHT_TO_NEXT_TURN, ARRIVED};
    }

    static {
        NavigationDirection[] navigationDirectionArr$values = $values();
        $VALUES = navigationDirectionArr$values;
        $ENTRIES = EnumEntriesKt.a(navigationDirectionArr$values);
    }

    private NavigationDirection(String str, int i) {
    }

    @NotNull
    public static EnumEntries<NavigationDirection> getEntries() {
        return $ENTRIES;
    }

    public static NavigationDirection valueOf(String str) {
        return (NavigationDirection) Enum.valueOf(NavigationDirection.class, str);
    }

    public static NavigationDirection[] values() {
        return (NavigationDirection[]) $VALUES.clone();
    }
}
