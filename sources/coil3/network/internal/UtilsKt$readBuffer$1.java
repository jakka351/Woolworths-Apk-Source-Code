package coil3.network.internal;

import coil3.network.NetworkResponseBody;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okio.Buffer;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.internal.UtilsKt", f = "utils.kt", l = {31}, m = "readBuffer")
/* loaded from: classes4.dex */
final class UtilsKt$readBuffer$1 extends ContinuationImpl {
    public NetworkResponseBody p;
    public Buffer q;
    public /* synthetic */ Object r;
    public int s;

    public UtilsKt$readBuffer$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return UtilsKt.a(null, this);
    }
}
