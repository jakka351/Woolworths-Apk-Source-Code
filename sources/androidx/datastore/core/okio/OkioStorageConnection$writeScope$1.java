package androidx.datastore.core.okio;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okio.Path;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {236, 137}, m = "writeScope")
/* loaded from: classes2.dex */
final class OkioStorageConnection$writeScope$1 extends ContinuationImpl {
    public OkioStorageConnection p;
    public Object q;
    public Path r;
    public Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ OkioStorageConnection u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorageConnection$writeScope$1(OkioStorageConnection okioStorageConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = okioStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, this);
    }
}
