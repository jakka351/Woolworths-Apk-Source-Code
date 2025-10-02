package androidx.paging;

import androidx.paging.PageEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {140}, m = "flatMap")
/* loaded from: classes2.dex */
final class PageEvent$Insert$flatMap$1<R> extends ContinuationImpl {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ PageEvent.Insert D;
    public int E;
    public Function2 p;
    public PageEvent.Insert q;
    public LoadType r;
    public Collection s;
    public Iterator t;
    public TransformablePage u;
    public List v;
    public List w;
    public Iterator x;
    public Collection y;
    public Collection z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$Insert$flatMap$1(PageEvent.Insert insert, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.D = insert;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[LOOP:0: B:27:0x010b->B:29:0x0115, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0086 -> B:16:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ec -> B:24:0x00f8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent$Insert$flatMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
