package net.engawapg.lib.zoomable;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$applyGesture$2", f = "ZoomState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomState$applyGesture$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ ZoomState q;
    public final /* synthetic */ float r;
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$applyGesture$2$1", f = "ZoomState.kt", l = {196}, m = "invokeSuspend")
    /* renamed from: net.engawapg.lib.zoomable.ZoomState$applyGesture$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ZoomState q;
        public final /* synthetic */ long r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ZoomState zoomState, long j, Continuation continuation) {
            super(2, continuation);
            this.q = zoomState;
            this.r = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, continuation);
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
                Animatable animatable = this.q.d;
                Float f = new Float(Offset.e(this.r));
                this.p = 1;
                if (animatable.h(f, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$applyGesture$2$2", f = "ZoomState.kt", l = {201}, m = "invokeSuspend")
    /* renamed from: net.engawapg.lib.zoomable.ZoomState$applyGesture$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ZoomState q;
        public final /* synthetic */ long r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ZoomState zoomState, long j, Continuation continuation) {
            super(2, continuation);
            this.q = zoomState;
            this.r = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.q, this.r, continuation);
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
                Animatable animatable = this.q.e;
                Float f = new Float(Offset.f(this.r));
                this.p = 1;
                if (animatable.h(f, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$applyGesture$2$3", f = "ZoomState.kt", l = {205}, m = "invokeSuspend")
    /* renamed from: net.engawapg.lib.zoomable.ZoomState$applyGesture$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ZoomState q;
        public final /* synthetic */ float r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ZoomState zoomState, float f, Continuation continuation) {
            super(2, continuation);
            this.q = zoomState;
            this.r = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                Animatable animatable = this.q.c;
                Float f = new Float(this.r);
                this.p = 1;
                if (animatable.h(f, this) == coroutineSingletons) {
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
    public ZoomState$applyGesture$2(float f, long j, long j2, long j3, Continuation continuation, ZoomState zoomState) {
        super(2, continuation);
        this.q = zoomState;
        this.r = f;
        this.s = j;
        this.t = j2;
        this.u = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZoomState$applyGesture$2 zoomState$applyGesture$2 = new ZoomState$applyGesture$2(this.r, this.s, this.t, this.u, continuation, this.q);
        zoomState$applyGesture$2.p = obj;
        return zoomState$applyGesture$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ZoomState$applyGesture$2 zoomState$applyGesture$2 = (ZoomState$applyGesture$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        zoomState$applyGesture$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        ZoomState zoomState = this.q;
        float fC = zoomState.c();
        VelocityTracker velocityTracker = zoomState.i;
        float f = this.r;
        float fB = RangesKt.b(fC * f, 0.9f, 3.0f);
        long jB = ZoomState.b(this.q, fB, this.s, this.t);
        Rect rectA = ZoomState.a(zoomState, fB);
        zoomState.d.j(new Float(rectA.f1752a), new Float(rectA.c));
        BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(zoomState, jB, null), 3);
        zoomState.e.j(new Float(rectA.b), new Float(rectA.d));
        BuildersKt.c(coroutineScope, null, null, new AnonymousClass2(zoomState, jB, null), 3);
        BuildersKt.c(coroutineScope, null, null, new AnonymousClass3(zoomState, fB, null), 3);
        if (f == 1.0f) {
            velocityTracker.a(this.u, this.s);
        } else {
            velocityTracker.d();
        }
        return Unit.f24250a;
    }
}
