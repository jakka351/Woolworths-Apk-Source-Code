package androidx.camera.video.internal;

import androidx.camera.core.impl.Observable;

/* loaded from: classes2.dex */
public interface BufferProvider<T> extends Observable<State> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final /* synthetic */ State[] f;

        static {
            State state = new State("ACTIVE", 0);
            d = state;
            State state2 = new State("INACTIVE", 1);
            e = state2;
            f = new State[]{state, state2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f.clone();
        }
    }
}
