package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class TypeTable {

    /* renamed from: a, reason: collision with root package name */
    public final List f24489a;

    public TypeTable(ProtoBuf.TypeTable typeTable) {
        Intrinsics.h(typeTable, "typeTable");
        List list = typeTable.f;
        if ((typeTable.e & 1) == 1) {
            int i = typeTable.g;
            Intrinsics.g(list, "getTypeList(...)");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                ProtoBuf.Type typeBuild = (ProtoBuf.Type) obj;
                if (i2 >= i) {
                    typeBuild.getClass();
                    ProtoBuf.Type.Builder builderN = ProtoBuf.Type.n(typeBuild);
                    builderN.p(true);
                    typeBuild = builderN.build();
                }
                arrayList.add(typeBuild);
                i2 = i3;
            }
            list = arrayList;
        }
        Intrinsics.g(list, "run(...)");
        this.f24489a = list;
    }

    public final ProtoBuf.Type a(int i) {
        return (ProtoBuf.Type) this.f24489a.get(i);
    }
}
