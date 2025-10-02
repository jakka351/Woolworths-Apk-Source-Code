package androidx.constraintlayout.compose;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
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
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1", f = "MotionDragHandler.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MotionDragHandlerKt$motionPointerInput$2$2$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ TransitionHandler r;
    public final /* synthetic */ Channel s;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "offset", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Offset, Boolean> {
        public final /* synthetic */ TransitionHandler h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TransitionHandler transitionHandler) {
            super(1);
            this.h = transitionHandler;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            long j = ((Offset) obj).f1751a;
            return Boolean.valueOf(this.h.f2254a.k.i(Offset.e(j), Offset.f(j)));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1$2, reason: invalid class name */
    final class AnonymousClass2 extends Lambda implements Function1<Offset, Unit> {
        public final /* synthetic */ VelocityTracker h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VelocityTracker velocityTracker) {
            super(1);
            this.h = velocityTracker;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            long j = ((Offset) obj).f1751a;
            this.h.d();
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1$3, reason: invalid class name */
    final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Channel h;
        public final /* synthetic */ VelocityTracker i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(VelocityTracker velocityTracker, Channel channel) {
            super(0);
            this.h = channel;
            this.i = velocityTracker;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.h.k(new MotionDragState(false, 9205357640488583168L, this.i.b()));
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1$4, reason: invalid class name */
    final class AnonymousClass4 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Channel h;
        public final /* synthetic */ VelocityTracker i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(VelocityTracker velocityTracker, Channel channel) {
            super(0);
            this.h = channel;
            this.i = velocityTracker;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.h.k(new MotionDragState(false, 9205357640488583168L, this.i.b()));
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "change", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "dragAmount", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1$5, reason: invalid class name */
    final class AnonymousClass5 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {
        public final /* synthetic */ VelocityTracker h;
        public final /* synthetic */ Channel i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(VelocityTracker velocityTracker, Channel channel) {
            super(2);
            this.h = velocityTracker;
            this.i = channel;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            long j = ((Offset) obj2).f1751a;
            VelocityTrackerKt.a(this.h, (PointerInputChange) obj);
            this.i.k(new MotionDragState(true, j, 0L));
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionDragHandlerKt$motionPointerInput$2$2$1(TransitionHandler transitionHandler, Channel channel, Continuation continuation) {
        super(2, continuation);
        this.r = transitionHandler;
        this.s = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MotionDragHandlerKt$motionPointerInput$2$2$1 motionDragHandlerKt$motionPointerInput$2$2$1 = new MotionDragHandlerKt$motionPointerInput$2$2$1(this.r, this.s, continuation);
        motionDragHandlerKt$motionPointerInput$2$2$1.q = obj;
        return motionDragHandlerKt$motionPointerInput$2$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MotionDragHandlerKt$motionPointerInput$2$2$1) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        PointerInputScope pointerInputScope = (PointerInputScope) this.q;
        VelocityTracker velocityTracker = new VelocityTracker();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(velocityTracker);
        Channel channel = this.s;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(velocityTracker, channel);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(velocityTracker, channel);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(velocityTracker, channel);
        this.p = 1;
        Object objC = ForEachGestureKt.c(pointerInputScope, new MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(anonymousClass1, anonymousClass2, anonymousClass5, anonymousClass4, anonymousClass3, null), this);
        if (objC != coroutineSingletons) {
            objC = unit;
        }
        return objC == coroutineSingletons ? coroutineSingletons : unit;
    }
}
