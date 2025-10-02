package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/TextUndoManager;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextUndoManager {

    /* renamed from: a, reason: collision with root package name */
    public final UndoManager f1150a;
    public final MutableState b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/TextUndoManager$Companion;", "", "Saver", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/TextUndoManager;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextUndoManager, Object> {

            /* renamed from: a, reason: collision with root package name */
            public static final TextUndoManager$Companion$Saver$special$$inlined$createSaver$1 f1151a = new TextUndoManager$Companion$Saver$special$$inlined$createSaver$1();

            public static TextUndoManager c(Object obj) {
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                TextUndoOperation textUndoOperation = obj2 != null ? (TextUndoOperation) TextUndoOperation.g.b(obj2) : null;
                Intrinsics.e(obj3);
                return new TextUndoManager(textUndoOperation, (UndoManager) f1151a.b(obj3));
            }

            public static List d(SaverScope saverScope, TextUndoManager textUndoManager) {
                TextUndoOperation textUndoOperation = (TextUndoOperation) ((SnapshotMutableStateImpl) textUndoManager.b).getD();
                return CollectionsKt.R(textUndoOperation != null ? TextUndoOperation.g.a(saverScope, textUndoOperation) : null, f1151a.a(saverScope, textUndoManager.f1150a));
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public final /* bridge */ /* synthetic */ Object a(SaverScope saverScope, Object obj) {
                return d(saverScope, (TextUndoManager) obj);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public final /* bridge */ /* synthetic */ Object b(Object obj) {
                return c(obj);
            }
        }
    }

    public TextUndoManager(TextUndoOperation textUndoOperation, UndoManager undoManager) {
        this.f1150a = undoManager;
        this.b = SnapshotStateKt.f(textUndoOperation);
    }
}
