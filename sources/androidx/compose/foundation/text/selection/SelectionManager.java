package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMapKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SelectionManager {

    /* renamed from: a, reason: collision with root package name */
    public Offset f1214a;
    public LayoutCoordinates b;
    public SelectionLayout c;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "selectableId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Long, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((Number) obj).longValue();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "isInTouchMode", "", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "rawPosition", "Landroidx/compose/ui/geometry/Offset;", "selectionMode", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "invoke-Rg1IO4c", "(ZLandroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$2, reason: invalid class name */
    final class AnonymousClass2 extends Lambda implements Function4<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, Unit> {
        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            ((Boolean) obj).booleanValue();
            LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj2;
            long jA = ((Offset) obj3).f1751a;
            long jA2 = layoutCoordinates.a();
            Rect rect = new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (jA2 >> 32), (int) (jA2 & 4294967295L));
            if (!SelectionManagerKt.a(jA, rect)) {
                jA = TextLayoutStateKt.a(jA, rect);
            }
            if ((SelectionManager.a(null, layoutCoordinates, jA) & 9223372034707292159L) == 9205357640488583168L) {
                return Unit.f24250a;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isInTouchMode", "", "selectableId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$3, reason: invalid class name */
    final class AnonymousClass3 extends Lambda implements Function2<Boolean, Long, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Boolean) obj).booleanValue();
            ((Number) obj2).longValue();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "", "isInTouchMode", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "newPosition", "Landroidx/compose/ui/geometry/Offset;", "previousPosition", "isStartHandle", "selectionMode", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "invoke-pGV3PM0", "(ZLandroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$4, reason: invalid class name */
    final class AnonymousClass4 extends Lambda implements Function6<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> {
        @Override // kotlin.jvm.functions.Function6
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            ((Boolean) obj).booleanValue();
            LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj2;
            long j = ((Offset) obj3).f1751a;
            long j2 = ((Offset) obj4).f1751a;
            ((Boolean) obj5).booleanValue();
            SelectionManager.a(null, layoutCoordinates, j);
            SelectionManager.a(null, layoutCoordinates, j2);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$5, reason: invalid class name */
    final class AnonymousClass5 extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "selectableKey", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$6, reason: invalid class name */
    final class AnonymousClass6 extends Lambda implements Function1<Long, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((Number) obj).longValue();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "selectableId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$7, reason: invalid class name */
    final class AnonymousClass7 extends Lambda implements Function1<Long, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((Number) obj).longValue();
            throw null;
        }
    }

    public static final long a(SelectionManager selectionManager, LayoutCoordinates layoutCoordinates, long j) {
        LayoutCoordinates layoutCoordinates2 = selectionManager.b;
        if (layoutCoordinates2 == null || !layoutCoordinates2.q()) {
            return 9205357640488583168L;
        }
        return selectionManager.h().M(layoutCoordinates, j);
    }

    public final void b() {
        if (e() != null) {
            throw null;
        }
    }

    public final Selectable c(Selection.AnchorInfo anchorInfo) {
        throw null;
    }

    public final Handle d() {
        throw null;
    }

    public final Selection e() {
        throw null;
    }

    public final boolean f() {
        throw null;
    }

    public final void g() {
        Intrinsics.f(LongObjectMapKt.f686a, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        throw null;
    }

    public final LayoutCoordinates h() {
        LayoutCoordinates layoutCoordinates = this.b;
        if (layoutCoordinates == null) {
            InlineClassHelperKt.b("null coordinates");
            throw new KotlinNothingValueException();
        }
        if (!layoutCoordinates.q()) {
            InlineClassHelperKt.a("unattached coordinates");
        }
        return layoutCoordinates;
    }

    public final void i() {
        h();
        throw null;
    }

    public final void j(boolean z) {
        throw null;
    }

    public final void k(Selection selection) {
        throw null;
    }

    public final void l(boolean z) {
        throw null;
    }

    public final void m() {
        Selection.AnchorInfo anchorInfo;
        Selection.AnchorInfo anchorInfo2;
        Selection selectionE = e();
        LayoutCoordinates layoutCoordinates = this.b;
        Selectable selectableC = (selectionE == null || (anchorInfo2 = selectionE.f1204a) == null) ? null : c(anchorInfo2);
        Selectable selectableC2 = (selectionE == null || (anchorInfo = selectionE.b) == null) ? null : c(anchorInfo);
        LayoutCoordinates layoutCoordinatesA = selectableC != null ? selectableC.a() : null;
        LayoutCoordinates layoutCoordinatesA2 = selectableC2 != null ? selectableC2.a() : null;
        if (selectionE == null || layoutCoordinates == null || !layoutCoordinates.q() || (layoutCoordinatesA == null && layoutCoordinatesA2 == null)) {
            throw null;
        }
        Rect rectC = SelectionManagerKt.c(layoutCoordinates);
        if (layoutCoordinatesA != null) {
            long jD = selectableC.d(selectionE, true);
            if ((9223372034707292159L & jD) != 9205357640488583168L) {
                long jM = layoutCoordinates.M(layoutCoordinatesA, jD);
                new Offset(jM);
                if (d() != Handle.e) {
                    SelectionManagerKt.a(jM, rectC);
                }
            }
        }
        throw null;
    }

    public final boolean n(long j, long j2, boolean z, SelectionAdjustment selectionAdjustment) {
        if (z) {
            Handle handle = Handle.e;
        } else {
            Handle handle2 = Handle.f;
        }
        throw null;
    }
}
