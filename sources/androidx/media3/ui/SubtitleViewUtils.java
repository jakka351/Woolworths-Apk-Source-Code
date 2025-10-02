package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.text.Cue;

/* loaded from: classes2.dex */
final class SubtitleViewUtils {
    public static void a(Cue.Builder builder) {
        builder.k = -3.4028235E38f;
        builder.j = Integer.MIN_VALUE;
        CharSequence charSequence = builder.f2897a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                builder.f2897a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = builder.f2897a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float b(float f, int i, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }
}
