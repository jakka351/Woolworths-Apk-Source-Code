package au.com.woolworths.foundation.ui.toolbar.flexibletopbar;

import androidx.compose.animation.core.AnimationSpec;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.ui.toolbar.flexibletopbar.FlexibleTopBarKt", f = "FlexibleTopBar.kt", l = {161, 177}, m = "settleAppBar")
/* loaded from: classes4.dex */
final class FlexibleTopBarKt$settleAppBar$1 extends ContinuationImpl {
    public Object p;
    public AnimationSpec q;
    public Ref.FloatRef r;
    public /* synthetic */ Object s;
    public int t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return FlexibleTopBarKt.b(null, BitmapDescriptorFactory.HUE_RED, null, null, this);
    }
}
