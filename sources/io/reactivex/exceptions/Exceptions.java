package io.reactivex.exceptions;

import io.reactivex.internal.util.ExceptionHelper;

/* loaded from: classes7.dex */
public final class Exceptions {
    public static void a(Throwable th) {
        throw ExceptionHelper.d(th);
    }

    public static void b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
