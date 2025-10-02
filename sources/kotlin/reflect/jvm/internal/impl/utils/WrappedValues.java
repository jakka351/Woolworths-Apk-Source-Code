package kotlin.reflect.jvm.internal.impl.utils;

/* loaded from: classes.dex */
public class WrappedValues {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f24653a = new AnonymousClass1();

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$1, reason: invalid class name */
    public static class AnonymousClass1 {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    public static final class ThrowableWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f24654a;

        public ThrowableWrapper(Throwable th) {
            this.f24654a = th;
        }

        public final String toString() {
            return this.f24654a.toString();
        }
    }

    /* loaded from: classes7.dex */
    public static class WrappedProcessCanceledException extends RuntimeException {
    }

    public static Object a(Throwable th) {
        return new ThrowableWrapper(th);
    }

    public static void b(Object obj) throws Throwable {
        if (obj instanceof ThrowableWrapper) {
            ExceptionUtilsKt.b(((ThrowableWrapper) obj).f24654a);
            throw null;
        }
    }
}
