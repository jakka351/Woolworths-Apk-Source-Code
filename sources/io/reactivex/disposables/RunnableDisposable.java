package io.reactivex.disposables;

/* loaded from: classes7.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    @Override // io.reactivex.disposables.ReferenceDisposable
    public final void a(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + b() + ", " + get() + ")";
    }
}
