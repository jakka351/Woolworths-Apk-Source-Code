package ovh.plrapps.mapcompose.ui.gestures;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PointerInputScope r;
    public final /* synthetic */ Function3 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ Function1 x;
    public final /* synthetic */ Function2 y;
    public final /* synthetic */ Function2 z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {61, 75, 93, 106, 121, 132}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1 A;
        public final /* synthetic */ Function1 B;
        public final /* synthetic */ Function1 C;
        public final /* synthetic */ Function2 D;
        public final /* synthetic */ Function2 E;
        public PointerInputChange q;
        public VelocityTracker r;
        public long s;
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ CoroutineScope v;
        public final /* synthetic */ Function3 w;
        public final /* synthetic */ Function1 x;
        public final /* synthetic */ Function1 y;
        public final /* synthetic */ PressGestureScopeImpl z;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {64}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        final class C04231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ PressGestureScopeImpl q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04231(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.q = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C04231(this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C04231) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i == 0) {
                    ResultKt.b(obj);
                    this.p = 1;
                    if (this.q.i(this) == coroutineSingletons) {
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
        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$11", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$11, reason: invalid class name */
        final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PressGestureScopeImpl p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.p = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass11(this.p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass11 anonymousClass11 = (AnonymousClass11) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass11.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                PressGestureScopeImpl pressGestureScopeImpl = this.p;
                pressGestureScopeImpl.f = true;
                pressGestureScopeImpl.g.c(null);
                return Unit.f24250a;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {67}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ Function3 q;
            public final /* synthetic */ PressGestureScopeImpl r;
            public final /* synthetic */ PointerInputChange s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function3 function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation continuation) {
                super(2, continuation);
                this.q = function3;
                this.r = pressGestureScopeImpl;
                this.s = pointerInputChange;
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
                    Offset offset = new Offset(this.s.c);
                    this.p = 1;
                    if (this.q.invoke(this.r, offset, this) == coroutineSingletons) {
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

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {76}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
        final class AnonymousClass3 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
            public int q;
            public /* synthetic */ Object r;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, continuation);
                anonymousClass3.r = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass3) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.q;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return obj;
                }
                ResultKt.b(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.r;
                this.q = 1;
                Function3 function3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f903a;
                Object objK = androidx.compose.foundation.gestures.TapGestureDetectorKt.k(awaitPointerEventScope, PointerEventPass.e, this);
                return objK == coroutineSingletons ? coroutineSingletons : objK;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
        final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PressGestureScopeImpl p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.p = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass4.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                PressGestureScopeImpl pressGestureScopeImpl = this.p;
                pressGestureScopeImpl.f = true;
                pressGestureScopeImpl.g.c(null);
                return Unit.f24250a;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
        final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PressGestureScopeImpl p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.p = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass5(this.p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass5.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                PressGestureScopeImpl pressGestureScopeImpl = this.p;
                pressGestureScopeImpl.e = true;
                pressGestureScopeImpl.g.c(null);
                return Unit.f24250a;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {113}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
        final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ PressGestureScopeImpl q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.q = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass6(this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i == 0) {
                    ResultKt.b(obj);
                    this.p = 1;
                    if (this.q.i(this) == coroutineSingletons) {
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
        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
        final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ Function3 q;
            public final /* synthetic */ PressGestureScopeImpl r;
            public final /* synthetic */ PointerInputChange s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(Function3 function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation continuation) {
                super(2, continuation);
                this.q = function3;
                this.r = pressGestureScopeImpl;
                this.s = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass7(this.q, this.r, this.s, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i == 0) {
                    ResultKt.b(obj);
                    Offset offset = new Offset(this.s.c);
                    this.p = 1;
                    if (this.q.invoke(this.r, offset, this) == coroutineSingletons) {
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
        @DebugMetadata(c = "ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
        final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PressGestureScopeImpl p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
                super(2, continuation);
                this.p = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass8(this.p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass8 anonymousClass8 = (AnonymousClass8) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass8.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                PressGestureScopeImpl pressGestureScopeImpl = this.p;
                pressGestureScopeImpl.e = true;
                pressGestureScopeImpl.g.c(null);
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CoroutineScope coroutineScope, Function3 function3, Function1 function1, Function1 function12, PressGestureScopeImpl pressGestureScopeImpl, Function1 function13, Function1 function14, Function1 function15, Function2 function2, Function2 function22, Continuation continuation) {
            super(2, continuation);
            this.v = coroutineScope;
            this.w = function3;
            this.x = function1;
            this.y = function12;
            this.z = pressGestureScopeImpl;
            this.A = function13;
            this.B = function14;
            this.C = function15;
            this.D = function2;
            this.E = function22;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, continuation);
            anonymousClass1.u = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x01b4, code lost:
        
            if (r8 != r0) goto L64;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[Catch: PointerEventTimeoutCancellationException -> 0x00d6, TRY_ENTER, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00d6, blocks: (B:28:0x00bc, B:29:0x00c5), top: B:119:0x00ba }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[Catch: PointerEventTimeoutCancellationException -> 0x00d6, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00d6, blocks: (B:28:0x00bc, B:29:0x00c5), top: B:119:0x00ba }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
        /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01b4 -> B:64:0x01b7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 772
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, Continuation continuation, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function2 function2, Function2 function22, Function3 function3) {
        super(2, continuation);
        this.r = pointerInputScope;
        this.s = function3;
        this.t = function1;
        this.u = function12;
        this.v = function13;
        this.w = function14;
        this.x = function15;
        this.y = function2;
        this.z = function22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.r, continuation, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.s);
        tapGestureDetectorKt$detectTapGestures$2.q = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            PointerInputScope pointerInputScope = this.r;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.s, this.t, this.u, new PressGestureScopeImpl(pointerInputScope), this.v, this.w, this.x, this.y, this.z, null);
            this.p = 1;
            if (ForEachGestureKt.c(pointerInputScope, anonymousClass1, this) == coroutineSingletons) {
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
