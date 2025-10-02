package okio.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.sequences.SequenceScope;
import okio.FileSystem;
import okio.Path;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively")
/* renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class FileSystem$collectRecursively$1 extends ContinuationImpl {
    public SequenceScope p;
    public FileSystem q;
    public ArrayDeque r;
    public Path s;
    public Iterator t;
    public boolean u;
    public /* synthetic */ Object v;
    public int w;

    public FileSystem$collectRecursively$1(BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.w |= Integer.MIN_VALUE;
        return FileSystem.a(null, null, null, null, false, this);
    }
}
