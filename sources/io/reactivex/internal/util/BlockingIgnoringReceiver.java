package io.reactivex.internal.util;

import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
public final class BlockingIgnoringReceiver extends CountDownLatch implements Consumer<Throwable>, Action {
    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        countDown();
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        countDown();
    }
}
