package io.card.payment;

import android.text.InputFilter;
import android.text.TextWatcher;

/* loaded from: classes7.dex */
interface Validator extends InputFilter, TextWatcher {
    boolean b();

    String getValue();

    boolean isValid();
}
