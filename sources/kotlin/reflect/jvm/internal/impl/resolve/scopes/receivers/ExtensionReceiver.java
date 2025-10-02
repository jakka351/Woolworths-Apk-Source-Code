package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
public class ExtensionReceiver extends AbstractReceiverValue implements ImplicitReceiver {
    public final DeclarationDescriptorNonRootImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExtensionReceiver(CallableDescriptor callableDescriptor, KotlinType kotlinType, ReceiverValue receiverValue) {
        super(kotlinType, receiverValue);
        if (kotlinType == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.c = (DeclarationDescriptorNonRootImpl) callableDescriptor;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.c + "}";
    }
}
