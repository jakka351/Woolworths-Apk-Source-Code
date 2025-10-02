package me.onebone.toolbar;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "me.onebone.toolbar.CollapsingToolbarState", f = "CollapsingToolbar.kt", l = {168}, m = "fling")
/* loaded from: classes7.dex */
final class CollapsingToolbarState$fling$1 extends ContinuationImpl {
    public Ref.FloatRef p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CollapsingToolbarState r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsingToolbarState$fling$1(CollapsingToolbarState collapsingToolbarState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = collapsingToolbarState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.f(null, BitmapDescriptorFactory.HUE_RED, this);
    }
}
