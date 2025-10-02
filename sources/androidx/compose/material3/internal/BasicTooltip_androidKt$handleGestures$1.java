package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
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
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BasicTooltip_androidKt$handleGestures$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ TooltipState r;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", l = {163}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ PointerInputScope r;
        public final /* synthetic */ TooltipState s;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", l = {171, 177, 197}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00651 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public MutableStateFlow q;
            public PointerEventPass r;
            public long s;
            public int t;
            public /* synthetic */ Object u;
            public final /* synthetic */ CoroutineScope v;
            public final /* synthetic */ TooltipState w;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", l = {178}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C00661 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
                public int q;
                public /* synthetic */ Object r;
                public final /* synthetic */ PointerEventPass s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00661(PointerEventPass pointerEventPass, Continuation continuation) {
                    super(2, continuation);
                    this.s = pointerEventPass;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C00661 c00661 = new C00661(this.s, continuation);
                    c00661.r = obj;
                    return c00661;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00661) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    int i = this.q;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                        return obj;
                    }
                    ResultKt.b(obj);
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.r;
                    this.q = 1;
                    Object objK = TapGestureDetectorKt.k(awaitPointerEventScope, this.s, this);
                    return objK == coroutineSingletons ? coroutineSingletons : objK;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", l = {185, 187, 187}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2, reason: invalid class name */
            final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public Throwable p;
                public int q;
                public final /* synthetic */ MutableStateFlow r;
                public final /* synthetic */ TooltipState s;

                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "isLongPressed", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1", f = "BasicTooltip.android.kt", l = {}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1, reason: invalid class name and collision with other inner class name */
                final class C00671 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                    public /* synthetic */ boolean p;
                    public final /* synthetic */ TooltipState q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00671(TooltipState tooltipState, Continuation continuation) {
                        super(2, continuation);
                        this.q = tooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C00671 c00671 = new C00671(this.q, continuation);
                        c00671.p = ((Boolean) obj).booleanValue();
                        return c00671;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        C00671 c00671 = (C00671) create(bool, (Continuation) obj2);
                        Unit unit = Unit.f24250a;
                        c00671.invokeSuspend(unit);
                        return unit;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        ResultKt.b(obj);
                        if (!this.p) {
                            this.q.dismiss();
                        }
                        return Unit.f24250a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(MutableStateFlow mutableStateFlow, TooltipState tooltipState, Continuation continuation) {
                    super(2, continuation);
                    this.r = mutableStateFlow;
                    this.s = tooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass2(this.r, this.s, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
                
                    if (kotlinx.coroutines.flow.FlowKt.h(r7, r9, r8) == r0) goto L26;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                    /*
                        r8 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r1 = r8.q
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        androidx.compose.material3.TooltipState r6 = r8.s
                        kotlinx.coroutines.flow.MutableStateFlow r7 = r8.r
                        if (r1 == 0) goto L2c
                        if (r1 == r5) goto L26
                        if (r1 == r4) goto L22
                        if (r1 == r3) goto L1c
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1c:
                        java.lang.Throwable r0 = r8.p
                        kotlin.ResultKt.b(r9)
                        goto L61
                    L22:
                        kotlin.ResultKt.b(r9)
                        goto L4d
                    L26:
                        kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L2a
                        goto L3f
                    L2a:
                        r9 = move-exception
                        goto L50
                    L2c:
                        kotlin.ResultKt.b(r9)
                        java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2a
                        r7.f(r9)     // Catch: java.lang.Throwable -> L2a
                        androidx.compose.foundation.MutatePriority r9 = androidx.compose.foundation.MutatePriority.f     // Catch: java.lang.Throwable -> L2a
                        r8.q = r5     // Catch: java.lang.Throwable -> L2a
                        java.lang.Object r9 = r6.b(r9, r8)     // Catch: java.lang.Throwable -> L2a
                        if (r9 != r0) goto L3f
                        goto L5f
                    L3f:
                        androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1 r9 = new androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1
                        r9.<init>(r6, r2)
                        r8.q = r4
                        java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.h(r7, r9, r8)
                        if (r9 != r0) goto L4d
                        goto L5f
                    L4d:
                        kotlin.Unit r9 = kotlin.Unit.f24250a
                        return r9
                    L50:
                        androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1 r1 = new androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1
                        r1.<init>(r6, r2)
                        r8.p = r9
                        r8.q = r3
                        java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.h(r7, r1, r8)
                        if (r1 != r0) goto L60
                    L5f:
                        return r0
                    L60:
                        r0 = r9
                    L61:
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00651.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00651(CoroutineScope coroutineScope, TooltipState tooltipState, Continuation continuation) {
                super(2, continuation);
                this.v = coroutineScope;
                this.w = tooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00651 c00651 = new C00651(this.v, this.w, continuation);
                c00651.u = obj;
                return c00651;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00651) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00bf, B:43:0x00c3), top: B:50:0x0014 }] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 213
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00651.invokeSuspend(java.lang.Object):java.lang.Object");
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
                C00651 c00651 = new C00651((CoroutineScope) this.q, this.s, null);
                this.p = 1;
                if (ForEachGestureKt.c(this.r, c00651, this) == coroutineSingletons) {
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
    public BasicTooltip_androidKt$handleGestures$1(TooltipState tooltipState, Continuation continuation) {
        super(2, continuation);
        this.r = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasicTooltip_androidKt$handleGestures$1 basicTooltip_androidKt$handleGestures$1 = new BasicTooltip_androidKt$handleGestures$1(this.r, continuation);
        basicTooltip_androidKt$handleGestures$1.q = obj;
        return basicTooltip_androidKt$handleGestures$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltip_androidKt$handleGestures$1) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
