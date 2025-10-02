package ovh.plrapps.mapcompose.ui.layout;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$2", f = "ZoomPanRotate.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomPanRotateKt$ZoomPanRotate$2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ GestureListener r;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$2$5", f = "ZoomPanRotate.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$2$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        public final /* synthetic */ GestureListener p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(GestureListener gestureListener, Continuation continuation) {
            super(3, continuation);
            this.p = gestureListener;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            long j = ((Offset) obj2).f1751a;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.p, (Continuation) obj3);
            Unit unit = Unit.f24250a;
            anonymousClass5.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            this.p.d();
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomPanRotateKt$ZoomPanRotate$2(GestureListener gestureListener, Continuation continuation) {
        super(2, continuation);
        this.r = gestureListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZoomPanRotateKt$ZoomPanRotate$2 zoomPanRotateKt$ZoomPanRotate$2 = new ZoomPanRotateKt$ZoomPanRotate$2(this.r, continuation);
        zoomPanRotateKt$ZoomPanRotate$2.q = obj;
        return zoomPanRotateKt$ZoomPanRotate$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoomPanRotateKt$ZoomPanRotate$2) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
            Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$2.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    gestureListener.f(((Offset) obj2).f1751a);
                    return Unit.f24250a;
                }
            };
            Function2<Offset, Float, Unit> function2 = new Function2<Offset, Float, Unit>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$2.2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    gestureListener.h(((Number) obj3).floatValue(), ((Offset) obj2).f1751a);
                    return Unit.f24250a;
                }
            };
            Function2<Offset, Float, Unit> function22 = new Function2<Offset, Float, Unit>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$2.3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    gestureListener.o(((Offset) obj2).f1751a, ((Number) obj3).floatValue());
                    return Unit.f24250a;
                }
            };
            Function1<Offset, Unit> function12 = new Function1<Offset, Unit>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$2.4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    gestureListener.i(((Offset) obj2).f1751a);
                    return Unit.f24250a;
                }
            };
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(gestureListener, null);
            Function1<Offset, Unit> function13 = new Function1<Offset, Unit>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$2.6
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    gestureListener.n(((Offset) obj2).f1751a);
                    return Unit.f24250a;
                }
            };
            Function1<Offset, Boolean> function14 = new Function1<Offset, Boolean>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$2.7
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(gestureListener.k(((Offset) obj2).f1751a));
                }
            };
            Function1<Offset, Boolean> function15 = new Function1<Offset, Boolean>() { // from class: ovh.plrapps.mapcompose.ui.layout.ZoomPanRotateKt$ZoomPanRotate$2.8
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(gestureListener.l(((Offset) obj2).f1751a));
                }
            };
            this.p = 1;
            if (TapGestureDetectorKt.b(pointerInputScope, this, function1, function12, function13, function14, function15, function2, function22, anonymousClass5) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
