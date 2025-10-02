package kotlin.text;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1;

@Metadata(d1 = {"kotlin/text/StringsKt__AppendableKt", "kotlin/text/StringsKt__IndentKt", "kotlin/text/StringsKt__RegexExtensionsJVMKt", "kotlin/text/StringsKt__RegexExtensionsKt", "kotlin/text/StringsKt__StringBuilderJVMKt", "kotlin/text/StringsKt__StringBuilderKt", "kotlin/text/StringsKt__StringNumberConversionsJVMKt", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/StringsKt__StringsJVMKt", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt___StringsJvmKt", "kotlin/text/StringsKt___StringsKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class StringsKt extends StringsKt___StringsKt {
    public static int A(CharSequence charSequence) {
        Intrinsics.h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int B(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        Intrinsics.h(charSequence, "<this>");
        return !(charSequence instanceof String) ? StringsKt__StringsKt.e(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int C(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.c(charSequence, str, i, z);
    }

    public static boolean D(CharSequence charSequence) {
        Intrinsics.h(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char E(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(A(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int F(int i, int i2, String str, String string) {
        if ((i2 & 2) != 0) {
            i = A(str);
        }
        Intrinsics.h(str, "<this>");
        Intrinsics.h(string, "string");
        return str.lastIndexOf(string, i);
    }

    public static int G(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = A(charSequence);
        }
        Intrinsics.h(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(ArraysKt.c0(cArr), i);
        }
        int iA = A(charSequence);
        if (i > iA) {
            i = iA;
        }
        while (-1 < i) {
            if (CharsKt__CharKt.a(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static List H(final CharSequence charSequence) {
        Intrinsics.h(charSequence, "<this>");
        return SequencesKt.x(new Sequence<String>() { // from class: kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public final Iterator iterator() {
                return new LinesIterator(charSequence);
            }
        });
    }

    public static String I(int i, String str) {
        CharSequence charSequenceSubSequence;
        Intrinsics.h(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(YU.a.e(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String J(int i, String str) {
        CharSequence charSequenceSubSequence;
        Intrinsics.h(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(YU.a.e(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean K(int i, int i2, int i3, String str, String other, boolean z) {
        Intrinsics.h(str, "<this>");
        Intrinsics.h(other, "other");
        return !z ? str.regionMatches(i, other, i2, i3) : str.regionMatches(z, i, other, i2, i3);
    }

    public static String L(CharSequence charSequence, String str) {
        Intrinsics.h(str, "<this>");
        if (!StringsKt__StringsKt.i(charSequence, str)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence M(int i, String str) {
        Intrinsics.h(str, "<this>");
        if (i < 0) {
            throw new IndexOutOfBoundsException(YU.a.e(i, "End index (", ") is less than start index (0)."));
        }
        if (i == 0) {
            return str.subSequence(0, str.length());
        }
        StringBuilder sb = new StringBuilder(str.length() - i);
        sb.append((CharSequence) str, 0, 0);
        sb.append((CharSequence) str, i, str.length());
        return sb;
    }

    public static String N(String str, String suffix) {
        Intrinsics.h(str, "<this>");
        Intrinsics.h(suffix, "suffix");
        if (!x(str, suffix)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String O(String str, String str2, String str3) {
        Intrinsics.h(str, "<this>");
        if (str.length() < str3.length() + str2.length() || !StringsKt__StringsKt.i(str2, str) || !x(str, str3)) {
            return str;
        }
        String strSubstring = str.substring(str2.length(), str.length() - str3.length());
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String P(int i, String str) {
        Intrinsics.h(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + JwtParser.SEPARATOR_CHAR).toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append((CharSequence) str);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.e(string);
        return string;
    }

    public static String Q(String str, String oldValue, String newValue, boolean z) {
        Intrinsics.h(str, "<this>");
        Intrinsics.h(oldValue, "oldValue");
        Intrinsics.h(newValue, "newValue");
        int i = 0;
        int iC = StringsKt__StringsKt.c(str, oldValue, 0, z);
        if (iC < 0) {
            return str;
        }
        int length = oldValue.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iC);
            sb.append(newValue);
            i = iC + length;
            if (iC >= str.length()) {
                break;
            }
            iC = StringsKt__StringsKt.c(str, oldValue, iC + i2, z);
        } while (iC > 0);
        sb.append((CharSequence) str, i, str.length());
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    public static String R(String str, char c, char c2) {
        Intrinsics.h(str, "<this>");
        String strReplace = str.replace(c, c2);
        Intrinsics.g(strReplace, "replace(...)");
        return strReplace;
    }

    public static StringBuilder S(CharSequence charSequence, int i, int i2, CharSequence replacement) {
        Intrinsics.h(charSequence, "<this>");
        Intrinsics.h(replacement, "replacement");
        if (i2 < i) {
            throw new IndexOutOfBoundsException(androidx.camera.core.impl.b.j(i2, i, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(replacement);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static List T(CharSequence charSequence, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 3;
        Intrinsics.h(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return StringsKt__StringsKt.h(i2, charSequence, str);
            }
        }
        StringsKt__StringsKt.g(i2);
        SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1 sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1 = new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(new DelimitedRangesSequence(charSequence, i2, new b(ArraysKt.f(strArr), 1)));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1, 10));
        Iterator<Object> it = sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.j(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static List U(String str, char[] cArr) {
        Intrinsics.h(str, "<this>");
        if (cArr.length == 1) {
            return StringsKt__StringsKt.h(0, str, String.valueOf(cArr[0]));
        }
        StringsKt__StringsKt.g(0);
        SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1 sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1 = new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(new DelimitedRangesSequence(str, 0, new b(cArr, 0)));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1, 10));
        Iterator<Object> it = sequencesKt___SequencesKt$asIterable$$inlined$Iterable$1.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.j(str, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static boolean V(String str, int i, String str2, boolean z) {
        Intrinsics.h(str, "<this>");
        return !z ? str.startsWith(str2, i) : K(i, 0, str2.length(), str, str2, z);
    }

    public static boolean W(String str, String prefix, boolean z) {
        Intrinsics.h(str, "<this>");
        Intrinsics.h(prefix, "prefix");
        return !z ? str.startsWith(prefix) : K(0, 0, prefix.length(), str, prefix, z);
    }

    public static boolean X(String str, char c) {
        Intrinsics.h(str, "<this>");
        return str.length() > 0 && CharsKt__CharKt.a(str.charAt(0), c, false);
    }

    public static String Y(char c, String str, String missingDelimiterValue) {
        Intrinsics.h(str, "<this>");
        Intrinsics.h(missingDelimiterValue, "missingDelimiterValue");
        int iB = B(str, c, 0, 6);
        if (iB == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iB + 1, str.length());
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Z(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.h(str, "<this>");
        Intrinsics.h(delimiter, "delimiter");
        Intrinsics.h(missingDelimiterValue, "missingDelimiterValue");
        int iC = C(str, delimiter, 0, false, 6);
        if (iC == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iC, str.length());
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String a0(char c, String str, String missingDelimiterValue) {
        Intrinsics.h(str, "<this>");
        Intrinsics.h(missingDelimiterValue, "missingDelimiterValue");
        int iG = G(str, c, 0, 6);
        if (iG == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iG + 1, str.length());
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String b0(String str, String str2, String str3) {
        int iF = F(0, 6, str, str2);
        if (iF == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iF, str.length());
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String c0(String missingDelimiterValue, char c) {
        Intrinsics.h(missingDelimiterValue, "<this>");
        Intrinsics.h(missingDelimiterValue, "missingDelimiterValue");
        int iB = B(missingDelimiterValue, c, 0, 6);
        if (iB == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iB);
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String d0(String missingDelimiterValue, String str) {
        Intrinsics.h(missingDelimiterValue, "<this>");
        Intrinsics.h(missingDelimiterValue, "missingDelimiterValue");
        int iC = C(missingDelimiterValue, str, 0, false, 6);
        if (iC == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iC);
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String e0(String missingDelimiterValue, char c) {
        Intrinsics.h(missingDelimiterValue, "<this>");
        Intrinsics.h(missingDelimiterValue, "missingDelimiterValue");
        int iG = G(missingDelimiterValue, c, 0, 6);
        if (iG == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iG);
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String f0(int i, String str) {
        Intrinsics.h(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(YU.a.e(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String g0(int i, String str) {
        Intrinsics.h(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(YU.a.e(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(length - i);
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static Double h0(String str) {
        Intrinsics.h(str, "<this>");
        try {
            if (StringsKt__StringNumberConversionsJVMKt.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Integer i0(String str) {
        boolean z;
        int i;
        int i2;
        Intrinsics.h(str, "<this>");
        CharsKt.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = -2147483647;
        if (Intrinsics.j(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static Long j0(String str) {
        boolean z;
        Intrinsics.h(str, "<this>");
        CharsKt.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.j(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static void k(StringBuilder sb, String... strArr) {
        for (String str : strArr) {
            sb.append(str);
        }
    }

    public static CharSequence k0(CharSequence charSequence) {
        Intrinsics.h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zC = CharsKt.c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static void l(Appendable appendable, Object obj, Function1 function1) {
        Intrinsics.h(appendable, "<this>");
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static String l0(String str, char... cArr) {
        Intrinsics.h(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zI = ArraysKt.i(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!zI) {
                    break;
                }
                length--;
            } else if (zI) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static ArrayList m(CharSequence charSequence) {
        Intrinsics.h(charSequence, "<this>");
        com.woolworths.scanlibrary.domain.productsearch.a aVar = new com.woolworths.scanlibrary.domain.productsearch.a(29);
        SlidingWindowKt.a(1, 1);
        int length = charSequence.length();
        int i = 0;
        ArrayList arrayList = new ArrayList((length % 1 == 0 ? 0 : 1) + length);
        while (i >= 0 && i < length) {
            int i2 = i + 1;
            arrayList.add(aVar.invoke(charSequence.subSequence(i, (i2 < 0 || i2 > length) ? length : i2)));
            i = i2;
        }
        return arrayList;
    }

    public static String m0(String str) {
        int length;
        Intrinsics.h(str, "<this>");
        List listH = H(str);
        List list = listH;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!D((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!CharsKt.c(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) CollectionsKt.V(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listH.size();
        com.woolworths.scanlibrary.domain.productsearch.a aVar = new com.woolworths.scanlibrary.domain.productsearch.a(28);
        int I = CollectionsKt.I(listH);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i = length + 1;
            String str3 = null;
            if (length < 0) {
                CollectionsKt.z0();
                throw null;
            }
            String str4 = (String) obj2;
            if (((length != 0 && length != I) || !D(str4)) && (str3 = (String) aVar.invoke(s(iIntValue, str4))) == null) {
                str3 = str4;
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        CollectionsKt.L(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String n(char[] cArr, int i, int i2) {
        AbstractList.Companion.a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static String n0(String str) {
        Intrinsics.h(str, "<this>");
        if (D(lllqqql.c0063ccc0063c)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listH = H(str);
        int length = str.length();
        listH.size();
        com.woolworths.scanlibrary.domain.productsearch.a aVar = new com.woolworths.scanlibrary.domain.productsearch.a(28);
        int I = CollectionsKt.I(listH);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listH) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != I) || !D(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.c(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && V(str2, i3, lllqqql.c0063ccc0063c, false)) {
                    strSubstring = str2.substring(lllqqql.c0063ccc0063c.length() + i3);
                    Intrinsics.g(strSubstring, "substring(...)");
                }
                if (strSubstring == null || (strSubstring = (String) aVar.invoke(strSubstring)) == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        CollectionsKt.L(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static boolean o(CharSequence charSequence, CharSequence other, boolean z) {
        Intrinsics.h(charSequence, "<this>");
        Intrinsics.h(other, "other");
        if (other instanceof String) {
            if (C(charSequence, (String) other, 0, z, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.d(charSequence, other, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean p(CharSequence charSequence, char c) {
        Intrinsics.h(charSequence, "<this>");
        return B(charSequence, c, 0, 2) >= 0;
    }

    public static boolean q(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String r(byte[] bArr) {
        Intrinsics.h(bArr, "<this>");
        return new String(bArr, Charsets.f24671a);
    }

    public static String s(int i, String str) {
        Intrinsics.h(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(YU.a.e(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String t(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(YU.a.e(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return f0(length, str);
    }

    public static byte[] u(String str) {
        Intrinsics.h(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean v(String str, String suffix, boolean z) {
        Intrinsics.h(str, "<this>");
        Intrinsics.h(suffix, "suffix");
        return !z ? str.endsWith(suffix) : K(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean w(CharSequence charSequence, char c) {
        Intrinsics.h(charSequence, "<this>");
        return charSequence.length() > 0 && CharsKt__CharKt.a(charSequence.charAt(A(charSequence)), c, false);
    }

    public static boolean x(CharSequence charSequence, CharSequence suffix) {
        Intrinsics.h(charSequence, "<this>");
        Intrinsics.h(suffix, "suffix");
        return ((charSequence instanceof String) && (suffix instanceof String)) ? v((String) charSequence, (String) suffix, false) : StringsKt__StringsKt.f(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), false);
    }

    public static boolean y(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static void z() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.g(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
    }
}
