package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes7.dex */
public final class ConnectConsumer implements Consumer<Disposable> {
    public Disposable d;

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        this.d = (Disposable) obj;
    }
}
