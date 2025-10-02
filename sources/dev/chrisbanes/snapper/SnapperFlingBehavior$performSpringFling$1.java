package dev.chrisbanes.snapper;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "dev.chrisbanes.snapper.SnapperFlingBehavior", f = "SnapperFlingBehavior.kt", l = {551}, m = "performSpringFling")
/* loaded from: classes7.dex */
final class SnapperFlingBehavior$performSpringFling$1 extends ContinuationImpl {
    public SnapperFlingBehavior p;
    public Ref.FloatRef q;
    public /* synthetic */ Object r;
    public final /* synthetic */ SnapperFlingBehavior s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior$performSpringFling$1(SnapperFlingBehavior snapperFlingBehavior, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = snapperFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.g(null, null, 0, BitmapDescriptorFactory.HUE_RED, this);
    }
}
