package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ValueClassUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {
    public final Annotations A;
    public final ProtoBuf.Class h;
    public final BinaryVersion i;
    public final SourceElement j;
    public final ClassId k;
    public final Modality l;
    public final DelegatedDescriptorVisibility m;
    public final ClassKind n;
    public final DeserializationContext o;
    public final MemberScopeImpl p;
    public final DeserializedClassTypeConstructor q;
    public final ScopesHolderForClass r;
    public final EnumEntryClassDescriptors s;
    public final DeclarationDescriptor t;
    public final NullableLazyValue u;
    public final NotNullLazyValue v;
    public final NullableLazyValue w;
    public final NotNullLazyValue x;
    public final NullableLazyValue y;
    public final ProtoContainer.Class z;

    @SourceDebugExtension
    public final class DeserializedClassMemberScope extends DeserializedMemberScope {
        public static final /* synthetic */ int k = 0;
        public final KotlinTypeRefiner g;
        public final NotNullLazyValue h;
        public final NotNullLazyValue i;
        public final /* synthetic */ DeserializedClassDescriptor j;

        public DeserializedClassMemberScope(DeserializedClassDescriptor deserializedClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.j = deserializedClassDescriptor;
            DeserializationContext deserializationContext = deserializedClassDescriptor.o;
            ProtoBuf.Class r0 = deserializedClassDescriptor.h;
            List list = r0.t;
            Intrinsics.g(list, "getFunctionList(...)");
            List list2 = r0.u;
            Intrinsics.g(list2, "getPropertyList(...)");
            List list3 = r0.v;
            Intrinsics.g(list3, "getTypeAliasList(...)");
            List list4 = r0.n;
            Intrinsics.g(list4, "getNestedClassNameList(...)");
            List list5 = list4;
            NameResolver nameResolver = deserializedClassDescriptor.o.b;
            final ArrayList arrayList = new ArrayList(CollectionsKt.s(list5, 10));
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(NameResolverUtilKt.b(nameResolver, ((Number) it.next()).intValue()));
            }
            super(deserializationContext, list, list2, list3, new Function0(arrayList) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$$Lambda$0
                public final ArrayList d;

                {
                    this.d = arrayList;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = DeserializedClassDescriptor.DeserializedClassMemberScope.k;
                    return this.d;
                }
            });
            DeserializationComponents deserializationComponents = deserializationContext.f24572a;
            this.g = kotlinTypeRefiner;
            this.h = deserializationComponents.f24570a.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$$Lambda$1
                public final DeserializedClassDescriptor.DeserializedClassMemberScope d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = DeserializedClassDescriptor.DeserializedClassMemberScope.k;
                    DescriptorKindFilter descriptorKindFilter = DescriptorKindFilter.m;
                    MemberScope.f24557a.getClass();
                    Function1 function1A = MemberScope.Companion.a();
                    NoLookupLocation noLookupLocation = NoLookupLocation.d;
                    return this.d.i(descriptorKindFilter, function1A);
                }
            });
            this.i = deserializationComponents.f24570a.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$$Lambda$2
                public final DeserializedClassDescriptor.DeserializedClassMemberScope d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope = this.d;
                    return deserializedClassMemberScope.g.e(deserializedClassMemberScope.j);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection b(Name name, NoLookupLocation noLookupLocation) {
            Intrinsics.h(name, "name");
            s(name, noLookupLocation);
            return super.b(name, noLookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection e(Name name, LookupLocation lookupLocation) {
            Intrinsics.h(name, "name");
            s(name, lookupLocation);
            return super.e(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final ClassifierDescriptor f(Name name, LookupLocation location) {
            ClassDescriptor classDescriptor;
            Intrinsics.h(name, "name");
            Intrinsics.h(location, "location");
            s(name, location);
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.j.s;
            return (enumEntryClassDescriptors == null || (classDescriptor = (ClassDescriptor) enumEntryClassDescriptors.b.invoke(name)) == null) ? super.f(name, location) : classDescriptor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
            Intrinsics.h(kindFilter, "kindFilter");
            return (Collection) this.h.invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void h(ArrayList arrayList, Function1 function1) {
            ?? arrayList2;
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.j.s;
            if (enumEntryClassDescriptors != null) {
                Set<Name> setKeySet = enumEntryClassDescriptors.f24589a.keySet();
                arrayList2 = new ArrayList();
                for (Name name : setKeySet) {
                    Intrinsics.h(name, "name");
                    ClassDescriptor classDescriptor = (ClassDescriptor) enumEntryClassDescriptors.b.invoke(name);
                    if (classDescriptor != null) {
                        arrayList2.add(classDescriptor);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = EmptyList.d;
            }
            arrayList.addAll(arrayList2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void j(ArrayList arrayList, Name name) {
            Intrinsics.h(name, "name");
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Collection) this.i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList2.addAll(((KotlinType) it.next()).s().e(name, NoLookupLocation.f));
            }
            DeserializationContext deserializationContext = this.b;
            arrayList.addAll(deserializationContext.f24572a.n.d(name, this.j));
            ArrayList arrayList3 = new ArrayList(arrayList);
            deserializationContext.f24572a.q.b().h(name, arrayList2, arrayList3, this.j, new DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1(arrayList));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void k(ArrayList arrayList, Name name) {
            Intrinsics.h(name, "name");
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Collection) this.i.invoke()).iterator();
            while (it.hasNext()) {
                arrayList2.addAll(((KotlinType) it.next()).s().b(name, NoLookupLocation.f));
            }
            ArrayList arrayList3 = new ArrayList(arrayList);
            this.b.f24572a.q.b().h(name, arrayList2, arrayList3, this.j, new DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1(arrayList));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final ClassId l(Name name) {
            Intrinsics.h(name, "name");
            return this.j.k.d(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set n() {
            List listA = this.j.q.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                Set setD = ((KotlinType) it.next()).s().d();
                if (setD == null) {
                    return null;
                }
                CollectionsKt.h(setD, linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set o() {
            DeserializedClassDescriptor deserializedClassDescriptor = this.j;
            List listA = deserializedClassDescriptor.q.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                CollectionsKt.h(((KotlinType) it.next()).s().a(), linkedHashSet);
            }
            linkedHashSet.addAll(this.b.f24572a.n.e(deserializedClassDescriptor));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set p() {
            List listA = this.j.q.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                CollectionsKt.h(((KotlinType) it.next()).s().c(), linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final boolean r(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor) {
            return this.b.f24572a.o.a(this.j, deserializedSimpleFunctionDescriptor);
        }

        public final void s(Name name, LookupLocation location) {
            Intrinsics.h(name, "name");
            Intrinsics.h(location, "location");
            UtilsKt.a(this.b.f24572a.i, location, this.j, name);
        }
    }

    @SourceDebugExtension
    public final class DeserializedClassTypeConstructor extends AbstractClassTypeConstructor {
        public final NotNullLazyValue c;

        /* JADX WARN: Illegal instructions before constructor call */
        public DeserializedClassTypeConstructor() {
            DeserializationContext deserializationContext = DeserializedClassDescriptor.this.o;
            super(deserializationContext.f24572a.f24570a);
            this.c = deserializationContext.f24572a.f24570a.d(new Function0(DeserializedClassDescriptor.this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassTypeConstructor$$Lambda$0
                public final DeserializedClassDescriptor d;

                {
                    this.d = deserializedClassDescriptor;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TypeParameterUtilsKt.c(this.d);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final ClassifierDescriptor c() {
            return DeserializedClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean d() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection f() {
            String strB;
            FqName fqNameA;
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ProtoBuf.Class r1 = deserializedClassDescriptor.h;
            DeserializationContext deserializationContext = deserializedClassDescriptor.o;
            List listN = ProtoTypeTableUtilKt.n(r1, deserializationContext.d);
            ArrayList arrayList = new ArrayList(CollectionsKt.s(listN, 10));
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                arrayList.add(deserializationContext.h.g((ProtoBuf.Type) it.next()));
            }
            ArrayList arrayListC0 = CollectionsKt.c0(deserializationContext.f24572a.n.c(deserializedClassDescriptor), arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayListC0.iterator();
            while (it2.hasNext()) {
                ClassifierDescriptor classifierDescriptorC = ((KotlinType) it2.next()).J0().c();
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorC instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorC : null;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporter = deserializationContext.f24572a.h;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    NotFoundClasses.MockClassDescriptor mockClassDescriptor2 = (NotFoundClasses.MockClassDescriptor) it3.next();
                    ClassId classIdF = DescriptorUtilsKt.f(mockClassDescriptor2);
                    if (classIdF == null || (fqNameA = classIdF.a()) == null || (strB = fqNameA.f24500a.f24501a) == null) {
                        strB = mockClassDescriptor2.getName().b();
                        Intrinsics.g(strB, "asString(...)");
                    }
                    arrayList3.add(strB);
                }
                errorReporter.b(deserializedClassDescriptor, arrayList3);
            }
            return CollectionsKt.G0(arrayListC0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            return (List) this.c.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final SupertypeLoopChecker i() {
            return SupertypeLoopChecker.EMPTY.f24345a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
        /* renamed from: n */
        public final ClassDescriptor c() {
            return DeserializedClassDescriptor.this;
        }

        public final String toString() {
            String str = DeserializedClassDescriptor.this.getName().d;
            Intrinsics.g(str, "toString(...)");
            return str;
        }
    }

    @SourceDebugExtension
    public final class EnumEntryClassDescriptors {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f24589a;
        public final MemoizedFunctionToNullable b;
        public final NotNullLazyValue c;

        public EnumEntryClassDescriptors() {
            List list = DeserializedClassDescriptor.this.h.w;
            Intrinsics.g(list, "getEnumEntryList(...)");
            List list2 = list;
            int iH = MapsKt.h(CollectionsKt.s(list2, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
            for (Object obj : list2) {
                linkedHashMap.put(NameResolverUtilKt.b(DeserializedClassDescriptor.this.o.b, ((ProtoBuf.EnumEntry) obj).g), obj);
            }
            this.f24589a = linkedHashMap;
            final DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            this.b = deserializedClassDescriptor.o.f24572a.f24570a.b(new Function1(this, deserializedClassDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$$Lambda$0
                public final DeserializedClassDescriptor.EnumEntryClassDescriptors d;
                public final DeserializedClassDescriptor e;

                {
                    this.d = this;
                    this.e = deserializedClassDescriptor;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    final DeserializedClassDescriptor deserializedClassDescriptor2 = this.e;
                    DeserializationContext deserializationContext = deserializedClassDescriptor2.o;
                    Name name = (Name) obj2;
                    Intrinsics.h(name, "name");
                    DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.d;
                    final ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) enumEntryClassDescriptors.f24589a.get(name);
                    if (enumEntry != null) {
                        return EnumEntrySyntheticClassDescriptor.I0(deserializationContext.f24572a.f24570a, deserializedClassDescriptor2, name, enumEntryClassDescriptors.c, new DeserializedAnnotations(deserializationContext.f24572a.f24570a, new Function0(deserializedClassDescriptor2, enumEntry) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$$Lambda$2
                            public final DeserializedClassDescriptor d;
                            public final ProtoBuf.EnumEntry e;

                            {
                                this.d = deserializedClassDescriptor2;
                                this.e = enumEntry;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                DeserializedClassDescriptor deserializedClassDescriptor3 = this.d;
                                return CollectionsKt.G0(deserializedClassDescriptor3.o.f24572a.e.c(deserializedClassDescriptor3.z, this.e));
                            }
                        }), SourceElement.f24343a);
                    }
                    return null;
                }
            });
            this.c = DeserializedClassDescriptor.this.o.f24572a.f24570a.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$$Lambda$1
                public final DeserializedClassDescriptor.EnumEntryClassDescriptors d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    HashSet hashSet = new HashSet();
                    DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                    DeserializedClassDescriptor.DeserializedClassTypeConstructor deserializedClassTypeConstructor = deserializedClassDescriptor2.q;
                    DeserializationContext deserializationContext = deserializedClassDescriptor2.o;
                    ProtoBuf.Class r1 = deserializedClassDescriptor2.h;
                    Iterator it = deserializedClassTypeConstructor.a().iterator();
                    while (it.hasNext()) {
                        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.a(((KotlinType) it.next()).s(), null, 3)) {
                            if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                                hashSet.add(((CallableMemberDescriptor) declarationDescriptor).getName());
                            }
                        }
                    }
                    List list3 = r1.t;
                    Intrinsics.g(list3, "getFunctionList(...)");
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        hashSet.add(NameResolverUtilKt.b(deserializationContext.b, ((ProtoBuf.Function) it2.next()).i));
                    }
                    List list4 = r1.u;
                    Intrinsics.g(list4, "getPropertyList(...)");
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        hashSet.add(NameResolverUtilKt.b(deserializationContext.b, ((ProtoBuf.Property) it3.next()).i));
                    }
                    return SetsKt.g(hashSet, hashSet);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(DeserializationContext outerContext, ProtoBuf.Class classProto, NameResolver nameResolver, BinaryVersion binaryVersion, SourceElement sourceElement) {
        ClassKind classKind;
        MemberScopeImpl staticScopeForKotlinEnum;
        ProtoContainer.Class r5;
        ProtoBuf.Class r1;
        TypeTable typeTable;
        SourceElement sourceElement2;
        super(outerContext.f24572a.f24570a, NameResolverUtilKt.a(nameResolver, classProto.h).f());
        Intrinsics.h(outerContext, "outerContext");
        Intrinsics.h(classProto, "classProto");
        Intrinsics.h(nameResolver, "nameResolver");
        Intrinsics.h(sourceElement, "sourceElement");
        this.h = classProto;
        this.i = binaryVersion;
        this.j = sourceElement;
        this.k = NameResolverUtilKt.a(nameResolver, classProto.h);
        this.l = ProtoEnumFlags.a((ProtoBuf.Modality) Flags.e.c(classProto.g));
        this.m = ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) Flags.d.c(classProto.g));
        ProtoBuf.Class.Kind kind = (ProtoBuf.Class.Kind) Flags.f.c(classProto.g);
        switch (kind == null ? -1 : ProtoEnumFlags.WhenMappings.b[kind.ordinal()]) {
            case 1:
                classKind = ClassKind.d;
                break;
            case 2:
                classKind = ClassKind.e;
                break;
            case 3:
                classKind = ClassKind.f;
                break;
            case 4:
                classKind = ClassKind.g;
                break;
            case 5:
                classKind = ClassKind.h;
                break;
            case 6:
            case 7:
                classKind = ClassKind.i;
                break;
            default:
                classKind = ClassKind.d;
                break;
        }
        ClassKind classKind2 = classKind;
        this.n = classKind2;
        List list = classProto.j;
        Intrinsics.g(list, "getTypeParameterList(...)");
        ProtoBuf.TypeTable typeTable2 = classProto.H;
        Intrinsics.g(typeTable2, "getTypeTable(...)");
        TypeTable typeTable3 = new TypeTable(typeTable2);
        VersionRequirementTable versionRequirementTable = VersionRequirementTable.b;
        ProtoBuf.VersionRequirementTable versionRequirementTable2 = classProto.J;
        Intrinsics.g(versionRequirementTable2, "getVersionRequirementTable(...)");
        DeserializationContext deserializationContextA = outerContext.a(this, list, nameResolver, typeTable3, VersionRequirementTable.Companion.a(versionRequirementTable2), binaryVersion);
        DeserializationComponents deserializationComponents = deserializationContextA.f24572a;
        this.o = deserializationContextA;
        boolean zBooleanValue = Flags.m.e(classProto.g).booleanValue();
        ClassKind classKind3 = ClassKind.f;
        if (classKind2 == classKind3) {
            staticScopeForKotlinEnum = new StaticScopeForKotlinEnum(deserializationComponents.f24570a, this, zBooleanValue || Intrinsics.c(deserializationComponents.s.a(), Boolean.TRUE));
        } else {
            staticScopeForKotlinEnum = MemberScope.Empty.b;
        }
        this.p = staticScopeForKotlinEnum;
        this.q = new DeserializedClassTypeConstructor();
        ScopesHolderForClass.Companion companion = ScopesHolderForClass.e;
        LockBasedStorageManager storageManager = deserializationComponents.f24570a;
        LockBasedStorageManager lockBasedStorageManager = deserializationComponents.f24570a;
        KotlinTypeRefiner kotlinTypeRefinerForOwnerModule = deserializationComponents.q.c();
        DeserializedClassDescriptor$memberScopeHolder$1 deserializedClassDescriptor$memberScopeHolder$1 = new DeserializedClassDescriptor$memberScopeHolder$1(1, this, DeserializedClassMemberScope.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
        companion.getClass();
        Intrinsics.h(storageManager, "storageManager");
        Intrinsics.h(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
        this.r = new ScopesHolderForClass(this, storageManager, deserializedClassDescriptor$memberScopeHolder$1, kotlinTypeRefinerForOwnerModule);
        this.s = classKind2 == classKind3 ? new EnumEntryClassDescriptors() : null;
        DeclarationDescriptor declarationDescriptor = outerContext.c;
        this.t = declarationDescriptor;
        this.u = lockBasedStorageManager.e(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$0
            public final DeserializedClassDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object next;
                DeserializedClassDescriptor deserializedClassDescriptor = this.d;
                if (deserializedClassDescriptor.n.a()) {
                    ClassConstructorDescriptorImpl classConstructorDescriptorImplJ = DescriptorFactory.j(deserializedClassDescriptor);
                    classConstructorDescriptorImplJ.Q0(deserializedClassDescriptor.t());
                    return classConstructorDescriptorImplJ;
                }
                List list2 = deserializedClassDescriptor.h.s;
                Intrinsics.g(list2, "getConstructorList(...)");
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (!Flags.n.e(((ProtoBuf.Constructor) next).g).booleanValue()) {
                        break;
                    }
                }
                ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
                if (constructor != null) {
                    return deserializedClassDescriptor.o.i.d(constructor, true);
                }
                return null;
            }
        });
        this.v = lockBasedStorageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$1
            public final DeserializedClassDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor = this.d;
                DeserializationContext deserializationContext = deserializedClassDescriptor.o;
                List list2 = deserializedClassDescriptor.h.s;
                Intrinsics.g(list2, "getConstructorList(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (Flags.n.e(((ProtoBuf.Constructor) obj).g).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) it.next();
                    MemberDeserializer memberDeserializer = deserializationContext.i;
                    Intrinsics.e(constructor);
                    arrayList2.add(memberDeserializer.d(constructor, false));
                }
                return CollectionsKt.c0(deserializationContext.f24572a.n.b(deserializedClassDescriptor), CollectionsKt.c0(CollectionsKt.S(deserializedClassDescriptor.z()), arrayList2));
            }
        });
        this.w = lockBasedStorageManager.e(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$2
            public final DeserializedClassDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor = this.d;
                ProtoBuf.Class r12 = deserializedClassDescriptor.h;
                if ((r12.f & 4) == 4) {
                    ClassifierDescriptor classifierDescriptorF = deserializedClassDescriptor.I0().f(NameResolverUtilKt.b(deserializedClassDescriptor.o.b, r12.i), NoLookupLocation.j);
                    if (classifierDescriptorF instanceof ClassDescriptor) {
                        return (ClassDescriptor) classifierDescriptorF;
                    }
                }
                return null;
            }
        });
        this.x = lockBasedStorageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$3
            public final DeserializedClassDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor = this.d;
                if (deserializedClassDescriptor.l != Modality.f) {
                    return EmptyList.d;
                }
                List<Integer> list2 = deserializedClassDescriptor.h.x;
                Intrinsics.e(list2);
                if (list2.isEmpty()) {
                    return CliSealedClassInheritorsProvider.a(deserializedClassDescriptor);
                }
                ArrayList arrayList = new ArrayList();
                for (Integer num : list2) {
                    DeserializationContext deserializationContext = deserializedClassDescriptor.o;
                    DeserializationComponents deserializationComponents2 = deserializationContext.f24572a;
                    NameResolver nameResolver2 = deserializationContext.b;
                    Intrinsics.e(num);
                    ClassDescriptor classDescriptorB = deserializationComponents2.b(NameResolverUtilKt.a(nameResolver2, num.intValue()));
                    if (classDescriptorB != null) {
                        arrayList.add(classDescriptorB);
                    }
                }
                return arrayList;
            }
        });
        this.y = lockBasedStorageManager.e(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$4
            public final DeserializedClassDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor = this.d;
                if (!deserializedClassDescriptor.isInline() && !deserializedClassDescriptor.w()) {
                    return null;
                }
                ProtoBuf.Class r12 = deserializedClassDescriptor.h;
                DeserializationContext deserializationContext = deserializedClassDescriptor.o;
                ValueClassRepresentation valueClassRepresentationA = ValueClassUtilKt.a(r12, deserializationContext.b, deserializationContext.d, new DeserializedClassDescriptor$computeValueClassRepresentation$1(deserializationContext.h), new DeserializedClassDescriptor$computeValueClassRepresentation$2(deserializedClassDescriptor));
                if (valueClassRepresentationA != null) {
                    return valueClassRepresentationA;
                }
                if (deserializedClassDescriptor.i.a(1, 5, 1)) {
                    return null;
                }
                ClassConstructorDescriptor classConstructorDescriptorZ = deserializedClassDescriptor.z();
                if (classConstructorDescriptorZ == null) {
                    throw new IllegalStateException(("Inline class has no primary constructor: " + deserializedClassDescriptor).toString());
                }
                List listH = classConstructorDescriptorZ.h();
                Intrinsics.g(listH, "getValueParameters(...)");
                Name name = ((ValueParameterDescriptor) CollectionsKt.D(listH)).getName();
                Intrinsics.g(name, "getName(...)");
                SimpleType simpleTypeJ0 = deserializedClassDescriptor.J0(name);
                if (simpleTypeJ0 != null) {
                    return new InlineClassRepresentation(name, simpleTypeJ0);
                }
                throw new IllegalStateException(("Value class has no underlying property: " + deserializedClassDescriptor).toString());
            }
        });
        NameResolver nameResolver2 = deserializationContextA.b;
        TypeTable typeTable4 = deserializationContextA.d;
        DeserializedClassDescriptor deserializedClassDescriptor = declarationDescriptor instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) declarationDescriptor : null;
        if (deserializedClassDescriptor != null) {
            r5 = deserializedClassDescriptor.z;
            typeTable = typeTable4;
            sourceElement2 = sourceElement;
            r1 = classProto;
        } else {
            r5 = null;
            r1 = classProto;
            typeTable = typeTable4;
            sourceElement2 = sourceElement;
        }
        this.z = new ProtoContainer.Class(r1, nameResolver2, typeTable, sourceElement2, r5);
        this.A = !Flags.c.e(r1.g).booleanValue() ? Annotations.Companion.f24350a : new NonEmptyDeserializedAnnotations(lockBasedStorageManager, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$$Lambda$5
            public final DeserializedClassDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor2 = this.d;
                return CollectionsKt.G0(deserializedClassDescriptor2.o.f24572a.e.b(deserializedClassDescriptor2.z));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean G0() {
        return Flags.h.e(this.h.g).booleanValue();
    }

    public final DeserializedClassMemberScope I0() {
        return (DeserializedClassMemberScope) this.r.a(this.o.f24572a.q.c());
    }

    public final SimpleType J0(Name name) {
        Iterator it = I0().b(name, NoLookupLocation.j).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((PropertyDescriptor) next).e0() == null) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
        return (SimpleType) (propertyDescriptor != null ? propertyDescriptor.getType() : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor e() {
        return this.t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassKind f() {
        return this.n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ValueClassRepresentation f0() {
        return (ValueClassRepresentation) this.y.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement g() {
        return this.j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final DescriptorVisibility getVisibility() {
        return this.m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean i() {
        return Flags.g.e(this.h.g).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final List i0() {
        DeserializationContext deserializationContext = this.o;
        List listB = ProtoTypeTableUtilKt.b(this.h, deserializationContext.d);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReceiverParameterDescriptorImpl(U(), new ContextClassReceiver(this, deserializationContext.h.g((ProtoBuf.Type) it.next()), null), Annotations.Companion.f24350a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return Flags.i.e(this.h.g).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        if (!Flags.k.e(this.h.g).booleanValue()) {
            return false;
        }
        BinaryVersion binaryVersion = this.i;
        int i = binaryVersion.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = binaryVersion.c;
            if (i2 >= 4 && (i2 > 4 || binaryVersion.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean j0() {
        return Flags.f.c(this.h.g) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality k() {
        return this.l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean l0() {
        return Flags.l.e(this.h.g).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor m() {
        return this.q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection n() {
        return (Collection) this.v.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection o() {
        return (Collection) this.x.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope o0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.r.a(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean p0() {
        return Flags.j.e(this.h.g).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope q0() {
        return this.p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassDescriptor r0() {
        return (ClassDescriptor) this.w.invoke();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(p0() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List u() {
        return this.o.h.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean w() {
        return Flags.k.e(this.h.g).booleanValue() && this.i.a(1, 4, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassConstructorDescriptor z() {
        return (ClassConstructorDescriptor) this.u.invoke();
    }
}
