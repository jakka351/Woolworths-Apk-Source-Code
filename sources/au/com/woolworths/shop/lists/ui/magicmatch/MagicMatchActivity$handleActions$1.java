package au.com.woolworths.shop.lists.ui.magicmatch;

import android.content.Intent;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchActivity;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchActivity$handleActions$1", f = "MagicMatchActivity.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MagicMatchActivity$handleActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MagicMatchActivity q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicMatchActivity$handleActions$1(MagicMatchActivity magicMatchActivity, Continuation continuation) {
        super(2, continuation);
        this.q = magicMatchActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MagicMatchActivity$handleActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MagicMatchActivity$handleActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            MagicMatchActivity.Companion companion = MagicMatchActivity.z;
            final MagicMatchActivity magicMatchActivity = this.q;
            Flow flow = ((MagicMatchViewModel) magicMatchActivity.y.getD()).j;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchActivity$handleActions$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    if (!(((MagicMatchContract.Action) obj2) instanceof MagicMatchContract.Action.FinishWithResult)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MagicMatchActivity.Companion companion2 = MagicMatchActivity.z;
                    MagicMatchActivity magicMatchActivity2 = magicMatchActivity;
                    magicMatchActivity2.getClass();
                    magicMatchActivity2.setResult(-1, new Intent());
                    magicMatchActivity2.finish();
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
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
