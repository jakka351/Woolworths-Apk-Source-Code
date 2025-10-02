package au.com.woolworths.shop.aem.components.ui.contentcard;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardFooter;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardTextComponentType;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardTextHeightType;
import au.com.woolworths.shop.aem.components.model.footer.ContentFooterStyle;
import au.com.woolworths.shop.aem.components.ui.ImagePlaceholderHelperKt;
import au.com.woolworths.shop.aem.components.ui.byline.BylineKt;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ContentCardKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10216a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ContentFooterStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContentFooterStyle contentFooterStyle = ContentFooterStyle.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ContentCardTextComponentType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f10216a = iArr2;
            int[] iArr3 = new int[ContentCardTextHeightType.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData r28, final kotlin.jvm.functions.Function1 r29, androidx.compose.ui.Modifier r30, final au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState r31, androidx.compose.foundation.BorderStroke r32, float r33, androidx.compose.ui.layout.ContentScale r34, au.com.woolworths.shop.aem.components.model.contentcard.ContentCardTextHeightType r35, au.com.woolworths.shop.aem.components.model.contentcard.ContentCardTextComponentType r36, boolean r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.aem.components.ui.contentcard.ContentCardKt.a(au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState, androidx.compose.foundation.BorderStroke, float, androidx.compose.ui.layout.ContentScale, au.com.woolworths.shop.aem.components.model.contentcard.ContentCardTextHeightType, au.com.woolworths.shop.aem.components.model.contentcard.ContentCardTextComponentType, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(ContentCardFooter contentCardFooter, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1451945529);
        if ((((composerImplV.n(contentCardFooter) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            ImageWithAltText imageWithAltText = contentCardFooter.c;
            String str = contentCardFooter.b;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(8);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            BylineKt.a(imageWithAltText, str, modifierJ, SemanticsModifierKt.b(companion, false, (Function1) objG), 0L, true, true, true, composerImplV, 14352768, 16);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 22, contentCardFooter);
        }
    }

    public static final void c(String str, ContentCardTextHeightType contentCardTextHeightType, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-2030905139);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.r(contentCardTextHeightType.ordinal()) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            TextStyle textStyle = WxTheme.b(composerImplV).n;
            long jC = WxTheme.a(composerImplV).c();
            Modifier modifierG = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(modifierG, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(11);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifierJ, false, (Function1) objG);
            if (WhenMappings.b[contentCardTextHeightType.ordinal()] == 1) {
                modifierG = SizeKt.g(modifierG, 44);
            }
            composerImpl = composerImplV;
            TextKt.b(str, modifierB.x0(modifierG), jC, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, textStyle, composerImpl, i2 & 14, 3120, 55288);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(i, 10, contentCardTextHeightType, str);
        }
    }

    public static final void d(ContentCardData contentCardData, ContentScale contentScale, Composer composer, int i) {
        boolean z;
        boolean z2;
        ComposerImpl composerImplV = composer.v(1757214871);
        int i2 = i | (composerImplV.I(contentCardData) ? 4 : 2) | (composerImplV.n(contentScale) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = AspectRatioKt.a(companion, 1.5f);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Painter painterA = ImagePlaceholderHelperKt.a(BitmapDescriptorFactory.HUE_RED, 0, 3, composerImplV);
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            String str = contentCardData.e;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = InspectionModeKt.f1972a;
            SingletonAsyncImageKt.b(str, null, modifierE, null, ((Boolean) composerImplV.x(staticProvidableCompositionLocal)).booleanValue() ? new ColorPainter(ToneColors.i) : painterA, painterA, null, null, null, null, contentScale, null, composerImplV, 432, (i2 >> 3) & 14, 31688);
            ImageWithAltText imageWithAltText = contentCardData.i;
            Painter painterA2 = null;
            String str2 = imageWithAltText != null ? imageWithAltText.f10141a : null;
            composerImplV.o(-1598589210);
            if (((Boolean) composerImplV.x(staticProvidableCompositionLocal)).booleanValue()) {
                z = false;
                painterA2 = PainterResources_androidKt.a(R.drawable.ic_wapple_flat, 0, composerImplV);
            } else {
                z = false;
            }
            Painter painter = painterA2;
            composerImplV.V(z);
            Modifier modifierG = SizeKt.g(companion, 56);
            BiasAlignment biasAlignment = Alignment.Companion.g;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            SingletonAsyncImageKt.b(str2, null, boxScopeInstance.g(modifierG, biasAlignment), null, painter, null, null, null, null, null, ContentScale.Companion.b, null, composerImplV, 48, 6, 31720);
            composerImplV = composerImplV;
            composerImplV.o(-1598578273);
            if (Intrinsics.c(contentCardData.k, Boolean.TRUE)) {
                float f = 8;
                Modifier modifierG2 = boxScopeInstance.g(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f, 3), Alignment.Companion.i);
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(9);
                    composerImplV.A(objG);
                }
                z2 = false;
                composerImplV.V(false);
                VideoTagKt.a(0, 0, composerImplV, SemanticsModifierKt.b(modifierG2, false, (Function1) objG));
            } else {
                z2 = false;
            }
            composerImplV.V(z2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(contentCardData, i, 11, contentScale);
        }
    }

    public static final void e(ContentCardFooter contentCardFooter, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-640508431);
        if ((((composerImplV.n(contentCardFooter) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifierF = PaddingKt.f(SizeKt.e(modifier, 1.0f), 16);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.j, composerImplV, 6);
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String str = contentCardFooter.b;
            if (str == null) {
                str = "";
            }
            TextStyle textStyleA = TextStyle.a(WxTheme.b(composerImplV).r, WxTheme.a(composerImplV).f(), 0L, null, null, 0L, 0L, null, null, 0, 16777214);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = rowScopeInstance.b(rowScopeInstance.a(companion, 1.0f, true), Alignment.Companion.l);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(10);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            TextKt.b(str, SemanticsModifierKt.b(modifierB, false, (Function1) objG), 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, textStyleA, composerImplV, 0, 3120, 55292);
            composerImpl = composerImplV;
            ImageWithAltText imageWithAltText = contentCardFooter.c;
            String str2 = imageWithAltText != null ? imageWithAltText.f10141a : null;
            composerImpl.o(1905094910);
            if (str2 != null) {
                composerImpl.o(1905097842);
                Painter painterA = ((Boolean) composerImpl.x(InspectionModeKt.f1972a)).booleanValue() ? PainterResources_androidKt.a(R.drawable.ic_wapple_flat, 0, composerImpl) : null;
                composerImpl.V(false);
                SingletonAsyncImageKt.b(str2, null, SizeKt.g(companion, 32), null, painterA, null, null, null, null, null, ContentScale.Companion.b, null, composerImpl, 432, 6, 31720);
                composerImpl = composerImpl;
            }
            composerImpl.V(false);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(contentCardFooter, i, 12, modifier);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static final void f(ContentCardData contentCardData, ContentCardTextHeightType contentCardTextHeightType, ContentCardTextComponentType contentCardTextComponentType, Composer composer, int i) {
        ?? r1;
        ContentCardFooter contentCardFooter;
        ComposerImpl composerImpl;
        boolean z;
        ComposerImpl composerImpl2;
        ComposerImpl composerImplV = composer.v(-1352793916);
        int i2 = i | (composerImplV.I(contentCardData) ? 4 : 2) | (composerImplV.r(contentCardTextHeightType.ordinal()) ? 32 : 16) | (composerImplV.r(contentCardTextComponentType == null ? -1 : contentCardTextComponentType.ordinal()) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl2 = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierX0 = PaddingKt.f(SizeKt.e(companion, 1.0f), 16).x0((contentCardTextHeightType != ContentCardTextHeightType.e || contentCardTextComponentType == null) ? companion : SizeKt.g(companion, contentCardTextComponentType.d));
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String str = contentCardData.f;
            ContentCardFooter contentCardFooter2 = contentCardData.j;
            composerImplV.o(-892629041);
            if (str != null) {
                g(str, contentCardTextHeightType, contentCardTextComponentType, composerImplV, i2 & 1008);
            }
            composerImplV.V(false);
            String str2 = contentCardData.g;
            composerImplV.o(-892625320);
            if (str2 != null) {
                c(str2, contentCardTextHeightType, composerImplV, i2 & 112);
            }
            composerImplV.V(false);
            String str3 = contentCardData.m;
            composerImplV.o(-892620642);
            if (str3 == null) {
                composerImpl = composerImplV;
                contentCardFooter = contentCardFooter2;
                r1 = 0;
            } else {
                Modifier modifierH = PaddingKt.h(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 8, 1);
                TextStyle textStyleA = TextStyle.a(WxTheme.b(composerImplV).r, WxTheme.a(composerImplV).f(), 0L, null, null, 0L, 0L, null, null, 0, 16777214);
                r1 = 0;
                contentCardFooter = contentCardFooter2;
                TextKt.b(str3, modifierH, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleA, composerImplV, 48, 0, 65532);
                composerImpl = composerImplV;
            }
            composerImpl.V(r1);
            composerImpl.o(-892609241);
            if (contentCardFooter == null) {
                z = true;
            } else {
                int iOrdinal = contentCardFooter.f10148a.ordinal();
                if (iOrdinal != 0) {
                    z = true;
                    if (iOrdinal != 1) {
                        throw au.com.woolworths.android.onesite.a.w(881722809, composerImpl, r1);
                    }
                    composerImpl.o(881735784);
                    SpacerKt.c(ColumnScopeInstance.f948a, 32, composerImpl, 54);
                    composerImpl.V(r1);
                } else {
                    z = true;
                    composerImpl.o(881724538);
                    b(contentCardFooter, composerImpl, r1);
                    composerImpl.V(r1);
                }
            }
            composerImpl.V(r1);
            composerImpl.V(z);
            composerImpl2 = composerImpl;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(contentCardData, contentCardTextHeightType, contentCardTextComponentType, i, 21);
        }
    }

    public static final void g(String str, ContentCardTextHeightType contentCardTextHeightType, ContentCardTextComponentType contentCardTextComponentType, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1072758864);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.r(contentCardTextHeightType.ordinal()) ? 32 : 16) | (composerImplV.r(contentCardTextComponentType == null ? -1 : contentCardTextComponentType.ordinal()) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            TextStyle textStyle = WxTheme.b(composerImplV).m;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(7);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierX0 = Modifier.Companion.d;
            Modifier modifierB = SemanticsModifierKt.b(modifierX0, false, (Function1) objG);
            if (WhenMappings.b[contentCardTextHeightType.ordinal()] == 1) {
                Modifier modifierG = SizeKt.g(modifierX0, 44);
                if ((contentCardTextComponentType != null ? WhenMappings.f10216a[contentCardTextComponentType.ordinal()] : -1) == 1) {
                    modifierX0 = SizeKt.x(modifierX0, Alignment.Companion.k, false);
                }
                modifierX0 = modifierG.x0(modifierX0);
            }
            composerImpl = composerImplV;
            TextKt.b(str, modifierB.x0(modifierX0), 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, textStyle, composerImpl, i2 & 14, 3120, 55292);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.marketplace.ui.personalised.b(str, contentCardTextHeightType, contentCardTextComponentType, i, 22);
        }
    }
}
