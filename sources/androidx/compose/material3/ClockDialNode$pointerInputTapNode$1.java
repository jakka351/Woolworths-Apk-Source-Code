package androidx.compose.material3;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.DelegatableNodeKt;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1", f = "TimePicker.kt", l = {1439}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ClockDialNode$pointerInputTapNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ClockDialNode r;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        public /* synthetic */ long p;
        public final /* synthetic */ ClockDialNode q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClockDialNode clockDialNode, Continuation continuation) {
            super(3, continuation);
            this.q = clockDialNode;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            long j = ((Offset) obj2).f1751a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, (Continuation) obj3);
            anonymousClass1.p = j;
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            long j = this.p;
            float fE = Offset.e(j);
            ClockDialNode clockDialNode = this.q;
            clockDialNode.w = fE;
            clockDialNode.x = Offset.f(j);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputTapNode$1(ClockDialNode clockDialNode, Continuation continuation) {
        super(2, continuation);
        this.r = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ClockDialNode$pointerInputTapNode$1 clockDialNode$pointerInputTapNode$1 = new ClockDialNode$pointerInputTapNode$1(this.r, continuation);
        clockDialNode$pointerInputTapNode$1.q = obj;
        return clockDialNode$pointerInputTapNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ClockDialNode$pointerInputTapNode$1) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.q;
            final ClockDialNode clockDialNode = this.r;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(clockDialNode, null);
            Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.2

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", l = {1446}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1, reason: invalid class name */
                final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ ClockDialNode q;
                    public final /* synthetic */ long r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, long j, Continuation continuation) {
                        super(2, continuation);
                        this.q = clockDialNode;
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
                        Unit unit = Unit.f24250a;
                        if (i == 0) {
                            ResultKt.b(obj);
                            ClockDialNode clockDialNode = this.q;
                            AnalogTimePickerState analogTimePickerState = clockDialNode.t;
                            long j = this.r;
                            float fE = Offset.e(j);
                            float f = Offset.f(j);
                            float fT1 = DelegatableNodeKt.g(clockDialNode).D.T1(TimePickerKt.e);
                            boolean z = clockDialNode.u;
                            long j2 = clockDialNode.y;
                            this.p = 1;
                            TimePickerKt.m(analogTimePickerState, fE, f, fT1, z, j2, this);
                            if (unit == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj);
                        }
                        return unit;
                    }
                }

                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    long j = ((Offset) obj2).f1751a;
                    ClockDialNode clockDialNode2 = clockDialNode;
                    BuildersKt.c(clockDialNode2.g2(), null, null, new AnonymousClass1(clockDialNode2, j, null), 3);
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (TapGestureDetectorKt.g(pointerInputScope, null, null, anonymousClass1, function1, this, 3) == coroutineSingletons) {
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
