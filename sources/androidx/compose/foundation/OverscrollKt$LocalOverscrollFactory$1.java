package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/OverscrollFactory;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OverscrollKt$LocalOverscrollFactory$1 extends Lambda implements Function1<CompositionLocalAccessorScope, OverscrollFactory> {
    public static final OverscrollKt$LocalOverscrollFactory$1 h = new OverscrollKt$LocalOverscrollFactory$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CompositionLocalAccessorScope compositionLocalAccessorScope = (CompositionLocalAccessorScope) obj;
        int i = AndroidOverscroll_androidKt.f826a;
        Context context = (Context) compositionLocalAccessorScope.C(AndroidCompositionLocals_androidKt.b);
        Density density = (Density) compositionLocalAccessorScope.C(CompositionLocalsKt.h);
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) compositionLocalAccessorScope.C(OverscrollConfiguration_androidKt.f843a);
        if (overscrollConfiguration == null) {
            return null;
        }
        return new AndroidEdgeEffectOverscrollFactory(context, density, overscrollConfiguration.f842a, overscrollConfiguration.b);
    }
}
