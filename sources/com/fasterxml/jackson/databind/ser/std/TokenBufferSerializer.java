package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class TokenBufferSerializer extends StdSerializer<TokenBuffer> {
    public static void o(TokenBuffer tokenBuffer, JsonGenerator jsonGenerator) throws JsonGenerationException {
        TokenBuffer.Segment segment = tokenBuffer.l;
        boolean z = tokenBuffer.j;
        boolean z2 = z && segment.d != null;
        int i = -1;
        while (true) {
            i++;
            if (i >= 16) {
                segment = segment.f14340a;
                if (segment == null) {
                    return;
                }
                z2 = z && segment.d != null;
                i = 0;
            }
            JsonToken jsonTokenD = segment.d(i);
            Object[] objArr = segment.c;
            if (jsonTokenD == null) {
                return;
            }
            if (z2) {
                Object objC = segment.c(i);
                if (objC != null) {
                    jsonGenerator.z0(objC);
                }
                TreeMap treeMap = segment.d;
                Object obj = treeMap == null ? null : treeMap.get(Integer.valueOf(i + i));
                if (obj != null) {
                    jsonGenerator.N1(obj);
                }
            }
            switch (jsonTokenD.ordinal()) {
                case 1:
                    jsonGenerator.p1();
                    break;
                case 2:
                    jsonGenerator.H();
                    break;
                case 3:
                    jsonGenerator.W0();
                    break;
                case 4:
                    jsonGenerator.F();
                    break;
                case 5:
                    Object obj2 = objArr[i];
                    if (!(obj2 instanceof SerializableString)) {
                        jsonGenerator.U((String) obj2);
                        break;
                    } else {
                        jsonGenerator.T((SerializableString) obj2);
                        break;
                    }
                case 6:
                    Object obj3 = objArr[i];
                    if (!(obj3 instanceof RawValue)) {
                        if (!(obj3 instanceof JsonSerializable)) {
                            jsonGenerator.C(obj3);
                            break;
                        } else {
                            jsonGenerator.writeObject(obj3);
                            break;
                        }
                    } else {
                        Object obj4 = ((RawValue) obj3).d;
                        if (!(obj4 instanceof JsonSerializable)) {
                            if (!(obj4 instanceof SerializableString)) {
                                jsonGenerator.V0(String.valueOf(obj4));
                                break;
                            } else {
                                jsonGenerator.T0((SerializableString) obj4);
                                break;
                            }
                        } else {
                            jsonGenerator.writeObject(obj4);
                            break;
                        }
                    }
                case 7:
                    Object obj5 = objArr[i];
                    if (!(obj5 instanceof SerializableString)) {
                        jsonGenerator.J1((String) obj5);
                        break;
                    } else {
                        jsonGenerator.C1((SerializableString) obj5);
                        break;
                    }
                case 8:
                    Object obj6 = objArr[i];
                    if (!(obj6 instanceof Integer)) {
                        if (!(obj6 instanceof BigInteger)) {
                            if (!(obj6 instanceof Long)) {
                                if (!(obj6 instanceof Short)) {
                                    jsonGenerator.d0(((Number) obj6).intValue());
                                    break;
                                } else {
                                    jsonGenerator.t0(((Short) obj6).shortValue());
                                    break;
                                }
                            } else {
                                jsonGenerator.i0(((Long) obj6).longValue());
                                break;
                            }
                        } else {
                            jsonGenerator.r0((BigInteger) obj6);
                            break;
                        }
                    } else {
                        jsonGenerator.d0(((Integer) obj6).intValue());
                        break;
                    }
                case 9:
                    Object obj7 = objArr[i];
                    if (obj7 instanceof Double) {
                        jsonGenerator.Z(((Double) obj7).doubleValue());
                        break;
                    } else if (obj7 instanceof BigDecimal) {
                        jsonGenerator.m0((BigDecimal) obj7);
                        break;
                    } else if (obj7 instanceof Float) {
                        jsonGenerator.b0(((Float) obj7).floatValue());
                        break;
                    } else if (obj7 == null) {
                        jsonGenerator.Y();
                        break;
                    } else {
                        if (!(obj7 instanceof String)) {
                            tokenBuffer.a("Unrecognized value type for VALUE_NUMBER_FLOAT: " + obj7.getClass().getName() + ", cannot serialize");
                            throw null;
                        }
                        jsonGenerator.k0((String) obj7);
                        break;
                    }
                case 10:
                    jsonGenerator.A(true);
                    break;
                case 11:
                    jsonGenerator.A(false);
                    break;
                case 12:
                    jsonGenerator.Y();
                    break;
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws JsonGenerationException {
        o((TokenBuffer) obj, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws JsonGenerationException {
        TokenBuffer tokenBuffer = (TokenBuffer) obj;
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.VALUE_EMBEDDED_OBJECT, tokenBuffer));
        o(tokenBuffer, jsonGenerator);
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }
}
