package au.com.woolworths.feature.shop.voc.score;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.voc.score.VocViewModel", f = "VocViewModel.kt", l = {95}, m = "showSurveyInitialState")
/* loaded from: classes3.dex */
final class VocViewModel$showSurveyInitialState$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ VocViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocViewModel$showSurveyInitialState$1(VocViewModel vocViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = vocViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.z6(this);
    }
}
