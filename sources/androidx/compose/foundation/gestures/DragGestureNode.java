package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode {
    public SuspendingPointerInputModifierNode A;
    public Orientation t;
    public Function1 u;
    public boolean v;
    public MutableInteractionSource w;
    public BufferedChannel x;
    public DragInteraction.Start y;
    public boolean z;

    public DragGestureNode(Function1 function1, boolean z, MutableInteractionSource mutableInteractionSource, Orientation orientation) {
        this.t = orientation;
        this.u = function1;
        this.v = z;
        this.w = mutableInteractionSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object v2(androidx.compose.foundation.gestures.DragGestureNode r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.foundation.gestures.DragGestureNode r5 = r0.p
            kotlin.ResultKt.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            androidx.compose.foundation.interaction.DragInteraction$Start r6 = r5.y
            if (r6 == 0) goto L4f
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.w
            if (r2 == 0) goto L4c
            androidx.compose.foundation.interaction.DragInteraction$Cancel r4 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r4.<init>(r6)
            r0.p = r5
            r0.s = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r6 = 0
            r5.y = r6
        L4f:
            r0 = 0
            r5.B2(r0)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.v2(androidx.compose.foundation.gestures.DragGestureNode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object w2(androidx.compose.foundation.gestures.DragGestureNode r6, androidx.compose.foundation.gestures.DragEvent.DragStarted r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            androidx.compose.foundation.interaction.DragInteraction$Start r6 = r0.r
            androidx.compose.foundation.gestures.DragEvent$DragStarted r7 = r0.q
            androidx.compose.foundation.gestures.DragGestureNode r0 = r0.p
            kotlin.ResultKt.b(r8)
            goto L77
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            androidx.compose.foundation.gestures.DragEvent$DragStarted r7 = r0.q
            androidx.compose.foundation.gestures.DragGestureNode r6 = r0.p
            kotlin.ResultKt.b(r8)
            goto L5d
        L40:
            kotlin.ResultKt.b(r8)
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = r6.y
            if (r8 == 0) goto L5d
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r6.w
            if (r2 == 0) goto L5d
            androidx.compose.foundation.interaction.DragInteraction$Cancel r5 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r5.<init>(r8)
            r0.p = r6
            r0.q = r7
            r0.u = r4
            java.lang.Object r8 = r2.b(r5, r0)
            if (r8 != r1) goto L5d
            goto L74
        L5d:
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r8.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r6.w
            if (r2 == 0) goto L79
            r0.p = r6
            r0.q = r7
            r0.r = r8
            r0.u = r3
            java.lang.Object r0 = r2.b(r8, r0)
            if (r0 != r1) goto L75
        L74:
            return r1
        L75:
            r0 = r6
            r6 = r8
        L77:
            r8 = r6
            r6 = r0
        L79:
            r6.y = r8
            long r7 = r7.getF887a()
            r6.A2(r7)
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.w2(androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.foundation.gestures.DragEvent$DragStarted, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object x2(androidx.compose.foundation.gestures.DragGestureNode r5, androidx.compose.foundation.gestures.DragEvent.DragStopped r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.foundation.gestures.DragEvent$DragStopped r6 = r0.q
            androidx.compose.foundation.gestures.DragGestureNode r5 = r0.p
            kotlin.ResultKt.b(r7)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r7)
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = r5.y
            if (r7 == 0) goto L53
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.w
            if (r2 == 0) goto L50
            androidx.compose.foundation.interaction.DragInteraction$Stop r4 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r4.<init>(r7)
            r0.p = r5
            r0.q = r6
            r0.t = r3
            java.lang.Object r7 = r2.b(r4, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r7 = 0
            r5.y = r7
        L53:
            long r6 = r6.getF888a()
            r5.B2(r6)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.x2(androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.foundation.gestures.DragEvent$DragStopped, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public abstract void A2(long j);

    public abstract void B2(long j);

    public abstract boolean C2();

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void D0() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.A;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.D0();
        }
    }

    public final void D2(Function1 function1, boolean z, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z2) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        this.u = function1;
        boolean z3 = true;
        if (this.v != z) {
            this.v = z;
            if (!z) {
                y2();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.A;
                if (suspendingPointerInputModifierNode2 != null) {
                    t2(suspendingPointerInputModifierNode2);
                }
                this.A = null;
            }
            z2 = true;
        }
        if (!Intrinsics.c(this.w, mutableInteractionSource)) {
            y2();
            this.w = mutableInteractionSource;
        }
        if (this.t != orientation) {
            this.t = orientation;
        } else {
            z3 = z2;
        }
        if (!z3 || (suspendingPointerInputModifierNode = this.A) == null) {
            return;
        }
        suspendingPointerInputModifierNode.v1();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void f1(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (this.v && this.A == null) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplA = SuspendingPointerInputFilterKt.a(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {512}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1, reason: invalid class name */
                final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public /* synthetic */ Object q;
                    public final /* synthetic */ DragGestureNode r;
                    public final /* synthetic */ PointerInputScope s;
                    public final /* synthetic */ Function3 t;
                    public final /* synthetic */ Function1 u;
                    public final /* synthetic */ Function0 v;
                    public final /* synthetic */ Function0 w;
                    public final /* synthetic */ Function2 x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(DragGestureNode dragGestureNode, PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation) {
                        super(2, continuation);
                        this.r = dragGestureNode;
                        this.s = pointerInputScope;
                        this.t = function3;
                        this.u = function1;
                        this.v = function0;
                        this.w = function02;
                        this.x = function2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, this.u, this.v, this.w, this.x, continuation);
                        anonymousClass1.q = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.CoroutineScope] */
                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
                    /* JADX WARN: Type inference failed for: r1v4 */
                    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.CoroutineScope] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        ?? r1 = this.p;
                        Unit unit = Unit.f24250a;
                        DragGestureNode dragGestureNode = this.r;
                        try {
                            if (r1 == 0) {
                                ResultKt.b(obj);
                                r1 = (CoroutineScope) this.q;
                                Orientation orientation = dragGestureNode.t;
                                PointerInputScope pointerInputScope = this.s;
                                Function3 function3 = this.t;
                                Function1 function1 = this.u;
                                Function0 function0 = this.v;
                                Function0 function02 = this.w;
                                Function2 function2 = this.x;
                                this.q = r1;
                                this.p = 1;
                                float f = DragGestureDetectorKt.f889a;
                                Object objC = ForEachGestureKt.c(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$9(function02, new Ref.LongRef(), orientation, function3, function2, function0, function1, null), this);
                                if (objC != coroutineSingletons) {
                                    objC = unit;
                                }
                                if (objC == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (r1 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                r1 = (CoroutineScope) this.q;
                                ResultKt.b(obj);
                            }
                        } catch (CancellationException e) {
                            BufferedChannel bufferedChannel = dragGestureNode.x;
                            if (bufferedChannel != null) {
                                bufferedChannel.k(DragEvent.DragCancelled.f885a);
                            }
                            if (!CoroutineScopeKt.d(r1)) {
                                throw e;
                            }
                        }
                        return unit;
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(final PointerInputScope pointerInputScope, Continuation continuation) {
                    final VelocityTracker velocityTracker = new VelocityTracker();
                    final DragGestureNode dragGestureNode = this.d;
                    Object objC = CoroutineScopeKt.c(new AnonymousClass1(dragGestureNode, pointerInputScope, new Function3<PointerInputChange, PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragStart$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            PointerInputChange pointerInputChange = (PointerInputChange) obj;
                            PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                            long j2 = ((Offset) obj3).f1751a;
                            DragGestureNode dragGestureNode2 = dragGestureNode;
                            if (((Boolean) dragGestureNode2.u.invoke(pointerInputChange)).booleanValue()) {
                                if (!dragGestureNode2.z) {
                                    if (dragGestureNode2.x == null) {
                                        dragGestureNode2.x = ChannelKt.a(Integer.MAX_VALUE, 6, null);
                                    }
                                    dragGestureNode2.z = true;
                                    BuildersKt.c(dragGestureNode2.g2(), null, null, new DragGestureNode$startListeningForEvents$1(dragGestureNode2, null), 3);
                                }
                                VelocityTrackerKt.a(velocityTracker, pointerInputChange);
                                long jG = Offset.g(pointerInputChange2.c, j2);
                                BufferedChannel bufferedChannel = dragGestureNode2.x;
                                if (bufferedChannel != null) {
                                    bufferedChannel.k(new DragEvent.DragStarted(jG));
                                }
                            }
                            return Unit.f24250a;
                        }
                    }, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragEnd$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            VelocityTracker velocityTracker2 = velocityTracker;
                            VelocityTrackerKt.a(velocityTracker2, (PointerInputChange) obj);
                            float fG = pointerInputScope.getViewConfiguration().g();
                            long jC = velocityTracker2.c(VelocityKt.a(fG, fG));
                            velocityTracker2.d();
                            BufferedChannel bufferedChannel = dragGestureNode.x;
                            if (bufferedChannel != null) {
                                Function3 function3 = DraggableKt.f890a;
                                boolean zIsNaN = Float.isNaN(Velocity.d(jC));
                                float fE = BitmapDescriptorFactory.HUE_RED;
                                float fD = zIsNaN ? 0.0f : Velocity.d(jC);
                                if (!Float.isNaN(Velocity.e(jC))) {
                                    fE = Velocity.e(jC);
                                }
                                bufferedChannel.k(new DragEvent.DragStopped(VelocityKt.a(fD, fE)));
                            }
                            return Unit.f24250a;
                        }
                    }, new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDragCancel$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            BufferedChannel bufferedChannel = dragGestureNode.x;
                            if (bufferedChannel != null) {
                                bufferedChannel.k(DragEvent.DragCancelled.f885a);
                            }
                            return Unit.f24250a;
                        }
                    }, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(!dragGestureNode.C2());
                        }
                    }, new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$onDrag$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            long j2 = ((Offset) obj2).f1751a;
                            VelocityTrackerKt.a(velocityTracker, (PointerInputChange) obj);
                            BufferedChannel bufferedChannel = dragGestureNode.x;
                            if (bufferedChannel != null) {
                                bufferedChannel.k(new DragEvent.DragDelta(j2));
                            }
                            return Unit.f24250a;
                        }
                    }, null), continuation);
                    return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
                }
            });
            s2(suspendingPointerInputModifierNodeImplA);
            this.A = suspendingPointerInputModifierNodeImplA;
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.A;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.f1(pointerEvent, pointerEventPass, j);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        this.z = false;
        y2();
    }

    public final void y2() {
        DragInteraction.Start start = this.y;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.w;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.a(new DragInteraction.Cancel(start));
            }
            this.y = null;
        }
    }

    public abstract Object z2(Function2 function2, Continuation continuation);
}
