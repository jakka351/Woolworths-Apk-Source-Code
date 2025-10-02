package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes7.dex */
public abstract class OverridingStrategy {
    public abstract void a(CallableMemberDescriptor callableMemberDescriptor);

    public void b(CallableMemberDescriptor member, Collection collection) {
        Intrinsics.h(member, "member");
        member.Q(collection);
    }
}
