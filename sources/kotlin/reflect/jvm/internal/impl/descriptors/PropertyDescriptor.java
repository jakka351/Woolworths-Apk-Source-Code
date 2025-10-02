package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes.dex */
public interface PropertyDescriptor extends CallableMemberDescriptor, VariableDescriptorWithAccessors {
    FieldDescriptor D();

    FieldDescriptor N();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    PropertyDescriptor a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    PropertyDescriptor b(TypeSubstitutor typeSubstitutor);

    PropertySetterDescriptor c();

    PropertyGetterDescriptorImpl getGetter();

    ArrayList v();
}
