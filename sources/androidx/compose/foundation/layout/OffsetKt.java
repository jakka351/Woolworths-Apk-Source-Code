package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OffsetKt {
    public static final Modifier a(Modifier modifier, final Function1 function1) {
        return modifier.x0(new OffsetPxElement(function1, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((InspectorInfo) obj).getClass();
                throw null;
            }
        }));
    }

    public static final Modifier b(Modifier modifier, float f, float f2) {
        return modifier.x0(new OffsetElement(f, f2, new OffsetKt$offset$1(1)));
    }

    public static Modifier c(Modifier modifier, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return b(modifier, f, f2);
    }
}
