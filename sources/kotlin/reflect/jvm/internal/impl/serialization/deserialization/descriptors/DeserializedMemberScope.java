package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.sequences.SequencesKt;

/* loaded from: classes.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {
    public static final /* synthetic */ KProperty[] f;
    public final DeserializationContext b;
    public final Implementation c;
    public final NotNullLazyValue d;
    public final NullableLazyValue e;

    public interface Implementation {
        Set a();

        Collection b(Name name, NoLookupLocation noLookupLocation);

        Set c();

        TypeAliasDescriptor d(Name name);

        void e(ArrayList arrayList, DescriptorKindFilter descriptorKindFilter, Function1 function1);

        Set f();

        Collection g(Name name, NoLookupLocation noLookupLocation);
    }

    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public final class NoReorderImplementation implements Implementation {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ KProperty[] f24590a;

        static {
            PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(NoReorderImplementation.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0);
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            f24590a = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(NoReorderImplementation.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0, reflectionFactory), c.t(NoReorderImplementation.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0, reflectionFactory), c.t(NoReorderImplementation.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0, reflectionFactory), c.t(NoReorderImplementation.class, "allProperties", "getAllProperties()Ljava/util/List;", 0, reflectionFactory), c.t(NoReorderImplementation.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0, reflectionFactory), c.t(NoReorderImplementation.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0, reflectionFactory), c.t(NoReorderImplementation.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0, reflectionFactory), c.t(NoReorderImplementation.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0, reflectionFactory), c.t(NoReorderImplementation.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, reflectionFactory)};
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set a() {
            return (Set) StorageKt.a(null, f24590a[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection b(Name name, NoLookupLocation noLookupLocation) {
            Collection collection;
            Intrinsics.h(name, "name");
            return (c().contains(name) && (collection = (Collection) ((Map) StorageKt.a(null, f24590a[7])).get(name)) != null) ? collection : EmptyList.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set c() {
            return (Set) StorageKt.a(null, f24590a[9]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final TypeAliasDescriptor d(Name name) {
            Intrinsics.h(name, "name");
            return (TypeAliasDescriptor) ((Map) StorageKt.a(null, f24590a[5])).get(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final void e(ArrayList arrayList, DescriptorKindFilter kindFilter, Function1 function1) {
            NoLookupLocation noLookupLocation = NoLookupLocation.d;
            Intrinsics.h(kindFilter, "kindFilter");
            boolean zA = kindFilter.a(DescriptorKindFilter.j);
            KProperty[] kPropertyArr = f24590a;
            if (zA) {
                for (Object obj : (List) StorageKt.a(null, kPropertyArr[4])) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    Intrinsics.g(name, "getName(...)");
                    if (((Boolean) function1.invoke(name)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
            }
            if (kindFilter.a(DescriptorKindFilter.i)) {
                for (Object obj2 : (List) StorageKt.a(null, kPropertyArr[3])) {
                    Name name2 = ((SimpleFunctionDescriptor) obj2).getName();
                    Intrinsics.g(name2, "getName(...)");
                    if (((Boolean) function1.invoke(name2)).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set f() {
            new LinkedHashSet();
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection g(Name name, NoLookupLocation noLookupLocation) {
            Collection collection;
            Intrinsics.h(name, "name");
            return (a().contains(name) && (collection = (Collection) ((Map) StorageKt.a(null, f24590a[6])).get(name)) != null) ? collection : EmptyList.d;
        }
    }

    @SourceDebugExtension
    public final class OptimizedImplementation implements Implementation {
        public static final /* synthetic */ KProperty[] j;

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f24591a;
        public final LinkedHashMap b;
        public final Object c;
        public final MemoizedFunctionToNotNull d;
        public final MemoizedFunctionToNotNull e;
        public final MemoizedFunctionToNullable f;
        public final NotNullLazyValue g;
        public final NotNullLazyValue h;
        public final /* synthetic */ DeserializedMemberScope i;

        static {
            PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(OptimizedImplementation.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            j = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(OptimizedImplementation.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, reflectionFactory)};
        }

        public OptimizedImplementation(DeserializedMemberScope deserializedMemberScope, List functionList, List propertyList, List typeAliasList) {
            Intrinsics.h(functionList, "functionList");
            Intrinsics.h(propertyList, "propertyList");
            Intrinsics.h(typeAliasList, "typeAliasList");
            this.i = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                Name nameB = NameResolverUtilKt.b(deserializedMemberScope.b.b, ((ProtoBuf.Function) ((MessageLite) obj)).i);
                Object arrayList = linkedHashMap.get(nameB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(nameB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f24591a = h(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                Name nameB2 = NameResolverUtilKt.b(deserializedMemberScope2.b.b, ((ProtoBuf.Property) ((MessageLite) obj2)).i);
                Object arrayList2 = linkedHashMap2.get(nameB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(nameB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.b = h(linkedHashMap2);
            this.i.b.f24572a.c.getClass();
            DeserializedMemberScope deserializedMemberScope3 = this.i;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : typeAliasList) {
                Name nameB3 = NameResolverUtilKt.b(deserializedMemberScope3.b.b, ((ProtoBuf.TypeAlias) ((MessageLite) obj3)).o());
                Object arrayList3 = linkedHashMap3.get(nameB3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(nameB3, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            this.c = h(linkedHashMap3);
            this.d = this.i.b.f24572a.f24570a.g(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$0
                public final DeserializedMemberScope.OptimizedImplementation d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    Name it = (Name) obj4;
                    KProperty[] kPropertyArr = DeserializedMemberScope.OptimizedImplementation.j;
                    Intrinsics.h(it, "it");
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.d;
                    LinkedHashMap linkedHashMap4 = optimizedImplementation.f24591a;
                    Parser PARSER = ProtoBuf.Function.z;
                    Intrinsics.g(PARSER, "PARSER");
                    DeserializedMemberScope deserializedMemberScope4 = optimizedImplementation.i;
                    byte[] bArr = (byte[]) linkedHashMap4.get(it);
                    Collection<ProtoBuf.Function> collectionX = bArr != null ? SequencesKt.x(SequencesKt.n(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(PARSER, new ByteArrayInputStream(bArr), deserializedMemberScope4))) : EmptyList.d;
                    ArrayList arrayList4 = new ArrayList(collectionX.size());
                    for (ProtoBuf.Function function : collectionX) {
                        MemberDeserializer memberDeserializer = deserializedMemberScope4.b.i;
                        Intrinsics.e(function);
                        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptorE = memberDeserializer.e(function);
                        if (!deserializedMemberScope4.r(deserializedSimpleFunctionDescriptorE)) {
                            deserializedSimpleFunctionDescriptorE = null;
                        }
                        if (deserializedSimpleFunctionDescriptorE != null) {
                            arrayList4.add(deserializedSimpleFunctionDescriptorE);
                        }
                    }
                    deserializedMemberScope4.j(arrayList4, it);
                    return CollectionsKt.b(arrayList4);
                }
            });
            this.e = this.i.b.f24572a.f24570a.g(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$1
                public final DeserializedMemberScope.OptimizedImplementation d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    Name it = (Name) obj4;
                    KProperty[] kPropertyArr = DeserializedMemberScope.OptimizedImplementation.j;
                    Intrinsics.h(it, "it");
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.d;
                    LinkedHashMap linkedHashMap4 = optimizedImplementation.b;
                    Parser PARSER = ProtoBuf.Property.z;
                    Intrinsics.g(PARSER, "PARSER");
                    DeserializedMemberScope deserializedMemberScope4 = optimizedImplementation.i;
                    byte[] bArr = (byte[]) linkedHashMap4.get(it);
                    Collection<ProtoBuf.Property> collectionX = bArr != null ? SequencesKt.x(SequencesKt.n(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(PARSER, new ByteArrayInputStream(bArr), deserializedMemberScope4))) : EmptyList.d;
                    ArrayList arrayList4 = new ArrayList(collectionX.size());
                    for (ProtoBuf.Property property : collectionX) {
                        MemberDeserializer memberDeserializer = deserializedMemberScope4.b.i;
                        Intrinsics.e(property);
                        arrayList4.add(memberDeserializer.f(property));
                    }
                    deserializedMemberScope4.k(arrayList4, it);
                    return CollectionsKt.b(arrayList4);
                }
            });
            this.f = this.i.b.f24572a.f24570a.b(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$2
                public final DeserializedMemberScope.OptimizedImplementation d;

                {
                    this.d = this;
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    ProtoBuf.TypeAlias proto;
                    Name it = (Name) obj4;
                    KProperty[] kPropertyArr = DeserializedMemberScope.OptimizedImplementation.j;
                    Intrinsics.h(it, "it");
                    DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.d;
                    DeserializationContext deserializationContext = optimizedImplementation.i.b;
                    byte[] bArr = (byte[]) optimizedImplementation.c.get(it);
                    if (bArr == null || (proto = ProtoBuf.TypeAlias.q(new ByteArrayInputStream(bArr), deserializationContext.f24572a.p)) == null) {
                        return null;
                    }
                    MemberDeserializer memberDeserializer = deserializationContext.i;
                    DeserializationContext deserializationContext2 = memberDeserializer.f24580a;
                    NameResolver nameResolver = deserializationContext2.b;
                    TypeTable typeTable = deserializationContext2.d;
                    Intrinsics.h(proto, "proto");
                    List listM = proto.m();
                    Intrinsics.g(listM, "getAnnotationList(...)");
                    List<ProtoBuf.Annotation> list = listM;
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.CollectionsKt.s(list, 10));
                    for (ProtoBuf.Annotation annotation : list) {
                        AnnotationDeserializer annotationDeserializer = memberDeserializer.b;
                        Intrinsics.e(annotation);
                        arrayList4.add(annotationDeserializer.a(annotation, nameResolver));
                    }
                    DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(deserializationContext2.f24572a.f24570a, deserializationContext2.c, Annotations.Companion.a(arrayList4), NameResolverUtilKt.b(nameResolver, proto.o()), ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) Flags.d.c(proto.n())), proto, deserializationContext2.b, typeTable, deserializationContext2.e, deserializationContext2.g);
                    List listP = proto.p();
                    Intrinsics.g(listP, "getTypeParameterList(...)");
                    TypeDeserializer typeDeserializer = deserializationContext2.a(deserializedTypeAliasDescriptor, listP, deserializationContext2.b, deserializationContext2.d, deserializationContext2.e, deserializationContext2.f).h;
                    deserializedTypeAliasDescriptor.J0(typeDeserializer.b(), typeDeserializer.d(ProtoTypeTableUtilKt.q(proto, typeTable), false), typeDeserializer.d(ProtoTypeTableUtilKt.e(proto, typeTable), false));
                    return deserializedTypeAliasDescriptor;
                }
            });
            final DeserializedMemberScope deserializedMemberScope4 = this.i;
            this.g = deserializedMemberScope4.b.f24572a.f24570a.d(new Function0(this, deserializedMemberScope4) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$3
                public final DeserializedMemberScope.OptimizedImplementation d;
                public final DeserializedMemberScope e;

                {
                    this.d = this;
                    this.e = deserializedMemberScope4;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SetsKt.g(this.d.f24591a.keySet(), this.e.o());
                }
            });
            final DeserializedMemberScope deserializedMemberScope5 = this.i;
            this.h = deserializedMemberScope5.b.f24572a.f24570a.d(new Function0(this, deserializedMemberScope5) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$4
                public final DeserializedMemberScope.OptimizedImplementation d;
                public final DeserializedMemberScope e;

                {
                    this.d = this;
                    this.e = deserializedMemberScope5;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SetsKt.g(this.d.b.keySet(), this.e.p());
                }
            });
        }

        public static LinkedHashMap h(LinkedHashMap linkedHashMap) throws IOException {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<AbstractMessageLite> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.s(iterable, 10));
                for (AbstractMessageLite abstractMessageLite : iterable) {
                    int serializedSize = abstractMessageLite.getSerializedSize();
                    int iF = CodedOutputStream.f(serializedSize) + serializedSize;
                    if (iF > 4096) {
                        iF = 4096;
                    }
                    CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(byteArrayOutputStream, iF);
                    codedOutputStreamJ.v(serializedSize);
                    abstractMessageLite.a(codedOutputStreamJ);
                    codedOutputStreamJ.i();
                    arrayList.add(Unit.f24250a);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set a() {
            return (Set) StorageKt.a(this.g, j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection b(Name name, NoLookupLocation noLookupLocation) {
            Intrinsics.h(name, "name");
            return !c().contains(name) ? EmptyList.d : (Collection) this.e.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set c() {
            return (Set) StorageKt.a(this.h, j[1]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final TypeAliasDescriptor d(Name name) {
            Intrinsics.h(name, "name");
            return (TypeAliasDescriptor) this.f.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final void e(ArrayList arrayList, DescriptorKindFilter kindFilter, Function1 function1) {
            NoLookupLocation noLookupLocation = NoLookupLocation.g;
            Intrinsics.h(kindFilter, "kindFilter");
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.c;
            boolean zA = kindFilter.a(DescriptorKindFilter.Companion.g());
            MemberComparator.NameAndTypeMemberComparator nameAndTypeMemberComparator = MemberComparator.NameAndTypeMemberComparator.d;
            if (zA) {
                Set<Name> setC = c();
                ArrayList arrayList2 = new ArrayList();
                for (Name name : setC) {
                    if (((Boolean) function1.invoke(name)).booleanValue()) {
                        arrayList2.addAll(b(name, noLookupLocation));
                    }
                }
                kotlin.collections.CollectionsKt.s0(arrayList2, nameAndTypeMemberComparator);
                arrayList.addAll(arrayList2);
            }
            DescriptorKindFilter.Companion companion2 = DescriptorKindFilter.c;
            if (kindFilter.a(DescriptorKindFilter.Companion.b())) {
                Set<Name> setA = a();
                ArrayList arrayList3 = new ArrayList();
                for (Name name2 : setA) {
                    if (((Boolean) function1.invoke(name2)).booleanValue()) {
                        arrayList3.addAll(g(name2, noLookupLocation));
                    }
                }
                kotlin.collections.CollectionsKt.s0(arrayList3, nameAndTypeMemberComparator);
                arrayList.addAll(arrayList3);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Set f() {
            return this.c.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public final Collection g(Name name, NoLookupLocation noLookupLocation) {
            Intrinsics.h(name, "name");
            return !a().contains(name) ? EmptyList.d : (Collection) this.d.invoke(name);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DeserializedMemberScope.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(DeserializedMemberScope.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, reflectionFactory)};
    }

    public DeserializedMemberScope(DeserializationContext c, List functionList, List propertyList, List typeAliasList, final Function0 function0) {
        Intrinsics.h(c, "c");
        Intrinsics.h(functionList, "functionList");
        Intrinsics.h(propertyList, "propertyList");
        Intrinsics.h(typeAliasList, "typeAliasList");
        this.b = c;
        DeserializationComponents deserializationComponents = c.f24572a;
        deserializationComponents.c.getClass();
        this.c = new OptimizedImplementation(this, functionList, propertyList, typeAliasList);
        LockBasedStorageManager lockBasedStorageManager = deserializationComponents.f24570a;
        this.d = lockBasedStorageManager.d(new Function0(function0) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$$Lambda$0
            public final Function0 d;

            {
                this.d = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = DeserializedMemberScope.f;
                return kotlin.collections.CollectionsKt.L0((Iterable) this.d.invoke());
            }
        });
        this.e = lockBasedStorageManager.e(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$$Lambda$1
            public final DeserializedMemberScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = DeserializedMemberScope.f;
                DeserializedMemberScope deserializedMemberScope = this.d;
                Set setN = deserializedMemberScope.n();
                if (setN == null) {
                    return null;
                }
                return SetsKt.g(SetsKt.g(deserializedMemberScope.m(), deserializedMemberScope.c.f()), setN);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        return this.c.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        return this.c.b(name, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        return this.c.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set d() {
        KProperty p = f[1];
        NullableLazyValue nullableLazyValue = this.e;
        Intrinsics.h(nullableLazyValue, "<this>");
        Intrinsics.h(p, "p");
        return (Set) nullableLazyValue.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection e(Name name, LookupLocation lookupLocation) {
        Intrinsics.h(name, "name");
        return this.c.g(name, (NoLookupLocation) lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        if (q(name)) {
            return this.b.f24572a.b(l(name));
        }
        Implementation implementation = this.c;
        if (implementation.f().contains(name)) {
            return implementation.d(name);
        }
        return null;
    }

    public abstract void h(ArrayList arrayList, Function1 function1);

    public final Collection i(DescriptorKindFilter kindFilter, Function1 function1) {
        NoLookupLocation noLookupLocation = NoLookupLocation.d;
        Intrinsics.h(kindFilter, "kindFilter");
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.c;
        if (kindFilter.a(DescriptorKindFilter.Companion.e())) {
            h(arrayList, function1);
        }
        Implementation implementation = this.c;
        implementation.e(arrayList, kindFilter, function1);
        if (kindFilter.a(DescriptorKindFilter.Companion.a())) {
            for (Name name : m()) {
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    CollectionsKt.a(arrayList, this.b.f24572a.b(l(name)));
                }
            }
        }
        DescriptorKindFilter.Companion companion2 = DescriptorKindFilter.c;
        if (kindFilter.a(DescriptorKindFilter.Companion.f())) {
            for (Name name2 : implementation.f()) {
                if (((Boolean) function1.invoke(name2)).booleanValue()) {
                    CollectionsKt.a(arrayList, implementation.d(name2));
                }
            }
        }
        return CollectionsKt.b(arrayList);
    }

    public void j(ArrayList arrayList, Name name) {
        Intrinsics.h(name, "name");
    }

    public void k(ArrayList arrayList, Name name) {
        Intrinsics.h(name, "name");
    }

    public abstract ClassId l(Name name);

    public final Set m() {
        return (Set) StorageKt.a(this.d, f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(Name name) {
        Intrinsics.h(name, "name");
        return m().contains(name);
    }

    public boolean r(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor) {
        return true;
    }
}
