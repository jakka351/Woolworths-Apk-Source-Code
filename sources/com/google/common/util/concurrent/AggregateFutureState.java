package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

@ElementTypesAreNonnullByDefault
@GwtCompatible
@ReflectionSupport
/* loaded from: classes6.dex */
abstract class AggregateFutureState<OutputT> extends AbstractFuture.TrustedFuture<OutputT> {
    public static final LazyLogger m = new LazyLogger(AggregateFutureState.class);
    public volatile Set k;
    public volatile int l;

    public static abstract class AtomicHelper {
    }

    public static final class SafeAtomicHelper extends AtomicHelper {
    }

    public static final class SynchronizedAtomicHelper extends AtomicHelper {
    }

    static {
        try {
            AtomicReferenceFieldUpdater.newUpdater(AggregateFutureState.class, Set.class, "k");
            AtomicIntegerFieldUpdater.newUpdater(AggregateFutureState.class, "l");
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (th != null) {
            m.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
