package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/compose/foundation/text/input/internal/undo/TextUndoOperation$Companion$Saver$1", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextUndoOperation$Companion$Saver$1 implements Saver<TextUndoOperation, Object> {
    @Override // androidx.compose.runtime.saveable.Saver
    public final Object a(SaverScope saverScope, Object obj) {
        TextUndoOperation textUndoOperation = (TextUndoOperation) obj;
        Integer numValueOf = Integer.valueOf(textUndoOperation.f1185a);
        String str = textUndoOperation.b;
        String str2 = textUndoOperation.c;
        long j = textUndoOperation.d;
        int i = TextRange.c;
        Integer numValueOf2 = Integer.valueOf((int) (j >> 32));
        Integer numValueOf3 = Integer.valueOf((int) (j & 4294967295L));
        long j2 = textUndoOperation.e;
        return CollectionsKt.R(numValueOf, str, str2, numValueOf2, numValueOf3, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (4294967295L & j2)), Long.valueOf(textUndoOperation.f));
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object b(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.String");
        Object obj4 = list.get(2);
        Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.String");
        Object obj5 = list.get(3);
        Intrinsics.f(obj5, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        Intrinsics.f(obj6, "null cannot be cast to non-null type kotlin.Int");
        long jA = TextRangeKt.a(iIntValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        Intrinsics.f(obj7, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        Intrinsics.f(obj8, "null cannot be cast to non-null type kotlin.Int");
        long jA2 = TextRangeKt.a(iIntValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        Intrinsics.f(obj9, "null cannot be cast to non-null type kotlin.Long");
        return new TextUndoOperation(iIntValue, (String) obj3, (String) obj4, jA, jA2, ((Long) obj9).longValue(), false, 64);
    }
}
