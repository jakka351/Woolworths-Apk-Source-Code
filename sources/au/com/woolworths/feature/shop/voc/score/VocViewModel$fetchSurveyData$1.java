package au.com.woolworths.feature.shop.voc.score;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.voc.score.VocViewModel", f = "VocViewModel.kt", l = {88}, m = "fetchSurveyData")
/* loaded from: classes3.dex */
final class VocViewModel$fetchSurveyData$1 extends ContinuationImpl {
    public VocViewModel p;
    public /* synthetic */ Object q;
    public final /* synthetic */ VocViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocViewModel$fetchSurveyData$1(VocViewModel vocViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = vocViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return VocViewModel.q6(this.r, this);
    }
}
