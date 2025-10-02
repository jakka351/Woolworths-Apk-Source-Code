package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes.dex */
public final class ErrorClassDescriptor extends ClassDescriptorImpl {
    /* JADX WARN: Illegal instructions before constructor call */
    public ErrorClassDescriptor(Name name) {
        ErrorUtils errorUtils = ErrorUtils.f24634a;
        ErrorModuleDescriptor errorModuleDescriptor = ErrorUtils.b;
        Modality modality = Modality.g;
        ClassKind classKind = ClassKind.d;
        StorageManager storageManager = LockBasedStorageManager.e;
        List list = EmptyList.d;
        super(errorModuleDescriptor, name, modality, classKind, list, storageManager);
        ClassConstructorDescriptorImpl classConstructorDescriptorImpl = new ClassConstructorDescriptorImpl(this, null, Annotations.Companion.f24350a, true, CallableMemberDescriptor.Kind.d, SourceElement.f24343a);
        classConstructorDescriptorImpl.T0(list, DescriptorVisibilities.d);
        ErrorScope errorScopeB = ErrorUtils.b(ErrorScopeKind.i, classConstructorDescriptorImpl.getName().d, "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.y;
        classConstructorDescriptorImpl.j = new ErrorType(ErrorUtils.d(errorTypeKind, new String[0]), errorScopeB, errorTypeKind, list, false, new String[0]);
        I0(errorScopeB, SetsKt.i(classConstructorDescriptorImpl), classConstructorDescriptorImpl);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor
    /* renamed from: H0 */
    public final ClassDescriptor b(TypeSubstitutor substitutor) {
        Intrinsics.h(substitutor, "substitutor");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final DeclarationDescriptorNonRoot b(TypeSubstitutor substitutor) {
        Intrinsics.h(substitutor, "substitutor");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope n0(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        return ErrorUtils.b(ErrorScopeKind.i, getName().d, typeSubstitution.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl
    public final String toString() {
        String strB = getName().b();
        Intrinsics.g(strB, "asString(...)");
        return strB;
    }
}
