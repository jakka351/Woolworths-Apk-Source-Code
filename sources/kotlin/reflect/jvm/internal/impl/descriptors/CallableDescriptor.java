package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes.dex */
public interface CallableDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility, Substitutable<CallableDescriptor> {

    /* loaded from: classes7.dex */
    public interface UserDataKey<V> {
    }

    List A0();

    Object M(UserDataKey userDataKey);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    CallableDescriptor a();

    ReceiverParameterDescriptor c0();

    ReceiverParameterDescriptor e0();

    KotlinType getReturnType();

    List getTypeParameters();

    List h();

    boolean m0();

    Collection q();
}
