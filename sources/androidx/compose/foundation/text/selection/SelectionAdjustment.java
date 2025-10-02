package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SelectionAdjustment {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1206a;
        public static final a b;
        public static final a c;
        public static final a d;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.selection.a] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.text.selection.a] */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.text.selection.a] */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.text.selection.a] */
        static {
            final int i = 3;
            f1206a = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.a
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection a(SelectionLayout selectionLayout) {
                    Selection.AnchorInfo anchorInfoB;
                    Selection.AnchorInfo anchorInfoB2;
                    switch (i) {
                        case 0:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f1208a);
                        case 1:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Paragraph$1$1.f1207a);
                        case 2:
                            Selection selectionD = selectionLayout.d();
                            if (selectionD == null) {
                                return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f1208a);
                            }
                            Selection.AnchorInfo anchorInfo = selectionD.b;
                            Selection.AnchorInfo anchorInfo2 = selectionD.f1204a;
                            if (selectionLayout.a()) {
                                anchorInfoB2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.g(), anchorInfo2);
                                anchorInfoB = anchorInfo;
                                anchorInfo = anchorInfo2;
                                anchorInfo2 = anchorInfoB2;
                            } else {
                                anchorInfoB = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.f(), anchorInfo);
                                anchorInfoB2 = anchorInfoB;
                            }
                            if (Intrinsics.c(anchorInfoB2, anchorInfo)) {
                                return selectionD;
                            }
                            return SelectionAdjustmentKt.e(new Selection(anchorInfo2, anchorInfoB, selectionLayout.c() == CrossStatus.d || (selectionLayout.c() == CrossStatus.f && anchorInfo2.b > anchorInfoB.b)), selectionLayout);
                        case 3:
                            return new Selection(selectionLayout.g().a(selectionLayout.g().c), selectionLayout.f().a(selectionLayout.f().d), selectionLayout.c() == CrossStatus.d);
                        default:
                            return SelectionAdjustmentKt.e(new Selection(selectionLayout.g().a(selectionLayout.g().c), selectionLayout.f().a(selectionLayout.f().d), selectionLayout.c() == CrossStatus.d), selectionLayout);
                    }
                }
            };
            final int i2 = 0;
            b = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.a
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection a(SelectionLayout selectionLayout) {
                    Selection.AnchorInfo anchorInfoB;
                    Selection.AnchorInfo anchorInfoB2;
                    switch (i2) {
                        case 0:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f1208a);
                        case 1:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Paragraph$1$1.f1207a);
                        case 2:
                            Selection selectionD = selectionLayout.d();
                            if (selectionD == null) {
                                return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f1208a);
                            }
                            Selection.AnchorInfo anchorInfo = selectionD.b;
                            Selection.AnchorInfo anchorInfo2 = selectionD.f1204a;
                            if (selectionLayout.a()) {
                                anchorInfoB2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.g(), anchorInfo2);
                                anchorInfoB = anchorInfo;
                                anchorInfo = anchorInfo2;
                                anchorInfo2 = anchorInfoB2;
                            } else {
                                anchorInfoB = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.f(), anchorInfo);
                                anchorInfoB2 = anchorInfoB;
                            }
                            if (Intrinsics.c(anchorInfoB2, anchorInfo)) {
                                return selectionD;
                            }
                            return SelectionAdjustmentKt.e(new Selection(anchorInfo2, anchorInfoB, selectionLayout.c() == CrossStatus.d || (selectionLayout.c() == CrossStatus.f && anchorInfo2.b > anchorInfoB.b)), selectionLayout);
                        case 3:
                            return new Selection(selectionLayout.g().a(selectionLayout.g().c), selectionLayout.f().a(selectionLayout.f().d), selectionLayout.c() == CrossStatus.d);
                        default:
                            return SelectionAdjustmentKt.e(new Selection(selectionLayout.g().a(selectionLayout.g().c), selectionLayout.f().a(selectionLayout.f().d), selectionLayout.c() == CrossStatus.d), selectionLayout);
                    }
                }
            };
            final int i3 = 1;
            c = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.a
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection a(SelectionLayout selectionLayout) {
                    Selection.AnchorInfo anchorInfoB;
                    Selection.AnchorInfo anchorInfoB2;
                    switch (i3) {
                        case 0:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f1208a);
                        case 1:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Paragraph$1$1.f1207a);
                        case 2:
                            Selection selectionD = selectionLayout.d();
                            if (selectionD == null) {
                                return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f1208a);
                            }
                            Selection.AnchorInfo anchorInfo = selectionD.b;
                            Selection.AnchorInfo anchorInfo2 = selectionD.f1204a;
                            if (selectionLayout.a()) {
                                anchorInfoB2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.g(), anchorInfo2);
                                anchorInfoB = anchorInfo;
                                anchorInfo = anchorInfo2;
                                anchorInfo2 = anchorInfoB2;
                            } else {
                                anchorInfoB = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.f(), anchorInfo);
                                anchorInfoB2 = anchorInfoB;
                            }
                            if (Intrinsics.c(anchorInfoB2, anchorInfo)) {
                                return selectionD;
                            }
                            return SelectionAdjustmentKt.e(new Selection(anchorInfo2, anchorInfoB, selectionLayout.c() == CrossStatus.d || (selectionLayout.c() == CrossStatus.f && anchorInfo2.b > anchorInfoB.b)), selectionLayout);
                        case 3:
                            return new Selection(selectionLayout.g().a(selectionLayout.g().c), selectionLayout.f().a(selectionLayout.f().d), selectionLayout.c() == CrossStatus.d);
                        default:
                            return SelectionAdjustmentKt.e(new Selection(selectionLayout.g().a(selectionLayout.g().c), selectionLayout.f().a(selectionLayout.f().d), selectionLayout.c() == CrossStatus.d), selectionLayout);
                    }
                }
            };
            final int i4 = 2;
            d = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.a
                @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
                public final Selection a(SelectionLayout selectionLayout) {
                    Selection.AnchorInfo anchorInfoB;
                    Selection.AnchorInfo anchorInfoB2;
                    switch (i4) {
                        case 0:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f1208a);
                        case 1:
                            return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Paragraph$1$1.f1207a);
                        case 2:
                            Selection selectionD = selectionLayout.d();
                            if (selectionD == null) {
                                return SelectionAdjustmentKt.a(selectionLayout, SelectionAdjustment$Companion$Word$1$1.f1208a);
                            }
                            Selection.AnchorInfo anchorInfo = selectionD.b;
                            Selection.AnchorInfo anchorInfo2 = selectionD.f1204a;
                            if (selectionLayout.a()) {
                                anchorInfoB2 = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.g(), anchorInfo2);
                                anchorInfoB = anchorInfo;
                                anchorInfo = anchorInfo2;
                                anchorInfo2 = anchorInfoB2;
                            } else {
                                anchorInfoB = SelectionAdjustmentKt.b(selectionLayout, selectionLayout.f(), anchorInfo);
                                anchorInfoB2 = anchorInfoB;
                            }
                            if (Intrinsics.c(anchorInfoB2, anchorInfo)) {
                                return selectionD;
                            }
                            return SelectionAdjustmentKt.e(new Selection(anchorInfo2, anchorInfoB, selectionLayout.c() == CrossStatus.d || (selectionLayout.c() == CrossStatus.f && anchorInfo2.b > anchorInfoB.b)), selectionLayout);
                        case 3:
                            return new Selection(selectionLayout.g().a(selectionLayout.g().c), selectionLayout.f().a(selectionLayout.f().d), selectionLayout.c() == CrossStatus.d);
                        default:
                            return SelectionAdjustmentKt.e(new Selection(selectionLayout.g().a(selectionLayout.g().c), selectionLayout.f().a(selectionLayout.f().d), selectionLayout.c() == CrossStatus.d), selectionLayout);
                    }
                }
            };
        }
    }

    Selection a(SelectionLayout selectionLayout);
}
