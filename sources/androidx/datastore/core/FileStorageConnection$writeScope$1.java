package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {214, 118}, m = "writeScope")
/* loaded from: classes.dex */
final class FileStorageConnection$writeScope$1 extends ContinuationImpl {
    public FileStorageConnection p;
    public Object q;
    public Object r;
    public FileWriteScope s;
    public /* synthetic */ Object t;
    public final /* synthetic */ FileStorageConnection u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorageConnection$writeScope$1(FileStorageConnection fileStorageConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = fileStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, this);
    }
}
