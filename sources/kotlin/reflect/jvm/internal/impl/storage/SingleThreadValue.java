package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes7.dex */
class SingleThreadValue<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24598a;
    public final Thread b = Thread.currentThread();

    public SingleThreadValue(Object obj) {
        this.f24598a = obj;
    }

    public final Object a() {
        if (b()) {
            return this.f24598a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public final boolean b() {
        return this.b == Thread.currentThread();
    }
}
