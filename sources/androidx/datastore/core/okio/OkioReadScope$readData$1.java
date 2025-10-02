package androidx.datastore.core.okio;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okio.RealBufferedSource;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", l = {SubsamplingScaleImageView.ORIENTATION_180, 187}, m = "readData$suspendImpl")
/* loaded from: classes.dex */
final class OkioReadScope$readData$1<T> extends ContinuationImpl {
    public Object p;
    public RealBufferedSource q;
    public /* synthetic */ Object r;
    public final /* synthetic */ OkioReadScope s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioReadScope$readData$1(OkioReadScope okioReadScope, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = okioReadScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return OkioReadScope.f(this.s, this);
    }
}
