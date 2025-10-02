package kotlinx.coroutines.rx2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0004R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/rx2/DispatcherScheduler;", "Lio/reactivex/Scheduler;", "Lkotlinx/atomicfu/AtomicLong;", "workerCounter", "DispatcherWorker", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DispatcherScheduler extends Scheduler {
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(DispatcherScheduler.class, "workerCounter$volatile");
    private volatile /* synthetic */ long workerCounter$volatile;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/rx2/DispatcherScheduler$DispatcherWorker;", "Lio/reactivex/Scheduler$Worker;", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DispatcherWorker extends Scheduler.Worker {
        public final long d;
        public final CompletableJob e;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$1", f = "RxScheduler.kt", l = {183, 78}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public ReceiveChannel p;
            public ChannelIterator q;
            public int r;

            public AnonymousClass1(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return DispatcherWorker.this.new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0025 A[Catch: all -> 0x0014, PHI: r1 r4 r6
  0x0025: PHI (r1v2 kotlinx.coroutines.channels.ChannelIterator) = (r1v1 kotlinx.coroutines.channels.ChannelIterator), (r1v3 kotlinx.coroutines.channels.ChannelIterator) binds: [B:15:0x0022, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0025: PHI (r4v4 kotlinx.coroutines.channels.ReceiveChannel) = (r4v3 kotlinx.coroutines.channels.ReceiveChannel), (r4v5 kotlinx.coroutines.channels.ReceiveChannel) binds: [B:15:0x0022, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0025: PHI (r6v5 java.lang.Object) = (r6v0 java.lang.Object), (r6v13 java.lang.Object) binds: [B:15:0x0022, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0014, blocks: (B:8:0x0010, B:21:0x0040, B:16:0x0025, B:18:0x002d, B:15:0x0022), top: B:34:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x002d A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:8:0x0010, B:21:0x0040, B:16:0x0025, B:18:0x002d, B:15:0x0022), top: B:34:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:21:0x0040). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r1 = r5.r
                    if (r1 == 0) goto L54
                    r2 = 2
                    r3 = 1
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    kotlinx.coroutines.channels.ChannelIterator r1 = r5.q
                    kotlinx.coroutines.channels.ReceiveChannel r4 = r5.p
                    kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L14
                    goto L40
                L14:
                    r6 = move-exception
                    goto L5b
                L16:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1e:
                    kotlinx.coroutines.channels.ChannelIterator r1 = r5.q
                    kotlinx.coroutines.channels.ReceiveChannel r4 = r5.p
                    kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L14
                L25:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L14
                    boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L14
                    if (r6 == 0) goto L4d
                    java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L14
                    kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6     // Catch: java.lang.Throwable -> L14
                    r5.p = r4     // Catch: java.lang.Throwable -> L14
                    r5.q = r1     // Catch: java.lang.Throwable -> L14
                    r5.r = r2     // Catch: java.lang.Throwable -> L14
                    java.lang.Object r6 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L14
                    if (r6 != r0) goto L40
                    goto L4c
                L40:
                    r5.p = r4     // Catch: java.lang.Throwable -> L14
                    r5.q = r1     // Catch: java.lang.Throwable -> L14
                    r5.r = r3     // Catch: java.lang.Throwable -> L14
                    java.lang.Object r6 = r1.b(r5)     // Catch: java.lang.Throwable -> L14
                    if (r6 != r0) goto L25
                L4c:
                    return r0
                L4d:
                    r6 = 0
                    r4.cancel(r6)
                    kotlin.Unit r6 = kotlin.Unit.f24250a
                    return r6
                L54:
                    kotlin.ResultKt.b(r6)
                    r6 = 0
                    throw r6     // Catch: java.lang.Throwable -> L59
                L59:
                    r6 = move-exception
                    r4 = 0
                L5b:
                    throw r6     // Catch: java.lang.Throwable -> L5c
                L5c:
                    r0 = move-exception
                    kotlinx.coroutines.channels.ChannelsKt.a(r4, r6)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.DispatcherScheduler.DispatcherWorker.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DispatcherWorker(long j) {
            this.d = j;
            CompletableJob completableJobA = SupervisorKt.a(null);
            this.e = completableJobA;
            CoroutineContext.Element.DefaultImpls.c((JobSupport) completableJobA, null);
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return !CoroutineScopeKt.d(null);
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
            timeUnit.toMillis(j);
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("null (worker ");
            sb.append(this.d);
            sb.append(", ");
            return androidx.camera.core.impl.b.r(sb, b() ? "disposed" : AppMeasurementSdk.ConditionalUserProperty.ACTIVE, ')');
        }
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker c() {
        new DispatcherWorker(f.getAndIncrement(this));
        throw null;
    }

    @Override // io.reactivex.Scheduler
    public final Disposable e(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        CoroutineScope coroutineScope = null;
        CoroutineContext d = coroutineScope.getD();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a aVar = new a(this, new RxSchedulerKt$scheduleTask$toSchedule$1(Disposables.b(new a(objectRef)), d, runnable));
        if (!CoroutineScopeKt.d(null)) {
            throw null;
        }
        if (millis <= 0) {
            aVar.run();
            throw null;
        }
        objectRef.d = DelayKt.c(d).j(millis, aVar, d);
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
