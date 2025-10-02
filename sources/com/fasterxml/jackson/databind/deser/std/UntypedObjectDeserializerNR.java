package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: classes4.dex */
final class UntypedObjectDeserializerNR extends StdDeserializer<Object> {
    public static final Object[] h = new Object[0];
    public static final UntypedObjectDeserializerNR i = new UntypedObjectDeserializerNR(false);
    public final boolean g;

    public UntypedObjectDeserializerNR(boolean z) {
        super(Object.class);
        this.g = z;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        Object objP0;
        switch (jsonParser.f()) {
            case 1:
                return p0(jsonParser, deserializationContext, new Scope(null, deserializationContext.M(StreamReadCapability.DUPLICATE_PROPERTIES)));
            case 2:
                return new LinkedHashMap(2);
            case 3:
                return p0(jsonParser, deserializationContext, new Scope(null));
            case 4:
            default:
                deserializationContext.D(jsonParser, l0(deserializationContext));
                throw null;
            case 5:
                Scope scope = new Scope(null, deserializationContext.M(StreamReadCapability.DUPLICATE_PROPERTIES));
                String strD = jsonParser.d();
                while (strD != null) {
                    JsonToken jsonTokenN1 = jsonParser.N1();
                    if (jsonTokenN1 == null) {
                        jsonTokenN1 = JsonToken.NOT_AVAILABLE;
                    }
                    int i2 = jsonTokenN1.g;
                    if (i2 == 1) {
                        objP0 = p0(jsonParser, deserializationContext, new Scope(scope, scope.c));
                    } else {
                        if (i2 == 2) {
                            LinkedHashMap linkedHashMap = scope.e;
                            return linkedHashMap == null ? new LinkedHashMap(2) : linkedHashMap;
                        }
                        objP0 = i2 != 3 ? o0(jsonParser, deserializationContext, i2) : p0(jsonParser, deserializationContext, new Scope(scope));
                    }
                    if (scope.c) {
                        scope.a(objP0, strD);
                    } else {
                        if (scope.e == null) {
                            scope.e = new LinkedHashMap();
                        }
                        scope.e.put(strD, objP0);
                    }
                    strD = jsonParser.J1();
                }
                LinkedHashMap linkedHashMap2 = scope.e;
                return linkedHashMap2 == null ? new LinkedHashMap(2) : linkedHashMap2;
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
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r5.N1() == com.fasterxml.jackson.core.JsonToken.END_OBJECT) goto L28;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6, java.lang.Object r7) {
        /*
            r4 = this;
            boolean r0 = r4.g
            if (r0 == 0) goto L9
            java.lang.Object r5 = r4.e(r5, r6)
            return r5
        L9:
            int r0 = r5.f()
            r1 = 1
            if (r0 == r1) goto L3d
            r1 = 2
            if (r0 == r1) goto L45
            r1 = 3
            if (r0 == r1) goto L1d
            r1 = 4
            if (r0 == r1) goto L45
            r1 = 5
            if (r0 == r1) goto L46
            goto L6f
        L1d:
            com.fasterxml.jackson.core.JsonToken r0 = r5.N1()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r0 != r1) goto L26
            goto L45
        L26:
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
        L2d:
            java.lang.Object r1 = r4.e(r5, r6)
            r0.add(r1)
            com.fasterxml.jackson.core.JsonToken r1 = r5.N1()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r1 != r2) goto L2d
            return r7
        L3d:
            com.fasterxml.jackson.core.JsonToken r0 = r5.N1()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 != r1) goto L46
        L45:
            return r7
        L46:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = r5.d()
        L51:
            r5.N1()
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L5f
            java.lang.Object r3 = r4.f(r5, r6, r2)
            goto L63
        L5f:
            java.lang.Object r3 = r4.e(r5, r6)
        L63:
            if (r3 == r2) goto L68
            r0.put(r1, r3)
        L68:
            java.lang.String r1 = r5.J1()
            if (r1 != 0) goto L51
            return r7
        L6f:
            java.lang.Object r5 = r4.e(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR.f(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        int iF = jsonParser.f();
        return (iF == 1 || iF == 3 || iF == 5) ? typeDeserializer.b(jsonParser, deserializationContext) : o0(jsonParser, deserializationContext, jsonParser.f());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.h;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        if (this.g) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final Object o0(JsonParser jsonParser, DeserializationContext deserializationContext, int i2) throws MismatchedInputException {
        switch (i2) {
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
                deserializationContext.D(jsonParser, l0(deserializationContext));
                throw null;
        }
    }

    public final Object p0(JsonParser jsonParser, DeserializationContext deserializationContext, Scope scope) throws MismatchedInputException {
        Scope scope2;
        Object objK0;
        Object objK02;
        boolean zK = deserializationContext.K(StdDeserializer.f);
        boolean zN = deserializationContext.N(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        Scope scope3 = scope;
        while (true) {
            if (scope3.b) {
                String strJ1 = jsonParser.J1();
                while (true) {
                    if (strJ1 != null) {
                        JsonToken jsonTokenN1 = jsonParser.N1();
                        if (jsonTokenN1 == null) {
                            jsonTokenN1 = JsonToken.NOT_AVAILABLE;
                        }
                        int i2 = jsonTokenN1.g;
                        if (i2 == 1) {
                            scope3.d = strJ1;
                            scope3 = new Scope(scope3, scope3.c);
                        } else if (i2 != 3) {
                            switch (i2) {
                                case 6:
                                    objK0 = jsonParser.k0();
                                    break;
                                case 7:
                                    if (!zK) {
                                        objK0 = jsonParser.U();
                                        break;
                                    } else {
                                        objK0 = StdDeserializer.C(jsonParser, deserializationContext);
                                        break;
                                    }
                                case 8:
                                    if (!deserializationContext.N(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                                        objK0 = jsonParser.U();
                                        break;
                                    } else {
                                        objK0 = jsonParser.x();
                                        break;
                                    }
                                case 9:
                                    objK0 = Boolean.TRUE;
                                    break;
                                case 10:
                                    objK0 = Boolean.FALSE;
                                    break;
                                case 11:
                                    objK0 = null;
                                    break;
                                case 12:
                                    objK0 = jsonParser.C();
                                    break;
                                default:
                                    deserializationContext.D(jsonParser, l0(deserializationContext));
                                    throw null;
                            }
                            if (scope3.c) {
                                scope3.a(objK0, strJ1);
                            } else {
                                if (scope3.e == null) {
                                    scope3.e = new LinkedHashMap();
                                }
                                scope3.e.put(strJ1, objK0);
                            }
                        } else {
                            scope3.d = strJ1;
                            scope2 = new Scope(scope3);
                        }
                        strJ1 = jsonParser.J1();
                    } else {
                        if (scope3 == scope) {
                            LinkedHashMap linkedHashMap = scope3.e;
                            return linkedHashMap == null ? new LinkedHashMap(2) : linkedHashMap;
                        }
                        scope2 = scope3.f14265a;
                        LinkedHashMap linkedHashMap2 = scope3.e;
                        if (linkedHashMap2 == null) {
                            linkedHashMap2 = new LinkedHashMap();
                        } else {
                            scope3.e = null;
                        }
                        if (scope2.b) {
                            scope2.c(linkedHashMap2);
                        } else {
                            scope2.b(linkedHashMap2);
                        }
                    }
                }
            } else {
                while (true) {
                    JsonToken jsonTokenN12 = jsonParser.N1();
                    if (jsonTokenN12 == null) {
                        jsonTokenN12 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (jsonTokenN12.g) {
                        case 1:
                            scope2 = new Scope(scope3, scope3.c);
                            break;
                        case 2:
                        case 5:
                        default:
                            deserializationContext.D(jsonParser, l0(deserializationContext));
                            throw null;
                        case 3:
                            scope2 = new Scope(scope3);
                            break;
                        case 4:
                            Object array = h;
                            if (scope3 != scope) {
                                Scope scope4 = scope3.f14265a;
                                ArrayList arrayList = scope3.f;
                                if (arrayList != null) {
                                    array = zN ? arrayList.toArray((Object[]) array) : arrayList;
                                    scope3.f = null;
                                } else if (!zN) {
                                    array = new ArrayList(2);
                                }
                                if (scope4.b) {
                                    scope4.c(array);
                                } else {
                                    scope4.b(array);
                                }
                                scope3 = scope4;
                                break;
                            } else {
                                ArrayList arrayList2 = scope3.f;
                                return arrayList2 == null ? zN ? array : new ArrayList(2) : zN ? arrayList2.toArray((Object[]) array) : arrayList2;
                            }
                        case 6:
                            objK02 = jsonParser.k0();
                            scope3.b(objK02);
                        case 7:
                            objK02 = zK ? StdDeserializer.C(jsonParser, deserializationContext) : jsonParser.U();
                            scope3.b(objK02);
                        case 8:
                            objK02 = deserializationContext.N(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.x() : jsonParser.U();
                            scope3.b(objK02);
                        case 9:
                            objK02 = Boolean.TRUE;
                            scope3.b(objK02);
                        case 10:
                            objK02 = Boolean.FALSE;
                            scope3.b(objK02);
                        case 11:
                            objK02 = null;
                            scope3.b(objK02);
                        case 12:
                            objK02 = jsonParser.C();
                            scope3.b(objK02);
                    }
                }
            }
            scope3 = scope2;
        }
    }

    public static final class Scope {

        /* renamed from: a, reason: collision with root package name */
        public final Scope f14265a;
        public final boolean b;
        public final boolean c;
        public String d;
        public LinkedHashMap e;
        public ArrayList f;

        public Scope(Scope scope) {
            this.f14265a = scope;
            this.b = false;
            this.c = false;
        }

        public final void a(Object obj, String str) {
            LinkedHashMap linkedHashMap = this.e;
            if (linkedHashMap == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                this.e = linkedHashMap2;
                linkedHashMap2.put(str, obj);
                return;
            }
            Object objPut = linkedHashMap.put(str, obj);
            if (objPut != null) {
                if (objPut instanceof List) {
                    ((List) objPut).add(obj);
                    this.e.put(str, objPut);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(objPut);
                    arrayList.add(obj);
                    this.e.put(str, arrayList);
                }
            }
        }

        public final void b(Object obj) {
            if (this.f == null) {
                this.f = new ArrayList();
            }
            this.f.add(obj);
        }

        public final void c(Object obj) {
            String str = this.d;
            Objects.requireNonNull(str);
            this.d = null;
            if (this.c) {
                a(obj, str);
                return;
            }
            if (this.e == null) {
                this.e = new LinkedHashMap();
            }
            this.e.put(str, obj);
        }

        public Scope(Scope scope, boolean z) {
            this.f14265a = scope;
            this.b = true;
            this.c = z;
        }
    }
}
