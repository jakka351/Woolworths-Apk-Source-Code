package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$performClick$2", f = "GoogleAdManagerInteractor.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleAdManagerInteractor$performClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ GoogleAdManagerInteractor q;
    public final /* synthetic */ GoogleAdBannerCard r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerInteractor$performClick$2(GoogleAdManagerInteractor googleAdManagerInteractor, GoogleAdBannerCard googleAdBannerCard, Continuation continuation) {
        super(2, continuation);
        this.q = googleAdManagerInteractor;
        this.r = googleAdBannerCard;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoogleAdManagerInteractor$performClick$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleAdManagerInteractor$performClick$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        GoogleAdManagerRepository googleAdManagerRepository = this.q.f8399a;
        this.p = 1;
        googleAdManagerRepository.getClass();
        GoogleAdBannerCard googleAdBannerCard = this.r;
        String adUnitId = googleAdBannerCard.getAdUnitId();
        String templateId = googleAdBannerCard.getTemplateId();
        GoogleAdCustomTargeting targeting = googleAdBannerCard.getTargeting();
        googleAdManagerRepository.c.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(MainDispatcherLoader.f24726a, new GoogleAdManagerRepository$performClick$4(googleAdManagerRepository, adUnitId, templateId, targeting, null), this);
        if (objF != coroutineSingletons) {
            objF = unit;
        }
        return objF == coroutineSingletons ? coroutineSingletons : unit;
    }
}
