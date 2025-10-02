package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/LayoutInfo;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LayoutInfo {
    int getHeight();

    int getWidth();

    boolean q();

    boolean u();

    LayoutCoordinates v();

    /* renamed from: w */
    int getE();

    LayoutNode x();

    List y();

    /* renamed from: z */
    default boolean getU() {
        return false;
    }
}
