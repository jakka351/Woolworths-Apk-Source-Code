package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.internal.DragGestureDetectorCopyKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", l = {1651}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ RangeSliderState r;
    public final /* synthetic */ MutableInteractionSource s;
    public final /* synthetic */ MutableInteractionSource t;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {1652}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ PointerInputScope r;
        public final /* synthetic */ RangeSliderState s;
        public final /* synthetic */ RangeSliderLogic t;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {1653, 1665, 1687}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00611 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public Object q;
            public DragInteraction.Start r;
            public Ref.FloatRef s;
            public Ref.BooleanRef t;
            public int u;
            public /* synthetic */ Object v;
            public final /* synthetic */ RangeSliderState w;
            public final /* synthetic */ RangeSliderLogic x;
            public final /* synthetic */ CoroutineScope y;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", l = {1705}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
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
                        MutableInteractionSource mutableInteractionSource = z ? rangeSliderLogic.b : rangeSliderLogic.c;
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
            public C00611(RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, CoroutineScope coroutineScope, Continuation continuation) {
                super(2, continuation);
                this.w = rangeSliderState;
                this.x = rangeSliderLogic;
                this.y = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00611 c00611 = new C00611(this.w, this.x, this.y, continuation);
                c00611.v = obj;
                return c00611;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00611) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.u;
                if (i == 0) {
                    ResultKt.b(obj);
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.v;
                    this.v = awaitPointerEventScope;
                    this.u = 1;
                    obj = TapGestureDetectorKt.c(awaitPointerEventScope, false, this, 2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.q;
                            DragInteraction.Start start = (DragInteraction.Start) this.v;
                            try {
                                ResultKt.b(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    new DragInteraction.Stop(start);
                                } else {
                                    new DragInteraction.Cancel(start);
                                }
                            } catch (CancellationException unused) {
                                new DragInteraction.Cancel(start);
                            }
                            boolean z = booleanRef.d;
                            throw null;
                        }
                        Ref.BooleanRef booleanRef2 = this.t;
                        Ref.FloatRef floatRef = this.s;
                        PointerInputChange pointerInputChange = (PointerInputChange) this.q;
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.v;
                        ResultKt.b(obj);
                        if (((Pair) obj) == null) {
                            boolean z2 = booleanRef2.d;
                            float f = floatRef.d;
                            if (z2) {
                                throw null;
                            }
                            throw null;
                        }
                        ViewConfiguration viewConfiguration = awaitPointerEventScope2.getViewConfiguration();
                        int i2 = pointerInputChange.i;
                        float f2 = DragGestureDetectorCopyKt.f1555a;
                        if (i2 != 2) {
                            viewConfiguration.b();
                            throw null;
                        }
                        viewConfiguration.b();
                        float f3 = DragGestureDetectorCopyKt.f1555a;
                        throw null;
                    }
                    ResultKt.b(obj);
                }
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, Continuation continuation) {
            super(2, continuation);
            this.r = pointerInputScope;
            this.s = rangeSliderState;
            this.t = rangeSliderLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, continuation);
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
                C00611 c00611 = new C00611(this.s, this.t, coroutineScope, null);
                this.p = 1;
                if (ForEachGestureKt.c(this.r, c00611, this) == coroutineSingletons) {
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
    public SliderKt$rangeSliderPressDragModifier$1(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Continuation continuation) {
        super(2, continuation);
        this.r = rangeSliderState;
        this.s = mutableInteractionSource;
        this.t = mutableInteractionSource2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.r, this.s, this.t, continuation);
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
            MutableInteractionSource mutableInteractionSource = this.s;
            MutableInteractionSource mutableInteractionSource2 = this.t;
            RangeSliderState rangeSliderState = this.r;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, rangeSliderState, new RangeSliderLogic(rangeSliderState, mutableInteractionSource, mutableInteractionSource2), null);
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
