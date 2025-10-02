package coil3.network.okhttp.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okio.Buffer;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {39}, m = "readByteString")
/* loaded from: classes4.dex */
final class UtilsKt$readByteString$1 extends ContinuationImpl {
    public Buffer p;
    public /* synthetic */ Object q;
    public int r;

    public UtilsKt$readByteString$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return UtilsKt.c(null, this);
    }
}
