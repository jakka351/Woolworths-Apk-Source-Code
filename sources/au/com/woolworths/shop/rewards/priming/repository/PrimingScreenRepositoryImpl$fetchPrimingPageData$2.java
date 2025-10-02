package au.com.woolworths.shop.rewards.priming.repository;

import au.com.woolworths.shop.rewards.priming.data.CvpItem;
import au.com.woolworths.shop.rewards.priming.data.PrimingScreenData;
import au.com.woolworths.shop.rewards.priming.data.TitleItem;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/rewards/priming/data/PrimingScreenData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.rewards.priming.repository.PrimingScreenRepositoryImpl$fetchPrimingPageData$2", f = "PrimingScreenRepositoryImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PrimingScreenRepositoryImpl$fetchPrimingPageData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PrimingScreenData>, Object> {
    public final /* synthetic */ boolean p;
    public final /* synthetic */ PrimingScreenRepositoryImpl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimingScreenRepositoryImpl$fetchPrimingPageData$2(boolean z, PrimingScreenRepositoryImpl primingScreenRepositoryImpl, Continuation continuation) {
        super(2, continuation);
        this.p = z;
        this.q = primingScreenRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PrimingScreenRepositoryImpl$fetchPrimingPageData$2(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PrimingScreenRepositoryImpl$fetchPrimingPageData$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return this.p ? new PrimingScreenData(new TitleItem(R.string.priming_title_sng, R.string.priming_subtitle_sng), CollectionsKt.R(new CvpItem(R.drawable.ic_edr_member_price, R.string.priming_cvp_sng_1), new CvpItem(R.drawable.ic_edr_boost, R.string.priming_cvp_sng_2), new CvpItem(R.drawable.ic_edr_point, R.string.priming_cvp_sng_3), new CvpItem(R.drawable.ic_edr_heart, R.string.priming_cvp_sng_4))) : new PrimingScreenData(new TitleItem(R.string.priming_title_generic, R.string.priming_subtitle_generic), CollectionsKt.R(new CvpItem(R.drawable.ic_edr_member_price, R.string.priming_cvp_generic_1), new CvpItem(R.drawable.ic_edr_heart, R.string.priming_cvp_generic_2), new CvpItem(R.drawable.ic_edr_point, R.string.priming_cvp_generic_3), new CvpItem(R.drawable.ic_edr_link, R.string.priming_cvp_generic_4)));
    }
}
