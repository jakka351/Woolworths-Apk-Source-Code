package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.medallia.digital.mobilesdk.q2;
import java.util.LinkedList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes7.dex */
public final class NameResolverImpl implements NameResolver {

    /* renamed from: a, reason: collision with root package name */
    public final ProtoBuf.StringTable f24488a;
    public final ProtoBuf.QualifiedNameTable b;

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NameResolverImpl(ProtoBuf.StringTable strings, ProtoBuf.QualifiedNameTable qualifiedNames) {
        Intrinsics.h(strings, "strings");
        Intrinsics.h(qualifiedNames, "qualifiedNames");
        this.f24488a = strings;
        this.b = qualifiedNames;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final String a(int i) {
        Triple tripleC = c(i);
        List list = (List) tripleC.d;
        String strM = CollectionsKt.M((List) tripleC.e, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strM;
        }
        return CollectionsKt.M(list, q2.c, null, null, null, 62) + '/' + strM;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final boolean b(int i) {
        return ((Boolean) c(i).f).booleanValue();
    }

    public final Triple c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = (ProtoBuf.QualifiedNameTable.QualifiedName) this.b.e.get(i);
            String str = this.f24488a.e.get(qualifiedName.g);
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.h;
            Intrinsics.e(kind);
            int iOrdinal = kind.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(str);
                z = true;
            }
            i = qualifiedName.f;
        }
        return new Triple(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public final String getString(int i) {
        String str = this.f24488a.e.get(i);
        Intrinsics.g(str, "getString(...)");
        return str;
    }
}
