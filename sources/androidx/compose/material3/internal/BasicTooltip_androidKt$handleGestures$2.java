package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.TooltipState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2", f = "BasicTooltip.android.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BasicTooltip_androidKt$handleGestures$2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ TooltipState r;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1", f = "BasicTooltip.android.kt", l = {208}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ PointerInputScope r;
        public final /* synthetic */ TooltipState s;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1", f = "BasicTooltip.android.kt", l = {212}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        final class C00681 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public PointerEventPass q;
            public int r;
            public /* synthetic */ Object s;
            public final /* synthetic */ CoroutineScope t;
            public final /* synthetic */ TooltipState u;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1", f = "BasicTooltip.android.kt", l = {217}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C00691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int p;
                public final /* synthetic */ TooltipState q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00691(TooltipState tooltipState, Continuation continuation) {
                    super(2, continuation);
                    this.q = tooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C00691(this.q, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00691) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    int i = this.p;
                    if (i == 0) {
                        ResultKt.b(obj);
                        MutatePriority mutatePriority = MutatePriority.e;
                        this.p = 1;
                        if (this.q.b(mutatePriority, this) == coroutineSingletons) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00681(CoroutineScope coroutineScope, TooltipState tooltipState, Continuation continuation) {
                super(2, continuation);
                this.t = coroutineScope;
                this.u = tooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00681 c00681 = new C00681(this.t, this.u, continuation);
                c00681.s = obj;
                return c00681;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ((C00681) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                return CoroutineSingletons.d;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002f -> B:12:0x0032). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r1 = r7.r
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = r7.q
                    java.lang.Object r3 = r7.s
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                    kotlin.ResultKt.b(r8)
                    goto L32
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    kotlin.ResultKt.b(r8)
                    java.lang.Object r8 = r7.s
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.e
                    r3 = r8
                L25:
                    r7.s = r3
                    r7.q = r1
                    r7.r = r2
                    java.lang.Object r8 = r3.x1(r1, r7)
                    if (r8 != r0) goto L32
                    return r0
                L32:
                    androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
                    java.lang.Object r4 = r8.f1851a
                    r5 = 0
                    java.lang.Object r4 = r4.get(r5)
                    androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                    int r4 = r4.i
                    r5 = 2
                    if (r4 != r5) goto L25
                    int r8 = r8.e
                    r4 = 4
                    androidx.compose.material3.TooltipState r5 = r7.u
                    if (r8 != r4) goto L56
                    androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1 r8 = new androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2$1$1$1
                    r4 = 0
                    r8.<init>(r5, r4)
                    r5 = 3
                    kotlinx.coroutines.CoroutineScope r6 = r7.t
                    kotlinx.coroutines.BuildersKt.c(r6, r4, r4, r8, r5)
                    goto L25
                L56:
                    r4 = 5
                    if (r8 != r4) goto L25
                    r5.dismiss()
                    goto L25
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$2.AnonymousClass1.C00681.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, TooltipState tooltipState, Continuation continuation) {
            super(2, continuation);
            this.r = pointerInputScope;
            this.s = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                C00681 c00681 = new C00681((CoroutineScope) this.q, this.s, null);
                this.p = 1;
                if (this.r.c1(c00681, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$handleGestures$2(TooltipState tooltipState, Continuation continuation) {
        super(2, continuation);
        this.r = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasicTooltip_androidKt$handleGestures$2 basicTooltip_androidKt$handleGestures$2 = new BasicTooltip_androidKt$handleGestures$2(this.r, continuation);
        basicTooltip_androidKt$handleGestures$2.q = obj;
        return basicTooltip_androidKt$handleGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltip_androidKt$handleGestures$2) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.q, this.r, null);
            this.p = 1;
            if (CoroutineScopeKt.c(anonymousClass1, this) == coroutineSingletons) {
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
