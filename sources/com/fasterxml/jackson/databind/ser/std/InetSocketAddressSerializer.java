package com.fasterxml.jackson.databind.ser.std;

import YU.a;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* loaded from: classes4.dex */
public class InetSocketAddressSerializer extends StdScalarSerializer<InetSocketAddress> {
    public static void o(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator) {
        String strSubstring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int iIndexOf = hostName.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0) {
                if (address instanceof Inet6Address) {
                    strSubstring = "[" + hostName.substring(1) + "]";
                } else {
                    strSubstring = hostName.substring(1);
                }
                hostName = strSubstring;
            } else {
                hostName = hostName.substring(0, iIndexOf);
            }
        }
        StringBuilder sbT = a.t(hostName, ":");
        sbT.append(inetSocketAddress.getPort());
        jsonGenerator.J1(sbT.toString());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        o((InetSocketAddress) obj, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
        WritableTypeId writableTypeIdD = typeSerializer.d(JsonToken.VALUE_STRING, inetSocketAddress);
        writableTypeIdD.b = InetSocketAddress.class;
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, writableTypeIdD);
        o(inetSocketAddress, jsonGenerator);
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }
}
