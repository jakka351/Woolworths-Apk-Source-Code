package androidx.datastore.core;

import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {201}, m = "writeData")
/* loaded from: classes.dex */
final class FileWriteScope$writeData$1 extends ContinuationImpl {
    public FileOutputStream p;
    public FileOutputStream q;
    public /* synthetic */ Object r;
    public final /* synthetic */ FileWriteScope s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope$writeData$1(FileWriteScope fileWriteScope, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = fileWriteScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.c(null, this);
    }
}
