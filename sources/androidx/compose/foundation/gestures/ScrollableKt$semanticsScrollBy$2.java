package androidx.compose.foundation.gestures;

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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1024}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ScrollingLogic r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Ref.FloatRef t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j, Ref.FloatRef floatRef, Continuation continuation) {
        super(2, continuation);
        this.r = scrollingLogic;
        this.s = j;
        this.t = floatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.r, this.s, this.t, continuation);
        scrollableKt$semanticsScrollBy$2.q = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableKt$semanticsScrollBy$2) create((NestedScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.q;
            long j = this.s;
            final ScrollingLogic scrollingLogic = this.r;
            float fG = scrollingLogic.g(j);
            final Ref.FloatRef floatRef = this.t;
            Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    float fFloatValue = ((Number) obj2).floatValue();
                    ((Number) obj3).floatValue();
                    Ref.FloatRef floatRef2 = floatRef;
                    float f = fFloatValue - floatRef2.d;
                    ScrollingLogic scrollingLogic2 = scrollingLogic;
                    floatRef2.d += scrollingLogic2.d(scrollingLogic2.g(nestedScrollScope.b(scrollingLogic2.h(scrollingLogic2.d(f)))));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (SuspendAnimationKt.c(BitmapDescriptorFactory.HUE_RED, fG, null, function2, this, 12) == coroutineSingletons) {
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
