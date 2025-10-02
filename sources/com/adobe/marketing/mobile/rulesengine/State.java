package com.adobe.marketing.mobile.rulesengine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class State {
    public static final State d;
    public static final State e;
    public static final State f;
    public static final /* synthetic */ State[] g;

    static {
        State state = new State("START", 0);
        d = state;
        State state2 = new State("TEXT", 1);
        e = state2;
        State state3 = new State("TAG", 2);
        f = state3;
        g = new State[]{state, state2, state3};
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) g.clone();
    }
}
