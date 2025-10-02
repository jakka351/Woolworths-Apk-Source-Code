package au.com.woolworths.feature.shop.more;

import au.com.woolworths.feature.shop.more.MoreContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.more.MoreViewModel$onRowItemClicked$2", f = "MoreViewModel.kt", l = {258}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MoreViewModel$onRowItemClicked$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MoreViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreViewModel$onRowItemClicked$2(MoreViewModel moreViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = moreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoreViewModel$onRowItemClicked$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreViewModel$onRowItemClicked$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            MoreViewModel moreViewModel = this.q;
            if (moreViewModel.k.c(MoreFeature.d)) {
                moreViewModel.v.f(MoreContract.Actions.LaunchMyAccount.f7566a);
            } else {
                this.p = 1;
                if (MoreViewModel.p6(moreViewModel, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
