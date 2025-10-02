package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes6.dex */
final class CurrentParsingState {

    /* renamed from: a, reason: collision with root package name */
    public int f16192a;
    public State b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final /* synthetic */ State[] g;

        static {
            State state = new State("NUMERIC", 0);
            d = state;
            State state2 = new State("ALPHA", 1);
            e = state2;
            State state3 = new State("ISO_IEC_646", 2);
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
}
