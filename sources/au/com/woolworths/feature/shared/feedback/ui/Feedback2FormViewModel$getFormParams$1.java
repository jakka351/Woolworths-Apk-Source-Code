package au.com.woolworths.feature.shared.feedback.ui;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel", f = "Feedback2FormViewModel.kt", l = {66}, m = "getFormParams")
/* loaded from: classes3.dex */
final class Feedback2FormViewModel$getFormParams$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ Feedback2FormViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Feedback2FormViewModel$getFormParams$1(Feedback2FormViewModel feedback2FormViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = feedback2FormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.r6(null, this);
    }
}
