package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class AbstractIterator<T> implements Iterator<T> {
    public State d;
    public Object e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final /* synthetic */ State[] h;

        static {
            State state = new State("READY", 0);
            d = state;
            State state2 = new State("NOT_READY", 1);
            e = state2;
            State state3 = new State("DONE", 2);
            f = state3;
            State state4 = new State("FAILED", 3);
            g = state4;
            h = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) h.clone();
        }
    }

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        State state = this.d;
        State state2 = State.g;
        Preconditions.r(state != state2);
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.d = state2;
            this.e = a();
            if (this.d != State.f) {
                this.d = State.d;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.d = State.e;
        Object obj = this.e;
        this.e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
