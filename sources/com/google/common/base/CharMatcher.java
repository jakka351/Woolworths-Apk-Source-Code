package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class CharMatcher implements Predicate<Character> {

    /* renamed from: com.google.common.base.CharMatcher$1, reason: invalid class name */
    class AnonymousClass1 extends NegatedFastMatcher {
        @Override // com.google.common.base.CharMatcher.Negated
        public final String toString() {
            return null;
        }
    }

    public static final class And extends CharMatcher {
        public final CharMatcher d;
        public final CharMatcher e;

        public And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.d = charMatcher;
            charMatcher2.getClass();
            this.e = charMatcher2;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return this.d.m(c) && this.e.m(c);
        }

        public final String toString() {
            return "CharMatcher.and(" + this.d + ", " + this.e + ")";
        }
    }

    public static final class Any extends NamedFastMatcher {
        public static final CharMatcher e = new Any("CharMatcher.any()");

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            charMatcher.getClass();
            return charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public final int f(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.CharMatcher
        public final int h(int i, CharSequence charSequence) {
            int length = charSequence.length();
            Preconditions.l(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        @Override // com.google.common.base.CharMatcher
        public final int i(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean n(CharSequence charSequence) {
            charSequence.getClass();
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean o(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return None.e;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            charMatcher.getClass();
            return this;
        }
    }

    public static final class AnyOf extends CharMatcher {
        public final char[] d;

        public AnyOf(String str) {
            char[] charArray = str.toString().toCharArray();
            this.d = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return Arrays.binarySearch(this.d, c) >= 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.d) {
                sb.append(CharMatcher.a(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    public static final class Ascii extends NamedFastMatcher {
        public static final CharMatcher e = new Ascii("CharMatcher.ascii()");

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return c <= 127;
        }
    }

    @GwtIncompatible
    public static final class BitSetMatcher extends NamedFastMatcher {
        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            throw null;
        }
    }

    public static final class BreakingWhitespace extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            if (c != ' ' && c != 133 && c != 5760) {
                if (c != 8199) {
                    if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                        switch (c) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c >= 8192 && c <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    public static final class Digit extends RangesMatcher {
        static {
            char[] charArray = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + '\t');
            }
            new Digit("CharMatcher.digit()", charArray, cArr);
        }
    }

    public static abstract class FastMatcher extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher p() {
            return new NegatedFastMatcher(this);
        }
    }

    public static final class ForPredicate extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            ((Character) obj).getClass();
            throw null;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: d */
        public final boolean apply(Character ch) {
            ch.getClass();
            throw null;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            throw null;
        }

        public final String toString() {
            return "CharMatcher.forPredicate(null)";
        }
    }

    public static final class InRange extends FastMatcher {
        public final char d;
        public final char e;

        public InRange(char c, char c2) {
            Preconditions.g(c2 >= c);
            this.d = c;
            this.e = c2;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return this.d <= c && c <= this.e;
        }

        public final String toString() {
            return "CharMatcher.inRange('" + CharMatcher.a(this.d) + "', '" + CharMatcher.a(this.e) + "')";
        }
    }

    public static final class Invisible extends RangesMatcher {
        static {
            new Invisible("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    public static final class Is extends FastMatcher {
        public final char d;

        public Is(char c) {
            this.d = c;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            return charMatcher.m(this.d) ? this : None.e;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return c == this.d;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return new IsNot(this.d);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            return charMatcher.m(this.d) ? charMatcher : new Or(this, charMatcher);
        }

        public final String toString() {
            return "CharMatcher.is('" + CharMatcher.a(this.d) + "')";
        }
    }

    public static final class IsEither extends FastMatcher {
        public final char d;
        public final char e;

        public IsEither(char c, char c2) {
            this.d = c;
            this.e = c2;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return c == this.d || c == this.e;
        }

        public final String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.a(this.d) + CharMatcher.a(this.e) + "\")";
        }
    }

    public static final class IsNot extends FastMatcher {
        public final char d;

        public IsNot(char c) {
            this.d = c;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            return charMatcher.m(this.d) ? new And(this, charMatcher) : charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return c != this.d;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return new Is(this.d);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            return charMatcher.m(this.d) ? Any.e : this;
        }

        public final String toString() {
            return "CharMatcher.isNot('" + CharMatcher.a(this.d) + "')";
        }
    }

    public static final class JavaDigit extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return Character.isDigit(c);
        }

        public final String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    public static final class JavaIsoControl extends NamedFastMatcher {
        public static final CharMatcher e = new JavaIsoControl("CharMatcher.javaIsoControl()");

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            if (c > 31) {
                return c >= 127 && c <= 159;
            }
            return true;
        }
    }

    public static final class JavaLetter extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return Character.isLetter(c);
        }

        public final String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    public static final class JavaLetterOrDigit extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return Character.isLetterOrDigit(c);
        }

        public final String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    public static final class JavaLowerCase extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return Character.isLowerCase(c);
        }

        public final String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    public static final class JavaUpperCase extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return Character.isUpperCase(c);
        }

        public final String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    public static abstract class NamedFastMatcher extends FastMatcher {
        public final String d;

        public NamedFastMatcher(String str) {
            this.d = str;
        }

        public final String toString() {
            return this.d;
        }
    }

    public static class Negated extends CharMatcher {
        public final CharMatcher d;

        public Negated(CharMatcher charMatcher) {
            this.d = charMatcher;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final int f(CharSequence charSequence) {
            return charSequence.length() - this.d.f(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return !this.d.m(c);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean n(CharSequence charSequence) {
            return this.d.o(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean o(CharSequence charSequence) {
            return this.d.n(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return this.d;
        }

        public String toString() {
            return this.d + ".negate()";
        }
    }

    public static class NegatedFastMatcher extends Negated {
    }

    public static final class None extends NamedFastMatcher {
        public static final CharMatcher e = new None("CharMatcher.none()");

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            charMatcher.getClass();
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public final int f(CharSequence charSequence) {
            charSequence.getClass();
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final int h(int i, CharSequence charSequence) {
            Preconditions.l(i, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public final int i(CharSequence charSequence) {
            charSequence.getClass();
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean n(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean o(CharSequence charSequence) {
            charSequence.getClass();
            return true;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return Any.e;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            charMatcher.getClass();
            return charMatcher;
        }
    }

    public static final class Or extends CharMatcher {
        public final CharMatcher d;
        public final CharMatcher e;

        public Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.d = charMatcher;
            charMatcher2.getClass();
            this.e = charMatcher2;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return this.d.m(c) || this.e.m(c);
        }

        public final String toString() {
            return "CharMatcher.or(" + this.d + ", " + this.e + ")";
        }
    }

    public static class RangesMatcher extends CharMatcher {
        public final String d;
        public final char[] e;
        public final char[] f;

        public RangesMatcher(String str, char[] cArr, char[] cArr2) {
            this.d = str;
            this.e = cArr;
            this.f = cArr2;
            Preconditions.g(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                Preconditions.g(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    Preconditions.g(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            int iBinarySearch = Arrays.binarySearch(this.e, c);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i = (~iBinarySearch) - 1;
            return i >= 0 && c <= this.f[i];
        }

        public final String toString() {
            return this.d;
        }
    }

    public static final class SingleWidth extends RangesMatcher {
        static {
            new SingleWidth("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺\ufdff\ufeffￜ".toCharArray());
        }
    }

    @VisibleForTesting
    public static final class Whitespace extends NamedFastMatcher {
        public static final int e = Integer.numberOfLeadingZeros(31);
        public static final CharMatcher f = new Whitespace("CharMatcher.whitespace()");

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> e) == c;
        }
    }

    public static String a(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static CharMatcher c(String str) {
        int length = str.length();
        return length != 0 ? length != 1 ? length != 2 ? new AnyOf(str) : new IsEither(str.charAt(0), str.charAt(1)) : new Is(str.charAt(0)) : None.e;
    }

    public static CharMatcher e() {
        return Ascii.e;
    }

    public static CharMatcher g(char c, char c2) {
        return new InRange(c, c2);
    }

    public static CharMatcher j(char c) {
        return new Is(c);
    }

    public static CharMatcher k() {
        return new IsNot(' ');
    }

    public static CharMatcher l() {
        return JavaIsoControl.e;
    }

    public CharMatcher b(CharMatcher charMatcher) {
        return new And(this, charMatcher);
    }

    @Override // com.google.common.base.Predicate
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean apply(Character ch) {
        return m(ch.charValue());
    }

    public int f(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (m(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public int h(int i, CharSequence charSequence) {
        int length = charSequence.length();
        Preconditions.l(i, length);
        while (i < length) {
            if (m(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int i(CharSequence charSequence) {
        return h(0, charSequence);
    }

    public abstract boolean m(char c);

    public boolean n(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!m(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean o(CharSequence charSequence) {
        return i(charSequence) == -1;
    }

    public CharMatcher p() {
        return new Negated(this);
    }

    public CharMatcher q(CharMatcher charMatcher) {
        return new Or(this, charMatcher);
    }
}
