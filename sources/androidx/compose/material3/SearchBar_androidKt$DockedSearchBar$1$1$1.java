package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SearchBar_androidKt$DockedSearchBar$1$1$1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        float f = ((Configuration) composer.x(AndroidCompositionLocals_androidKt.f1950a)).screenHeightDp;
        boolean zQ = composer.q(f);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (zQ || objG == composer$Companion$Empty$1) {
            objG = new Dp(f * 0.6666667f);
            composer.A(objG);
        }
        float f2 = ((Dp) objG).d;
        boolean zQ2 = composer.q(f2);
        Object objG2 = composer.G();
        if (zQ2 || objG2 == composer$Companion$Empty$1) {
            Dp dp = new Dp(SearchBar_androidKt.b);
            Dp dp2 = new Dp(f2);
            if (dp.compareTo(dp2) > 0) {
                dp = dp2;
            }
            Dp dp3 = new Dp(dp.d);
            composer.A(dp3);
            objG2 = dp3;
        }
        SizeKt.h(Modifier.Companion.d, ((Dp) objG2).d, f2);
        throw null;
    }
}
