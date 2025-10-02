package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBanner;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdBanner;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$fetch$2$banner$1", f = "GoogleAdManagerInteractor.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleAdManagerInteractor$fetch$2$banner$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GoogleAdBanner>, Object> {
    public int p;
    public final /* synthetic */ GoogleAdManagerInteractor q;
    public final /* synthetic */ GoogleAdBannerCard r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerInteractor$fetch$2$banner$1(GoogleAdManagerInteractor googleAdManagerInteractor, GoogleAdBannerCard googleAdBannerCard, Continuation continuation) {
        super(2, continuation);
        this.q = googleAdManagerInteractor;
        this.r = googleAdBannerCard;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoogleAdManagerInteractor$fetch$2$banner$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleAdManagerInteractor$fetch$2$banner$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        GoogleAdManagerRepository googleAdManagerRepository = this.q.f8399a;
        this.p = 1;
        googleAdManagerRepository.getClass();
        GoogleAdBannerCard googleAdBannerCard = this.r;
        Object objB = googleAdManagerRepository.b(googleAdBannerCard.getAdUnitId(), googleAdBannerCard.getTemplateId(), googleAdBannerCard.getTargeting(), googleAdBannerCard.getCorrelator(), GoogleAdBanner.class, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
