package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes7.dex */
public class SimpleFunctionDescriptorImpl extends FunctionDescriptorImpl implements SimpleFunctionDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleFunctionDescriptorImpl(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(kind, declarationDescriptor, simpleFunctionDescriptor, sourceElement, annotations, name);
        if (declarationDescriptor == null) {
            n0(0);
            throw null;
        }
        if (annotations == null) {
            n0(1);
            throw null;
        }
        if (name == null) {
            n0(2);
            throw null;
        }
        if (kind == null) {
            n0(3);
            throw null;
        }
        if (sourceElement != null) {
        } else {
            n0(4);
            throw null;
        }
    }

    public static SimpleFunctionDescriptorImpl S0(AbstractClassDescriptor abstractClassDescriptor, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        if (abstractClassDescriptor == null) {
            n0(5);
            throw null;
        }
        if (name == null) {
            n0(7);
            throw null;
        }
        if (sourceElement != null) {
            return new SimpleFunctionDescriptorImpl(abstractClassDescriptor, null, Annotations.Companion.f24350a, name, kind, sourceElement);
        }
        n0(9);
        throw null;
    }

    public static /* synthetic */ void n0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public FunctionDescriptorImpl I0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        if (declarationDescriptor == null) {
            n0(25);
            throw null;
        }
        if (kind == null) {
            n0(26);
            throw null;
        }
        if (annotations == null) {
            n0(27);
            throw null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = getName();
        }
        return new SimpleFunctionDescriptorImpl(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public SimpleFunctionDescriptor F0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility) {
        return (SimpleFunctionDescriptor) super.F0(declarationDescriptor, modality, descriptorVisibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor.CopyBuilder S() {
        return M0(TypeSubstitutor.b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final SimpleFunctionDescriptor H0() {
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) super.H0();
        if (simpleFunctionDescriptor != null) {
            return simpleFunctionDescriptor;
        }
        n0(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final SimpleFunctionDescriptorImpl L0(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List list, List list2, List list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            n0(14);
            throw null;
        }
        if (list2 == null) {
            n0(15);
            throw null;
        }
        if (list3 == null) {
            n0(16);
            throw null;
        }
        if (descriptorVisibility != null) {
            return V0(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, null);
        }
        n0(17);
        throw null;
    }

    public SimpleFunctionDescriptorImpl V0(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List list, List list2, List list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map map) {
        if (list == null) {
            n0(19);
            throw null;
        }
        if (list2 == null) {
            n0(20);
            throw null;
        }
        if (list3 == null) {
            n0(21);
            throw null;
        }
        if (descriptorVisibility == null) {
            n0(22);
            throw null;
        }
        super.L0(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility);
        if (map != null && !map.isEmpty()) {
            this.G = new LinkedHashMap(map);
        }
        return this;
    }
}
