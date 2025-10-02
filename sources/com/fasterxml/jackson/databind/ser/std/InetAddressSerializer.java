package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.net.InetAddress;

/* loaded from: classes4.dex */
public class InetAddressSerializer extends StdScalarSerializer<InetAddress> implements ContextualSerializer {
    public final boolean f;

    public InetAddressSerializer(boolean z) {
        super(InetAddress.class);
        this.f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonSerializer b(com.fasterxml.jackson.databind.SerializerProvider r2, com.fasterxml.jackson.databind.BeanProperty r3) {
        /*
            r1 = this;
            java.lang.Class r0 = r1.d
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = com.fasterxml.jackson.databind.ser.std.StdSerializer.k(r2, r3, r0)
            if (r2 == 0) goto L16
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.e
            boolean r3 = r2.a()
            if (r3 != 0) goto L14
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.g
            if (r2 != r3) goto L16
        L14:
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            boolean r3 = r1.f
            if (r2 == r3) goto L21
            com.fasterxml.jackson.databind.ser.std.InetAddressSerializer r3 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer
            r3.<init>(r2)
            return r3
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.InetAddressSerializer.b(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        o((InetAddress) obj, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        InetAddress inetAddress = (InetAddress) obj;
        WritableTypeId writableTypeIdD = typeSerializer.d(JsonToken.VALUE_STRING, inetAddress);
        writableTypeIdD.b = InetAddress.class;
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, writableTypeIdD);
        o(inetAddress, jsonGenerator);
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }

    public final void o(InetAddress inetAddress, JsonGenerator jsonGenerator) {
        String strTrim;
        if (this.f) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                strTrim = iIndexOf == 0 ? strTrim.substring(1) : strTrim.substring(0, iIndexOf);
            }
        }
        jsonGenerator.J1(strTrim);
    }
}
