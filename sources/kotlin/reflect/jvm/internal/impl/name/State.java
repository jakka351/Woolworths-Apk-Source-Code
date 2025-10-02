package kotlin.reflect.jvm.internal.impl.name;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
final class State {
    public static final State d;
    public static final State e;
    public static final State f;
    public static final /* synthetic */ State[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        State state = new State("BEGINNING", 0);
        d = state;
        State state2 = new State("MIDDLE", 1);
        e = state2;
        State state3 = new State("AFTER_DOT", 2);
        f = state3;
        State[] stateArr = {state, state2, state3};
        g = stateArr;
        h = EnumEntriesKt.a(stateArr);
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) g.clone();
    }
}
