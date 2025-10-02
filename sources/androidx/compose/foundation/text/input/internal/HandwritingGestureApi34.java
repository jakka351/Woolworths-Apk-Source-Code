package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.HandwritingGesture;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.input.internal.RecordingInputConnection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class HandwritingGestureApi34 {
    public static int a(HandwritingGesture handwritingGesture, Function1 function1) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        ((RecordingInputConnection.AnonymousClass1) function1).invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    public static void b(TransformedTextFieldState transformedTextFieldState, long j, int i) {
        if (TextRange.c(j)) {
            throw null;
        }
        transformedTextFieldState.getClass();
        throw null;
    }

    public static void c(long j, AnnotatedString annotatedString, boolean z, Function1 function1) {
        if (z) {
            int i = TextRange.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(annotatedString, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < annotatedString.length() ? Character.codePointAt(annotatedString, iCharCount2) : 10;
            if (HandwritingGesture_androidKt.k(iCodePointBefore) && (HandwritingGesture_androidKt.j(iCodePointAt) || HandwritingGesture_androidKt.i(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(annotatedString, iCharCount);
                    }
                } while (HandwritingGesture_androidKt.k(iCodePointBefore));
                j = TextRangeKt.a(iCharCount, iCharCount2);
            } else if (HandwritingGesture_androidKt.k(iCodePointAt) && (HandwritingGesture_androidKt.j(iCodePointBefore) || HandwritingGesture_androidKt.i(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == annotatedString.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(annotatedString, iCharCount2);
                    }
                } while (HandwritingGesture_androidKt.k(iCodePointAt));
                j = TextRangeKt.a(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        ((RecordingInputConnection.AnonymousClass1) function1).invoke(new HandwritingGesture_androidKt$compoundEditCommand$1(new EditCommand[]{new SetSelectionCommand(i2, i2), new DeleteSurroundingTextCommand(TextRange.d(j), 0)}));
    }
}
