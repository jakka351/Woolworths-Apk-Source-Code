package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements ContextualSerializer {
    public static final SimpleType u = TypeFactory.o();
    public static final JsonInclude.Include v = JsonInclude.Include.f;
    public final BeanProperty f;
    public final boolean g;
    public final JavaType h;
    public final JavaType i;
    public final JsonSerializer j;
    public final JsonSerializer k;
    public final TypeSerializer l;
    public PropertySerializerMap m;
    public final Set n;
    public final Set o;
    public final Object p;
    public final Object q;
    public final boolean r;
    public final IgnorePropertiesUtil.Checker s;
    public final boolean t;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.MapSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14320a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f14320a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14320a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14320a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14320a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14320a[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14320a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MapSerializer(Set set, Set set2, JavaType javaType, JavaType javaType2, boolean z, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2) {
        super(Map.class, 0);
        set = (set == null || set.isEmpty()) ? null : set;
        this.n = set;
        this.o = set2;
        this.h = javaType;
        this.i = javaType2;
        this.g = z;
        this.l = typeSerializer;
        this.j = jsonSerializer;
        this.k = jsonSerializer2;
        this.m = PropertySerializerMap.a();
        this.f = null;
        this.p = null;
        this.t = false;
        this.q = null;
        this.r = false;
        this.s = IgnorePropertiesUtil.a(set, set2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fasterxml.jackson.databind.ser.std.MapSerializer r(java.util.Set r11, java.util.Set r12, com.fasterxml.jackson.databind.JavaType r13, boolean r14, com.fasterxml.jackson.databind.jsontype.TypeSerializer r15, com.fasterxml.jackson.databind.JsonSerializer r16, com.fasterxml.jackson.databind.JsonSerializer r17, java.lang.Object r18) {
        /*
            r0 = r18
            if (r13 != 0) goto L9
            com.fasterxml.jackson.databind.type.SimpleType r13 = com.fasterxml.jackson.databind.ser.std.MapSerializer.u
            r5 = r13
            r6 = r5
            goto L21
        L9:
            com.fasterxml.jackson.databind.JavaType r1 = r13.o()
            java.lang.Class<java.util.Properties> r2 = java.util.Properties.class
            boolean r2 = r13.u(r2)
            if (r2 == 0) goto L1c
            com.fasterxml.jackson.databind.type.SimpleType r13 = com.fasterxml.jackson.databind.type.TypeFactory.o()
        L19:
            r6 = r13
            r5 = r1
            goto L21
        L1c:
            com.fasterxml.jackson.databind.JavaType r13 = r13.k()
            goto L19
        L21:
            r13 = 0
            if (r14 != 0) goto L31
            if (r6 == 0) goto L2e
            boolean r14 = r6.C()
            if (r14 == 0) goto L2e
            r14 = 1
            goto L2f
        L2e:
            r14 = r13
        L2f:
            r7 = r14
            goto L38
        L31:
            java.lang.Class r1 = r6.d
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto L2f
            r7 = r13
        L38:
            com.fasterxml.jackson.databind.ser.std.MapSerializer r2 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r3 = r11
            r4 = r12
            r8 = r15
            r9 = r16
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L53
            java.lang.String r11 = "withFilterId"
            java.lang.Class<com.fasterxml.jackson.databind.ser.std.MapSerializer> r12 = com.fasterxml.jackson.databind.ser.std.MapSerializer.class
            com.fasterxml.jackson.databind.util.ClassUtil.H(r12, r2, r11)
            com.fasterxml.jackson.databind.ser.std.MapSerializer r11 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r11.<init>(r2, r0, r13)
            return r11
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.r(java.util.Set, java.util.Set, com.fasterxml.jackson.databind.JavaType, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object):com.fasterxml.jackson.databind.ser.std.MapSerializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonSerializer b(com.fasterxml.jackson.databind.SerializerProvider r18, com.fasterxml.jackson.databind.BeanProperty r19) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.b(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean d(SerializerProvider serializerProvider, Object obj) {
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            boolean z = this.r;
            Object obj2 = this.q;
            if (obj2 != null || z) {
                boolean z2 = v == obj2;
                JsonSerializer jsonSerializer = this.k;
                if (jsonSerializer != null) {
                    for (Object obj3 : map.values()) {
                        if (obj3 == null) {
                            if (z) {
                            }
                        } else if (z2) {
                            if (!jsonSerializer.d(serializerProvider, obj3)) {
                            }
                        } else if (obj2 == null || !obj2.equals(map)) {
                        }
                    }
                } else {
                    for (Object obj4 : map.values()) {
                        if (obj4 != null) {
                            try {
                                JsonSerializer jsonSerializerQ = q(serializerProvider, obj4);
                                if (z2) {
                                    if (!jsonSerializerQ.d(serializerProvider, obj4)) {
                                    }
                                } else if (obj2 == null || !obj2.equals(map)) {
                                }
                            } catch (DatabindException unused) {
                            }
                        } else if (z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Map map = (Map) obj;
        jsonGenerator.x1(map);
        t(map, jsonGenerator, serializerProvider);
        jsonGenerator.H();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Map map = (Map) obj;
        jsonGenerator.i(map);
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.START_OBJECT, map));
        t(map, jsonGenerator, serializerProvider);
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public final ContainerSerializer o(TypeSerializer typeSerializer) {
        if (this.l == typeSerializer) {
            return this;
        }
        ClassUtil.H(MapSerializer.class, this, "_withValueTypeSerializer");
        return new MapSerializer(this, typeSerializer, this.q, this.r);
    }

    public final JsonSerializer q(SerializerProvider serializerProvider, Object obj) {
        Class<?> cls = obj.getClass();
        JsonSerializer jsonSerializerD = this.m.d(cls);
        if (jsonSerializerD != null) {
            return jsonSerializerD;
        }
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
            return serializerAndMapResultB.f14312a;
        }
        PropertySerializerMap propertySerializerMap3 = this.m;
        propertySerializerMap3.getClass();
        JsonSerializer jsonSerializerQ = serializerProvider.q(cls, beanProperty);
        PropertySerializerMap propertySerializerMapC = propertySerializerMap3.c(cls, jsonSerializerQ);
        if (propertySerializerMap3 != propertySerializerMapC) {
            this.m = propertySerializerMapC;
        }
        return jsonSerializerQ;
    }

    public final void s(Map map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, Object obj) throws IOException {
        JsonSerializer jsonSerializer;
        JsonSerializer jsonSerializerQ;
        boolean z = v == obj;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                jsonSerializer = serializerProvider.j;
            } else {
                IgnorePropertiesUtil.Checker checker = this.s;
                if (checker == null || !checker.a(key)) {
                    jsonSerializer = this.j;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                jsonSerializerQ = this.k;
                if (jsonSerializerQ == null) {
                    jsonSerializerQ = q(serializerProvider, value);
                }
                if (z) {
                    if (jsonSerializerQ.d(serializerProvider, value)) {
                        continue;
                    } else {
                        jsonSerializer.f(key, jsonGenerator, serializerProvider);
                        jsonSerializerQ.g(value, jsonGenerator, serializerProvider, this.l);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    jsonSerializer.f(key, jsonGenerator, serializerProvider);
                    jsonSerializerQ.g(value, jsonGenerator, serializerProvider, this.l);
                }
            } else if (this.r) {
                continue;
            } else {
                jsonSerializerQ = serializerProvider.i;
                jsonSerializer.f(key, jsonGenerator, serializerProvider);
                try {
                    jsonSerializerQ.g(value, jsonGenerator, serializerProvider, this.l);
                } catch (Exception e) {
                    StdSerializer.n(serializerProvider, e, map, String.valueOf(key));
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x019d A[EXC_TOP_SPLITTER, PHI: r15
  0x019d: PHI (r15v1 com.fasterxml.jackson.databind.JsonSerializer) = 
  (r15v0 com.fasterxml.jackson.databind.JsonSerializer)
  (r15v3 com.fasterxml.jackson.databind.JsonSerializer)
  (r15v3 com.fasterxml.jackson.databind.JsonSerializer)
  (r15v3 com.fasterxml.jackson.databind.JsonSerializer)
 binds: [B:122:0x0180, B:128:0x0191, B:130:0x0194, B:132:0x019a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.fasterxml.jackson.databind.ser.std.MapSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(java.util.Map r18, com.fasterxml.jackson.core.JsonGenerator r19, com.fasterxml.jackson.databind.SerializerProvider r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.t(java.util.Map, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider):void");
    }

    public final MapSerializer u(Object obj, boolean z) {
        if (obj == this.q && z == this.r) {
            return this;
        }
        ClassUtil.H(MapSerializer.class, this, "withContentInclusion");
        return new MapSerializer(this, this.l, obj, z);
    }

    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, Set set, Set set2) {
        super(Map.class, 0);
        set = (set == null || set.isEmpty()) ? null : set;
        this.n = set;
        this.o = set2;
        this.h = mapSerializer.h;
        this.i = mapSerializer.i;
        this.g = mapSerializer.g;
        this.l = mapSerializer.l;
        this.j = jsonSerializer;
        this.k = jsonSerializer2;
        this.m = PropertySerializerMap.a();
        this.f = beanProperty;
        this.p = mapSerializer.p;
        this.t = mapSerializer.t;
        this.q = mapSerializer.q;
        this.r = mapSerializer.r;
        this.s = IgnorePropertiesUtil.a(set, set2);
    }

    public MapSerializer(MapSerializer mapSerializer, TypeSerializer typeSerializer, Object obj, boolean z) {
        super(Map.class, 0);
        this.n = mapSerializer.n;
        this.o = mapSerializer.o;
        this.h = mapSerializer.h;
        this.i = mapSerializer.i;
        this.g = mapSerializer.g;
        this.l = typeSerializer;
        this.j = mapSerializer.j;
        this.k = mapSerializer.k;
        this.m = mapSerializer.m;
        this.f = mapSerializer.f;
        this.p = mapSerializer.p;
        this.t = mapSerializer.t;
        this.q = obj;
        this.r = z;
        this.s = mapSerializer.s;
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, 0);
        this.n = mapSerializer.n;
        this.o = mapSerializer.o;
        this.h = mapSerializer.h;
        this.i = mapSerializer.i;
        this.g = mapSerializer.g;
        this.l = mapSerializer.l;
        this.j = mapSerializer.j;
        this.k = mapSerializer.k;
        this.m = PropertySerializerMap.a();
        this.f = mapSerializer.f;
        this.p = obj;
        this.t = z;
        this.q = mapSerializer.q;
        this.r = mapSerializer.r;
        this.s = mapSerializer.s;
    }
}
