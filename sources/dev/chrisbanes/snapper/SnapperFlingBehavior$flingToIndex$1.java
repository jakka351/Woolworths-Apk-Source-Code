package dev.chrisbanes.snapper;

import androidx.compose.foundation.gestures.ScrollScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, 416}, m = "flingToIndex")
/* loaded from: classes7.dex */
final class SnapperFlingBehavior$flingToIndex$1 extends ContinuationImpl {
    public SnapperFlingBehavior p;
    public ScrollScope q;
    public int r;
    public float s;
    public /* synthetic */ Object t;
    public final /* synthetic */ SnapperFlingBehavior u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior$flingToIndex$1(SnapperFlingBehavior snapperFlingBehavior, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = snapperFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.e(null, 0, BitmapDescriptorFactory.HUE_RED, this);
    }
}
