package androidx.camera.core.impl;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.QuirkSettings;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class QuirkSettingsHolder {
    public static final QuirkSettings b;
    public static final QuirkSettingsHolder c;

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateObservable f495a = new MutableStateObservable(b);

    public static class ObserverToConsumerAdapter<T> implements Observable.Observer<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Consumer f496a;

        public ObserverToConsumerAdapter(Consumer consumer) {
            this.f496a = consumer;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void a(Object obj) {
            this.f496a.accept(obj);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onError(Throwable th) {
            Logger.c("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
        }
    }

    static {
        QuirkSettings.Builder builder = new QuirkSettings.Builder();
        builder.f494a = true;
        b = new QuirkSettings(true, builder.b, builder.c);
        c = new QuirkSettingsHolder();
    }

    public final void a(Executor executor, Consumer consumer) {
        this.f495a.c(executor, new ObserverToConsumerAdapter(consumer));
    }
}
