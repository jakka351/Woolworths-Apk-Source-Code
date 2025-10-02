package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/Selectable;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Selectable {
    LayoutCoordinates a();

    float b(int i);

    float c(int i);

    long d(Selection selection, boolean z);

    int e();

    float f(int i);

    /* renamed from: g */
    long getF1202a();

    AnnotatedString getText();

    Selection h();

    void i(SelectionLayoutBuilder selectionLayoutBuilder);

    long j(int i);
}
