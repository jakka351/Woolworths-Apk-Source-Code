package androidx.datastore.core.okio;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {113}, m = "readScope")
/* loaded from: classes.dex */
final class OkioStorageConnection$readScope$1<R> extends ContinuationImpl {
    public OkioStorageConnection p;
    public OkioReadScope q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ OkioStorageConnection t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorageConnection$readScope$1(OkioStorageConnection okioStorageConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = okioStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, this);
    }
}
