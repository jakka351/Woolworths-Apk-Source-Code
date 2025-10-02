package au.com.woolworths.shop.aem.components.ui.tab;

import androidx.compose.material.TabKt;
import androidx.compose.material.TabRowKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons.b;
import au.com.woolworths.design.wx.foundation.TextColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.markdown.compat.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TabItemsKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TabRowStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TabRowStyle tabRowStyle = TabRowStyle.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(int i, TabRowStyle tabRowStyle, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2) {
        int i3;
        int i4;
        ComposableLambdaImpl composableLambdaImpl2 = ComposableSingletons$TabItemsKt.f10223a;
        ComposerImpl composerImplV = composer.v(1231217118);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = (composerImplV.r(i3) ? 4 : 2) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.r(tabRowStyle.ordinal()) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(composableLambdaImpl2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerImplV.I(composableLambdaImpl) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = MovableContentKt.a(composableLambdaImpl2);
                composerImplV.A(objG);
            }
            Function2 function2 = (Function2) objG;
            Object objD = a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = MovableContentKt.a(composableLambdaImpl);
                composerImplV.A(objD);
            }
            final Function2 function22 = (Function2) objD;
            composerImplV.V(false);
            int iOrdinal = tabRowStyle.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(168832359);
                TabRowKt.b(i, modifier, WxTheme.a(composerImplV).a(), WxTheme.a(composerImplV).h(), null, function2, ComposableLambdaKt.c(325487342, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.tab.TabItemsKt$DynamicTabRow$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            function22.invoke(composer2, 6);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 1769472 | (i4 & 14) | ((i4 >> 6) & 112), 16);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw a.w(2083655260, composerImplV, false);
                }
                composerImplV.o(169215705);
                TabRowKt.a(0, i3, (i4 & 14) | 14180352 | ((i4 >> 6) & 112), WxTheme.a(composerImplV).a(), WxTheme.a(composerImplV).h(), composerImplV, ComposableLambdaKt.c(-31824225, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.tab.TabItemsKt$DynamicTabRow$2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            function22.invoke(composer2, 6);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), modifier, function2, null);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a(i, tabRowStyle, modifier, composableLambdaImpl, i2);
        }
    }

    public static final void b(final ArrayList arrayList, final Function1 onClick, final int i, Modifier modifier, TabRowStyle tabRowStyle, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Function2 function22;
        Modifier modifier2;
        ComposerImpl composerImpl;
        TabRowStyle tabRowStyle2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-433180961);
        int i5 = (composerImplV.I(arrayList) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i5 |= composerImplV.I(onClick) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.r(i) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 = i5 | 24576;
        } else {
            i4 = i5 | (composerImplV.r(tabRowStyle == null ? -1 : tabRowStyle.ordinal()) ? 16384 : 8192);
        }
        int i8 = i4 | 196608;
        if ((74899 & i8) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            function22 = function2;
            composerImpl = composerImplV;
            tabRowStyle2 = tabRowStyle;
        } else {
            if (i6 != 0) {
                modifier = Modifier.Companion.d;
            }
            Modifier modifier3 = modifier;
            TabRowStyle tabRowStyle3 = i7 != 0 ? TabRowStyle.d : tabRowStyle;
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$TabItemsKt.f10223a;
            a(i, tabRowStyle3, modifier3, ComposableLambdaKt.c(-1891037356, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.tab.TabItemsKt$TabItems$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        int i9 = 0;
                        for (Object obj3 : arrayList) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            final String str = (String) obj3;
                            boolean z = i == i9;
                            long j = TextColors.b;
                            composer2.o(-1633490746);
                            Function1 function1 = onClick;
                            boolean zN = composer2.n(function1) | composer2.r(i9);
                            Object objG = composer2.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new b(i9, 5, function1);
                                composer2.A(objG);
                            }
                            composer2.l();
                            TabKt.a(z, (Function0) objG, null, false, ComposableLambdaKt.c(-1013317240, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.tab.TabItemsKt$TabItems$1$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    Composer composer3 = (Composer) obj4;
                                    if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), 0L, j, composer2, 24576, 236);
                            i9 = i10;
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i8 >> 6) & 14) | 24576 | ((i8 >> 9) & 112) | KyberEngine.KyberPolyBytes | (i8 & 7168));
            function22 = composableLambdaImpl;
            modifier2 = modifier3;
            composerImpl = composerImplV;
            tabRowStyle2 = tabRowStyle3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(arrayList, onClick, i, modifier2, tabRowStyle2, function22, i2, i3);
        }
    }
}
