package au.com.woolworths.feature.shop.banners.broadcastbanner;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.compose.utils.graphics.ForwardingPainterKt;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WoolworthsColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shared.instore.wifi.ui.c;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"banners_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BroadcastBannerKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6638a;

        static {
            int[] iArr = new int[BroadcastBannerType.values().length];
            try {
                iArr[BroadcastBannerType.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BroadcastBannerType.REWARDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BroadcastBannerType.PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6638a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData r21, final kotlin.jvm.functions.Function1 r22, final kotlin.jvm.functions.Function1 r23, androidx.compose.ui.Modifier r24, kotlin.jvm.functions.Function1 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.banners.broadcastbanner.BroadcastBannerKt.a(au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(BroadcastBannerData broadcastBannerData, Function1 function1, Composer composer, int i) {
        ComposerImpl composerImpl;
        final BroadcastBannerData broadcastBannerData2;
        final Function1 function12;
        ComposerImpl composerImplV = composer.v(383066473);
        if (((i | (composerImplV.I(broadcastBannerData) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            broadcastBannerData2 = broadcastBannerData;
            function12 = function1;
            composerImpl = composerImplV;
        } else {
            float f = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(companion, f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f, Alignment.Companion.j, composerImplV, 54);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Painter painterA = ForwardingPainterKt.a(PainterResources_androidKt.a(R.drawable.wapple_grey, 0, composerImplV), ColorFilter.Companion.a(ToneColors.g), null, 10);
            String imageUrl = broadcastBannerData.getImageUrl();
            Modifier modifierQ = SizeKt.q(companion, 56);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new c(5);
                composerImplV.A(objG);
            }
            Function1 function13 = (Function1) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = new c(6);
                composerImplV.A(objD);
            }
            Function1 function14 = (Function1) objD;
            Object objD2 = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD2 == composer$Companion$Empty$1) {
                objD2 = new c(7);
                composerImplV.A(objD2);
            }
            composerImplV.V(false);
            SingletonAsyncImageKt.b(imageUrl, null, modifierQ, painterA, painterA, null, function13, function14, (Function1) objD2, null, ContentScale.Companion.f1880a, null, composerImplV, 114819504, 6, 31264);
            Modifier modifierH = PaddingKt.h(RowScopeInstance.f974a.a(companion, 1.0f, true), f, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.b(broadcastBannerData.getTitle(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).m, composerImplV, 0, 0, 65534);
            composerImpl = composerImplV;
            String subtitle = broadcastBannerData.getSubtitle();
            composerImpl.o(937502309);
            if (subtitle != null) {
                TextKt.b(subtitle, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, 6, 5), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl).n, composerImpl, 48, 0, 65532);
                composerImpl = composerImpl;
            }
            composerImpl.V(false);
            final String actionLabel = broadcastBannerData.getActionLabel();
            if (actionLabel == null || broadcastBannerData.getDeeplink() == null) {
                actionLabel = null;
            }
            composerImpl.o(937516041);
            if (actionLabel == null) {
                broadcastBannerData2 = broadcastBannerData;
                function12 = function1;
            } else {
                broadcastBannerData2 = broadcastBannerData;
                function12 = function1;
                CompositionLocalKt.a(InteractiveComponentSizeKt.f1291a.b(Boolean.FALSE), ComposableLambdaKt.c(-1948366340, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.banners.broadcastbanner.BroadcastBannerKt$Content$1$4$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            float f2 = 0;
                            Modifier modifierI = SizeKt.i(PaddingKt.f(Modifier.Companion.d, f2), 20, BitmapDescriptorFactory.HUE_RED, 2);
                            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
                            composer2.o(-1633490746);
                            Function1 function15 = function12;
                            boolean zN = composer2.n(function15);
                            final BroadcastBannerData broadcastBannerData3 = broadcastBannerData2;
                            boolean zI = zN | composer2.I(broadcastBannerData3);
                            Object objG2 = composer2.G();
                            if (zI || objG2 == Composer.Companion.f1624a) {
                                objG2 = new a(function15, broadcastBannerData3, 2);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            final String str = actionLabel;
                            ButtonKt.c((Function0) objG2, modifierI, false, null, null, null, null, paddingValuesImpl, ComposableLambdaKt.c(1385627935, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.banners.broadcastbanner.BroadcastBannerKt$Content$1$4$3$1.2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    long jH;
                                    RowScope TextButton = (RowScope) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(TextButton, "$this$TextButton");
                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        String upperCase = str.toUpperCase(Locale.ROOT);
                                        Intrinsics.g(upperCase, "toUpperCase(...)");
                                        AnnotatedString annotatedString = new AnnotatedString(upperCase);
                                        TextStyle textStyle = WxTheme.b(composer3).q;
                                        BroadcastBannerType type = broadcastBannerData3.getType();
                                        Intrinsics.h(type, "type");
                                        composer3.o(501686746);
                                        if (type == BroadcastBannerType.NEUTRAL) {
                                            jH = WxTheme.a(composer3).h();
                                        } else if (type == BroadcastBannerType.REWARDS) {
                                            jH = RewardsColors.f5157a;
                                        } else {
                                            if (type != BroadcastBannerType.PRIMARY) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            jH = WoolworthsColors.b;
                                        }
                                        composer3.l();
                                        TextKt.c(annotatedString, null, jH, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, textStyle, composer3, 0, 0, 131066);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 905969712, 252);
                        }
                        return Unit.f24250a;
                    }
                }, composerImpl), composerImpl, 56);
            }
            android.support.v4.media.session.a.C(composerImpl, false, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(broadcastBannerData2, i, 1, function12);
        }
    }
}
