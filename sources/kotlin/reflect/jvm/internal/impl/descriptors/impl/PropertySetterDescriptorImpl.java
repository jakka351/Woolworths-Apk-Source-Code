package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes7.dex */
public class PropertySetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertySetterDescriptor {
    public ValueParameterDescriptor p;
    public final PropertySetterDescriptor q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertySetterDescriptorImpl(PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z, boolean z2, boolean z3, CallableMemberDescriptor.Kind kind, PropertySetterDescriptor propertySetterDescriptor, SourceElement sourceElement) {
        super(modality, descriptorVisibility, propertyDescriptor, annotations, Name.l("<set-" + propertyDescriptor.getName() + ">"), z, z2, z3, kind, sourceElement);
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
        if (kind == null) {
            n0(4);
            throw null;
        }
        if (sourceElement == null) {
            n0(5);
            throw null;
        }
        this.q = propertySetterDescriptor != null ? propertySetterDescriptor : this;
    }

    public static ValueParameterDescriptorImpl L0(PropertySetterDescriptorImpl propertySetterDescriptorImpl, KotlinType kotlinType, Annotations annotations) {
        if (kotlinType == null) {
            n0(8);
            throw null;
        }
        if (annotations != null) {
            return new ValueParameterDescriptorImpl(propertySetterDescriptorImpl, null, 0, annotations, SpecialNames.g, kotlinType, false, false, false, null, SourceElement.f24343a);
        }
        n0(9);
        throw null;
    }

    public static /* synthetic */ void n0(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public final PropertySetterDescriptor H0() {
        PropertySetterDescriptor propertySetterDescriptor = this.q;
        if (propertySetterDescriptor != null) {
            return propertySetterDescriptor;
        }
        n0(13);
        throw null;
    }

    public final void N0(ValueParameterDescriptor valueParameterDescriptor) {
        if (valueParameterDescriptor != null) {
            this.p = valueParameterDescriptor;
        } else {
            n0(6);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.h(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final KotlinType getReturnType() {
        SimpleType simpleTypeX = DescriptorUtilsKt.e(this).x();
        if (simpleTypeX != null) {
            return simpleTypeX;
        }
        n0(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List h() {
        ValueParameterDescriptor valueParameterDescriptor = this.p;
        if (valueParameterDescriptor == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(valueParameterDescriptor);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        n0(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Collection q() {
        return I0(false);
    }
}
