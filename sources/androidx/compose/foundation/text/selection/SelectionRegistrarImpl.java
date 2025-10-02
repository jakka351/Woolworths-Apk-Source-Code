package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1216a;
    public final ArrayList b = new ArrayList();
    public final MutableLongObjectMap c;
    public final AtomicLong d;
    public final MutableState e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        new SaverKt$Saver$1(SelectionRegistrarImpl$Companion$Saver$2.h, SelectionRegistrarImpl$Companion$Saver$1.h);
    }

    public SelectionRegistrarImpl(long j) {
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f686a;
        this.c = new MutableLongObjectMap();
        this.d = new AtomicLong(j);
        MutableLongObjectMap mutableLongObjectMap2 = LongObjectMapKt.f686a;
        Intrinsics.f(mutableLongObjectMap2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.e = SnapshotStateKt.f(mutableLongObjectMap2);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void a(long j) {
        this.f1216a = false;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void b(Selectable selectable) {
        long f1202a = selectable.getF1202a();
        MutableLongObjectMap mutableLongObjectMap = this.c;
        if (mutableLongObjectMap.a(f1202a)) {
            this.b.remove(selectable);
            mutableLongObjectMap.g(selectable.getF1202a());
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void c() {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final boolean d(LayoutCoordinates layoutCoordinates, long j, long j2, SelectionAdjustment selectionAdjustment, boolean z) {
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final long e() {
        AtomicLong atomicLong = this.d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final LongObjectMap f() {
        return (LongObjectMap) ((SnapshotMutableStateImpl) this.e).getD();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void g(long j) {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final Selectable h(MultiWidgetSelectionDelegate multiWidgetSelectionDelegate) {
        long j = multiWidgetSelectionDelegate.f1202a;
        if (j == 0) {
            InlineClassHelperKt.a("The selectable contains an invalid id: " + j);
        }
        MutableLongObjectMap mutableLongObjectMap = this.c;
        if (mutableLongObjectMap.a(j)) {
            InlineClassHelperKt.a("Another selectable with the id: " + multiWidgetSelectionDelegate + ".selectableId has already subscribed.");
        }
        mutableLongObjectMap.h(j, multiWidgetSelectionDelegate);
        this.b.add(multiWidgetSelectionDelegate);
        this.f1216a = false;
        return multiWidgetSelectionDelegate;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void i(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment, boolean z) {
    }

    public final ArrayList j(final LayoutCoordinates layoutCoordinates) {
        boolean z = this.f1216a;
        ArrayList arrayList = this.b;
        if (!z) {
            CollectionsKt.s0(arrayList, new b(0, new Function2<Selectable, Selectable, Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$sort$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    LayoutCoordinates layoutCoordinatesA = ((Selectable) obj).a();
                    LayoutCoordinates layoutCoordinatesA2 = ((Selectable) obj2).a();
                    LayoutCoordinates layoutCoordinates2 = layoutCoordinates;
                    long jM = layoutCoordinatesA != null ? layoutCoordinates2.M(layoutCoordinatesA, 0L) : 0L;
                    long jM2 = layoutCoordinatesA2 != null ? layoutCoordinates2.M(layoutCoordinatesA2, 0L) : 0L;
                    int i = (int) (jM & 4294967295L);
                    int i2 = (int) (4294967295L & jM2);
                    return Integer.valueOf(Float.intBitsToFloat(i) == Float.intBitsToFloat(i2) ? ComparisonsKt.a(Float.valueOf(Float.intBitsToFloat((int) (jM >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jM2 >> 32)))) : ComparisonsKt.a(Float.valueOf(Float.intBitsToFloat(i)), Float.valueOf(Float.intBitsToFloat(i2))));
                }
            }));
            this.f1216a = true;
        }
        return arrayList;
    }
}
