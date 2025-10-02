package au.com.woolworths.feature.shop.instore.navigation.map;

import au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl", f = "InstoreNavigationInteractorImpl.kt", l = {120, 139}, m = "fetchMapForStore")
/* loaded from: classes3.dex */
final class InstoreNavigationInteractorImpl$fetchMapForStore$1 extends ContinuationImpl {
    public BuildingInteractor p;
    public String q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ InstoreNavigationInteractorImpl t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreNavigationInteractorImpl$fetchMapForStore$1(InstoreNavigationInteractorImpl instoreNavigationInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = instoreNavigationInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return InstoreNavigationInteractorImpl.h(this.t, null, null, null, this);
    }
}
