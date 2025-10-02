package au.com.woolworths.feature.shared.web.file.uploader.permission.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"web-file-uploader_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsCameraAccessRequiredKt {
    public static final void a(final Function0 onBackClick, final Function0 onEnablePermissionClick, Composer composer, int i) {
        int i2;
        Intrinsics.h(onBackClick, "onBackClick");
        Intrinsics.h(onEnablePermissionClick, "onEnablePermissionClick");
        ComposerImpl composerImplV = composer.v(-1382713295);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onBackClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onEnablePermissionClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(1849683053, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.web.file.uploader.permission.ui.RewardsCameraAccessRequiredKt$RewardsCameraAccessRequired$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, fillElement);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        long j = Color.j;
                        final Function0 function02 = onBackClick;
                        TopNavBarKt.b(StringResources_androidKt.c(composer2, R.string.chat_camera_permission_screen_title), null, null, null, 0L, j, 0L, null, 0, ComposableLambdaKt.c(1538726214, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.web.file.uploader.permission.ui.RewardsCameraAccessRequiredKt$RewardsCameraAccessRequired$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function02, null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 906166272, 0, 1246);
                        Modifier.Companion companion = Modifier.Companion.d;
                        float f = 16;
                        float f2 = 32;
                        Modifier modifierI = PaddingKt.i(ColumnScopeInstance.f948a.a(SizeKt.e(companion, 1.0f), 1.0f, true), f2, f, f2, f);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composer2, 54);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierI);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        TextKt.b(StringResources_androidKt.c(composer2, R.string.chat_camera_permission_screen_subtitle), null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).m, composer2, 0, 0, 65022);
                        TextKt.b(StringResources_androidKt.c(composer2, R.string.chat_camera_permission_screen_body_rewards), PaddingKt.f(companion, f), WxTheme.a(composer2).f(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).n, composer2, 48, 0, 65016);
                        Modifier modifierE = SizeKt.e(companion, 1.0f);
                        String upperCase = StringResources_androidKt.c(composer2, R.string.chat_button_enable_camera_permission).toUpperCase(Locale.ROOT);
                        Intrinsics.g(upperCase, "toUpperCase(...)");
                        SecondaryButtonKt.b(upperCase, onEnablePermissionClick, modifierE, false, false, null, null, composer2, KyberEngine.KyberPolyBytes, 120);
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572864, 63);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(onBackClick, onEnablePermissionClick, i, 0);
        }
    }
}
