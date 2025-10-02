package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.base.shopapp.modules.text.ParagraphTextApiData;
import au.com.woolworths.base.shopapp.modules.text.ParagraphTextTypeApiData;
import au.com.woolworths.design.wx.foundation.WxTheme;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"healthy-life-food-tracker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ParagraphTextKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7173a;

        static {
            int[] iArr = new int[ParagraphTextTypeApiData.values().length];
            try {
                iArr[ParagraphTextTypeApiData.BODY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParagraphTextTypeApiData.CAPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7173a = iArr;
        }
    }

    public static final void a(ParagraphTextApiData paragraphTextApiData, Modifier modifier, Composer composer, int i) {
        int i2;
        Pair pair;
        ComposerImpl composerImpl;
        Intrinsics.h(paragraphTextApiData, "paragraphTextApiData");
        ComposerImpl composerImplV = composer.v(-1712370514);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(paragraphTextApiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            int i3 = WhenMappings.f7173a[paragraphTextApiData.getType().ordinal()];
            if (i3 == 1) {
                composerImplV.o(-615582094);
                pair = new Pair(new Dp(8), WxTheme.b(composerImplV).j);
                composerImplV.V(false);
            } else if (i3 != 2) {
                composerImplV.o(-615577838);
                pair = new Pair(new Dp(8), WxTheme.b(composerImplV).j);
                composerImplV.V(false);
            } else {
                composerImplV.o(-615579503);
                pair = new Pair(new Dp(24), WxTheme.b(composerImplV).r);
                composerImplV.V(false);
            }
            composerImpl = composerImplV;
            TextKt.b(paragraphTextApiData.getContent(), PaddingKt.g(modifier, 16, ((Dp) pair.d).d), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, (TextStyle) pair.e, composerImpl, 0, 0, 65532);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(paragraphTextApiData, i, 0, modifier);
        }
    }
}
