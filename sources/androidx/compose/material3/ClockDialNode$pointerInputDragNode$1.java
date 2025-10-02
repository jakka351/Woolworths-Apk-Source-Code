package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", f = "TimePicker.kt", l = {1456}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ClockDialNode$pointerInputDragNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ClockDialNode r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode, Continuation continuation) {
        super(2, continuation);
        this.r = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ClockDialNode$pointerInputDragNode$1 clockDialNode$pointerInputDragNode$1 = new ClockDialNode$pointerInputDragNode$1(this.r, continuation);
        clockDialNode$pointerInputDragNode$1.q = obj;
        return clockDialNode$pointerInputDragNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ClockDialNode$pointerInputDragNode$1) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.q;
            final ClockDialNode clockDialNode = this.r;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", l = {1462}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C00501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ ClockDialNode q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00501(ClockDialNode clockDialNode, Continuation continuation) {
                        super(2, continuation);
                        this.q = clockDialNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C00501(this.q, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        C00501 c00501 = (C00501) create((CoroutineScope) obj, (Continuation) obj2);
                        Unit unit = Unit.f24250a;
                        c00501.invokeSuspend(unit);
                        return unit;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        int i = this.p;
                        if (i != 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj);
                            return Unit.f24250a;
                        }
                        ResultKt.b(obj);
                        ClockDialNode clockDialNode = this.q;
                        if (clockDialNode.u) {
                            clockDialNode.t.getClass();
                            throw null;
                        }
                        this.p = 1;
                        throw null;
                    }
                }

                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ClockDialNode clockDialNode2 = clockDialNode;
                    BuildersKt.c(clockDialNode2.g2(), null, null, new C00501(clockDialNode2, null), 3);
                    return Unit.f24250a;
                }
            };
            Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.2

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", l = {1469}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1, reason: invalid class name */
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
                        AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
                        Unit unit = Unit.f24250a;
                        anonymousClass1.invokeSuspend(unit);
                        return unit;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        int i = this.p;
                        if (i != 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj);
                            return Unit.f24250a;
                        }
                        ResultKt.b(obj);
                        ClockDialNode clockDialNode = this.q;
                        float f = clockDialNode.w;
                        long j = this.r;
                        clockDialNode.w = Offset.e(j) + f;
                        float f2 = Offset.f(j) + clockDialNode.x;
                        clockDialNode.x = f2;
                        AnalogTimePickerState analogTimePickerState = clockDialNode.t;
                        long j2 = clockDialNode.y;
                        float f3 = f2 - ((int) (4294967295L & j2));
                        float f4 = clockDialNode.w - ((int) (j2 >> 32));
                        float f5 = TimePickerKt.f1519a;
                        float fAtan2 = ((float) Math.atan2(f3, f4)) - 1.5707964f;
                        if (fAtan2 < BitmapDescriptorFactory.HUE_RED) {
                            fAtan2 += 6.2831855f;
                        }
                        this.p = 1;
                        analogTimePickerState.getClass();
                        MutatePriority mutatePriority = MutatePriority.d;
                        new AnalogTimePickerState$rotateTo$2(analogTimePickerState, fAtan2, false, null);
                        throw null;
                    }
                }

                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    long j = ((Offset) obj3).f1751a;
                    ClockDialNode clockDialNode2 = clockDialNode;
                    BuildersKt.c(clockDialNode2.g2(), null, null, new AnonymousClass1(clockDialNode2, j, null), 3);
                    AnalogTimePickerState analogTimePickerState = clockDialNode2.t;
                    float f = clockDialNode2.w;
                    float f2 = clockDialNode2.x;
                    float fT1 = DelegatableNodeKt.g(clockDialNode2).D.T1(TimePickerKt.e);
                    long j2 = clockDialNode2.y;
                    if (analogTimePickerState.e() == 0 && analogTimePickerState.getF1524a()) {
                        analogTimePickerState.c(((float) Math.hypot((double) (((float) ((int) (j2 >> 32))) - f), (double) (((float) ((int) (j2 & 4294967295L))) - f2))) < fT1);
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (DragGestureDetectorKt.f(pointerInputScope, null, function0, function2, this, 5) == coroutineSingletons) {
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
