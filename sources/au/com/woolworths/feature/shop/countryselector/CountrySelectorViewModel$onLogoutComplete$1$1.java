package au.com.woolworths.feature.shop.countryselector;

import au.com.woolworths.android.onesite.modules.common.Region;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel$onLogoutComplete$1$1", f = "CountrySelectorViewModel.kt", l = {101, 102}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CountrySelectorViewModel$onLogoutComplete$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CountrySelectorViewModel q;
    public final /* synthetic */ Region r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySelectorViewModel$onLogoutComplete$1$1(CountrySelectorViewModel countrySelectorViewModel, Region region, Continuation continuation) {
        super(2, continuation);
        this.q = countrySelectorViewModel;
        this.r = region;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CountrySelectorViewModel$onLogoutComplete$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CountrySelectorViewModel$onLogoutComplete$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        CountrySelectorViewModel countrySelectorViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            CountrySelectorInteractorImpl countrySelectorInteractorImpl = countrySelectorViewModel.f;
            this.p = 1;
            Object objH = countrySelectorInteractorImpl.b.h(this);
            if (objH != coroutineSingletons) {
                objH = unit;
            }
            if (objH != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.b(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.p = 2;
        return CountrySelectorViewModel.p6(countrySelectorViewModel, this.r, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
