package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel", f = "InstoreMapViewModel.kt", l = {614, 616, 619}, m = "onMapFetched")
/* loaded from: classes3.dex */
final class InstoreMapViewModel$onMapFetched$1 extends ContinuationImpl {
    public Floor p;
    public OriientMap q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ InstoreMapViewModel t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$onMapFetched$1(InstoreMapViewModel instoreMapViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = instoreMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return InstoreMapViewModel.r6(this.t, null, null, this);
    }
}
