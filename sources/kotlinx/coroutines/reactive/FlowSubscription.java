package kotlinx.coroutines.reactive;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@InternalCoroutinesApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u000b\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004R\u0019\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/reactive/FlowSubscription;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lorg/reactivestreams/Subscription;", "Lkotlinx/coroutines/AbstractCoroutine;", "", "", "cancellationRequested", "Z", "Lkotlinx/atomicfu/AtomicLong;", "requested", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlin/coroutines/Continuation;", "producer", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlowSubscription<T> extends AbstractCoroutine<Unit> implements Subscription {
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(FlowSubscription.class, "requested$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(FlowSubscription.class, Object.class, "producer$volatile");
    private volatile boolean cancellationRequested;
    public final Subscriber g;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;

    public FlowSubscription(Subscriber subscriber) {
        super(null, false, true);
        this.g = subscriber;
        final CoroutineContext coroutineContext = this.f;
        this.producer$volatile = new Continuation<Unit>() { // from class: kotlinx.coroutines.reactive.FlowSubscription$createInitialContinuation$$inlined$Continuation$1
            @Override // kotlin.coroutines.Continuation
            /* renamed from: getContext, reason: from getter */
            public final CoroutineContext getD() {
                return coroutineContext;
            }

            @Override // kotlin.coroutines.Continuation
            public final void resumeWith(Object obj) {
                FlowSubscription flowSubscription = this;
                final FlowSubscription$createInitialContinuation$1$1 flowSubscription$createInitialContinuation$1$1 = new FlowSubscription$createInitialContinuation$1$1(1, flowSubscription, FlowSubscription.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                try {
                    CoroutineContext coroutineContext2 = flowSubscription.f;
                    DispatchedContinuationKt.a(Unit.f24250a, IntrinsicsKt.b(coroutineContext2 == EmptyCoroutineContext.d ? new RestrictedContinuationImpl(flowSubscription) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
                        public int p;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj2) {
                            int i2 = this.p;
                            if (i2 != 0) {
                                if (i2 != 1) {
                                    throw new IllegalStateException("This coroutine had already completed");
                                }
                                this.p = 2;
                                ResultKt.b(obj2);
                                return obj2;
                            }
                            this.p = 1;
                            ResultKt.b(obj2);
                            Function1 function1 = flowSubscription$createInitialContinuation$1$1;
                            TypeIntrinsics.d(1, function1);
                            return function1.invoke(this);
                        }
                    } : new ContinuationImpl(flowSubscription, coroutineContext2) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
                        public int p;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj2) {
                            int i2 = this.p;
                            if (i2 != 0) {
                                if (i2 != 1) {
                                    throw new IllegalStateException("This coroutine had already completed");
                                }
                                this.p = 2;
                                ResultKt.b(obj2);
                                return obj2;
                            }
                            this.p = 1;
                            ResultKt.b(obj2);
                            Function1 function1 = flowSubscription$createInitialContinuation$1$1;
                            TypeIntrinsics.d(1, function1);
                            return function1.invoke(this);
                        }
                    }));
                } catch (Throwable th) {
                    CancellableKt.a(th, flowSubscription);
                    throw null;
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q0(kotlinx.coroutines.reactive.FlowSubscription r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            kotlin.Unit r0 = kotlin.Unit.f24250a
            boolean r1 = r6 instanceof kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1
            if (r1 == 0) goto L18
            r1 = r6
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r1 = (kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1) r1
            int r2 = r1.s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.s = r2
            goto L1d
        L18:
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r1 = new kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1
            r1.<init>(r5, r6)
        L1d:
            java.lang.Object r6 = r1.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r1.s
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            kotlinx.coroutines.reactive.FlowSubscription r5 = r1.p
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L3a
            org.reactivestreams.Subscriber r6 = r5.g     // Catch: java.lang.Throwable -> L33
            r6.onComplete()     // Catch: java.lang.Throwable -> L33
            goto L6c
        L33:
            r6 = move-exception
            kotlin.coroutines.CoroutineContext r5 = r5.f
            kotlinx.coroutines.CoroutineExceptionHandlerKt.a(r6, r5)
            goto L6c
        L3a:
            r6 = move-exception
            goto L4d
        L3c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L44:
            kotlin.ResultKt.b(r6)
            r1.p = r5     // Catch: java.lang.Throwable -> L3a
            r1.s = r3     // Catch: java.lang.Throwable -> L3a
            r6 = 0
            throw r6     // Catch: java.lang.Throwable -> L3a
        L4d:
            boolean r1 = r5.cancellationRequested
            if (r1 == 0) goto L5d
            boolean r1 = r5.isActive()
            if (r1 != 0) goto L5d
            java.util.concurrent.CancellationException r1 = r5.getCancellationException()
            if (r6 == r1) goto L6c
        L5d:
            org.reactivestreams.Subscriber r1 = r5.g     // Catch: java.lang.Throwable -> L63
            r1.onError(r6)     // Catch: java.lang.Throwable -> L63
            goto L6c
        L63:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r6, r1)
            kotlin.coroutines.CoroutineContext r5 = r5.f
            kotlinx.coroutines.CoroutineExceptionHandlerKt.a(r6, r5)
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.FlowSubscription.q0(kotlinx.coroutines.reactive.FlowSubscription, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel() {
        this.cancellationRequested = true;
        cancel((CancellationException) null);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        Continuation continuation;
        if (j <= 0) {
            return;
        }
        do {
            atomicLongFieldUpdater = h;
            j2 = atomicLongFieldUpdater.get(this);
            j3 = j2 + j;
            if (j3 <= 0) {
                j3 = Long.MAX_VALUE;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        if (j2 <= 0) {
            do {
                continuation = (Continuation) i.getAndSet(this, null);
            } while (continuation == null);
            continuation.resumeWith(Unit.f24250a);
        }
    }
}
