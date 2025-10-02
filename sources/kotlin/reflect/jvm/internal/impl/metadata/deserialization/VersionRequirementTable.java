package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes.dex */
public final class VersionRequirementTable {
    public static final VersionRequirementTable b = new VersionRequirementTable(EmptyList.d);

    /* renamed from: a, reason: collision with root package name */
    public final List f24490a;

    public static final class Companion {
        public static VersionRequirementTable a(ProtoBuf.VersionRequirementTable table) {
            Intrinsics.h(table, "table");
            if (table.e.size() == 0) {
                return VersionRequirementTable.b;
            }
            List list = table.e;
            Intrinsics.g(list, "getRequirementList(...)");
            return new VersionRequirementTable(list);
        }
    }

    public VersionRequirementTable(List list) {
        this.f24490a = list;
    }
}
