package au.com.woolworths.feature.shop.instore.navigation.map;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl", f = "InstoreNavigationInteractorImpl.kt", l = {146}, m = "fetchBuildingForStore")
/* loaded from: classes3.dex */
final class InstoreNavigationInteractorImpl$fetchBuildingForStore$1 extends ContinuationImpl {
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ InstoreNavigationInteractorImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreNavigationInteractorImpl$fetchBuildingForStore$1(InstoreNavigationInteractorImpl instoreNavigationInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = instoreNavigationInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.i(null, null, this);
    }
}
