package au.com.woolworths.android.onesite.rxutils;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.ObservableFilter;
import io.reactivex.internal.operators.observable.ObservableMap;
import io.reactivex.subjects.PublishSubject;

@Deprecated
/* loaded from: classes3.dex */
public class RxBus {
    public static volatile RxBus b;

    /* renamed from: a, reason: collision with root package name */
    public PublishSubject f4592a;

    public static RxBus a() {
        if (b == null) {
            synchronized (RxBus.class) {
                try {
                    if (b == null) {
                        RxBus rxBus = new RxBus();
                        rxBus.f4592a = new PublishSubject();
                        b = rxBus;
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final void b(Object obj) {
        this.f4592a.onNext(obj);
    }

    public final ObservableMap c(Class cls) {
        PublishSubject publishSubject = this.f4592a;
        publishSubject.getClass();
        return new ObservableMap(new ObservableFilter(publishSubject, Functions.c(cls)), Functions.a(cls));
    }
}
