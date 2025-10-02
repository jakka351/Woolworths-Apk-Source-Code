package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class DefaultBaseTypeLimitingValidator extends PolymorphicTypeValidator implements Serializable {

    public static final class UnsafeBaseTypes {
        public static final UnsafeBaseTypes b = new UnsafeBaseTypes();

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f14290a;

        public UnsafeBaseTypes() {
            HashSet hashSet = new HashSet();
            this.f14290a = hashSet;
            hashSet.add(Object.class.getName());
            hashSet.add(Closeable.class.getName());
            hashSet.add(Serializable.class.getName());
            hashSet.add(AutoCloseable.class.getName());
            hashSet.add(Cloneable.class.getName());
            hashSet.add("java.util.logging.Handler");
            hashSet.add("javax.naming.Referenceable");
            hashSet.add("javax.sql.DataSource");
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity a(JavaType javaType) {
        return UnsafeBaseTypes.b.f14290a.contains(javaType.d.getName()) ? PolymorphicTypeValidator.Validity.e : PolymorphicTypeValidator.Validity.f;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity b() {
        return PolymorphicTypeValidator.Validity.f;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity c() {
        return PolymorphicTypeValidator.Validity.d;
    }
}
