package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public class DescriptorFactory {

    public static class DefaultClassConstructorDescriptor extends ClassConstructorDescriptorImpl {
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static ReceiverParameterDescriptorImpl b(CallableDescriptor callableDescriptor, KotlinType kotlinType, Name name, Annotations annotations, int i) {
        if (annotations == null) {
            a(33);
            throw null;
        }
        if (kotlinType == null) {
            return null;
        }
        ContextReceiver contextReceiver = new ContextReceiver(callableDescriptor, kotlinType, name, null);
        Regex regex = NameUtils.f24502a;
        return new ReceiverParameterDescriptorImpl(callableDescriptor, contextReceiver, annotations, Name.e(NameUtils.b + '_' + i));
    }

    public static PropertyGetterDescriptorImpl c(PropertyDescriptor propertyDescriptor, Annotations annotations) {
        return i(propertyDescriptor, annotations, true, propertyDescriptor.g());
    }

    public static PropertySetterDescriptorImpl d(PropertyDescriptor propertyDescriptor, Annotations annotations) {
        SourceElement sourceElementG = propertyDescriptor.g();
        if (sourceElementG != null) {
            return k(propertyDescriptor, annotations, Annotations.Companion.f24350a, true, propertyDescriptor.getVisibility(), sourceElementG);
        }
        a(6);
        throw null;
    }

    public static PropertyDescriptorImpl e(AbstractClassDescriptor abstractClassDescriptor) {
        if (abstractClassDescriptor == null) {
            a(26);
            throw null;
        }
        ModuleDescriptor moduleDescriptorD = DescriptorUtils.d(abstractClassDescriptor);
        Intrinsics.h(moduleDescriptorD, "<this>");
        StdlibClassFinder stdlibClassFinder = (StdlibClassFinder) moduleDescriptorD.T(StdlibClassFinderKt.f24536a);
        if (stdlibClassFinder == null) {
            stdlibClassFinder = CliStdlibClassFinderImpl.f24527a;
        }
        ClassDescriptor classDescriptorA = stdlibClassFinder.a(moduleDescriptorD);
        if (classDescriptorA == null) {
            return null;
        }
        Modality modality = Modality.e;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.e;
        Name name = StandardNames.b;
        SourceElement sourceElementG = abstractClassDescriptor.g();
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.g;
        PropertyDescriptorImpl propertyDescriptorImplK0 = PropertyDescriptorImpl.K0(abstractClassDescriptor, modality, descriptorVisibility, false, name, kind, sourceElementG);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(propertyDescriptorImplK0, Annotations.Companion.f24350a, modality, descriptorVisibility, false, false, false, kind, null, abstractClassDescriptor.g());
        propertyDescriptorImplK0.M0(propertyGetterDescriptorImpl, null, null, null);
        TypeAttributes.e.getClass();
        TypeAttributes attributes = TypeAttributes.f;
        TypeConstructor constructor = classDescriptorA.m();
        List arguments = Collections.singletonList(new TypeProjectionImpl(abstractClassDescriptor.t()));
        Intrinsics.h(attributes, "attributes");
        Intrinsics.h(constructor, "constructor");
        Intrinsics.h(arguments, "arguments");
        SimpleType simpleTypeD = KotlinTypeFactory.d(attributes, constructor, arguments, false, null);
        List list = Collections.EMPTY_LIST;
        propertyDescriptorImplK0.O0(simpleTypeD, list, null, null, list);
        propertyGetterDescriptorImpl.M0(propertyDescriptorImplK0.getReturnType());
        return propertyDescriptorImplK0;
    }

    public static SimpleFunctionDescriptorImpl f(AbstractClassDescriptor abstractClassDescriptor) {
        if (abstractClassDescriptor == null) {
            a(24);
            throw null;
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplS0 = SimpleFunctionDescriptorImpl.S0(abstractClassDescriptor, StandardNames.c, CallableMemberDescriptor.Kind.g, abstractClassDescriptor.g());
        ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(simpleFunctionDescriptorImplS0, null, 0, Annotations.Companion.f24350a, Name.e("value"), DescriptorUtilsKt.e(abstractClassDescriptor).v(), false, false, false, null, abstractClassDescriptor.g());
        List list = Collections.EMPTY_LIST;
        return simpleFunctionDescriptorImplS0.L0(null, null, list, list, Collections.singletonList(valueParameterDescriptorImpl), abstractClassDescriptor.t(), Modality.e, DescriptorVisibilities.e);
    }

    public static SimpleFunctionDescriptorImpl g(AbstractClassDescriptor abstractClassDescriptor) {
        if (abstractClassDescriptor == null) {
            a(22);
            throw null;
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplS0 = SimpleFunctionDescriptorImpl.S0(abstractClassDescriptor, StandardNames.f24313a, CallableMemberDescriptor.Kind.g, abstractClassDescriptor.g());
        List list = Collections.EMPTY_LIST;
        KotlinBuiltIns kotlinBuiltInsE = DescriptorUtilsKt.e(abstractClassDescriptor);
        Variance variance = Variance.f;
        return simpleFunctionDescriptorImplS0.L0(null, null, list, list, list, kotlinBuiltInsE.h(abstractClassDescriptor.t()), Modality.e, DescriptorVisibilities.e);
    }

    public static ReceiverParameterDescriptorImpl h(CallableDescriptor callableDescriptor, KotlinType kotlinType, Annotations annotations) {
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ExtensionReceiver(callableDescriptor, kotlinType, null), annotations);
    }

    public static PropertyGetterDescriptorImpl i(PropertyDescriptor propertyDescriptor, Annotations annotations, boolean z, SourceElement sourceElement) {
        if (annotations == null) {
            a(18);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.k(), propertyDescriptor.getVisibility(), z, false, false, CallableMemberDescriptor.Kind.d, null, sourceElement);
        }
        a(19);
        throw null;
    }

    public static ClassConstructorDescriptorImpl j(ClassDescriptor classDescriptor) {
        DescriptorVisibility descriptorVisibility;
        DefaultClassConstructorDescriptor defaultClassConstructorDescriptor = new DefaultClassConstructorDescriptor(classDescriptor, null, Annotations.Companion.f24350a, true, CallableMemberDescriptor.Kind.d, SourceElement.f24343a);
        List list = Collections.EMPTY_LIST;
        int i = DescriptorUtils.f24530a;
        ClassKind classKindF = classDescriptor.f();
        if (classKindF == ClassKind.f || classKindF.a()) {
            descriptorVisibility = DescriptorVisibilities.f24332a;
            if (descriptorVisibility == null) {
                DescriptorUtils.a(49);
                throw null;
            }
        } else if (DescriptorUtils.q(classDescriptor)) {
            descriptorVisibility = DescriptorVisibilities.f24332a;
            if (descriptorVisibility == null) {
                DescriptorUtils.a(51);
                throw null;
            }
        } else if (DescriptorUtils.k(classDescriptor)) {
            descriptorVisibility = DescriptorVisibilities.l;
            if (descriptorVisibility == null) {
                DescriptorUtils.a(52);
                throw null;
            }
        } else {
            descriptorVisibility = DescriptorVisibilities.e;
            if (descriptorVisibility == null) {
                DescriptorUtils.a(53);
                throw null;
            }
        }
        defaultClassConstructorDescriptor.T0(list, descriptorVisibility);
        return defaultClassConstructorDescriptor;
    }

    public static PropertySetterDescriptorImpl k(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2, boolean z, DescriptorVisibility descriptorVisibility, SourceElement sourceElement) {
        if (annotations == null) {
            a(8);
            throw null;
        }
        if (annotations2 == null) {
            a(9);
            throw null;
        }
        if (descriptorVisibility == null) {
            a(10);
            throw null;
        }
        if (sourceElement == null) {
            a(11);
            throw null;
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.k(), descriptorVisibility, z, false, false, CallableMemberDescriptor.Kind.d, null, sourceElement);
        propertySetterDescriptorImpl.p = PropertySetterDescriptorImpl.L0(propertySetterDescriptorImpl, propertyDescriptor.getType(), annotations2);
        return propertySetterDescriptorImpl;
    }

    public static boolean l(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor.f() != CallableMemberDescriptor.Kind.g) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorE = functionDescriptor.e();
        int i = DescriptorUtils.f24530a;
        return DescriptorUtils.n(declarationDescriptorE, ClassKind.f);
    }

    public static boolean m(FunctionDescriptor functionDescriptor) {
        return functionDescriptor.getName().equals(StandardNames.c) && l(functionDescriptor);
    }

    public static boolean n(FunctionDescriptor functionDescriptor) {
        return functionDescriptor.getName().equals(StandardNames.f24313a) && l(functionDescriptor);
    }
}
