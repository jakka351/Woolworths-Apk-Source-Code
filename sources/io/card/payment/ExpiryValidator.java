package io.card.payment;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.medallia.digital.mobilesdk.q2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes7.dex */
class ExpiryValidator implements Validator {
    public int d;
    public int e;
    public boolean f;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws ParseException {
        this.f = editable.length() >= 5;
        String string = editable.toString();
        if (string == null) {
            return;
        }
        String strA = StringHelper.a(string);
        int length = strA.length();
        Date date = null;
        SimpleDateFormat simpleDateFormat = length == 4 ? new SimpleDateFormat("MMyy") : length == 6 ? new SimpleDateFormat("MMyyyy") : null;
        if (simpleDateFormat != null) {
            try {
                simpleDateFormat.setLenient(false);
                date = simpleDateFormat.parse(strA);
            } catch (ParseException unused) {
            }
        }
        if (date == null) {
            return;
        }
        this.d = date.getMonth() + 1;
        int year = date.getYear();
        this.e = year;
        if (year < 1900) {
            this.e = year + 1900;
        }
    }

    @Override // io.card.payment.Validator
    public final boolean b() {
        return this.f;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.d = 0;
        this.e = 0;
        this.f = false;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (i3 == 0 && spannableStringBuilder.length() > 0 && '1' < spannableStringBuilder.charAt(0) && spannableStringBuilder.charAt(0) <= '9') {
            spannableStringBuilder.insert(0, (CharSequence) "0");
            i2++;
        }
        int i6 = i4 - i3;
        if (i3 - i6 <= 2 && (i3 + i2) - i6 >= 2 && ((i5 = 2 - i3) == i2 || (i5 >= 0 && i5 < i2 && spannableStringBuilder.charAt(i5) != '/'))) {
            spannableStringBuilder.insert(i5, (CharSequence) q2.c);
            i2++;
        }
        String string = new SpannableStringBuilder(spanned).replace(i3, i4, (CharSequence) spannableStringBuilder, i, i2).toString();
        if (string.length() >= 1 && (string.charAt(0) < '0' || '1' < string.charAt(0))) {
            return "";
        }
        if (string.length() >= 2) {
            if (string.charAt(0) != '0' && string.charAt(1) > '2') {
                return "";
            }
            if (string.charAt(0) == '0' && string.charAt(1) == '0') {
                return "";
            }
        }
        return string.length() > 5 ? "" : spannableStringBuilder;
    }

    @Override // io.card.payment.Validator
    public final String getValue() {
        return String.format("%02d/%02d", Integer.valueOf(this.d), Integer.valueOf(this.e % 100));
    }

    @Override // io.card.payment.Validator
    public final boolean isValid() {
        int i = this.d;
        if (i < 1 || 12 < i) {
            return false;
        }
        Date date = new Date();
        if (this.e > date.getYear() + 1915) {
            return false;
        }
        return this.e > date.getYear() + 1900 || (this.e == date.getYear() + 1900 && this.d >= date.getMonth() + 1);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
