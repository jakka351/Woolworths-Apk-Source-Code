package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldPreparedSelection {

    /* renamed from: a, reason: collision with root package name */
    public final TransformedTextFieldState f1180a;
    public final TextLayoutResult b;
    public final TextFieldPreparedSelectionState c;
    public long d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection$Companion;", "", "", "NoCharacterFound", "I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public TextFieldPreparedSelection(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z, float f, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.f1180a = transformedTextFieldState;
        this.b = textLayoutResult;
        this.c = textFieldPreparedSelectionState;
        Snapshot snapshotA = Snapshot.Companion.a();
        Function1 function1E = snapshotA != null ? snapshotA.e() : null;
        Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
        try {
            transformedTextFieldState.getClass();
            throw null;
        } catch (Throwable th) {
            Snapshot.Companion.e(snapshotA, snapshotB, function1E);
            throw th;
        }
    }

    public final boolean a() {
        TextLayoutResult textLayoutResult = this.b;
        if (textLayoutResult == null) {
            return true;
        }
        long j = this.d;
        int i = TextRange.c;
        return textLayoutResult.h((int) (j & 4294967295L)) == ResolvedTextDirection.d;
    }

    public final void b() {
        throw null;
    }

    public final void c() {
        throw null;
    }
}
