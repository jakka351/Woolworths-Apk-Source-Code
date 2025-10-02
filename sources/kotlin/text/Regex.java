package kotlin.text;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u000b\fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Serialized", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Regex implements Serializable {
    public final Pattern d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Serialized implements Serializable {
        public final String d;
        public final int e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
        }

        public Serialized(String str, int i) {
            this.d = str;
            this.e = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.d, this.e);
            Intrinsics.g(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }
    }

    public Regex(Pattern pattern) {
        this.d = pattern;
    }

    public static Sequence c(Regex regex, String str) {
        regex.getClass();
        if (str.length() >= 0) {
            return SequencesKt.l(new coil3.gif.a(8, regex, str), Regex$findAll$2.d);
        }
        StringBuilder sbR = YU.a.r(0, "Start index out of bounds: ", ", input length: ");
        sbR.append(str.length());
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.d;
        String strPattern = pattern.pattern();
        Intrinsics.g(strPattern, "pattern(...)");
        return new Serialized(strPattern, pattern.flags());
    }

    public final boolean a(CharSequence input) {
        Intrinsics.h(input, "input");
        return this.d.matcher(input).find();
    }

    public final MatchResult b(int i, CharSequence input) {
        Intrinsics.h(input, "input");
        Matcher matcher = this.d.matcher(input);
        Intrinsics.g(matcher, "matcher(...)");
        if (matcher.find(i)) {
            return new MatcherMatchResult(matcher, input);
        }
        return null;
    }

    public final MatchResult d(int i, String input) {
        Intrinsics.h(input, "input");
        Matcher matcherRegion = this.d.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i, input.length());
        if (matcherRegion.lookingAt()) {
            return new MatcherMatchResult(matcherRegion, input);
        }
        return null;
    }

    public final MatchResult e(CharSequence input) {
        Intrinsics.h(input, "input");
        Matcher matcher = this.d.matcher(input);
        Intrinsics.g(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, input);
        }
        return null;
    }

    public final boolean f(CharSequence input) {
        Intrinsics.h(input, "input");
        return this.d.matcher(input).matches();
    }

    public final String g(CharSequence input, String str) {
        Intrinsics.h(input, "input");
        String strReplaceAll = this.d.matcher(input).replaceAll(str);
        Intrinsics.g(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String h(String input, Function1 function1) {
        Intrinsics.h(input, "input");
        int i = 0;
        MatchResult matchResultB = b(0, input);
        if (matchResultB == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            MatcherMatchResult matcherMatchResult = (MatcherMatchResult) matchResultB;
            sb.append((CharSequence) input, i, matcherMatchResult.d().d);
            sb.append((CharSequence) function1.invoke(matchResultB));
            i = matcherMatchResult.d().e + 1;
            matchResultB = matcherMatchResult.next();
            if (i >= length) {
                break;
            }
        } while (matchResultB != null);
        if (i < length) {
            sb.append((CharSequence) input, i, length);
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    public final List i(String input) {
        Intrinsics.h(input, "input");
        int iEnd = 0;
        StringsKt__StringsKt.g(0);
        Matcher matcher = this.d.matcher(input);
        if (!matcher.find()) {
            return CollectionsKt.Q(input.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.d.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    public Regex(String pattern) {
        Intrinsics.h(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        Intrinsics.g(patternCompile, "compile(...)");
        this.d = patternCompile;
    }

    public Regex(String pattern, int i) {
        RegexOption regexOption = RegexOption.e;
        Intrinsics.h(pattern, "pattern");
        int value = regexOption.getD();
        Pattern patternCompile = Pattern.compile(pattern, (value & 2) != 0 ? value | 64 : value);
        Intrinsics.g(patternCompile, "compile(...)");
        this.d = patternCompile;
    }
}
