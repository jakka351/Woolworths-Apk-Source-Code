package me.oriient.internal.infra.observable.java;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes7.dex */
public interface ObservableEvent<T> {
    ObservableOperation observe(ObservableListener<T> observableListener);
}
