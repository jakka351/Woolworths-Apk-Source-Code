package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class TypeDeserializer {

    /* renamed from: a, reason: collision with root package name */
    public final DeserializationContext f24586a;
    public final TypeDeserializer b;
    public final String c;
    public final String d;
    public final MemoizedFunctionToNullable e;
    public final MemoizedFunctionToNullable f;
    public final Object g;

    public TypeDeserializer(DeserializationContext deserializationContext, TypeDeserializer typeDeserializer, List typeParameterProtos, String debugName, String str) {
        Map linkedHashMap;
        Intrinsics.h(typeParameterProtos, "typeParameterProtos");
        Intrinsics.h(debugName, "debugName");
        this.f24586a = deserializationContext;
        this.b = typeDeserializer;
        this.c = debugName;
        this.d = str;
        DeserializationComponents deserializationComponents = deserializationContext.f24572a;
        this.e = deserializationComponents.f24570a.b(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$0
            public final TypeDeserializer d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                DeserializationContext deserializationContext2 = this.d.f24586a;
                NameResolver nameResolver = deserializationContext2.b;
                DeserializationComponents deserializationComponents2 = deserializationContext2.f24572a;
                ClassId classIdA = NameResolverUtilKt.a(nameResolver, iIntValue);
                return classIdA.c ? deserializationComponents2.b(classIdA) : FindClassInModuleKt.b(deserializationComponents2.b, classIdA);
            }
        });
        this.f = deserializationComponents.f24570a.b(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$1
            public final TypeDeserializer d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                DeserializationContext deserializationContext2 = this.d.f24586a;
                ClassId classIdA = NameResolverUtilKt.a(deserializationContext2.b, iIntValue);
                if (classIdA.c) {
                    return null;
                }
                ModuleDescriptor moduleDescriptor = deserializationContext2.f24572a.b;
                Intrinsics.h(moduleDescriptor, "<this>");
                ClassifierDescriptor classifierDescriptorB = FindClassInModuleKt.b(moduleDescriptor, classIdA);
                if (classifierDescriptorB instanceof TypeAliasDescriptor) {
                    return (TypeAliasDescriptor) classifierDescriptorB;
                }
                return null;
            }
        });
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = EmptyMap.d;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i = 0;
            while (it.hasNext()) {
                ProtoBuf.TypeParameter typeParameter = (ProtoBuf.TypeParameter) it.next();
                linkedHashMap.put(Integer.valueOf(typeParameter.g), new DeserializedTypeParameterDescriptor(this.f24586a, typeParameter, i));
                i++;
            }
        }
        this.g = linkedHashMap;
    }

    public static SimpleType a(SimpleType simpleType, KotlinType kotlinType) {
        KotlinBuiltIns kotlinBuiltInsH = TypeUtilsKt.h(simpleType);
        Annotations annotations = simpleType.getAnnotations();
        KotlinType kotlinTypeF = FunctionTypesKt.f(simpleType);
        List listD = FunctionTypesKt.d(simpleType);
        List listY = CollectionsKt.y(FunctionTypesKt.h(simpleType));
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listY, 10));
        Iterator it = listY.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.b(kotlinBuiltInsH, annotations, kotlinTypeF, listD, arrayList, kotlinType, true).N0(simpleType.K0());
    }

    public static final ArrayList e(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List list = type.g;
        Intrinsics.g(list, "getArgumentList(...)");
        List list2 = list;
        ProtoBuf.Type typeI = ProtoTypeTableUtilKt.i(type, typeDeserializer.f24586a.d);
        Iterable iterableE = typeI != null ? e(typeI, typeDeserializer) : null;
        if (iterableE == null) {
            iterableE = EmptyList.d;
        }
        return CollectionsKt.c0(iterableE, list2);
    }

    public static TypeAttributes f(List list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).a(annotations));
        }
        ArrayList arrayListG = CollectionsKt.G(arrayList);
        TypeAttributes.e.getClass();
        return TypeAttributes.Companion.c(arrayListG);
    }

    public static final ClassDescriptor h(final TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i) {
        DeserializationContext deserializationContext = typeDeserializer.f24586a;
        ClassId classIdA = NameResolverUtilKt.a(deserializationContext.b, i);
        ArrayList arrayListY = SequencesKt.y(SequencesKt.r(SequencesKt.m(type, new Function1(typeDeserializer) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$3
            public final TypeDeserializer d;

            {
                this.d = typeDeserializer;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ProtoBuf.Type it = (ProtoBuf.Type) obj;
                Intrinsics.h(it, "it");
                return ProtoTypeTableUtilKt.i(it, this.d.f24586a.d);
            }
        }), TypeDeserializer$$Lambda$4.d));
        int iD = SequencesKt.d(SequencesKt.m(classIdA, TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1.d));
        while (arrayListY.size() < iD) {
            arrayListY.add(0);
        }
        return deserializationContext.f24572a.l.a(classIdA, arrayListY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final List b() {
        return CollectionsKt.G0(this.g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final TypeParameterDescriptor c(int i) {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) this.g.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.b;
        if (typeDeserializer != null) {
            return typeDeserializer.c(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType d(final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.d(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, boolean):kotlin.reflect.jvm.internal.impl.types.SimpleType");
    }

    public final KotlinType g(ProtoBuf.Type proto) {
        Intrinsics.h(proto, "proto");
        if ((proto.f & 2) != 2) {
            return d(proto, true);
        }
        DeserializationContext deserializationContext = this.f24586a;
        String string = deserializationContext.b.getString(proto.i);
        SimpleType simpleTypeD = d(proto, true);
        ProtoBuf.Type typeF = ProtoTypeTableUtilKt.f(proto, deserializationContext.d);
        Intrinsics.e(typeF);
        return deserializationContext.f24572a.j.a(proto, string, simpleTypeD, d(typeF, true));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        TypeDeserializer typeDeserializer = this.b;
        if (typeDeserializer == null) {
            str = "";
        } else {
            str = ". Child of " + typeDeserializer.c;
        }
        sb.append(str);
        return sb.toString();
    }
}
