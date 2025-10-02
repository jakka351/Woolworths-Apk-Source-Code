package au.com.woolworths.shop.cart.ui.quickadd;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferScreenKt$QuickAddOfferScreen$1$1", f = "QuickAddOfferScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class QuickAddOfferScreenKt$QuickAddOfferScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ QuickAddOfferViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickAddOfferScreenKt$QuickAddOfferScreen$1$1(QuickAddOfferViewModel quickAddOfferViewModel, Continuation continuation) {
        super(2, continuation);
        this.p = quickAddOfferViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuickAddOfferScreenKt$QuickAddOfferScreen$1$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        QuickAddOfferScreenKt$QuickAddOfferScreen$1$1 quickAddOfferScreenKt$QuickAddOfferScreen$1$1 = (QuickAddOfferScreenKt$QuickAddOfferScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        quickAddOfferScreenKt$QuickAddOfferScreen$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.p.q6();
        return Unit.f24250a;
    }
}
