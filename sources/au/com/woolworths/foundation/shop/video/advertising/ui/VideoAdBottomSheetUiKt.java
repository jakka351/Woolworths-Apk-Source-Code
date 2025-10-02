package au.com.woolworths.foundation.shop.video.advertising.ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "isListScrolling", "video-advertising_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class VideoAdBottomSheetUiKt {
    public static final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1721303549);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 28;
            Modifier modifierA = ClipKt.a(SizeKt.g(SizeKt.e(companion, 1.0f), 36), RoundedCornerShapeKt.d(f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12));
            long j = CoreTheme.b(composerImplV).e.f4848a.c;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier modifierB = BackgroundKt.b(modifierA, j, rectangleShapeKt$RectangleShape$1);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
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
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SpacerKt.a(composerImplV, BackgroundKt.b(ClipKt.a(BoxScopeInstance.f944a.g(SizeKt.g(SizeKt.u(companion, 32), 4), Alignment.Companion.e), RoundedCornerShapeKt.b(100)), ColorKt.d(4286149758L), rectangleShapeKt$RectangleShape$1));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(i, 1);
        }
    }

    public static final void b(final VideoAdBottomSheet content, final boolean z, final Function0 onDismissButtonClick, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImpl;
        Intrinsics.h(content, "content");
        Intrinsics.h(onDismissButtonClick, "onDismissButtonClick");
        ComposerImpl composerImplV = composer.v(-2032066088);
        int i2 = (composerImplV.I(content) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onDismissButtonClick) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.d(new au.com.woolworths.design.wx.component.topbar.a(lazyListStateA, 9));
                composerImplV.A(objG);
            }
            final State state = (State) objG;
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierX = SizeKt.x(SizeKt.e(companion, 1.0f), Alignment.Companion.k, false);
            composerImplV.o(-1224400529);
            boolean zI = ((i3 & 112) == 32) | ((i3 & 896) == 256) | composerImplV.I(content);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final boolean z2 = z;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetUiKt$VideoAdBottomSheetUi$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else if (!z2) {
                                    VideoAdBottomSheetUiKt.a(composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 189465325), 3);
                        final State state2 = state;
                        final VideoAdBottomSheet videoAdBottomSheet = content;
                        final Function0 function0 = onDismissButtonClick;
                        LazyListScope.e(LazyColumn, null, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetUiKt$VideoAdBottomSheetUi$1$1$2
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                CoreElevation coreElevation;
                                LazyItemScope stickyHeader = (LazyItemScope) obj2;
                                ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(stickyHeader, "$this$stickyHeader");
                                if ((iIntValue & 129) == 128 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    Modifier modifierB = BackgroundKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), CoreTheme.b(composer2).e.f4848a.c, RectangleShapeKt.f1779a);
                                    final boolean z3 = z2;
                                    if (z3 && ((Boolean) state2.getD()).booleanValue()) {
                                        composer2.o(-1746597857);
                                        coreElevation = CoreTheme.c(composer2).c;
                                    } else {
                                        composer2.o(-1746596835);
                                        coreElevation = CoreTheme.c(composer2).f4876a;
                                    }
                                    composer2.l();
                                    CoreElevation coreElevation2 = coreElevation;
                                    final VideoAdBottomSheet videoAdBottomSheet2 = videoAdBottomSheet;
                                    final Function0 function02 = function0;
                                    SurfaceKt.b(modifierB, null, 0L, 0L, null, coreElevation2, ComposableLambdaKt.c(629807165, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetUiKt$VideoAdBottomSheetUi$1$1$2.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer3 = (Composer) obj6;
                                            if ((((Number) obj7).intValue() & 3) == 2 && composer3.c()) {
                                                composer3.j();
                                            } else {
                                                Modifier.Companion companion2 = Modifier.Companion.d;
                                                Modifier modifierG = PaddingKt.g(SizeKt.e(companion2, 1.0f), 16, 12);
                                                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer3, 54);
                                                int p = composer3.getP();
                                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                                Modifier modifierD = ComposedModifierKt.d(composer3, modifierG);
                                                ComposeUiNode.e3.getClass();
                                                Function0 function03 = ComposeUiNode.Companion.b;
                                                if (composer3.w() == null) {
                                                    ComposablesKt.b();
                                                    throw null;
                                                }
                                                composer3.i();
                                                if (composer3.getO()) {
                                                    composer3.K(function03);
                                                } else {
                                                    composer3.e();
                                                }
                                                Updater.b(composer3, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                                                Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                                Function2 function2 = ComposeUiNode.Companion.j;
                                                if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                                    androidx.camera.core.impl.b.z(p, composer3, p, function2);
                                                }
                                                Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                                final Function0 function04 = function02;
                                                AnimatedVisibilityKt.e(z3, null, null, null, null, ComposableLambdaKt.c(-1147553415, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetUiKt$VideoAdBottomSheetUi$1$1$2$1$1$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj8;
                                                        Composer composer4 = (Composer) obj9;
                                                        ((Number) obj10).intValue();
                                                        Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                                                        IconButtonKt.c(CoreTheme.e(composer4).f4879a.G, StringResources_androidKt.c(composer4, R.string.dismiss_content_description), function04, SizeKt.q(PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 11), 24), false, null, CoreTheme.b(composer4).f4782a.d.b.f4798a, composer4, 3072, 48);
                                                        return Unit.f24250a;
                                                    }
                                                }, composer3), composer3, 1572870, 30);
                                                TextKt.b(videoAdBottomSheet2.e, AnimationModifierKt.a(companion2, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), null), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer3).d.c.b, composer3, 0, 0, 65532);
                                                composer3.f();
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer2), composer2, 30);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -247627271), 3);
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetUiKt$VideoAdBottomSheetUi$1$1$3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    AnimatedVisibilityKt.d(z2, null, null, null, null, ComposableSingletons$VideoAdBottomSheetUiKt.f8890a, composer2, 196608, 30);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1118026724), 3);
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdBottomSheetUiKt$VideoAdBottomSheetUi$1$1$4
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    Modifier modifierG = PaddingKt.g(Modifier.Companion.d, 16, 12);
                                    String str = videoAdBottomSheet.d;
                                    MarkdownTextViewStyle markdownTextViewStyle = new MarkdownTextViewStyle((Density) composer2.x(CompositionLocalsKt.h), CoreTheme.b(composer2).e.d.d, CoreTheme.f(composer2).f5120a.b.f5123a, new TextAlign(5), 16);
                                    Color color = new Color(CoreTheme.b(composer2).f4782a.d.b.f4798a);
                                    composer2.o(1849434622);
                                    Object objG3 = composer2.G();
                                    if (objG3 == Composer.Companion.f1624a) {
                                        objG3 = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(2);
                                        composer2.A(objG3);
                                    }
                                    composer2.l();
                                    MarkdownCompatKt.a(str, modifierG, markdownTextViewStyle, null, false, color, (Function2) objG3, false, null, null, composer2, 102236160, 664);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1704661979), 3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            modifier2 = companion;
            composerImpl = composerImplV;
            LazyDslKt.b(modifierX, lazyListStateA, null, false, null, Alignment.Companion.m, null, false, null, (Function1) objG2, composerImpl, 196608, 476);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(content, z, onDismissButtonClick, modifier2, i, 11);
        }
    }
}
