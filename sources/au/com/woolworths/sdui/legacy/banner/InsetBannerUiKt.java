package au.com.woolworths.sdui.legacy.banner;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import coil3.compose.SingletonAsyncImageKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InsetBannerUiKt {
    public static final void a(InlineErrorCause.IconConfig iconConfig, InlineErrorDesign inlineErrorDesign, boolean z, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-214532543);
        int i3 = i & 6;
        RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
        if (i3 == 0) {
            i2 = (composerImplV.n(rowScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(iconConfig) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.r(inlineErrorDesign.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z2 = iconConfig instanceof InlineErrorCause.IconConfig.Default;
            Modifier modifierB = Modifier.Companion.d;
            if (z2) {
                composerImplV.o(-227417362);
                if (z) {
                    modifierB = rowScopeInstance.b(modifierB, Alignment.Companion.k);
                }
                ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
                int i4 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
                ComposeUiNode.e3.getClass();
                Function0 function0 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function2 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                    androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                IconKt.a(PainterResources_androidKt.a(inlineErrorDesign.g, 0, composerImplV), StringResources_androidKt.c(composerImplV, inlineErrorDesign.i), null, Color.k, composerImplV, 3072, 4);
                composerImplV.V(true);
                composerImplV.V(false);
            } else if (iconConfig instanceof InlineErrorCause.IconConfig.CustomIcon) {
                composerImplV.o(-226951153);
                SingletonAsyncImageKt.b(((InlineErrorCause.IconConfig.CustomIcon) iconConfig).d, null, SizeKt.q(modifierB, 40), new IconPlaceholderPainter(((Density) composerImplV.x(CompositionLocalsKt.h)).T1(20)), PainterResources_androidKt.a(inlineErrorDesign.h, 0, composerImplV), null, null, null, null, null, ContentScale.Companion.b, null, composerImplV, 432, 6, 31712);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else {
                if (!Intrinsics.c(iconConfig, InlineErrorCause.IconConfig.None.d)) {
                    throw au.com.woolworths.android.onesite.a.w(-7337689, composerImplV, false);
                }
                composerImplV.o(-7307067);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(iconConfig, inlineErrorDesign, z, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner r20, androidx.compose.ui.Modifier r21, boolean r22, kotlin.jvm.functions.Function1 r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt.b(au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.foundation.layout.PaddingValuesImpl r52, final au.com.woolworths.android.onesite.modules.common.InlineErrorType r53, final au.com.woolworths.android.onesite.modules.common.InlineErrorCause.IconConfig r54, final au.com.woolworths.android.onesite.models.text.Text r55, final au.com.woolworths.sdui.legacy.banner.BannerAction r56, final androidx.compose.ui.Modifier r57, androidx.compose.ui.graphics.Shape r58, boolean r59, final boolean r60, au.com.woolworths.android.onesite.models.text.Text r61, androidx.compose.runtime.Composer r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt.c(androidx.compose.foundation.layout.PaddingValuesImpl, au.com.woolworths.android.onesite.modules.common.InlineErrorType, au.com.woolworths.android.onesite.modules.common.InlineErrorCause$IconConfig, au.com.woolworths.android.onesite.models.text.Text, au.com.woolworths.sdui.legacy.banner.BannerAction, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, boolean, boolean, au.com.woolworths.android.onesite.models.text.Text, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(final BannerAction bannerAction, final long j, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        String string;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(1838473354);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(bannerAction) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.s(j) ? 32 : 16;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.d : modifier;
            Text textA = bannerAction.f10000a.a();
            composerImplV.o(1541340679);
            CharSequence text = textA == null ? null : textA.getText((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
            composerImplV.V(false);
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            final String str = string;
            final Modifier modifier4 = modifier3;
            CompositionLocalKt.a(InteractiveComponentSizeKt.f1291a.b(Boolean.FALSE), ComposableLambdaKt.c(-1161518134, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt$Ui$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 1;
                        Modifier modifierA = SizeKt.a(modifier4, f, f);
                        float f2 = 0;
                        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
                        Function0 function0 = bannerAction.d;
                        PaddingValuesImpl paddingValuesImpl2 = ButtonDefaults.f1248a;
                        ButtonColors buttonColorsD = ButtonDefaults.d(0L, j, Color.b(j, 0.25f), composer2, 1);
                        final String str2 = str;
                        ButtonKt.c(function0, modifierA, false, null, null, null, buttonColorsD, paddingValuesImpl, ComposableLambdaKt.c(1581287021, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt$Ui$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                RowScope TextButton = (RowScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(TextButton, "$this$TextButton");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    String upperCase = str2.toUpperCase(Locale.ROOT);
                                    Intrinsics.g(upperCase, "toUpperCase(...)");
                                    TextKt.b(upperCase, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer3).o, composer3, 0, 0, 65534);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 905969664, 124);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
            modifier2 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.iconasset.a(bannerAction, j, modifier2, i, i2, 1);
        }
    }
}
