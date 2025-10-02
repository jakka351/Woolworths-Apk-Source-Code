package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "PointerEventHandlerCoroutine", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public final MutableVector A;
    public PointerEvent B;
    public long C;
    public Object r;
    public Object s;
    public Object[] t;
    public SuspendLambda u;
    public PointerInputEventHandler v;
    public Job w;
    public PointerEvent x = SuspendingPointerInputFilterKt.f1863a;
    public final MutableVector y;
    public final MutableVector z;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 implements PointerInputEventHandler {
        public static final AnonymousClass1 d = new AnonymousClass1();

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/coroutines/Continuation;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, Continuation<R> {
        public final CancellableContinuationImpl d;
        public final /* synthetic */ SuspendingPointerInputModifierNodeImpl e;
        public CancellableContinuationImpl f;
        public PointerEventPass g = PointerEventPass.e;
        public final EmptyCoroutineContext h = EmptyCoroutineContext.d;

        public PointerEventHandlerCoroutine(CancellableContinuationImpl cancellableContinuationImpl) {
            this.d = cancellableContinuationImpl;
            this.e = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float B(int i) {
            return this.e.B(i);
        }

        @Override // androidx.compose.ui.unit.Density
        public final float C(float f) {
            return f / this.e.getD();
        }

        @Override // androidx.compose.ui.unit.Density
        public final long F(long j) {
            return this.e.F(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final long H(float f) {
            return this.e.H(f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2] */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object K1(long r7, kotlin.jvm.functions.Function2 r9, kotlin.coroutines.jvm.internal.BaseContinuationImpl r10) {
            /*
                r6 = this;
                boolean r0 = r10 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L13
                r0 = r10
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.s = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r6, r10)
            L18:
                java.lang.Object r10 = r0.q
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.s
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.p
                kotlinx.coroutines.Job r7 = (kotlinx.coroutines.Job) r7
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L2b
                goto L6a
            L2b:
                r8 = move-exception
                goto L70
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlin.ResultKt.b(r10)
                r4 = 0
                int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r10 > 0) goto L4e
                kotlinx.coroutines.CancellableContinuationImpl r10 = r6.f
                if (r10 == 0) goto L4e
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r7)
                kotlin.Result$Failure r2 = kotlin.ResultKt.a(r2)
                r10.resumeWith(r2)
            L4e:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r10 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                kotlinx.coroutines.CoroutineScope r10 = r10.g2()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r2 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r4 = 0
                r2.<init>(r7, r6, r4)
                r7 = 3
                kotlinx.coroutines.Job r7 = kotlinx.coroutines.BuildersKt.c(r10, r4, r4, r2, r7)
                r0.p = r7     // Catch: java.lang.Throwable -> L2b
                r0.s = r3     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L2b
                if (r10 != r1) goto L6a
                return r1
            L6a:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r8 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.d
                r7.cancel(r8)
                return r10
            L70:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r9 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.d
                r7.cancel(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.K1(long, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: Q1 */
        public final float getE() {
            return this.e.getE();
        }

        @Override // androidx.compose.ui.unit.Density
        public final float T1(float f) {
            return this.e.getD() * f;
        }

        @Override // androidx.compose.ui.unit.Density
        public final int W1(long j) {
            return this.e.W1(j);
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final long a() {
            return SuspendingPointerInputModifierNodeImpl.this.C;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object g1(long r5, kotlin.jvm.functions.Function2 r7, kotlin.coroutines.Continuation r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.r = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.p
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.r
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.ResultKt.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                return r8
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.ResultKt.b(r8)
                r0.r = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                java.lang.Object r5 = r4.K1(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                if (r5 != r1) goto L3b
                return r1
            L3b:
                return r5
            L3c:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.g1(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: getContext */
        public final CoroutineContext getE() {
            return this.h;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: getDensity */
        public final float getD() {
            return this.e.getD();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final ViewConfiguration getViewConfiguration() {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            suspendingPointerInputModifierNodeImpl.getClass();
            return DelegatableNodeKt.g(suspendingPointerInputModifierNodeImpl).F;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final long n1() {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            suspendingPointerInputModifierNodeImpl.getClass();
            long jF = suspendingPointerInputModifierNodeImpl.F(DelegatableNodeKt.g(suspendingPointerInputModifierNodeImpl).F.f());
            long j = suspendingPointerInputModifierNodeImpl.C;
            float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (jF >> 32)) - ((int) (j >> 32))) / 2.0f;
            float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (jF & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
            return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
        }

        @Override // androidx.compose.ui.unit.Density
        public final long p(long j) {
            return this.e.p(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final float r(long j) {
            return this.e.r(j);
        }

        @Override // androidx.compose.ui.unit.Density
        public final int r1(float f) {
            return this.e.r1(f);
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (suspendingPointerInputModifierNodeImpl.z) {
                suspendingPointerInputModifierNodeImpl.y.k(this);
            }
            this.d.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        public final long t(int i) {
            return this.e.t(i);
        }

        @Override // androidx.compose.ui.unit.Density
        public final float t1(long j) {
            return this.e.t1(j);
        }

        @Override // androidx.compose.ui.unit.Density
        public final long v(float f) {
            return this.e.v(f);
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final Object x1(PointerEventPass pointerEventPass, Continuation continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
            cancellableContinuationImpl.o();
            this.g = pointerEventPass;
            this.f = cancellableContinuationImpl;
            Object objN = cancellableContinuationImpl.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            return objN;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final PointerEvent y1() {
            return SuspendingPointerInputModifierNodeImpl.this.x;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PointerEventPass pointerEventPass = PointerEventPass.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PointerEventPass pointerEventPass2 = PointerEventPass.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.r = obj;
        this.s = obj2;
        this.t = objArr;
        this.v = pointerInputEventHandler;
        MutableVector mutableVector = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.y = mutableVector;
        this.z = mutableVector;
        this.A = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.C = 0L;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void D0() {
        PointerEvent pointerEvent = this.B;
        if (pointerEvent == null) {
            return;
        }
        ?? r1 = pointerEvent.f1851a;
        int size = ((Collection) r1).size();
        for (int i = 0; i < size; i++) {
            if (((PointerInputChange) r1.get(i)).d) {
                ArrayList arrayList = new ArrayList(r1.size());
                int size2 = ((Collection) r1).size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PointerInputChange pointerInputChange = (PointerInputChange) r1.get(i2);
                    long j = pointerInputChange.f1855a;
                    long j2 = pointerInputChange.c;
                    long j3 = pointerInputChange.b;
                    float f = pointerInputChange.e;
                    boolean z = pointerInputChange.d;
                    arrayList.add(new PointerInputChange(j, j3, j2, false, f, j3, j2, z, z, pointerInputChange.i, 0L));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList, null);
                this.x = pointerEvent2;
                s2(pointerEvent2, PointerEventPass.d);
                s2(pointerEvent2, PointerEventPass.e);
                s2(pointerEvent2, PointerEventPass.f);
                this.B = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void P() {
        v1();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1 */
    public final float getE() {
        return DelegatableNodeKt.g(this).D.getE();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: a, reason: from getter */
    public final long getC() {
        return this.C;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public final Object c1(Function2 function2, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(cancellableContinuationImpl);
        synchronized (this.z) {
            this.y.c(pointerEventHandlerCoroutine);
            new SafeContinuation(IntrinsicsKt.b(IntrinsicsKt.a(pointerEventHandlerCoroutine, pointerEventHandlerCoroutine, function2)), CoroutineSingletons.d).resumeWith(Unit.f24250a);
        }
        cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws DispatchException {
                Throwable th = (Throwable) obj;
                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                CancellableContinuationImpl cancellableContinuationImpl2 = pointerEventHandlerCoroutine2.f;
                if (cancellableContinuationImpl2 != null) {
                    cancellableContinuationImpl2.cancel(th);
                }
                pointerEventHandlerCoroutine2.f = null;
                return Unit.f24250a;
            }
        });
        return cancellableContinuationImpl.n();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void c2() {
        v1();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public final void d1() {
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.C = j;
        if (pointerEventPass == PointerEventPass.d) {
            this.x = pointerEvent;
        }
        if (this.w == null) {
            this.w = BuildersKt.c(g2(), null, CoroutineStart.g, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        s2(pointerEvent, pointerEventPass);
        ?? r5 = pointerEvent.f1851a;
        int size = ((Collection) r5).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerEvent = null;
                break;
            } else if (!PointerEventKt.c((PointerInputChange) r5.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.B = pointerEvent;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getD() {
        return DelegatableNodeKt.g(this).D.getD();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public final ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.g(this).F;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        v1();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:6:0x000d, B:13:0x001b, B:16:0x0027, B:18:0x002f, B:20:0x0033, B:21:0x0038, B:24:0x003d, B:26:0x0046, B:28:0x004e, B:30:0x0052), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s2(androidx.compose.ui.input.pointer.PointerEvent r7, androidx.compose.ui.input.pointer.PointerEventPass r8) {
        /*
            r6 = this;
            androidx.compose.runtime.collection.MutableVector r0 = r6.z
            monitor-enter(r0)
            androidx.compose.runtime.collection.MutableVector r1 = r6.A     // Catch: java.lang.Throwable -> L66
            androidx.compose.runtime.collection.MutableVector r2 = r6.y     // Catch: java.lang.Throwable -> L66
            int r3 = r1.f     // Catch: java.lang.Throwable -> L66
            r1.d(r3, r2)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            if (r0 == 0) goto L3d
            r2 = 1
            if (r0 == r2) goto L1b
            r2 = 2
            if (r0 == r2) goto L3d
            goto L5a
        L1b:
            androidx.compose.runtime.collection.MutableVector r0 = r6.A     // Catch: java.lang.Throwable -> L3b
            int r3 = r0.f     // Catch: java.lang.Throwable -> L3b
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.d     // Catch: java.lang.Throwable -> L3b
            int r2 = r0.length     // Catch: java.lang.Throwable -> L3b
            if (r3 >= r2) goto L5a
        L25:
            if (r3 < 0) goto L5a
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L3b
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r2     // Catch: java.lang.Throwable -> L3b
            androidx.compose.ui.input.pointer.PointerEventPass r4 = r2.g     // Catch: java.lang.Throwable -> L3b
            if (r8 != r4) goto L38
            kotlinx.coroutines.CancellableContinuationImpl r4 = r2.f     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L38
            r2.f = r1     // Catch: java.lang.Throwable -> L3b
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L3b
        L38:
            int r3 = r3 + (-1)
            goto L25
        L3b:
            r7 = move-exception
            goto L60
        L3d:
            androidx.compose.runtime.collection.MutableVector r0 = r6.A     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r2 = r0.d     // Catch: java.lang.Throwable -> L3b
            int r0 = r0.f     // Catch: java.lang.Throwable -> L3b
            r3 = 0
        L44:
            if (r3 >= r0) goto L5a
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L3b
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r4 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r4     // Catch: java.lang.Throwable -> L3b
            androidx.compose.ui.input.pointer.PointerEventPass r5 = r4.g     // Catch: java.lang.Throwable -> L3b
            if (r8 != r5) goto L57
            kotlinx.coroutines.CancellableContinuationImpl r5 = r4.f     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L57
            r4.f = r1     // Catch: java.lang.Throwable -> L3b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L3b
        L57:
            int r3 = r3 + 1
            goto L44
        L5a:
            androidx.compose.runtime.collection.MutableVector r7 = r6.A
            r7.h()
            return
        L60:
            androidx.compose.runtime.collection.MutableVector r8 = r6.A
            r8.h()
            throw r7
        L66:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.s2(androidx.compose.ui.input.pointer.PointerEvent, androidx.compose.ui.input.pointer.PointerEventPass):void");
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public final void v1() {
        Job job = this.w;
        if (job != null) {
            ((JobSupport) job).E(new PointerInputResetException());
            this.w = null;
        }
    }
}
