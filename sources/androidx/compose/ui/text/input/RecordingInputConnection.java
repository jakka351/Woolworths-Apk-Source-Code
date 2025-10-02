package androidx.compose.ui.text.input;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecordingInputConnection implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputServiceAndroid$createInputConnection$1 f2123a;
    public final boolean b;
    public int c;
    public TextFieldValue d;
    public int e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public boolean h = true;

    public RecordingInputConnection(TextFieldValue textFieldValue, TextInputServiceAndroid$createInputConnection$1 textInputServiceAndroid$createInputConnection$1, boolean z) {
        this.f2123a = textInputServiceAndroid$createInputConnection$1;
        this.b = z;
        this.d = textFieldValue;
    }

    public final void b(EditCommand editCommand) {
        this.c++;
        try {
            this.g.add(editCommand);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        this.c++;
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final boolean c() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            ArrayList arrayList = this.g;
            if (!arrayList.isEmpty()) {
                this.f2123a.f2130a.e.invoke(CollectionsKt.J0(arrayList));
                arrayList.clear();
            }
        }
        return this.c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        ArrayList arrayList = this.f2123a.f2130a.i;
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
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.h;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.h;
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
        boolean z = this.h;
        if (!z) {
            return z;
        }
        b(new DeleteSurroundingTextCommand(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        b(new DeleteSurroundingTextInCodePointsCommand(i, i2));
        return true;
    }

    public final void e(TextFieldValue textFieldValue) {
        this.d = textFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(TextFieldValue textFieldValue, InputMethodManagerImpl inputMethodManagerImpl) {
        if (this.h) {
            this.d = textFieldValue;
            if (this.f) {
                ((android.view.inputmethod.InputMethodManager) inputMethodManagerImpl.b.getD()).updateExtractedText(inputMethodManagerImpl.f2117a, this.e, InputState_androidKt.a(textFieldValue));
            }
            TextRange textRange = textFieldValue.c;
            long j = textFieldValue.b;
            int iF = textRange != null ? TextRange.f(textRange.f2067a) : -1;
            TextRange textRange2 = textFieldValue.c;
            inputMethodManagerImpl.a(TextRange.f(j), TextRange.e(j), iF, textRange2 != null ? TextRange.e(textRange2.f2067a) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        b(new FinishComposingTextCommand());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        TextFieldValue textFieldValue = this.d;
        return TextUtils.getCapsMode(textFieldValue.f2127a.e, TextRange.f(textFieldValue.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f = z;
        if (z) {
            this.e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return InputState_androidKt.a(this.d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (TextRange.c(this.d.b)) {
            return null;
        }
        return TextFieldValueKt.a(this.d).e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return TextFieldValueKt.b(this.d, i).e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return TextFieldValueKt.c(this.d, i).e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.h;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    b(new SetSelectionCommand(0, this.d.f2127a.e.length()));
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
        boolean z = this.h;
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
                this.f2123a.f2130a.f.invoke(new ImeAction(i2));
            } else {
                i2 = 1;
                this.f2123a.f2130a.f.invoke(new ImeAction(i2));
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return true;
        }
        return z;
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
            boolean r0 = r9.h
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
            androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1 r4 = r9.f2123a
            androidx.compose.ui.text.input.TextInputServiceAndroid r4 = r4.f2130a
            androidx.compose.ui.text.input.CursorAnchorInfoController r4 = r4.l
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.RecordingInputConnection.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) this.f2123a.f2130a.j.getD()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.h;
        if (z) {
            b(new SetComposingRegionCommand(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            b(new SetComposingTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        b(new SetSelectionCommand(i, i2));
        return true;
    }
}
