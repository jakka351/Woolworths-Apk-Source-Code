package kotlinx.coroutines.rx2;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.observable.ObservableFromPublisher;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-rx2"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RxAwaitKt {
    public static final Object a(Completable completable, ContinuationImpl continuationImpl) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
        cancellableContinuationImpl.o();
        completable.a(new CompletableObserver() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$await$2$1
            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                cancellableContinuationImpl.r(new c(disposable));
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                cancellableContinuationImpl.resumeWith(Unit.f24250a);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                cancellableContinuationImpl.resumeWith(ResultKt.a(th));
            }
        });
        Object objN = cancellableContinuationImpl.n();
        return objN == CoroutineSingletons.d ? objN : Unit.f24250a;
    }

    public static final Object b(Single single, ContinuationImpl continuationImpl) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
        cancellableContinuationImpl.o();
        single.a(new SingleObserver<Object>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$await$5$1
            @Override // io.reactivex.SingleObserver
            public final void d(Disposable disposable) {
                cancellableContinuationImpl.r(new c(disposable));
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                cancellableContinuationImpl.resumeWith(ResultKt.a(th));
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                cancellableContinuationImpl.resumeWith(obj);
            }
        });
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }

    public static final Object c(ObservableFromPublisher observableFromPublisher, Continuation continuation) {
        return d(observableFromPublisher, Mode.e, (ContinuationImpl) continuation);
    }

    public static Object d(Observable observable, final Mode mode, ContinuationImpl continuationImpl) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
        cancellableContinuationImpl.o();
        observable.a(new Observer<Object>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitOne$2$1
            public Disposable d;
            public Object e;
            public boolean f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[Mode.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        Mode mode = Mode.e;
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        Mode mode2 = Mode.e;
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        Mode mode3 = Mode.e;
                        iArr[3] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                }
            }

            @Override // io.reactivex.Observer
            public final void d(final Disposable disposable) {
                this.d = disposable;
                cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitOne$2$1$onSubscribe$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        disposable.dispose();
                        return Unit.f24250a;
                    }
                });
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                boolean z = this.f;
                CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                if (z) {
                    if (cancellableContinuationImpl2.t()) {
                        cancellableContinuationImpl2.resumeWith(this.e);
                        return;
                    }
                    return;
                }
                Mode mode2 = Mode.e;
                Mode mode3 = mode;
                if (mode3 == mode2) {
                    cancellableContinuationImpl2.resumeWith(null);
                } else if (cancellableContinuationImpl2.t()) {
                    cancellableContinuationImpl2.resumeWith(ResultKt.a(new NoSuchElementException("No value received via onNext for " + mode3)));
                }
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                cancellableContinuationImpl.resumeWith(ResultKt.a(th));
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                Mode mode2 = mode;
                int iOrdinal = mode2.ordinal();
                CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                if (iOrdinal == 0 || iOrdinal == 1) {
                    if (this.f) {
                        return;
                    }
                    this.f = true;
                    cancellableContinuationImpl2.resumeWith(obj);
                    Disposable disposable = this.d;
                    if (disposable != null) {
                        disposable.dispose();
                        return;
                    } else {
                        Intrinsics.p("subscription");
                        throw null;
                    }
                }
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (mode2 != Mode.f || !this.f) {
                    this.e = obj;
                    this.f = true;
                    return;
                }
                if (cancellableContinuationImpl2.t()) {
                    cancellableContinuationImpl2.resumeWith(ResultKt.a(new IllegalArgumentException("More than one onNext value for " + mode2)));
                }
                Disposable disposable2 = this.d;
                if (disposable2 != null) {
                    disposable2.dispose();
                } else {
                    Intrinsics.p("subscription");
                    throw null;
                }
            }
        });
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(io.reactivex.Maybe r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1 r0 = (kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1 r0 = new kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r5)
            r0.q = r3
            java.lang.Object r5 = g(r4, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            if (r5 == 0) goto L3e
            return r5
        L3e:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxAwaitKt.e(io.reactivex.Maybe, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object f(Observable observable, Continuation continuation) {
        return d(observable, Mode.f, (ContinuationImpl) continuation);
    }

    public static final Object g(MaybeSource maybeSource, ContinuationImpl continuationImpl) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
        cancellableContinuationImpl.o();
        maybeSource.a(new MaybeObserver<Object>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitSingleOrNull$2$1
            @Override // io.reactivex.MaybeObserver
            public final void d(Disposable disposable) {
                cancellableContinuationImpl.r(new c(disposable));
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                cancellableContinuationImpl.resumeWith(null);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                cancellableContinuationImpl.resumeWith(ResultKt.a(th));
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                cancellableContinuationImpl.resumeWith(obj);
            }
        });
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }
}
