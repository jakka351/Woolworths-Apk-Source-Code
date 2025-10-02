package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.UniversalInventoryContainerData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor", f = "GoogleAdManagerInteractor.kt", l = {236}, m = "fetchGoogleAdBannerOrFallback")
/* loaded from: classes4.dex */
final class GoogleAdManagerInteractor$fetchGoogleAdBannerOrFallback$1 extends ContinuationImpl {
    public UniversalInventoryContainerData p;
    public GoogleAdBannerCard q;
    public /* synthetic */ Object r;
    public final /* synthetic */ GoogleAdManagerInteractor s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerInteractor$fetchGoogleAdBannerOrFallback$1(GoogleAdManagerInteractor googleAdManagerInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = googleAdManagerInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.d(null, null, this);
    }
}
