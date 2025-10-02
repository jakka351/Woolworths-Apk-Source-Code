package io.grpc;

import io.grpc.Context;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
final class ThreadLocalContextStorage extends Context.Storage {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f23974a = Logger.getLogger(ThreadLocalContextStorage.class.getName());
    public static final ThreadLocal b = new ThreadLocal();

    @Override // io.grpc.Context.Storage
    public final Context a() {
        Context context = (Context) b.get();
        return context == null ? Context.g : context;
    }

    @Override // io.grpc.Context.Storage
    public final void b(Context context, Context context2) {
        if (a() != context) {
            f23974a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        Context context3 = Context.g;
        ThreadLocal threadLocal = b;
        if (context2 != context3) {
            threadLocal.set(context2);
        } else {
            threadLocal.set(null);
        }
    }

    @Override // io.grpc.Context.Storage
    public final Context c(Context context) {
        Context contextA = a();
        b.set(context);
        return contextA;
    }
}
