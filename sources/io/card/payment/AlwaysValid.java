package io.card.payment;

import android.text.Editable;
import android.text.Spanned;

/* loaded from: classes7.dex */
class AlwaysValid implements Validator {
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // io.card.payment.Validator
    public final boolean b() {
        return true;
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
        return null;
    }

    @Override // io.card.payment.Validator
    public final boolean isValid() {
        return true;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
