package com.google.protobuf;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.protobuf.MapEntryLite;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes.dex */
class MapFieldSchemaLite implements MapFieldSchema {
    @Override // com.google.protobuf.MapFieldSchema
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteC = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteC.d) {
                mapFieldLiteC = mapFieldLiteC.c();
            }
            mapFieldLiteC.b();
            if (!mapFieldLite.isEmpty()) {
                mapFieldLiteC.putAll(mapFieldLite);
            }
        }
        return mapFieldLiteC;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final MapEntryLite.Metadata b(Object obj) {
        return ((MapEntryLite) obj).f16065a;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final Object c(Object obj) {
        ((MapFieldLite) obj).d = false;
        return obj;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final int d(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int iB = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            mapEntryLite.getClass();
            int iV = CodedOutputStream.V(i);
            int iA = MapEntryLite.a(mapEntryLite.f16065a, key, value);
            iB = c.B(iA, iA, iV, iB);
        }
        return iB;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final MapFieldLite f(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final MapFieldLite g() {
        return MapFieldLite.e.c();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final boolean h(Object obj) {
        return !((MapFieldLite) obj).d;
    }
}
