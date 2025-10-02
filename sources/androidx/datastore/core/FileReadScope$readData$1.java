package androidx.datastore.core;

import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
/* loaded from: classes.dex */
final class FileReadScope$readData$1<T> extends ContinuationImpl {
    public Object p;
    public FileInputStream q;
    public /* synthetic */ Object r;
    public final /* synthetic */ FileReadScope s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReadScope$readData$1(FileReadScope fileReadScope, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = fileReadScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return FileReadScope.f(this.s, this);
    }
}
