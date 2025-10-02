package au.com.woolworths.compose.utils.modifier;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.State;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
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
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1", f = "WaveBackgroundModifier.kt", l = {119, 120, 124, 125, 129, 145, 147, 163, 166, 167, 166, 167}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WaveBackgroundModifierKt$AnimatedPulseEffect$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ State r;
    public final /* synthetic */ Animatable s;
    public final /* synthetic */ float t;
    public final /* synthetic */ Animatable u;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$1", f = "WaveBackgroundModifier.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ Animatable q;
        public final /* synthetic */ float r;
        public final /* synthetic */ Animatable s;
        public final /* synthetic */ float t;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$1$1", f = "WaveBackgroundModifier.kt", l = {131}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ Animatable q;
            public final /* synthetic */ float r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00921(Animatable animatable, float f, Continuation continuation) {
                super(2, continuation);
                this.q = animatable;
                this.r = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00921(this.q, this.r, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00921) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i == 0) {
                    ResultKt.b(obj);
                    Float f = new Float(this.r);
                    TweenSpec tweenSpecE = AnimationSpecKt.e(800, 0, EasingKt.f756a, 2);
                    this.p = 1;
                    if (Animatable.d(this.q, f, tweenSpecE, null, null, this, 12) == coroutineSingletons) {
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

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$1$2", f = "WaveBackgroundModifier.kt", l = {137, 138}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ Animatable q;
            public final /* synthetic */ float r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Animatable animatable, float f, Continuation continuation) {
                super(2, continuation);
                this.q = animatable;
                this.r = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.q, this.r, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
            
                if (androidx.compose.animation.core.Animatable.d(r11.q, r5, r6, null, null, r11, 12) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r1 = r11.p
                    r2 = 1
                    r3 = 2
                    if (r1 == 0) goto L1c
                    if (r1 == r2) goto L18
                    if (r1 != r3) goto L10
                    kotlin.ResultKt.b(r12)
                    goto L4a
                L10:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L18:
                    kotlin.ResultKt.b(r12)
                    goto L2a
                L1c:
                    kotlin.ResultKt.b(r12)
                    r11.p = r2
                    r1 = 150(0x96, double:7.4E-322)
                    java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r1, r11)
                    if (r12 != r0) goto L2a
                    goto L49
                L2a:
                    java.lang.Float r5 = new java.lang.Float
                    float r12 = r11.r
                    r5.<init>(r12)
                    r12 = 0
                    androidx.compose.animation.core.CubicBezierEasing r1 = androidx.compose.animation.core.EasingKt.f756a
                    r2 = 850(0x352, float:1.191E-42)
                    androidx.compose.animation.core.TweenSpec r6 = androidx.compose.animation.core.AnimationSpecKt.e(r2, r12, r1, r3)
                    r11.p = r3
                    androidx.compose.animation.core.Animatable r4 = r11.q
                    r7 = 0
                    r8 = 0
                    r10 = 12
                    r9 = r11
                    java.lang.Object r12 = androidx.compose.animation.core.Animatable.d(r4, r5, r6, r7, r8, r9, r10)
                    if (r12 != r0) goto L4a
                L49:
                    return r0
                L4a:
                    kotlin.Unit r12 = kotlin.Unit.f24250a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Animatable animatable, float f, Animatable animatable2, float f2, Continuation continuation) {
            super(2, continuation);
            this.q = animatable;
            this.r = f;
            this.s = animatable2;
            this.t = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, this.r, this.s, this.t, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.p;
            BuildersKt.c(coroutineScope, null, null, new C00921(this.q, this.r, null), 3);
            return BuildersKt.c(coroutineScope, null, null, new AnonymousClass2(this.s, this.t, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$2", f = "WaveBackgroundModifier.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ Animatable q;
        public final /* synthetic */ float r;
        public final /* synthetic */ Animatable s;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$2$1", f = "WaveBackgroundModifier.kt", l = {149}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ Animatable q;
            public final /* synthetic */ float r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Animatable animatable, float f, Continuation continuation) {
                super(2, continuation);
                this.q = animatable;
                this.r = f;
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
                    Float f = new Float(this.r);
                    TweenSpec tweenSpecE = AnimationSpecKt.e(800, 0, EasingKt.f756a, 2);
                    this.p = 1;
                    if (Animatable.d(this.q, f, tweenSpecE, null, null, this, 12) == coroutineSingletons) {
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

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$2$2", f = "WaveBackgroundModifier.kt", l = {ModuleDescriptor.MODULE_VERSION, 156}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1$2$2, reason: invalid class name and collision with other inner class name */
        final class C00932 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int p;
            public final /* synthetic */ Animatable q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00932(Animatable animatable, Continuation continuation) {
                super(2, continuation);
                this.q = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00932(this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00932) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
            
                if (androidx.compose.animation.core.Animatable.d(r11.q, r5, r6, null, null, r11, 12) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r1 = r11.p
                    r2 = 1
                    r3 = 2
                    if (r1 == 0) goto L1c
                    if (r1 == r2) goto L18
                    if (r1 != r3) goto L10
                    kotlin.ResultKt.b(r12)
                    goto L49
                L10:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L18:
                    kotlin.ResultKt.b(r12)
                    goto L2a
                L1c:
                    kotlin.ResultKt.b(r12)
                    r11.p = r2
                    r1 = 150(0x96, double:7.4E-322)
                    java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r1, r11)
                    if (r12 != r0) goto L2a
                    goto L48
                L2a:
                    java.lang.Float r5 = new java.lang.Float
                    r12 = 0
                    r5.<init>(r12)
                    r12 = 0
                    androidx.compose.animation.core.CubicBezierEasing r1 = androidx.compose.animation.core.EasingKt.f756a
                    r2 = 850(0x352, float:1.191E-42)
                    androidx.compose.animation.core.TweenSpec r6 = androidx.compose.animation.core.AnimationSpecKt.e(r2, r12, r1, r3)
                    r11.p = r3
                    androidx.compose.animation.core.Animatable r4 = r11.q
                    r7 = 0
                    r8 = 0
                    r10 = 12
                    r9 = r11
                    java.lang.Object r12 = androidx.compose.animation.core.Animatable.d(r4, r5, r6, r7, r8, r9, r10)
                    if (r12 != r0) goto L49
                L48:
                    return r0
                L49:
                    kotlin.Unit r12 = kotlin.Unit.f24250a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1.AnonymousClass2.C00932.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Animatable animatable, float f, Animatable animatable2, Continuation continuation) {
            super(2, continuation);
            this.q = animatable;
            this.r = f;
            this.s = animatable2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.q, this.r, this.s, continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.p;
            BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(this.q, this.r, null), 3);
            return BuildersKt.c(coroutineScope, null, null, new C00932(this.s, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveBackgroundModifierKt$AnimatedPulseEffect$1$1(State state, Animatable animatable, float f, Animatable animatable2, float f2, float f3, Continuation continuation) {
        super(2, continuation);
        this.r = state;
        this.s = animatable;
        this.t = f;
        this.u = animatable2;
        this.v = f2;
        this.w = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WaveBackgroundModifierKt$AnimatedPulseEffect$1$1 waveBackgroundModifierKt$AnimatedPulseEffect$1$1 = new WaveBackgroundModifierKt$AnimatedPulseEffect$1$1(this.r, this.s, this.t, this.u, this.v, this.w, continuation);
        waveBackgroundModifierKt$AnimatedPulseEffect$1$1.q = obj;
        return waveBackgroundModifierKt$AnimatedPulseEffect$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WaveBackgroundModifierKt$AnimatedPulseEffect$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(800, r20) != r7) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9 A[Catch: all -> 0x0046, PHI: r0
  0x00e9: PHI (r0v31 kotlinx.coroutines.CoroutineScope) = 
  (r0v17 kotlinx.coroutines.CoroutineScope)
  (r0v21 kotlinx.coroutines.CoroutineScope)
  (r0v35 kotlinx.coroutines.CoroutineScope)
 binds: [B:42:0x00e5, B:25:0x0065, B:60:0x014d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0046, blocks: (B:12:0x0041, B:44:0x00e9, B:46:0x00ef, B:48:0x00fb, B:51:0x011d, B:54:0x012b, B:57:0x013d, B:17:0x004e, B:20:0x0057, B:23:0x0060), top: B:76:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:12:0x0041, B:44:0x00e9, B:46:0x00ef, B:48:0x00fb, B:51:0x011d, B:54:0x012b, B:57:0x013d, B:17:0x004e, B:20:0x0057, B:23:0x0060), top: B:76:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b A[Catch: all -> 0x0046, PHI: r0
  0x012b: PHI (r0v29 kotlinx.coroutines.CoroutineScope) = (r0v25 kotlinx.coroutines.CoroutineScope), (r0v30 kotlinx.coroutines.CoroutineScope) binds: [B:20:0x0057, B:52:0x0127] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0046, blocks: (B:12:0x0041, B:44:0x00e9, B:46:0x00ef, B:48:0x00fb, B:51:0x011d, B:54:0x012b, B:57:0x013d, B:17:0x004e, B:20:0x0057, B:23:0x0060), top: B:76:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d A[Catch: all -> 0x0046, PHI: r0
  0x013d: PHI (r0v28 kotlinx.coroutines.CoroutineScope) = (r0v27 kotlinx.coroutines.CoroutineScope), (r0v29 kotlinx.coroutines.CoroutineScope) binds: [B:17:0x004e, B:55:0x0139] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:12:0x0041, B:44:0x00e9, B:46:0x00ef, B:48:0x00fb, B:51:0x011d, B:54:0x012b, B:57:0x013d, B:17:0x004e, B:20:0x0057, B:23:0x0060), top: B:76:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c6 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0149 -> B:60:0x014d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$AnimatedPulseEffect$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
