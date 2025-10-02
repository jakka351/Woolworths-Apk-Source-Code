package me.oriient.internal.infra.observable.java;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes7.dex */
public interface ObservableProperty<T> {
    T getValue();

    ObservableOperation observe(ObservableListener<T> observableListener);
}
