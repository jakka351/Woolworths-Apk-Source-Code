package retrofit2.adapter.rxjava2;

import io.reactivex.Scheduler;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;

/* loaded from: classes8.dex */
final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final Type f27008a;
    public final Scheduler b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public RxJava2CallAdapter(Type type, Scheduler scheduler, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f27008a = type;
        this.b = scheduler;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }

    @Override // retrofit2.CallAdapter
    public final Type a() {
        return this.f27008a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @Override // retrofit2.CallAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(retrofit2.Call r2) {
        /*
            r1 = this;
            retrofit2.adapter.rxjava2.CallExecuteObservable r0 = new retrofit2.adapter.rxjava2.CallExecuteObservable
            r0.<init>(r2)
            boolean r2 = r1.c
            if (r2 == 0) goto L10
            retrofit2.adapter.rxjava2.ResultObservable r2 = new retrofit2.adapter.rxjava2.ResultObservable
            r2.<init>(r0)
        Le:
            r0 = r2
            goto L1a
        L10:
            boolean r2 = r1.d
            if (r2 == 0) goto L1a
            retrofit2.adapter.rxjava2.BodyObservable r2 = new retrofit2.adapter.rxjava2.BodyObservable
            r2.<init>(r0)
            goto Le
        L1a:
            io.reactivex.Scheduler r2 = r1.b
            if (r2 == 0) goto L22
            io.reactivex.internal.operators.observable.ObservableSubscribeOn r0 = r0.i(r2)
        L22:
            boolean r2 = r1.e
            if (r2 == 0) goto L2d
            io.reactivex.BackpressureStrategy r2 = io.reactivex.BackpressureStrategy.d
            io.reactivex.Flowable r2 = r0.l(r2)
            return r2
        L2d:
            boolean r2 = r1.f
            if (r2 == 0) goto L37
            io.reactivex.internal.operators.observable.ObservableSingleSingle r2 = new io.reactivex.internal.operators.observable.ObservableSingleSingle
            r2.<init>(r0)
            return r2
        L37:
            boolean r2 = r1.g
            if (r2 == 0) goto L41
            io.reactivex.internal.operators.observable.ObservableSingleMaybe r2 = new io.reactivex.internal.operators.observable.ObservableSingleMaybe
            r2.<init>(r0)
            return r2
        L41:
            boolean r2 = r1.h
            if (r2 == 0) goto L4b
            io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable r2 = new io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable
            r2.<init>(r0)
            return r2
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.RxJava2CallAdapter.b(retrofit2.Call):java.lang.Object");
    }
}
