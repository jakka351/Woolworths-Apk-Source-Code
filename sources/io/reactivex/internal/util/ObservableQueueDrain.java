package io.reactivex.internal.util;

import io.reactivex.Observer;

/* loaded from: classes7.dex */
public interface ObservableQueueDrain<T, U> {
    void a(Observer observer, Object obj);

    Throwable c();

    boolean e();
}
