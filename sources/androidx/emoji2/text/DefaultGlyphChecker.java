package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.EmojiCompat;

@AnyThread
@RestrictTo
/* loaded from: classes.dex */
class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {
    public static final ThreadLocal b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f2697a;

    public DefaultGlyphChecker() {
        TextPaint textPaint = new TextPaint();
        this.f2697a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public final boolean a(CharSequence charSequence, int i, int i2) {
        ThreadLocal threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb = (StringBuilder) threadLocal.get();
        sb.setLength(0);
        while (i < i2) {
            sb.append(charSequence.charAt(i));
            i++;
        }
        return PaintCompat.a(this.f2697a, sb.toString());
    }
}
