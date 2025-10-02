package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnnotationDeserializer {

    /* renamed from: a, reason: collision with root package name */
    public final ModuleDescriptor f24564a;
    public final NotFoundClasses b;

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24565a;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
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
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f24565a = iArr;
        }
    }

    public AnnotationDeserializer(ModuleDescriptor module, NotFoundClasses notFoundClasses) {
        Intrinsics.h(module, "module");
        Intrinsics.h(notFoundClasses, "notFoundClasses");
        this.f24564a = module;
        this.b = notFoundClasses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.Pair] */
    public final AnnotationDescriptorImpl a(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        ClassDescriptor classDescriptorC = FindClassInModuleKt.c(this.f24564a, NameResolverUtilKt.a(nameResolver, proto.f), this.b);
        Map mapP = EmptyMap.d;
        if (proto.g.size() != 0 && !ErrorUtils.f(classDescriptorC)) {
            int i = DescriptorUtils.f24530a;
            if (DescriptorUtils.n(classDescriptorC, ClassKind.h)) {
                Collection collectionN = classDescriptorC.n();
                Intrinsics.g(collectionN, "getConstructors(...)");
                ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) CollectionsKt.o0(collectionN);
                if (classConstructorDescriptor != null) {
                    List listH = classConstructorDescriptor.h();
                    Intrinsics.g(listH, "getValueParameters(...)");
                    List list = listH;
                    int iH = MapsKt.h(CollectionsKt.s(list, 10));
                    if (iH < 16) {
                        iH = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                    for (Object obj : list) {
                        linkedHashMap.put(((ValueParameterDescriptor) obj).getName(), obj);
                    }
                    List<ProtoBuf.Annotation.Argument> list2 = proto.g;
                    Intrinsics.g(list2, "getArgumentList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (ProtoBuf.Annotation.Argument argument : list2) {
                        Intrinsics.e(argument);
                        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) linkedHashMap.get(NameResolverUtilKt.b(nameResolver, argument.d()));
                        if (valueParameterDescriptor != null) {
                            Name nameB = NameResolverUtilKt.b(nameResolver, argument.d());
                            KotlinType type = valueParameterDescriptor.getType();
                            Intrinsics.g(type, "getType(...)");
                            ProtoBuf.Annotation.Argument.Value valueE = argument.e();
                            Intrinsics.g(valueE, "getValue(...)");
                            ConstantValue constantValueC = c(type, valueE, nameResolver);
                            pair = b(constantValueC, type, valueE) ? constantValueC : null;
                            if (pair == null) {
                                pair = ErrorValue.Companion.a("Unexpected argument value: actual type " + valueE.f + " != expected type " + type);
                            }
                            pair = new Pair(nameB, pair);
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    mapP = MapsKt.p(arrayList);
                }
            }
        }
        return new AnnotationDescriptorImpl(classDescriptorC.t(), mapP, SourceElement.f24343a);
    }

    public final boolean b(ConstantValue constantValue, KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value) {
        ProtoBuf.Annotation.Argument.Value.Type type = value.f;
        int i = type == null ? -1 : WhenMappings.f24565a[type.ordinal()];
        if (i == 10) {
            ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
            ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
            if (classDescriptor == null) {
                return true;
            }
            Name name = KotlinBuiltIns.f;
            return KotlinBuiltIns.b(classDescriptor, StandardNames.FqNames.Q);
        }
        ModuleDescriptor moduleDescriptor = this.f24564a;
        if (i != 13) {
            return Intrinsics.c(constantValue.a(moduleDescriptor), kotlinType);
        }
        if (constantValue instanceof ArrayValue) {
            ArrayValue arrayValue = (ArrayValue) constantValue;
            if (((List) arrayValue.b()).size() == value.n.size()) {
                KotlinType kotlinTypeG = moduleDescriptor.p().g(kotlinType);
                if (kotlinTypeG == null) {
                    return false;
                }
                Iterable iterableH = CollectionsKt.H((Collection) arrayValue.b());
                if ((iterableH instanceof Collection) && ((Collection) iterableH).isEmpty()) {
                    return true;
                }
                IntProgressionIterator it = iterableH.iterator();
                while (it.f) {
                    int iNextInt = it.nextInt();
                    ConstantValue constantValue2 = (ConstantValue) ((List) arrayValue.b()).get(iNextInt);
                    ProtoBuf.Annotation.Argument.Value value2 = (ProtoBuf.Annotation.Argument.Value) value.n.get(iNextInt);
                    Intrinsics.g(value2, "getArrayElement(...)");
                    if (!b(constantValue2, kotlinTypeG, value2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + constantValue).toString());
    }

    public final ConstantValue c(KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value, NameResolver nameResolver) {
        Intrinsics.h(nameResolver, "nameResolver");
        boolean zBooleanValue = Flags.N.e(value.p).booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type type = value.f;
        switch (type == null ? -1 : WhenMappings.f24565a[type.ordinal()]) {
            case 1:
                byte b = (byte) value.g;
                return zBooleanValue ? new UByteValue(b) : new ByteValue(b);
            case 2:
                return new CharValue((char) value.g);
            case 3:
                short s = (short) value.g;
                return zBooleanValue ? new UShortValue(s) : new ShortValue(s);
            case 4:
                int i = (int) value.g;
                return zBooleanValue ? new UIntValue(i) : new IntValue(i);
            case 5:
                long j = value.g;
                return zBooleanValue ? new ULongValue(j) : new LongValue(j);
            case 6:
                return new FloatValue(value.h);
            case 7:
                return new DoubleValue(value.i);
            case 8:
                return new BooleanValue(value.g != 0);
            case 9:
                return new StringValue(nameResolver.getString(value.j));
            case 10:
                return new KClassValue(NameResolverUtilKt.a(nameResolver, value.k), value.o);
            case 11:
                return new EnumValue(NameResolverUtilKt.a(nameResolver, value.k), NameResolverUtilKt.b(nameResolver, value.l));
            case 12:
                ProtoBuf.Annotation annotation = value.m;
                Intrinsics.g(annotation, "getAnnotation(...)");
                return new AnnotationValue(a(annotation, nameResolver));
            case 13:
                List list = value.n;
                Intrinsics.g(list, "getArrayElementList(...)");
                List<ProtoBuf.Annotation.Argument.Value> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                for (ProtoBuf.Annotation.Argument.Value value2 : list2) {
                    SimpleType simpleTypeE = this.f24564a.p().e();
                    Intrinsics.g(simpleTypeE, "getAnyType(...)");
                    Intrinsics.e(value2);
                    arrayList.add(c(simpleTypeE, value2, nameResolver));
                }
                return ConstantValueFactory.b(arrayList, kotlinType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.f + " (expected " + kotlinType + ')').toString());
        }
    }
}
