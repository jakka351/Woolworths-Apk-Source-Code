package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ExternalTypeHandler {

    /* renamed from: a, reason: collision with root package name */
    public final JavaType f14245a;
    public final ExtTypedProperty[] b;
    public final Map c;
    public final String[] d;
    public final TokenBuffer[] e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final JavaType f14246a;
        public final ArrayList b = new ArrayList();
        public final HashMap c = new HashMap();

        public Builder(JavaType javaType) {
            this.f14246a = javaType;
        }

        public final void a(Integer num, String str) {
            HashMap map = this.c;
            Object obj = map.get(str);
            if (obj == null) {
                map.put(str, num);
                return;
            }
            if (obj instanceof List) {
                ((List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            map.put(str, linkedList);
        }

        public final void b(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            ArrayList arrayList = this.b;
            Integer numValueOf = Integer.valueOf(arrayList.size());
            arrayList.add(new ExtTypedProperty(settableBeanProperty, typeDeserializer));
            a(numValueOf, settableBeanProperty.f.d);
            a(numValueOf, typeDeserializer.h());
        }

        public final ExternalTypeHandler c(BeanPropertyMap beanPropertyMap) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ExtTypedProperty[] extTypedPropertyArr = new ExtTypedProperty[size];
            for (int i = 0; i < size; i++) {
                ExtTypedProperty extTypedProperty = (ExtTypedProperty) arrayList.get(i);
                SettableBeanProperty settableBeanPropertyG = beanPropertyMap.g(extTypedProperty.c);
                if (settableBeanPropertyG != null) {
                    extTypedProperty.d = settableBeanPropertyG;
                }
                extTypedPropertyArr[i] = extTypedProperty;
            }
            return new ExternalTypeHandler(this.f14246a, extTypedPropertyArr, this.c);
        }
    }

    public static final class ExtTypedProperty {

        /* renamed from: a, reason: collision with root package name */
        public final SettableBeanProperty f14247a;
        public final TypeDeserializer b;
        public final String c;
        public SettableBeanProperty d;

        public ExtTypedProperty(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this.f14247a = settableBeanProperty;
            this.b = typeDeserializer;
            this.c = typeDeserializer.h();
        }
    }

    public ExternalTypeHandler(JavaType javaType, ExtTypedProperty[] extTypedPropertyArr, HashMap map) {
        this.f14245a = javaType;
        this.b = extTypedPropertyArr;
        this.c = map;
        this.d = null;
        this.e = null;
    }

    public final void a(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) throws MismatchedInputException {
        if (str == null) {
            deserializationContext.W("Internal error in external Type Id handling: `null` type id passed", new Object[0]);
            throw null;
        }
        TokenBuffer.Parser parserK2 = this.e[i].k2(jsonParser);
        JsonToken jsonTokenN1 = parserK2.N1();
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        ExtTypedProperty[] extTypedPropertyArr = this.b;
        if (jsonTokenN1 == jsonToken) {
            extTypedPropertyArr[i].f14247a.z(obj, null);
            return;
        }
        TokenBuffer tokenBufferK = deserializationContext.k(jsonParser);
        tokenBufferK.W0();
        tokenBufferK.J1(str);
        tokenBufferK.u2(parserK2);
        tokenBufferK.F();
        TokenBuffer.Parser parserK22 = tokenBufferK.k2(jsonParser);
        parserK22.N1();
        extTypedPropertyArr[i].f14247a.h(parserK22, deserializationContext, obj);
    }

    public final boolean b(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) throws MismatchedInputException {
        if (!str.equals(this.b[i].c)) {
            return false;
        }
        if (obj != null) {
            TokenBuffer[] tokenBufferArr = this.e;
            if (tokenBufferArr[i] != null) {
                a(jsonParser, deserializationContext, obj, i, str2);
                tokenBufferArr[i] = null;
                return true;
            }
        }
        this.d[i] = str2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer r14, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r15) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.c(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator):java.lang.Object");
    }

    public final void d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws MismatchedInputException {
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        Object obj2;
        ExtTypedProperty[] extTypedPropertyArr = this.b;
        int length = extTypedPropertyArr.length;
        int i = 0;
        while (i < length) {
            String strD = this.d[i];
            ExtTypedProperty extTypedProperty = extTypedPropertyArr[i];
            TokenBuffer[] tokenBufferArr = this.e;
            if (strD == null) {
                TokenBuffer tokenBuffer = tokenBufferArr[i];
                if (tokenBuffer != null) {
                    if (tokenBuffer.l.d(0).k) {
                        TokenBuffer.Parser parserK2 = tokenBuffer.k2(jsonParser);
                        parserK2.N1();
                        SettableBeanProperty settableBeanProperty = extTypedProperty.f14247a;
                        Object objA = TypeDeserializer.a(parserK2, settableBeanProperty.g);
                        if (objA != null) {
                            settableBeanProperty.z(obj, objA);
                        }
                    }
                    TypeDeserializer typeDeserializer = extTypedProperty.b;
                    String str = extTypedProperty.c;
                    PropertyName propertyName = extTypedProperty.f14247a.f;
                    boolean zK = typeDeserializer.k();
                    JavaType javaType = this.f14245a;
                    if (!zK) {
                        String str2 = propertyName.d;
                        deserializationContext.getClass();
                        Class cls = javaType.d;
                        MismatchedInputException mismatchedInputException = new MismatchedInputException(deserializationContext.i, String.format("Missing external type id property '%s' (and no 'defaultImpl' specified)", str));
                        if (str2 == null) {
                            throw mismatchedInputException;
                        }
                        mismatchedInputException.e(cls, str2);
                        throw mismatchedInputException;
                    }
                    TypeDeserializer typeDeserializer2 = extTypedProperty.b;
                    Class clsG = typeDeserializer2.g();
                    strD = clsG == null ? null : typeDeserializer2.i().d(clsG, null);
                    if (strD == null) {
                        String str3 = propertyName.d;
                        deserializationContext.getClass();
                        Class cls2 = javaType.d;
                        MismatchedInputException mismatchedInputException2 = new MismatchedInputException(deserializationContext.i, String.format("Invalid default type id for property '%s': `null` returned by TypeIdResolver", str));
                        if (str3 == null) {
                            throw mismatchedInputException2;
                        }
                        mismatchedInputException2.e(cls2, str3);
                        throw mismatchedInputException2;
                    }
                }
                jsonParser2 = jsonParser;
                deserializationContext2 = deserializationContext;
                obj2 = obj;
                i++;
                jsonParser = jsonParser2;
                deserializationContext = deserializationContext2;
                obj = obj2;
            } else if (tokenBufferArr[i] == null) {
                SettableBeanProperty settableBeanProperty2 = extTypedProperty.f14247a;
                Boolean bool = settableBeanProperty2.d.d;
                if ((bool == null || !bool.booleanValue()) && !deserializationContext.N(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    return;
                }
                Class<?> cls3 = obj.getClass();
                String str4 = settableBeanProperty2.f.d;
                Object[] objArr = {str4, extTypedProperty.c};
                deserializationContext.getClass();
                MismatchedInputException mismatchedInputException3 = new MismatchedInputException(deserializationContext.i, String.format("Missing property '%s' for external type id '%s'", objArr));
                if (str4 == null) {
                    throw mismatchedInputException3;
                }
                mismatchedInputException3.e(cls3, str4);
                throw mismatchedInputException3;
            }
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
            obj2 = obj;
            a(jsonParser2, deserializationContext2, obj2, i, strD);
            i++;
            jsonParser = jsonParser2;
            deserializationContext = deserializationContext2;
            obj = obj2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13, java.lang.Object r14, java.lang.String r15) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r11 = this;
            java.util.Map r4 = r11.c
            java.lang.Object r4 = r4.get(r15)
            if (r4 != 0) goto La
            r1 = 0
            return r1
        La:
            boolean r5 = r4 instanceof java.util.List
            r6 = 1
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r7 = r11.b
            com.fasterxml.jackson.databind.util.TokenBuffer[] r8 = r11.e
            java.lang.String[] r9 = r11.d
            if (r5 == 0) goto L6f
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r10 = r5.intValue()
            r7 = r7[r10]
            java.lang.String r7 = r7.c
            boolean r3 = r15.equals(r7)
            if (r3 == 0) goto L4f
            java.lang.String r2 = r12.k0()
            r12.V1()
            int r1 = r5.intValue()
            r9[r1] = r2
        L3c:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r4.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9[r1] = r2
            goto L3c
        L4f:
            com.fasterxml.jackson.databind.util.TokenBuffer r2 = r13.k(r12)
            r2.u2(r12)
            int r1 = r5.intValue()
            r8[r1] = r2
        L5c:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r4.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8[r1] = r2
            goto L5c
        L6f:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r7[r4]
            java.lang.String r5 = r5.c
            boolean r3 = r15.equals(r5)
            if (r3 == 0) goto L8f
            java.lang.String r3 = r12.T0()
            r9[r4] = r3
            r12.V1()
            if (r14 == 0) goto Lac
            r3 = r8[r4]
            if (r3 == 0) goto Lac
            goto L9e
        L8f:
            com.fasterxml.jackson.databind.util.TokenBuffer r3 = r13.k(r12)
            r3.u2(r12)
            r8[r4] = r3
            if (r14 == 0) goto Lac
            r3 = r9[r4]
            if (r3 == 0) goto Lac
        L9e:
            r5 = r9[r4]
            r7 = 0
            r9[r4] = r7
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r0.a(r1, r2, r3, r4, r5)
            r8[r4] = r7
        Lac:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String):boolean");
    }

    public final void f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws MismatchedInputException {
        Object obj2 = this.c.get(str);
        if (obj2 == null) {
            return;
        }
        String strK0 = jsonParser.k0();
        if (!(obj2 instanceof List)) {
            b(jsonParser, deserializationContext, str, obj, strK0, ((Integer) obj2).intValue());
            return;
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            b(jsonParser, deserializationContext, str, obj, strK0, ((Integer) it.next()).intValue());
        }
    }

    public ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        this.f14245a = externalTypeHandler.f14245a;
        ExtTypedProperty[] extTypedPropertyArr = externalTypeHandler.b;
        this.b = extTypedPropertyArr;
        this.c = externalTypeHandler.c;
        int length = extTypedPropertyArr.length;
        this.d = new String[length];
        this.e = new TokenBuffer[length];
    }
}
