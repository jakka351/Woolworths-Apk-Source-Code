package androidx.compose.material;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", l = {1082}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ MutableInteractionSource r;
    public final /* synthetic */ MutableInteractionSource s;
    public final /* synthetic */ State t;
    public final /* synthetic */ State u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ float x;
    public final /* synthetic */ MutableState y;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {1083}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ PointerInputScope r;
        public final /* synthetic */ boolean s;
        public final /* synthetic */ float t;
        public final /* synthetic */ RangeSliderLogic u;
        public final /* synthetic */ State v;
        public final /* synthetic */ MutableState w;
        public final /* synthetic */ State x;
        public final /* synthetic */ MutableState y;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {1084, 1095, 1117}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00441 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ CoroutineScope A;
            public final /* synthetic */ MutableState B;
            public final /* synthetic */ State C;
            public final /* synthetic */ MutableState D;
            public Object q;
            public DragInteraction.Start r;
            public Ref.FloatRef s;
            public Ref.BooleanRef t;
            public int u;
            public /* synthetic */ Object v;
            public final /* synthetic */ boolean w;
            public final /* synthetic */ float x;
            public final /* synthetic */ RangeSliderLogic y;
            public final /* synthetic */ State z;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", l = {1135}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
            final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int p;
                public final /* synthetic */ RangeSliderLogic q;
                public final /* synthetic */ Ref.BooleanRef r;
                public final /* synthetic */ DragInteraction s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation continuation) {
                    super(2, continuation);
                    this.q = rangeSliderLogic;
                    this.r = booleanRef;
                    this.s = dragInteraction;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass2(this.q, this.r, this.s, continuation);
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
                        boolean z = this.r.d;
                        RangeSliderLogic rangeSliderLogic = this.q;
                        MutableInteractionSource mutableInteractionSource = z ? rangeSliderLogic.f1312a : rangeSliderLogic.b;
                        this.p = 1;
                        if (mutableInteractionSource.b(this.s, this) == coroutineSingletons) {
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
            public C00441(boolean z, float f, RangeSliderLogic rangeSliderLogic, State state, CoroutineScope coroutineScope, MutableState mutableState, State state2, MutableState mutableState2, Continuation continuation) {
                super(2, continuation);
                this.w = z;
                this.x = f;
                this.y = rangeSliderLogic;
                this.z = state;
                this.A = coroutineScope;
                this.B = mutableState;
                this.C = state2;
                this.D = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00441 c00441 = new C00441(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, continuation);
                c00441.v = obj;
                return c00441;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00441) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0178  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0183  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01b8  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01c1 A[Catch: CancellationException -> 0x01c7, TryCatch #2 {CancellationException -> 0x01c7, blocks: (B:64:0x01b9, B:66:0x01c1, B:68:0x01c9), top: B:80:0x01b9 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x01c9 A[Catch: CancellationException -> 0x01c7, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x01c7, blocks: (B:64:0x01b9, B:66:0x01c1, B:68:0x01c9), top: B:80:0x01b9 }] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 502
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00441.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, boolean z, float f, RangeSliderLogic rangeSliderLogic, State state, MutableState mutableState, State state2, MutableState mutableState2, Continuation continuation) {
            super(2, continuation);
            this.r = pointerInputScope;
            this.s = z;
            this.t = f;
            this.u = rangeSliderLogic;
            this.v = state;
            this.w = mutableState;
            this.x = state2;
            this.y = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, continuation);
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
                C00441 c00441 = new C00441(this.s, this.t, this.u, this.v, (CoroutineScope) this.q, this.w, this.x, this.y, null);
                this.p = 1;
                if (ForEachGestureKt.c(this.r, c00441, this) == coroutineSingletons) {
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
    public SliderKt$rangeSliderPressDragModifier$1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State state, State state2, MutableState mutableState, boolean z, float f, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.r = mutableInteractionSource;
        this.s = mutableInteractionSource2;
        this.t = state;
        this.u = state2;
        this.v = mutableState;
        this.w = z;
        this.x = f;
        this.y = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, continuation);
        sliderKt$rangeSliderPressDragModifier$1.q = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderKt$rangeSliderPressDragModifier$1) create((PointerInputScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.q;
            MutableInteractionSource mutableInteractionSource = this.r;
            MutableInteractionSource mutableInteractionSource2 = this.s;
            State state = this.t;
            State state2 = this.u;
            MutableState mutableState = this.v;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.w, this.x, new RangeSliderLogic(mutableInteractionSource, mutableInteractionSource2, state, state2, mutableState), state, this.y, state2, mutableState, null);
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
