package androidx.compose.foundation.text.selection;

import androidx.collection.MutableLongObjectMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayout;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SelectionLayout {
    boolean a();

    SelectableInfo b();

    CrossStatus c();

    Selection d();

    boolean e(SelectionLayout selectionLayout);

    SelectableInfo f();

    SelectableInfo g();

    int getSize();

    int h();

    SelectableInfo i();

    int j();

    void k(Function1 function1);

    MutableLongObjectMap l(Selection selection);
}
