package kotlin.reflect.jvm.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.RepeatableContainer;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001an\u0010\u0016\u001a\u00028\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0005\"\b\b\u0001\u0010\b*\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u001d\u0010\u0015\u001a\u0019\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0002\b\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "D", "Ljava/lang/Class;", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class UtilKt {

    /* renamed from: a, reason: collision with root package name */
    public static final FqName f24294a = new FqName("kotlin.jvm.JvmStatic");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24295a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f24295a = iArr;
        }
    }

    public static final KCallableImpl a(KCallable kCallable) {
        KCallableImpl kCallableImpl = kCallable instanceof KCallableImpl ? (KCallableImpl) kCallable : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl kFunctionImplB = b(kCallable);
        return kFunctionImplB != null ? kFunctionImplB : c(kCallable);
    }

    public static final KFunctionImpl b(Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
        KCallable kCallableCompute = functionReference != null ? functionReference.compute() : null;
        if (kCallableCompute instanceof KFunctionImpl) {
            return (KFunctionImpl) kCallableCompute;
        }
        return null;
    }

    public static final KPropertyImpl c(Object obj) {
        KPropertyImpl kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
        KCallable kCallableCompute = propertyReference != null ? propertyReference.compute() : null;
        if (kCallableCompute instanceof KPropertyImpl) {
            return (KPropertyImpl) kCallableCompute;
        }
        return null;
    }

    public static final ArrayList d(Annotated annotated) throws IllegalAccessException, IllegalArgumentException, NegativeArraySizeException, InvocationTargetException {
        List listQ;
        Intrinsics.h(annotated, "<this>");
        Annotations annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (true) {
            Annotation annotationJ = null;
            if (!it.hasNext()) {
                break;
            }
            AnnotationDescriptor next = it.next();
            SourceElement sourceElementG = next.g();
            if (sourceElementG instanceof ReflectAnnotationSource) {
                annotationJ = ((ReflectAnnotationSource) sourceElementG).b;
            } else if (sourceElementG instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement reflectJavaElementC = ((RuntimeSourceElementFactory.RuntimeSourceElement) sourceElementG).c();
                ReflectJavaAnnotation reflectJavaAnnotation = reflectJavaElementC instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) reflectJavaElementC : null;
                if (reflectJavaAnnotation != null) {
                    annotationJ = reflectJavaAnnotation.I();
                }
            } else {
                annotationJ = j(next);
            }
            if (annotationJ != null) {
                arrayList.add(annotationJ);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (JvmClassMappingKt.b(JvmClassMappingKt.a((Annotation) it2.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Annotation annotation = (Annotation) it3.next();
                        Class clsB = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation));
                        if (!clsB.getSimpleName().equals("Container") || clsB.getAnnotation(RepeatableContainer.class) == null) {
                            listQ = CollectionsKt.Q(annotation);
                        } else {
                            Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                            Intrinsics.f(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listQ = ArraysKt.f((Annotation[]) objInvoke);
                        }
                        CollectionsKt.h(listQ, arrayList2);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (cls.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (cls.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (cls.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (cls.equals(Integer.TYPE)) {
            return 0;
        }
        if (cls.equals(Float.TYPE)) {
            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
        if (cls.equals(Long.TYPE)) {
            return 0L;
        }
        if (cls.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (cls.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final CallableDescriptor f(Class moduleAnchor, GeneratedMessageLite.ExtendableMessage proto, NameResolver nameResolver, TypeTable typeTable, BinaryVersion metadataVersion, Function2 function2) {
        List list;
        Intrinsics.h(moduleAnchor, "moduleAnchor");
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        Intrinsics.h(metadataVersion, "metadataVersion");
        RuntimeModuleData runtimeModuleDataA = ModuleByClassLoaderKt.a(moduleAnchor);
        if (proto instanceof ProtoBuf.Function) {
            list = ((ProtoBuf.Function) proto).l;
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            list = ((ProtoBuf.Property) proto).l;
        }
        List list2 = list;
        DeserializationComponents deserializationComponents = runtimeModuleDataA.f24369a;
        ModuleDescriptor moduleDescriptor = deserializationComponents.b;
        VersionRequirementTable versionRequirementTable = VersionRequirementTable.b;
        Intrinsics.e(list2);
        return (CallableDescriptor) function2.invoke(new MemberDeserializer(new DeserializationContext(deserializationComponents, nameResolver, moduleDescriptor, typeTable, versionRequirementTable, metadataVersion, null, null, list2)), proto);
    }

    public static final ReceiverParameterDescriptor g(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.h(callableMemberDescriptor, "<this>");
        if (callableMemberDescriptor.c0() == null) {
            return null;
        }
        DeclarationDescriptor declarationDescriptorE = callableMemberDescriptor.e();
        Intrinsics.f(declarationDescriptorE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((ClassDescriptor) declarationDescriptorE).U();
    }

    public static final boolean h(KType kType) {
        KotlinType d;
        Intrinsics.h(kType, "<this>");
        KTypeImpl kTypeImpl = kType instanceof KTypeImpl ? (KTypeImpl) kType : null;
        return (kTypeImpl == null || (d = kTypeImpl.getD()) == null || !InlineClassesUtilsKt.h(d)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class i(ClassLoader classLoader, ClassId classId, int i) {
        String str = JavaToKotlinClassMap.f24321a;
        ClassId classIdE = JavaToKotlinClassMap.e(classId.a().f24500a);
        if (classIdE != null) {
            classId = classIdE;
        }
        String str2 = classId.f24499a.f24500a.f24501a;
        String str3 = classId.b.f24500a.f24501a;
        if (Intrinsics.c(str2, "kotlin")) {
            switch (str3.hashCode()) {
                case -901856463:
                    if (str3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str2.length() > 0) {
            sb.append(str2.concat("."));
        }
        sb.append(StringsKt.R(str3, JwtParser.SEPARATOR_CHAR, '$'));
        if (i > 0) {
            sb.append(";");
        }
        return ReflectJavaClassFinderKt.a(classLoader, sb.toString());
    }

    public static final Annotation j(AnnotationDescriptor annotationDescriptor) throws NegativeArraySizeException {
        ClassDescriptor classDescriptorD = DescriptorUtilsKt.d(annotationDescriptor);
        Class clsK = classDescriptorD != null ? k(classDescriptorD) : null;
        if (clsK == null) {
            clsK = null;
        }
        if (clsK == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = annotationDescriptor.b().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = clsK.getClassLoader();
            Intrinsics.g(classLoader, "getClassLoader(...)");
            Object objL = l(constantValue, classLoader);
            Pair pair = objL != null ? new Pair(name.b(), objL) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) AnnotationConstructorCallerKt.b(clsK, MapsKt.p(arrayList));
    }

    public static final Class k(ClassDescriptor classDescriptor) {
        Intrinsics.h(classDescriptor, "<this>");
        SourceElement sourceElementG = classDescriptor.g();
        Intrinsics.g(sourceElementG, "getSource(...)");
        if (sourceElementG instanceof KotlinJvmBinarySourceElement) {
            return ((ReflectKotlinClass) ((KotlinJvmBinarySourceElement) sourceElementG).b).f24366a;
        }
        if (sourceElementG instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement reflectJavaElementC = ((RuntimeSourceElementFactory.RuntimeSourceElement) sourceElementG).c();
            Intrinsics.f(reflectJavaElementC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) reflectJavaElementC).I();
        }
        ClassId classIdF = DescriptorUtilsKt.f(classDescriptor);
        if (classIdF == null) {
            return null;
        }
        return i(ReflectClassUtilKt.d(classDescriptor.getClass()), classIdF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object l(ConstantValue constantValue, ClassLoader classLoader) throws NegativeArraySizeException {
        KotlinType kotlinTypeC;
        Class clsI;
        if (constantValue instanceof AnnotationValue) {
            return j((AnnotationDescriptor) ((AnnotationValue) constantValue).b());
        }
        int i = 0;
        if (constantValue instanceof ArrayValue) {
            ArrayValue arrayValue = (ArrayValue) constantValue;
            TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
            if (typedArrayValue != null && (kotlinTypeC = typedArrayValue.c()) != null) {
                Iterable iterable = (Iterable) arrayValue.b();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(l((ConstantValue) it.next(), classLoader));
                }
                Name name = KotlinBuiltIns.f;
                ClassifierDescriptor classifierDescriptorC = kotlinTypeC.J0().c();
                PrimitiveType primitiveTypeS = classifierDescriptorC == null ? null : KotlinBuiltIns.s(classifierDescriptorC);
                switch (primitiveTypeS == null ? -1 : WhenMappings.f24295a[primitiveTypeS.ordinal()]) {
                    case -1:
                        if (!KotlinBuiltIns.z(kotlinTypeC)) {
                            throw new IllegalStateException(("Not an array type: " + kotlinTypeC).toString());
                        }
                        KotlinType type = ((TypeProjection) CollectionsKt.n0(kotlinTypeC.H0())).getType();
                        Intrinsics.g(type, "getType(...)");
                        ClassifierDescriptor classifierDescriptorC2 = type.J0().c();
                        ClassDescriptor classDescriptor = classifierDescriptorC2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC2 : null;
                        if (classDescriptor == null) {
                            throw new IllegalStateException(("Not a class type: " + type).toString());
                        }
                        if (KotlinBuiltIns.I(type)) {
                            int size = ((List) arrayValue.b()).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.String");
                                strArr[i] = obj;
                                i++;
                            }
                            return strArr;
                        }
                        if (KotlinBuiltIns.b(classDescriptor, StandardNames.FqNames.Q)) {
                            int size2 = ((List) arrayValue.b()).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj2 = arrayList.get(i);
                                Intrinsics.f(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i] = obj2;
                                i++;
                            }
                            return clsArr;
                        }
                        ClassId classIdF = DescriptorUtilsKt.f(classDescriptor);
                        if (classIdF != null && (clsI = i(classLoader, classIdF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsI, ((List) arrayValue.b()).size());
                            Intrinsics.f(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        int size4 = ((List) arrayValue.b()).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj3 = arrayList.get(i);
                            Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i] = ((Boolean) obj3).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) arrayValue.b()).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj4 = arrayList.get(i);
                            Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i] = ((Character) obj4).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) arrayValue.b()).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj5 = arrayList.get(i);
                            Intrinsics.f(obj5, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i] = ((Byte) obj5).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) arrayValue.b()).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj6 = arrayList.get(i);
                            Intrinsics.f(obj6, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i] = ((Short) obj6).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) arrayValue.b()).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj7 = arrayList.get(i);
                            Intrinsics.f(obj7, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i] = ((Integer) obj7).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) arrayValue.b()).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj8 = arrayList.get(i);
                            Intrinsics.f(obj8, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i] = ((Float) obj8).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) arrayValue.b()).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj9 = arrayList.get(i);
                            Intrinsics.f(obj9, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i] = ((Long) obj9).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) arrayValue.b()).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj10 = arrayList.get(i);
                            Intrinsics.f(obj10, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i] = ((Double) obj10).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (constantValue instanceof EnumValue) {
            Pair pair = (Pair) ((EnumValue) constantValue).b();
            ClassId classId = (ClassId) pair.d;
            Name name2 = (Name) pair.e;
            Class clsI2 = i(classLoader, classId, 0);
            if (clsI2 != null) {
                return Util.a(clsI2, name2.b());
            }
        } else {
            if (!(constantValue instanceof KClassValue)) {
                if ((constantValue instanceof ErrorValue) || (constantValue instanceof NullValue)) {
                    return null;
                }
                return constantValue.b();
            }
            KClassValue.Value value = (KClassValue.Value) ((KClassValue) constantValue).b();
            if (value instanceof KClassValue.Value.NormalClass) {
                KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value;
                return i(classLoader, normalClass.b(), normalClass.a());
            }
            if (!(value instanceof KClassValue.Value.LocalClass)) {
                throw new NoWhenBranchMatchedException();
            }
            ClassifierDescriptor classifierDescriptorC3 = ((KClassValue.Value.LocalClass) value).a().J0().c();
            ClassDescriptor classDescriptor2 = classifierDescriptorC3 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC3 : null;
            if (classDescriptor2 != null) {
                return k(classDescriptor2);
            }
        }
        return null;
    }
}
