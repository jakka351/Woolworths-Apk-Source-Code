package me.oriient.navigation.common.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.navigation.turnByTurn.models.NavigationDirection;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0006J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lme/oriient/navigation/common/models/TurnDirection;", "", "(Ljava/lang/String;I)V", "isOppositeTo", "", "other", "isOppositeTo$service_navigation_publishRelease", "toNavigationDirection", "Lme/oriient/navigation/turnByTurn/models/NavigationDirection;", "toNavigationDirection$service_navigation_publishRelease", "RIGHT", "LEFT", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TurnDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TurnDirection[] $VALUES;
    public static final TurnDirection RIGHT = new TurnDirection("RIGHT", 0);
    public static final TurnDirection LEFT = new TurnDirection("LEFT", 1);

    private static final /* synthetic */ TurnDirection[] $values() {
        return new TurnDirection[]{RIGHT, LEFT};
    }

    static {
        TurnDirection[] turnDirectionArr$values = $values();
        $VALUES = turnDirectionArr$values;
        $ENTRIES = EnumEntriesKt.a(turnDirectionArr$values);
    }

    private TurnDirection(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TurnDirection> getEntries() {
        return $ENTRIES;
    }

    public static TurnDirection valueOf(String str) {
        return (TurnDirection) Enum.valueOf(TurnDirection.class, str);
    }

    public static TurnDirection[] values() {
        return (TurnDirection[]) $VALUES.clone();
    }

    public final boolean isOppositeTo$service_navigation_publishRelease(@NotNull TurnDirection other) {
        Intrinsics.h(other, "other");
        return this != other;
    }

    @NotNull
    public final NavigationDirection toNavigationDirection$service_navigation_publishRelease() {
        int i = k.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return NavigationDirection.TURN_RIGHT;
        }
        if (i == 2) {
            return NavigationDirection.TURN_LEFT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
