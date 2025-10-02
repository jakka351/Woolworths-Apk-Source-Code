package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.selection.Selection;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MultiSelectionLayout implements SelectionLayout {

    /* renamed from: a, reason: collision with root package name */
    public final LongIntMap f1201a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Selection f;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CrossStatus crossStatus = CrossStatus.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CrossStatus crossStatus2 = CrossStatus.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MultiSelectionLayout(MutableLongIntMap mutableLongIntMap, List list, int i, int i2, boolean z, Selection selection) {
        this.f1201a = mutableLongIntMap;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = selection;
        if (list.size() > 1) {
            return;
        }
        InlineClassHelperKt.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + JwtParser.SEPARATOR_CHAR);
    }

    public static void m(MutableLongObjectMap mutableLongObjectMap, Selection selection, SelectableInfo selectableInfo, int i, int i2) {
        Selection selection2;
        if (selection.c) {
            selection2 = new Selection(selectableInfo.a(i2), selectableInfo.a(i), i2 > i);
        } else {
            selection2 = new Selection(selectableInfo.a(i), selectableInfo.a(i2), i > i2);
        }
        if (i > i2) {
            InlineClassHelperKt.c("minOffset should be less than or equal to maxOffset: " + selection2);
        }
        long j = selectableInfo.f1203a;
        int iD = mutableLongObjectMap.d(j);
        Object[] objArr = mutableLongObjectMap.c;
        Object obj = objArr[iD];
        mutableLongObjectMap.b[iD] = j;
        objArr[iD] = selection2;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: a, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: b */
    public final SelectableInfo getE() {
        return this.e ? g() : f();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final CrossStatus c() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return CrossStatus.e;
        }
        if (i > i2) {
            return CrossStatus.d;
        }
        return ((SelectableInfo) this.b.get(i / 2)).b();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: d, reason: from getter */
    public final Selection getF() {
        return this.f;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean e(SelectionLayout selectionLayout) {
        if (this.f != null && selectionLayout != null && (selectionLayout instanceof MultiSelectionLayout) && this.e == selectionLayout.getE() && this.c == selectionLayout.getC() && this.d == selectionLayout.getD()) {
            List list = ((MultiSelectionLayout) selectionLayout).b;
            List list2 = this.b;
            if (list2.size() == list.size()) {
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    SelectableInfo selectableInfo = (SelectableInfo) list2.get(i);
                    SelectableInfo selectableInfo2 = (SelectableInfo) list.get(i);
                    if (selectableInfo.f1203a != selectableInfo2.f1203a || selectableInfo.c != selectableInfo2.c || selectableInfo.d != selectableInfo2.d) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo f() {
        return (SelectableInfo) this.b.get(o(this.d, false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo g() {
        return (SelectableInfo) this.b.get(o(this.c, true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getSize() {
        return this.b.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: h, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo i() {
        return c() == CrossStatus.d ? f() : g();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* renamed from: j, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final void k(Function1 function1) {
        int iN = n(i().f1203a);
        int iN2 = n((c() == CrossStatus.d ? g() : f()).f1203a);
        int i = iN + 1;
        if (i >= iN2) {
            return;
        }
        while (i < iN2) {
            function1.invoke(this.b.get(i));
            i++;
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final MutableLongObjectMap l(final Selection selection) {
        Selection.AnchorInfo anchorInfo = selection.f1204a;
        boolean z = selection.c;
        long j = anchorInfo.c;
        int i = anchorInfo.b;
        Selection.AnchorInfo anchorInfo2 = selection.b;
        long j2 = anchorInfo2.c;
        int i2 = anchorInfo2.b;
        if (j != j2) {
            MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f686a;
            final MutableLongObjectMap mutableLongObjectMap2 = new MutableLongObjectMap();
            m(mutableLongObjectMap2, selection, i(), (z ? anchorInfo2 : anchorInfo).b, i().f.f2064a.f2063a.e.length());
            k(new Function1<SelectableInfo, Unit>(this) { // from class: androidx.compose.foundation.text.selection.MultiSelectionLayout$createSubSelections$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    SelectableInfo selectableInfo = (SelectableInfo) obj;
                    MultiSelectionLayout.m(mutableLongObjectMap2, selection, selectableInfo, 0, selectableInfo.f.f2064a.f2063a.e.length());
                    return Unit.f24250a;
                }
            });
            if (!z) {
                anchorInfo = anchorInfo2;
            }
            m(mutableLongObjectMap2, selection, c() == CrossStatus.d ? g() : f(), 0, anchorInfo.b);
            return mutableLongObjectMap2;
        }
        if ((!z || i < i2) && (z || i > i2)) {
            InlineClassHelperKt.c("unexpectedly miss-crossed selection: " + selection);
        }
        long j3 = anchorInfo.c;
        MutableLongObjectMap mutableLongObjectMap3 = LongObjectMapKt.f686a;
        MutableLongObjectMap mutableLongObjectMap4 = new MutableLongObjectMap();
        mutableLongObjectMap4.h(j3, selection);
        return mutableLongObjectMap4;
    }

    public final int n(long j) {
        try {
            return this.f1201a.b(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(androidx.camera.core.impl.b.k(j, "Invalid selectableId: "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(int i, boolean z) {
        int iOrdinal = c().ordinal();
        int i2 = z;
        if (iOrdinal == 0) {
            i2 = z == 0 ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return (i - (i2 ^ 1)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        float f = 2;
        sb.append((this.c + 1) / f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / f);
        sb.append(", crossed=");
        sb.append(c());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            SelectableInfo selectableInfo = (SelectableInfo) list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(selectableInfo);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String string = sb2.toString();
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }
}
