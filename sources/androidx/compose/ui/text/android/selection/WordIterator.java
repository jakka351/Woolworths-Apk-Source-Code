package androidx.compose.ui.text.android.selection;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.emoji2.text.EmojiCompat;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class WordIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2084a;
    public final int b;
    public final int c;
    public final BreakIterator d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "", "WINDOW_WIDTH", "I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static boolean a(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public WordIterator(CharSequence charSequence, int i, Locale locale) {
        this.f2084a = charSequence;
        if (charSequence.length() < 0) {
            InlineClassHelperKt.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            InlineClassHelperKt.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(i, charSequence));
    }

    public final void a(int i) {
        boolean z = false;
        int i2 = this.b;
        int i3 = this.c;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbQ = a.q(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbQ.append(i3);
        sbQ.append(']');
        InlineClassHelperKt.a(sbQ.toString());
    }

    public final boolean b(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        CharSequence charSequence = this.f2084a;
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!EmojiCompat.g()) {
                    return false;
                }
                EmojiCompat emojiCompatA = EmojiCompat.a();
                if (emojiCompatA.d() != 1 || emojiCompatA.c(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return Companion.a(Character.codePointBefore(this.f2084a, i));
    }

    public final boolean d(int i) {
        a(i);
        if (!this.d.isBoundary(i)) {
            return false;
        }
        if (f(i) && f(i - 1) && f(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.f2084a.length() - 1 || !(e(i) || e(i + 1));
    }

    public final boolean e(int i) {
        int i2 = i - 1;
        CharSequence charSequence = this.f2084a;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.c(unicodeBlockOf, unicodeBlock) && Intrinsics.c(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.c(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && Intrinsics.c(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public final boolean f(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        CharSequence charSequence = this.f2084a;
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!EmojiCompat.g()) {
                return false;
            }
            EmojiCompat emojiCompatA = EmojiCompat.a();
            if (emojiCompatA.d() != 1 || emojiCompatA.c(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        return Companion.a(Character.codePointAt(this.f2084a, i));
    }

    public final int h(int i) {
        a(i);
        int iFollowing = this.d.following(i);
        return (f(iFollowing + (-1)) && f(iFollowing) && !e(iFollowing)) ? h(iFollowing) : iFollowing;
    }

    public final int i(int i) {
        a(i);
        int iPreceding = this.d.preceding(i);
        return (f(iPreceding) && b(iPreceding) && !e(iPreceding)) ? i(iPreceding) : iPreceding;
    }
}
