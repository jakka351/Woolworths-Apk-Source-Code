package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;

/* loaded from: classes7.dex */
public final class VisibilityUtilKt {
    public static final CallableMemberDescriptor a(LinkedList linkedList) {
        Integer numB;
        linkedList.isEmpty();
        Iterator it = linkedList.iterator();
        CallableMemberDescriptor callableMemberDescriptor = null;
        while (it.hasNext()) {
            CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) it.next();
            if (callableMemberDescriptor == null || ((numB = DescriptorVisibilities.b(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && numB.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        Intrinsics.e(callableMemberDescriptor);
        return callableMemberDescriptor;
    }
}
