package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.feature.shop.instore.navigation.map.content.PinContent;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel", f = "InstoreMapViewModel.kt", l = {802, 803}, m = "showRouteToOriientCoordinate")
/* loaded from: classes3.dex */
final class InstoreMapViewModel$showRouteToOriientCoordinate$1 extends ContinuationImpl {
    public PinContent p;
    public /* synthetic */ Object q;
    public final /* synthetic */ InstoreMapViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$showRouteToOriientCoordinate$1(InstoreMapViewModel instoreMapViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = instoreMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return InstoreMapViewModel.u6(this.r, null, 0, this);
    }
}
