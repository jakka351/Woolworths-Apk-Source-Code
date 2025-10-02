package androidx.compose.material;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "I", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {722}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ Function2 s;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "I", "latestInputs", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ Ref.ObjectRef d;
        public final /* synthetic */ CoroutineScope e;
        public final /* synthetic */ Function2 f;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "I", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {729}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ Function2 q;
            public final /* synthetic */ Object r;
            public final /* synthetic */ CoroutineScope s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function2 function2, Object obj, CoroutineScope coroutineScope, Continuation continuation) {
                super(2, continuation);
                this.q = function2;
                this.r = obj;
                this.s = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.q, this.r, this.s, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i == 0) {
                    ResultKt.b(obj);
                    this.p = 1;
                    if (this.q.invoke(this.r, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                CoroutineScopeKt.b(this.s, new AnchoredDragFinishedSignal());
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Ref.ObjectRef objectRef, CoroutineScope coroutineScope, Function2 function2) {
            this.d = objectRef;
            this.e = coroutineScope;
            this.f = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                int r1 = r0.u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.u = r1
                goto L18
            L13:
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.s
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.u
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.q
                java.lang.Object r0 = r0.p
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$2.AnonymousClass1) r0
                kotlin.ResultKt.b(r8)
                goto L58
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlin.ResultKt.b(r8)
                kotlin.jvm.internal.Ref$ObjectRef r8 = r6.d
                java.lang.Object r8 = r8.d
                kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
                if (r8 == 0) goto L57
                androidx.compose.material.AnchoredDragFinishedSignal r2 = new androidx.compose.material.AnchoredDragFinishedSignal
                r2.<init>()
                r8.cancel(r2)
                r0.p = r6
                r0.q = r7
                r0.r = r8
                r0.u = r3
                java.lang.Object r8 = r8.join(r0)
                if (r8 != r1) goto L57
                return r1
            L57:
                r0 = r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef r8 = r0.d
                kotlinx.coroutines.CoroutineScope r1 = r0.e
                kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.g
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2
                kotlin.jvm.functions.Function2 r0 = r0.f
                r5 = 0
                r4.<init>(r0, r7, r1, r5)
                kotlinx.coroutines.Job r7 = kotlinx.coroutines.BuildersKt.c(r1, r5, r2, r4, r3)
                r8.d = r7
                kotlin.Unit r7 = kotlin.Unit.f24250a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableKt$restartable$2.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$restartable$2(Function0 function0, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.r = function0;
        this.s = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.r, this.s, continuation);
        anchoredDraggableKt$restartable$2.q = obj;
        return anchoredDraggableKt$restartable$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AnchoredDraggableKt$restartable$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Flow flowM = SnapshotStateKt.m(this.r);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, coroutineScope, this.s);
            this.p = 1;
            if (((AbstractFlow) flowM).collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
