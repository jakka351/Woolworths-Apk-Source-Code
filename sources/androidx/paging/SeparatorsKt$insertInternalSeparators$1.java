package androidx.paging;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SeparatorsKt", f = "Separators.kt", l = {82}, m = "insertInternalSeparators")
/* loaded from: classes2.dex */
final class SeparatorsKt$insertInternalSeparators$1<R, T extends R> extends ContinuationImpl {
    public TransformablePage p;
    public Function3 q;
    public ArrayList r;
    public ArrayList s;
    public Object t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public int x;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.x |= Integer.MIN_VALUE;
        return SeparatorsKt.b(null, this);
    }
}
