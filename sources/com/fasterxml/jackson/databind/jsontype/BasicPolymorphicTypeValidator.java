package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class BasicPolymorphicTypeValidator extends PolymorphicTypeValidator.Base implements Serializable {

    public static class Builder {

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$1, reason: invalid class name */
        class AnonymousClass1 extends TypeMatcher {
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$2, reason: invalid class name */
        class AnonymousClass2 extends TypeMatcher {
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$3, reason: invalid class name */
        class AnonymousClass3 extends TypeMatcher {
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$4, reason: invalid class name */
        class AnonymousClass4 extends TypeMatcher {
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$5, reason: invalid class name */
        class AnonymousClass5 extends NameMatcher {
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$6, reason: invalid class name */
        class AnonymousClass6 extends NameMatcher {
        }

        /* renamed from: com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator$Builder$7, reason: invalid class name */
        class AnonymousClass7 extends TypeMatcher {
        }
    }

    public static abstract class NameMatcher {
    }

    public static abstract class TypeMatcher {
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity a(JavaType javaType) {
        Class cls = javaType.d;
        return PolymorphicTypeValidator.Validity.f;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity b() {
        return PolymorphicTypeValidator.Validity.f;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity c() {
        return PolymorphicTypeValidator.Validity.f;
    }
}
