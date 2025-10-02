package io.card.payment;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.text.StringCharacterIterator;

/* loaded from: classes7.dex */
class CardNumberValidator implements Validator {
    public static final int[] f = {4, 11};
    public static final int[] g = {4, 9, 14};
    public String d;
    public int e;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strA = StringHelper.a(editable.toString());
        this.d = strA;
        CardType cardTypeFromCardNumber = CardType.fromCardNumber(strA);
        int i = this.e;
        int i2 = 0;
        if (i > 1) {
            int i3 = i - 1;
            this.e = 0;
            if (i > i3) {
                editable.delete(i3, i);
            }
        }
        while (i2 < editable.length()) {
            char cCharAt = editable.charAt(i2);
            if ((cardTypeFromCardNumber.numberLength() == 15 && (i2 == 4 || i2 == 11)) || ((cardTypeFromCardNumber.numberLength() == 16 || cardTypeFromCardNumber.numberLength() == 14) && (i2 == 4 || i2 == 9 || i2 == 14))) {
                if (cCharAt != ' ') {
                    editable.insert(i2, " ");
                }
            } else if (cCharAt == ' ') {
                editable.delete(i2, i2 + 1);
                i2--;
            }
            i2++;
        }
    }

    @Override // io.card.payment.Validator
    public final boolean b() {
        if (TextUtils.isEmpty(this.d)) {
            return false;
        }
        return this.d.length() == CardType.fromCardNumber(this.d).numberLength();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5;
        int i6 = i2;
        String strA = StringHelper.a(new SpannableStringBuilder(spanned).replace(i3, i4, charSequence, i, i6).toString());
        int iNumberLength = CardType.fromCardNumber(strA).numberLength();
        if (strA.length() > iNumberLength) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int[] iArr = iNumberLength == 15 ? f : g;
        int i7 = i4 - i3;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            if (charSequence.length() == 0 && i3 == iArr[i8] && spanned.charAt(i3) == ' ') {
                this.e = iArr[i8];
            }
            int i9 = i3 - i7;
            int i10 = iArr[i8];
            if (i9 <= i10 && (i3 + i6) - i7 >= i10 && ((i5 = i10 - i3) == i6 || (i5 >= 0 && i5 < i6 && spannableStringBuilder.charAt(i5) != ' '))) {
                spannableStringBuilder.insert(i5, (CharSequence) " ");
                i6++;
            }
        }
        return spannableStringBuilder;
    }

    @Override // io.card.payment.Validator
    public final String getValue() {
        return this.d;
    }

    @Override // io.card.payment.Validator
    public final boolean isValid() {
        if (!b()) {
            return false;
        }
        int[][] iArr = {new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{0, 2, 4, 6, 8, 1, 3, 5, 7, 9}};
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(this.d);
        char cLast = stringCharacterIterator.last();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (cLast != 65535) {
                if (!Character.isDigit(cLast)) {
                    break;
                }
                i += iArr[i2 & 1][cLast - '0'];
                cLast = stringCharacterIterator.previous();
                i2++;
            } else if (i % 10 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
