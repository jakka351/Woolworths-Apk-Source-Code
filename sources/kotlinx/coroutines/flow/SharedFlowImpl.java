package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public final int h;
    public final int i;
    public final BufferOverflow j;
    public Object[] k;
    public long l;
    public long m;
    public int n;
    public int o;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Emitter implements DisposableHandle {
        public final SharedFlowImpl d;
        public final long e;
        public final Object f;
        public final CancellableContinuationImpl g;

        public Emitter(SharedFlowImpl sharedFlowImpl, long j, Object obj, CancellableContinuationImpl cancellableContinuationImpl) {
            this.d = sharedFlowImpl;
            this.e = j;
            this.f = obj;
            this.g = cancellableContinuationImpl;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            SharedFlowImpl sharedFlowImpl = this.d;
            synchronized (sharedFlowImpl) {
                if (this.e < sharedFlowImpl.q()) {
                    return;
                }
                Object[] objArr = sharedFlowImpl.k;
                Intrinsics.e(objArr);
                long j = this.e;
                if (objArr[((int) j) & (objArr.length - 1)] != this) {
                    return;
                }
                SharedFlowKt.c(objArr, j, SharedFlowKt.f24708a);
                sharedFlowImpl.l();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BufferOverflow bufferOverflow = BufferOverflow.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BufferOverflow bufferOverflow2 = BufferOverflow.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    final class AnonymousClass1<T> extends ContinuationImpl {
        public SharedFlowImpl p;
        public FlowCollector q;
        public SharedFlowSlot r;
        public Job s;
        public /* synthetic */ Object t;
        public int v;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            SharedFlowImpl.m(SharedFlowImpl.this, null, this);
            return CoroutineSingletons.d;
        }
    }

    public SharedFlowImpl(int i, int i2, BufferOverflow bufferOverflow) {
        this.h = i;
        this.i = i2;
        this.j = bufferOverflow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        throw r2.getCancellationException();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(kotlinx.coroutines.flow.SharedFlowImpl r8, kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.m(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):void");
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List a() {
        synchronized (this) {
            int iQ = (int) ((q() + this.n) - this.l);
            if (iQ == 0) {
                return EmptyList.d;
            }
            ArrayList arrayList = new ArrayList(iQ);
            Object[] objArr = this.k;
            Intrinsics.e(objArr);
            for (int i = 0; i < iQ; i++) {
                arrayList.add(objArr[((int) (this.l + i)) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow b(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return SharedFlowKt.d(this, coroutineContext, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        m(this, flowCollector, continuation);
        return CoroutineSingletons.d;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void e() throws Throwable {
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                v(q() + this.n, this.m, q() + this.n, q() + this.n + this.o);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        Throwable th;
        Continuation[] continuationArrP;
        Emitter emitter;
        if (f(obj)) {
            return Unit.f24250a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        Continuation[] continuationArrP2 = AbstractSharedFlowKt.f24715a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        cancellableContinuationImpl.resumeWith(Unit.f24250a);
                        continuationArrP = p(continuationArrP2);
                        emitter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        Emitter emitter2 = new Emitter(this, q() + this.n + this.o, obj, cancellableContinuationImpl);
                        o(emitter2);
                        this.o++;
                        if (this.i == 0) {
                            continuationArrP2 = p(continuationArrP2);
                        }
                        continuationArrP = continuationArrP2;
                        emitter = emitter2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (emitter != null) {
                    CancellableContinuationKt.a(cancellableContinuationImpl, emitter);
                }
                for (Continuation continuation2 : continuationArrP) {
                    if (continuation2 != null) {
                        continuation2.resumeWith(Unit.f24250a);
                    }
                }
                Object objN = cancellableContinuationImpl.n();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                if (objN != coroutineSingletons) {
                    objN = Unit.f24250a;
                }
                return objN == coroutineSingletons ? objN : Unit.f24250a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean f(Object obj) {
        int i;
        boolean z;
        Continuation[] continuationArrP = AbstractSharedFlowKt.f24715a;
        synchronized (this) {
            if (s(obj)) {
                continuationArrP = p(continuationArrP);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation continuation : continuationArrP) {
            if (continuation != null) {
                continuation.resumeWith(Unit.f24250a);
            }
        }
        return z;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot h() {
        SharedFlowSlot sharedFlowSlot = new SharedFlowSlot();
        sharedFlowSlot.f24709a = -1L;
        return sharedFlowSlot;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot[] i() {
        return new SharedFlowSlot[2];
    }

    public final Object k(SharedFlowSlot sharedFlowSlot, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        synchronized (this) {
            try {
                if (t(sharedFlowSlot) < 0) {
                    sharedFlowSlot.b = cancellableContinuationImpl;
                } else {
                    cancellableContinuationImpl.resumeWith(Unit.f24250a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objN = cancellableContinuationImpl.n();
        return objN == CoroutineSingletons.d ? objN : Unit.f24250a;
    }

    public final void l() {
        if (this.i != 0 || this.o > 1) {
            Object[] objArr = this.k;
            Intrinsics.e(objArr);
            while (this.o > 0) {
                long jQ = q();
                int i = this.n;
                int i2 = this.o;
                if (objArr[((int) ((jQ + (i + i2)) - 1)) & (objArr.length - 1)] != SharedFlowKt.f24708a) {
                    return;
                }
                this.o = i2 - 1;
                SharedFlowKt.c(objArr, q() + this.n + this.o, null);
            }
        }
    }

    public final void n() {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        Object[] objArr = this.k;
        Intrinsics.e(objArr);
        SharedFlowKt.c(objArr, q(), null);
        this.n--;
        long jQ = q() + 1;
        if (this.l < jQ) {
            this.l = jQ;
        }
        if (this.m < jQ) {
            if (this.e != 0 && (abstractSharedFlowSlotArr = this.d) != null) {
                for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                    if (abstractSharedFlowSlot != null) {
                        SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                        long j = sharedFlowSlot.f24709a;
                        if (j >= 0 && j < jQ) {
                            sharedFlowSlot.f24709a = jQ;
                        }
                    }
                }
            }
            this.m = jQ;
        }
    }

    public final void o(Object obj) {
        int i = this.n + this.o;
        Object[] objArrR = this.k;
        if (objArrR == null) {
            objArrR = r(0, 2, null);
        } else if (i >= objArrR.length) {
            objArrR = r(i, objArrR.length * 2, objArrR);
        }
        SharedFlowKt.c(objArrR, q() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final Continuation[] p(Continuation[] continuationArr) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        CancellableContinuationImpl cancellableContinuationImpl;
        int length = continuationArr.length;
        if (this.e != 0 && (abstractSharedFlowSlotArr = this.d) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i];
                if (abstractSharedFlowSlot != null && (cancellableContinuationImpl = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).b) != null && t(sharedFlowSlot) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.g(CopyOf, "copyOf(...)");
                        continuationArr = CopyOf;
                    }
                    continuationArr[length] = cancellableContinuationImpl;
                    sharedFlowSlot.b = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long q() {
        return Math.min(this.m, this.l);
    }

    public final Object[] r(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.k = objArr2;
        if (objArr != null) {
            long jQ = q();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + jQ;
                SharedFlowKt.c(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.e
            int r2 = r12.h
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7f
        Lb:
            r12.o(r13)
            int r1 = r12.n
            int r1 = r1 + r9
            r12.n = r1
            if (r1 <= r2) goto L18
            r12.n()
        L18:
            long r1 = r12.q()
            int r3 = r12.n
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.m = r1
            return r9
        L23:
            int r1 = r12.n
            int r3 = r12.i
            if (r1 < r3) goto L47
            long r4 = r12.m
            long r6 = r12.l
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L47
            kotlinx.coroutines.channels.BufferOverflow r1 = r12.j
            int r1 = r1.ordinal()
            if (r1 == 0) goto L45
            if (r1 == r9) goto L47
            r2 = 2
            if (r1 != r2) goto L3f
            goto L7f
        L3f:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L45:
            r1 = 0
            return r1
        L47:
            r12.o(r13)
            int r1 = r12.n
            int r1 = r1 + r9
            r12.n = r1
            if (r1 <= r3) goto L54
            r12.n()
        L54:
            long r3 = r12.q()
            int r1 = r12.n
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.l
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7f
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.m
            long r5 = r12.q()
            int r7 = r12.n
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.q()
            int r10 = r12.n
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.o
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.v(r1, r3, r5, r7)
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.s(java.lang.Object):boolean");
    }

    public final long t(SharedFlowSlot sharedFlowSlot) {
        long j = sharedFlowSlot.f24709a;
        if (j < q() + this.n) {
            return j;
        }
        if (this.i <= 0 && j <= q() && this.o != 0) {
            return j;
        }
        return -1L;
    }

    public final Object u(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        Continuation[] continuationArrW = AbstractSharedFlowKt.f24715a;
        synchronized (this) {
            try {
                long jT = t(sharedFlowSlot);
                if (jT < 0) {
                    obj = SharedFlowKt.f24708a;
                } else {
                    long j = sharedFlowSlot.f24709a;
                    Object[] objArr = this.k;
                    Intrinsics.e(objArr);
                    Object obj2 = objArr[((int) jT) & (objArr.length - 1)];
                    if (obj2 instanceof Emitter) {
                        obj2 = ((Emitter) obj2).f;
                    }
                    sharedFlowSlot.f24709a = jT + 1;
                    Object obj3 = obj2;
                    continuationArrW = w(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrW) {
            if (continuation != null) {
                continuation.resumeWith(Unit.f24250a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jQ = q(); jQ < jMin; jQ++) {
            Object[] objArr = this.k;
            Intrinsics.e(objArr);
            SharedFlowKt.c(objArr, jQ, null);
        }
        this.l = j;
        this.m = j2;
        this.n = (int) (j3 - jMin);
        this.o = (int) (j4 - j3);
    }

    public final Continuation[] w(long j) {
        long j2;
        long j3;
        long j4;
        int i;
        Continuation[] continuationArr;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        long j5 = this.m;
        Continuation[] continuationArr2 = AbstractSharedFlowKt.f24715a;
        if (j <= j5) {
            long jQ = q();
            long j6 = this.n + jQ;
            int i2 = this.i;
            if (i2 == 0 && this.o > 0) {
                j6++;
            }
            int i3 = 0;
            if (this.e != 0 && (abstractSharedFlowSlotArr = this.d) != null) {
                for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                    if (abstractSharedFlowSlot != null) {
                        long j7 = ((SharedFlowSlot) abstractSharedFlowSlot).f24709a;
                        if (j7 >= 0 && j7 < j6) {
                            j6 = j7;
                        }
                    }
                }
            }
            if (j6 > this.m) {
                long jQ2 = q() + this.n;
                int iMin = this.e > 0 ? Math.min(this.o, i2 - ((int) (jQ2 - j6))) : this.o;
                long j8 = this.o + jQ2;
                Symbol symbol = SharedFlowKt.f24708a;
                if (iMin > 0) {
                    Continuation[] continuationArr3 = new Continuation[iMin];
                    j4 = 1;
                    Object[] objArr = this.k;
                    Intrinsics.e(objArr);
                    i = i2;
                    long j9 = jQ2;
                    while (true) {
                        if (jQ2 >= j8) {
                            j2 = jQ;
                            j3 = j6;
                            break;
                        }
                        j2 = jQ;
                        Object obj = objArr[((int) jQ2) & (objArr.length - 1)];
                        if (obj != symbol) {
                            Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            Emitter emitter = (Emitter) obj;
                            int i4 = i3 + 1;
                            j3 = j6;
                            continuationArr3[i3] = emitter.g;
                            SharedFlowKt.c(objArr, jQ2, symbol);
                            SharedFlowKt.c(objArr, j9, emitter.f);
                            j9++;
                            if (i4 >= iMin) {
                                break;
                            }
                            i3 = i4;
                        } else {
                            j3 = j6;
                        }
                        jQ2++;
                        jQ = j2;
                        j6 = j3;
                    }
                    jQ2 = j9;
                    continuationArr = continuationArr3;
                } else {
                    j2 = jQ;
                    j3 = j6;
                    j4 = 1;
                    i = i2;
                    continuationArr = continuationArr2;
                }
                int i5 = (int) (jQ2 - j2);
                long j10 = this.e == 0 ? jQ2 : j3;
                long jMax = Math.max(this.l, jQ2 - Math.min(this.h, i5));
                if (i == 0 && jMax < j8) {
                    Object[] objArr2 = this.k;
                    Intrinsics.e(objArr2);
                    if (Intrinsics.c(objArr2[((int) jMax) & (objArr2.length - 1)], symbol)) {
                        jQ2 += j4;
                        jMax += j4;
                    }
                }
                v(jMax, j10, jQ2, j8);
                l();
                return continuationArr.length == 0 ? continuationArr : p(continuationArr);
            }
        }
        return continuationArr2;
    }
}
