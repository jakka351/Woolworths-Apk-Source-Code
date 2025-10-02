package androidx.compose.foundation.layout;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", l = {301, 327, 352}, m = "fling-huYlsQE")
/* loaded from: classes2.dex */
final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    public Object p;
    public Ref.FloatRef q;
    public long r;
    public float s;
    public /* synthetic */ Object t;
    public final /* synthetic */ WindowInsetsNestedScrollConnection u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(0L, BitmapDescriptorFactory.HUE_RED, false, this);
    }
}
