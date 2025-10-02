package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class JdkPattern extends CommonPattern implements Serializable {
    public final Pattern d;

    public static final class JdkMatcher extends CommonMatcher {

        /* renamed from: a, reason: collision with root package name */
        public final Matcher f14861a;

        public JdkMatcher(Matcher matcher) {
            matcher.getClass();
            this.f14861a = matcher;
        }

        @Override // com.google.common.base.CommonMatcher
        public final int a() {
            return this.f14861a.end();
        }

        @Override // com.google.common.base.CommonMatcher
        public final boolean b(int i) {
            return this.f14861a.find(i);
        }

        @Override // com.google.common.base.CommonMatcher
        public final int c() {
            return this.f14861a.start();
        }
    }

    public JdkPattern(Pattern pattern) {
        pattern.getClass();
        this.d = pattern;
    }

    public final String toString() {
        return this.d.toString();
    }
}
