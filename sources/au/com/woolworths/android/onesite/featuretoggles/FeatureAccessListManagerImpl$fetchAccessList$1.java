package au.com.woolworths.android.onesite.featuretoggles;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManagerImpl", f = "FeatureAccessListManagerImpl.kt", l = {50}, m = "fetchAccessList")
/* loaded from: classes3.dex */
final class FeatureAccessListManagerImpl$fetchAccessList$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ FeatureAccessListManagerImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureAccessListManagerImpl$fetchAccessList$1(FeatureAccessListManagerImpl featureAccessListManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = featureAccessListManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        this.q.b(this);
        throw null;
    }
}
