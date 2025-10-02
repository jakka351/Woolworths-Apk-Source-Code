package au.com.woolworths.shop.lists.ui.utils;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import au.com.woolworths.foundation.rewards.common.ui.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "index", "shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AnimationUtilsKt {
    public static final void a(List list, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(973110610);
        if ((((composerImplV.I(list) ? 4 : 2) | i) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotIntStateKt.a(0);
                composerImplV.A(objG);
            }
            MutableIntState mutableIntState = (MutableIntState) objG;
            composerImplV.V(false);
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(list);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new AnimationUtilsKt$AnimatedTextListSwitcher$1$1(list, mutableIntState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG2);
            String str = (String) list.get(mutableIntState.d());
            composerImplV.o(5004770);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.shop.lists.ui.shoppinglist.compose.a(28);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            AnimatedContentKt.b(str, null, (Function1) objG3, Alignment.Companion.e, "TextSwitcher", null, ComposableLambdaKt.c(1013651944, new Function4<AnimatedContentScope, String, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.utils.AnimationUtilsKt$AnimatedTextListSwitcher$3
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                    String text = (String) obj2;
                    int iIntValue = ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.h(text, "text");
                    Integer numValueOf = Integer.valueOf((iIntValue >> 3) & 14);
                    composableLambdaImpl.invoke(text, (Composer) obj3, numValueOf);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1600512, 34);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(list, i, 25, composableLambdaImpl);
        }
    }
}
