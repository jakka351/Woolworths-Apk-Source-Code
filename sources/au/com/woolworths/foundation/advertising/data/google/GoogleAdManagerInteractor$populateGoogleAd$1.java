package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor", f = "GoogleAdManagerInteractor.kt", l = {122}, m = "populateGoogleAd")
/* loaded from: classes4.dex */
final class GoogleAdManagerInteractor$populateGoogleAd$1 extends ContinuationImpl {
    public GoogleAdBannerCard p;
    public CopyOnWriteArrayList q;
    public /* synthetic */ Object r;
    public final /* synthetic */ GoogleAdManagerInteractor s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerInteractor$populateGoogleAd$1(GoogleAdManagerInteractor googleAdManagerInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = googleAdManagerInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return GoogleAdManagerInteractor.a(this.s, null, null, false, null, this);
    }
}
