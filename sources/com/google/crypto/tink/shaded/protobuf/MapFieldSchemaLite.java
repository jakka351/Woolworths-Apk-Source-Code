package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class MapFieldSchemaLite implements MapFieldSchema {
    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteG = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteG.d()) {
                mapFieldLiteG = mapFieldLiteG.g();
            }
            mapFieldLiteG.f(mapFieldLite);
        }
        return mapFieldLiteG;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final void b(Object obj) {
        ((MapEntryLite) obj).getClass();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final Object c(Object obj) {
        ((MapFieldLite) obj).e();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final void d(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        if (mapFieldLite.isEmpty()) {
            return;
        }
        Iterator it = mapFieldLite.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            mapEntryLite.getClass();
            MapEntryLite.a(i, key, value);
            throw null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final MapFieldLite f(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final MapFieldLite g() {
        return MapFieldLite.b().g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public final boolean h(Object obj) {
        return !((MapFieldLite) obj).d();
    }
}
