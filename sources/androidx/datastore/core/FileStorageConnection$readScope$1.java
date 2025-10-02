package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
/* loaded from: classes.dex */
final class FileStorageConnection$readScope$1<R> extends ContinuationImpl {
    public FileStorageConnection p;
    public FileReadScope q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ FileStorageConnection t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorageConnection$readScope$1(FileStorageConnection fileStorageConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = fileStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, this);
    }
}
