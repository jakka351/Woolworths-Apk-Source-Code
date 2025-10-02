package ovh.plrapps.mapcompose.ui.layout;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.Velocity;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ovh.plrapps.mapcompose.ui.gestures.GestureDetectorKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$1", f = "ZoomPanRotate.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomPanRotateKt$ZoomPanRotate$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ GestureListener r;
    public final /* synthetic */ DecayAnimationSpec s;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ((GestureListener) this.receiver).e();
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$1$3, reason: invalid class name */
    final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<Offset, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((GestureListener) this.receiver).j(((Offset) obj).f1751a);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomPanRotateKt$ZoomPanRotate$1(GestureListener gestureListener, DecayAnimationSpec decayAnimationSpec, Continuation continuation) {
        super(2, continuation);
        this.r = gestureListener;
        this.s = decayAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZoomPanRotateKt$ZoomPanRotate$1 zoomPanRotateKt$ZoomPanRotate$1 = new ZoomPanRotateKt$ZoomPanRotate$1(this.r, this.s, continuation);
        zoomPanRotateKt$ZoomPanRotate$1.q = obj;
        return zoomPanRotateKt$ZoomPanRotate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoomPanRotateKt$ZoomPanRotate$1) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        final GestureListener gestureListener = this.r;
        if (gestureListener.m()) {
            Function4<Offset, Offset, Float, Float, Unit> function4 = new Function4<Offset, Offset, Float, Float, Unit>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$1.1
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    long j = ((Offset) obj2).f1751a;
                    long j2 = ((Offset) obj3).f1751a;
                    float fFloatValue = ((Number) obj4).floatValue();
                    float fFloatValue2 = ((Number) obj5).floatValue();
                    GestureListener gestureListener2 = gestureListener;
                    gestureListener2.a(fFloatValue2);
                    gestureListener2.h(fFloatValue, j);
                    gestureListener2.c(j2);
                    return Unit.f24250a;
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(0, this.r, GestureListener.class, "onTouchDown", "onTouchDown()V", 0);
            final GestureListener gestureListener2 = this.r;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(1, gestureListener2, GestureListener.class, "onTwoFingersTap", "onTwoFingersTap-k-4lQ0M(J)V", 0);
            final DecayAnimationSpec decayAnimationSpec = this.s;
            Function1<Velocity, Unit> function1 = new Function1<Velocity, Unit>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$1.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    gestureListener2.g(decayAnimationSpec, ((Velocity) obj2).f2206a);
                    return Unit.f24250a;
                }
            };
            Function2<Offset, Float, Unit> function2 = new Function2<Offset, Float, Unit>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$1.5
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    gestureListener2.o(((Offset) obj2).f1751a, ((Number) obj3).floatValue());
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (GestureDetectorKt.a(pointerInputScope, function4, anonymousClass2, anonymousClass3, function1, function2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
