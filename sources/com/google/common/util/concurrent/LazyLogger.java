package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
final class LazyLogger {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14966a = new Object();
    public final String b;
    public volatile Logger c;

    public LazyLogger(Class cls) {
        this.b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f14966a) {
            try {
                Logger logger2 = this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
