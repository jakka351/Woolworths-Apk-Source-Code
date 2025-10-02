package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
public final class ContextClassReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {
    public final ClassDescriptor c;
    public final Name d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextClassReceiver(ClassDescriptor classDescriptor, KotlinType receiverType, Name name) {
        super(receiverType, null);
        Intrinsics.h(receiverType, "receiverType");
        this.c = classDescriptor;
        this.d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public final Name a() {
        return this.d;
    }

    public final String toString() {
        return getType() + ": Ctx { " + this.c + " }";
    }
}
