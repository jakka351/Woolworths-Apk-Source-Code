package au.com.woolworths.shop.aem.components.ui.herobanner;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.aem.components.ui.herobanner.HeroBannerKt$HeroBannerHorizontalList$2$1", f = "HeroBanner.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HeroBannerKt$HeroBannerHorizontalList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ State q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroBannerKt$HeroBannerHorizontalList$2$1(Function1 function1, State state, Continuation continuation) {
        super(2, continuation);
        this.p = function1;
        this.q = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HeroBannerKt$HeroBannerHorizontalList$2$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        HeroBannerKt$HeroBannerHorizontalList$2$1 heroBannerKt$HeroBannerHorizontalList$2$1 = (HeroBannerKt$HeroBannerHorizontalList$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        heroBannerKt$HeroBannerHorizontalList$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        State state = this.q;
        if (((Number) state.getD()).intValue() > -1 && (function1 = this.p) != null) {
            function1.invoke(new Integer(((Number) state.getD()).intValue()));
        }
        return Unit.f24250a;
    }
}
