package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CombineKt$combineInternal$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Channel p;
    public byte[] q;
    public int r;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Flow[] v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ SuspendLambda x;
    public final /* synthetic */ FlowCollector y;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ Flow[] q;
        public final /* synthetic */ int r;
        public final /* synthetic */ AtomicInteger s;
        public final /* synthetic */ BufferedChannel t;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        final class C04071<T> implements FlowCollector {
            public final /* synthetic */ BufferedChannel d;
            public final /* synthetic */ int e;

            public C04071(BufferedChannel bufferedChannel, int i) {
                this.d = bufferedChannel;
                this.e = i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            
                if (kotlinx.coroutines.YieldKt.a(r0) == r1) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                    int r1 = r0.r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.r = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.p
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r2 = r0.r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L36
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.ResultKt.b(r7)
                    goto L54
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L32:
                    kotlin.ResultKt.b(r7)
                    goto L4b
                L36:
                    kotlin.ResultKt.b(r7)
                    kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue
                    int r2 = r5.e
                    r7.<init>(r2, r6)
                    r0.r = r4
                    kotlinx.coroutines.channels.BufferedChannel r6 = r5.d
                    java.lang.Object r6 = r6.z(r7, r0)
                    if (r6 != r1) goto L4b
                    goto L53
                L4b:
                    r0.r = r3
                    java.lang.Object r6 = kotlinx.coroutines.YieldKt.a(r0)
                    if (r6 != r1) goto L54
                L53:
                    return r1
                L54:
                    kotlin.Unit r6 = kotlin.Unit.f24250a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C04071.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Flow[] flowArr, int i, AtomicInteger atomicInteger, BufferedChannel bufferedChannel, Continuation continuation) {
            super(2, continuation);
            this.q = flowArr;
            this.r = i;
            this.s = atomicInteger;
            this.t = bufferedChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            AtomicInteger atomicInteger = this.s;
            BufferedChannel bufferedChannel = this.t;
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    Flow[] flowArr = this.q;
                    int i2 = this.r;
                    Flow flow = flowArr[i2];
                    C04071 c04071 = new C04071(bufferedChannel, i2);
                    this.p = 1;
                    if (flow.collect(c04071, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    bufferedChannel.y(null);
                }
                return Unit.f24250a;
            } finally {
                if (atomicInteger.decrementAndGet() == 0) {
                    bufferedChannel.y(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(Continuation continuation, Function0 function0, Function3 function3, FlowCollector flowCollector, Flow[] flowArr) {
        super(2, continuation);
        this.v = flowArr;
        this.w = function0;
        this.x = (SuspendLambda) function3;
        this.y = flowCollector;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(continuation, this.w, this.x, this.y, this.v);
        combineKt$combineInternal$2.u = obj;
        return combineKt$combineInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$combineInternal$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        if (r8 != 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:33:0x00c2, B:31:0x00b3], limit reached: 42 */
    /* JADX WARN: Path cross not found for [B:34:0x00c4, B:19:0x0083], limit reached: 42 */
    /* JADX WARN: Path cross not found for [B:36:0x00d2, B:39:0x00e5], limit reached: 42 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[LOOP:0: B:26:0x00a3->B:44:?, LOOP_START, PHI: r8 r12
  0x00a3: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:23:0x009e, B:44:?] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r12v4 kotlin.collections.IndexedValue) = (r12v3 kotlin.collections.IndexedValue), (r12v10 kotlin.collections.IndexedValue) binds: [B:23:0x009e, B:44:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:19:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fa -> B:19:0x0083). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
