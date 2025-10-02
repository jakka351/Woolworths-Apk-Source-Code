package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.util.Check;
import kotlin.reflect.jvm.internal.impl.util.CheckResult;
import kotlin.reflect.jvm.internal.impl.util.Checks;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public class JavaMethodDescriptor extends SimpleFunctionDescriptorImpl implements JavaCallableMemberDescriptor {
    public static final CallableDescriptor.UserDataKey J = new AnonymousClass1();
    public static final CallableDescriptor.UserDataKey K = new AnonymousClass2();
    public ParameterNamesStatus H;
    public final boolean I;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$1, reason: invalid class name */
    public static class AnonymousClass1 implements CallableDescriptor.UserDataKey<ValueParameterDescriptor> {
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$2, reason: invalid class name */
    public static class AnonymousClass2 implements CallableDescriptor.UserDataKey<Boolean> {
    }

    public enum ParameterNamesStatus {
        f(false, false),
        g(true, false),
        h(false, true),
        i(true, true);

        public final boolean d;
        public final boolean e;

        ParameterNamesStatus(boolean z, boolean z2) {
            this.d = z;
            this.e = z2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaMethodDescriptor(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z) {
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
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
        if (sourceElement == null) {
            n0(4);
            throw null;
        }
        this.H = null;
        this.I = z;
    }

    public static JavaMethodDescriptor W0(DeclarationDescriptor declarationDescriptor, LazyJavaAnnotations lazyJavaAnnotations, Name name, JavaSourceElement javaSourceElement, boolean z) {
        if (declarationDescriptor == null) {
            n0(5);
            throw null;
        }
        if (name == null) {
            n0(7);
            throw null;
        }
        if (javaSourceElement != null) {
            return new JavaMethodDescriptor(declarationDescriptor, null, lazyJavaAnnotations, name, CallableMemberDescriptor.Kind.d, javaSourceElement, z);
        }
        n0(8);
        throw null;
    }

    public static /* synthetic */ void n0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl I0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        if (declarationDescriptor == null) {
            n0(14);
            throw null;
        }
        if (kind == null) {
            n0(15);
            throw null;
        }
        if (annotations == null) {
            n0(16);
            throw null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = getName();
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement, this.I);
        ParameterNamesStatus parameterNamesStatus = this.H;
        javaMethodDescriptor.X0(parameterNamesStatus.d, parameterNamesStatus.e);
        return javaMethodDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    public final SimpleFunctionDescriptorImpl V0(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List list, List list2, List list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map map) {
        CheckResult illegalSignature;
        if (list == null) {
            n0(9);
            throw null;
        }
        if (list2 == null) {
            n0(10);
            throw null;
        }
        if (list3 == null) {
            n0(11);
            throw null;
        }
        if (descriptorVisibility == null) {
            n0(12);
            throw null;
        }
        super.V0(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
        List list4 = OperatorChecks.f24645a;
        for (Checks checks : OperatorChecks.f24645a) {
            Regex regex = checks.b;
            Name name = checks.f24640a;
            if (name == null || Intrinsics.c(getName(), name)) {
                if (regex != null) {
                    String strB = getName().b();
                    Intrinsics.g(strB, "asString(...)");
                    if (!regex.f(strB)) {
                        continue;
                    }
                }
                Collection collection = checks.c;
                if (collection == null || collection.contains(getName())) {
                    Check[] checkArr = checks.e;
                    int length = checkArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            illegalSignature = ((String) checks.d.invoke(this)) != null ? new CheckResult.IllegalSignature(false) : CheckResult.SuccessCheck.b;
                        } else {
                            if (checkArr[i].b(this) != null) {
                                illegalSignature = new CheckResult.IllegalSignature(false);
                                break;
                            }
                            i++;
                        }
                    }
                    this.p = illegalSignature.f24639a;
                    return this;
                }
            }
        }
        illegalSignature = CheckResult.IllegalFunctionName.b;
        this.p = illegalSignature.f24639a;
        return this;
    }

    public final void X0(boolean z, boolean z2) {
        this.H = z ? z2 ? ParameterNamesStatus.i : ParameterNamesStatus.g : z2 ? ParameterNamesStatus.h : ParameterNamesStatus.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final boolean m0() {
        return this.H.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public final JavaCallableMemberDescriptor z0(KotlinType kotlinType, ArrayList arrayList, KotlinType kotlinType2, Pair pair) {
        ArrayList arrayListA = UtilKt.a(arrayList, h(), this);
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImplH = kotlinType == null ? null : DescriptorFactory.h(this, kotlinType, Annotations.Companion.f24350a);
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationM0 = M0(TypeSubstitutor.b);
        copyConfigurationM0.g = arrayListA;
        copyConfigurationM0.k = kotlinType2;
        copyConfigurationM0.i = receiverParameterDescriptorImplH;
        copyConfigurationM0.p = true;
        copyConfigurationM0.o = true;
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) copyConfigurationM0.x.J0(copyConfigurationM0);
        if (pair != null) {
            javaMethodDescriptor.N0((CallableDescriptor.UserDataKey) pair.d, pair.e);
        }
        if (javaMethodDescriptor != null) {
            return javaMethodDescriptor;
        }
        n0(21);
        throw null;
    }
}
