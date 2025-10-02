package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class PolymorphicTypeValidator implements Serializable {

    public static abstract class Base extends PolymorphicTypeValidator implements Serializable {
        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity a(JavaType javaType) {
            return Validity.f;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity b() {
            return Validity.f;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity c() {
            return Validity.f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Validity {
        public static final Validity d;
        public static final Validity e;
        public static final Validity f;
        public static final /* synthetic */ Validity[] g;

        static {
            Validity validity = new Validity("ALLOWED", 0);
            d = validity;
            Validity validity2 = new Validity("DENIED", 1);
            e = validity2;
            Validity validity3 = new Validity("INDETERMINATE", 2);
            f = validity3;
            g = new Validity[]{validity, validity2, validity3};
        }

        public static Validity valueOf(String str) {
            return (Validity) Enum.valueOf(Validity.class, str);
        }

        public static Validity[] values() {
            return (Validity[]) g.clone();
        }
    }

    public abstract Validity a(JavaType javaType);

    public abstract Validity b();

    public abstract Validity c();
}
