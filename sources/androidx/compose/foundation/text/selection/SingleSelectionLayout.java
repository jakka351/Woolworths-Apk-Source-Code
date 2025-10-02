package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.text.selection.Selection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/SingleSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SingleSelectionLayout implements SelectionLayout {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1219a;
    public final int b;
    public final int c;
    public final Selection d;
    public final SelectableInfo e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/selection/SingleSelectionLayout$Companion;", "", "", "DEFAULT_SELECTABLE_ID", "J", "", "DEFAULT_SLOT", "I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public SingleSelectionLayout(boolean z, int i, int i2, Selection selection, SelectableInfo selectableInfo) {
        this.f1219a = z;
        this.b = i;
        this.c = i2;
        this.d = selection;
        this.e = selectableInfo;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: a, reason: from getter */
    public final boolean getF1219a() {
        return this.f1219a;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: b, reason: from getter */
    public final SelectableInfo getE() {
        return this.e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final CrossStatus c() {
        int i = this.b;
        int i2 = this.c;
        return i < i2 ? CrossStatus.e : i > i2 ? CrossStatus.d : this.e.b();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: d, reason: from getter */
    public final Selection getD() {
        return this.d;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean e(SelectionLayout selectionLayout) {
        if (this.d == null || selectionLayout == null || !(selectionLayout instanceof SingleSelectionLayout) || this.b != selectionLayout.getB() || this.c != selectionLayout.getC() || this.f1219a != selectionLayout.getF1219a()) {
            return true;
        }
        SelectableInfo selectableInfo = ((SingleSelectionLayout) selectionLayout).e;
        SelectableInfo selectableInfo2 = this.e;
        return (selectableInfo2.f1203a == selectableInfo.f1203a && selectableInfo2.c == selectableInfo.c && selectableInfo2.d == selectableInfo.d) ? false : true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo f() {
        return this.e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo g() {
        return this.e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: h, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo i() {
        return this.e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: j, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final void k(Function1 function1) {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final MutableLongObjectMap l(Selection selection) {
        boolean z = selection.c;
        Selection.AnchorInfo anchorInfo = selection.b;
        Selection.AnchorInfo anchorInfo2 = selection.f1204a;
        if ((!z && anchorInfo2.b > anchorInfo.b) || (z && anchorInfo2.b <= anchorInfo.b)) {
            selection = Selection.a(selection, null, null, !z, 3);
        }
        long j = this.e.f1203a;
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f686a;
        MutableLongObjectMap mutableLongObjectMap2 = new MutableLongObjectMap();
        mutableLongObjectMap2.h(j, selection);
        return mutableLongObjectMap2;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f1219a + ", crossed=" + c() + ", info=\n\t" + this.e + ')';
    }
}
