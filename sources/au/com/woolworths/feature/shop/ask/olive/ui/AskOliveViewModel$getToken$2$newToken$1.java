package au.com.woolworths.feature.shop.ask.olive.ui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel$getToken$2$newToken$1", f = "AskOliveViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AskOliveViewModel$getToken$2$newToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public final /* synthetic */ AskOliveViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskOliveViewModel$getToken$2$newToken$1(AskOliveViewModel askOliveViewModel, Continuation continuation) {
        super(2, continuation);
        this.p = askOliveViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskOliveViewModel$getToken$2$newToken$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AskOliveViewModel$getToken$2$newToken$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return this.p.k.d(null);
    }
}
