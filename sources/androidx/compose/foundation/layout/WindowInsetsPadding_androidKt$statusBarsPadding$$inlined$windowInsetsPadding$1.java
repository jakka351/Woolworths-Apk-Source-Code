package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "androidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(359872873);
        WeakHashMap weakHashMap = WindowInsetsHolder.x;
        WindowInsetsHolder windowInsetsHolderC = WindowInsetsHolder.Companion.c(composer);
        boolean zN = composer.n(windowInsetsHolderC);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new InsetsPaddingModifier(windowInsetsHolderC.f);
            composer.A(objG);
        }
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objG;
        composer.l();
        return insetsPaddingModifier;
    }
}
