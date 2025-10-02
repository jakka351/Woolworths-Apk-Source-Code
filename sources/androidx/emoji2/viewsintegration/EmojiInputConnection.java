package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi
@RestrictTo
/* loaded from: classes2.dex */
final class EmojiInputConnection extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f2724a;
    public final EmojiCompatDeleteHelper b;

    public static class EmojiCompatDeleteHelper {
    }

    public EmojiInputConnection(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        EmojiCompatDeleteHelper emojiCompatDeleteHelper = new EmojiCompatDeleteHelper();
        super(inputConnection, false);
        this.f2724a = editText;
        this.b = emojiCompatDeleteHelper;
        if (EmojiCompat.g()) {
            EmojiCompat.a().l(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f2724a.getEditableText();
        this.b.getClass();
        return EmojiCompat.e(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f2724a.getEditableText();
        this.b.getClass();
        return EmojiCompat.e(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
