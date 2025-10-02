package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/MovableContentState;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InternalComposeApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MovableContentState {

    /* renamed from: a, reason: collision with root package name */
    public final SlotTable f1646a;

    public MovableContentState(SlotTable slotTable) {
        this.f1646a = slotTable;
    }

    public static final void a(SlotWriter slotWriter, int i) {
        while (slotWriter.v >= 0 && slotWriter.u <= i) {
            slotWriter.L();
            slotWriter.i();
        }
    }

    public final MutableScatterMap b(Applier applier, ObjectList objectList) {
        SlotTable slotTable;
        int i;
        Object[] objArr = objectList.f694a;
        int i2 = objectList.b;
        int i3 = 0;
        while (true) {
            slotTable = this.f1646a;
            if (i3 >= i2) {
                break;
            }
            if (slotTable.n(((MovableContentStateReference) objArr[i3]).e)) {
                i3++;
            } else {
                MutableObjectList mutableObjectList = new MutableObjectList();
                Object[] objArr2 = objectList.f694a;
                int i4 = objectList.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj = objArr2[i5];
                    if (slotTable.n(((MovableContentStateReference) obj).e)) {
                        mutableObjectList.g(obj);
                    }
                }
                objectList = mutableObjectList;
            }
        }
        final Function1<MovableContentStateReference, Integer> function1 = new Function1<MovableContentStateReference, Integer>() { // from class: androidx.compose.runtime.MovableContentState$extractNestedStates$referencesToExtract$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Integer.valueOf(this.h.f1646a.j(((MovableContentStateReference) obj2).e));
            }
        };
        if (objectList.b > 1) {
            Comparable comparable = (Comparable) function1.invoke(objectList.b(0));
            int i6 = objectList.b;
            int i7 = 1;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                Comparable comparable2 = (Comparable) function1.invoke(objectList.b(i7));
                if (comparable.compareTo(comparable2) > 0) {
                    MutableObjectList mutableObjectList2 = new MutableObjectList(objectList.b);
                    Object[] objArr3 = objectList.f694a;
                    int i8 = objectList.b;
                    for (int i9 = 0; i9 < i8; i9++) {
                        mutableObjectList2.g(objArr3[i9]);
                    }
                    List listI = mutableObjectList2.i();
                    if (listI.size() > 1) {
                        CollectionsKt.s0(listI, new Comparator() { // from class: androidx.compose.runtime.collection.ExtensionsKt$sortBy$$inlined$sortBy$1
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                Function1 function12 = function1;
                                return ComparisonsKt.a((Comparable) function12.invoke(obj2), (Comparable) function12.invoke(obj3));
                            }
                        });
                    }
                    objectList = mutableObjectList2;
                } else {
                    i7++;
                    comparable = comparable2;
                }
            }
        }
        if (objectList.d()) {
            MutableScatterMap mutableScatterMap = ScatterMapKt.b;
            Intrinsics.f(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
            return mutableScatterMap;
        }
        long[] jArr = ScatterMapKt.f699a;
        MutableScatterMap mutableScatterMap2 = new MutableScatterMap();
        SlotWriter slotWriterM = slotTable.m();
        try {
            Object[] objArr4 = objectList.f694a;
            int i10 = objectList.b;
            for (int i11 = 0; i11 < i10; i11++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr4[i11];
                int iC = slotWriterM.c(movableContentStateReference.e);
                int iE = slotWriterM.E(iC, slotWriterM.b);
                a(slotWriterM, iE);
                a(slotWriterM, iE);
                while (true) {
                    i = slotWriterM.t;
                    if (i == iE || i == slotWriterM.u) {
                        break;
                    }
                    if (iE < slotWriterM.s(i) + i) {
                        slotWriterM.P();
                    } else {
                        slotWriterM.K();
                    }
                }
                if (i != iE) {
                    ComposerKt.c("Unexpected slot table structure");
                }
                slotWriterM.P();
                slotWriterM.a(iC - slotWriterM.t);
                mutableScatterMap2.m(movableContentStateReference, ComposerKt.f(movableContentStateReference.c, movableContentStateReference, slotWriterM, applier));
            }
            a(slotWriterM, Integer.MAX_VALUE);
            slotWriterM.e(true);
            return mutableScatterMap2;
        } catch (Throwable th) {
            slotWriterM.e(false);
            throw th;
        }
    }

    /* renamed from: c, reason: from getter */
    public final SlotTable getF1646a() {
        return this.f1646a;
    }
}
