package androidx.compose.foundation.pager;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {386}, m = "performFling")
/* loaded from: classes2.dex */
final class PagerWrapperFlingBehavior$performFling$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PagerWrapperFlingBehavior r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerWrapperFlingBehavior$performFling$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = pagerWrapperFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, BitmapDescriptorFactory.HUE_RED, this);
    }
}
