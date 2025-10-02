package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Stream.StreamCallback;
import io.grpc.Status;

/* loaded from: classes6.dex */
public interface Stream<CallbackType extends StreamCallback> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final State h;
        public static final State i;
        public static final /* synthetic */ State[] j;

        static {
            State state = new State("Initial", 0);
            d = state;
            State state2 = new State("Starting", 1);
            e = state2;
            State state3 = new State("Open", 2);
            f = state3;
            State state4 = new State("Healthy", 3);
            g = state4;
            State state5 = new State("Error", 4);
            h = state5;
            State state6 = new State("Backoff", 5);
            i = state6;
            j = new State[]{state, state2, state3, state4, state5, state6};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) j.clone();
        }
    }

    public interface StreamCallback {
        void c(Status status);

        void e();
    }
}
