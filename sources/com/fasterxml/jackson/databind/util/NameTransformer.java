package com.fasterxml.jackson.databind.util;

import YU.a;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class NameTransformer {
    public static final NopTransformer d = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        public final NameTransformer e;
        public final NameTransformer f;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this.e = nameTransformer;
            this.f = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public final String b(String str) {
            return this.e.b(this.f.b(str));
        }

        public final String toString() {
            return "[ChainedTransformer(" + this.e + ", " + this.f + ")]";
        }
    }

    public static final class NopTransformer extends NameTransformer implements Serializable {
        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public final String b(String str) {
            return str;
        }
    }

    public static NameTransformer a(final String str, final String str2) {
        boolean z = false;
        boolean z2 = (str == null || str.isEmpty()) ? false : true;
        if (str2 != null && !str2.isEmpty()) {
            z = true;
        }
        return z2 ? z ? new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.1
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public final String b(String str3) {
                return str + str3 + str2;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("[PreAndSuffixTransformer('");
                sb.append(str);
                sb.append("','");
                return a.o(sb, str2, "')]");
            }
        } : new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.2
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public final String b(String str3) {
                return a.o(new StringBuilder(), str, str3);
            }

            public final String toString() {
                return a.o(new StringBuilder("[PrefixTransformer('"), str, "')]");
            }
        } : z ? new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.3
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public final String b(String str3) {
                StringBuilder sbS = a.s(str3);
                sbS.append(str2);
                return sbS.toString();
            }

            public final String toString() {
                return a.o(new StringBuilder("[SuffixTransformer('"), str2, "')]");
            }
        } : d;
    }

    public abstract String b(String str);
}
