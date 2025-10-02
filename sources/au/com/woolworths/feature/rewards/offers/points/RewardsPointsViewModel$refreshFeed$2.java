package au.com.woolworths.feature.rewards.offers.points;

import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.rewards.base.homepage.HomeRefreshInteractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel$refreshFeed$2", f = "RewardsPointsViewModel.kt", l = {204}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsPointsViewModel$refreshFeed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public RewardsPointsViewModel p;
    public RewardsPointsContract.ViewState q;
    public Object r;
    public int s;
    public final /* synthetic */ RewardsPointsViewModel t;
    public final /* synthetic */ HomeRefreshInteractor.ContentRefreshNotifier u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPointsViewModel$refreshFeed$2(RewardsPointsViewModel rewardsPointsViewModel, HomeRefreshInteractor.ContentRefreshNotifier contentRefreshNotifier, Continuation continuation) {
        super(2, continuation);
        this.t = rewardsPointsViewModel;
        this.u = contentRefreshNotifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsPointsViewModel$refreshFeed$2(this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsPointsViewModel$refreshFeed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0183  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel$refreshFeed$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
