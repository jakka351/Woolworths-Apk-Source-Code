package com.fasterxml.jackson.databind.deser.std;

import androidx.camera.core.impl.b;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements ContextualDeserializer, ResolvableDeserializer {
    public final KeyDeserializer k;
    public boolean l;
    public final JsonDeserializer m;
    public final TypeDeserializer n;
    public final ValueInstantiator o;
    public JsonDeserializer p;
    public PropertyBasedCreator q;
    public final boolean r;
    public Set s;
    public Set t;
    public IgnorePropertiesUtil.Checker u;
    public final boolean v;

    public static class MapReferring extends ReadableObjectId.Referring {
        public final MapReferringAccumulator b;
        public final LinkedHashMap c;
        public final Object d;

        public MapReferring(MapReferringAccumulator mapReferringAccumulator, UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            super(unresolvedForwardReference);
            this.c = new LinkedHashMap();
            this.b = mapReferringAccumulator;
            this.d = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public final void a(Object obj, Object obj2) {
            MapReferringAccumulator mapReferringAccumulator = this.b;
            Iterator it = mapReferringAccumulator.b.iterator();
            Map map = mapReferringAccumulator.f14261a;
            while (it.hasNext()) {
                MapReferring mapReferring = (MapReferring) it.next();
                boolean zEquals = obj.equals(mapReferring.f14253a.h.b.f);
                LinkedHashMap linkedHashMap = mapReferring.c;
                if (zEquals) {
                    it.remove();
                    map.put(mapReferring.d, obj2);
                    map.putAll(linkedHashMap);
                    return;
                }
                map = linkedHashMap;
            }
            throw new IllegalArgumentException(b.n(obj, "Trying to resolve a forward reference with id [", "] that wasn't previously seen as unresolved."));
        }
    }

    public static final class MapReferringAccumulator {

        /* renamed from: a, reason: collision with root package name */
        public final Map f14261a;
        public final ArrayList b = new ArrayList();

        public MapReferringAccumulator(Class cls, Map map) {
            this.f14261a = map;
        }

        public final void a(Object obj, Object obj2) {
            ArrayList arrayList = this.b;
            if (arrayList.isEmpty()) {
                this.f14261a.put(obj, obj2);
            } else {
                ((MapReferring) YU.a.c(1, arrayList)).c.put(obj, obj2);
            }
        }
    }

    public MapDeserializer(MapType mapType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(mapType, (NullValueProvider) null, (Boolean) null);
        this.k = keyDeserializer;
        this.m = jsonDeserializer;
        this.n = typeDeserializer;
        this.o = valueInstantiator;
        this.r = valueInstantiator.j();
        this.p = null;
        this.q = null;
        this.l = q0(mapType, keyDeserializer);
        this.u = null;
        this.v = mapType.n.u(Object.class);
    }

    public static boolean q0(JavaType javaType, KeyDeserializer keyDeserializer) {
        JavaType javaTypeO;
        if (keyDeserializer == null || (javaTypeO = javaType.o()) == null) {
            return true;
        }
        Class cls = javaTypeO.d;
        return (cls == String.class || cls == Object.class) && ClassUtil.x(keyDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public final void a(DeserializationContext deserializationContext) throws InvalidDefinitionException {
        DeserializationConfig deserializationConfig = deserializationContext.f;
        ValueInstantiator valueInstantiator = this.o;
        boolean zK = valueInstantiator.k();
        JavaType javaType = this.g;
        if (zK) {
            JavaType javaTypeF = valueInstantiator.F(deserializationConfig);
            if (javaTypeF == null) {
                deserializationContext.j(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, valueInstantiator.getClass().getName()));
                throw null;
            }
            this.p = deserializationContext.p(javaTypeF, null);
        } else if (valueInstantiator.i()) {
            JavaType javaTypeC = valueInstantiator.C(deserializationConfig);
            if (javaTypeC == null) {
                deserializationContext.j(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType, valueInstantiator.getClass().getName()));
                throw null;
            }
            this.p = deserializationContext.p(javaTypeC, null);
        }
        if (valueInstantiator.g()) {
            this.q = PropertyBasedCreator.b(deserializationContext, valueInstantiator, valueInstantiator.G(deserializationConfig), deserializationConfig.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this.l = q0(javaType, this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer b(com.fasterxml.jackson.databind.DeserializationContext r13, com.fasterxml.jackson.databind.BeanProperty r14) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            r12 = this;
            com.fasterxml.jackson.databind.JavaType r0 = r12.g
            com.fasterxml.jackson.databind.KeyDeserializer r1 = r12.k
            if (r1 != 0) goto L10
            com.fasterxml.jackson.databind.JavaType r2 = r0.o()
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r13.r(r2, r14)
        Le:
            r5 = r2
            goto L1d
        L10:
            boolean r2 = r1 instanceof com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer
            if (r2 == 0) goto L1c
            r2 = r1
            com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer r2 = (com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer) r2
            com.fasterxml.jackson.databind.KeyDeserializer r2 = r2.a()
            goto Le
        L1c:
            r5 = r1
        L1d:
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r12.m
            if (r14 == 0) goto L26
            com.fasterxml.jackson.databind.JsonDeserializer r3 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.g0(r13, r14, r2)
            goto L27
        L26:
            r3 = r2
        L27:
            com.fasterxml.jackson.databind.JavaType r0 = r0.k()
            if (r3 != 0) goto L33
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r13.p(r0, r14)
        L31:
            r6 = r0
            goto L38
        L33:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r13.C(r3, r14, r0)
            goto L31
        L38:
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r0 = r12.n
            if (r0 == 0) goto L42
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r3 = r0.f(r14)
            r7 = r3
            goto L43
        L42:
            r7 = r0
        L43:
            java.util.Set r3 = r12.s
            java.util.Set r4 = r12.t
            com.fasterxml.jackson.databind.DeserializationConfig r8 = r13.f
            com.fasterxml.jackson.databind.AnnotationIntrospector r8 = r8.d()
            if (r14 == 0) goto Lbe
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r9 = r14.a()
            if (r9 == 0) goto Lbe
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r10 = r8.J(r9)
            if (r10 == 0) goto L8c
            boolean r11 = r10.g
            if (r11 == 0) goto L62
            java.util.Set r10 = java.util.Collections.EMPTY_SET
            goto L64
        L62:
            java.util.Set r10 = r10.d
        L64:
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L8c
            if (r3 != 0) goto L72
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            goto L78
        L72:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>(r3)
            r3 = r11
        L78:
            java.util.Iterator r10 = r10.iterator()
        L7c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L8c
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            r3.add(r11)
            goto L7c
        L8c:
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r8 = r8.M(r9)
            if (r8 == 0) goto Lbe
            java.util.Set r8 = r8.d
            if (r8 == 0) goto Lbe
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            if (r4 != 0) goto La3
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r8)
            goto Lbe
        La3:
            java.util.Iterator r8 = r8.iterator()
        La7:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Lbd
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = r4.contains(r10)
            if (r11 == 0) goto La7
            r9.add(r10)
            goto La7
        Lbd:
            r4 = r9
        Lbe:
            r9 = r3
            r10 = r4
            com.fasterxml.jackson.databind.deser.NullValueProvider r8 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.f0(r13, r14, r6)
            if (r1 != r5) goto Ld7
            if (r2 != r6) goto Ld7
            if (r0 != r7) goto Ld7
            com.fasterxml.jackson.databind.deser.NullValueProvider r13 = r12.h
            if (r13 != r8) goto Ld7
            java.util.Set r13 = r12.s
            if (r13 != r9) goto Ld7
            java.util.Set r13 = r12.t
            if (r13 != r10) goto Ld7
            return r12
        Ld7:
            com.fasterxml.jackson.databind.deser.std.MapDeserializer r3 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.b(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strD;
        String str;
        Map map;
        Object objE;
        Object obj;
        Object objE2;
        PropertyBasedCreator propertyBasedCreator = this.q;
        NullValueProvider nullValueProvider = this.h;
        boolean z = this.i;
        TypeDeserializer typeDeserializer = this.n;
        JsonDeserializer jsonDeserializer = this.m;
        JavaType javaType = this.g;
        if (propertyBasedCreator != null) {
            PropertyValueBuffer propertyValueBufferD = propertyBasedCreator.d(jsonParser, deserializationContext, null);
            String strJ1 = jsonParser.y1() ? jsonParser.J1() : jsonParser.a1(JsonToken.FIELD_NAME) ? jsonParser.d() : null;
            while (strJ1 != null) {
                JsonToken jsonTokenN1 = jsonParser.N1();
                IgnorePropertiesUtil.Checker checker = this.u;
                if (checker == null || !checker.a(strJ1)) {
                    SettableBeanProperty settableBeanPropertyC = propertyBasedCreator.c(strJ1);
                    if (settableBeanPropertyC == null) {
                        Object objA = this.k.a(deserializationContext, strJ1);
                        try {
                            if (jsonTokenN1 != JsonToken.VALUE_NULL) {
                                objE2 = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                            } else if (!z) {
                                objE2 = nullValueProvider.c(deserializationContext);
                            }
                            propertyValueBufferD.d(objA, objE2);
                        } catch (Exception e) {
                            ContainerDeserializerBase.p0(deserializationContext, e, javaType.d, strJ1);
                            throw null;
                        }
                    } else if (propertyValueBufferD.b(settableBeanPropertyC, settableBeanPropertyC.g(jsonParser, deserializationContext))) {
                        jsonParser.N1();
                        try {
                            Map map2 = (Map) propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
                            r0(jsonParser, deserializationContext, map2);
                            return map2;
                        } catch (Exception e2) {
                            ContainerDeserializerBase.p0(deserializationContext, e2, javaType.d, strJ1);
                            throw null;
                        }
                    }
                } else {
                    jsonParser.V1();
                }
                strJ1 = jsonParser.J1();
            }
            try {
                return (Map) propertyBasedCreator.a(deserializationContext, propertyValueBufferD);
            } catch (Exception e3) {
                ContainerDeserializerBase.p0(deserializationContext, e3, javaType.d, strJ1);
                throw null;
            }
        }
        JsonDeserializer jsonDeserializer2 = this.p;
        ValueInstantiator valueInstantiator = this.o;
        if (jsonDeserializer2 != null) {
            return (Map) valueInstantiator.z(deserializationContext, jsonDeserializer2.e(jsonParser, deserializationContext));
        }
        if (!this.r) {
            deserializationContext.z(javaType.d, valueInstantiator, "no default constructor found", new Object[0]);
            throw null;
        }
        int iF = jsonParser.f();
        if (iF != 1 && iF != 2) {
            if (iF == 3) {
                return (Map) E(jsonParser, deserializationContext);
            }
            if (iF != 5) {
                if (iF == 6) {
                    return (Map) G(jsonParser, deserializationContext);
                }
                deserializationContext.D(jsonParser, l0(deserializationContext));
                throw null;
            }
        }
        Map map3 = (Map) valueInstantiator.y(deserializationContext);
        if (!this.l) {
            r0(jsonParser, deserializationContext, map3);
            return map3;
        }
        boolean z2 = jsonDeserializer.k() != null;
        MapReferringAccumulator mapReferringAccumulator = z2 ? new MapReferringAccumulator(javaType.k().d, map3) : null;
        if (!jsonParser.y1()) {
            JsonToken jsonTokenE = jsonParser.e();
            if (jsonTokenE != JsonToken.END_OBJECT) {
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                if (jsonTokenE != jsonToken) {
                    deserializationContext.Z(this, jsonToken, null, new Object[0]);
                    throw null;
                }
                strD = jsonParser.d();
            }
            return map3;
        }
        strD = jsonParser.J1();
        while (true) {
            String str2 = strD;
            if (str2 == null) {
                break;
            }
            JsonToken jsonTokenN12 = jsonParser.N1();
            IgnorePropertiesUtil.Checker checker2 = this.u;
            if (checker2 == null || !checker2.a(str2)) {
                try {
                    if (jsonTokenN12 != JsonToken.VALUE_NULL) {
                        objE = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                    } else if (!z) {
                        objE = nullValueProvider.c(deserializationContext);
                    }
                    obj = objE;
                } catch (UnresolvedForwardReference e4) {
                    e = e4;
                    Map map4 = map3;
                    str = str2;
                    map = map4;
                } catch (Exception e5) {
                    e = e5;
                    Map map5 = map3;
                    str = str2;
                    map = map5;
                }
                if (z2) {
                    mapReferringAccumulator.a(str2, obj);
                } else {
                    Object objPut = map3.put(str2, obj);
                    if (objPut != null) {
                        Map map6 = map3;
                        str = str2;
                        map = map6;
                        try {
                            s0(deserializationContext, map, str, objPut, obj);
                        } catch (UnresolvedForwardReference e6) {
                            e = e6;
                            t0(deserializationContext, mapReferringAccumulator, str, e);
                            strD = jsonParser.J1();
                            map3 = map;
                        } catch (Exception e7) {
                            e = e7;
                            ContainerDeserializerBase.p0(deserializationContext, e, map, str);
                            throw null;
                        }
                    }
                    strD = jsonParser.J1();
                    map3 = map;
                }
            } else {
                jsonParser.V1();
            }
            map = map3;
            strD = jsonParser.J1();
            map3 = map;
        }
        return map3;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String strD;
        Object objE;
        String strD2;
        Object objE2;
        Map map = (Map) obj;
        jsonParser.U1(map);
        JsonToken jsonTokenE = jsonParser.e();
        if (jsonTokenE != JsonToken.START_OBJECT && jsonTokenE != JsonToken.FIELD_NAME) {
            deserializationContext.E(jsonParser, this.g.d);
            throw null;
        }
        boolean z = this.l;
        NullValueProvider nullValueProvider = this.h;
        boolean z2 = this.i;
        TypeDeserializer typeDeserializer = this.n;
        JsonDeserializer jsonDeserializer = this.m;
        if (z) {
            if (jsonParser.y1()) {
                strD2 = jsonParser.J1();
            } else {
                JsonToken jsonTokenE2 = jsonParser.e();
                if (jsonTokenE2 != JsonToken.END_OBJECT) {
                    JsonToken jsonToken = JsonToken.FIELD_NAME;
                    if (jsonTokenE2 != jsonToken) {
                        deserializationContext.Z(this, jsonToken, null, new Object[0]);
                        throw null;
                    }
                    strD2 = jsonParser.d();
                }
            }
            while (strD2 != null) {
                JsonToken jsonTokenN1 = jsonParser.N1();
                IgnorePropertiesUtil.Checker checker = this.u;
                if (checker == null || !checker.a(strD2)) {
                    try {
                        if (jsonTokenN1 != JsonToken.VALUE_NULL) {
                            Object obj2 = map.get(strD2);
                            if (obj2 == null) {
                                objE2 = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                            } else if (typeDeserializer == null) {
                                objE2 = jsonDeserializer.f(jsonParser, deserializationContext, obj2);
                            } else {
                                jsonDeserializer.getClass();
                                deserializationContext.x(jsonDeserializer);
                                objE2 = jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                            }
                            if (objE2 != obj2) {
                                map.put(strD2, objE2);
                            }
                        } else if (!z2) {
                            map.put(strD2, nullValueProvider.c(deserializationContext));
                        }
                    } catch (Exception e) {
                        ContainerDeserializerBase.p0(deserializationContext, e, map, strD2);
                        throw null;
                    }
                } else {
                    jsonParser.V1();
                }
                strD2 = jsonParser.J1();
            }
        } else {
            if (jsonParser.y1()) {
                strD = jsonParser.J1();
            } else {
                JsonToken jsonTokenE3 = jsonParser.e();
                if (jsonTokenE3 != JsonToken.END_OBJECT) {
                    JsonToken jsonToken2 = JsonToken.FIELD_NAME;
                    if (jsonTokenE3 != jsonToken2) {
                        deserializationContext.Z(this, jsonToken2, null, new Object[0]);
                        throw null;
                    }
                    strD = jsonParser.d();
                }
            }
            while (strD != null) {
                Object objA = this.k.a(deserializationContext, strD);
                JsonToken jsonTokenN12 = jsonParser.N1();
                IgnorePropertiesUtil.Checker checker2 = this.u;
                if (checker2 == null || !checker2.a(strD)) {
                    try {
                        if (jsonTokenN12 != JsonToken.VALUE_NULL) {
                            Object obj3 = map.get(objA);
                            if (obj3 == null) {
                                objE = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                            } else if (typeDeserializer == null) {
                                objE = jsonDeserializer.f(jsonParser, deserializationContext, obj3);
                            } else {
                                jsonDeserializer.getClass();
                                deserializationContext.x(jsonDeserializer);
                                objE = jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                            }
                            if (objE != obj3) {
                                map.put(objA, objE);
                            }
                        } else if (!z2) {
                            map.put(objA, nullValueProvider.c(deserializationContext));
                        }
                    } catch (Exception e2) {
                        ContainerDeserializerBase.p0(deserializationContext, e2, map, strD);
                        throw null;
                    }
                } else {
                    jsonParser.V1();
                }
                strD = jsonParser.J1();
            }
        }
        return map;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.d(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final ValueInstantiator i0() {
        return this.o;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final JavaType j0() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        return this.m == null && this.k == null && this.n == null && this.s == null && this.t == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.f;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public final JsonDeserializer o0() {
        return this.m;
    }

    public final void r0(JsonParser jsonParser, DeserializationContext deserializationContext, Map map) throws IOException {
        String strD;
        DeserializationContext deserializationContext2;
        Map map2;
        Exception exc;
        Object objC;
        Object obj;
        JsonDeserializer jsonDeserializer = this.m;
        boolean z = jsonDeserializer.k() != null;
        MapReferringAccumulator mapReferringAccumulator = z ? new MapReferringAccumulator(this.g.k().d, map) : null;
        if (jsonParser.y1()) {
            strD = jsonParser.J1();
        } else {
            JsonToken jsonTokenE = jsonParser.e();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenE != jsonToken) {
                if (jsonTokenE != JsonToken.END_OBJECT) {
                    deserializationContext.Z(this, jsonToken, null, new Object[0]);
                    throw null;
                }
            }
            strD = jsonParser.d();
        }
        String strJ1 = strD;
        while (strJ1 != null) {
            Object objA = this.k.a(deserializationContext, strJ1);
            JsonToken jsonTokenN1 = jsonParser.N1();
            IgnorePropertiesUtil.Checker checker = this.u;
            if (checker == null || !checker.a(strJ1)) {
                try {
                    try {
                        if (jsonTokenN1 == JsonToken.VALUE_NULL) {
                            try {
                                if (!this.i) {
                                    objC = this.h.c(deserializationContext);
                                }
                            } catch (Exception e) {
                                exc = e;
                                deserializationContext2 = deserializationContext;
                                map2 = map;
                                ContainerDeserializerBase.p0(deserializationContext2, exc, map2, strJ1);
                                throw null;
                            }
                        } else {
                            TypeDeserializer typeDeserializer = this.n;
                            objC = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
                        }
                        obj = objC;
                    } catch (UnresolvedForwardReference e2) {
                        e = e2;
                        deserializationContext2 = deserializationContext;
                        map2 = map;
                    }
                    if (z) {
                        mapReferringAccumulator.a(objA, obj);
                    } else {
                        Object objPut = map.put(objA, obj);
                        if (objPut != null) {
                            deserializationContext2 = deserializationContext;
                            map2 = map;
                            try {
                                s0(deserializationContext2, map2, objA, objPut, obj);
                            } catch (UnresolvedForwardReference e3) {
                                e = e3;
                                t0(deserializationContext2, mapReferringAccumulator, objA, e);
                                strJ1 = jsonParser.J1();
                                deserializationContext = deserializationContext2;
                                map = map2;
                            } catch (Exception e4) {
                                e = e4;
                                exc = e;
                                ContainerDeserializerBase.p0(deserializationContext2, exc, map2, strJ1);
                                throw null;
                            }
                        }
                        strJ1 = jsonParser.J1();
                        deserializationContext = deserializationContext2;
                        map = map2;
                    }
                } catch (Exception e5) {
                    e = e5;
                    deserializationContext2 = deserializationContext;
                    map2 = map;
                }
            } else {
                jsonParser.V1();
            }
            deserializationContext2 = deserializationContext;
            map2 = map;
            strJ1 = jsonParser.J1();
            deserializationContext = deserializationContext2;
            map = map2;
        }
    }

    public final void s0(DeserializationContext deserializationContext, Map map, Object obj, Object obj2, Object obj3) {
        if (this.v && deserializationContext.M(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (obj2 instanceof List) {
                ((List) obj2).add(obj3);
                map.put(obj, obj2);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj2);
                arrayList.add(obj3);
                map.put(obj, arrayList);
            }
        }
    }

    public final void t0(DeserializationContext deserializationContext, MapReferringAccumulator mapReferringAccumulator, Object obj, UnresolvedForwardReference unresolvedForwardReference) throws MismatchedInputException {
        if (mapReferringAccumulator != null) {
            MapReferring mapReferring = new MapReferring(mapReferringAccumulator, unresolvedForwardReference, obj);
            mapReferringAccumulator.b.add(mapReferring);
            unresolvedForwardReference.h.a(mapReferring);
        } else {
            deserializationContext.V(this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
            throw null;
        }
    }

    public MapDeserializer(MapDeserializer mapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Set set, Set set2) {
        super(mapDeserializer, nullValueProvider, mapDeserializer.j);
        this.k = keyDeserializer;
        this.m = jsonDeserializer;
        this.n = typeDeserializer;
        this.o = mapDeserializer.o;
        this.q = mapDeserializer.q;
        this.p = mapDeserializer.p;
        this.r = mapDeserializer.r;
        this.s = set;
        this.t = set2;
        this.u = IgnorePropertiesUtil.a(set, set2);
        this.l = q0(this.g, keyDeserializer);
        this.v = mapDeserializer.v;
    }
}
