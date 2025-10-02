package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {
    public static final /* synthetic */ int v = 0;
    public final ClassDescriptor n;
    public final JavaClass o;
    public final boolean p;
    public final NotNullLazyValue q;
    public final NotNullLazyValue r;
    public final NotNullLazyValue s;
    public final NotNullLazyValue t;
    public final MemoizedFunctionToNullable u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(final LazyJavaResolverContext c, ClassDescriptor classDescriptor, JavaClass jClass, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(c, lazyJavaClassMemberScope);
        Intrinsics.h(c, "c");
        Intrinsics.h(jClass, "jClass");
        this.n = classDescriptor;
        this.o = jClass;
        this.p = z;
        StorageManager storageManager = c.f24425a.f24422a;
        this.q = storageManager.d(new Function0(c, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$0
            public final LazyJavaClassMemberScope d;
            public final LazyJavaResolverContext e;

            {
                this.d = this;
                this.e = c;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope] */
            /* JADX WARN: Type inference failed for: r1v19, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope] */
            /* JADX WARN: Type inference failed for: r1v30 */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaClassMemberScope lazyJavaClassMemberScope2;
                Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1;
                Object obj;
                ?? arrayList;
                Object obj2;
                JavaMethod javaMethod;
                ArrayList arrayList2;
                ?? r1;
                Pair pair;
                LazyJavaClassMemberScope lazyJavaClassMemberScope3 = this.d;
                JavaClass javaClass = lazyJavaClassMemberScope3.o;
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaClassMemberScope3.b;
                ClassDescriptor classDescriptor2 = lazyJavaClassMemberScope3.n;
                Collection<JavaConstructor> collectionN = javaClass.n();
                ArrayList arrayList3 = new ArrayList(collectionN.size());
                for (JavaConstructor javaConstructor : collectionN) {
                    LazyJavaAnnotations lazyJavaAnnotationsA = LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaConstructor);
                    JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f24425a;
                    JavaClassConstructorDescriptor javaClassConstructorDescriptorV0 = JavaClassConstructorDescriptor.V0(classDescriptor2, lazyJavaAnnotationsA, false, javaResolverComponents.j.a(javaConstructor));
                    LazyJavaResolverContext lazyJavaResolverContext2 = new LazyJavaResolverContext(javaResolverComponents, new LazyJavaTypeParameterResolver(lazyJavaResolverContext, javaClassConstructorDescriptorV0, javaConstructor, classDescriptor2.u().size()), lazyJavaResolverContext.c);
                    LazyJavaScope.ResolvedValueParameters resolvedValueParametersU = LazyJavaScope.u(lazyJavaResolverContext2, javaClassConstructorDescriptorV0, javaConstructor.h());
                    List listU = classDescriptor2.u();
                    Intrinsics.g(listU, "getDeclaredTypeParameters(...)");
                    List list = listU;
                    ArrayList typeParameters = javaConstructor.getTypeParameters();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.s(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        TypeParameterDescriptor typeParameterDescriptorA = lazyJavaResolverContext2.b.a((JavaTypeParameter) it.next());
                        Intrinsics.e(typeParameterDescriptorA);
                        arrayList4.add(typeParameterDescriptorA);
                    }
                    javaClassConstructorDescriptorV0.U0(resolvedValueParametersU.f24437a, UtilsKt.d(javaConstructor.getVisibility()), CollectionsKt.c0(arrayList4, list));
                    javaClassConstructorDescriptorV0.O0(false);
                    javaClassConstructorDescriptorV0.P0(resolvedValueParametersU.b);
                    javaClassConstructorDescriptorV0.Q0(classDescriptor2.t());
                    lazyJavaResolverContext2.f24425a.g.getClass();
                    arrayList3.add(javaClassConstructorDescriptorV0);
                }
                boolean zV = javaClass.v();
                LazyJavaResolverContext lazyJavaResolverContext3 = this.e;
                Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$12 = Annotations.Companion.f24350a;
                if (zV) {
                    JavaClassConstructorDescriptor javaClassConstructorDescriptorV02 = JavaClassConstructorDescriptor.V0(classDescriptor2, annotations$Companion$EMPTY$12, true, lazyJavaResolverContext.f24425a.j.a(javaClass));
                    ArrayList<JavaRecordComponent> arrayListS = javaClass.s();
                    ArrayList arrayList5 = new ArrayList(arrayListS.size());
                    JavaTypeAttributes javaTypeAttributesA = JavaTypeAttributesKt.a(TypeUsage.e, false, null, 6);
                    int i = 0;
                    for (JavaRecordComponent javaRecordComponent : arrayListS) {
                        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$13 = annotations$Companion$EMPTY$12;
                        arrayList5.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptorV02, null, i, annotations$Companion$EMPTY$13, javaRecordComponent.getName(), lazyJavaResolverContext.d.d(javaRecordComponent.getType(), javaTypeAttributesA), false, false, false, null, lazyJavaResolverContext.f24425a.j.a(javaRecordComponent)));
                        annotations$Companion$EMPTY$12 = annotations$Companion$EMPTY$13;
                        i++;
                        lazyJavaClassMemberScope3 = lazyJavaClassMemberScope3;
                    }
                    lazyJavaClassMemberScope2 = lazyJavaClassMemberScope3;
                    annotations$Companion$EMPTY$1 = annotations$Companion$EMPTY$12;
                    obj = null;
                    javaClassConstructorDescriptorV02.P0(false);
                    DescriptorVisibility PROTECTED_AND_PACKAGE = classDescriptor2.getVisibility();
                    Intrinsics.g(PROTECTED_AND_PACKAGE, "getVisibility(...)");
                    if (PROTECTED_AND_PACKAGE.equals(JavaDescriptorVisibilities.b)) {
                        PROTECTED_AND_PACKAGE = JavaDescriptorVisibilities.c;
                        Intrinsics.g(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                    }
                    javaClassConstructorDescriptorV02.T0(arrayList5, PROTECTED_AND_PACKAGE);
                    javaClassConstructorDescriptorV02.O0(false);
                    javaClassConstructorDescriptorV02.Q0(classDescriptor2.t());
                    String strA = MethodSignatureMappingKt.a(javaClassConstructorDescriptorV02, 2);
                    if (arrayList3.isEmpty()) {
                        arrayList3.add(javaClassConstructorDescriptorV02);
                        lazyJavaResolverContext3.f24425a.g.getClass();
                    } else {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.c(MethodSignatureMappingKt.a((ClassConstructorDescriptor) it2.next(), 2), strA)) {
                                break;
                            }
                        }
                        arrayList3.add(javaClassConstructorDescriptorV02);
                        lazyJavaResolverContext3.f24425a.g.getClass();
                    }
                } else {
                    lazyJavaClassMemberScope2 = lazyJavaClassMemberScope3;
                    annotations$Companion$EMPTY$1 = annotations$Companion$EMPTY$12;
                    obj = null;
                }
                lazyJavaResolverContext3.f24425a.x.c(classDescriptor2, arrayList3, lazyJavaResolverContext3);
                SignatureEnhancement signatureEnhancement = lazyJavaResolverContext3.f24425a.r;
                boolean zIsEmpty = arrayList3.isEmpty();
                Collection collectionS = arrayList3;
                if (zIsEmpty) {
                    boolean zI = javaClass.i();
                    javaClass.E();
                    if (zI) {
                        JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContext.f24425a;
                        JavaTypeResolver javaTypeResolver = lazyJavaResolverContext.d;
                        ?? V0 = JavaClassConstructorDescriptor.V0(classDescriptor2, annotations$Companion$EMPTY$1, true, javaResolverComponents2.j.a(javaClass));
                        if (zI) {
                            Collection collectionM = javaClass.m();
                            arrayList = new ArrayList(collectionM.size());
                            JavaTypeAttributes javaTypeAttributesA2 = JavaTypeAttributesKt.a(TypeUsage.e, true, null, 6);
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj3 : collectionM) {
                                if (Intrinsics.c(((JavaMethod) obj3).getName(), JvmAnnotationNames.b)) {
                                    arrayList6.add(obj3);
                                } else {
                                    arrayList7.add(obj3);
                                }
                            }
                            arrayList6.size();
                            JavaMethod javaMethod2 = (JavaMethod) CollectionsKt.F(arrayList6);
                            if (javaMethod2 != null) {
                                JavaType javaTypeB = javaMethod2.B();
                                if (javaTypeB instanceof JavaArrayType) {
                                    JavaArrayType javaArrayType = (JavaArrayType) javaTypeB;
                                    pair = new Pair(javaTypeResolver.c(javaArrayType, javaTypeAttributesA2, true), javaTypeResolver.d(javaArrayType.A(), javaTypeAttributesA2));
                                } else {
                                    pair = new Pair(javaTypeResolver.d(javaTypeB, javaTypeAttributesA2), null);
                                }
                                javaMethod = javaMethod2;
                                arrayList2 = arrayList7;
                                ?? r12 = lazyJavaClassMemberScope2;
                                r12.v(arrayList, V0, 0, javaMethod, (KotlinType) pair.d, (KotlinType) pair.e);
                                r1 = r12;
                            } else {
                                javaMethod = javaMethod2;
                                arrayList2 = arrayList7;
                                r1 = lazyJavaClassMemberScope2;
                            }
                            int i2 = javaMethod != null ? 1 : 0;
                            Iterator it3 = arrayList2.iterator();
                            int i3 = 0;
                            while (it3.hasNext()) {
                                JavaMethod javaMethod3 = (JavaMethod) it3.next();
                                r1.v(arrayList, V0, i3 + i2, javaMethod3, javaTypeResolver.d(javaMethod3.B(), javaTypeAttributesA2), null);
                                i3++;
                            }
                        } else {
                            arrayList = Collections.EMPTY_LIST;
                        }
                        V0.P0(false);
                        DescriptorVisibility PROTECTED_AND_PACKAGE2 = classDescriptor2.getVisibility();
                        Intrinsics.g(PROTECTED_AND_PACKAGE2, "getVisibility(...)");
                        if (PROTECTED_AND_PACKAGE2.equals(JavaDescriptorVisibilities.b)) {
                            PROTECTED_AND_PACKAGE2 = JavaDescriptorVisibilities.c;
                            Intrinsics.g(PROTECTED_AND_PACKAGE2, "PROTECTED_AND_PACKAGE");
                        }
                        V0.T0(arrayList, PROTECTED_AND_PACKAGE2);
                        V0.O0(true);
                        V0.Q0(classDescriptor2.t());
                        lazyJavaResolverContext.f24425a.g.getClass();
                        obj2 = V0;
                    } else {
                        obj2 = obj;
                    }
                    collectionS = CollectionsKt.S(obj2);
                }
                return CollectionsKt.G0(signatureEnhancement.c(lazyJavaResolverContext3, collectionS));
            }
        });
        this.r = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$1
            public final LazyJavaClassMemberScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectionsKt.L0(this.d.o.l());
            }
        });
        this.s = storageManager.d(new Function0(c, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$2
            public final LazyJavaResolverContext d;
            public final LazyJavaClassMemberScope e;

            {
                this.d = c;
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = LazyJavaClassMemberScope.v;
                LazyJavaResolverContext lazyJavaResolverContext = this.d;
                return CollectionsKt.L0(lazyJavaResolverContext.f24425a.x.e(this.e.n, lazyJavaResolverContext));
            }
        });
        this.t = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$3
            public final LazyJavaClassMemberScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Collection collectionZ = this.d.o.z();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionZ) {
                    if (((JavaField) obj).D()) {
                        arrayList.add(obj);
                    }
                }
                int iH = MapsKt.h(CollectionsKt.s(arrayList, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((JavaField) next).getName(), next);
                }
                return linkedHashMap;
            }
        });
        this.u = storageManager.b(new Function1(c, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$4
            public final LazyJavaClassMemberScope d;
            public final LazyJavaResolverContext e;

            {
                this.d = this;
                this.e = c;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name name = (Name) obj;
                int i = LazyJavaClassMemberScope.v;
                Intrinsics.h(name, "name");
                final LazyJavaClassMemberScope lazyJavaClassMemberScope2 = this.d;
                NotNullLazyValue notNullLazyValue = lazyJavaClassMemberScope2.r;
                ClassDescriptor classDescriptor2 = lazyJavaClassMemberScope2.n;
                boolean zContains = ((Set) notNullLazyValue.invoke()).contains(name);
                LazyJavaResolverContext lazyJavaResolverContext = this.e;
                if (zContains) {
                    JavaClassFinder javaClassFinder = lazyJavaResolverContext.f24425a.b;
                    ClassId classIdF = DescriptorUtilsKt.f(classDescriptor2);
                    Intrinsics.e(classIdF);
                    ReflectJavaClass reflectJavaClassC = javaClassFinder.c(new JavaClassFinder.Request(classIdF.d(name), lazyJavaClassMemberScope2.o, 2));
                    if (reflectJavaClassC != null) {
                        LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, classDescriptor2, reflectJavaClassC, null);
                        lazyJavaResolverContext.f24425a.s.a(lazyJavaClassDescriptor);
                        return lazyJavaClassDescriptor;
                    }
                } else if (((Set) lazyJavaClassMemberScope2.s.invoke()).contains(name)) {
                    ListBuilder listBuilderV = CollectionsKt.v();
                    lazyJavaResolverContext.f24425a.x.d(classDescriptor2, name, listBuilderV, lazyJavaResolverContext);
                    ListBuilder listBuilderQ = CollectionsKt.q(listBuilderV);
                    int e = listBuilderQ.getE();
                    if (e != 0) {
                        if (e == 1) {
                            return (ClassDescriptor) CollectionsKt.n0(listBuilderQ);
                        }
                        throw new IllegalStateException(("Multiple classes with same name are generated: " + listBuilderQ).toString());
                    }
                } else {
                    JavaField javaField = (JavaField) ((Map) lazyJavaClassMemberScope2.t.invoke()).get(name);
                    if (javaField != null) {
                        JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f24425a;
                        return EnumEntrySyntheticClassDescriptor.I0(javaResolverComponents.f24422a, lazyJavaClassMemberScope2.n, name, javaResolverComponents.f24422a.d(new Function0(lazyJavaClassMemberScope2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$9
                            public final LazyJavaClassMemberScope d;

                            {
                                this.d = lazyJavaClassMemberScope2;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i2 = LazyJavaClassMemberScope.v;
                                LazyJavaClassMemberScope lazyJavaClassMemberScope3 = this.d;
                                return SetsKt.g(lazyJavaClassMemberScope3.a(), lazyJavaClassMemberScope3.c());
                            }
                        }), LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaField), javaResolverComponents.j.a(javaField));
                    }
                }
                return null;
            }
        });
    }

    public static SimpleFunctionDescriptor A(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return simpleFunctionDescriptor;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (!simpleFunctionDescriptor.equals(simpleFunctionDescriptor2) && simpleFunctionDescriptor2.w0() == null && D(simpleFunctionDescriptor2, functionDescriptor)) {
                FunctionDescriptor functionDescriptorBuild = simpleFunctionDescriptor.S().c().build();
                Intrinsics.e(functionDescriptorBuild);
                return (SimpleFunctionDescriptor) functionDescriptorBuild;
            }
        }
        return simpleFunctionDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor B(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r5) {
        /*
            java.util.List r0 = r5.h()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.P(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r0
            r2 = 0
            if (r0 == 0) goto L7a
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r3 = r3.J0()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r3 = r3.c()
            if (r3 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.h(r3)
            boolean r4 = r3.d()
            if (r4 == 0) goto L2b
            goto L2c
        L2b:
            r3 = r2
        L2c:
            if (r3 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = r3.g()
            goto L34
        L33:
            r3 = r2
        L34:
            kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.g
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r4)
            if (r3 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 != 0) goto L41
            goto L7a
        L41:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r2 = r5.S()
            java.util.List r5 = r5.h()
            kotlin.jvm.internal.Intrinsics.g(r5, r1)
            java.util.List r5 = kotlin.collections.CollectionsKt.y(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r5 = r2.j(r5)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            java.util.List r0 = r0.H0()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r0 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r0
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r5 = r5.g(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r5 = r5.build()
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r5
            r0 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl) r0
            if (r0 == 0) goto L79
            r1 = 1
            r0.y = r1
        L79:
            return r5
        L7a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.B(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor):kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor");
    }

    public static boolean D(FunctionDescriptor functionDescriptor, FunctionDescriptor functionDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result resultC = OverridingUtil.c.n(functionDescriptor2, functionDescriptor, true).c();
        Intrinsics.g(resultC, "getResult(...)");
        return resultC == OverridingUtil.OverrideCompatibilityInfo.Result.d && !JavaIncompatibilityRulesOverridabilityCondition.Companion.a(functionDescriptor2, functionDescriptor);
    }

    public static boolean E(SimpleFunctionDescriptor simpleFunctionDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor2) {
        int i = BuiltinMethodsWithDifferentJvmName.l;
        Intrinsics.h(simpleFunctionDescriptor, "<this>");
        FunctionDescriptor functionDescriptorA = simpleFunctionDescriptor2;
        if (Intrinsics.c(simpleFunctionDescriptor.getName().b(), "removeAt")) {
            functionDescriptorA = simpleFunctionDescriptor2;
            if (Intrinsics.c(MethodSignatureMappingKt.b(simpleFunctionDescriptor), SpecialGenericSignatures.g.e)) {
                functionDescriptorA = simpleFunctionDescriptor2.H0();
            }
        }
        Intrinsics.e(functionDescriptorA);
        return D(functionDescriptorA, simpleFunctionDescriptor);
    }

    public static SimpleFunctionDescriptor F(PropertyDescriptor propertyDescriptor, String str, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Iterator it = ((Iterable) function1.invoke(Name.e(str))).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.h().size() == 0) {
                NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = KotlinTypeChecker.f24623a;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null ? false : newKotlinTypeCheckerImpl.d(returnType, propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    public static SimpleFunctionDescriptor H(PropertyDescriptor propertyDescriptor, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        String strB = propertyDescriptor.getName().b();
        Intrinsics.g(strB, "asString(...)");
        Iterator it = ((Iterable) function1.invoke(Name.e(JvmAbi.b(strB)))).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.h().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null) {
                Name name = KotlinBuiltIns.f;
                if (KotlinBuiltIns.E(returnType, StandardNames.FqNames.d)) {
                    NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = KotlinTypeChecker.f24623a;
                    List listH = simpleFunctionDescriptor2.h();
                    Intrinsics.g(listH, "getValueParameters(...)");
                    if (newKotlinTypeCheckerImpl.a(((ValueParameterDescriptor) CollectionsKt.n0(listH)).getType(), propertyDescriptor.getType())) {
                        simpleFunctionDescriptor = simpleFunctionDescriptor2;
                    }
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    public static boolean K(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String strA = MethodSignatureMappingKt.a(simpleFunctionDescriptor, 2);
        FunctionDescriptor functionDescriptorA = functionDescriptor.H0();
        Intrinsics.g(functionDescriptorA, "getOriginal(...)");
        return Intrinsics.c(strA, MethodSignatureMappingKt.a(functionDescriptorA, 2)) && !D(simpleFunctionDescriptor, functionDescriptor);
    }

    public final boolean C(PropertyDescriptor propertyDescriptor, Function1 function1) {
        if (JavaDescriptorUtilKt.a(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorG = G(propertyDescriptor, function1);
        SimpleFunctionDescriptor simpleFunctionDescriptorH = H(propertyDescriptor, function1);
        if (simpleFunctionDescriptorG == null) {
            return false;
        }
        if (propertyDescriptor.C()) {
            return simpleFunctionDescriptorH != null && simpleFunctionDescriptorH.k() == simpleFunctionDescriptorG.k();
        }
        return true;
    }

    public final SimpleFunctionDescriptor G(PropertyDescriptor propertyDescriptor, Function1 function1) {
        PropertyGetterDescriptorImpl getter = propertyDescriptor.getGetter();
        PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.b(getter) : null;
        String strA = propertyGetterDescriptor != null ? ClassicBuiltinSpecialProperties.a(propertyGetterDescriptor) : null;
        if (strA != null && !SpecialBuiltinMembers.d(this.n, propertyGetterDescriptor)) {
            return F(propertyDescriptor, strA, function1);
        }
        String strB = propertyDescriptor.getName().b();
        Intrinsics.g(strB, "asString(...)");
        return F(propertyDescriptor, JvmAbi.a(strB), function1);
    }

    public final LinkedHashSet I(Name name) {
        Collection collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((KotlinType) it.next()).s().e(name, NoLookupLocation.h), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set J(Name name) {
        Collection collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionB = ((KotlinType) it.next()).s().b(name, NoLookupLocation.h);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(collectionB, 10));
            Iterator it2 = collectionB.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PropertyDescriptor) it2.next());
            }
            CollectionsKt.h(arrayList2, arrayList);
        }
        return CollectionsKt.L0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cf A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L(final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r11) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.L(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor):boolean");
    }

    public final void M(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.a(this.b.f24425a.n, location, this.n, name);
    }

    public final ArrayList N(Name name) {
        Collection collectionE = ((DeclaredMemberIndex) this.e.invoke()).e(name);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(collectionE, 10));
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(t((JavaMethod) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(Name name) {
        LinkedHashSet linkedHashSetI = I(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            Intrinsics.h(simpleFunctionDescriptor, "<this>");
            if (SpecialBuiltinMembers.b(simpleFunctionDescriptor) == null && BuiltinMethodsWithSpecialGenericSignature.a(simpleFunctionDescriptor) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        M(name, noLookupLocation);
        return super.b(name, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection e(Name name, LookupLocation lookupLocation) {
        Intrinsics.h(name, "name");
        M(name, lookupLocation);
        return super.e(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        MemoizedFunctionToNullable memoizedFunctionToNullable;
        ClassDescriptor classDescriptor;
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        M(name, location);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) this.c;
        return (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.u) == null || (classDescriptor = (ClassDescriptor) memoizedFunctionToNullable.invoke(name)) == null) ? (ClassifierDescriptor) this.u.invoke(name) : classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set h(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        return SetsKt.g((Set) this.r.invoke(), ((Map) this.t.invoke()).keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set i(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        ClassDescriptor classDescriptor = this.n;
        Collection collectionA = classDescriptor.m().a();
        Intrinsics.g(collectionA, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((KotlinType) it.next()).s().a(), linkedHashSet);
        }
        NotNullLazyValue notNullLazyValue = this.e;
        linkedHashSet.addAll(((DeclaredMemberIndex) notNullLazyValue.invoke()).a());
        linkedHashSet.addAll(((DeclaredMemberIndex) notNullLazyValue.invoke()).b());
        linkedHashSet.addAll(h(kindFilter, function1));
        LazyJavaResolverContext lazyJavaResolverContext = this.b;
        linkedHashSet.addAll(lazyJavaResolverContext.f24425a.x.f(classDescriptor, lazyJavaResolverContext));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void j(ArrayList arrayList, Name name) {
        Intrinsics.h(name, "name");
        boolean zV = this.o.v();
        ClassDescriptor classDescriptor = this.n;
        LazyJavaResolverContext lazyJavaResolverContext = this.b;
        if (zV) {
            NotNullLazyValue notNullLazyValue = this.e;
            if (((DeclaredMemberIndex) notNullLazyValue.invoke()).f(name) != null) {
                if (arrayList.isEmpty()) {
                    JavaRecordComponent javaRecordComponentF = ((DeclaredMemberIndex) notNullLazyValue.invoke()).f(name);
                    Intrinsics.e(javaRecordComponentF);
                    LazyJavaAnnotations lazyJavaAnnotationsA = LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaRecordComponentF);
                    JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f24425a;
                    JavaMethodDescriptor javaMethodDescriptorW0 = JavaMethodDescriptor.W0(classDescriptor, lazyJavaAnnotationsA, javaRecordComponentF.getName(), javaResolverComponents.j.a(javaRecordComponentF), true);
                    KotlinType kotlinTypeD = lazyJavaResolverContext.d.d(javaRecordComponentF.getType(), JavaTypeAttributesKt.a(TypeUsage.e, false, null, 6));
                    ReceiverParameterDescriptor receiverParameterDescriptorP = p();
                    Modality.d.getClass();
                    Modality modality = Modality.g;
                    DescriptorVisibility descriptorVisibility = DescriptorVisibilities.e;
                    EmptyList emptyList = EmptyList.d;
                    javaMethodDescriptorW0.V0(null, receiverParameterDescriptorP, emptyList, emptyList, emptyList, kotlinTypeD, modality, descriptorVisibility, null);
                    javaMethodDescriptorW0.X0(false, false);
                    javaResolverComponents.g.getClass();
                    arrayList.add(javaMethodDescriptorW0);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((SimpleFunctionDescriptor) it.next()).h().isEmpty()) {
                            break;
                        }
                    }
                    JavaRecordComponent javaRecordComponentF2 = ((DeclaredMemberIndex) notNullLazyValue.invoke()).f(name);
                    Intrinsics.e(javaRecordComponentF2);
                    LazyJavaAnnotations lazyJavaAnnotationsA2 = LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaRecordComponentF2);
                    JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContext.f24425a;
                    JavaMethodDescriptor javaMethodDescriptorW02 = JavaMethodDescriptor.W0(classDescriptor, lazyJavaAnnotationsA2, javaRecordComponentF2.getName(), javaResolverComponents2.j.a(javaRecordComponentF2), true);
                    KotlinType kotlinTypeD2 = lazyJavaResolverContext.d.d(javaRecordComponentF2.getType(), JavaTypeAttributesKt.a(TypeUsage.e, false, null, 6));
                    ReceiverParameterDescriptor receiverParameterDescriptorP2 = p();
                    Modality.d.getClass();
                    Modality modality2 = Modality.g;
                    DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.e;
                    EmptyList emptyList2 = EmptyList.d;
                    javaMethodDescriptorW02.V0(null, receiverParameterDescriptorP2, emptyList2, emptyList2, emptyList2, kotlinTypeD2, modality2, descriptorVisibility2, null);
                    javaMethodDescriptorW02.X0(false, false);
                    javaResolverComponents2.g.getClass();
                    arrayList.add(javaMethodDescriptorW02);
                }
            }
        }
        lazyJavaResolverContext.f24425a.x.g(classDescriptor, name, arrayList, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclaredMemberIndex k() {
        return new ClassDeclaredMemberIndex(this.o, LazyJavaClassMemberScope$$Lambda$5.d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void m(LinkedHashSet linkedHashSet, Name name) {
        Intrinsics.h(name, "name");
        LinkedHashSet linkedHashSetI = I(name);
        ArrayList arrayList = SpecialGenericSignatures.f24412a;
        if (!SpecialGenericSignatures.Companion.b(name) && !BuiltinMethodsWithSpecialGenericSignature.b(name)) {
            if (!linkedHashSetI.isEmpty()) {
                Iterator it = linkedHashSetI.iterator();
                while (it.hasNext()) {
                    if (((FunctionDescriptor) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI) {
                if (L((SimpleFunctionDescriptor) obj)) {
                    arrayList2.add(obj);
                }
            }
            w(linkedHashSet, name, arrayList2, false);
            return;
        }
        int i = SmartSet.f;
        SmartSet smartSetA = SmartSet.Companion.a();
        LinkedHashSet linkedHashSetD = DescriptorResolverUtils.d(name, linkedHashSetI, EmptyList.d, this.n, ErrorReporter.f24575a, this.b.f24425a.u.b());
        x(name, linkedHashSet, linkedHashSetD, linkedHashSet, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(1, this, LazyJavaClassMemberScope.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0));
        x(name, linkedHashSet, linkedHashSetD, smartSetA, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(1, this, LazyJavaClassMemberScope.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((SimpleFunctionDescriptor) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(linkedHashSet, name, CollectionsKt.c0(smartSetA, arrayList3), true);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void n(ArrayList arrayList, Name name) {
        JavaMethod javaMethod;
        Intrinsics.h(name, "name");
        boolean zI = this.o.i();
        LazyJavaResolverContext lazyJavaResolverContext = this.b;
        if (zI && (javaMethod = (JavaMethod) CollectionsKt.o0(((DeclaredMemberIndex) this.e.invoke()).e(name))) != null) {
            Modality.Companion companion = Modality.d;
            JavaPropertyDescriptor javaPropertyDescriptorP0 = JavaPropertyDescriptor.P0(this.n, LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaMethod), UtilsKt.d(javaMethod.getVisibility()), false, javaMethod.getName(), lazyJavaResolverContext.f24425a.j.a(javaMethod), false);
            PropertyGetterDescriptorImpl propertyGetterDescriptorImplC = DescriptorFactory.c(javaPropertyDescriptorP0, Annotations.Companion.f24350a);
            javaPropertyDescriptorP0.M0(propertyGetterDescriptorImplC, null, null, null);
            Intrinsics.h(lazyJavaResolverContext, "<this>");
            KotlinType kotlinTypeL = LazyJavaScope.l(javaMethod, new LazyJavaResolverContext(lazyJavaResolverContext.f24425a, new LazyJavaTypeParameterResolver(lazyJavaResolverContext, javaPropertyDescriptorP0, javaMethod, 0), lazyJavaResolverContext.c));
            ReceiverParameterDescriptor receiverParameterDescriptorP = p();
            EmptyList emptyList = EmptyList.d;
            javaPropertyDescriptorP0.O0(kotlinTypeL, emptyList, receiverParameterDescriptorP, null, emptyList);
            propertyGetterDescriptorImplC.p = kotlinTypeL;
            arrayList.add(javaPropertyDescriptorP0);
        }
        Set setJ = J(name);
        if (setJ.isEmpty()) {
            return;
        }
        int i = SmartSet.f;
        SmartSet smartSetA = SmartSet.Companion.a();
        SmartSet smartSetA2 = SmartSet.Companion.a();
        y(setJ, arrayList, smartSetA, new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$7
            public final LazyJavaClassMemberScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name it = (Name) obj;
                int i2 = LazyJavaClassMemberScope.v;
                Intrinsics.h(it, "it");
                return this.d.N(it);
            }
        });
        y(SetsKt.e(setJ, smartSetA), smartSetA2, null, new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$8
            public final LazyJavaClassMemberScope d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name it = (Name) obj;
                int i2 = LazyJavaClassMemberScope.v;
                Intrinsics.h(it, "it");
                return this.d.O(it);
            }
        });
        LinkedHashSet linkedHashSetG = SetsKt.g(setJ, smartSetA2);
        JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f24425a;
        arrayList.addAll(DescriptorResolverUtils.d(name, linkedHashSetG, arrayList, this.n, javaResolverComponents.f, javaResolverComponents.u.b()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set o(DescriptorKindFilter kindFilter) {
        Intrinsics.h(kindFilter, "kindFilter");
        if (this.o.i()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((DeclaredMemberIndex) this.e.invoke()).d());
        Collection collectionA = this.n.m().a();
        Intrinsics.g(collectionA, "getSupertypes(...)");
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(((KotlinType) it.next()).s().c(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final ReceiverParameterDescriptor p() {
        ClassDescriptor classDescriptor = this.n;
        if (classDescriptor != null) {
            int i = DescriptorUtils.f24530a;
            return classDescriptor.U();
        }
        DescriptorUtils.a(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclarationDescriptor q() {
        return this.n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final boolean r(JavaMethodDescriptor javaMethodDescriptor) {
        if (this.o.i()) {
            return false;
        }
        return L(javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final LazyJavaScope.MethodSignatureData s(JavaMethod method, ArrayList arrayList, KotlinType kotlinType, List valueParameters) {
        Intrinsics.h(method, "method");
        Intrinsics.h(valueParameters, "valueParameters");
        SignaturePropagator.PropagatedSignature propagatedSignatureA = this.b.f24425a.e.a(method, this.n, kotlinType, valueParameters, arrayList);
        KotlinType kotlinType2 = propagatedSignatureA.f24421a;
        List list = propagatedSignatureA.b;
        if (list == null) {
            SignaturePropagator.PropagatedSignature.a(5);
            throw null;
        }
        ArrayList arrayList2 = propagatedSignatureA.c;
        List list2 = Collections.EMPTY_LIST;
        if (list2 != null) {
            return new LazyJavaScope.MethodSignatureData(kotlinType2, list, arrayList2, list2);
        }
        SignaturePropagator.PropagatedSignature.a(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final String toString() {
        return "Lazy Java member scope for " + this.o.d();
    }

    public final void v(ArrayList arrayList, JavaClassConstructorDescriptor javaClassConstructorDescriptor, int i, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Name name = javaMethod.getName();
        if (kotlinType == null) {
            TypeUtils.a(2);
            throw null;
        }
        UnwrappedType unwrappedTypeH = TypeUtils.h(kotlinType, false);
        boolean zG = javaMethod.G();
        UnwrappedType unwrappedTypeH2 = kotlinType2 != null ? TypeUtils.h(kotlinType2, false) : null;
        arrayList.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptor, null, i, Annotations.Companion.f24350a, name, unwrappedTypeH, zG, false, false, unwrappedTypeH2, this.b.f24425a.j.a(javaMethod)));
    }

    public final void w(LinkedHashSet linkedHashSet, Name name, ArrayList arrayList, boolean z) {
        JavaResolverComponents javaResolverComponents = this.b.f24425a;
        LinkedHashSet<SimpleFunctionDescriptor> linkedHashSetD = DescriptorResolverUtils.d(name, arrayList, linkedHashSet, this.n, javaResolverComponents.f, javaResolverComponents.u.b());
        if (!z) {
            linkedHashSet.addAll(linkedHashSetD);
            return;
        }
        ArrayList arrayListC0 = CollectionsKt.c0(linkedHashSetD, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(linkedHashSetD, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptorA : linkedHashSetD) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.c(simpleFunctionDescriptorA);
            if (simpleFunctionDescriptor != null) {
                simpleFunctionDescriptorA = A(simpleFunctionDescriptorA, simpleFunctionDescriptor, arrayListC0);
            }
            arrayList2.add(simpleFunctionDescriptorA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(kotlin.reflect.jvm.internal.impl.name.Name r11, java.util.LinkedHashSet r12, java.util.LinkedHashSet r13, java.util.AbstractSet r14, kotlin.jvm.functions.Function1 r15) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.x(kotlin.reflect.jvm.internal.impl.name.Name, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, kotlin.jvm.functions.Function1):void");
    }

    public final void y(Set set, AbstractCollection abstractCollection, SmartSet smartSet, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptorH;
        PropertySetterDescriptorImpl propertySetterDescriptorImplK;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) it.next();
            JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = null;
            if (C(propertyDescriptor, function1)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorG = G(propertyDescriptor, function1);
                Intrinsics.e(simpleFunctionDescriptorG);
                if (propertyDescriptor.C()) {
                    simpleFunctionDescriptorH = H(propertyDescriptor, function1);
                    Intrinsics.e(simpleFunctionDescriptorH);
                } else {
                    simpleFunctionDescriptorH = null;
                }
                if (simpleFunctionDescriptorH != null) {
                    simpleFunctionDescriptorH.k();
                    simpleFunctionDescriptorG.k();
                }
                JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor2 = new JavaForKotlinOverridePropertyDescriptor(this.n, simpleFunctionDescriptorG, simpleFunctionDescriptorH, propertyDescriptor);
                KotlinType returnType = simpleFunctionDescriptorG.getReturnType();
                Intrinsics.e(returnType);
                ReceiverParameterDescriptor receiverParameterDescriptorP = p();
                EmptyList emptyList = EmptyList.d;
                javaForKotlinOverridePropertyDescriptor2.O0(returnType, emptyList, receiverParameterDescriptorP, null, emptyList);
                PropertyGetterDescriptorImpl propertyGetterDescriptorImplI = DescriptorFactory.i(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorG.getAnnotations(), false, simpleFunctionDescriptorG.g());
                propertyGetterDescriptorImplI.o = simpleFunctionDescriptorG;
                propertyGetterDescriptorImplI.M0(javaForKotlinOverridePropertyDescriptor2.getType());
                if (simpleFunctionDescriptorH != null) {
                    List listH = simpleFunctionDescriptorH.h();
                    Intrinsics.g(listH, "getValueParameters(...)");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.F(listH);
                    if (valueParameterDescriptor == null) {
                        throw new AssertionError("No parameter found for " + simpleFunctionDescriptorH);
                    }
                    propertySetterDescriptorImplK = DescriptorFactory.k(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorH.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, simpleFunctionDescriptorH.getVisibility(), simpleFunctionDescriptorH.g());
                    propertySetterDescriptorImplK.o = simpleFunctionDescriptorH;
                } else {
                    propertySetterDescriptorImplK = null;
                }
                javaForKotlinOverridePropertyDescriptor2.M0(propertyGetterDescriptorImplI, propertySetterDescriptorImplK, null, null);
                javaForKotlinOverridePropertyDescriptor = javaForKotlinOverridePropertyDescriptor2;
            }
            if (javaForKotlinOverridePropertyDescriptor != null) {
                abstractCollection.add(javaForKotlinOverridePropertyDescriptor);
                if (smartSet != null) {
                    smartSet.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z = this.p;
        ClassDescriptor classDescriptor = this.n;
        if (!z) {
            return this.b.f24425a.u.c().e(classDescriptor);
        }
        Collection collectionA = classDescriptor.m().a();
        Intrinsics.g(collectionA, "getSupertypes(...)");
        return collectionA;
    }
}
