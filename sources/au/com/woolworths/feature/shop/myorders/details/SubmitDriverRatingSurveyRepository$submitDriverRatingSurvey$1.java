package au.com.woolworths.feature.shop.myorders.details;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.SubmitDriverRatingSurveyRepository", f = "SubmitDriverRatingSurveyRepository.kt", l = {32}, m = "submitDriverRatingSurvey")
/* loaded from: classes3.dex */
final class SubmitDriverRatingSurveyRepository$submitDriverRatingSurvey$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SubmitDriverRatingSurveyRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitDriverRatingSurveyRepository$submitDriverRatingSurvey$1(SubmitDriverRatingSurveyRepository submitDriverRatingSurveyRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = submitDriverRatingSurveyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
