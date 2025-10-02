package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {
    public final DeclarationDescriptorNonRootImpl c;
    public final Name d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContextReceiver(CallableDescriptor callableDescriptor, KotlinType receiverType, Name name, ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        Intrinsics.h(receiverType, "receiverType");
        this.c = (DeclarationDescriptorNonRootImpl) callableDescriptor;
        this.d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public final Name a() {
        return this.d;
    }

    public final String toString() {
        return "Cxt { " + this.c + " }";
    }
}
