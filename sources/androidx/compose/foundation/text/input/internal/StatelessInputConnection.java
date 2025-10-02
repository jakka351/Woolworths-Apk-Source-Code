package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/StatelessInputConnection;", "Landroid/view/inputmethod/InputConnection;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class StatelessInputConnection implements InputConnection {
    public final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, final int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        final String string = charSequence.toString();
        new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$commitText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextFieldBuffer textFieldBuffer = (TextFieldBuffer) obj;
                TextRange textRange = textFieldBuffer.h;
                String str = string;
                if (textRange != null) {
                    long j = textRange.f2067a;
                    ImeEditCommand_androidKt.b(textFieldBuffer, (int) (j >> 32), (int) (4294967295L & j), str);
                } else {
                    long j2 = textFieldBuffer.g;
                    int i2 = TextRange.c;
                    ImeEditCommand_androidKt.b(textFieldBuffer, (int) (j2 >> 32), (int) (4294967295L & j2), str);
                }
                long j3 = textFieldBuffer.g;
                int i3 = TextRange.c;
                int i4 = (int) (j3 >> 32);
                int i5 = i;
                int iC = RangesKt.c(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - str.length(), 0, textFieldBuffer.e.length());
                textFieldBuffer.e(TextRangeKt.a(iC, iC));
                return Unit.f24250a;
            }
        };
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(final int i, final int i2) {
        new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$deleteSurroundingText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextFieldBuffer textFieldBuffer = (TextFieldBuffer) obj;
                int i3 = i2;
                int i4 = i;
                if (i4 < 0 || i3 < 0) {
                    InlineClassHelperKt.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i4 + " and " + i3 + " respectively.");
                }
                long j = textFieldBuffer.g;
                PartialGapBuffer partialGapBuffer = textFieldBuffer.e;
                int i5 = TextRange.c;
                int i6 = (int) (j & 4294967295L);
                int length = i6 + i3;
                if (((i3 ^ length) & (i6 ^ length)) < 0) {
                    length = partialGapBuffer.length();
                }
                ImeEditCommand_androidKt.a(textFieldBuffer, (int) (4294967295L & textFieldBuffer.g), Math.min(length, partialGapBuffer.length()));
                int i7 = (int) (textFieldBuffer.g >> 32);
                int i8 = i7 - i4;
                if (((i4 ^ i7) & (i7 ^ i8)) < 0) {
                    i8 = 0;
                }
                ImeEditCommand_androidKt.a(textFieldBuffer, Math.max(0, i8), (int) (textFieldBuffer.g >> 32));
                return Unit.f24250a;
            }
        };
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(final int i, final int i2) {
        new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$deleteSurroundingTextInCodePoints$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextFieldBuffer textFieldBuffer = (TextFieldBuffer) obj;
                int i3 = i2;
                int i4 = i;
                if (i4 < 0 || i3 < 0) {
                    InlineClassHelperKt.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i4 + " and " + i3 + " respectively.");
                }
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i6 >= i4) {
                        break;
                    }
                    int i8 = i7 + 1;
                    long j = textFieldBuffer.g;
                    PartialGapBuffer partialGapBuffer = textFieldBuffer.e;
                    int i9 = TextRange.c;
                    int i10 = (int) (j >> 32);
                    if (i10 <= i8) {
                        i7 = i10;
                        break;
                    }
                    i7 = (Character.isHighSurrogate(partialGapBuffer.charAt((i10 - i8) + (-1))) && Character.isLowSurrogate(partialGapBuffer.charAt(((int) (textFieldBuffer.g >> 32)) - i8))) ? i7 + 2 : i8;
                    i6++;
                }
                int length = 0;
                while (true) {
                    if (i5 >= i3) {
                        break;
                    }
                    int i11 = length + 1;
                    long j2 = textFieldBuffer.g;
                    PartialGapBuffer partialGapBuffer2 = textFieldBuffer.e;
                    int i12 = TextRange.c;
                    if (((int) (j2 & 4294967295L)) + i11 >= partialGapBuffer2.length()) {
                        length = partialGapBuffer2.length() - ((int) (textFieldBuffer.g & 4294967295L));
                        break;
                    }
                    length = (Character.isHighSurrogate(partialGapBuffer2.charAt((((int) (textFieldBuffer.g & 4294967295L)) + i11) + (-1))) && Character.isLowSurrogate(partialGapBuffer2.charAt(((int) (4294967295L & textFieldBuffer.g)) + i11))) ? length + 2 : i11;
                    i5++;
                }
                long j3 = textFieldBuffer.g;
                int i13 = TextRange.c;
                int i14 = (int) (j3 & 4294967295L);
                ImeEditCommand_androidKt.a(textFieldBuffer, i14, length + i14);
                int i15 = (int) (textFieldBuffer.g >> 32);
                ImeEditCommand_androidKt.a(textFieldBuffer, i15 - i7, i15);
                return Unit.f24250a;
            }
        };
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        switch (i) {
            case R.id.selectAll:
                throw null;
            case R.id.cut:
                b(277);
                return false;
            case R.id.copy:
                b(278);
                return false;
            case R.id.paste:
                b(279);
                return false;
            default:
                return false;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        if (i == 0) {
            return true;
        }
        switch (i) {
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int i;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 34) {
            return;
        }
        if (i2 >= 34) {
            if (androidx.camera.camera2.internal.compat.c.t(handwritingGesture)) {
                SelectGesture selectGestureN = androidx.camera.camera2.internal.compat.c.n(handwritingGesture);
                if (!TextRange.c(HandwritingGesture_androidKt.h(null, RectHelper_androidKt.e(selectGestureN.getSelectionArea()), selectGestureN.getGranularity() != 1 ? 0 : 1))) {
                    throw null;
                }
                androidx.camera.camera2.internal.compat.c.j(selectGestureN);
                throw null;
            }
            if (c.w(handwritingGesture)) {
                DeleteGesture deleteGestureN = c.n(handwritingGesture);
                i = deleteGestureN.getGranularity() == 1 ? 1 : 0;
                if (TextRange.c(HandwritingGesture_androidKt.h(null, RectHelper_androidKt.e(deleteGestureN.getDeletionArea()), i))) {
                    androidx.camera.camera2.internal.compat.c.j(deleteGestureN);
                    throw null;
                }
                if (i == 1) {
                    throw null;
                }
                TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr = TextFieldEditUndoBehavior.d;
                throw null;
            }
            if (c.C(handwritingGesture)) {
                SelectRangeGesture selectRangeGestureP = c.p(handwritingGesture);
                if (!TextRange.c(HandwritingGesture_androidKt.b(null, RectHelper_androidKt.e(selectRangeGestureP.getSelectionStartArea()), RectHelper_androidKt.e(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() != 1 ? 0 : 1))) {
                    throw null;
                }
                androidx.camera.camera2.internal.compat.c.j(selectRangeGestureP);
                throw null;
            }
            if (c.D(handwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureO = c.o(handwritingGesture);
                i = deleteRangeGestureO.getGranularity() == 1 ? 1 : 0;
                if (TextRange.c(HandwritingGesture_androidKt.b(null, RectHelper_androidKt.e(deleteRangeGestureO.getDeletionStartArea()), RectHelper_androidKt.e(deleteRangeGestureO.getDeletionEndArea()), i))) {
                    androidx.camera.camera2.internal.compat.c.j(deleteRangeGestureO);
                    throw null;
                }
                if (i == 1) {
                    throw null;
                }
                TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr2 = TextFieldEditUndoBehavior.d;
                throw null;
            }
            if (androidx.camera.camera2.internal.compat.c.A(handwritingGesture)) {
                androidx.camera.camera2.internal.compat.c.l(handwritingGesture);
                throw null;
            }
            if (androidx.camera.camera2.internal.compat.c.w(handwritingGesture)) {
                HandwritingGesture_androidKt.d(androidx.camera.camera2.internal.compat.c.k(handwritingGesture).getInsertionPoint());
                throw null;
            }
            if (androidx.camera.camera2.internal.compat.c.y(handwritingGesture)) {
                androidx.camera.camera2.internal.compat.c.m(handwritingGesture);
                throw null;
            }
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new b(intConsumer, 2, 1));
        } else {
            intConsumer.accept(2);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && i >= 34) {
            if (androidx.camera.camera2.internal.compat.c.t(previewableHandwritingGesture)) {
                SelectGesture selectGestureN = androidx.camera.camera2.internal.compat.c.n(previewableHandwritingGesture);
                HandwritingGestureApi34.b(null, HandwritingGesture_androidKt.h(null, RectHelper_androidKt.e(selectGestureN.getSelectionArea()), selectGestureN.getGranularity() != 1 ? 0 : 1), 0);
                throw null;
            }
            if (c.w(previewableHandwritingGesture)) {
                DeleteGesture deleteGestureN = c.n(previewableHandwritingGesture);
                HandwritingGestureApi34.b(null, HandwritingGesture_androidKt.h(null, RectHelper_androidKt.e(deleteGestureN.getDeletionArea()), deleteGestureN.getGranularity() == 1 ? 1 : 0), 1);
                throw null;
            }
            if (c.C(previewableHandwritingGesture)) {
                SelectRangeGesture selectRangeGestureP = c.p(previewableHandwritingGesture);
                HandwritingGestureApi34.b(null, HandwritingGesture_androidKt.b(null, RectHelper_androidKt.e(selectRangeGestureP.getSelectionStartArea()), RectHelper_androidKt.e(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() != 1 ? 0 : 1), 0);
                throw null;
            }
            if (c.D(previewableHandwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureO = c.o(previewableHandwritingGesture);
                HandwritingGestureApi34.b(null, HandwritingGesture_androidKt.b(null, RectHelper_androidKt.e(deleteRangeGestureO.getDeletionStartArea()), RectHelper_androidKt.e(deleteRangeGestureO.getDeletionEndArea()), deleteRangeGestureO.getGranularity() == 1 ? 1 : 0), 1);
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            if ((i & 16) != 0) {
            }
            if ((i & 8) != 0) {
            }
            if ((i & 4) != 0) {
            }
            if (i2 < 34 || (i & 32) != 0) {
            }
        }
        if (z) {
            throw null;
        }
        if (z2) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(final int i, final int i2) {
        new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$setComposingRegion$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextFieldBuffer textFieldBuffer = (TextFieldBuffer) obj;
                TextRange textRange = textFieldBuffer.h;
                PartialGapBuffer partialGapBuffer = textFieldBuffer.e;
                if (textRange != null) {
                    textFieldBuffer.d(null);
                }
                int iC = RangesKt.c(i, 0, partialGapBuffer.length());
                int iC2 = RangesKt.c(i2, 0, partialGapBuffer.length());
                if (iC != iC2) {
                    if (iC < iC2) {
                        textFieldBuffer.c(iC, iC2, null);
                    } else {
                        textFieldBuffer.c(iC2, iC, null);
                    }
                }
                return Unit.f24250a;
            }
        };
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setComposingText(java.lang.CharSequence r35, final int r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.StatelessInputConnection.setComposingText(java.lang.CharSequence, int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(final int i, final int i2) {
        final AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 = null;
        new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$setSelection$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextRangeKt.a(0, ((TextFieldBuffer) obj).e.length());
                throw null;
            }
        };
        throw null;
    }
}
