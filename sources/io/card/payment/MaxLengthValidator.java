package io.card.payment;

/* loaded from: classes7.dex */
class MaxLengthValidator extends NonEmptyValidator implements Validator {
    public final int e;

    public MaxLengthValidator(int i) {
        this.e = i;
    }

    @Override // io.card.payment.NonEmptyValidator, io.card.payment.Validator
    public final boolean isValid() {
        return super.isValid() && this.d.length() <= this.e;
    }
}
