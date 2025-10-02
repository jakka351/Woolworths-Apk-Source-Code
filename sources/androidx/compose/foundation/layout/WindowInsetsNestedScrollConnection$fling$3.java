package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WindowInsetsNestedScrollConnection$fling$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ WindowInsetsNestedScrollConnection q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ float t;
    public final /* synthetic */ WindowInsetsAnimationController u;
    public final /* synthetic */ boolean v;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", l = {355}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ int q;
        public final /* synthetic */ int r;
        public final /* synthetic */ float s;
        public final /* synthetic */ WindowInsetsAnimationController t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ WindowInsetsNestedScrollConnection v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, int i, int i2, WindowInsetsAnimationController windowInsetsAnimationController, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Continuation continuation, boolean z) {
            super(2, continuation);
            this.q = i;
            this.r = i2;
            this.s = f;
            this.t = windowInsetsAnimationController;
            this.u = z;
            this.v = windowInsetsNestedScrollConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            WindowInsetsAnimationController windowInsetsAnimationController = this.t;
            boolean z = this.u;
            return new AnonymousClass1(this.s, this.q, this.r, windowInsetsAnimationController, this.v, continuation, z);
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
            final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.v;
            if (i == 0) {
                ResultKt.b(obj);
                Animatable animatableA = AnimatableKt.a(this.q);
                Float f = new Float(this.r);
                Float f2 = new Float(this.s);
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3.1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        float fFloatValue = ((Number) ((Animatable) obj2).f()).floatValue();
                        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
                        WindowInsetsAnimationController windowInsetsAnimationController = windowInsetsNestedScrollConnection2.h;
                        if (windowInsetsAnimationController != null) {
                            windowInsetsAnimationController.setInsetsAndAlpha(windowInsetsNestedScrollConnection2.f.e(windowInsetsAnimationController.getCurrentInsets(), Math.round(fFloatValue)), 1.0f, BitmapDescriptorFactory.HUE_RED);
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                anonymousClass1 = this;
                if (Animatable.d(animatableA, f, null, f2, function1, anonymousClass1, 2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                anonymousClass1 = this;
            }
            anonymousClass1.t.finish(anonymousClass1.u);
            windowInsetsNestedScrollConnection.h = null;
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$3(float f, int i, int i2, WindowInsetsAnimationController windowInsetsAnimationController, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Continuation continuation, boolean z) {
        super(2, continuation);
        this.q = windowInsetsNestedScrollConnection;
        this.r = i;
        this.s = i2;
        this.t = f;
        this.u = windowInsetsAnimationController;
        this.v = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.t, this.r, this.s, this.u, this.q, continuation, this.v);
        windowInsetsNestedScrollConnection$fling$3.p = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = (WindowInsetsNestedScrollConnection$fling$3) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        windowInsetsNestedScrollConnection$fling$3.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        WindowInsetsAnimationController windowInsetsAnimationController = this.u;
        boolean z = this.v;
        float f = this.t;
        int i = this.r;
        int i2 = this.s;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.q;
        windowInsetsNestedScrollConnection.l = BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(f, i, i2, windowInsetsAnimationController, windowInsetsNestedScrollConnection, null, z), 3);
        return Unit.f24250a;
    }
}
