package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextUndoManager;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "", "NotifyImeListener", "Saver", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldState {

    /* renamed from: a, reason: collision with root package name */
    public final TextUndoManager f1149a;
    public final MutableState b;
    public final MutableState c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface NotifyImeListener {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$Saver;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/TextFieldState;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {
        @Override // androidx.compose.runtime.saveable.Saver
        public final Object a(SaverScope saverScope, Object obj) {
            TextFieldState textFieldState = (TextFieldState) obj;
            String string = textFieldState.a().e.toString();
            long j = textFieldState.a().f;
            int i = TextRange.c;
            return CollectionsKt.R(string, Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) (textFieldState.a().f & 4294967295L)), TextUndoManager.Companion.Saver.d(saverScope, textFieldState.f1149a));
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public final Object b(Object obj) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.Int");
            long jA = TextRangeKt.a(iIntValue, ((Integer) obj4).intValue());
            Intrinsics.e(obj5);
            return new TextFieldState((String) obj2, jA, TextUndoManager.Companion.Saver.c(obj5));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr = TextFieldEditUndoBehavior.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr2 = TextFieldEditUndoBehavior.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TextFieldState(String str, long j, TextUndoManager textUndoManager) {
        this.f1149a = textUndoManager;
        new TextFieldBuffer(new TextFieldCharSequence(str, TextRangeKt.b(str.length(), j), null, null, 28), null, null, null, 14);
        this.b = SnapshotStateKt.f(Boolean.FALSE);
        this.c = SnapshotStateKt.f(new TextFieldCharSequence(str, j, null, null, 28));
        new MutableVector(new NotifyImeListener[16], 0);
    }

    public final TextFieldCharSequence a() {
        return (TextFieldCharSequence) ((SnapshotMutableStateImpl) this.c).getD();
    }

    public final String toString() {
        Snapshot snapshotA = Snapshot.Companion.a();
        Function1 function1E = snapshotA != null ? snapshotA.getG() : null;
        Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
        try {
            return "TextFieldState(selection=" + ((Object) TextRange.h(a().f)) + ", text=\"" + ((Object) a().e) + "\")";
        } finally {
            Snapshot.Companion.e(snapshotA, snapshotB, function1E);
        }
    }
}
