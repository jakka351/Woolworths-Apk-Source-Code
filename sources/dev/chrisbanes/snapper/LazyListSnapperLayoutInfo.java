package dev.chrisbanes.snapper;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.sequences.TransformingSequence;

@StabilityInferred
@ExperimentalSnapperApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldev/chrisbanes/snapper/LazyListSnapperLayoutInfo;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LazyListSnapperLayoutInfo extends SnapperLayoutInfo {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListState f23780a;
    public final Function2 b;
    public final State c;

    public LazyListSnapperLayoutInfo(LazyListState lazyListState, Function2 snapOffsetForItem) {
        Intrinsics.h(lazyListState, "lazyListState");
        Intrinsics.h(snapOffsetForItem, "snapOffsetForItem");
        this.f23780a = lazyListState;
        this.b = snapOffsetForItem;
        this.c = SnapshotStateKt.d(new Function0<SnapperLayoutItemInfo>() { // from class: dev.chrisbanes.snapper.LazyListSnapperLayoutInfo$currentItem$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo = this.h;
                TransformingSequence.AnonymousClass1 anonymousClass1 = new TransformingSequence.AnonymousClass1();
                Object obj = null;
                while (anonymousClass1.d.hasNext()) {
                    Object next = anonymousClass1.next();
                    SnapperLayoutItemInfo snapperLayoutItemInfo = (SnapperLayoutItemInfo) next;
                    if (snapperLayoutItemInfo.b() <= ((Number) lazyListSnapperLayoutInfo.b.invoke(lazyListSnapperLayoutInfo, snapperLayoutItemInfo)).intValue()) {
                        obj = next;
                    }
                }
                return (SnapperLayoutItemInfo) obj;
            }
        });
    }

    @Override // dev.chrisbanes.snapper.SnapperLayoutInfo
    public final int a() {
        LazyListLayoutInfo lazyListLayoutInfoJ = this.f23780a.j();
        return lazyListLayoutInfoJ.getM() - lazyListLayoutInfoJ.getQ();
    }

    public final boolean b() {
        LazyListState lazyListState = this.f23780a;
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.P(lazyListState.j().f());
        if (lazyListItemInfo == null) {
            return false;
        }
        if (lazyListItemInfo.getF996a() >= lazyListState.j().getN() - 1) {
            if (lazyListItemInfo.getQ() + lazyListItemInfo.getP() <= a()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.F(this.f23780a.j().f());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getF996a() > 0 || lazyListItemInfo.getP() < 0;
        }
        return false;
    }

    public final int d(int i) {
        Object next;
        TransformingSequence.AnonymousClass1 anonymousClass1 = new TransformingSequence.AnonymousClass1();
        while (true) {
            if (!anonymousClass1.d.hasNext()) {
                next = null;
                break;
            }
            next = anonymousClass1.next();
            if (((SnapperLayoutItemInfo) next).a() == i) {
                break;
            }
        }
        SnapperLayoutItemInfo snapperLayoutItemInfo = (SnapperLayoutItemInfo) next;
        Function2 function2 = this.b;
        if (snapperLayoutItemInfo != null) {
            return snapperLayoutItemInfo.b() - ((Number) function2.invoke(this, snapperLayoutItemInfo)).intValue();
        }
        SnapperLayoutItemInfo snapperLayoutItemInfoF = f();
        if (snapperLayoutItemInfoF == null) {
            return 0;
        }
        return (snapperLayoutItemInfoF.b() + MathKt.b(e() * (i - snapperLayoutItemInfoF.a()))) - ((Number) function2.invoke(this, snapperLayoutItemInfoF)).intValue();
    }

    public final float e() {
        Object next;
        LazyListState lazyListState = this.f23780a;
        LazyListLayoutInfo lazyListLayoutInfoJ = lazyListState.j();
        if (lazyListLayoutInfoJ.f().isEmpty()) {
            return -1.0f;
        }
        Iterator it = lazyListLayoutInfoJ.f().iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int p = ((LazyListItemInfo) next).getP();
                do {
                    Object next3 = it.next();
                    int p2 = ((LazyListItemInfo) next3).getP();
                    if (p > p2) {
                        next = next3;
                        p = p2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
        if (lazyListItemInfo == null) {
            return -1.0f;
        }
        Iterator it2 = lazyListLayoutInfoJ.f().iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next2;
                int q = lazyListItemInfo2.getQ() + lazyListItemInfo2.getP();
                do {
                    Object next4 = it2.next();
                    LazyListItemInfo lazyListItemInfo3 = (LazyListItemInfo) next4;
                    int q2 = lazyListItemInfo3.getQ() + lazyListItemInfo3.getP();
                    if (q < q2) {
                        next2 = next4;
                        q = q2;
                    }
                } while (it2.hasNext());
            }
        }
        LazyListItemInfo lazyListItemInfo4 = (LazyListItemInfo) next2;
        if (lazyListItemInfo4 == null) {
            return -1.0f;
        }
        if (Math.max(lazyListItemInfo.getQ() + lazyListItemInfo.getP(), lazyListItemInfo4.getQ() + lazyListItemInfo4.getP()) - Math.min(lazyListItemInfo.getP(), lazyListItemInfo4.getP()) == 0) {
            return -1.0f;
        }
        LazyListLayoutInfo lazyListLayoutInfoJ2 = lazyListState.j();
        int p3 = 0;
        if (lazyListLayoutInfoJ2.f().size() >= 2) {
            LazyListItemInfo lazyListItemInfo5 = (LazyListItemInfo) lazyListLayoutInfoJ2.f().get(0);
            p3 = ((LazyListItemInfo) lazyListLayoutInfoJ2.f().get(1)).getP() - (lazyListItemInfo5.getP() + lazyListItemInfo5.getQ());
        }
        return (r3 + p3) / lazyListLayoutInfoJ.f().size();
    }

    public final SnapperLayoutItemInfo f() {
        return (SnapperLayoutItemInfo) this.c.getD();
    }
}
