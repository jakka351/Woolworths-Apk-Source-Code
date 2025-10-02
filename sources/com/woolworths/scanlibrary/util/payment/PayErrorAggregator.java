package com.woolworths.scanlibrary.util.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.subjects.PublishSubject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/util/payment/PayErrorAggregator;", "", "ErrorObserver", "ErrorGroupListener", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PayErrorAggregator {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorGroupListener f21372a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final PublishSubject c = new PublishSubject();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/util/payment/PayErrorAggregator$Companion;", "", "", "ERROR_AGGREGATE_TIME_WINDOW_MSEC", "J", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/util/payment/PayErrorAggregator$ErrorGroupListener;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ErrorGroupListener {
        void a(List list);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/util/payment/PayErrorAggregator$ErrorObserver;", "Lio/reactivex/observers/DisposableObserver;", "Lau/com/woolworths/pay/sdk/interfaces/PayError;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ErrorObserver extends DisposableObserver<PayError> {
        public ErrorObserver() {
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            PayErrorAggregator.a(PayErrorAggregator.this);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable e) {
            Intrinsics.h(e, "e");
            PayErrorAggregator.a(PayErrorAggregator.this);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            PayError error = (PayError) obj;
            Intrinsics.h(error, "error");
            LinkedHashMap linkedHashMap = PayErrorAggregator.this.b;
            PayErrorCode payErrorCode = error.getPayErrorCode();
            Intrinsics.g(payErrorCode, "getPayErrorCode(...)");
            linkedHashMap.put(payErrorCode, error);
        }
    }

    public PayErrorAggregator(ErrorGroupListener errorGroupListener) {
        this.f21372a = errorGroupListener;
    }

    public static final void a(PayErrorAggregator payErrorAggregator) {
        LinkedHashMap linkedHashMap = payErrorAggregator.b;
        if (!linkedHashMap.isEmpty()) {
            payErrorAggregator.f21372a.a(CollectionsKt.G0(linkedHashMap.values()));
        }
        linkedHashMap.clear();
    }

    public final void b(PayError payError) {
        boolean zIsEmpty = this.b.isEmpty();
        PublishSubject publishSubject = this.c;
        if (zIsEmpty) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            publishSubject.getClass();
            new ObservableTakeUntil(publishSubject, Observable.k(500L, timeUnit)).f(AndroidSchedulers.a()).a(new ErrorObserver());
        }
        publishSubject.onNext(payError);
    }
}
