package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;

@SuppressLint
/* loaded from: classes2.dex */
public final class InputConnectionCompat {

    /* renamed from: androidx.core.view.inputmethod.InputConnectionCompat$2, reason: invalid class name */
    class AnonymousClass2 extends InputConnectionWrapper {
        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean performPrivateCommand(String str, Bundle bundle) {
            throw null;
        }
    }

    @RequiresApi
    public static class Api25Impl {
    }

    public interface OnCommitContentListener {
        boolean a(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle);
    }

    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, final OnCommitContentListener onCommitContentListener) {
        ObjectsCompat.a(editorInfo, "editorInfo must be non-null");
        return new InputConnectionWrapper(inputConnection) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
                if (onCommitContentListener.a(inputContentInfo == null ? null : new InputContentInfoCompat(new InputContentInfoCompat.InputContentInfoCompatApi25Impl(inputContentInfo)), i, bundle)) {
                    return true;
                }
                return super.commitContent(inputContentInfo, i, bundle);
            }
        };
    }
}
