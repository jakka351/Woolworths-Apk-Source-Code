package io.card.payment;

import android.text.Editable;
import android.text.Spanned;

/* loaded from: classes7.dex */
class NonEmptyValidator implements Validator {
    public String d;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.d = editable.toString().trim();
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
        return null;
    }

    @Override // io.card.payment.Validator
    public final String getValue() {
        return this.d;
    }

    @Override // io.card.payment.Validator
    public boolean isValid() {
        String str = this.d;
        return str != null && str.length() > 0;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
