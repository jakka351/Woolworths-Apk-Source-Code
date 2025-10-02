package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class AccessorNamingStrategy {

    public static class Base extends AccessorNamingStrategy implements Serializable {
        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public final String a(AnnotatedMethod annotatedMethod, String str) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public final String b(String str) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public final String c(AnnotatedMethod annotatedMethod, String str) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public final String d(String str) {
            return str;
        }
    }

    public static abstract class Provider implements Serializable {
    }

    public abstract String a(AnnotatedMethod annotatedMethod, String str);

    public abstract String b(String str);

    public abstract String c(AnnotatedMethod annotatedMethod, String str);

    public abstract String d(String str);
}
