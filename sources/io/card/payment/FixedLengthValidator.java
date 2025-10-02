package io.card.payment;

import android.text.Editable;
import android.text.Spanned;

/* loaded from: classes7.dex */
class FixedLengthValidator implements Validator {
    public int d;
    public String e;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.e = editable.toString();
    }

    @Override // io.card.payment.Validator
    public final boolean b() {
        return isValid();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i2 <= 0 || ((spanned.length() + i4) - i3) + i2 <= this.d) {
            return null;
        }
        return "";
    }

    @Override // io.card.payment.Validator
    public final String getValue() {
        return this.e;
    }

    @Override // io.card.payment.Validator
    public final boolean isValid() {
        String str = this.e;
        return str != null && str.length() == this.d;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
