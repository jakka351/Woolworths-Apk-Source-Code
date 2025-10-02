package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class OverridingUtilsKt {
    public static final Collection a(Collection collection, Function1 function1) {
        Intrinsics.h(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i = SmartSet.f;
        SmartSet smartSetA = SmartSet.Companion.a();
        while (!linkedList.isEmpty()) {
            Object objD = CollectionsKt.D(linkedList);
            int i2 = SmartSet.f;
            final SmartSet smartSetA2 = SmartSet.Companion.a();
            ArrayList arrayListG = OverridingUtil.g(objD, linkedList, function1, new Function1(smartSetA2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$$Lambda$1
                public final SmartSet d;

                {
                    this.d = smartSetA2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Intrinsics.e(obj);
                    this.d.add(obj);
                    return Unit.f24250a;
                }
            });
            if (arrayListG.size() == 1 && smartSetA2.isEmpty()) {
                Object objM0 = CollectionsKt.m0(arrayListG);
                Intrinsics.g(objM0, "single(...)");
                smartSetA.add(objM0);
            } else {
                Object objS = OverridingUtil.s(arrayListG, function1);
                CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(objS);
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.e(next);
                    if (!OverridingUtil.k(callableDescriptor, (CallableDescriptor) function1.invoke(next))) {
                        smartSetA2.add(next);
                    }
                }
                if (!smartSetA2.isEmpty()) {
                    smartSetA.addAll(smartSetA2);
                }
                smartSetA.add(objS);
            }
        }
        return smartSetA;
    }
}
