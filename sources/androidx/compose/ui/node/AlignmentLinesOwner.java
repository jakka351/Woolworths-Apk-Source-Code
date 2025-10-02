package androidx.compose.ui.node;

import androidx.compose.ui.layout.Measurable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/layout/Measurable;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AlignmentLinesOwner extends Measurable {
    void I();

    AlignmentLinesOwner O();

    void R();

    InnerNodeCoordinator U();

    void f0(Function1 function1);

    AlignmentLines o();

    void requestLayout();

    boolean u();
}
