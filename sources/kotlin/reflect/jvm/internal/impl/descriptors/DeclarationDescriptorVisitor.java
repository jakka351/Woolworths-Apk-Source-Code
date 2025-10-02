package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;

/* loaded from: classes.dex */
public interface DeclarationDescriptorVisitor<R, D> {
    Object a(ModuleAwareClassDescriptor moduleAwareClassDescriptor, Object obj);

    Object b(PropertyDescriptorImpl propertyDescriptorImpl, Object obj);

    Object c(PackageFragmentDescriptorImpl packageFragmentDescriptorImpl, Object obj);

    Object d(AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptor, Object obj);

    Object e(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl, Object obj);

    Object f(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, Object obj);

    Object g(Object obj, ModuleDescriptorImpl moduleDescriptorImpl);

    Object h(PropertySetterDescriptorImpl propertySetterDescriptorImpl, Object obj);

    Object i(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, Object obj);

    Object j(ValueParameterDescriptorImpl valueParameterDescriptorImpl, Object obj);

    Object k(ClassConstructorDescriptorImpl classConstructorDescriptorImpl, Object obj);

    Object l(FunctionDescriptor functionDescriptor, Object obj);

    Object m(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, Object obj);
}
