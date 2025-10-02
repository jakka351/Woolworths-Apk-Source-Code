package io.reactivex.disposables;

import io.reactivex.functions.Action;
import io.reactivex.internal.util.ExceptionHelper;

/* loaded from: classes7.dex */
final class ActionDisposable extends ReferenceDisposable<Action> {
    @Override // io.reactivex.disposables.ReferenceDisposable
    public final void a(Object obj) {
        try {
            ((Action) obj).run();
        } catch (Throwable th) {
            throw ExceptionHelper.d(th);
        }
    }
}
