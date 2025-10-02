package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor", f = "GoogleAdManagerInteractor.kt", l = {220}, m = "fetchSingle")
/* loaded from: classes4.dex */
final class GoogleAdManagerInteractor$fetchSingle$1 extends ContinuationImpl {
    public GoogleAdBannerCard p;
    public /* synthetic */ Object q;
    public final /* synthetic */ GoogleAdManagerInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerInteractor$fetchSingle$1(GoogleAdManagerInteractor googleAdManagerInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = googleAdManagerInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.e(null, null, this);
    }
}
