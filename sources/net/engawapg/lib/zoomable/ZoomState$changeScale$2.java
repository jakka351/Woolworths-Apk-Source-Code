package net.engawapg.lib.zoomable;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
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
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$changeScale$2", f = "ZoomState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomState$changeScale$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ float q;
    public final /* synthetic */ ZoomState r;
    public final /* synthetic */ long s;
    public final /* synthetic */ SpringSpec t;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$changeScale$2$1", f = "ZoomState.kt", l = {236}, m = "invokeSuspend")
    /* renamed from: net.engawapg.lib.zoomable.ZoomState$changeScale$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ZoomState q;
        public final /* synthetic */ float r;
        public final /* synthetic */ SpringSpec s;
        public final /* synthetic */ Rect t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ZoomState zoomState, float f, SpringSpec springSpec, Rect rect, Continuation continuation) {
            super(2, continuation);
            this.q = zoomState;
            this.r = f;
            this.s = springSpec;
            this.t = rect;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            ZoomState zoomState = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                zoomState.d.j(null, null);
                Animatable animatable = zoomState.d;
                Float f = new Float(this.r);
                this.p = 1;
                anonymousClass1 = this;
                if (Animatable.d(animatable, f, this.s, null, null, anonymousClass1, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                anonymousClass1 = this;
            }
            Animatable animatable2 = zoomState.d;
            Rect rect = anonymousClass1.t;
            animatable2.j(new Float(rect.f1752a), new Float(rect.c));
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$changeScale$2$2", f = "ZoomState.kt", l = {243}, m = "invokeSuspend")
    /* renamed from: net.engawapg.lib.zoomable.ZoomState$changeScale$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ZoomState q;
        public final /* synthetic */ float r;
        public final /* synthetic */ SpringSpec s;
        public final /* synthetic */ Rect t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ZoomState zoomState, float f, SpringSpec springSpec, Rect rect, Continuation continuation) {
            super(2, continuation);
            this.q = zoomState;
            this.r = f;
            this.s = springSpec;
            this.t = rect;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.q, this.r, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass2 anonymousClass2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            ZoomState zoomState = this.q;
            if (i == 0) {
                ResultKt.b(obj);
                zoomState.e.j(null, null);
                Animatable animatable = zoomState.e;
                Float f = new Float(this.r);
                this.p = 1;
                anonymousClass2 = this;
                if (Animatable.d(animatable, f, this.s, null, null, anonymousClass2, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                anonymousClass2 = this;
            }
            Animatable animatable2 = zoomState.e;
            Rect rect = anonymousClass2.t;
            animatable2.j(new Float(rect.b), new Float(rect.d));
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "net.engawapg.lib.zoomable.ZoomState$changeScale$2$3", f = "ZoomState.kt", l = {248}, m = "invokeSuspend")
    /* renamed from: net.engawapg.lib.zoomable.ZoomState$changeScale$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ZoomState q;
        public final /* synthetic */ float r;
        public final /* synthetic */ SpringSpec s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ZoomState zoomState, float f, SpringSpec springSpec, Continuation continuation) {
            super(2, continuation);
            this.q = zoomState;
            this.r = f;
            this.s = springSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.q, this.r, this.s, continuation);
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
                if (Animatable.d(animatable, f, this.s, null, null, this, 12) == coroutineSingletons) {
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
    public ZoomState$changeScale$2(float f, ZoomState zoomState, long j, SpringSpec springSpec, Continuation continuation) {
        super(2, continuation);
        this.q = f;
        this.r = zoomState;
        this.s = j;
        this.t = springSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZoomState$changeScale$2 zoomState$changeScale$2 = new ZoomState$changeScale$2(this.q, this.r, this.s, this.t, continuation);
        zoomState$changeScale$2.p = obj;
        return zoomState$changeScale$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoomState$changeScale$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        ZoomState zoomState = this.r;
        zoomState.getClass();
        float fB = RangesKt.b(this.q, 1.0f, 3.0f);
        long jB = ZoomState.b(this.r, fB, this.s, 0L);
        Rect rectA = ZoomState.a(zoomState, fB);
        float fB2 = RangesKt.b(Offset.e(jB), rectA.f1752a, rectA.c);
        ZoomState zoomState2 = this.r;
        SpringSpec springSpec = this.t;
        BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(zoomState2, fB2, springSpec, rectA, null), 3);
        BuildersKt.c(coroutineScope, null, null, new AnonymousClass2(this.r, RangesKt.b(Offset.f(jB), rectA.b, rectA.d), springSpec, rectA, null), 3);
        return BuildersKt.c(coroutineScope, null, null, new AnonymousClass3(zoomState, fB, springSpec, null), 3);
    }
}
