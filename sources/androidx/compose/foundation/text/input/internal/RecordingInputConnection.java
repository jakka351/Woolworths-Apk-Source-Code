package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecordingInputConnection implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final LegacyTextInputMethodRequest$createInputConnection$1 f1168a;
    public final boolean b;
    public final LegacyTextFieldState c;
    public final TextFieldSelectionManager d;
    public final ViewConfiguration e;
    public int f;
    public TextFieldValue g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/input/EditCommand;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.input.internal.RecordingInputConnection$performHandwritingGesture$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<EditCommand, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            RecordingInputConnection.this.b((EditCommand) obj);
            return Unit.f24250a;
        }
    }

    public RecordingInputConnection(TextFieldValue textFieldValue, LegacyTextInputMethodRequest$createInputConnection$1 legacyTextInputMethodRequest$createInputConnection$1, boolean z, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration) {
        this.f1168a = legacyTextInputMethodRequest$createInputConnection$1;
        this.b = z;
        this.c = legacyTextFieldState;
        this.d = textFieldSelectionManager;
        this.e = viewConfiguration;
        this.g = textFieldValue;
    }

    public final void b(EditCommand editCommand) {
        this.f++;
        try {
            this.j.add(editCommand);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final boolean c() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                this.f1168a.f1166a.c.invoke(CollectionsKt.J0(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = this.f1168a.f1166a.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.c(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            b(new CommitTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final void d(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        b(new DeleteSurroundingTextCommand(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        b(new DeleteSurroundingTextInCodePointsCommand(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        b(new FinishComposingTextCommand());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        TextFieldValue textFieldValue = this.g;
        return TextUtils.getCapsMode(textFieldValue.f2127a.e, TextRange.f(textFieldValue.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return RecordingInputConnection_androidKt.a(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (TextRange.c(this.g.b)) {
            return null;
        }
        return TextFieldValueKt.a(this.g).e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return TextFieldValueKt.b(this.g, i).e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return TextFieldValueKt.c(this.g, i).e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    b(new SetSelectionCommand(0, this.g.f2127a.e.length()));
                    break;
                case R.id.cut:
                    d(277);
                    return false;
                case R.id.copy:
                    d(278);
                    return false;
                case R.id.paste:
                    d(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
                this.f1168a.f1166a.d.invoke(new ImeAction(i2));
            } else {
                i2 = 1;
                this.f1168a.f1166a.d.invoke(new ImeAction(i2));
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02ef  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r20, java.util.concurrent.Executor r21, java.util.function.IntConsumer r22) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.RecordingInputConnection.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        LegacyTextFieldState legacyTextFieldState;
        AnnotatedString annotatedString;
        if (Build.VERSION.SDK_INT >= 34 && (legacyTextFieldState = this.c) != null && (annotatedString = legacyTextFieldState.j) != null) {
            TextLayoutResultProxy textLayoutResultProxyD = legacyTextFieldState.d();
            if (annotatedString.equals(textLayoutResultProxyD != null ? textLayoutResultProxyD.f1135a.f2064a.f2063a : null)) {
                boolean zT = androidx.camera.camera2.internal.compat.c.t(previewableHandwritingGesture);
                TextFieldSelectionManager textFieldSelectionManager = this.d;
                if (zT) {
                    SelectGesture selectGestureN = androidx.camera.camera2.internal.compat.c.n(previewableHandwritingGesture);
                    if (textFieldSelectionManager != null) {
                        long jG = HandwritingGesture_androidKt.g(legacyTextFieldState, RectHelper_androidKt.e(selectGestureN.getSelectionArea()), selectGestureN.getGranularity() != 1 ? 0 : 1);
                        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
                        if (legacyTextFieldState2 != null) {
                            legacyTextFieldState2.f(jG);
                        }
                        LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
                        if (legacyTextFieldState3 != null) {
                            legacyTextFieldState3.e(TextRange.b);
                        }
                        if (!TextRange.c(jG)) {
                            textFieldSelectionManager.s(false);
                            textFieldSelectionManager.q(HandleState.d);
                        }
                    }
                } else if (c.w(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureN = c.n(previewableHandwritingGesture);
                    if (textFieldSelectionManager != null) {
                        long jG2 = HandwritingGesture_androidKt.g(legacyTextFieldState, RectHelper_androidKt.e(deleteGestureN.getDeletionArea()), deleteGestureN.getGranularity() != 1 ? 0 : 1);
                        LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.d;
                        if (legacyTextFieldState4 != null) {
                            legacyTextFieldState4.e(jG2);
                        }
                        LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.d;
                        if (legacyTextFieldState5 != null) {
                            legacyTextFieldState5.f(TextRange.b);
                        }
                        if (!TextRange.c(jG2)) {
                            textFieldSelectionManager.s(false);
                            textFieldSelectionManager.q(HandleState.d);
                        }
                    }
                } else if (c.C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureP = c.p(previewableHandwritingGesture);
                    if (textFieldSelectionManager != null) {
                        long jA = HandwritingGesture_androidKt.a(legacyTextFieldState, RectHelper_androidKt.e(selectRangeGestureP.getSelectionStartArea()), RectHelper_androidKt.e(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() != 1 ? 0 : 1);
                        LegacyTextFieldState legacyTextFieldState6 = textFieldSelectionManager.d;
                        if (legacyTextFieldState6 != null) {
                            legacyTextFieldState6.f(jA);
                        }
                        LegacyTextFieldState legacyTextFieldState7 = textFieldSelectionManager.d;
                        if (legacyTextFieldState7 != null) {
                            legacyTextFieldState7.e(TextRange.b);
                        }
                        if (!TextRange.c(jA)) {
                            textFieldSelectionManager.s(false);
                            textFieldSelectionManager.q(HandleState.d);
                        }
                    }
                } else if (c.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureO = c.o(previewableHandwritingGesture);
                    if (textFieldSelectionManager != null) {
                        long jA2 = HandwritingGesture_androidKt.a(legacyTextFieldState, RectHelper_androidKt.e(deleteRangeGestureO.getDeletionStartArea()), RectHelper_androidKt.e(deleteRangeGestureO.getDeletionEndArea()), deleteRangeGestureO.getGranularity() != 1 ? 0 : 1);
                        LegacyTextFieldState legacyTextFieldState8 = textFieldSelectionManager.d;
                        if (legacyTextFieldState8 != null) {
                            legacyTextFieldState8.e(jA2);
                        }
                        LegacyTextFieldState legacyTextFieldState9 = textFieldSelectionManager.d;
                        if (legacyTextFieldState9 != null) {
                            legacyTextFieldState9.f(TextRange.b);
                        }
                        if (!TextRange.c(jA2)) {
                            textFieldSelectionManager.s(false);
                            textFieldSelectionManager.q(HandleState.d);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new d(textFieldSelectionManager, 0));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.k
            if (r0 == 0) goto L75
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$createInputConnection$1 r4 = r9.f1168a
            androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest r4 = r4.f1166a
            androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoController r4 = r4.m
            java.lang.Object r7 = r4.c
            monitor-enter(r7)
            r4.f = r5     // Catch: java.lang.Throwable -> L6d
            r4.g = r6     // Catch: java.lang.Throwable -> L6d
            r4.h = r1     // Catch: java.lang.Throwable -> L6d
            r4.i = r10     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6f
            r4.e = r2     // Catch: java.lang.Throwable -> L6d
            androidx.compose.ui.text.input.TextFieldValue r10 = r4.j     // Catch: java.lang.Throwable -> L6d
            if (r10 == 0) goto L6f
            r4.a()     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r10 = move-exception
            goto L73
        L6f:
            r4.d = r3     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r7)
            return r2
        L73:
            monitor-exit(r7)
            throw r10
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.RecordingInputConnection.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) this.f1168a.f1166a.k.getD()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            b(new SetComposingRegionCommand(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            b(new SetComposingTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        b(new SetSelectionCommand(i, i2));
        return true;
    }
}
