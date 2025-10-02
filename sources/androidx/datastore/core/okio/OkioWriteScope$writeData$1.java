package androidx.datastore.core.okio;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okio.FileHandle;
import okio.RealBufferedSink;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", l = {216}, m = "writeData")
/* loaded from: classes2.dex */
final class OkioWriteScope$writeData$1 extends ContinuationImpl {
    public FileHandle p;
    public FileHandle q;
    public RealBufferedSink r;
    public /* synthetic */ Object s;
    public final /* synthetic */ OkioWriteScope t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope$writeData$1(OkioWriteScope okioWriteScope, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = okioWriteScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.c(null, this);
    }
}
