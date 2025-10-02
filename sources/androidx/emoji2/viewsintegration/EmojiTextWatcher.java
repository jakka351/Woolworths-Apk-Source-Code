package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

@RequiresApi
@RestrictTo
/* loaded from: classes2.dex */
final class EmojiTextWatcher implements TextWatcher {
    public final EditText d;
    public EmojiCompat.InitCallback e;
    public boolean f = true;

    @RequiresApi
    @RestrictTo
    public static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {
        public final WeakReference d;

        public InitCallbackImpl(EditText editText) {
            this.d = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void b() {
            Handler handler;
            EditText editText = (EditText) this.d.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            EmojiTextWatcher.a((EditText) this.d.get(), 1);
        }
    }

    public EmojiTextWatcher(EditText editText) {
        this.d = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat emojiCompatA = EmojiCompat.a();
            if (editableText == null) {
                length = 0;
            } else {
                emojiCompatA.getClass();
                length = editableText.length();
            }
            emojiCompatA.j(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.d;
        if (!editText.isInEditMode() && this.f && EmojiCompat.g() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iD = EmojiCompat.a().d();
            if (iD != 0) {
                if (iD == 1) {
                    EmojiCompat.a().j(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iD != 3) {
                    return;
                }
            }
            EmojiCompat emojiCompatA = EmojiCompat.a();
            if (this.e == null) {
                this.e = new InitCallbackImpl(editText);
            }
            emojiCompatA.k(this.e);
        }
    }
}
