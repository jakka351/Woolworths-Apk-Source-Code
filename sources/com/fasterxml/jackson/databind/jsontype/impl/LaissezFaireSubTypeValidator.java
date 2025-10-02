package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;

/* loaded from: classes4.dex */
public final class LaissezFaireSubTypeValidator extends PolymorphicTypeValidator.Base {
    public static final LaissezFaireSubTypeValidator d = new LaissezFaireSubTypeValidator();

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity a(JavaType javaType) {
        return PolymorphicTypeValidator.Validity.f;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity b() {
        return PolymorphicTypeValidator.Validity.d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity c() {
        return PolymorphicTypeValidator.Validity.d;
    }
}
