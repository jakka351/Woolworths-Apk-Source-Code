package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
/* loaded from: classes6.dex */
final class ListenerCallQueue<L> {

    public interface Event<L> {
    }

    public static final class PerListenerQueue<L> implements Runnable {
        public boolean d;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                synchronized (this) {
                    Preconditions.r(this.d);
                    throw null;
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.d = false;
                    throw th;
                }
            }
        }
    }

    static {
        new LazyLogger(ListenerCallQueue.class);
    }
}
