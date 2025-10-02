package io.reactivex.internal.util;

import androidx.camera.core.impl.b;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ExceptionHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final Throwable f24240a = new Termination("No further exceptions");

    public static final class Termination extends Throwable {
        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public static boolean a(AtomicReference atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == f24240a) {
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            while (!atomicReference.compareAndSet(th2, compositeException)) {
                if (atomicReference.get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    public static Throwable b(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f24240a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    public static String c(long j, TimeUnit timeUnit) {
        StringBuilder sbT = b.t(j, "The source did not signal an event for ", " ");
        sbT.append(timeUnit.toString().toLowerCase());
        sbT.append(" and has been terminated.");
        return sbT.toString();
    }

    public static RuntimeException d(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
