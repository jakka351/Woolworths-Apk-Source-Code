package au.com.woolworths.feature.rewards.offers.home;

import au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeContract;
import au.com.woolworths.rewards.base.homepage.HomeRefreshInteractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.math.Primes;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel$refreshFeed$2", f = "RewardsOffersHomeViewModel.kt", l = {Primes.SMALL_FACTOR_LIMIT}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsOffersHomeViewModel$refreshFeed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public RewardsOffersHomeViewModel p;
    public RewardsOffersHomeContract.ViewState q;
    public Object r;
    public int s;
    public final /* synthetic */ RewardsOffersHomeViewModel t;
    public final /* synthetic */ HomeRefreshInteractor.ContentRefreshNotifier u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOffersHomeViewModel$refreshFeed$2(RewardsOffersHomeViewModel rewardsOffersHomeViewModel, HomeRefreshInteractor.ContentRefreshNotifier contentRefreshNotifier, Continuation continuation) {
        super(2, continuation);
        this.t = rewardsOffersHomeViewModel;
        this.u = contentRefreshNotifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOffersHomeViewModel$refreshFeed$2(this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsOffersHomeViewModel$refreshFeed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0242  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.home.RewardsOffersHomeViewModel$refreshFeed$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
