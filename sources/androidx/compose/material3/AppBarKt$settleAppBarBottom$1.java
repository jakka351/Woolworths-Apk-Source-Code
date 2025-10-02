package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", l = {1803, 1817}, m = "settleAppBarBottom")
/* loaded from: classes2.dex */
final class AppBarKt$settleAppBarBottom$1 extends ContinuationImpl {
    public Object p;
    public AnimationSpec q;
    public Ref.FloatRef r;
    public /* synthetic */ Object s;
    public int t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return AppBarKt.b(null, BitmapDescriptorFactory.HUE_RED, null, null, this);
    }
}
