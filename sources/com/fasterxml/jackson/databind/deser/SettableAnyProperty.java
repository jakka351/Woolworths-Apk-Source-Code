package com.fasterxml.jackson.databind.deser;

import YU.a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class SettableAnyProperty implements Serializable {
    public final BeanProperty.Std d;
    public final AnnotatedMember e;
    public final JavaType f;
    public final JsonDeserializer g;
    public final TypeDeserializer h;
    public final KeyDeserializer i;

    public static class AnySetterReferring extends ReadableObjectId.Referring {
        public final SettableAnyProperty b;
        public final Object c;
        public final String d;

        public AnySetterReferring(SettableAnyProperty settableAnyProperty, UnresolvedForwardReference unresolvedForwardReference, Object obj, String str) {
            super(unresolvedForwardReference);
            this.b = settableAnyProperty;
            this.c = obj;
            this.d = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public final void a(Object obj, Object obj2) throws IOException {
            if (obj.equals(this.f14253a.h.b.f)) {
                this.b.d(this.c, this.d, obj2);
            } else {
                throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
            }
        }
    }

    public static class JsonNodeFieldAnyProperty extends SettableAnyProperty implements Serializable {
        public final JsonNodeFactory j;

        public JsonNodeFieldAnyProperty(BeanProperty.Std std, AnnotatedField annotatedField, JavaType javaType, JsonDeserializer jsonDeserializer, JsonNodeFactory jsonNodeFactory) {
            super(std, annotatedField, javaType, null, jsonDeserializer, null);
            this.j = jsonNodeFactory;
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public final void a(Object obj, Object obj2, Object obj3) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
            f(obj, (String) obj2, (JsonNode) obj3);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public final Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return this.g.e(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public final void c(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
            f(obj, str, (JsonNode) this.g.e(jsonParser, deserializationContext));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public final SettableAnyProperty e(JsonDeserializer jsonDeserializer) {
            return this;
        }

        public final void f(Object obj, String str, JsonNode jsonNode) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
            ObjectNode objectNode;
            AnnotatedField annotatedField = (AnnotatedField) this.e;
            Object objK = annotatedField.k(obj);
            if (objK == null) {
                JsonNodeFactory jsonNodeFactory = this.j;
                jsonNodeFactory.getClass();
                objectNode = new ObjectNode(jsonNodeFactory);
                annotatedField.o(obj, objectNode);
            } else {
                if (!(objK instanceof ObjectNode)) {
                    throw new JsonMappingException(null, a.i("Value \"any-setter\" '", this.d.d.d, "' not `ObjectNode` but ", ClassUtil.B(objK.getClass())));
                }
                objectNode = (ObjectNode) objK;
            }
            if (jsonNode == null) {
                objectNode.d.getClass();
                jsonNode = NullNode.d;
            }
            objectNode.e.put(str, jsonNode);
        }
    }

    public static class MapFieldAnyProperty extends SettableAnyProperty implements Serializable {
        public final ValueInstantiator j;

        public MapFieldAnyProperty(BeanProperty.Std std, AnnotatedMember annotatedMember, JavaType javaType, KeyDeserializer keyDeserializer, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator) {
            super(std, annotatedMember, javaType, keyDeserializer, jsonDeserializer, typeDeserializer);
            this.j = valueInstantiator;
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public final void a(Object obj, Object obj2, Object obj3) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
            AnnotatedField annotatedField = (AnnotatedField) this.e;
            Map map = (Map) annotatedField.k(obj);
            if (map == null) {
                ValueInstantiator valueInstantiator = this.j;
                if (valueInstantiator == null) {
                    throw new JsonMappingException(null, a.j("Cannot create an instance of ", ClassUtil.B(this.f.d), " for use as \"any-setter\" '", this.d.d.d, "'"));
                }
                map = (Map) valueInstantiator.y(null);
                annotatedField.o(obj, map);
            }
            map.put(obj2, obj3);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public final SettableAnyProperty e(JsonDeserializer jsonDeserializer) {
            return new MapFieldAnyProperty(this.d, this.e, this.f, this.i, jsonDeserializer, this.h, this.j);
        }
    }

    public static class MethodAnyProperty extends SettableAnyProperty implements Serializable {
        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public final void a(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ((AnnotatedMethod) this.e).g.invoke(obj, obj2, obj3);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public final SettableAnyProperty e(JsonDeserializer jsonDeserializer) {
            return new MethodAnyProperty(this.d, this.e, this.f, this.i, jsonDeserializer, this.h);
        }
    }

    public SettableAnyProperty(BeanProperty.Std std, AnnotatedMember annotatedMember, JavaType javaType, KeyDeserializer keyDeserializer, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer) {
        this.d = std;
        this.e = annotatedMember;
        this.f = javaType;
        this.g = jsonDeserializer;
        this.h = typeDeserializer;
        this.i = keyDeserializer;
    }

    public abstract void a(Object obj, Object obj2, Object obj3);

    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        boolean zA1 = jsonParser.a1(JsonToken.VALUE_NULL);
        JsonDeserializer jsonDeserializer = this.g;
        if (zA1) {
            return jsonDeserializer.c(deserializationContext);
        }
        TypeDeserializer typeDeserializer = this.h;
        return typeDeserializer != null ? jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer) : jsonDeserializer.e(jsonParser, deserializationContext);
    }

    public void c(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        try {
            KeyDeserializer keyDeserializer = this.i;
            d(obj, keyDeserializer == null ? str : keyDeserializer.a(deserializationContext, str), b(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if (this.g.k() == null) {
                throw new JsonMappingException(jsonParser, "Unresolved forward reference but no identity info.", e);
            }
            Class cls = this.f.d;
            e.h.a(new AnySetterReferring(this, e, obj, str));
        }
    }

    public final void d(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            a(obj, obj2, obj3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            if (!(e2 instanceof IllegalArgumentException)) {
                ClassUtil.F(e2);
                ClassUtil.G(e2);
                Throwable thS = ClassUtil.s(e2);
                throw new JsonMappingException((Closeable) null, ClassUtil.i(thS), thS);
            }
            String strF = ClassUtil.f(obj3);
            StringBuilder sb = new StringBuilder("Problem deserializing \"any-property\" '");
            sb.append(obj2);
            sb.append("' of class " + ClassUtil.B(this.e.h()) + " (expected type: ");
            sb.append(this.f);
            sb.append("; actual type: ");
            sb.append(strF);
            sb.append(")");
            String strI = ClassUtil.i(e2);
            if (strI != null) {
                sb.append(", problem: ");
                sb.append(strI);
            } else {
                sb.append(" (no error message provided)");
            }
            throw new JsonMappingException((Closeable) null, sb.toString(), e2);
        }
    }

    public abstract SettableAnyProperty e(JsonDeserializer jsonDeserializer);

    public Object readResolve() {
        if (this.e.b() != null) {
            return this;
        }
        throw new IllegalArgumentException("Missing method/field (broken JDK (de)serialization?)");
    }

    public final String toString() {
        return "[any property on class " + ClassUtil.B(this.e.h()) + "]";
    }
}
