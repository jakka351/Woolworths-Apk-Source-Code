package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.UnsafeUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@CheckReturnValue
/* loaded from: classes.dex */
abstract class ListFieldSchema {

    /* renamed from: a, reason: collision with root package name */
    public static final ListFieldSchemaFull f16061a = new ListFieldSchemaFull();
    public static final ListFieldSchemaLite b = new ListFieldSchemaLite();

    public static final class ListFieldSchemaFull extends ListFieldSchema {
        public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public static List d(Object obj, int i, long j) {
            List list = (List) UnsafeUtil.c.m(j, obj);
            if (list.isEmpty()) {
                List lazyStringArrayList = list instanceof LazyStringList ? new LazyStringArrayList(i) : ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).a(i) : new ArrayList(i);
                UnsafeUtil.r(obj, j, lazyStringArrayList);
                return lazyStringArrayList;
            }
            if (c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                UnsafeUtil.r(obj, j, arrayList);
                return arrayList;
            }
            if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.r(obj, j, lazyStringArrayList2);
                return lazyStringArrayList2;
            }
            if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (!protobufList.r()) {
                    Internal.ProtobufList protobufListA = protobufList.a(list.size() + i);
                    UnsafeUtil.r(obj, j, protobufListA);
                    return protobufListA;
                }
            }
            return list;
        }

        @Override // com.google.protobuf.ListFieldSchema
        public final void a(long j, Object obj) {
            Object objUnmodifiableList;
            List list = (List) UnsafeUtil.c.m(j, obj);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).f();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.r()) {
                        protobufList.p();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.r(obj, j, objUnmodifiableList);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public final void b(Object obj, long j, Object obj2) {
            List list = (List) UnsafeUtil.c.m(j, obj2);
            List listD = d(obj, list.size(), j);
            int size = listD.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listD.addAll(list);
            }
            if (size > 0) {
                list = listD;
            }
            UnsafeUtil.r(obj, j, list);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public final List c(long j, Object obj) {
            return d(obj, 10, j);
        }
    }

    public static final class ListFieldSchemaLite extends ListFieldSchema {
        @Override // com.google.protobuf.ListFieldSchema
        public final void a(long j, Object obj) {
            ((Internal.ProtobufList) UnsafeUtil.c.m(j, obj)).p();
        }

        @Override // com.google.protobuf.ListFieldSchema
        public final void b(Object obj, long j, Object obj2) {
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

        @Override // com.google.protobuf.ListFieldSchema
        public final List c(long j, Object obj) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) UnsafeUtil.c.m(j, obj);
            if (protobufList.r()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList protobufListA = protobufList.a(size == 0 ? 10 : size * 2);
            UnsafeUtil.r(obj, j, protobufListA);
            return protobufListA;
        }
    }

    public abstract void a(long j, Object obj);

    public abstract void b(Object obj, long j, Object obj2);

    public abstract List c(long j, Object obj);
}
