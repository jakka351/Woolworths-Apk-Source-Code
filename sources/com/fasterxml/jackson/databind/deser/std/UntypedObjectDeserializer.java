package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class UntypedObjectDeserializer extends StdDeserializer<Object> implements ResolvableDeserializer, ContextualDeserializer {
    public static final Object[] n = new Object[0];
    public JsonDeserializer g;
    public JsonDeserializer h;
    public JsonDeserializer i;
    public JsonDeserializer j;
    public final JavaType k;
    public final JavaType l;
    public final boolean m;

    @Deprecated
    @JacksonStdImpl
    public static class Vanilla extends StdDeserializer<Object> {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
            switch (jsonParser.f()) {
                case 1:
                    if (jsonParser.N1() == JsonToken.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    JsonToken jsonTokenN1 = jsonParser.N1();
                    JsonToken jsonToken = JsonToken.END_ARRAY;
                    if (jsonTokenN1 == jsonToken) {
                        return deserializationContext.N(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? UntypedObjectDeserializer.n : new ArrayList(2);
                    }
                    if (deserializationContext.N(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        ObjectBuffer objectBufferP = deserializationContext.P();
                        Object[] objArrG = objectBufferP.g();
                        int i = 0;
                        while (true) {
                            Object objE = e(jsonParser, deserializationContext);
                            if (i >= objArrG.length) {
                                objArrG = objectBufferP.c(objArrG);
                                i = 0;
                            }
                            int i2 = i + 1;
                            objArrG[i] = objE;
                            if (jsonParser.N1() == JsonToken.END_ARRAY) {
                                Object[] objArrE = objectBufferP.e(i2, objArrG);
                                deserializationContext.a0(objectBufferP);
                                return objArrE;
                            }
                            i = i2;
                        }
                    } else {
                        Object objE2 = e(jsonParser, deserializationContext);
                        if (jsonParser.N1() == jsonToken) {
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(objE2);
                            return arrayList;
                        }
                        ObjectBuffer objectBufferP2 = deserializationContext.P();
                        Object[] objArrG2 = objectBufferP2.g();
                        objArrG2[0] = objE2;
                        int i3 = 1;
                        int i4 = 1;
                        while (true) {
                            Object objE3 = e(jsonParser, deserializationContext);
                            i3++;
                            if (i4 >= objArrG2.length) {
                                objArrG2 = objectBufferP2.c(objArrG2);
                                i4 = 0;
                            }
                            int i5 = i4 + 1;
                            objArrG2[i4] = objE3;
                            if (jsonParser.N1() == JsonToken.END_ARRAY) {
                                ArrayList arrayList2 = new ArrayList(i3);
                                objectBufferP2.d(objArrG2, i5, arrayList2);
                                deserializationContext.a0(objectBufferP2);
                                return arrayList2;
                            }
                            i4 = i5;
                        }
                    }
                case 4:
                default:
                    deserializationContext.E(jsonParser, Object.class);
                    throw null;
                case 5:
                    break;
                case 6:
                    return jsonParser.k0();
                case 7:
                    return deserializationContext.K(StdDeserializer.f) ? StdDeserializer.C(jsonParser, deserializationContext) : jsonParser.U();
                case 8:
                    return deserializationContext.N(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.x() : jsonParser.U();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.C();
            }
            String strD = jsonParser.d();
            jsonParser.N1();
            Object objE4 = e(jsonParser, deserializationContext);
            String strJ1 = jsonParser.J1();
            if (strJ1 == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(strD, objE4);
                return linkedHashMap;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(strD, objE4);
            while (true) {
                jsonParser.N1();
                Object objE5 = e(jsonParser, deserializationContext);
                Object objPut = linkedHashMap2.put(strJ1, objE5);
                if (objPut != null) {
                    String strJ12 = jsonParser.J1();
                    boolean zM = deserializationContext.M(StreamReadCapability.DUPLICATE_PROPERTIES);
                    if (zM) {
                        if (objPut instanceof List) {
                            ((List) objPut).add(objE5);
                            linkedHashMap2.put(strJ1, objPut);
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(objPut);
                            arrayList3.add(objE5);
                            linkedHashMap2.put(strJ1, arrayList3);
                        }
                    }
                    while (strJ12 != null) {
                        jsonParser.N1();
                        Object objE6 = e(jsonParser, deserializationContext);
                        Object objPut2 = linkedHashMap2.put(strJ12, objE6);
                        if (objPut2 != null && zM) {
                            if (objPut2 instanceof List) {
                                ((List) objPut2).add(objE6);
                                linkedHashMap2.put(strJ12, objPut2);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(objPut2);
                                arrayList4.add(objE6);
                                linkedHashMap2.put(strJ12, arrayList4);
                            }
                        }
                        strJ12 = jsonParser.J1();
                    }
                } else {
                    strJ1 = jsonParser.J1();
                    if (strJ1 == null) {
                    }
                }
            }
            return linkedHashMap2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
        
            if (r5.N1() == com.fasterxml.jackson.core.JsonToken.END_OBJECT) goto L24;
         */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object f(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6, java.lang.Object r7) {
            /*
                r4 = this;
                int r0 = r5.f()
                r1 = 1
                if (r0 == r1) goto L34
                r1 = 2
                if (r0 == r1) goto L3c
                r1 = 3
                if (r0 == r1) goto L14
                r1 = 4
                if (r0 == r1) goto L3c
                r1 = 5
                if (r0 == r1) goto L3d
                goto L66
            L14:
                com.fasterxml.jackson.core.JsonToken r0 = r5.N1()
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
                if (r0 != r1) goto L1d
                goto L3c
            L1d:
                boolean r0 = r7 instanceof java.util.Collection
                if (r0 == 0) goto L66
                r0 = r7
                java.util.Collection r0 = (java.util.Collection) r0
            L24:
                java.lang.Object r1 = r4.e(r5, r6)
                r0.add(r1)
                com.fasterxml.jackson.core.JsonToken r1 = r5.N1()
                com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
                if (r1 != r2) goto L24
                return r7
            L34:
                com.fasterxml.jackson.core.JsonToken r0 = r5.N1()
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
                if (r0 != r1) goto L3d
            L3c:
                return r7
            L3d:
                boolean r0 = r7 instanceof java.util.Map
                if (r0 == 0) goto L66
                r0 = r7
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = r5.d()
            L48:
                r5.N1()
                java.lang.Object r2 = r0.get(r1)
                if (r2 == 0) goto L56
                java.lang.Object r3 = r4.f(r5, r6, r2)
                goto L5a
            L56:
                java.lang.Object r3 = r4.e(r5, r6)
            L5a:
                if (r3 == r2) goto L5f
                r0.put(r1, r3)
            L5f:
                java.lang.String r1 = r5.J1()
                if (r1 != 0) goto L48
                return r7
            L66:
                java.lang.Object r5 = r4.e(r5, r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.f(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws MismatchedInputException {
            int iF = jsonParser.f();
            if (iF != 1 && iF != 3) {
                switch (iF) {
                    case 5:
                        break;
                    case 6:
                        return jsonParser.k0();
                    case 7:
                        return deserializationContext.N(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.g() : jsonParser.U();
                    case 8:
                        return deserializationContext.N(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.x() : jsonParser.U();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return jsonParser.C();
                    default:
                        deserializationContext.E(jsonParser, Object.class);
                        throw null;
                }
            }
            return typeDeserializer.b(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType n() {
            return LogicalType.h;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Boolean o(DeserializationConfig deserializationConfig) {
            return null;
        }
    }

    public UntypedObjectDeserializer(JavaType javaType, JavaType javaType2) {
        super(Object.class);
        this.k = javaType;
        this.l = javaType2;
        this.m = false;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public final void a(DeserializationContext deserializationContext) {
        JavaType javaTypeL = deserializationContext.l(Object.class);
        JavaType javaTypeL2 = deserializationContext.l(String.class);
        TypeFactory typeFactoryE = deserializationContext.e();
        JavaType javaType = this.k;
        if (javaType == null) {
            JsonDeserializer jsonDeserializerS = deserializationContext.s(typeFactoryE.f(javaTypeL, List.class));
            if (ClassUtil.x(jsonDeserializerS)) {
                jsonDeserializerS = null;
            }
            this.h = jsonDeserializerS;
        } else {
            this.h = deserializationContext.s(javaType);
        }
        JavaType javaType2 = this.l;
        if (javaType2 == null) {
            JsonDeserializer jsonDeserializerS2 = deserializationContext.s(typeFactoryE.i(Map.class, javaTypeL2, javaTypeL));
            if (ClassUtil.x(jsonDeserializerS2)) {
                jsonDeserializerS2 = null;
            }
            this.g = jsonDeserializerS2;
        } else {
            this.g = deserializationContext.s(javaType2);
        }
        JsonDeserializer jsonDeserializerS3 = deserializationContext.s(javaTypeL2);
        if (ClassUtil.x(jsonDeserializerS3)) {
            jsonDeserializerS3 = null;
        }
        this.i = jsonDeserializerS3;
        JsonDeserializer jsonDeserializerS4 = deserializationContext.s(typeFactoryE.k(Number.class));
        if (ClassUtil.x(jsonDeserializerS4)) {
            jsonDeserializerS4 = null;
        }
        this.j = jsonDeserializerS4;
        SimpleType simpleTypeO = TypeFactory.o();
        this.g = deserializationContext.C(this.g, null, simpleTypeO);
        this.h = deserializationContext.C(this.h, null, simpleTypeO);
        this.i = deserializationContext.C(this.i, null, simpleTypeO);
        this.j = deserializationContext.C(this.j, null, simpleTypeO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer b(com.fasterxml.jackson.databind.DeserializationContext r3, com.fasterxml.jackson.databind.BeanProperty r4) {
        /*
            r2 = this;
            r0 = 1
            if (r4 != 0) goto L15
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r3.f
            com.fasterxml.jackson.databind.cfg.ConfigOverrides r3 = r3.j
            r3.getClass()
            r3 = 0
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L15
            r3 = r0
            goto L16
        L15:
            r3 = 0
        L16:
            com.fasterxml.jackson.databind.JsonDeserializer r4 = r2.i
            if (r4 != 0) goto L39
            com.fasterxml.jackson.databind.JsonDeserializer r4 = r2.j
            if (r4 != 0) goto L39
            com.fasterxml.jackson.databind.JsonDeserializer r4 = r2.g
            if (r4 != 0) goto L39
            com.fasterxml.jackson.databind.JsonDeserializer r4 = r2.h
            if (r4 != 0) goto L39
            java.lang.Class r4 = r2.getClass()
            java.lang.Class<com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer> r1 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.class
            if (r4 != r1) goto L39
            if (r3 == 0) goto L36
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR r3 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR
            r3.<init>(r0)
            return r3
        L36:
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR r3 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR.i
            return r3
        L39:
            boolean r4 = r2.m
            if (r3 == r4) goto L43
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer r4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer
            r4.<init>(r2, r3)
            return r4
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.b(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        switch (jsonParser.f()) {
            case 1:
            case 2:
            case 5:
                JsonDeserializer jsonDeserializer = this.g;
                return jsonDeserializer != null ? jsonDeserializer.e(jsonParser, deserializationContext) : r0(jsonParser, deserializationContext);
            case 3:
                if (deserializationContext.N(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return q0(jsonParser, deserializationContext);
                }
                JsonDeserializer jsonDeserializer2 = this.h;
                return jsonDeserializer2 != null ? jsonDeserializer2.e(jsonParser, deserializationContext) : p0(jsonParser, deserializationContext);
            case 4:
            default:
                deserializationContext.E(jsonParser, Object.class);
                throw null;
            case 6:
                JsonDeserializer jsonDeserializer3 = this.i;
                return jsonDeserializer3 != null ? jsonDeserializer3.e(jsonParser, deserializationContext) : jsonParser.k0();
            case 7:
                JsonDeserializer jsonDeserializer4 = this.j;
                return jsonDeserializer4 != null ? jsonDeserializer4.e(jsonParser, deserializationContext) : deserializationContext.K(StdDeserializer.f) ? StdDeserializer.C(jsonParser, deserializationContext) : jsonParser.U();
            case 8:
                JsonDeserializer jsonDeserializer5 = this.j;
                return jsonDeserializer5 != null ? jsonDeserializer5.e(jsonParser, deserializationContext) : deserializationContext.N(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.x() : jsonParser.U();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.C();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (this.m) {
            return e(jsonParser, deserializationContext);
        }
        switch (jsonParser.f()) {
            case 1:
            case 2:
            case 5:
                JsonDeserializer jsonDeserializer = this.g;
                if (jsonDeserializer == null) {
                    if (!(obj instanceof Map)) {
                        break;
                    } else {
                        Map map = (Map) obj;
                        JsonToken jsonTokenE = jsonParser.e();
                        if (jsonTokenE == JsonToken.START_OBJECT) {
                            jsonTokenE = jsonParser.N1();
                        }
                        if (jsonTokenE != JsonToken.END_OBJECT) {
                            String strD = jsonParser.d();
                            do {
                                jsonParser.N1();
                                Object obj2 = map.get(strD);
                                Object objF = obj2 != null ? f(jsonParser, deserializationContext, obj2) : e(jsonParser, deserializationContext);
                                if (objF != obj2) {
                                    map.put(strD, objF);
                                }
                                strD = jsonParser.J1();
                            } while (strD != null);
                        }
                    }
                } else {
                    break;
                }
                break;
            case 3:
                JsonDeserializer jsonDeserializer2 = this.h;
                if (jsonDeserializer2 == null) {
                    if (!(obj instanceof Collection)) {
                        if (!deserializationContext.N(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                            break;
                        } else {
                            break;
                        }
                    } else {
                        Collection collection = (Collection) obj;
                        while (jsonParser.N1() != JsonToken.END_ARRAY) {
                            collection.add(e(jsonParser, deserializationContext));
                        }
                        break;
                    }
                } else {
                    break;
                }
            case 6:
                JsonDeserializer jsonDeserializer3 = this.i;
                if (jsonDeserializer3 == null) {
                    break;
                } else {
                    break;
                }
            case 7:
                JsonDeserializer jsonDeserializer4 = this.j;
                if (jsonDeserializer4 == null) {
                    if (!deserializationContext.K(StdDeserializer.f)) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 8:
                JsonDeserializer jsonDeserializer5 = this.j;
                if (jsonDeserializer5 == null) {
                    if (!deserializationContext.N(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return e(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws MismatchedInputException {
        int iF = jsonParser.f();
        if (iF != 1 && iF != 3) {
            switch (iF) {
                case 5:
                    break;
                case 6:
                    JsonDeserializer jsonDeserializer = this.i;
                    return jsonDeserializer != null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonParser.k0();
                case 7:
                    JsonDeserializer jsonDeserializer2 = this.j;
                    return jsonDeserializer2 != null ? jsonDeserializer2.e(jsonParser, deserializationContext) : deserializationContext.K(StdDeserializer.f) ? StdDeserializer.C(jsonParser, deserializationContext) : jsonParser.U();
                case 8:
                    JsonDeserializer jsonDeserializer3 = this.j;
                    return jsonDeserializer3 != null ? jsonDeserializer3.e(jsonParser, deserializationContext) : deserializationContext.N(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.x() : jsonParser.U();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.C();
                default:
                    deserializationContext.E(jsonParser, Object.class);
                    throw null;
            }
        }
        return typeDeserializer.b(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.h;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return null;
    }

    public final Object o0(JsonParser jsonParser, DeserializationContext deserializationContext, Map map, String str, Object obj, Object obj2, String str2) throws MismatchedInputException {
        boolean zM = deserializationContext.M(StreamReadCapability.DUPLICATE_PROPERTIES);
        if (zM) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                linkedHashMap.put(str, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(obj2);
                linkedHashMap.put(str, arrayList);
            }
        }
        while (str2 != null) {
            jsonParser.N1();
            Object objE = e(jsonParser, deserializationContext);
            Object objPut = map.put(str2, objE);
            if (objPut != null && zM) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
                if (objPut instanceof List) {
                    ((List) objPut).add(objE);
                    linkedHashMap2.put(str, objPut);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(objPut);
                    arrayList2.add(objE);
                    linkedHashMap2.put(str, arrayList2);
                }
            }
            str2 = jsonParser.J1();
        }
        return map;
    }

    public final Object p0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        JsonToken jsonTokenN1 = jsonParser.N1();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        int i = 2;
        if (jsonTokenN1 == jsonToken) {
            return new ArrayList(2);
        }
        Object objE = e(jsonParser, deserializationContext);
        if (jsonParser.N1() == jsonToken) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(objE);
            return arrayList;
        }
        Object objE2 = e(jsonParser, deserializationContext);
        if (jsonParser.N1() == jsonToken) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(objE);
            arrayList2.add(objE2);
            return arrayList2;
        }
        ObjectBuffer objectBufferP = deserializationContext.P();
        Object[] objArrG = objectBufferP.g();
        objArrG[0] = objE;
        objArrG[1] = objE2;
        int i2 = 2;
        while (true) {
            Object objE3 = e(jsonParser, deserializationContext);
            i++;
            if (i2 >= objArrG.length) {
                objArrG = objectBufferP.c(objArrG);
                i2 = 0;
            }
            int i3 = i2 + 1;
            objArrG[i2] = objE3;
            if (jsonParser.N1() == JsonToken.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i);
                objectBufferP.d(objArrG, i3, arrayList3);
                deserializationContext.a0(objectBufferP);
                return arrayList3;
            }
            i2 = i3;
        }
    }

    public final Object[] q0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        if (jsonParser.N1() == JsonToken.END_ARRAY) {
            return n;
        }
        ObjectBuffer objectBufferP = deserializationContext.P();
        Object[] objArrG = objectBufferP.g();
        int i = 0;
        while (true) {
            Object objE = e(jsonParser, deserializationContext);
            if (i >= objArrG.length) {
                objArrG = objectBufferP.c(objArrG);
                i = 0;
            }
            int i2 = i + 1;
            objArrG[i] = objE;
            if (jsonParser.N1() == JsonToken.END_ARRAY) {
                Object[] objArrE = objectBufferP.e(i2, objArrG);
                deserializationContext.a0(objectBufferP);
                return objArrE;
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r0(com.fasterxml.jackson.core.JsonParser r20, com.fasterxml.jackson.databind.DeserializationContext r21) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r19 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r20.e()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r0 != r1) goto Le
            java.lang.String r0 = r20.J1()
        Lc:
            r7 = r0
            goto L1d
        Le:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r0 != r1) goto L17
            java.lang.String r0 = r20.d()
            goto Lc
        L17:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            r2 = 0
            if (r0 != r1) goto La0
            r7 = r2
        L1d:
            r0 = 2
            if (r7 != 0) goto L26
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            return r1
        L26:
            r20.N1()
            java.lang.Object r8 = r19.e(r20, r21)
            java.lang.String r1 = r20.J1()
            if (r1 != 0) goto L3c
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            r1.put(r7, r8)
            return r1
        L3c:
            r20.N1()
            java.lang.Object r9 = r19.e(r20, r21)
            java.lang.String r10 = r20.J1()
            if (r10 != 0) goto L62
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r0 = 4
            r6.<init>(r0)
            r6.put(r7, r8)
            java.lang.Object r0 = r6.put(r1, r9)
            if (r0 == 0) goto L61
            r3 = r19
            r4 = r20
            r5 = r21
            r3.o0(r4, r5, r6, r7, r8, r9, r10)
        L61:
            return r6
        L62:
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            r14.put(r7, r8)
            java.lang.Object r0 = r14.put(r1, r9)
            if (r0 == 0) goto L7b
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r14
            r3.o0(r4, r5, r6, r7, r8, r9, r10)
            return r14
        L7b:
            r15 = r10
        L7c:
            r20.N1()
            java.lang.Object r0 = r19.e(r20, r21)
            java.lang.Object r16 = r14.put(r15, r0)
            if (r16 == 0) goto L99
            java.lang.String r18 = r20.J1()
            r11 = r19
            r12 = r20
            r13 = r21
            r17 = r0
            r11.o0(r12, r13, r14, r15, r16, r17, r18)
            return r14
        L99:
            java.lang.String r15 = r20.J1()
            if (r15 != 0) goto L7c
            return r14
        La0:
            r3 = r19
            java.lang.Class r0 = r3.d
            r4 = r20
            r5 = r21
            r5.E(r4, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.r0(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):java.lang.Object");
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super(Object.class);
        this.g = untypedObjectDeserializer.g;
        this.h = untypedObjectDeserializer.h;
        this.i = untypedObjectDeserializer.i;
        this.j = untypedObjectDeserializer.j;
        this.k = untypedObjectDeserializer.k;
        this.l = untypedObjectDeserializer.l;
        this.m = z;
    }
}
