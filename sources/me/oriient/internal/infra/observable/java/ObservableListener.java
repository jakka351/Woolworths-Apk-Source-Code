package me.oriient.internal.infra.observable.java;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes7.dex */
public interface ObservableListener<T> {
    void onValueChanged(T t);
}
