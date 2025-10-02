package com.fasterxml.jackson.annotation;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.util.UUID;

/* loaded from: classes4.dex */
public class ObjectIdGenerators {

    public static abstract class Base<T> extends ObjectIdGenerator<T> {
        public final Class d;

        public Base(Class cls) {
            this.d = cls;
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public boolean a(ObjectIdGenerator objectIdGenerator) {
            return objectIdGenerator.getClass() == getClass() && objectIdGenerator.d() == this.d;
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public Class d() {
            return this.d;
        }
    }

    public static final class IntSequenceGenerator extends Base<Integer> {
        public transient int e;

        public IntSequenceGenerator(Class cls, int i) {
            super(cls);
            this.e = i;
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final ObjectIdGenerator b(Class cls) {
            return this.d == cls ? this : new IntSequenceGenerator(cls, this.e);
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final Object c(Object obj) {
            if (obj == null) {
                return null;
            }
            int i = this.e;
            this.e = i + 1;
            return Integer.valueOf(i);
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final ObjectIdGenerator.IdKey e(Object obj) {
            if (obj == null) {
                return null;
            }
            return new ObjectIdGenerator.IdKey(IntSequenceGenerator.class, this.d, obj);
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final ObjectIdGenerator f() {
            return new IntSequenceGenerator(this.d, 1);
        }
    }

    public static abstract class None extends ObjectIdGenerator<Object> {
    }

    public static abstract class PropertyGenerator extends Base<Object> {
        public PropertyGenerator(Class cls) {
            super(cls);
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators.Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final Class d() {
            return this.d;
        }
    }

    public static final class StringIdGenerator extends Base<String> {
        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators.Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final boolean a(ObjectIdGenerator objectIdGenerator) {
            return objectIdGenerator instanceof StringIdGenerator;
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final ObjectIdGenerator b(Class cls) {
            return this;
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final Object c(Object obj) {
            return UUID.randomUUID().toString();
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final ObjectIdGenerator.IdKey e(Object obj) {
            if (obj == null) {
                return null;
            }
            return new ObjectIdGenerator.IdKey(StringIdGenerator.class, null, obj);
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final ObjectIdGenerator f() {
            return this;
        }
    }

    public static final class UUIDGenerator extends Base<UUID> {
        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators.Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final boolean a(ObjectIdGenerator objectIdGenerator) {
            return objectIdGenerator.getClass() == UUIDGenerator.class;
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final ObjectIdGenerator b(Class cls) {
            return this;
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final Object c(Object obj) {
            return UUID.randomUUID();
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final ObjectIdGenerator.IdKey e(Object obj) {
            if (obj == null) {
                return null;
            }
            return new ObjectIdGenerator.IdKey(UUIDGenerator.class, null, obj);
        }

        @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
        public final ObjectIdGenerator f() {
            return this;
        }
    }
}
