package au.com.woolworths.feature.shop.voc.freetext;

import au.com.woolworths.feature.shop.voc.VocRepository;
import au.com.woolworths.feature.shop.voc.data.SurveySubmitData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.voc.freetext.VocFreeTextInteractor", f = "VocFreeTextInteractor.kt", l = {32, 28}, m = "sendComment")
/* loaded from: classes3.dex */
final class VocFreeTextInteractor$sendComment$1 extends ContinuationImpl {
    public SurveySubmitData p;
    public VocRepository q;
    public SurveySubmitData r;
    public String s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ VocFreeTextInteractor v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocFreeTextInteractor$sendComment$1(VocFreeTextInteractor vocFreeTextInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.v = vocFreeTextInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(null, 0, null, this);
    }
}
