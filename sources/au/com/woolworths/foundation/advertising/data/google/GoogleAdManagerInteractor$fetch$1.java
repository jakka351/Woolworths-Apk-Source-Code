package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor", f = "GoogleAdManagerInteractor.kt", l = {45, 49}, m = "fetch")
/* loaded from: classes4.dex */
final class GoogleAdManagerInteractor$fetch$1 extends ContinuationImpl {
    public GoogleAdConsumer p;
    public FirebasePerfMonitor q;
    public /* synthetic */ Object r;
    public final /* synthetic */ GoogleAdManagerInteractor s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerInteractor$fetch$1(GoogleAdManagerInteractor googleAdManagerInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = googleAdManagerInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, null, this);
    }
}
