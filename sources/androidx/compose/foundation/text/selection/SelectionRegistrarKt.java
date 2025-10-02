package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionRegistrarKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f1217a = new DynamicProvidableCompositionLocal(SelectionRegistrarKt$LocalSelectionRegistrar$1.h);

    public static final boolean a(SelectionRegistrar selectionRegistrar, long j) {
        LongObjectMap longObjectMapF = selectionRegistrar.f();
        if (longObjectMapF != null) {
            return longObjectMapF.a(j);
        }
        return false;
    }
}
