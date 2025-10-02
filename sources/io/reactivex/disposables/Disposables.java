package io.reactivex.disposables;

import io.reactivex.functions.Action;

/* loaded from: classes7.dex */
public final class Disposables {
    public static Disposable a(Action action) {
        return new ActionDisposable(action);
    }

    public static Disposable b(Runnable runnable) {
        return new RunnableDisposable(runnable);
    }
}
