package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public interface TypeResolutionContext {

    public static class Basic implements TypeResolutionContext {
        public final TypeFactory d;
        public final TypeBindings e;

        public Basic(TypeFactory typeFactory, TypeBindings typeBindings) {
            this.d = typeFactory;
            this.e = typeBindings;
        }

        @Override // com.fasterxml.jackson.databind.introspect.TypeResolutionContext
        public final JavaType a(Type type) {
            return this.d.b(null, type, this.e);
        }
    }

    public static class Empty implements TypeResolutionContext {
        @Override // com.fasterxml.jackson.databind.introspect.TypeResolutionContext
        public final JavaType a(Type type) {
            throw null;
        }
    }

    JavaType a(Type type);
}
