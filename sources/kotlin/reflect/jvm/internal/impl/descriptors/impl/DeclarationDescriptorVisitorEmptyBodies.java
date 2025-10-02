package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* loaded from: classes7.dex */
public class DeclarationDescriptorVisitorEmptyBodies<R, D> implements DeclarationDescriptorVisitor<R, D> {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object a(ModuleAwareClassDescriptor moduleAwareClassDescriptor, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object b(PropertyDescriptorImpl propertyDescriptorImpl, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object c(PackageFragmentDescriptorImpl packageFragmentDescriptorImpl, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object d(AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptor, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object e(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object f(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object g(Object obj, ModuleDescriptorImpl moduleDescriptorImpl) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object h(PropertySetterDescriptorImpl propertySetterDescriptorImpl, Object obj) {
        return l(propertySetterDescriptorImpl, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object i(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, Object obj) {
        return l(propertyGetterDescriptorImpl, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object j(ValueParameterDescriptorImpl valueParameterDescriptorImpl, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object k(ClassConstructorDescriptorImpl classConstructorDescriptorImpl, Object obj) {
        return l(classConstructorDescriptorImpl, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object l(FunctionDescriptor functionDescriptor, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object m(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, Object obj) {
        return null;
    }
}
