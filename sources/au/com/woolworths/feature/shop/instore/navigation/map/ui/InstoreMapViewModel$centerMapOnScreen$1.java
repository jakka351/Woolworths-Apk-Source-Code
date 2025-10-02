package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ovh.plrapps.mapcompose.ui.state.MapState;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel", f = "InstoreMapViewModel.kt", l = {646}, m = "centerMapOnScreen")
/* loaded from: classes3.dex */
final class InstoreMapViewModel$centerMapOnScreen$1 extends ContinuationImpl {
    public MapState p;
    public /* synthetic */ Object q;
    public final /* synthetic */ InstoreMapViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$centerMapOnScreen$1(InstoreMapViewModel instoreMapViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = instoreMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.v6(null, false, this);
    }
}
