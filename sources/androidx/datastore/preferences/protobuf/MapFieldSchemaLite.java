package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes.dex */
final class MapFieldSchemaLite implements MapFieldSchema {
    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
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

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapEntryLite.Metadata b(Object obj) {
        return ((MapEntryLite) obj).f2656a;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Object c(Object obj) {
        ((MapFieldLite) obj).d = false;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final int d(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int iY = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            mapEntryLite.getClass();
            int iX = CodedOutputStream.X(i);
            int iA = MapEntryLite.a(mapEntryLite.f2656a, key, value);
            iY += CodedOutputStream.Y(iA) + iA + iX;
        }
        return iY;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite f(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite g() {
        return MapFieldLite.e.c();
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final boolean h(Object obj) {
        return !((MapFieldLite) obj).d;
    }
}
