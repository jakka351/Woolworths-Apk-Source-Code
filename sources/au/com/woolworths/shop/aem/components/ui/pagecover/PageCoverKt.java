package au.com.woolworths.shop.aem.components.ui.pagecover;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.compose.utils.extensions.ColorExtKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.corecolor.CoreColorThemeData;
import au.com.woolworths.shop.aem.components.model.corecolor.CoreForegroundColorsData;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverContentAlignment;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverContentFormat;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverImagePosition;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverTitleTextSize;
import au.com.woolworths.shop.aem.components.ui.ImagePlaceholderHelperKt;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PageCoverKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10222a;

        static {
            int[] iArr = new int[PageCoverContentFormat.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PageCoverContentFormat pageCoverContentFormat = PageCoverContentFormat.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PageCoverContentFormat pageCoverContentFormat2 = PageCoverContentFormat.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PageCoverContentFormat pageCoverContentFormat3 = PageCoverContentFormat.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[PageCoverContentAlignment.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PageCoverContentAlignment pageCoverContentAlignment = PageCoverContentAlignment.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PageCoverTitleTextSize.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            f10222a = iArr3;
        }
    }

    public static final void a(PageCoverData pageCoverData, Modifier modifier, Composer composer, int i) {
        int i2;
        PageCoverData pageCoverData2 = pageCoverData;
        Intrinsics.h(pageCoverData2, "pageCoverData");
        CoreColorThemeData coreColorThemeData = pageCoverData2.e;
        CoreForegroundColorsData coreForegroundColorsData = coreColorThemeData.b;
        ComposerImpl composerImplV = composer.v(1978223273);
        int i3 = (composerImplV.I(pageCoverData2) ? 4 : 2) | i;
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            i2 = 0;
        } else {
            int i4 = Color.l;
            long jA = ColorExtKt.a(CoreTheme.b(composerImplV).e.f4848a.c, coreColorThemeData.f10152a.f10151a);
            long jA2 = ColorExtKt.a(CoreTheme.b(composerImplV).e.d.c.b, coreForegroundColorsData.f10153a.f10151a);
            long jA3 = ColorExtKt.a(CoreTheme.b(composerImplV).e.d.c.b, coreForegroundColorsData.f10153a.f10151a);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            int iOrdinal = pageCoverData2.f.ordinal();
            if (iOrdinal == 0) {
                i2 = 0;
                composerImplV.o(-115154143);
                pageCoverData2 = pageCoverData;
                b(pageCoverData2, jA, jA2, jA3, null, composerImplV, i3 & 14);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else if (iOrdinal == 1) {
                i2 = 0;
                composerImplV.o(-115146327);
                pageCoverData2 = pageCoverData;
                d(pageCoverData2, jA, null, composerImplV, i3 & 14);
                composerImplV.V(false);
            } else if (iOrdinal == 2) {
                i2 = 0;
                composerImplV.o(-115141091);
                pageCoverData2 = pageCoverData;
                c(pageCoverData2, jA, jA2, jA3, null, composerImplV, i3 & 14);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else {
                if (iOrdinal != 3) {
                    throw au.com.woolworths.android.onesite.a.w(-115156927, composerImplV, false);
                }
                composerImplV.o(-115133563);
                e(pageCoverData2, jA, null, composerImplV, i3 & 14);
                i2 = 0;
                composerImplV.V(false);
                pageCoverData2 = pageCoverData;
            }
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(pageCoverData2, modifier, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData r22, long r23, long r25, long r27, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.aem.components.ui.pagecover.PageCoverKt.b(au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData, long, long, long, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(PageCoverData pageCoverData, long j, long j2, long j3, Modifier modifier, Composer composer, int i) {
        int i2;
        BiasAlignment.Horizontal horizontal;
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-867456892);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(pageCoverData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.s(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.s(j3) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(SizeKt.e(BackgroundKt.b(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f), 16);
            int iOrdinal = pageCoverData.g.ordinal();
            if (iOrdinal == 0) {
                horizontal = Alignment.Companion.m;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                horizontal = Alignment.Companion.n;
            }
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, horizontal, composerImplV, 0);
            int i4 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            int i5 = i3 & 14;
            f(pageCoverData, SizeKt.g(companion, 64), null, composerImplV, i5 | 48, 4);
            int i6 = i3 >> 3;
            h(pageCoverData, j2, j3, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composerImplV, i5 | 3072 | (i6 & 112) | (i6 & 896));
            composerImpl = composerImplV;
            composerImpl.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(pageCoverData, j, j2, j3, modifier2, i, 1);
        }
    }

    public static final void d(PageCoverData pageCoverData, long j, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(2039428968);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.I(pageCoverData) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            modifier2 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier2);
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
            composerImplV.o(1008268080);
            if (pageCoverData.h == PageCoverImagePosition.d) {
                g(pageCoverData, j, null, composerImplV, i3 & 126);
            }
            composerImplV.V(false);
            f(pageCoverData, SizeKt.g(PaddingKt.f(SizeKt.e(BackgroundKt.b(modifier2, j, RectangleShapeKt.f1779a), 1.0f), 16), 64), null, composerImplV, i3 & 14, 4);
            composerImplV.o(1008283443);
            if (pageCoverData.h == PageCoverImagePosition.e) {
                g(pageCoverData, j, null, composerImplV, i3 & 126);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(pageCoverData, j, modifier2, i, 1);
        }
    }

    public static final void e(PageCoverData pageCoverData, long j, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1246600064);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.I(pageCoverData) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            f(pageCoverData, SizeKt.g(PaddingKt.f(SizeKt.e(BackgroundKt.b(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f), 16), 140), SizeKt.c, composerImplV, (i3 & 14) | KyberEngine.KyberPolyBytes, 0);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(pageCoverData, j, modifier2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData r21, final androidx.compose.ui.Modifier r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.aem.components.ui.pagecover.PageCoverKt.f(au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData, androidx.compose.ui.Modifier, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void g(PageCoverData pageCoverData, long j, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-246136327);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.I(pageCoverData) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if (((i2 | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Painter painterA = ImagePlaceholderHelperKt.a(BitmapDescriptorFactory.HUE_RED, 0, 3, composerImplV);
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
            ImageWithAltText imageWithAltText = pageCoverData.c;
            builder.c = imageWithAltText != null ? imageWithAltText.f10141a : null;
            builder.j = CachePolicy.f;
            ImageRequest imageRequestA = builder.a();
            ImageWithAltText imageWithAltText2 = pageCoverData.c;
            String str = imageWithAltText2 != null ? imageWithAltText2.b : null;
            Modifier.Companion companion = Modifier.Companion.d;
            composerImpl = composerImplV;
            SingletonAsyncImageKt.b(imageRequestA, str, BackgroundKt.b(AspectRatioKt.a(SizeKt.e(companion, 1.0f), 2.3333333f), j, RectangleShapeKt.f1779a), painterA, painterA, null, null, null, null, null, ContentScale.Companion.f1880a, null, composerImpl, 0, 6, 31712);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(pageCoverData, j, modifier2, i, 2);
        }
    }

    public static final void h(PageCoverData pageCoverData, long j, long j2, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        ComposerImpl composerImpl;
        float f;
        TextStyle textStyle;
        int i3;
        ComposerImpl composerImplV = composer.v(557985870);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(pageCoverData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.s(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                int iOrdinal = pageCoverData.g.ordinal();
                if (iOrdinal == 0) {
                    i3 = 5;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 3;
                }
                TextAlign textAlign = new TextAlign(i3);
                composerImplV.A(textAlign);
                objG = textAlign;
            }
            int i4 = ((TextAlign) objG).f2156a;
            composerImplV.V(false);
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1111047413);
            String str = pageCoverData.f10177a;
            Modifier.Companion companion2 = Modifier.Companion.d;
            if (str == null || str.length() == 0) {
                companion = companion2;
                composerImpl = composerImplV;
                f = 1.0f;
            } else {
                String str2 = pageCoverData.f10177a;
                PageCoverTitleTextSize pageCoverTitleTextSize = pageCoverData.i;
                if ((pageCoverTitleTextSize == null ? -1 : WhenMappings.f10222a[pageCoverTitleTextSize.ordinal()]) == 1) {
                    composerImplV.o(-1111039137);
                    textStyle = CoreTheme.f(composerImplV).d.b.b;
                    composerImplV.V(false);
                } else {
                    composerImplV.o(-1111036962);
                    textStyle = CoreTheme.f(composerImplV).c.f5127a.f5128a;
                    composerImplV.V(false);
                }
                f = 1.0f;
                companion = companion2;
                TextKt.a(str2, textStyle, SizeKt.e(companion2, 1.0f), j, null, i4, 0, false, 0, null, composerImplV, ((i2 << 6) & 7168) | 196992, 976);
                composerImpl = composerImplV;
            }
            composerImpl.V(false);
            composerImpl.o(-1111029569);
            String str3 = pageCoverData.b;
            if (!(str3 == null || str3.length() == 0)) {
                ComposerImpl composerImpl2 = composerImpl;
                TextKt.a(pageCoverData.b, CoreTheme.f(composerImpl2).f5120a.b.f5123a, PaddingKt.h(SizeKt.e(companion, f), BitmapDescriptorFactory.HUE_RED, 8, 1), j2, null, i4, 0, false, 0, null, composerImpl2, ((i2 << 3) & 7168) | 196992, 976);
                composerImpl = composerImpl2;
            }
            composerImpl.V(false);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(pageCoverData, j, j2, modifier, i);
        }
    }
}
