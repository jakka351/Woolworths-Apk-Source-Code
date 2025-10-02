package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypeAliasConstructorDescriptorImpl extends FunctionDescriptorImpl implements TypeAliasConstructorDescriptor {
    public final StorageManager H;
    public final TypeAliasDescriptor I;
    public final NullableLazyValue J;
    public ClassConstructorDescriptor K;
    public static final /* synthetic */ KProperty[] M = {Reflection.f24268a.h(new PropertyReference1Impl(TypeAliasConstructorDescriptorImpl.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};
    public static final Companion L = new Companion();

    @SourceDebugExtension
    public static final class Companion {
    }

    public TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, final ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(kind, typeAliasDescriptor, typeAliasConstructorDescriptor, sourceElement, annotations, SpecialNames.e);
        this.H = storageManager;
        this.I = typeAliasDescriptor;
        this.v = typeAliasDescriptor.h0();
        this.J = storageManager.e(new Function0(this, classConstructorDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$$Lambda$0
            public final TypeAliasConstructorDescriptorImpl d;
            public final ClassConstructorDescriptor e;

            {
                this.d = this;
                this.e = classConstructorDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.d;
                StorageManager storageManager2 = typeAliasConstructorDescriptorImpl.H;
                TypeAliasDescriptor typeAliasDescriptor2 = typeAliasConstructorDescriptorImpl.I;
                ClassConstructorDescriptor classConstructorDescriptor2 = this.e;
                Annotations annotations2 = classConstructorDescriptor2.getAnnotations();
                CallableMemberDescriptor.Kind kindF = classConstructorDescriptor2.f();
                Intrinsics.g(kindF, "getKind(...)");
                TypeAliasDescriptor typeAliasDescriptor3 = typeAliasConstructorDescriptorImpl.I;
                SourceElement sourceElementG = typeAliasDescriptor3.g();
                Intrinsics.g(sourceElementG, "getSource(...)");
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(storageManager2, typeAliasDescriptor2, classConstructorDescriptor2, typeAliasConstructorDescriptorImpl, annotations2, kindF, sourceElementG);
                TypeAliasConstructorDescriptorImpl.L.getClass();
                TypeSubstitutor typeSubstitutorD = typeAliasDescriptor3.l() == null ? null : TypeSubstitutor.d(typeAliasDescriptor3.Z());
                if (typeSubstitutorD == null) {
                    return null;
                }
                ReceiverParameterDescriptor receiverParameterDescriptorC0 = classConstructorDescriptor2.c0();
                AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptorB = receiverParameterDescriptorC0 != null ? receiverParameterDescriptorC0.b(typeSubstitutorD) : null;
                List listA0 = classConstructorDescriptor2.A0();
                Intrinsics.g(listA0, "getContextReceiverParameters(...)");
                List list = listA0;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ReceiverParameterDescriptor) it.next()).b(typeSubstitutorD));
                }
                List listU = typeAliasDescriptor3.u();
                List listH = typeAliasConstructorDescriptorImpl.h();
                KotlinType kotlinType = typeAliasConstructorDescriptorImpl.j;
                Intrinsics.e(kotlinType);
                typeAliasConstructorDescriptorImpl2.L0(null, abstractReceiverParameterDescriptorB, arrayList, listU, listH, kotlinType, Modality.e, typeAliasDescriptor3.getVisibility());
                return typeAliasConstructorDescriptorImpl2;
            }
        });
        this.K = classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor
    public final ClassConstructorDescriptor F() {
        return this.K;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public final ClassDescriptor I() {
        ClassDescriptor classDescriptorI = this.K.I();
        Intrinsics.g(classDescriptorI, "getConstructedClass(...)");
        return classDescriptorI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl I0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        Intrinsics.h(newOwner, "newOwner");
        Intrinsics.h(kind, "kind");
        Intrinsics.h(annotations, "annotations");
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.d;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.g;
        }
        return new TypeAliasConstructorDescriptorImpl(this.H, this.I, this.K, this, annotations, kind2, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final TypeAliasConstructorDescriptor F0(DeclarationDescriptor newOwner, Modality modality, DescriptorVisibility visibility) {
        Intrinsics.h(newOwner, "newOwner");
        Intrinsics.h(visibility, "visibility");
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationM0 = M0(TypeSubstitutor.b);
        copyConfigurationM0.b = newOwner;
        copyConfigurationM0.c = modality;
        copyConfigurationM0.d = visibility;
        copyConfigurationM0.f = CallableMemberDescriptor.Kind.e;
        copyConfigurationM0.m = false;
        CallableDescriptor callableDescriptorJ0 = copyConfigurationM0.x.J0(copyConfigurationM0);
        Intrinsics.f(callableDescriptorJ0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (TypeAliasConstructorDescriptor) callableDescriptorJ0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final TypeAliasConstructorDescriptor H0() {
        FunctionDescriptor functionDescriptorH0 = super.H0();
        Intrinsics.f(functionDescriptorH0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (TypeAliasConstructorDescriptor) functionDescriptorH0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final TypeAliasConstructorDescriptorImpl b(TypeSubstitutor substitutor) {
        Intrinsics.h(substitutor, "substitutor");
        FunctionDescriptor functionDescriptorB = super.b(substitutor);
        Intrinsics.f(functionDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) functionDescriptorB;
        KotlinType kotlinType = typeAliasConstructorDescriptorImpl.j;
        Intrinsics.e(kotlinType);
        ClassConstructorDescriptor classConstructorDescriptorB = this.K.H0().b(TypeSubstitutor.d(kotlinType));
        if (classConstructorDescriptorB == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.K = classConstructorDescriptorB;
        return typeAliasConstructorDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final /* bridge */ /* synthetic */ ConstructorDescriptor b(TypeSubstitutor typeSubstitutor) {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final ClassifierDescriptorWithTypeParameters e() {
        return this.I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final KotlinType getReturnType() {
        KotlinType kotlinType = this.j;
        Intrinsics.e(kotlinType);
        return kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public final boolean k0() {
        return this.K.k0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor e() {
        return this.I;
    }
}
