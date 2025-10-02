package com.fasterxml.jackson.databind.deser;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public abstract class DefaultDeserializationContext extends DeserializationContext implements Serializable {
    public transient LinkedHashMap n;
    public ArrayList o;

    public static final class Impl extends DefaultDeserializationContext {
        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public final Impl d0(DeserializationConfig deserializationConfig) {
            return new Impl(this, deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public final Impl e0(DeserializationConfig deserializationConfig, JsonParser jsonParser) {
            return new Impl(this, deserializationConfig, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public final Impl g0(DeserializerFactory deserializerFactory) {
            return new Impl(this, deserializerFactory);
        }
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public final KeyDeserializer O(Annotated annotated, Object obj) {
        KeyDeserializer keyDeserializer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof KeyDeserializer) {
            keyDeserializer = (KeyDeserializer) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == KeyDeserializer.None.class || ClassUtil.v(cls)) {
                return null;
            }
            if (!KeyDeserializer.class.isAssignableFrom(cls)) {
                throw new IllegalStateException(a.f(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<KeyDeserializer>"));
            }
            DeserializationConfig deserializationConfig = this.f;
            deserializationConfig.e.getClass();
            keyDeserializer = (KeyDeserializer) ClassUtil.h(cls, deserializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS));
        }
        if (keyDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) keyDeserializer).a(this);
        }
        return keyDeserializer;
    }

    public abstract Impl d0(DeserializationConfig deserializationConfig);

    public abstract Impl e0(DeserializationConfig deserializationConfig, JsonParser jsonParser);

    public final Object f0(JsonParser jsonParser, JavaType javaType, JsonDeserializer jsonDeserializer) throws MismatchedInputException {
        DeserializationConfig deserializationConfig = this.f;
        deserializationConfig.getClass();
        if (!deserializationConfig.r(DeserializationFeature.UNWRAP_ROOT_VALUE)) {
            return jsonDeserializer.e(jsonParser, this);
        }
        RootNameLookup rootNameLookup = deserializationConfig.i;
        rootNameLookup.getClass();
        String str = rootNameLookup.a(javaType.d, deserializationConfig).d;
        JsonToken jsonTokenE = jsonParser.e();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (jsonTokenE != jsonToken) {
            Y(jsonToken, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", ClassUtil.A(str), jsonParser.e());
            throw null;
        }
        JsonToken jsonTokenN1 = jsonParser.N1();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonTokenN1 != jsonToken2) {
            Y(jsonToken2, "Current token not FIELD_NAME (to contain expected root name %s), but %s", ClassUtil.A(str), jsonParser.e());
            throw null;
        }
        String strD = jsonParser.d();
        if (str.equals(strD)) {
            jsonParser.N1();
            Object objE = jsonDeserializer.e(jsonParser, this);
            JsonToken jsonTokenN12 = jsonParser.N1();
            JsonToken jsonToken3 = JsonToken.END_OBJECT;
            if (jsonTokenN12 == jsonToken3) {
                return objE;
            }
            Y(jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", ClassUtil.c(str), jsonParser.e());
            throw null;
        }
        Object[] objArr = {ClassUtil.A(strD), ClassUtil.c(str), ClassUtil.t(javaType)};
        Class cls = javaType.d;
        MismatchedInputException mismatchedInputException = new MismatchedInputException(this.i, String.format("Root name (%s) does not match expected (%s) for type %s", objArr));
        if (strD == null) {
            throw mismatchedInputException;
        }
        mismatchedInputException.e(cls, strD);
        throw mismatchedInputException;
    }

    public abstract Impl g0(DeserializerFactory deserializerFactory);

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public final JsonDeserializer m(Annotated annotated, Object obj) {
        JsonDeserializer jsonDeserializer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsonDeserializer) {
            jsonDeserializer = (JsonDeserializer) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == JsonDeserializer.None.class || ClassUtil.v(cls)) {
                return null;
            }
            if (!JsonDeserializer.class.isAssignableFrom(cls)) {
                throw new IllegalStateException(a.f(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<JsonDeserializer>"));
            }
            DeserializationConfig deserializationConfig = this.f;
            deserializationConfig.e.getClass();
            jsonDeserializer = (JsonDeserializer) ClassUtil.h(cls, deserializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS));
        }
        if (jsonDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) jsonDeserializer).a(this);
        }
        return jsonDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public final ReadableObjectId t(Object obj, ObjectIdGenerator objectIdGenerator, ObjectIdResolver objectIdResolver) {
        SimpleObjectIdResolver simpleObjectIdResolverC = null;
        if (obj == null) {
            return null;
        }
        ObjectIdGenerator.IdKey idKeyE = objectIdGenerator.e(obj);
        LinkedHashMap linkedHashMap = this.n;
        if (linkedHashMap == null) {
            this.n = new LinkedHashMap();
        } else {
            ReadableObjectId readableObjectId = (ReadableObjectId) linkedHashMap.get(idKeyE);
            if (readableObjectId != null) {
                return readableObjectId;
            }
        }
        ArrayList arrayList = this.o;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ObjectIdResolver objectIdResolver2 = (ObjectIdResolver) it.next();
                if (objectIdResolver2.d(objectIdResolver)) {
                    simpleObjectIdResolverC = objectIdResolver2;
                    break;
                }
            }
        } else {
            this.o = new ArrayList(8);
        }
        if (simpleObjectIdResolverC == null) {
            simpleObjectIdResolverC = objectIdResolver.c();
            this.o.add(simpleObjectIdResolverC);
        }
        ReadableObjectId readableObjectId2 = new ReadableObjectId(idKeyE);
        readableObjectId2.d = simpleObjectIdResolverC;
        this.n.put(idKeyE, readableObjectId2);
        return readableObjectId2;
    }
}
