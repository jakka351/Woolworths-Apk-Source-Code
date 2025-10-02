package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", l = {1006}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SliderKt$sliderTapModifier$2$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ float s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ State u;
    public final /* synthetic */ CoroutineScope v;
    public final /* synthetic */ DraggableState w;
    public final /* synthetic */ MutableState x;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "pos", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1", f = "Slider.kt", l = {1011}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ PressGestureScope q;
        public /* synthetic */ long r;
        public final /* synthetic */ boolean s;
        public final /* synthetic */ float t;
        public final /* synthetic */ MutableState u;
        public final /* synthetic */ State v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, float f, MutableState mutableState, State state, Continuation continuation) {
            super(3, continuation);
            this.s = z;
            this.t = f;
            this.u = mutableState;
            this.v = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            long j = ((Offset) obj2).f1751a;
            MutableState mutableState = this.u;
            State state = this.v;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.s, this.t, mutableState, state, (Continuation) obj3);
            anonymousClass1.q = (PressGestureScope) obj;
            anonymousClass1.r = j;
            return anonymousClass1.invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            MutableState mutableState = this.u;
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    PressGestureScope pressGestureScope = this.q;
                    long j = this.r;
                    mutableState.setValue(new Float((this.s ? this.t - Offset.e(j) : Offset.e(j)) - ((Number) this.v.getD()).floatValue()));
                    this.p = 1;
                    if (pressGestureScope.r0(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
            } catch (GestureCancellationException unused) {
                mutableState.setValue(new Float(BitmapDescriptorFactory.HUE_RED));
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderTapModifier$2$1$1(boolean z, float f, MutableState mutableState, State state, CoroutineScope coroutineScope, DraggableState draggableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.r = z;
        this.s = f;
        this.t = mutableState;
        this.u = state;
        this.v = coroutineScope;
        this.w = draggableState;
        this.x = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SliderKt$sliderTapModifier$2$1$1 sliderKt$sliderTapModifier$2$1$1 = new SliderKt$sliderTapModifier$2$1$1(this.r, this.s, this.t, this.u, this.v, this.w, this.x, continuation);
        sliderKt$sliderTapModifier$2$1$1.q = obj;
        return sliderKt$sliderTapModifier$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderKt$sliderTapModifier$2$1$1) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.q;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, this.u, null);
            final DraggableState draggableState = this.w;
            final MutableState mutableState = this.x;
            final CoroutineScope coroutineScope = this.v;
            Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1.2

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1", f = "Slider.kt", l = {1018}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1, reason: invalid class name */
                final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ DraggableState q;
                    public final /* synthetic */ MutableState r;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
                    final class C00451 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                        public /* synthetic */ Object p;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            C00451 c00451 = new C00451(2, continuation);
                            c00451.p = obj;
                            return c00451;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            C00451 c00451 = (C00451) create((DragScope) obj, (Continuation) obj2);
                            Unit unit = Unit.f24250a;
                            c00451.invokeSuspend(unit);
                            return unit;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                            ResultKt.b(obj);
                            ((DragScope) this.p).a(BitmapDescriptorFactory.HUE_RED);
                            return Unit.f24250a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(DraggableState draggableState, MutableState mutableState, Continuation continuation) {
                        super(2, continuation);
                        this.q = draggableState;
                        this.r = mutableState;
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
                            MutatePriority mutatePriority = MutatePriority.e;
                            C00451 c00451 = new C00451(2, null);
                            this.p = 1;
                            if (this.q.a(mutatePriority, c00451, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj);
                        }
                        ((Function1) this.r.getD()).invoke(new Float(BitmapDescriptorFactory.HUE_RED));
                        return Unit.f24250a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    long j = ((Offset) obj2).f1751a;
                    BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(draggableState, mutableState, null), 3);
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
