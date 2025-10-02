package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;

/* loaded from: classes7.dex */
public class JavaPropertyDescriptor extends PropertyDescriptorImpl implements JavaCallableMemberDescriptor {
    public final boolean D;
    public final Pair E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaPropertyDescriptor(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z, Name name, SourceElement sourceElement, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, boolean z2, Pair pair) {
        super(declarationDescriptor, propertyDescriptor, annotations, modality, descriptorVisibility, z, name, kind, sourceElement, false, false, false, false, false);
        if (declarationDescriptor == null) {
            n0(0);
            throw null;
        }
        if (annotations == null) {
            n0(1);
            throw null;
        }
        if (modality == null) {
            n0(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            n0(3);
            throw null;
        }
        if (name == null) {
            n0(4);
            throw null;
        }
        if (sourceElement == null) {
            n0(5);
            throw null;
        }
        if (kind == null) {
            n0(6);
            throw null;
        }
        this.D = z2;
        this.E = pair;
    }

    public static JavaPropertyDescriptor P0(DeclarationDescriptor declarationDescriptor, LazyJavaAnnotations lazyJavaAnnotations, DescriptorVisibility descriptorVisibility, boolean z, Name name, JavaSourceElement javaSourceElement, boolean z2) {
        Modality modality = Modality.e;
        if (declarationDescriptor == null) {
            n0(7);
            throw null;
        }
        if (name == null) {
            n0(11);
            throw null;
        }
        if (javaSourceElement != null) {
            return new JavaPropertyDescriptor(declarationDescriptor, lazyJavaAnnotations, modality, descriptorVisibility, z, name, javaSourceElement, null, CallableMemberDescriptor.Kind.d, z2, null);
        }
        n0(12);
        throw null;
    }

    public static /* synthetic */ void n0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public final PropertyDescriptorImpl L0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name name) {
        if (declarationDescriptor == null) {
            n0(13);
            throw null;
        }
        if (modality == null) {
            n0(14);
            throw null;
        }
        if (descriptorVisibility == null) {
            n0(15);
            throw null;
        }
        if (kind == null) {
            n0(16);
            throw null;
        }
        if (name == null) {
            n0(17);
            throw null;
        }
        return new JavaPropertyDescriptor(declarationDescriptor, getAnnotations(), modality, descriptorVisibility, this.i, name, SourceElement.f24343a, propertyDescriptor, kind, this.D, this.E);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Object M(CallableDescriptor.UserDataKey userDataKey) {
        Pair pair = this.E;
        if (pair == null || !((CallableDescriptor.UserDataKey) pair.d).equals(JavaMethodDescriptor.K)) {
            return null;
        }
        return pair.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public final void N0(KotlinType kotlinType) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean isConst() {
        KotlinType type = getType();
        if (!this.D) {
            return false;
        }
        Intrinsics.h(type, "type");
        if (((!KotlinBuiltIns.H(type) && !UnsignedTypes.c(type)) || TypeUtils.f(type)) && !KotlinBuiltIns.I(type)) {
            return false;
        }
        Annotations annotations = TypeEnhancementKt.f24456a;
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.p;
        Intrinsics.g(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !ClassicTypeSystemContext.DefaultImpls.v(type, ENHANCED_NULLABILITY_ANNOTATION) || KotlinBuiltIns.I(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final boolean m0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public final JavaCallableMemberDescriptor z0(KotlinType kotlinType, ArrayList arrayList, KotlinType kotlinType2, Pair pair) {
        KotlinType kotlinType3;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        PropertyDescriptor propertyDescriptorH0 = H0() == this ? null : H0();
        JavaPropertyDescriptor javaPropertyDescriptor = new JavaPropertyDescriptor(e(), getAnnotations(), k(), getVisibility(), this.i, getName(), g(), propertyDescriptorH0, f(), this.D, pair);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = this.z;
        if (propertyGetterDescriptorImpl2 != null) {
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl3 = new PropertyGetterDescriptorImpl(javaPropertyDescriptor, propertyGetterDescriptorImpl2.getAnnotations(), propertyGetterDescriptorImpl2.k(), propertyGetterDescriptorImpl2.getVisibility(), propertyGetterDescriptorImpl2.h, propertyGetterDescriptorImpl2.i, propertyGetterDescriptorImpl2.l, f(), propertyDescriptorH0 == null ? null : propertyDescriptorH0.getGetter(), propertyGetterDescriptorImpl2.g());
            propertyGetterDescriptorImpl3.o = propertyGetterDescriptorImpl2.o;
            kotlinType3 = kotlinType2;
            propertyGetterDescriptorImpl3.p = kotlinType3;
            propertyGetterDescriptorImpl = propertyGetterDescriptorImpl3;
        } else {
            kotlinType3 = kotlinType2;
            propertyGetterDescriptorImpl = null;
        }
        PropertySetterDescriptor propertySetterDescriptor = this.A;
        if (propertySetterDescriptor != null) {
            propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(javaPropertyDescriptor, propertySetterDescriptor.getAnnotations(), propertySetterDescriptor.k(), propertySetterDescriptor.getVisibility(), propertySetterDescriptor.Y(), propertySetterDescriptor.isExternal(), propertySetterDescriptor.isInline(), f(), propertyDescriptorH0 == null ? null : propertyDescriptorH0.c(), propertySetterDescriptor.g());
            propertySetterDescriptorImpl.o = propertySetterDescriptorImpl.o;
            propertySetterDescriptorImpl.N0((ValueParameterDescriptor) propertySetterDescriptor.h().get(0));
        } else {
            propertySetterDescriptorImpl = null;
        }
        javaPropertyDescriptor.M0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, this.B, this.C);
        Function0 function0 = this.k;
        if (function0 != null) {
            javaPropertyDescriptor.I0(this.j, function0);
        }
        javaPropertyDescriptor.Q(q());
        javaPropertyDescriptor.O0(kotlinType3, getTypeParameters(), this.w, kotlinType != null ? DescriptorFactory.h(this, kotlinType, Annotations.Companion.f24350a) : null, EmptyList.d);
        return javaPropertyDescriptor;
    }
}
