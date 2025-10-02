package kotlin.reflect.jvm.internal;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.PackagePartScopeCache;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Data", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KPackageImpl extends KDeclarationContainerImpl {
    public static final /* synthetic */ int g = 0;
    public final Class e;
    public final Object f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public final class Data extends KDeclarationContainerImpl.Data {
        public static final /* synthetic */ KProperty[] g;
        public final ReflectProperties.LazySoftVal c;
        public final ReflectProperties.LazySoftVal d;
        public final Object e;
        public final Object f;

        static {
            PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(Data.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            g = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(Data.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, reflectionFactory), c.t(Data.class, "members", "getMembers()Ljava/util/Collection;", 0, reflectionFactory)};
        }

        public Data(final KPackageImpl kPackageImpl) {
            super(kPackageImpl);
            this.c = ReflectProperties.a(null, new Function0(kPackageImpl) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$0
                public final KPackageImpl d;

                {
                    this.d = kPackageImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KPackageImpl.Data.g;
                    return ReflectKotlinClass.Factory.a(this.d.e);
                }
            });
            this.d = ReflectProperties.a(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$1
                public final KPackageImpl.Data d;

                {
                    this.d = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r6v5 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ?? Q;
                    KProperty[] kPropertyArr = KPackageImpl.Data.g;
                    KPackageImpl.Data data = this.d;
                    ReflectProperties.LazySoftVal lazySoftVal = data.c;
                    KProperty kProperty = KPackageImpl.Data.g[0];
                    ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) lazySoftVal.invoke();
                    if (reflectKotlinClass == null) {
                        return MemberScope.Empty.b;
                    }
                    ReflectProperties.LazySoftVal lazySoftVal2 = data.f24289a;
                    KProperty kProperty2 = KDeclarationContainerImpl.Data.b[0];
                    Object objInvoke = lazySoftVal2.invoke();
                    Intrinsics.g(objInvoke, "getValue(...)");
                    PackagePartScopeCache packagePartScopeCache = ((RuntimeModuleData) objInvoke).b;
                    DeserializedDescriptorResolver deserializedDescriptorResolver = packagePartScopeCache.f24364a;
                    ConcurrentHashMap concurrentHashMap = packagePartScopeCache.c;
                    Class cls = reflectKotlinClass.f24366a;
                    ClassId classIdA = ReflectClassUtilKt.a(cls);
                    Object obj = concurrentHashMap.get(classIdA);
                    if (obj == null) {
                        FqName fqName = ReflectClassUtilKt.a(cls).f24499a;
                        KotlinClassHeader kotlinClassHeader = reflectKotlinClass.b;
                        KotlinClassHeader.Kind kind = kotlinClassHeader.f24478a;
                        KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.k;
                        if (kind == kind2) {
                            String[] strArr = kotlinClassHeader.c;
                            if (kind != kind2) {
                                strArr = null;
                            }
                            List listF = strArr != null ? ArraysKt.f(strArr) : null;
                            if (listF == null) {
                                listF = EmptyList.d;
                            }
                            Q = new ArrayList();
                            Iterator it = listF.iterator();
                            while (it.hasNext()) {
                                ClassId classIdB = ClassId.Companion.b(new FqName(JvmClassName.c((String) it.next()).f24548a.replace('/', JwtParser.SEPARATOR_CHAR)));
                                ReflectKotlinClassFinder reflectKotlinClassFinder = packagePartScopeCache.b;
                                deserializedDescriptorResolver.c().c.getClass();
                                KotlinJvmBinaryClass kotlinJvmBinaryClassA = KotlinClassFinderKt.a(reflectKotlinClassFinder, classIdB, MetadataVersion.g);
                                if (kotlinJvmBinaryClassA != null) {
                                    Q.add(kotlinJvmBinaryClassA);
                                }
                            }
                        } else {
                            Q = CollectionsKt.Q(reflectKotlinClass);
                        }
                        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(deserializedDescriptorResolver.c().b, fqName);
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = ((Iterable) Q).iterator();
                        while (it2.hasNext()) {
                            DeserializedPackageMemberScope deserializedPackageMemberScopeA = deserializedDescriptorResolver.a(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it2.next());
                            if (deserializedPackageMemberScopeA != null) {
                                arrayList.add(deserializedPackageMemberScopeA);
                            }
                        }
                        MemberScope memberScopeA = ChainedMemberScope.Companion.a(CollectionsKt.G0(arrayList), "package " + fqName + " (" + reflectKotlinClass + ')');
                        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(classIdA, memberScopeA);
                        obj = objPutIfAbsent == null ? memberScopeA : objPutIfAbsent;
                    }
                    Intrinsics.g(obj, "getOrPut(...)");
                    return (MemberScope) obj;
                }
            });
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
            this.e = LazyKt.a(lazyThreadSafetyMode, new Function0(this, kPackageImpl) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$2
                public final KPackageImpl.Data d;
                public final KPackageImpl e;

                {
                    this.d = this;
                    this.e = kPackageImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
                @Override // kotlin.jvm.functions.Function0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke() {
                    /*
                        r4 = this;
                        kotlin.reflect.KProperty[] r0 = kotlin.reflect.jvm.internal.KPackageImpl.Data.g
                        kotlin.reflect.jvm.internal.KPackageImpl$Data r0 = r4.d
                        kotlin.reflect.jvm.internal.ReflectProperties$LazySoftVal r0 = r0.c
                        kotlin.reflect.KProperty[] r1 = kotlin.reflect.jvm.internal.KPackageImpl.Data.g
                        r2 = 0
                        r1 = r1[r2]
                        java.lang.Object r0 = r0.invoke()
                        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass r0 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass) r0
                        r1 = 0
                        if (r0 == 0) goto L1f
                        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r0.b
                        java.lang.String r2 = r0.f
                        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = r0.f24478a
                        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.l
                        if (r0 != r3) goto L1f
                        goto L20
                    L1f:
                        r2 = r1
                    L20:
                        if (r2 == 0) goto L3d
                        int r0 = r2.length()
                        if (r0 <= 0) goto L3d
                        kotlin.reflect.jvm.internal.KPackageImpl r0 = r4.e
                        java.lang.Class r0 = r0.e
                        java.lang.ClassLoader r0 = r0.getClassLoader()
                        r1 = 47
                        r3 = 46
                        java.lang.String r1 = kotlin.text.StringsKt.R(r2, r1, r3)
                        java.lang.Class r0 = r0.loadClass(r1)
                        return r0
                    L3d:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$2.invoke():java.lang.Object");
                }
            });
            this.f = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$3
                public final KPackageImpl.Data d;

                {
                    this.d = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws InvalidProtocolBufferException {
                    KProperty[] kPropertyArr = KPackageImpl.Data.g;
                    ReflectProperties.LazySoftVal lazySoftVal = this.d.c;
                    KProperty kProperty = KPackageImpl.Data.g[0];
                    ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) lazySoftVal.invoke();
                    if (reflectKotlinClass == null) {
                        return null;
                    }
                    KotlinClassHeader kotlinClassHeader = reflectKotlinClass.b;
                    String[] strArr = kotlinClassHeader.c;
                    String[] strArr2 = kotlinClassHeader.e;
                    if (strArr == null || strArr2 == null) {
                        return null;
                    }
                    Pair pairH = JvmProtoBufUtil.h(strArr, strArr2);
                    return new Triple((JvmNameResolver) pairH.d, (ProtoBuf.Package) pairH.e, kotlinClassHeader.b);
                }
            });
            ReflectProperties.a(null, new Function0(this, kPackageImpl) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$4
                public final KPackageImpl d;
                public final KPackageImpl.Data e;

                {
                    this.d = kPackageImpl;
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KPackageImpl.Data.g;
                    return this.d.u(this.e.c(), KDeclarationContainerImpl.MemberBelonginess.d);
                }
            });
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final Triple a() {
            return (Triple) this.f.getD();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final Class b() {
            return (Class) this.e.getD();
        }

        public final MemberScope c() {
            KProperty kProperty = g[1];
            Object objInvoke = this.d.invoke();
            Intrinsics.g(objInvoke, "getValue(...)");
            return (MemberScope) objInvoke;
        }
    }

    public KPackageImpl(Class jClass) {
        Intrinsics.h(jClass, "jClass");
        this.e = jClass;
        this.f = LazyKt.a(LazyThreadSafetyMode.d, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$$Lambda$0
            public final KPackageImpl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = KPackageImpl.g;
                return new KPackageImpl.Data(this.d);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection A(Name name) {
        return ((Data) this.f.getD()).c().b(name, NoLookupLocation.e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KPackageImpl) {
            return Intrinsics.c(this.e, ((KPackageImpl) obj).e);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* renamed from: h, reason: from getter */
    public final Class getE() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection r() {
        return EmptyList.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection s(Name name) {
        return ((Data) this.f.getD()).c().e(name, NoLookupLocation.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final PropertyDescriptor t(int i) {
        Triple tripleA = ((Data) this.f.getD()).a();
        if (tripleA == null) {
            return null;
        }
        JvmNameResolver jvmNameResolver = (JvmNameResolver) tripleA.getD();
        ProtoBuf.Package r1 = (ProtoBuf.Package) tripleA.getE();
        MetadataVersion metadataVersion = (MetadataVersion) tripleA.getF();
        GeneratedMessageLite.GeneratedExtension packageLocalVariable = JvmProtoBuf.n;
        Intrinsics.g(packageLocalVariable, "packageLocalVariable");
        ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.b(r1, packageLocalVariable, i);
        if (property == null) {
            return null;
        }
        ProtoBuf.TypeTable typeTable = r1.j;
        Intrinsics.g(typeTable, "getTypeTable(...)");
        return (PropertyDescriptor) UtilKt.f(this.e, property, jvmNameResolver, new TypeTable(typeTable), metadataVersion, KPackageImpl$getLocalProperty$1$1$1.d);
    }

    public final String toString() {
        return "file class " + ReflectClassUtilKt.a(this.e).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Class v() {
        Class clsB = ((Data) this.f.getD()).b();
        return clsB == null ? this.e : clsB;
    }
}
