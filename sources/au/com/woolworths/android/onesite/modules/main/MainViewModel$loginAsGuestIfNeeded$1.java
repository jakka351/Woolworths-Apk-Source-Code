package au.com.woolworths.android.onesite.modules.main;

import au.com.woolworths.android.onesite.events.ApiErrorEvent;
import au.com.woolworths.android.onesite.rxutils.RxBus;
import io.reactivex.observers.DisposableCompletableObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/modules/main/MainViewModel$loginAsGuestIfNeeded$1", "Lio/reactivex/observers/DisposableCompletableObserver;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainViewModel$loginAsGuestIfNeeded$1 extends DisposableCompletableObserver {
    @Override // io.reactivex.CompletableObserver
    public final void onComplete() {
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable) {
        Intrinsics.h(throwable, "throwable");
        RxBus rxBusA = RxBus.a();
        rxBusA.f4592a.onNext(new ApiErrorEvent());
    }
}
