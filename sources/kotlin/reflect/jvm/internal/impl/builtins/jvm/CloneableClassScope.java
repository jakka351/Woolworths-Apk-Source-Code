package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes7.dex */
public final class CloneableClassScope extends GivenFunctionsMemberScope {
    public static final Name e = Name.e("clone");

    public static final class Companion {
        public static Name a() {
            return CloneableClassScope.e;
        }
    }

    public CloneableClassScope(ClassDescriptorImpl classDescriptorImpl, LockBasedStorageManager lockBasedStorageManager) {
        super(lockBasedStorageManager, classDescriptorImpl);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public final List h() {
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.d;
        SourceElement sourceElement = SourceElement.f24343a;
        AbstractClassDescriptor abstractClassDescriptor = this.b;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplS0 = SimpleFunctionDescriptorImpl.S0(abstractClassDescriptor, e, kind, sourceElement);
        ReceiverParameterDescriptor receiverParameterDescriptorU = abstractClassDescriptor.U();
        SimpleType simpleTypeE = DescriptorUtilsKt.e(abstractClassDescriptor).e();
        Modality modality = Modality.g;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.c;
        EmptyList emptyList = EmptyList.d;
        simpleFunctionDescriptorImplS0.L0(null, receiverParameterDescriptorU, emptyList, emptyList, emptyList, simpleTypeE, modality, descriptorVisibility);
        return CollectionsKt.Q(simpleFunctionDescriptorImplS0);
    }
}
