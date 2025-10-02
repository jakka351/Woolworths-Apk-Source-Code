package com.halilibo.richtext.markdown;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.ui.RichTextScope;
import com.halilibo.richtext.ui.RichTextTableCellScope;
import com.halilibo.richtext.ui.RichTextTableRowScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.SequencesKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ AstNode e;

    public /* synthetic */ c(AstNode astNode, int i) {
        this.d = i;
        this.e = astNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AstNode astNode;
        switch (this.d) {
            case 0:
                RichTextTableCellScope Table = (RichTextTableCellScope) obj;
                Intrinsics.h(Table, "$this$Table");
                AstNode astNode2 = (AstNode) SequencesKt.i(TraverseUtilsKt.b(this.e, RenderTableKt$RenderTable$lambda$2$lambda$1$$inlined$filterChildrenType$1.d));
                if (astNode2 != null && (astNode = (AstNode) SequencesKt.i(TraverseUtilsKt.b(astNode2, RenderTableKt$RenderTable$lambda$2$lambda$1$$inlined$filterChildrenType$2.d))) != null) {
                    FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
                    while (anonymousClass1.hasNext()) {
                        final AstNode astNode3 = (AstNode) anonymousClass1.next();
                        Table.a(new ComposableLambdaImpl(new Function3<RichTextScope, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.markdown.RenderTableKt$RenderTable$1$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                RichTextScope cell = (RichTextScope) obj2;
                                Composer composer = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(cell, "$this$cell");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer.n(cell) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer.c()) {
                                    composer.j();
                                } else {
                                    MarkdownRichTextKt.a(cell, astNode3, null, composer, iIntValue & 14, 2);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1584786501));
                    }
                }
                break;
            case 1:
                RichTextTableCellScope row = (RichTextTableCellScope) obj;
                Intrinsics.h(row, "$this$row");
                FilteringSequence.AnonymousClass1 anonymousClass12 = new FilteringSequence.AnonymousClass1();
                while (anonymousClass12.hasNext()) {
                    final AstNode astNode4 = (AstNode) anonymousClass12.next();
                    row.a(new ComposableLambdaImpl(new Function3<RichTextScope, Composer, Integer, Unit>() { // from class: com.halilibo.richtext.markdown.RenderTableKt$RenderTable$2$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            RichTextScope cell = (RichTextScope) obj2;
                            Composer composer = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            Intrinsics.h(cell, "$this$cell");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= composer.n(cell) ? 4 : 2;
                            }
                            if ((iIntValue & 19) == 18 && composer.c()) {
                                composer.j();
                            } else {
                                MarkdownRichTextKt.a(cell, astNode4, null, composer, iIntValue & 14, 2);
                            }
                            return Unit.f24250a;
                        }
                    }, true, -314008657));
                }
                break;
            default:
                RichTextTableRowScope Table2 = (RichTextTableRowScope) obj;
                Intrinsics.h(Table2, "$this$Table");
                AstNode astNode5 = (AstNode) SequencesKt.i(TraverseUtilsKt.b(this.e, RenderTableKt$RenderTable$lambda$7$lambda$6$$inlined$filterChildrenType$1.d));
                if (astNode5 != null) {
                    FilteringSequence.AnonymousClass1 anonymousClass13 = new FilteringSequence.AnonymousClass1();
                    while (anonymousClass13.hasNext()) {
                        Table2.a(new c((AstNode) anonymousClass13.next(), 1));
                    }
                }
                break;
        }
        return Unit.f24250a;
    }
}
