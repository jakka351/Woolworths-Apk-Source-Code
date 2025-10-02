package net.engawapg.lib.zoomable;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.unit.Velocity;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$endGesture$2", f = "ZoomState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomState$endGesture$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ ZoomState q;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$endGesture$2$1", f = "ZoomState.kt", l = {288}, m = "invokeSuspend")
    /* renamed from: net.engawapg.lib.zoomable.ZoomState$endGesture$2$1, reason: invalid class name */
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
                ZoomState zoomState = this.q;
                Animatable animatable = zoomState.d;
                Float f = new Float(Velocity.d(this.r));
                DecayAnimationSpec decayAnimationSpec = zoomState.b;
                this.p = 1;
                if (animatable.b(f, decayAnimationSpec, null, this) == coroutineSingletons) {
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
    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$endGesture$2$2", f = "ZoomState.kt", l = {293}, m = "invokeSuspend")
    /* renamed from: net.engawapg.lib.zoomable.ZoomState$endGesture$2$2, reason: invalid class name */
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
                ZoomState zoomState = this.q;
                Animatable animatable = zoomState.e;
                Float f = new Float(Velocity.e(this.r));
                DecayAnimationSpec decayAnimationSpec = zoomState.b;
                this.p = 1;
                if (animatable.b(f, decayAnimationSpec, null, this) == coroutineSingletons) {
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
    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$endGesture$2$3", f = "ZoomState.kt", l = {299}, m = "invokeSuspend")
    /* renamed from: net.engawapg.lib.zoomable.ZoomState$endGesture$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ZoomState q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ZoomState zoomState, Continuation continuation) {
            super(2, continuation);
            this.q = zoomState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.q, continuation);
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
                Float f = new Float(1.0f);
                this.p = 1;
                if (Animatable.d(animatable, f, null, null, null, this, 14) == coroutineSingletons) {
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
    public ZoomState$endGesture$2(ZoomState zoomState, Continuation continuation) {
        super(2, continuation);
        this.q = zoomState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZoomState$endGesture$2 zoomState$endGesture$2 = new ZoomState$endGesture$2(this.q, continuation);
        zoomState$endGesture$2.p = obj;
        return zoomState$endGesture$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ZoomState$endGesture$2 zoomState$endGesture$2 = (ZoomState$endGesture$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        zoomState$endGesture$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        ZoomState zoomState = this.q;
        long jB = zoomState.i.b();
        if (Velocity.d(jB) != BitmapDescriptorFactory.HUE_RED) {
            BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(zoomState, jB, null), 3);
        }
        if (Velocity.e(jB) != BitmapDescriptorFactory.HUE_RED) {
            BuildersKt.c(coroutineScope, null, null, new AnonymousClass2(zoomState, jB, null), 3);
        }
        if (((Number) zoomState.c.f()).floatValue() < 1.0f) {
            BuildersKt.c(coroutineScope, null, null, new AnonymousClass3(zoomState, null), 3);
        }
        return Unit.f24250a;
    }
}
