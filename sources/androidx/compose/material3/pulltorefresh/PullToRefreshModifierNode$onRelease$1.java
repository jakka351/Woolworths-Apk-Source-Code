package androidx.compose.material3.pulltorefresh;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {359, 362}, m = "onRelease")
/* loaded from: classes2.dex */
final class PullToRefreshModifierNode$onRelease$1 extends ContinuationImpl {
    public PullToRefreshModifierNode p;
    public float q;
    public /* synthetic */ Object r;
    public final /* synthetic */ PullToRefreshModifierNode s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onRelease$1(PullToRefreshModifierNode pullToRefreshModifierNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.z2(BitmapDescriptorFactory.HUE_RED, this);
    }
}
