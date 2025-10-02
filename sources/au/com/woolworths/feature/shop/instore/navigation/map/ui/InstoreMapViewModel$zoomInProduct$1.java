package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel", f = "InstoreMapViewModel.kt", l = {679}, m = "zoomInProduct")
/* loaded from: classes3.dex */
final class InstoreMapViewModel$zoomInProduct$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ InstoreMapViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$zoomInProduct$1(InstoreMapViewModel instoreMapViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = instoreMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.J6(null, null, this);
    }
}
