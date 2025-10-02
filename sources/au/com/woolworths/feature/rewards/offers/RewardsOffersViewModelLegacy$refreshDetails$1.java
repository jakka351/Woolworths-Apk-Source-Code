package au.com.woolworths.feature.rewards.offers;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy$refreshDetails$1", f = "RewardsOffersViewModelLegacy.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsOffersViewModelLegacy$refreshDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public MutableLiveData p;
    public MutableLiveData q;
    public int r;
    public final /* synthetic */ RewardsOffersViewModelLegacy s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOffersViewModelLegacy$refreshDetails$1(RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy, Continuation continuation) {
        super(2, continuation);
        this.s = rewardsOffersViewModelLegacy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOffersViewModelLegacy$refreshDetails$1(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsOffersViewModelLegacy$refreshDetails$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.lifecycle.MutableLiveData] */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.lifecycle.MutableLiveData] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy$refreshDetails$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
