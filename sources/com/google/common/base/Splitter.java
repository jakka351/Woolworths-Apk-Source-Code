package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.AbstractIterator;
import com.google.common.base.CharMatcher;
import com.google.common.base.JdkPattern;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Splitter {

    /* renamed from: a, reason: collision with root package name */
    public final CharMatcher f14866a;
    public final boolean b;
    public final Strategy c;
    public final int d;

    /* renamed from: com.google.common.base.Splitter$2, reason: invalid class name */
    class AnonymousClass2 implements Strategy {

        /* renamed from: com.google.common.base.Splitter$2$1, reason: invalid class name */
        class AnonymousClass1 extends SplittingIterator {
            @Override // com.google.common.base.Splitter.SplittingIterator
            public final int b(int i) {
                return 1 + i;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public final int c(int i) {
                CharSequence charSequence = this.f;
                int length = charSequence.length() - 1;
                while (i <= length) {
                    if (charSequence.charAt(i) == " ".charAt(0)) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
        }

        @Override // com.google.common.base.Splitter.Strategy
        public final Iterator a(Splitter splitter, CharSequence charSequence) {
            return new AnonymousClass1(splitter, charSequence);
        }
    }

    /* renamed from: com.google.common.base.Splitter$3, reason: invalid class name */
    class AnonymousClass3 implements Strategy {

        /* renamed from: com.google.common.base.Splitter$3$1, reason: invalid class name */
        class AnonymousClass1 extends SplittingIterator {
            public final /* synthetic */ CommonMatcher k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Splitter splitter, CharSequence charSequence, CommonMatcher commonMatcher) {
                super(splitter, charSequence);
                this.k = commonMatcher;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public final int b(int i) {
                return this.k.a();
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public final int c(int i) {
                CommonMatcher commonMatcher = this.k;
                if (commonMatcher.b(i)) {
                    return commonMatcher.c();
                }
                return -1;
            }
        }

        @Override // com.google.common.base.Splitter.Strategy
        public final Iterator a(Splitter splitter, CharSequence charSequence) {
            throw null;
        }
    }

    /* renamed from: com.google.common.base.Splitter$4, reason: invalid class name */
    class AnonymousClass4 implements Strategy {
        @Override // com.google.common.base.Splitter.Strategy
        public final Iterator a(Splitter splitter, CharSequence charSequence) {
            return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.4.1
                @Override // com.google.common.base.Splitter.SplittingIterator
                public final int b(int i) {
                    return i;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public final int c(int i) {
                    AnonymousClass4.this.getClass();
                    if (i < this.f.length()) {
                        return i;
                    }
                    return -1;
                }
            };
        }
    }

    /* renamed from: com.google.common.base.Splitter$5, reason: invalid class name */
    class AnonymousClass5 implements Iterable<String> {
        @Override // java.lang.Iterable
        public final Iterator<String> iterator() {
            throw null;
        }

        public final String toString() {
            Joiner joiner = new Joiner(", ");
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            joiner.b(sb, iterator());
            sb.append(']');
            return sb.toString();
        }
    }

    public static final class MapSplitter {
    }

    public static abstract class SplittingIterator extends AbstractIterator<String> {
        public final CharSequence f;
        public final CharMatcher g;
        public final boolean h;
        public int i;
        public int j;

        public SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.d = AbstractIterator.State.e;
            this.i = 0;
            this.g = splitter.f14866a;
            this.h = splitter.b;
            this.j = splitter.d;
            this.f = charSequence;
        }

        @Override // com.google.common.base.AbstractIterator
        public final Object a() {
            int iC;
            CharSequence charSequence;
            CharMatcher charMatcher;
            int i = this.i;
            while (true) {
                int i2 = this.i;
                if (i2 == -1) {
                    this.d = AbstractIterator.State.f;
                    return null;
                }
                iC = c(i2);
                charSequence = this.f;
                if (iC == -1) {
                    iC = charSequence.length();
                    this.i = -1;
                } else {
                    this.i = b(iC);
                }
                int i3 = this.i;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.i = i4;
                    if (i4 > charSequence.length()) {
                        this.i = -1;
                    }
                } else {
                    while (true) {
                        charMatcher = this.g;
                        if (i >= iC || !charMatcher.m(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (iC > i && charMatcher.m(charSequence.charAt(iC - 1))) {
                        iC--;
                    }
                    if (!this.h || i != iC) {
                        break;
                    }
                    i = this.i;
                }
            }
            int i5 = this.j;
            if (i5 == 1) {
                iC = charSequence.length();
                this.i = -1;
                while (iC > i && charMatcher.m(charSequence.charAt(iC - 1))) {
                    iC--;
                }
            } else {
                this.j = i5 - 1;
            }
            return charSequence.subSequence(i, iC).toString();
        }

        public abstract int b(int i);

        public abstract int c(int i);
    }

    public interface Strategy {
        Iterator a(Splitter splitter, CharSequence charSequence);
    }

    public Splitter(Strategy strategy, boolean z, CharMatcher charMatcher, int i) {
        this.c = strategy;
        this.b = z;
        this.f14866a = charMatcher;
        this.d = i;
    }

    public static Splitter a(char c) {
        final CharMatcher.Is is = new CharMatcher.Is(c);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.1
            @Override // com.google.common.base.Splitter.Strategy
            public final Iterator a(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.1.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public final int b(int i) {
                        return i + 1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public final int c(int i) {
                        return is.h(i, this.f);
                    }
                };
            }
        }, false, CharMatcher.None.e, Integer.MAX_VALUE);
    }

    public static void b() {
        Preconditions.e("The pattern may not match the empty string: %s", new JdkPattern(Pattern.compile("\r\n|\n|\r")), !new JdkPattern.JdkMatcher(r0.d.matcher("")).f14861a.matches());
    }

    public final List c(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itA = this.c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itA.hasNext()) {
            arrayList.add((String) itA.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Splitter d() {
        CharMatcher charMatcher = CharMatcher.Whitespace.f;
        charMatcher.getClass();
        return new Splitter(this.c, this.b, charMatcher, this.d);
    }
}
