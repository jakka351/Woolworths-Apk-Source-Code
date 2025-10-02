package com.fasterxml.jackson.databind.ser;

import YU.a;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes4.dex */
public abstract class DefaultSerializerProvider extends SerializerProvider implements Serializable {
    public transient AbstractMap p;
    public transient ArrayList q;
    public transient JsonGenerator r;

    public static final class Impl extends DefaultSerializerProvider {
        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public final Impl K(SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
            return new Impl(this, serializationConfig, serializerFactory);
        }
    }

    public static IOException J(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strI = ClassUtil.i(exc);
        if (strI == null) {
            strI = "[no message for " + exc.getClass().getName() + "]";
        }
        return new JsonMappingException(jsonGenerator, strI, exc);
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public final Object E(Class cls) {
        if (cls == null) {
            return null;
        }
        SerializationConfig serializationConfig = this.d;
        serializationConfig.e.getClass();
        return ClassUtil.h(cls, serializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public final boolean F(Object obj) throws InvalidDefinitionException {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String name2 = e.getClass().getName();
            String strI = ClassUtil.i(e);
            StringBuilder sbV = a.v("Problem determining whether filter of type '", name, "' should filter out `null` values: (", name2, ") ");
            sbV.append(strI);
            String string = sbV.toString();
            Class<?> cls = obj.getClass();
            JsonGenerator jsonGenerator = this.r;
            e().k(cls);
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(jsonGenerator, string);
            invalidDefinitionException.initCause(e);
            throw invalidDefinitionException;
        }
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public final JsonSerializer I(Annotated annotated, Object obj) throws InvalidDefinitionException {
        JsonSerializer jsonSerializer;
        if (obj instanceof JsonSerializer) {
            jsonSerializer = (JsonSerializer) obj;
        } else {
            if (!(obj instanceof Class)) {
                annotated.f();
                j("AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
                throw null;
            }
            Class cls = (Class) obj;
            if (cls == JsonSerializer.None.class || ClassUtil.v(cls)) {
                return null;
            }
            if (!JsonSerializer.class.isAssignableFrom(cls)) {
                annotated.f();
                j("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
                throw null;
            }
            SerializationConfig serializationConfig = this.d;
            serializationConfig.e.getClass();
            jsonSerializer = (JsonSerializer) ClassUtil.h(cls, serializationConfig.m(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS));
        }
        if (jsonSerializer instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializer).a(this);
        }
        return jsonSerializer;
    }

    public abstract Impl K(SerializationConfig serializationConfig, SerializerFactory serializerFactory);

    public final void L(JsonGenerator jsonGenerator, Object obj) {
        this.r = jsonGenerator;
        if (obj == null) {
            try {
                this.i.getClass();
                jsonGenerator.Y();
                return;
            } catch (Exception e) {
                throw J(jsonGenerator, e);
            }
        }
        Class<?> cls = obj.getClass();
        JsonSerializer jsonSerializerW = w(cls);
        SerializationConfig serializationConfig = this.d;
        serializationConfig.getClass();
        if (!serializationConfig.r(SerializationFeature.WRAP_ROOT_VALUE)) {
            try {
                jsonSerializerW.f(obj, jsonGenerator, this);
                return;
            } catch (Exception e2) {
                throw J(jsonGenerator, e2);
            }
        }
        PropertyName propertyNameA = serializationConfig.i.a(cls, serializationConfig);
        try {
            jsonGenerator.p1();
            SerializationConfig serializationConfig2 = this.d;
            String str = propertyNameA.d;
            SerializedString serializedString = propertyNameA.f;
            if (serializedString == null) {
                serializedString = serializationConfig2 == null ? new SerializedString(str) : new SerializedString(str);
                propertyNameA.f = serializedString;
            }
            jsonGenerator.T(serializedString);
            jsonSerializerW.f(obj, jsonGenerator, this);
            jsonGenerator.H();
        } catch (Exception e3) {
            throw J(jsonGenerator, e3);
        }
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public final WritableObjectId s(Object obj, ObjectIdGenerator objectIdGenerator) {
        ObjectIdGenerator objectIdGeneratorF;
        AbstractMap abstractMap = this.p;
        if (abstractMap == null) {
            this.p = this.d.r(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
        } else {
            WritableObjectId writableObjectId = (WritableObjectId) abstractMap.get(obj);
            if (writableObjectId != null) {
                return writableObjectId;
            }
        }
        ArrayList arrayList = this.q;
        if (arrayList == null) {
            this.q = new ArrayList(8);
        } else {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                objectIdGeneratorF = (ObjectIdGenerator) this.q.get(i);
                if (objectIdGeneratorF.a(objectIdGenerator)) {
                    break;
                }
            }
        }
        objectIdGeneratorF = null;
        if (objectIdGeneratorF == null) {
            objectIdGeneratorF = objectIdGenerator.f();
            this.q.add(objectIdGeneratorF);
        }
        WritableObjectId writableObjectId2 = new WritableObjectId(objectIdGeneratorF);
        this.p.put(obj, writableObjectId2);
        return writableObjectId2;
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public final JsonGenerator z() {
        return this.r;
    }
}
