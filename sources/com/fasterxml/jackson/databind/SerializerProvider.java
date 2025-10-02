package com.fasterxml.jackson.databind;

import YU.a;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.text.DateFormat;

/* loaded from: classes4.dex */
public abstract class SerializerProvider extends DatabindContext {
    public static final FailingSerializer n = new FailingSerializer(Object.class);
    public static final UnknownSerializer o = new UnknownSerializer(Object.class, 0);
    public final SerializationConfig d;
    public final SerializerFactory e;
    public final SerializerCache f;
    public transient ContextAttributes g;
    public final UnknownSerializer h;
    public final NullSerializer i;
    public final FailingSerializer j;
    public final ReadOnlyClassToSerializerMap k;
    public DateFormat l;
    public final boolean m;

    public SerializerProvider() {
        this.h = o;
        this.i = NullSerializer.f;
        this.j = n;
        this.d = null;
        this.e = null;
        this.f = new SerializerCache();
        this.k = null;
        this.g = null;
        this.m = true;
    }

    public final JsonSerializer B(Class cls) {
        return cls == Object.class ? this.h : new UnknownSerializer(cls, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer C(JsonSerializer jsonSerializer, BeanProperty beanProperty) {
        return (jsonSerializer == 0 || !(jsonSerializer instanceof ContextualSerializer)) ? jsonSerializer : ((ContextualSerializer) jsonSerializer).b(this, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer D(JsonSerializer jsonSerializer, BeanProperty beanProperty) {
        return (jsonSerializer == 0 || !(jsonSerializer instanceof ContextualSerializer)) ? jsonSerializer : ((ContextualSerializer) jsonSerializer).b(this, beanProperty);
    }

    public abstract Object E(Class cls);

    public abstract boolean F(Object obj);

    public final void G(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) throws InvalidDefinitionException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        StringBuilder sbV = a.v("Invalid definition for property ", DatabindContext.b(beanPropertyDefinition.getName()), " (of type ", ClassUtil.B(beanDescription.f14226a.d), "): ");
        sbV.append(str);
        throw new InvalidDefinitionException(z(), sbV.toString());
    }

    public final void H(BeanDescription beanDescription, String str, Object... objArr) throws InvalidDefinitionException {
        String strB = ClassUtil.B(beanDescription.f14226a.d);
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new InvalidDefinitionException(z(), a.i("Invalid type definition for type ", strB, ": ", str));
    }

    public abstract JsonSerializer I(Annotated annotated, Object obj);

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final MapperConfig d() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final TypeFactory e() {
        return this.d.e.d;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final InvalidTypeIdException f(JavaType javaType, String str, String str2) {
        return new InvalidTypeIdException(null, DatabindContext.a("Could not resolve type id '" + str + "' as a subtype of " + ClassUtil.t(javaType), str2), null);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final Object j(String str) throws InvalidDefinitionException {
        throw new InvalidDefinitionException(z(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer k(JavaType javaType) throws JsonMappingException {
        try {
            JsonSerializer jsonSerializerC = this.e.c(this, javaType);
            if (jsonSerializerC == 0) {
                return jsonSerializerC;
            }
            SerializerCache serializerCache = this.f;
            synchronized (serializerCache) {
                try {
                    LRUMap lRUMap = serializerCache.f14306a;
                    if (lRUMap.f.f(new TypeKey(javaType, false), jsonSerializerC, false) == null) {
                        serializerCache.b.set(null);
                    }
                    if (jsonSerializerC instanceof ResolvableSerializer) {
                        ((ResolvableSerializer) jsonSerializerC).a(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return jsonSerializerC;
        } catch (IllegalArgumentException e) {
            throw new JsonMappingException(z(), ClassUtil.i(e), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer l(Class cls) throws InvalidDefinitionException {
        JavaType javaTypeC = this.d.c(cls);
        try {
            JsonSerializer jsonSerializerC = this.e.c(this, javaTypeC);
            if (jsonSerializerC == 0) {
                return jsonSerializerC;
            }
            SerializerCache serializerCache = this.f;
            synchronized (serializerCache) {
                try {
                    LRUMap lRUMap = serializerCache.f14306a;
                    Object objF = lRUMap.f.f(new TypeKey(cls, false), jsonSerializerC, false);
                    LRUMap lRUMap2 = serializerCache.f14306a;
                    Object objF2 = lRUMap2.f.f(new TypeKey(javaTypeC, false), jsonSerializerC, false);
                    if (objF == null || objF2 == null) {
                        serializerCache.b.set(null);
                    }
                    if (jsonSerializerC instanceof ResolvableSerializer) {
                        ((ResolvableSerializer) jsonSerializerC).a(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return jsonSerializerC;
        } catch (IllegalArgumentException e) {
            j(ClassUtil.i(e));
            throw null;
        }
    }

    public final DateFormat m() {
        DateFormat dateFormat = this.l;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.d.e.h.clone();
        this.l = dateFormat2;
        return dateFormat2;
    }

    public final JavaType n(JavaType javaType, Class cls) {
        return javaType.u(cls) ? javaType : this.d.e.d.j(javaType, cls, true);
    }

    public final void o(JsonGenerator jsonGenerator) {
        if (this.m) {
            jsonGenerator.Y();
        } else {
            this.i.getClass();
            jsonGenerator.Y();
        }
    }

    public final JsonSerializer p(JavaType javaType, BeanProperty beanProperty) {
        JsonSerializer jsonSerializerB = this.k.b(javaType);
        return (jsonSerializerB == null && (jsonSerializerB = this.f.a(javaType)) == null && (jsonSerializerB = k(javaType)) == null) ? B(javaType.d) : D(jsonSerializerB, beanProperty);
    }

    public final JsonSerializer q(Class cls, BeanProperty beanProperty) {
        JsonSerializer jsonSerializerC = this.k.c(cls);
        if (jsonSerializerC == null) {
            SerializerCache serializerCache = this.f;
            JsonSerializer jsonSerializerB = serializerCache.b(cls);
            if (jsonSerializerB == null) {
                jsonSerializerC = serializerCache.a(this.d.c(cls));
                if (jsonSerializerC == null && (jsonSerializerC = l(cls)) == null) {
                    return B(cls);
                }
            } else {
                jsonSerializerC = jsonSerializerB;
            }
        }
        return D(jsonSerializerC, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer r(JavaType javaType, BeanProperty beanProperty) {
        JsonSerializer jsonSerializerB = this.e.b(this, javaType);
        if (jsonSerializerB instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializerB).a(this);
        }
        return D(jsonSerializerB, beanProperty);
    }

    public abstract WritableObjectId s(Object obj, ObjectIdGenerator objectIdGenerator);

    public final JsonSerializer t(JavaType javaType, BeanProperty beanProperty) {
        JsonSerializer jsonSerializerB = this.k.b(javaType);
        return (jsonSerializerB == null && (jsonSerializerB = this.f.a(javaType)) == null && (jsonSerializerB = k(javaType)) == null) ? B(javaType.d) : C(jsonSerializerB, beanProperty);
    }

    public final JsonSerializer u(Class cls, BeanProperty beanProperty) {
        JsonSerializer jsonSerializerC = this.k.c(cls);
        if (jsonSerializerC == null) {
            SerializerCache serializerCache = this.f;
            JsonSerializer jsonSerializerB = serializerCache.b(cls);
            if (jsonSerializerB == null) {
                jsonSerializerC = serializerCache.a(this.d.c(cls));
                if (jsonSerializerC == null && (jsonSerializerC = l(cls)) == null) {
                    return B(cls);
                }
            } else {
                jsonSerializerC = jsonSerializerB;
            }
        }
        return C(jsonSerializerC, beanProperty);
    }

    public final JsonSerializer w(Class cls) {
        JsonSerializer jsonSerializer;
        JsonSerializer jsonSerializerA = this.k.a(cls);
        if (jsonSerializerA != null) {
            return jsonSerializerA;
        }
        SerializerCache serializerCache = this.f;
        synchronized (serializerCache) {
            LRUMap lRUMap = serializerCache.f14306a;
            jsonSerializer = (JsonSerializer) lRUMap.f.get(new TypeKey(cls, true));
        }
        if (jsonSerializer != null) {
            return jsonSerializer;
        }
        JsonSerializer jsonSerializerY = y(cls, null);
        SerializerFactory serializerFactory = this.e;
        SerializationConfig serializationConfig = this.d;
        TypeSerializer typeSerializerD = serializerFactory.d(serializationConfig, serializationConfig.c(cls));
        if (typeSerializerD != null) {
            jsonSerializerY = new TypeWrappedSerializer(typeSerializerD.a(null), jsonSerializerY);
        }
        SerializerCache serializerCache2 = this.f;
        synchronized (serializerCache2) {
            try {
                LRUMap lRUMap2 = serializerCache2.f14306a;
                if (lRUMap2.f.f(new TypeKey(cls, true), jsonSerializerY, false) == null) {
                    serializerCache2.b.set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jsonSerializerY;
    }

    public final JsonSerializer x(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        if (javaType == null) {
            throw new JsonMappingException(z(), "Null passed for `valueType` of `findValueSerializer()`", (Throwable) null);
        }
        JsonSerializer jsonSerializerB = this.k.b(javaType);
        return (jsonSerializerB == null && (jsonSerializerB = this.f.a(javaType)) == null && (jsonSerializerB = k(javaType)) == null) ? B(javaType.d) : D(jsonSerializerB, beanProperty);
    }

    public final JsonSerializer y(Class cls, BeanProperty beanProperty) {
        JsonSerializer jsonSerializerC = this.k.c(cls);
        if (jsonSerializerC == null) {
            SerializerCache serializerCache = this.f;
            JsonSerializer jsonSerializerB = serializerCache.b(cls);
            if (jsonSerializerB == null) {
                jsonSerializerC = serializerCache.a(this.d.c(cls));
                if (jsonSerializerC == null && (jsonSerializerC = l(cls)) == null) {
                    return B(cls);
                }
            } else {
                jsonSerializerC = jsonSerializerB;
            }
        }
        return D(jsonSerializerC, beanProperty);
    }

    public JsonGenerator z() {
        return null;
    }

    public SerializerProvider(DefaultSerializerProvider defaultSerializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
        this.h = o;
        this.i = NullSerializer.f;
        FailingSerializer failingSerializer = n;
        this.j = failingSerializer;
        this.e = serializerFactory;
        this.d = serializationConfig;
        SerializerCache serializerCache = defaultSerializerProvider.f;
        this.f = serializerCache;
        this.h = defaultSerializerProvider.h;
        NullSerializer nullSerializer = defaultSerializerProvider.i;
        this.i = nullSerializer;
        this.j = defaultSerializerProvider.j;
        this.m = nullSerializer == failingSerializer;
        serializationConfig.getClass();
        this.g = serializationConfig.h;
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMap = (ReadOnlyClassToSerializerMap) serializerCache.b.get();
        if (readOnlyClassToSerializerMap == null) {
            synchronized (serializerCache) {
                readOnlyClassToSerializerMap = (ReadOnlyClassToSerializerMap) serializerCache.b.get();
                if (readOnlyClassToSerializerMap == null) {
                    ReadOnlyClassToSerializerMap readOnlyClassToSerializerMap2 = new ReadOnlyClassToSerializerMap(serializerCache.f14306a);
                    serializerCache.b.set(readOnlyClassToSerializerMap2);
                    readOnlyClassToSerializerMap = readOnlyClassToSerializerMap2;
                }
            }
        }
        this.k = readOnlyClassToSerializerMap;
    }
}
