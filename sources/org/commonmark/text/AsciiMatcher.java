package org.commonmark.text;

import java.util.BitSet;

/* loaded from: classes8.dex */
public class AsciiMatcher implements CharMatcher {

    /* renamed from: a, reason: collision with root package name */
    public final BitSet f26867a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final BitSet f26868a;

        public Builder(BitSet bitSet) {
            this.f26868a = bitSet;
        }

        public final void a(char c) {
            if (c > 127) {
                throw new IllegalArgumentException("Can only match ASCII characters");
            }
            this.f26868a.set(c);
        }

        public final void b(char c, char c2) {
            while (c <= c2) {
                a(c);
                c = (char) (c + 1);
            }
        }
    }

    public AsciiMatcher(Builder builder) {
        this.f26867a = builder.f26868a;
    }

    public static Builder b() {
        return new Builder(new BitSet());
    }

    @Override // org.commonmark.text.CharMatcher
    public final boolean a(char c) {
        return this.f26867a.get(c);
    }

    public final Builder c() {
        return new Builder((BitSet) this.f26867a.clone());
    }
}
