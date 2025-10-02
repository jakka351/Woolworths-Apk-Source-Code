package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    public final TextFieldValue h;
    public final TextLayoutResultProxy i;

    public TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState) {
        super(textFieldValue.f2127a, textFieldValue.b, textLayoutResultProxy != null ? textLayoutResultProxy.f1135a : null, offsetMapping, textPreparedSelectionState);
        this.h = textFieldValue;
        this.i = textLayoutResultProxy;
    }

    public final List n(Function1 function1) {
        if (!TextRange.c(this.f)) {
            return CollectionsKt.R(new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.f(this.f), TextRange.f(this.f)));
        }
        EditCommand editCommand = (EditCommand) function1.invoke(this);
        if (editCommand != null) {
            return CollectionsKt.Q(editCommand);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(androidx.compose.foundation.text.TextLayoutResultProxy r9, int r10) {
        /*
            r8 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r9.b
            androidx.compose.ui.text.TextLayoutResult r1 = r9.f1135a
            if (r0 == 0) goto L13
            androidx.compose.ui.layout.LayoutCoordinates r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            androidx.compose.ui.geometry.Rect r9 = r9.D(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            androidx.compose.ui.geometry.Rect r9 = androidx.compose.ui.geometry.Rect.e
        L15:
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.h
            long r2 = r0.b
            int r0 = androidx.compose.ui.text.TextRange.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            androidx.compose.ui.text.input.OffsetMapping r2 = r8.d
            int r0 = r2.b(r0)
            androidx.compose.ui.geometry.Rect r0 = r1.c(r0)
            float r3 = r0.f1752a
            float r0 = r0.b
            long r6 = r9.e()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            androidx.compose.ui.text.MultiParagraph r0 = r1.b
            int r9 = r0.g(r9)
            int r9 = r2.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldPreparedSelection.o(androidx.compose.foundation.text.TextLayoutResultProxy, int):int");
    }
}
