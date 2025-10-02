package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.UnsafeUtil;

/* loaded from: classes.dex */
final class ListFieldSchemaLite implements ListFieldSchema {
    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final void a(Object obj, long j, Object obj2) {
        UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.c;
        Internal.ProtobufList protobufListA = (Internal.ProtobufList) memoryAccessor.m(j, obj);
        Internal.ProtobufList protobufList = (Internal.ProtobufList) memoryAccessor.m(j, obj2);
        int size = protobufListA.size();
        int size2 = protobufList.size();
        if (size > 0 && size2 > 0) {
            if (!protobufListA.r()) {
                protobufListA = protobufListA.a(size2 + size);
            }
            protobufListA.addAll(protobufList);
        }
        if (size > 0) {
            protobufList = protobufListA;
        }
        UnsafeUtil.r(obj, j, protobufList);
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final Internal.ProtobufList b(long j, Object obj) {
        Internal.ProtobufList protobufList = (Internal.ProtobufList) UnsafeUtil.c.m(j, obj);
        if (protobufList.r()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListA = protobufList.a(size == 0 ? 10 : size * 2);
        UnsafeUtil.r(obj, j, protobufListA);
        return protobufListA;
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final void c(long j, Object obj) {
        ((Internal.ProtobufList) UnsafeUtil.c.m(j, obj)).p();
    }
}
