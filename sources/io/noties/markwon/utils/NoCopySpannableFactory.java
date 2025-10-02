package io.noties.markwon.utils;

import android.text.Spannable;
import android.text.SpannableString;

/* loaded from: classes7.dex */
public class NoCopySpannableFactory extends Spannable.Factory {

    public static class Holder {
        static {
            new NoCopySpannableFactory();
        }
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        return charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
    }
}
