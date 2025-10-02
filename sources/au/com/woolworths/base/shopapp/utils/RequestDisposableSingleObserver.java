package au.com.woolworths.base.shopapp.utils;

import au.com.woolworths.android.onesite.events.ApiErrorEvent;
import au.com.woolworths.android.onesite.rxutils.RxBus;
import io.reactivex.observers.DisposableSingleObserver;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
/* loaded from: classes3.dex */
public class RequestDisposableSingleObserver<T> extends DisposableSingleObserver<T> {
    @Override // io.reactivex.SingleObserver
    public void onError(Throwable throwable) {
        RxBus rxBusA = RxBus.a();
        Intrinsics.h(throwable, "throwable");
        rxBusA.f4592a.onNext(new ApiErrorEvent());
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(Object obj) {
    }
}
