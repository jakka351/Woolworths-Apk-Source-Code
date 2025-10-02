package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", l = {345}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WindowInsetsNestedScrollConnection$fling$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ WindowInsetsNestedScrollConnection r;
    public final /* synthetic */ int s;
    public final /* synthetic */ float t;
    public final /* synthetic */ SplineBasedFloatDecayAnimationSpec u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Ref.FloatRef x;
    public final /* synthetic */ WindowInsetsAnimationController y;
    public final /* synthetic */ boolean z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", l = {329}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ int q;
        public final /* synthetic */ float r;
        public final /* synthetic */ SplineBasedFloatDecayAnimationSpec s;
        public final /* synthetic */ int t;
        public final /* synthetic */ int u;
        public final /* synthetic */ WindowInsetsNestedScrollConnection v;
        public final /* synthetic */ Ref.FloatRef w;
        public final /* synthetic */ WindowInsetsAnimationController x;
        public final /* synthetic */ boolean y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, int i, int i2, int i3, WindowInsetsAnimationController windowInsetsAnimationController, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Continuation continuation, Ref.FloatRef floatRef, boolean z) {
            super(2, continuation);
            this.q = i;
            this.r = f;
            this.s = splineBasedFloatDecayAnimationSpec;
            this.t = i2;
            this.u = i3;
            this.v = windowInsetsNestedScrollConnection;
            this.w = floatRef;
            this.x = windowInsetsAnimationController;
            this.y = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.r, this.q, this.t, this.u, this.x, this.s, this.v, continuation, this.w, this.y);
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
                float f = this.q;
                final WindowInsetsAnimationController windowInsetsAnimationController = this.x;
                final boolean z = this.y;
                final int i2 = this.t;
                final int i3 = this.u;
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.v;
                final Ref.FloatRef floatRef = this.w;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        float fFloatValue = ((Number) obj2).floatValue();
                        float fFloatValue2 = ((Number) obj3).floatValue();
                        float f2 = i2;
                        float f3 = i3;
                        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
                        if (fFloatValue > f3 || f2 > fFloatValue) {
                            floatRef.d = fFloatValue2;
                            windowInsetsAnimationController.finish(z);
                            windowInsetsNestedScrollConnection2.h = null;
                            Job job = windowInsetsNestedScrollConnection2.l;
                            if (job != null) {
                                ((JobSupport) job).E(new WindowInsetsAnimationCancelledException());
                            }
                        } else {
                            WindowInsetsAnimationController windowInsetsAnimationController2 = windowInsetsNestedScrollConnection2.h;
                            if (windowInsetsAnimationController2 != null) {
                                windowInsetsAnimationController2.setInsetsAndAlpha(windowInsetsNestedScrollConnection2.f.e(windowInsetsAnimationController2.getCurrentInsets(), Math.round(fFloatValue)), 1.0f, BitmapDescriptorFactory.HUE_RED);
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (SuspendAnimationKt.d(f, this.r, this.s, function2, this) == coroutineSingletons) {
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
    public WindowInsetsNestedScrollConnection$fling$2(float f, int i, int i2, int i3, WindowInsetsAnimationController windowInsetsAnimationController, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Continuation continuation, Ref.FloatRef floatRef, boolean z) {
        super(2, continuation);
        this.r = windowInsetsNestedScrollConnection;
        this.s = i;
        this.t = f;
        this.u = splineBasedFloatDecayAnimationSpec;
        this.v = i2;
        this.w = i3;
        this.x = floatRef;
        this.y = windowInsetsAnimationController;
        this.z = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.t, this.s, this.v, this.w, this.y, this.u, this.r, continuation, this.x, this.z);
        windowInsetsNestedScrollConnection$fling$2.q = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            windowInsetsNestedScrollConnection.l = BuildersKt.c((CoroutineScope) this.q, null, null, new AnonymousClass1(this.t, this.s, this.v, this.w, this.y, this.u, windowInsetsNestedScrollConnection, null, this.x, this.z), 3);
            Job job = windowInsetsNestedScrollConnection.l;
            if (job != null) {
                this.p = 1;
                if (((JobSupport) job).join(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        windowInsetsNestedScrollConnection.l = null;
        return Unit.f24250a;
    }
}
