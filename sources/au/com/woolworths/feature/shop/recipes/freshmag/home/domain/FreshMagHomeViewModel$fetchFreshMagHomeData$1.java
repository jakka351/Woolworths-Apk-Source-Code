package au.com.woolworths.feature.shop.recipes.freshmag.home.domain;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagHomeData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeInteractor;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeContract;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeErrorState;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel$fetchFreshMagHomeData$1", f = "FreshMagHomeViewModel.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FreshMagHomeViewModel$fetchFreshMagHomeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FreshMagHomeViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshMagHomeViewModel$fetchFreshMagHomeData$1(FreshMagHomeViewModel freshMagHomeViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = freshMagHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreshMagHomeViewModel$fetchFreshMagHomeData$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FreshMagHomeViewModel$fetchFreshMagHomeData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FreshMagHomeViewModel freshMagHomeViewModel = this.q;
        AnalyticsManager analyticsManager = freshMagHomeViewModel.g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                FreshMagHomeInteractor freshMagHomeInteractor = freshMagHomeViewModel.e;
                this.p = 1;
                obj = freshMagHomeInteractor.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            FreshMagHomeData freshMagHomeData = (FreshMagHomeData) obj;
            FreshMagHomeViewModel.p6(freshMagHomeViewModel, freshMagHomeData);
            FreshMagHomeViewModel.r6(freshMagHomeViewModel, FreshMagHomeContract.PageState.e, freshMagHomeData, null);
        } catch (NoConnectivityException unused) {
            analyticsManager.c(FreshMagHomeAction.f);
            FreshMagHomeViewModel.r6(freshMagHomeViewModel, FreshMagHomeContract.PageState.f, null, FreshMagHomeErrorState.d);
        } catch (ServerErrorException unused2) {
            analyticsManager.c(FreshMagHomeAction.g);
            FreshMagHomeViewModel.r6(freshMagHomeViewModel, FreshMagHomeContract.PageState.f, null, FreshMagHomeErrorState.e);
        } catch (FreshMagHomeInteractor.NoContentException unused3) {
            analyticsManager.c(FreshMagHomeAction.e);
            FreshMagHomeViewModel.r6(freshMagHomeViewModel, FreshMagHomeContract.PageState.f, null, FreshMagHomeErrorState.f);
        }
        return Unit.f24250a;
    }
}
