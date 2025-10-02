package au.com.woolworths.feature.shop.voc.score;

import au.com.woolworths.feature.shop.voc.VocRepository;
import au.com.woolworths.feature.shop.voc.data.SurveySubmitData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.voc.score.VocInteractor", f = "VocInteractor.kt", l = {35, 31}, m = "submitScore")
/* loaded from: classes3.dex */
final class VocInteractor$submitScore$1 extends ContinuationImpl {
    public SurveySubmitData p;
    public VocRepository q;
    public SurveySubmitData r;
    public String s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ VocInteractor v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocInteractor$submitScore$1(VocInteractor vocInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.v = vocInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, 0, this);
    }
}
