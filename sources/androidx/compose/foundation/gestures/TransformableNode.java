package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/TransformableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TransformableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public PointerInputModifierNode A;
    public TransformableState t;
    public Function1 u = TransformableKt$transformable$1.h;
    public boolean v = true;
    public final Function1 w = new Function1<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableNode$updatedCanPan$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return (Boolean) this.h.u.invoke(new Offset(((Offset) obj).f1751a));
        }
    };
    public final BufferedChannel x = ChannelKt.a(Integer.MAX_VALUE, 6, null);
    public ScrollConfig y;
    public final SuspendingPointerInputModifierNode z;

    public TransformableNode(TransformableState transformableState) {
        this.t = transformableState;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplA = SuspendingPointerInputFilterKt.a(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", l = {196}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1, reason: invalid class name */
            final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int p;
                public /* synthetic */ Object q;
                public final /* synthetic */ PointerInputScope r;
                public final /* synthetic */ TransformableNode s;

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", l = {175, 178}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C00171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public Ref.ObjectRef p;
                    public Ref.ObjectRef q;
                    public int r;
                    public /* synthetic */ Object s;
                    public final /* synthetic */ TransformableNode t;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", l = {187}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    final class C00181 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
                        public Ref.ObjectRef p;
                        public int q;
                        public /* synthetic */ Object r;
                        public final /* synthetic */ Ref.ObjectRef s;
                        public final /* synthetic */ TransformableNode t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00181(Ref.ObjectRef objectRef, TransformableNode transformableNode, Continuation continuation) {
                            super(2, continuation);
                            this.s = objectRef;
                            this.t = transformableNode;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            C00181 c00181 = new C00181(this.s, this.t, continuation);
                            c00181.r = obj;
                            return c00181;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ((C00181) create((TransformScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
                        /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004c -> B:20:0x004f). Please report as a decompilation issue!!! */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                            /*
                                r7 = this;
                                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r1 = r7.q
                                r2 = 1
                                if (r1 == 0) goto L1b
                                if (r1 != r2) goto L13
                                kotlin.jvm.internal.Ref$ObjectRef r1 = r7.p
                                java.lang.Object r3 = r7.r
                                androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                                kotlin.ResultKt.b(r8)
                                goto L4f
                            L13:
                                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r8.<init>(r0)
                                throw r8
                            L1b:
                                kotlin.ResultKt.b(r8)
                                java.lang.Object r8 = r7.r
                                androidx.compose.foundation.gestures.TransformScope r8 = (androidx.compose.foundation.gestures.TransformScope) r8
                                r3 = r8
                            L23:
                                kotlin.jvm.internal.Ref$ObjectRef r1 = r7.s
                                java.lang.Object r8 = r1.d
                                boolean r4 = r8 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                                if (r4 != 0) goto L52
                                boolean r4 = r8 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                                if (r4 == 0) goto L32
                                androidx.compose.foundation.gestures.TransformEvent$TransformDelta r8 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r8
                                goto L33
                            L32:
                                r8 = 0
                            L33:
                                if (r8 == 0) goto L3e
                                float r4 = r8.f906a
                                long r5 = r8.b
                                float r8 = r8.c
                                r3.a(r5, r4, r8)
                            L3e:
                                androidx.compose.foundation.gestures.TransformableNode r8 = r7.t
                                kotlinx.coroutines.channels.BufferedChannel r8 = r8.x
                                r7.r = r3
                                r7.p = r1
                                r7.q = r2
                                java.lang.Object r8 = r8.c(r7)
                                if (r8 != r0) goto L4f
                                return r0
                            L4f:
                                r1.d = r8
                                goto L23
                            L52:
                                kotlin.Unit r8 = kotlin.Unit.f24250a
                                return r8
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00171.C00181.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00171(TransformableNode transformableNode, Continuation continuation) {
                        super(2, continuation);
                        this.t = transformableNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        C00171 c00171 = new C00171(this.t, continuation);
                        c00171.s = obj;
                        return c00171;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C00171) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
                    
                        if (r10.a(r1, r7, r9) == r0) goto L23;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0072 -> B:13:0x0032). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
                        /*
                            r9 = this;
                            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                            int r1 = r9.r
                            androidx.compose.foundation.gestures.TransformableNode r2 = r9.t
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L2b
                            if (r1 == r4) goto L1f
                            if (r1 != r3) goto L17
                            java.lang.Object r1 = r9.s
                            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                            kotlin.ResultKt.b(r10)     // Catch: java.util.concurrent.CancellationException -> L15
                        L15:
                            r10 = r1
                            goto L32
                        L17:
                            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r10.<init>(r0)
                            throw r10
                        L1f:
                            kotlin.jvm.internal.Ref$ObjectRef r1 = r9.q
                            kotlin.jvm.internal.Ref$ObjectRef r5 = r9.p
                            java.lang.Object r6 = r9.s
                            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                            kotlin.ResultKt.b(r10)
                            goto L51
                        L2b:
                            kotlin.ResultKt.b(r10)
                            java.lang.Object r10 = r9.s
                            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
                        L32:
                            boolean r1 = kotlinx.coroutines.CoroutineScopeKt.d(r10)
                            if (r1 == 0) goto L74
                            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                            r1.<init>()
                            kotlinx.coroutines.channels.BufferedChannel r5 = r2.x
                            r9.s = r10
                            r9.p = r1
                            r9.q = r1
                            r9.r = r4
                            java.lang.Object r5 = r5.c(r9)
                            if (r5 != r0) goto L4e
                            goto L71
                        L4e:
                            r6 = r10
                            r10 = r5
                            r5 = r1
                        L51:
                            r1.d = r10
                            java.lang.Object r10 = r5.d
                            boolean r10 = r10 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                            if (r10 == 0) goto L72
                            androidx.compose.foundation.gestures.TransformableState r10 = r2.t     // Catch: java.util.concurrent.CancellationException -> L72
                            androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.e     // Catch: java.util.concurrent.CancellationException -> L72
                            androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1 r7 = new androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1     // Catch: java.util.concurrent.CancellationException -> L72
                            r8 = 0
                            r7.<init>(r5, r2, r8)     // Catch: java.util.concurrent.CancellationException -> L72
                            r9.s = r6     // Catch: java.util.concurrent.CancellationException -> L72
                            r9.p = r8     // Catch: java.util.concurrent.CancellationException -> L72
                            r9.q = r8     // Catch: java.util.concurrent.CancellationException -> L72
                            r9.r = r3     // Catch: java.util.concurrent.CancellationException -> L72
                            java.lang.Object r10 = r10.a(r1, r7, r9)     // Catch: java.util.concurrent.CancellationException -> L72
                            if (r10 != r0) goto L72
                        L71:
                            return r0
                        L72:
                            r10 = r6
                            goto L32
                        L74:
                            kotlin.Unit r10 = kotlin.Unit.f24250a
                            return r10
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00171.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", l = {198}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
                final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    public int q;
                    public /* synthetic */ Object r;
                    public final /* synthetic */ TransformableNode s;
                    public final /* synthetic */ CoroutineScope t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(TransformableNode transformableNode, CoroutineScope coroutineScope, Continuation continuation) {
                        super(2, continuation);
                        this.s = transformableNode;
                        this.t = coroutineScope;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.s, this.t, continuation);
                        anonymousClass2.r = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((AnonymousClass2) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        TransformableNode transformableNode = this.s;
                        BufferedChannel bufferedChannel = transformableNode.x;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        int i = this.q;
                        TransformEvent.TransformStopped transformStopped = TransformEvent.TransformStopped.f908a;
                        try {
                            try {
                                if (i == 0) {
                                    ResultKt.b(obj);
                                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.r;
                                    Function1 function1 = transformableNode.w;
                                    this.q = 1;
                                    if (TransformableKt.b(awaitPointerEventScope, bufferedChannel, function1, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.b(obj);
                                }
                            } catch (CancellationException e) {
                                if (!CoroutineScopeKt.d(this.t)) {
                                    throw e;
                                }
                            }
                            return Unit.f24250a;
                        } finally {
                            bufferedChannel.k(transformStopped);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, TransformableNode transformableNode, Continuation continuation) {
                    super(2, continuation);
                    this.r = pointerInputScope;
                    this.s = transformableNode;
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
                        CoroutineScope coroutineScope = (CoroutineScope) this.q;
                        CoroutineStart coroutineStart = CoroutineStart.g;
                        TransformableNode transformableNode = this.s;
                        BuildersKt.c(coroutineScope, null, coroutineStart, new C00171(transformableNode, null), 1);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(transformableNode, coroutineScope, null);
                        this.p = 1;
                        if (ForEachGestureKt.c(this.r, anonymousClass2, this) == coroutineSingletons) {
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

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objC;
                TransformableNode transformableNode = this.d;
                return (transformableNode.v && (objC = CoroutineScopeKt.c(new AnonymousClass1(pointerInputScope, transformableNode, null), continuation)) == CoroutineSingletons.d) ? objC : Unit.f24250a;
            }
        });
        s2(suspendingPointerInputModifierNodeImplA);
        this.z = suspendingPointerInputModifierNodeImplA;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void D0() {
        this.z.D0();
        PointerInputModifierNode pointerInputModifierNode = this.A;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.D0();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        final ScrollConfig scrollConfig = this.y;
        if (this.v) {
            ?? r1 = pointerEvent.f1851a;
            int size = ((Collection) r1).size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (((PointerInputChange) r1.get(i)).i != 2) {
                    i++;
                } else if (scrollConfig != null && this.A == null) {
                    SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplA = SuspendingPointerInputFilterKt.a(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$onPointerEvent$2
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            Object objC1 = pointerInputScope.c1(new TransformableKt$detectZoomByCtrlMouseScroll$2(continuation.getE(), scrollConfig, this.d.x, null), continuation);
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                            Unit unit = Unit.f24250a;
                            if (objC1 != coroutineSingletons) {
                                objC1 = unit;
                            }
                            return objC1 == coroutineSingletons ? objC1 : unit;
                        }
                    });
                    s2(suspendingPointerInputModifierNodeImplA);
                    this.A = suspendingPointerInputModifierNodeImplA;
                }
            }
        }
        this.z.f1(pointerEvent, pointerEventPass, j);
        PointerInputModifierNode pointerInputModifierNode = this.A;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.f1(pointerEvent, pointerEventPass, j);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void k2() {
        this.y = AndroidScrollable_androidKt.a(this);
    }
}
