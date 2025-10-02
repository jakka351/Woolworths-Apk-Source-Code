package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethods;
import com.woolworths.R;

@BindingMethods
@RestrictTo
/* loaded from: classes2.dex */
public class TextViewBindingAdapter {

    public interface AfterTextChanged {
        void afterTextChanged(Editable editable);
    }

    public interface BeforeTextChanged {
    }

    public interface OnTextChanged {
        void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    public static void a(TextView textView, Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    public static void b(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (!(charSequence instanceof Spanned)) {
                if ((charSequence == null) == (text == null)) {
                    if (charSequence == null) {
                        return;
                    }
                    int length = charSequence.length();
                    if (length == text.length()) {
                        for (int i = 0; i < length; i++) {
                            if (charSequence.charAt(i) == text.charAt(i)) {
                            }
                        }
                        return;
                    }
                }
            } else if (charSequence.equals(text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static void c(TextView textView, final OnTextChanged onTextChanged, final AfterTextChanged afterTextChanged) {
        TextWatcher textWatcher = (afterTextChanged == null && onTextChanged == null) ? null : new TextWatcher() { // from class: androidx.databinding.adapters.TextViewBindingAdapter.1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                AfterTextChanged afterTextChanged2 = afterTextChanged;
                if (afterTextChanged2 != null) {
                    afterTextChanged2.afterTextChanged(editable);
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                OnTextChanged onTextChanged2 = onTextChanged;
                if (onTextChanged2 != null) {
                    onTextChanged2.onTextChanged(charSequence, i, i2, i3);
                }
            }
        };
        int i = ListenerUtil.f2553a;
        Object tag = textView.getTag(R.id.textWatcher);
        textView.setTag(R.id.textWatcher, textWatcher);
        TextWatcher textWatcher2 = (TextWatcher) tag;
        if (textWatcher2 != null) {
            textView.removeTextChangedListener(textWatcher2);
        }
        if (textWatcher != null) {
            textView.addTextChangedListener(textWatcher);
        }
    }
}
