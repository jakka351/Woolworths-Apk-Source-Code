package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import java.io.IOException;
import java.util.Map;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements ContextualSerializer {
    public final BeanProperty f;
    public final boolean g;
    public final JavaType h;
    public final JavaType i;
    public final JsonSerializer j;
    public final JsonSerializer k;
    public final TypeSerializer l;
    public PropertySerializerMap m;
    public final Object n;
    public final boolean o;

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14307a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f14307a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14307a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14307a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14307a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14307a[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14307a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(javaType);
        this.h = javaType2;
        this.i = javaType3;
        this.g = z;
        this.l = typeSerializer;
        this.f = beanProperty;
        this.m = PropertySerializerMap.Empty.f14310a;
        this.n = null;
        this.o = false;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public final JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer jsonSerializerI;
        JsonSerializer jsonSerializerI2;
        boolean zF;
        boolean z;
        Object obj;
        JsonInclude.Value valueD;
        JsonInclude.Include include;
        SerializationConfig serializationConfig = serializerProvider.d;
        AnnotationIntrospector annotationIntrospectorD = serializationConfig.d();
        Object objB = null;
        AnnotatedMember annotatedMemberA = beanProperty == null ? null : beanProperty.a();
        if (annotatedMemberA != null) {
            Object objS = annotationIntrospectorD.s(annotatedMemberA);
            jsonSerializerI2 = objS != null ? serializerProvider.I(annotatedMemberA, objS) : null;
            Object objD = annotationIntrospectorD.d(annotatedMemberA);
            jsonSerializerI = objD != null ? serializerProvider.I(annotatedMemberA, objD) : null;
        } else {
            jsonSerializerI = null;
            jsonSerializerI2 = null;
        }
        if (jsonSerializerI == null) {
            jsonSerializerI = this.k;
        }
        JsonSerializer jsonSerializerJ = StdSerializer.j(serializerProvider, beanProperty, jsonSerializerI);
        JavaType javaType = this.i;
        if (jsonSerializerJ == null && this.g && !javaType.D()) {
            jsonSerializerJ = serializerProvider.p(javaType, beanProperty);
        }
        JsonSerializer jsonSerializer = jsonSerializerJ;
        if (jsonSerializerI2 == null) {
            jsonSerializerI2 = this.j;
        }
        JsonSerializer jsonSerializerR = jsonSerializerI2 == null ? serializerProvider.r(this.h, beanProperty) : serializerProvider.D(jsonSerializerI2, beanProperty);
        if (beanProperty != null && (valueD = beanProperty.d(serializationConfig, null)) != null && (include = valueD.e) != JsonInclude.Include.h) {
            int iOrdinal = include.ordinal();
            zF = true;
            if (iOrdinal != 1) {
                JsonInclude.Include include2 = JsonInclude.Include.f;
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        z = true;
                        obj = include2;
                    } else if (iOrdinal == 4) {
                        objB = BeanUtil.b(javaType);
                        if (objB != null && objB.getClass().isArray()) {
                            objB = ArrayBuilders.a(objB);
                        }
                    } else if (iOrdinal != 5) {
                        zF = false;
                    } else {
                        objB = serializerProvider.E(valueD.g);
                        if (objB != null) {
                            zF = serializerProvider.F(objB);
                        }
                    }
                } else if (javaType.b()) {
                    objB = include2;
                }
            }
            return new MapEntrySerializer(this, jsonSerializerR, jsonSerializer, obj, z);
        }
        objB = this.n;
        zF = this.o;
        z = zF;
        obj = objB;
        return new MapEntrySerializer(this, jsonSerializerR, jsonSerializer, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        Object value = ((Map.Entry) obj).getValue();
        if (value == null) {
            return this.o;
        }
        Object obj2 = this.n;
        if (obj2 == null) {
            return false;
        }
        JsonSerializer jsonSerializer = this.k;
        if (jsonSerializer == null) {
            Class<?> cls = value.getClass();
            JsonSerializer jsonSerializerD = this.m.d(cls);
            if (jsonSerializerD == null) {
                try {
                    PropertySerializerMap propertySerializerMap = this.m;
                    BeanProperty beanProperty = this.f;
                    propertySerializerMap.getClass();
                    JsonSerializer jsonSerializerQ = serializerProvider.q(cls, beanProperty);
                    PropertySerializerMap propertySerializerMapC = propertySerializerMap.c(cls, jsonSerializerQ);
                    if (propertySerializerMap != propertySerializerMapC) {
                        this.m = propertySerializerMapC;
                    }
                    jsonSerializer = jsonSerializerQ;
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                jsonSerializer = jsonSerializerD;
            }
        }
        return obj2 == JsonInclude.Include.f ? jsonSerializer.d(serializerProvider, value) : obj2.equals(value);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Map.Entry entry = (Map.Entry) obj;
        jsonGenerator.x1(entry);
        q(entry, jsonGenerator, serializerProvider);
        jsonGenerator.H();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Map.Entry entry = (Map.Entry) obj;
        jsonGenerator.i(entry);
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.START_OBJECT, entry));
        q(entry, jsonGenerator, serializerProvider);
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final ContainerSerializer o(TypeSerializer typeSerializer) {
        return new MapEntrySerializer(this, this.j, this.k, this.n, this.o);
    }

    public final void q(Map.Entry entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        JsonSerializer jsonSerializer;
        Object key = entry.getKey();
        JsonSerializer jsonSerializer2 = key == null ? serializerProvider.j : this.j;
        Object value = entry.getValue();
        if (value != null) {
            jsonSerializer = this.k;
            if (jsonSerializer == null) {
                Class<?> cls = value.getClass();
                JsonSerializer jsonSerializerD = this.m.d(cls);
                if (jsonSerializerD == null) {
                    JavaType javaType = this.i;
                    boolean zS = javaType.s();
                    BeanProperty beanProperty = this.f;
                    if (zS) {
                        PropertySerializerMap propertySerializerMap = this.m;
                        PropertySerializerMap.SerializerAndMapResult serializerAndMapResultB = propertySerializerMap.b(serializerProvider.n(javaType, cls), serializerProvider, beanProperty);
                        PropertySerializerMap propertySerializerMap2 = serializerAndMapResultB.b;
                        if (propertySerializerMap != propertySerializerMap2) {
                            this.m = propertySerializerMap2;
                        }
                        jsonSerializer = serializerAndMapResultB.f14312a;
                    } else {
                        PropertySerializerMap propertySerializerMap3 = this.m;
                        propertySerializerMap3.getClass();
                        JsonSerializer jsonSerializerQ = serializerProvider.q(cls, beanProperty);
                        PropertySerializerMap propertySerializerMapC = propertySerializerMap3.c(cls, jsonSerializerQ);
                        if (propertySerializerMap3 != propertySerializerMapC) {
                            this.m = propertySerializerMapC;
                        }
                        jsonSerializer = jsonSerializerQ;
                    }
                } else {
                    jsonSerializer = jsonSerializerD;
                }
            }
            Object obj = this.n;
            if (obj != null && ((obj == JsonInclude.Include.f && jsonSerializer.d(serializerProvider, value)) || obj.equals(value))) {
                return;
            }
        } else if (this.o) {
            return;
        } else {
            jsonSerializer = serializerProvider.i;
        }
        jsonSerializer2.f(key, jsonGenerator, serializerProvider);
        TypeSerializer typeSerializer = this.l;
        try {
            if (typeSerializer == null) {
                jsonSerializer.f(value, jsonGenerator, serializerProvider);
            } else {
                jsonSerializer.g(value, jsonGenerator, serializerProvider, typeSerializer);
            }
        } catch (Exception e) {
            StdSerializer.n(serializerProvider, e, entry, "" + key);
            throw null;
        }
    }

    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, Object obj, boolean z) {
        super(Map.class, 0);
        this.h = mapEntrySerializer.h;
        this.i = mapEntrySerializer.i;
        this.g = mapEntrySerializer.g;
        this.l = mapEntrySerializer.l;
        this.j = jsonSerializer;
        this.k = jsonSerializer2;
        this.m = PropertySerializerMap.Empty.f14310a;
        this.f = mapEntrySerializer.f;
        this.n = obj;
        this.o = z;
    }
}
