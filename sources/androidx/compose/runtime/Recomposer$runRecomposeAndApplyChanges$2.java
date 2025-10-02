package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {580, 591}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    public List p;
    public List q;
    public List r;
    public MutableScatterSet s;
    public MutableScatterSet t;
    public MutableScatterSet u;
    public Set v;
    public MutableScatterSet w;
    public int x;
    public /* synthetic */ MonotonicFrameClock y;
    public final /* synthetic */ Recomposer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation continuation) {
        super(3, continuation);
        this.z = recomposer;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.runtime.Recomposer r22, java.util.List r23, java.util.List r24, java.util.List r25, androidx.collection.MutableScatterSet r26, androidx.collection.MutableScatterSet r27, androidx.collection.MutableScatterSet r28, androidx.collection.MutableScatterSet r29) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.a(androidx.compose.runtime.Recomposer, java.util.List, java.util.List, java.util.List, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet):void");
    }

    public static final void b(List list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.b) {
            try {
                ArrayList arrayList = recomposer.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((MovableContentStateReference) arrayList.get(i));
                }
                recomposer.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.z, (Continuation) obj3);
        recomposer$runRecomposeAndApplyChanges$2.y = (MonotonicFrameClock) obj2;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0167 -> B:54:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x022b -> B:12:0x00a0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
