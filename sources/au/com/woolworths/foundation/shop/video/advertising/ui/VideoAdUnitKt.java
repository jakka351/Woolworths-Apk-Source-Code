package au.com.woolworths.foundation.shop.video.advertising.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.dynamic.page.ui.content.t;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", "impressionSent", "", "vauYPosition", "video-advertising_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class VideoAdUnitKt {
    public static final void a(VideoAdBottomSheet videoAdBottomSheet, Function1 onTermsAndConditionsClick, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Intrinsics.h(videoAdBottomSheet, "videoAdBottomSheet");
        Intrinsics.h(onTermsAndConditionsClick, "onTermsAndConditionsClick");
        ComposerImpl composerImplV = composer.v(-2132125883);
        int i4 = i | (composerImplV.I(videoAdBottomSheet) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= composerImplV.I(onTermsAndConditionsClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | KyberEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 256 : 128);
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifier4 = i5 != 0 ? companion : modifier2;
            composerImplV.o(-1633490746);
            boolean zI = ((i3 & 112) == 32) | composerImplV.I(videoAdBottomSheet);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new f(27, onTermsAndConditionsClick, videoAdBottomSheet);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifier4, false, null, null, (Function0) objG, 7);
            Modifier modifier5 = modifier4;
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(videoAdBottomSheet);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(videoAdBottomSheet, 22);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierA = SemanticsModifierKt.a(modifierD, (Function1) objG2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
            String strC = videoAdBottomSheet.f;
            composerImplV.o(1304252455);
            if (strC == null) {
                strC = StringResources_androidKt.c(composerImplV, R.string.video_ad_terms_and_conditions_button);
            }
            composerImplV.V(false);
            TextKt.a(strC, CoreTheme.f(composerImplV).f5120a.c.f5124a, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            IconKt.b(CoreTheme.e(composerImplV).e.l, null, SizeKt.r(BackgroundKt.b(PaddingKt.g(companion, 4, 2), Color.b(CoreTheme.b(composerImplV).f4782a.c.c.f4794a, 0.1f), RoundedCornerShapeKt.b(24)), 18, 12), CoreTheme.b(composerImplV).e.c.d, composerImplV, 48, 0);
            composerImplV.V(true);
            modifier3 = modifier5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a((Object) videoAdBottomSheet, (Function) onTermsAndConditionsClick, modifier3, i, i2, 17);
        }
    }

    public static final void b(VideoAdData videoAdData, VideoAdPlayerState videoAdPlayerState, Function1 onDisplayVideoAdBottomSheet, Function3 onVideoAdPositionChange, Function1 onVideoAdAnalyticsEvent, Modifier modifier, Function1 onVideoAdPlayerStateChange, Composer composer, int i) {
        int i2;
        Intrinsics.h(videoAdData, "videoAdData");
        Intrinsics.h(videoAdPlayerState, "videoAdPlayerState");
        Intrinsics.h(onDisplayVideoAdBottomSheet, "onDisplayVideoAdBottomSheet");
        Intrinsics.h(onVideoAdPositionChange, "onVideoAdPositionChange");
        Intrinsics.h(onVideoAdAnalyticsEvent, "onVideoAdAnalyticsEvent");
        Intrinsics.h(onVideoAdPlayerStateChange, "onVideoAdPlayerStateChange");
        ComposerImpl composerImplV = composer.v(10151054);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(videoAdData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(videoAdPlayerState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onDisplayVideoAdBottomSheet) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onVideoAdPositionChange) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onVideoAdAnalyticsEvent) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onVideoAdPlayerStateChange) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            composerImplV.o(1165247507);
            float fT1 = density.T1(((Configuration) composerImplV.x(AndroidCompositionLocals_androidKt.f1950a)).screenHeightDp);
            composerImplV.V(false);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objG2);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) objG2;
            composerImplV.V(false);
            Boolean boolValueOf = Boolean.valueOf(videoAdPlayerState.b);
            composerImplV.o(-1746271574);
            boolean zI = composerImplV.I(videoAdData) | ((i2 & 57344) == 16384);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.foundation.shop.olive.voice.ui.a(1, videoAdData, onVideoAdAnalyticsEvent, mutableState);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.c(boolValueOf, (Function1) objG3, composerImplV);
            boolean zB = videoAdPlayerState.b();
            composerImplV.o(978197415);
            StringBuilder sb = new StringBuilder();
            sb.append(StringResources_androidKt.c(composerImplV, R.string.video_ad_content_description));
            Resources resources = ((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b)).getResources();
            int i3 = videoAdData.b;
            sb.append(resources.getQuantityString(R.plurals.video_ad_timer_content_description, i3, Integer.valueOf(i3)));
            VideoAdBottomSheet videoAdBottomSheet = videoAdData.d;
            String str = videoAdBottomSheet != null ? videoAdBottomSheet.g : null;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(StringResources_androidKt.c(composerImplV, R.string.button_content_description));
            sb.append(zB ? au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, -971626082, R.string.video_pause_button_content_description, composerImplV, false) : au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, -971623235, R.string.video_play_button_content_description, composerImplV, false));
            sb.append(StringResources_androidKt.c(composerImplV, R.string.button_content_description));
            VideoAdBottomSheet videoAdBottomSheet2 = videoAdData.e;
            String str2 = videoAdBottomSheet2 != null ? videoAdBottomSheet2.g : null;
            sb.append(str2 != null ? str2 : "");
            String string = sb.toString();
            composerImplV.V(false);
            composerImplV.o(-1746271574);
            boolean zQ = ((i2 & 7168) == 2048) | composerImplV.q(fT1);
            Object objG4 = composerImplV.G();
            if (zQ || objG4 == composer$Companion$Empty$1) {
                objG4 = new t(onVideoAdPositionChange, fT1, mutableFloatState, 1);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            Modifier modifierA = OnGloballyPositionedModifierKt.a(modifier, (Function1) objG4);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(string);
            Object objG5 = composerImplV.G();
            if (zN || objG5 == composer$Companion$Empty$1) {
                objG5 = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(string, 25);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierA, true, (Function1) objG5);
            composerImplV.o(5004770);
            boolean z = (i2 & 896) == 256;
            Object objG6 = composerImplV.G();
            if (z || objG6 == composer$Companion$Empty$1) {
                objG6 = new au.com.woolworths.feature.shop.contentpage.ui.c(24, onDisplayVideoAdBottomSheet);
                composerImplV.A(objG6);
            }
            composerImplV.V(false);
            c(videoAdData, videoAdPlayerState, (Function1) objG6, onVideoAdAnalyticsEvent, onVideoAdPlayerStateChange, modifierB, composerImplV, (i2 & 126) | ((i2 >> 3) & 7168) | ((i2 >> 6) & 57344));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.a(videoAdData, videoAdPlayerState, onDisplayVideoAdBottomSheet, onVideoAdPositionChange, onVideoAdAnalyticsEvent, modifier, onVideoAdPlayerStateChange, i);
        }
    }

    public static final void c(VideoAdData videoAdData, VideoAdPlayerState videoAdPlayerState, Function1 displayVideoAdBottomSheet, Function1 function1, Function1 onVideoAdPlayerStateChange, Modifier modifier, Composer composer, int i) {
        int i2;
        Function1 function12;
        Function0 function0;
        boolean z;
        boolean z2;
        Function1 onVideoAdEvent = function1;
        Intrinsics.h(videoAdData, "videoAdData");
        Intrinsics.h(videoAdPlayerState, "videoAdPlayerState");
        Intrinsics.h(displayVideoAdBottomSheet, "displayVideoAdBottomSheet");
        Intrinsics.h(onVideoAdEvent, "onVideoAdEvent");
        Intrinsics.h(onVideoAdPlayerStateChange, "onVideoAdPlayerStateChange");
        ComposerImpl composerImplV = composer.v(1582561143);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(videoAdData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(videoAdPlayerState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(displayVideoAdBottomSheet) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onVideoAdEvent) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onVideoAdPlayerStateChange) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
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
            VideoAdBottomSheet videoAdBottomSheet = videoAdData.d;
            composerImplV.o(1695892367);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (videoAdBottomSheet == null) {
                function0 = null;
                function12 = displayVideoAdBottomSheet;
            } else {
                composerImplV.o(-1224400529);
                boolean zI = ((i3 & 896) == 256) | composerImplV.I(videoAdBottomSheet) | composerImplV.I(videoAdData) | ((i3 & 7168) == 2048);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    androidx.work.impl.utils.b bVar = new androidx.work.impl.utils.b(displayVideoAdBottomSheet, videoAdBottomSheet, videoAdData, onVideoAdEvent, 9);
                    function12 = displayVideoAdBottomSheet;
                    composerImplV.A(bVar);
                    objG = bVar;
                } else {
                    function12 = displayVideoAdBottomSheet;
                }
                function0 = (Function0) objG;
                composerImplV.V(false);
            }
            Function0 function03 = function0;
            composerImplV.V(false);
            onVideoAdEvent = function1;
            VideoAdPlayerKt.b(videoAdData, videoAdPlayerState, onVideoAdPlayerStateChange, function03, onVideoAdEvent, null, composerImplV, (i3 & 126) | ((i3 >> 6) & 896) | ((i3 << 3) & 57344));
            VideoAdBottomSheet videoAdBottomSheet2 = videoAdData.e;
            composerImplV.o(1695907975);
            if (videoAdBottomSheet2 == null) {
                z = false;
                z2 = true;
            } else {
                float f = 16;
                Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, f, 8, f, BitmapDescriptorFactory.HUE_RED, 8);
                composerImplV.o(-1746271574);
                boolean zI2 = ((i3 & 896) == 256) | composerImplV.I(videoAdData) | ((i3 & 7168) == 2048);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new au.com.woolworths.foundation.shop.olive.voice.ui.a(2, function12, videoAdData, onVideoAdEvent);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                z = false;
                z2 = true;
                a(videoAdBottomSheet2, (Function1) objG2, modifierJ, composerImplV, 0, 0);
            }
            composerImplV.V(z);
            composerImplV.V(z2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.tag.d((Object) videoAdData, (Object) videoAdPlayerState, (Object) displayVideoAdBottomSheet, (Object) onVideoAdEvent, onVideoAdPlayerStateChange, modifier, i, 14);
        }
    }
}
