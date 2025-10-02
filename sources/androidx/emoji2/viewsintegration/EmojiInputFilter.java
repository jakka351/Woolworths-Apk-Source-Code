package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

@RequiresApi
@RestrictTo
/* loaded from: classes2.dex */
final class EmojiInputFilter implements InputFilter {
    public final TextView d;
    public EmojiCompat.InitCallback e;

    @RequiresApi
    @RestrictTo
    public static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {
        public final WeakReference d;
        public final WeakReference e;

        public InitCallbackImpl(TextView textView, EmojiInputFilter emojiInputFilter) {
            this.d = new WeakReference(textView);
            this.e = new WeakReference(emojiInputFilter);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void b() {
            Handler handler;
            TextView textView = (TextView) this.d.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.d.get();
            InputFilter inputFilter = (InputFilter) this.e.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        EmojiCompat emojiCompatA = EmojiCompat.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            emojiCompatA.getClass();
                            length = text.length();
                        }
                        CharSequence charSequenceJ = emojiCompatA.j(0, length, 0, text);
                        if (text == charSequenceJ) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(charSequenceJ);
                        int selectionEnd = Selection.getSelectionEnd(charSequenceJ);
                        textView.setText(charSequenceJ);
                        if (charSequenceJ instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequenceJ;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public EmojiInputFilter(TextView textView) {
        this.d = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.d;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iD = EmojiCompat.a().d();
        if (iD != 0) {
            if (iD == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return EmojiCompat.a().j(0, charSequence.length(), 0, charSequence);
            }
            if (iD != 3) {
                return charSequence;
            }
        }
        EmojiCompat emojiCompatA = EmojiCompat.a();
        if (this.e == null) {
            this.e = new InitCallbackImpl(textView, this);
        }
        emojiCompatA.k(this.e);
        return charSequence;
    }
}
