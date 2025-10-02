package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* loaded from: classes7.dex */
public final class TypeAliasExpansion {

    /* renamed from: a, reason: collision with root package name */
    public final TypeAliasExpansion f24609a;
    public final TypeAliasDescriptor b;
    public final List c;
    public final Map d;

    @SourceDebugExtension
    public static final class Companion {
        public static TypeAliasExpansion a(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List arguments) {
            Intrinsics.h(arguments, "arguments");
            List parameters = typeAliasDescriptor.m().getParameters();
            Intrinsics.g(parameters, "getParameters(...)");
            List list = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).H0());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, arguments, MapsKt.p(CollectionsKt.Q0(arrayList, arguments)));
        }
    }

    public TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map) {
        this.f24609a = typeAliasExpansion;
        this.b = typeAliasDescriptor;
        this.c = list;
        this.d = map;
    }

    public final boolean a(TypeAliasDescriptor typeAliasDescriptor) {
        if (this.b.equals(typeAliasDescriptor)) {
            return true;
        }
        TypeAliasExpansion typeAliasExpansion = this.f24609a;
        return typeAliasExpansion != null ? typeAliasExpansion.a(typeAliasDescriptor) : false;
    }
}
