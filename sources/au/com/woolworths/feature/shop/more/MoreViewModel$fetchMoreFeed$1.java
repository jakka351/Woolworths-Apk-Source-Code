package au.com.woolworths.feature.shop.more;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.more.data.MoreDeliveryUnlimitedUnavailable;
import au.com.woolworths.feature.shop.more.data.MoreFeed;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.more.MoreViewModel$fetchMoreFeed$1", f = "MoreViewModel.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MoreViewModel$fetchMoreFeed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public MoreViewModel p;
    public int q;
    public final /* synthetic */ MoreViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreViewModel$fetchMoreFeed$1(MoreViewModel moreViewModel, Continuation continuation) {
        super(2, continuation);
        this.r = moreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MoreViewModel$fetchMoreFeed$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreViewModel$fetchMoreFeed$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MoreViewModel moreViewModel;
        MoreViewModel moreViewModel2 = this.r;
        AnalyticsManager analyticsManager = moreViewModel2.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    MoreInteractor moreInteractor = moreViewModel2.l;
                    this.p = moreViewModel2;
                    this.q = 1;
                    obj = moreInteractor.a(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    moreViewModel = moreViewModel2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    moreViewModel = this.p;
                    ResultKt.b(obj);
                }
                moreViewModel.C = (MoreFeed) obj;
                MoreViewModel.q6(moreViewModel2, moreViewModel2.C);
            } catch (NoConnectivityException unused) {
                moreViewModel2.D = new MoreDeliveryUnlimitedUnavailable(new ResText(com.woolworths.R.string.more_delivery_unlimited));
            } catch (ServerErrorException unused2) {
                moreViewModel2.D = new MoreDeliveryUnlimitedUnavailable(new ResText(com.woolworths.R.string.more_delivery_unlimited));
            }
            return Unit.f24250a;
        } finally {
            analyticsManager.a(Screens.k);
            moreViewModel2.r6(null);
        }
    }
}
