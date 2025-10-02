package au.com.woolworths.feature.rewards.offers.ui.details;

import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.dynamic.page.ui.content.o;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.i;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract;
import au.com.woolworths.feature.rewards.offers.detail.OfferDetailsViewModel;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.CollapsingToolbarBackButtonKt;
import au.com.woolworths.foundation.rewards.common.ui.emptystate.RewardsEmptyStateKt;
import au.com.woolworths.foundation.rewards.common.ui.emptystate.RewardsEmptyStateSpec;
import au.com.woolworths.foundation.rewards.common.ui.errors.FullPageErrorContentKt;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.rewards.common.ui.textitem.MarkdownTextUiKt;
import au.com.woolworths.foundation.rewards.common.ui.textitem.SubheadTextUiKt;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsCardRow;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsContentItem;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsFooter;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsHeader;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsStatusBadge;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.rewards.offers.ui.AutoAdjustBackgroundHeaderImageKt;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferStatusExtKt;
import au.com.woolworths.foundation.rewards.offers.ui.TintableTextKt;
import au.com.woolworths.foundation.rewards.offers.ui.TintableTextSpec;
import au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.wx.CollapsingToolbarScaffoldKt;
import au.com.woolworths.rewards.base.confetti.RewardsConfettiKt;
import au.com.woolworths.rewards.base.data.EmptyStateButtonData;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.IconAssetKt;
import au.com.woolworths.sdui.legacy.downloadableasset.DownloadableAssetUiKt;
import au.com.woolworths.sdui.rewards.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.sdui.rewards.model.broadcastbanner.BasicCoreBroadcastBannerModel;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState;", "viewState", "offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferDetailsScreenKt {
    public static final void a(final OfferDetailsContentItem.OfferDetailsCard offerDetailsCard, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1825761313);
        if ((((composerImplV.I(offerDetailsCard) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(8);
            Modifier.Companion companion = Modifier.Companion.d;
            SurfaceKt.b(PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7), roundedCornerShapeB, 0L, 0L, null, null, ComposableLambdaKt.c(-742131421, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsCard$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierA = TestTagKt.a(PaddingKt.f(companion2, f), "offer_details_content");
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(f), Alignment.Companion.m, composer2, 6);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        composer2.o(748265872);
                        boolean z2 = false;
                        int i2 = 0;
                        for (Object obj3 : offerDetailsCard.f8609a) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            OfferDetailsCardRow offerDetailsCardRow = (OfferDetailsCardRow) obj3;
                            if (offerDetailsCardRow instanceof OfferDetailsCardRow.MarkdownTextItem) {
                                composer2.o(721957149);
                                Composer composer3 = composer2;
                                z = z2;
                                MarkdownTextUiKt.a(((OfferDetailsCardRow.MarkdownTextItem) offerDetailsCardRow).f8605a, null, 0L, CoreTheme.b(composer2).e.d.d, CoreTheme.f(composer2).f5120a.c.f5124a, null, false, composer3, 0, 102);
                                composer2 = composer3;
                                composer2.l();
                            } else {
                                z = z2;
                                if (offerDetailsCardRow instanceof OfferDetailsCardRow.OfferDetailsInfoItem) {
                                    composer2.o(722313370);
                                    OfferDetailsInfoItemUiKt.a((OfferDetailsCardRow.OfferDetailsInfoItem) offerDetailsCardRow, composer2, z ? 1 : 0);
                                    composer2.l();
                                } else if (offerDetailsCardRow instanceof OfferDetailsCardRow.OfferDetailsTrackerComboRow) {
                                    composer2.o(722472555);
                                    OfferDetailsCardRow.OfferDetailsTrackerComboRow offerDetailsTrackerComboRow = (OfferDetailsCardRow.OfferDetailsTrackerComboRow) offerDetailsCardRow;
                                    Composer composer4 = composer2;
                                    OfferDetailsTrackerComboRowUiKt.a(offerDetailsTrackerComboRow.f8607a, offerDetailsTrackerComboRow.b, offerDetailsTrackerComboRow.c, TestTagKt.a(companion2, "OfferDetailsComboRowTag"), composer4, 0);
                                    composer2 = composer4;
                                    composer2.l();
                                } else if (offerDetailsCardRow instanceof OfferDetailsCardRow.SubheadTextItem) {
                                    composer2.o(722876020);
                                    SubheadTextUiKt.a(((OfferDetailsCardRow.SubheadTextItem) offerDetailsCardRow).f8608a, TestTagKt.a(companion2, "TermsAndConditionSubHeadingTag"), 0L, null, composer2, 0);
                                    composer2.l();
                                } else {
                                    boolean z3 = offerDetailsCardRow instanceof OfferDetailsCardRow.ImageWithAlt;
                                    BiasAlignment biasAlignment = Alignment.Companion.f1719a;
                                    if (z3) {
                                        composer2.o(723159236);
                                        Modifier modifierA2 = AnimationModifierKt.a(SizeKt.e(companion2, 1.0f), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), null);
                                        MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, z);
                                        int p2 = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierA2);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function02 = ComposeUiNode.Companion.b;
                                        if (composer2.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer2.i();
                                        if (composer2.getO()) {
                                            composer2.K(function02);
                                        } else {
                                            composer2.e();
                                        }
                                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                        Updater.b(composer2, persistentCompositionLocalMapD2, ComposeUiNode.Companion.f);
                                        Function2 function22 = ComposeUiNode.Companion.j;
                                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                                            androidx.camera.core.impl.b.z(p2, composer2, p2, function22);
                                        }
                                        Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                                        SingletonAsyncImageKt.a(null, null, SizeKt.x(SizeKt.e(companion2, 1.0f), Alignment.Companion.k, false), null, ContentScale.Companion.d, composer2, 1573296, 1976);
                                        composer2.f();
                                        composer2.l();
                                    } else {
                                        if (!(offerDetailsCardRow instanceof OfferDetailsCardRow.DownloadableAssetWrapper)) {
                                            throw au.com.woolworths.android.onesite.a.x(composer2, 854572757);
                                        }
                                        composer2.o(723895238);
                                        Modifier modifierA3 = AnimationModifierKt.a(SizeKt.e(companion2, 1.0f), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), null);
                                        MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, z);
                                        int p3 = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer2.d();
                                        Modifier modifierD3 = ComposedModifierKt.d(composer2, modifierA3);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function03 = ComposeUiNode.Companion.b;
                                        if (composer2.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer2.i();
                                        if (composer2.getO()) {
                                            composer2.K(function03);
                                        } else {
                                            composer2.e();
                                        }
                                        Updater.b(composer2, measurePolicyD2, ComposeUiNode.Companion.g);
                                        Updater.b(composer2, persistentCompositionLocalMapD3, ComposeUiNode.Companion.f);
                                        Function2 function23 = ComposeUiNode.Companion.j;
                                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p3))) {
                                            androidx.camera.core.impl.b.z(p3, composer2, p3, function23);
                                        }
                                        Updater.b(composer2, modifierD3, ComposeUiNode.Companion.d);
                                        Composer composer5 = composer2;
                                        DownloadableAssetUiKt.b(((OfferDetailsCardRow.DownloadableAssetWrapper) offerDetailsCardRow).f8604a, SizeKt.e(companion2, 1.0f), false, false, true, null, null, composer5, 24624, 108);
                                        composer2 = composer5;
                                        composer2.f();
                                        composer2.l();
                                    }
                                }
                            }
                            z2 = z;
                            i2 = i3;
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 60);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(offerDetailsCard, i, 1, modifier);
        }
    }

    public static final void b(final OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage, final boolean z, final ScaffoldState scaffoldState, final Function0 function0, final Function0 function02, final Function1 function1, final Function2 function2, final boolean z2, final Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(818997479);
        if (((i | (composerImplV.I(offerDetailsPage) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.n(scaffoldState) ? 256 : 128) | (composerImplV.I(function0) ? 2048 : 1024) | (composerImplV.I(function02) ? 16384 : 8192) | (composerImplV.I(function1) ? 131072 : 65536) | (composerImplV.I(function2) ? 1048576 : 524288) | (composerImplV.p(z2) ? 8388608 : 4194304) | (composerImplV.n(modifier) ? 67108864 : 33554432)) & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(1030655802, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsContent$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function03 = function0;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-460740612, new Function3<Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsContent$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                float fFloatValue = ((Number) obj3).floatValue();
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.q(fFloatValue) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    CollapsingToolbarBackButtonKt.a(0, composer3, null, function03, fFloatValue > 0.7f);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage2 = offerDetailsPage;
                        final boolean z3 = z2;
                        ComposableLambdaImpl composableLambdaImplC2 = ComposableLambdaKt.c(-536579173, new Function3<Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsContent$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                float fFloatValue = ((Number) obj3).floatValue();
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.q(fFloatValue) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    OfferDetailsScreenKt.e(offerDetailsPage2.f6337a, 1.0f - fFloatValue, z3, SizeKt.e(Modifier.Companion.d, 1.0f), composer3, 3072);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2);
                        final Function0 function04 = function02;
                        final Function1 function12 = function1;
                        final OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage3 = offerDetailsPage;
                        final Function2 function22 = function2;
                        final boolean z4 = z;
                        CollapsingToolbarScaffoldKt.a(composableLambdaImplC, composableLambdaImplC2, modifier, scaffoldState, 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, null, null, ComposableLambdaKt.c(1923957107, new Function5<PaddingValues, NestedScrollConnection, Float, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsContent$1.3
                            @Override // kotlin.jvm.functions.Function5
                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                                PaddingValues paddingValues = (PaddingValues) obj3;
                                NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) obj4;
                                ((Number) obj5).floatValue();
                                Composer composer3 = (Composer) obj6;
                                ((Number) obj7).intValue();
                                Intrinsics.h(paddingValues, "paddingValues");
                                Intrinsics.h(nestedScrollConnection, "nestedScrollConnection");
                                Modifier.Companion companion = Modifier.Companion.d;
                                Modifier modifierE = SizeKt.e(companion, 1.0f);
                                ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
                                int p = composer3.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                Modifier modifierD = ComposedModifierKt.d(composer3, modifierE);
                                ComposeUiNode.e3.getClass();
                                Function0 function05 = ComposeUiNode.Companion.b;
                                if (composer3.w() == null) {
                                    ComposablesKt.b();
                                    throw null;
                                }
                                composer3.i();
                                if (composer3.getO()) {
                                    composer3.K(function05);
                                } else {
                                    composer3.e();
                                }
                                Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                Function2 function23 = ComposeUiNode.Companion.j;
                                if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                    androidx.camera.core.impl.b.z(p, composer3, p, function23);
                                }
                                Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                Modifier modifierA = TestTagKt.a(NestedScrollModifierKt.a(BackgroundKt.b(ColumnScopeInstance.f948a.a(SizeKt.e(companion, 1.0f), 1.0f, true), CoreTheme.b(composer3).e.f4848a.e, RectangleShapeKt.f1779a), nestedScrollConnection, null), "OfferDetailsContentTag");
                                composer3.o(-1633490746);
                                OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage4 = offerDetailsPage3;
                                boolean zI = composer3.I(offerDetailsPage4);
                                Function2 function24 = function22;
                                boolean zN = zI | composer3.n(function24);
                                Object objG = composer3.G();
                                if (zN || objG == Composer.Companion.f1624a) {
                                    objG = new d(offerDetailsPage4, function24, 0);
                                    composer3.A(objG);
                                }
                                composer3.l();
                                LazyDslKt.b(modifierA, null, null, false, null, null, null, false, null, (Function1) objG, composer3, 0, 510);
                                composer3.o(1337301563);
                                OfferDetailsFooter offerDetailsFooter = offerDetailsPage4.c;
                                if (offerDetailsFooter != null) {
                                    OfferDetailsScreenKt.d(offerDetailsFooter, z4, function04, function12, composer3, 0);
                                }
                                composer3.l();
                                composer3.f();
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 54, 48, 2032);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(offerDetailsPage, z, scaffoldState, function0, function02, function1, function2, z2, modifier, i);
        }
    }

    public static final void c(final OfferDetailsPageResponse.RewardsErrorEmptyState rewardsErrorEmptyState, final Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(505680571);
        int i2 = (composerImplV.I(rewardsErrorEmptyState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(-1205833842, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsEmptyState$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FillElement fillElement = SizeKt.c;
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, fillElement);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        EmptyStateButtonData emptyStateButtonData = null;
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
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        OfferDetailsPageResponse.RewardsErrorEmptyState rewardsErrorEmptyState2 = rewardsErrorEmptyState;
                        IconAsset iconAsset = rewardsErrorEmptyState2.f6338a;
                        String str = rewardsErrorEmptyState2.b;
                        String str2 = rewardsErrorEmptyState2.c;
                        ContentCta contentCta = rewardsErrorEmptyState2.d;
                        if (contentCta != null) {
                            String label = contentCta.getLabel();
                            String url = contentCta.getUrl();
                            if (url == null) {
                                url = "";
                            }
                            emptyStateButtonData = new EmptyStateButtonData(label, url);
                        }
                        RewardsEmptyStateSpec rewardsEmptyStateSpecA = RewardsEmptyStateSpec.Companion.a(iconAsset, str, str2, null, emptyStateButtonData, 178);
                        composer2.o(-1633490746);
                        boolean zI = composer2.I(rewardsErrorEmptyState2);
                        Function1 function12 = function1;
                        boolean zN = zI | composer2.n(function12);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new d(rewardsErrorEmptyState2, function12, 1);
                            composer2.A(objG);
                        }
                        composer2.l();
                        RewardsEmptyStateKt.a(rewardsEmptyStateSpecA, null, (Function1) objG, composer2, 0, 2);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(rewardsErrorEmptyState, i, 11, function1);
        }
    }

    public static final void d(final OfferDetailsFooter offerDetailsFooter, final boolean z, final Function0 function0, final Function1 function1, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-369164207);
        int i2 = (composerImplV.I(offerDetailsFooter) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SurfaceKt.b(null, null, 0L, 0L, null, CoreTheme.c(composerImplV).c, ComposableLambdaKt.c(-571386995, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsFooterUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ContentCta contentCta;
                    Modifier.Companion companion;
                    OfferDetailsStatusBadge offerDetailsStatusBadge;
                    OfferDetailsFooter offerDetailsFooter2;
                    float f;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierE = SizeKt.e(companion2, 1.0f);
                        Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Function2 function2 = ComposeUiNode.Companion.g;
                        Updater.b(composer2, columnMeasurePolicyA, function2);
                        Function2 function22 = ComposeUiNode.Companion.f;
                        Updater.b(composer2, persistentCompositionLocalMapD, function22);
                        Function2 function23 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function23);
                        }
                        Function2 function24 = ComposeUiNode.Companion.d;
                        Updater.b(composer2, modifierD, function24);
                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composer2).e.b.e, composer2, null);
                        float f2 = 8;
                        float f3 = 12;
                        Modifier modifierJ = PaddingKt.j(PaddingKt.h(SizeKt.e(companion2, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, f3, 5);
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, Alignment.Companion.n, composer2, 48);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierJ);
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, columnMeasurePolicyA2, function2);
                        Updater.b(composer2, persistentCompositionLocalMapD2, function22);
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            androidx.camera.core.impl.b.z(p2, composer2, p2, function23);
                        }
                        Updater.b(composer2, modifierD2, function24);
                        OfferDetailsFooter offerDetailsFooter3 = offerDetailsFooter;
                        String str = offerDetailsFooter3.f8610a;
                        OfferDetailsStatusBadge offerDetailsStatusBadge2 = offerDetailsFooter3.c;
                        ContentCta contentCta2 = offerDetailsFooter3.b;
                        composer2.o(-250533196);
                        if (str == null) {
                            offerDetailsFooter2 = offerDetailsFooter3;
                            offerDetailsStatusBadge = offerDetailsStatusBadge2;
                            contentCta = contentCta2;
                            companion = companion2;
                            f = f3;
                        } else {
                            contentCta = contentCta2;
                            companion = companion2;
                            offerDetailsStatusBadge = offerDetailsStatusBadge2;
                            offerDetailsFooter2 = offerDetailsFooter3;
                            f = f3;
                            TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).b.f5125a.f5126a, composer2, 0, 0, 65534);
                            composer2 = composer2;
                        }
                        composer2.l();
                        if ((contentCta != null ? contentCta.getUrl() : null) != null) {
                            composer2.o(823687463);
                            float f4 = 20;
                            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f4, f, f4, f);
                            Modifier modifierE2 = SizeKt.e(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 1.0f);
                            composer2.o(-1633490746);
                            Function1 function12 = function1;
                            final OfferDetailsFooter offerDetailsFooter4 = offerDetailsFooter2;
                            boolean zN = composer2.n(function12) | composer2.I(offerDetailsFooter4);
                            Object objG = composer2.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new e(0, function12, offerDetailsFooter4);
                                composer2.A(objG);
                            }
                            composer2.l();
                            PrimaryButtonKt.b((Function0) objG, modifierE2, false, paddingValuesImpl, ComposableLambdaKt.c(-69307147, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsFooterUi$1$1$1$3
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    RowScope PrimaryButton = (RowScope) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(PrimaryButton, "$this$PrimaryButton");
                                    if ((iIntValue & 17) == 16 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        OfferDetailsFooter offerDetailsFooter5 = offerDetailsFooter4;
                                        ContentCta contentCta3 = offerDetailsFooter5.b;
                                        Intrinsics.e(contentCta3);
                                        TextKt.b(StringKt.a(contentCta3.getLabel(), Locale.Companion.a()), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer3).f5120a.f5121a.b, composer3, 0, KyberEngine.KyberPolyBytes, 61438);
                                        ContentCta contentCta4 = offerDetailsFooter5.b;
                                        Intrinsics.e(contentCta4);
                                        if (Intrinsics.c(contentCta4.getIsExternalUrl(), Boolean.TRUE)) {
                                            SpacerKt.a(composer3, SizeKt.u(Modifier.Companion.d, 8));
                                            IconKt.b(CoreTheme.e(composer3).e.p, null, null, 0L, composer3, 48, 12);
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 27696, 4);
                            composer2.l();
                        } else {
                            Modifier.Companion companion3 = companion;
                            final OfferDetailsFooter offerDetailsFooter5 = offerDetailsFooter2;
                            if (contentCta != null) {
                                composer2.o(824936360);
                                final boolean z2 = z;
                                final Function0 function03 = function0;
                                ThemeKt.a(48, composer2, ComposableLambdaKt.c(2026248918, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsFooterUi$1$1$1$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer3 = (Composer) obj3;
                                        if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            Modifier modifierE3 = SizeKt.e(PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 1.0f);
                                            StatefulButtonState statefulButtonState = z2 ? StatefulButtonState.e : StatefulButtonState.d;
                                            ContentCta contentCta3 = offerDetailsFooter5.b;
                                            Intrinsics.e(contentCta3);
                                            StatefulButtonKt.b(StringKt.a(contentCta3.getLabel(), Locale.Companion.a()), "", modifierE3, statefulButtonState, 0L, function03, composer3, 432, 16);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2));
                                composer2.l();
                            } else if (offerDetailsStatusBadge != null) {
                                composer2.o(826315302);
                                Composer composer3 = composer2;
                                OfferDetailsScreenKt.h(offerDetailsStatusBadge, 4, SizeKt.e(companion3, 1.0f), composer3, 432, 0);
                                composer2 = composer3;
                                composer2.l();
                            } else {
                                composer2.o(826718023);
                                composer2.l();
                                Bark.Companion companion4 = Bark.f8483a;
                                Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.e), "OfferDetailsFooterUi: No CTA or StatusBadge provided", null);
                            }
                        }
                        composer2.f();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 31);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(offerDetailsFooter, z, function0, function1, i, 6);
        }
    }

    public static final void e(final OfferDetailsHeader offerDetailsHeader, final float f, final boolean z, final Modifier modifier, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(776724371);
        if (((i | (composerImplV.I(offerDetailsHeader) ? 4 : 2) | (composerImplV.q(f) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128)) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final float f2 = 36;
            Modifier modifierA = AnimationModifierKt.a(modifier, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), null);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            AnimatedVisibilityKt.d(true, SizeKt.e(modifier, 1.0f), EnterExitTransitionKt.e(null, 3), EnterExitTransitionKt.f(null, 3), null, ComposableLambdaKt.c(1239596021, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsHeader$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object iconAsset;
                    IconAsset iconAsset2;
                    Object iconAsset3;
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    Modifier modifierA2 = TestTagKt.a(modifier, "OfferDetailsHeroImageTag");
                    BiasAlignment biasAlignment = Alignment.Companion.f1719a;
                    MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierA2);
                    ComposeUiNode.e3.getClass();
                    Function0 function02 = ComposeUiNode.Companion.b;
                    if (composer2.w() == null) {
                        ComposablesKt.b();
                        throw null;
                    }
                    composer2.i();
                    if (composer2.getO()) {
                        composer2.K(function02);
                    } else {
                        composer2.e();
                    }
                    Updater.b(composer2, measurePolicyD2, ComposeUiNode.Companion.g);
                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                    Function2 function22 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function22);
                    }
                    Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                    OfferDetailsHeader offerDetailsHeader2 = offerDetailsHeader;
                    String assetUrl = offerDetailsHeader2.f8611a.getAssetUrl();
                    float f3 = f2;
                    Modifier.Companion companion = Modifier.Companion.d;
                    Modifier modifierA3 = AspectRatioKt.a(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3 / 2, 7), 2.0f);
                    composer2.o(1849434622);
                    Object objG = composer2.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (objG == composer$Companion$Empty$1) {
                        objG = new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.c(12);
                        composer2.A(objG);
                    }
                    composer2.l();
                    Modifier modifierA4 = SemanticsModifierKt.a(modifierA3, (Function1) objG);
                    composer2.o(5004770);
                    float f4 = f;
                    boolean zQ = composer2.q(f4);
                    Object objG2 = composer2.G();
                    if (zQ || objG2 == composer$Companion$Empty$1) {
                        objG2 = new o(f4, 2);
                        composer2.A(objG2);
                    }
                    composer2.l();
                    AutoAdjustBackgroundHeaderImageKt.a(assetUrl, GraphicsLayerModifierKt.a(modifierA4, (Function1) objG2), null, composer2, 0, 4);
                    Painter painterA = PainterResources_androidKt.a(R.drawable.ic_rewards_brand_icon_error, 0, composer2);
                    float f5 = 16;
                    Modifier modifierJ = PaddingKt.j(SizeKt.g(companion, f3), f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    BiasAlignment biasAlignment2 = Alignment.Companion.g;
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
                    Modifier modifierA5 = TestTagKt.a(boxScopeInstance.g(modifierJ, biasAlignment2), "LeafAssetTag");
                    IconAsset iconAsset4 = offerDetailsHeader2.b;
                    boolean z2 = iconAsset4 instanceof IconAsset.HostedIcon;
                    Unit unit = Unit.f24250a;
                    if (z2) {
                        iconAsset = ((IconAsset.HostedIcon) iconAsset4).getUrl();
                    } else if (iconAsset4 instanceof IconAsset.LocalAsset) {
                        iconAsset = IconAssetKt.toIconAsset(((IconAsset.LocalAsset) iconAsset4).getIconName());
                    } else {
                        if (!(iconAsset4 instanceof IconAsset.CoreIcon)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iconAsset = unit;
                    }
                    SingletonAsyncImageKt.b(iconAsset, null, modifierA5, null, painterA, null, null, null, null, null, null, null, composer2, 48, 0, 32744);
                    Modifier modifierG = boxScopeInstance.g(SizeKt.g(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 56, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 30), biasAlignment);
                    DownloadableAsset downloadableAsset = offerDetailsHeader2.f8611a;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = InspectionModeKt.f1972a;
                    if (!((Boolean) composer2.x(staticProvidableCompositionLocal)).booleanValue()) {
                        painterA = null;
                    }
                    SingletonAsyncImageKt.b(downloadableAsset, null, modifierG, null, painterA, null, null, null, null, null, null, null, composer2, 48, 0, 32744);
                    composer2.o(1161627794);
                    if (z && (iconAsset2 = offerDetailsHeader2.c) != null) {
                        Modifier modifierG2 = boxScopeInstance.g(SizeKt.q(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, BitmapDescriptorFactory.HUE_RED, 11), 64), Alignment.Companion.f);
                        if (iconAsset2 instanceof IconAsset.HostedIcon) {
                            iconAsset3 = ((IconAsset.HostedIcon) iconAsset2).getUrl();
                        } else if (iconAsset2 instanceof IconAsset.LocalAsset) {
                            iconAsset3 = IconAssetKt.toIconAsset(((IconAsset.LocalAsset) iconAsset2).getIconName());
                        } else {
                            if (!(iconAsset2 instanceof IconAsset.CoreIcon)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iconAsset3 = unit;
                        }
                        composer2.o(1161649303);
                        Painter painterA2 = ((Boolean) composer2.x(staticProvidableCompositionLocal)).booleanValue() ? PainterResources_androidKt.a(R.drawable.ic_product_offer_image_error, 0, composer2) : null;
                        composer2.l();
                        SingletonAsyncImageKt.b(iconAsset3, null, modifierG2, null, painterA2, null, null, null, null, null, null, null, composer2, 48, 0, 32744);
                    }
                    composer2.l();
                    composer2.f();
                    return unit;
                }
            }, composerImplV), composerImplV, 200070, 16);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(f, z, modifier, i) { // from class: au.com.woolworths.feature.rewards.offers.ui.details.b
                public final /* synthetic */ float e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ Modifier g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(3073);
                    OfferDetailsScreenKt.e(this.d, this.e, this.f, this.g, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void f(final OfferDetailsHeader offerDetailsHeader, Modifier modifier, final Function2 function2, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1135968132);
        int i2 = (composerImplV.I(offerDetailsHeader) ? 4 : 2) | i;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 0;
            float f2 = 8;
            SurfaceKt.b(modifier, RoundedCornerShapeKt.c(f, f, f2, f2), 0L, 0L, null, null, ComposableLambdaKt.c(-1586835264, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsHeaderContent$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierF = PaddingKt.f(companion, 16);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
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
                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function22 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function22);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        OfferDetailsHeader offerDetailsHeader2 = offerDetailsHeader;
                        OfferDetailsStatusBadge offerDetailsStatusBadge = offerDetailsHeader2.f;
                        composer2.o(125482052);
                        if (offerDetailsStatusBadge != null) {
                            float f3 = 4;
                            OfferDetailsScreenKt.h(offerDetailsStatusBadge, f3, null, composer2, 48, 4);
                            SpacerKt.a(composer2, SizeKt.g(companion, f3));
                        }
                        composer2.l();
                        TextKt.b(offerDetailsHeader2.d, TestTagKt.a(companion, "title"), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).d.b.d, composer2, 48, 0, 65532);
                        float f4 = 8;
                        SpacerKt.a(composer2, SizeKt.g(companion, f4));
                        TextKt.b(offerDetailsHeader2.e, TestTagKt.a(companion, lqlqqlq.mmm006Dm006Dm), CoreTheme.b(composer2).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).f5120a.b.f5123a, composer2, 48, 0, 65528);
                        BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = offerDetailsHeader2.g;
                        composer2.o(125506803);
                        if (basicCoreBroadcastBannerModel != null) {
                            SpacerKt.a(composer2, SizeKt.g(companion, f4));
                            Modifier modifierA = TestTagKt.a(companion, "broadcastBanner");
                            composer2.o(-1633490746);
                            Function2 function23 = function2;
                            boolean zN = composer2.n(function23) | composer2.I(basicCoreBroadcastBannerModel);
                            Object objG = composer2.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new d(function23, basicCoreBroadcastBannerModel);
                                composer2.A(objG);
                            }
                            composer2.l();
                            BroadcastBannerKt.a(basicCoreBroadcastBannerModel, (Function1) objG, modifierA, composer2, KyberEngine.KyberPolyBytes);
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 60);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(offerDetailsHeader, modifier, function2, i, 4);
        }
    }

    public static final void g(final OfferDetailsViewModel viewModel, Function0 onNavigateUp, Function1 onOpenUrl, final Modifier modifier, Composer composer, int i) {
        Object offerDetailsScreenKt$OfferDetailsScreen$1$1;
        final ScaffoldState scaffoldState;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onOpenUrl, "onOpenUrl");
        ComposerImpl composerImplV = composer.v(-461196438);
        int i2 = i | (composerImplV.n(viewModel) ? 4 : 2) | (composerImplV.I(onNavigateUp) ? 32 : 16) | (composerImplV.I(onOpenUrl) ? 256 : 128) | (composerImplV.n(modifier) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            MutableState mutableStateA = FlowExtKt.a(viewModel.o, composerImplV);
            ScaffoldState scaffoldStateD = ScaffoldKt.d(null, composerImplV, 3);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Flow flow = viewModel.m;
            composerImplV.o(-1224400529);
            boolean zN = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | composerImplV.n(scaffoldStateD) | composerImplV.I(context);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                scaffoldState = scaffoldStateD;
                offerDetailsScreenKt$OfferDetailsScreen$1$1 = new OfferDetailsScreenKt$OfferDetailsScreen$1$1(viewModel, onNavigateUp, onOpenUrl, scaffoldState, context, null);
                composerImplV.A(offerDetailsScreenKt$OfferDetailsScreen$1$1);
            } else {
                offerDetailsScreenKt$OfferDetailsScreen$1$1 = objG;
                scaffoldState = scaffoldStateD;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) offerDetailsScreenKt$OfferDetailsScreen$1$1);
            OfferDetailsContract.ViewState viewState = (OfferDetailsContract.ViewState) mutableStateA.getD();
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.c(11);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            AnimatedContentKt.b(viewState, null, null, null, "viewState", (Function1) objG2, ComposableLambdaKt.c(400737585, new Function4<AnimatedContentScope, OfferDetailsContract.ViewState, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsScreen$3
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                    final OfferDetailsContract.ViewState state = (OfferDetailsContract.ViewState) obj2;
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.h(state, "state");
                    if (state.equals(OfferDetailsContract.ViewState.Loading.f6308a)) {
                        composer2.o(-1635593128);
                        Modifier modifierA = TestTagKt.a(modifier, "LoadingSpinnerTag");
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
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
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composer2, null);
                        composer2.f();
                        composer2.l();
                    } else {
                        boolean z = state instanceof OfferDetailsContract.ViewState.Content;
                        final OfferDetailsViewModel offerDetailsViewModel = viewModel;
                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                        if (z) {
                            composer2.o(-1635265427);
                            OfferDetailsContract.ViewState.Content content = (OfferDetailsContract.ViewState.Content) state;
                            OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage = content.c;
                            boolean z2 = content.b;
                            composer2.o(5004770);
                            OfferDetailsViewModel offerDetailsViewModel2 = viewModel;
                            boolean zN2 = composer2.n(offerDetailsViewModel2);
                            Object objG3 = composer2.G();
                            if (zN2 || objG3 == composer$Companion$Empty$12) {
                                objG3 = new OfferDetailsScreenKt$OfferDetailsScreen$3$2$1(0, offerDetailsViewModel2, OfferDetailsViewModel.class, "onBackPressed", "onBackPressed()V", 0);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            Function0 function02 = (Function0) ((KFunction) objG3);
                            composer2.o(5004770);
                            OfferDetailsViewModel offerDetailsViewModel3 = viewModel;
                            boolean zN3 = composer2.n(offerDetailsViewModel3);
                            Object objG4 = composer2.G();
                            if (zN3 || objG4 == composer$Companion$Empty$12) {
                                objG4 = new OfferDetailsScreenKt$OfferDetailsScreen$3$3$1(0, offerDetailsViewModel3, OfferDetailsViewModel.class, "activateOffer", "activateOffer()V", 0);
                                composer2.A(objG4);
                            }
                            composer2.l();
                            Function0 function03 = (Function0) ((KFunction) objG4);
                            composer2.o(5004770);
                            OfferDetailsViewModel offerDetailsViewModel4 = viewModel;
                            boolean zN4 = composer2.n(offerDetailsViewModel4);
                            Object objG5 = composer2.G();
                            if (zN4 || objG5 == composer$Companion$Empty$12) {
                                objG5 = new OfferDetailsScreenKt$OfferDetailsScreen$3$4$1(1, offerDetailsViewModel4, OfferDetailsViewModel.class, "onUrlCtaClick", "onUrlCtaClick(Lau/com/woolworths/android/onesite/data/ContentCta;)V", 0);
                                composer2.A(objG5);
                            }
                            composer2.l();
                            Function1 function1 = (Function1) ((KFunction) objG5);
                            composer2.o(5004770);
                            OfferDetailsViewModel offerDetailsViewModel5 = viewModel;
                            boolean zN5 = composer2.n(offerDetailsViewModel5);
                            Object objG6 = composer2.G();
                            if (zN5 || objG6 == composer$Companion$Empty$12) {
                                objG6 = new OfferDetailsScreenKt$OfferDetailsScreen$3$5$1(2, offerDetailsViewModel5, OfferDetailsViewModel.class, "onBroadcastBannerActionClick", "onBroadcastBannerActionClick(Ljava/lang/String;Lau/com/woolworths/sdui/rewards/model/ActionData;)V", 0);
                                composer2.A(objG6);
                            }
                            composer2.l();
                            OfferDetailsScreenKt.b(offerDetailsPage, z2, scaffoldState, function02, function03, function1, (Function2) ((KFunction) objG6), content.d, modifier, composer2, 0);
                            AnimatedVisibilityKt.d(content.f6305a, null, EnterExitTransitionKt.e(null, 3), null, null, ComposableLambdaKt.c(-2042203048, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsScreen$3.6
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj5;
                                    Composer composer3 = (Composer) obj6;
                                    ((Number) obj7).intValue();
                                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                                    composer3.o(5004770);
                                    OfferDetailsViewModel offerDetailsViewModel6 = offerDetailsViewModel;
                                    boolean zN6 = composer3.n(offerDetailsViewModel6);
                                    Object objG7 = composer3.G();
                                    if (zN6 || objG7 == Composer.Companion.f1624a) {
                                        objG7 = new f(offerDetailsViewModel6, 4);
                                        composer3.A(objG7);
                                    }
                                    composer3.l();
                                    RewardsConfettiKt.a(0, 1, composer3, null, (Function0) objG7);
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 196992, 26);
                            composer2.l();
                        } else if (state instanceof OfferDetailsContract.ViewState.EmptyState) {
                            composer2.o(-1634266948);
                            composer2.o(5004770);
                            OfferDetailsViewModel offerDetailsViewModel6 = viewModel;
                            boolean zN6 = composer2.n(offerDetailsViewModel6);
                            Object objG7 = composer2.G();
                            if (zN6 || objG7 == composer$Companion$Empty$12) {
                                objG7 = new OfferDetailsScreenKt$OfferDetailsScreen$3$7$1(0, offerDetailsViewModel6, OfferDetailsViewModel.class, "onBackPressed", "onBackPressed()V", 0);
                                composer2.A(objG7);
                            }
                            composer2.l();
                            OfferDetailsScreenKt.i((Function0) ((KFunction) objG7), ComposableLambdaKt.c(711079231, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsScreen$3.8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    Composer composer3 = (Composer) obj5;
                                    if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        OfferDetailsPageResponse.RewardsErrorEmptyState rewardsErrorEmptyState = ((OfferDetailsContract.ViewState.EmptyState) state).f6306a;
                                        composer3.o(5004770);
                                        OfferDetailsViewModel offerDetailsViewModel7 = offerDetailsViewModel;
                                        boolean zN7 = composer3.n(offerDetailsViewModel7);
                                        Object objG8 = composer3.G();
                                        if (zN7 || objG8 == Composer.Companion.f1624a) {
                                            objG8 = new OfferDetailsScreenKt$OfferDetailsScreen$3$8$1$1(1, offerDetailsViewModel7, OfferDetailsViewModel.class, "onEmptyStateCtaClick", "onEmptyStateCtaClick(Lau/com/woolworths/android/onesite/data/ContentCta;)V", 0);
                                            composer3.A(objG8);
                                        }
                                        composer3.l();
                                        OfferDetailsScreenKt.c(rewardsErrorEmptyState, (Function1) ((KFunction) objG8), composer3, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 48);
                            composer2.l();
                        } else {
                            if (!(state instanceof OfferDetailsContract.ViewState.Error)) {
                                throw au.com.woolworths.android.onesite.a.x(composer2, -1438234619);
                            }
                            composer2.o(-1633869776);
                            composer2.o(5004770);
                            OfferDetailsViewModel offerDetailsViewModel7 = viewModel;
                            boolean zN7 = composer2.n(offerDetailsViewModel7);
                            Object objG8 = composer2.G();
                            if (zN7 || objG8 == composer$Companion$Empty$12) {
                                objG8 = new OfferDetailsScreenKt$OfferDetailsScreen$3$9$1(0, offerDetailsViewModel7, OfferDetailsViewModel.class, "onBackPressed", "onBackPressed()V", 0);
                                composer2.A(objG8);
                            }
                            composer2.l();
                            OfferDetailsScreenKt.i((Function0) ((KFunction) objG8), ComposableLambdaKt.c(769061504, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsScreen$3.10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    Composer composer3 = (Composer) obj5;
                                    if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        final OfferDetailsContract.ViewState viewState2 = state;
                                        final OfferDetailsViewModel offerDetailsViewModel8 = offerDetailsViewModel;
                                        ThemeKt.a(48, composer3, ComposableLambdaKt.c(-1233523891, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt.OfferDetailsScreen.3.10.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj7, Object obj8) {
                                                Composer composer4 = (Composer) obj7;
                                                if ((((Number) obj8).intValue() & 3) == 2 && composer4.c()) {
                                                    composer4.j();
                                                } else {
                                                    OfferDetailsContract.ViewState viewState3 = viewState2;
                                                    FullPageError fullPageError = ((OfferDetailsContract.ViewState.Error) viewState3).f6307a;
                                                    composer4.o(-1633490746);
                                                    OfferDetailsViewModel offerDetailsViewModel9 = offerDetailsViewModel8;
                                                    boolean zN8 = composer4.n(offerDetailsViewModel9) | composer4.I(viewState3);
                                                    Object objG9 = composer4.G();
                                                    if (zN8 || objG9 == Composer.Companion.f1624a) {
                                                        objG9 = new e(1, offerDetailsViewModel9, viewState3);
                                                        composer4.A(objG9);
                                                    }
                                                    composer4.l();
                                                    FullPageErrorContentKt.a(fullPageError, null, (Function0) objG9, composer4, 0);
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, composer3));
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 48);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1794048, 14);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a((Object) viewModel, (Object) onNavigateUp, (Object) onOpenUrl, modifier, i, 10);
        }
    }

    public static final void h(final OfferDetailsStatusBadge offerDetailsStatusBadge, final float f, final Modifier modifier, Composer composer, int i, int i2) {
        ComposerImpl composerImplV = composer.v(695365249);
        int i3 = (composerImplV.I(offerDetailsStatusBadge) ? 4 : 2) | i;
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(-2122438188, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsStatusBadge$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long jA;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        OfferDetailsStatusBadge offerDetailsStatusBadge2 = offerDetailsStatusBadge;
                        String str = offerDetailsStatusBadge2.f8612a;
                        RewardsOfferStatus rewardsOfferStatus = offerDetailsStatusBadge2.b;
                        Intrinsics.h(rewardsOfferStatus, "<this>");
                        composer2.o(1593784591);
                        switch (RewardsOfferStatusExtKt.WhenMappings.f8626a[rewardsOfferStatus.ordinal()]) {
                            case 1:
                                composer2.o(-1676321831);
                                jA = CoreTheme.d(composer2).b.f4873a;
                                composer2.l();
                                break;
                            case 2:
                                composer2.o(-1676325944);
                                jA = ColorResources_androidKt.a(composer2, R.color.color_rewards_offer_activated);
                                composer2.l();
                                break;
                            case 3:
                                composer2.o(-1676327623);
                                jA = CoreTheme.d(composer2).b.f4873a;
                                composer2.l();
                                break;
                            case 4:
                                composer2.o(-1676319239);
                                jA = CoreTheme.d(composer2).b.f4873a;
                                composer2.l();
                                break;
                            case 5:
                                composer2.o(-1676317560);
                                jA = ColorResources_androidKt.a(composer2, R.color.color_rewards_offer_activated);
                                composer2.l();
                                break;
                            case 6:
                                composer2.o(-1676314527);
                                jA = ColorResources_androidKt.a(composer2, R.color.color_brand_always);
                                composer2.l();
                                break;
                            case 7:
                                composer2.o(-1676310631);
                                jA = CoreTheme.d(composer2).b.f4873a;
                                composer2.l();
                                break;
                            default:
                                throw au.com.woolworths.android.onesite.a.x(composer2, -1676329938);
                        }
                        long j = jA;
                        composer2.l();
                        TintableTextKt.a(new TintableTextSpec(str, CoreTheme.f(composer2).f5120a.f5121a.b, j, RewardsOfferStatusExtKt.b(rewardsOfferStatus), RewardsOfferStatusExtKt.a(rewardsOfferStatus), f), TestTagKt.a(ClipKt.a(PaddingKt.h(modifier, BitmapDescriptorFactory.HUE_RED, 8, 1), RoundedCornerShapeKt.b(12)), "StatusBadgeTag"), composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(offerDetailsStatusBadge, f, modifier2, i, i2);
        }
    }

    public static final void i(final Function0 function0, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1756121271);
        if ((((composerImplV.I(function0) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            au.com.woolworths.design.core.ui.component.stable.ScaffoldKt.a(WindowInsetsPadding_androidKt.b(SizeKt.c), ComposableLambdaKt.c(1502089587, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsTopBar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        long j = CoreTheme.b(composer2).e.f4848a.c;
                        ComposableLambdaImpl composableLambdaImpl2 = ComposableSingletons$OfferDetailsScreenKt.f6411a;
                        final Function0 function02 = function0;
                        AppBarKt.c(0, 1573254, 42, j, 0L, composer2, composableLambdaImpl2, null, ComposableLambdaKt.c(-1031865159, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsTopBar$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).e.b, StringResources_androidKt.c(composer3, R.string.content_description_back_button), function02, null, false, null, 0L, composer3, 0, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, CoreTheme.b(composerImplV).e.f4848a.c, null, ComposableLambdaKt.c(-410228982, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt$OfferDetailsTopBar$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        composableLambdaImpl.invoke(composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582960, 108);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(function0, i, 0, composableLambdaImpl);
        }
    }
}
