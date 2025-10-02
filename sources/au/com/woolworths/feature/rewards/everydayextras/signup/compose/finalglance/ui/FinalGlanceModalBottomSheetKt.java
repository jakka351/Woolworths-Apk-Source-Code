package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.FooterButtonKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.LoadingUiKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtraFinalGlanceContent;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtrasFinalGlanceContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FinalGlanceModalBottomSheetKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6091a = nlnlnnn.xxx00780078x0078;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6092a;

        static {
            int[] iArr = new int[EverydayExtrasButtonStyle.values().length];
            try {
                EverydayExtrasButtonStyle everydayExtrasButtonStyle = EverydayExtrasButtonStyle.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6092a = iArr;
        }
    }

    public static final void a(final EverydayExtraFinalGlanceContent finalGlanceContent, final Function1 onCtaClick, final Function1 onCancelClick, final StatefulButtonState statefulButtonState, Composer composer, final int i) {
        Intrinsics.h(finalGlanceContent, "finalGlanceContent");
        Intrinsics.h(onCtaClick, "onCtaClick");
        Intrinsics.h(onCancelClick, "onCancelClick");
        ComposerImpl composerImplV = composer.v(-1434990610);
        int i2 = i | (composerImplV.I(finalGlanceContent) ? 4 : 2) | (composerImplV.I(onCtaClick) ? 32 : 16) | (composerImplV.I(onCancelClick) ? 256 : 128) | (composerImplV.r(statefulButtonState.ordinal()) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierH = PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, 24, 1);
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | composerImplV.I(finalGlanceContent) | ((i2 & 896) == 256);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        float f = FinalGlanceModalBottomSheetKt.f6091a;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        for (EverydayExtrasFinalGlanceContentItem everydayExtrasFinalGlanceContentItem : finalGlanceContent.f6149a) {
                            if (everydayExtrasFinalGlanceContentItem instanceof EverydayExtrasFinalGlanceContentItem.TitleTextItem) {
                                final EverydayExtrasFinalGlanceContentItem.TitleTextItem titleTextItem = (EverydayExtrasFinalGlanceContentItem.TitleTextItem) everydayExtrasFinalGlanceContentItem;
                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt$FinalGlanceContent$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        LazyItemScope item = (LazyItemScope) obj2;
                                        Composer composer2 = (Composer) obj3;
                                        int iIntValue = ((Number) obj4).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            float f2 = 16;
                                            TextKt.b(titleTextItem.d, PaddingKt.i(SizeKt.e(Modifier.Companion.d, 1.0f), f2, 0, f2, 24), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composer2).i, composer2, 0, 0, 65020);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -370595026), 3);
                            } else if (everydayExtrasFinalGlanceContentItem instanceof EverydayExtrasFinalGlanceContentItem.Button) {
                                final EverydayExtrasFinalGlanceContentItem.Button button = (EverydayExtrasFinalGlanceContentItem.Button) everydayExtrasFinalGlanceContentItem;
                                EverydayExtrasButtonStyle everydayExtrasButtonStyle = button.g;
                                if ((everydayExtrasButtonStyle == null ? -1 : FinalGlanceModalBottomSheetKt.WhenMappings.f6092a[everydayExtrasButtonStyle.ordinal()]) == 1) {
                                    final StatefulButtonState statefulButtonState2 = statefulButtonState;
                                    final Function1 function1 = onCtaClick;
                                    LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt$FinalGlanceContent$1$1$1$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            LazyItemScope item = (LazyItemScope) obj2;
                                            Composer composer2 = (Composer) obj3;
                                            int iIntValue = ((Number) obj4).intValue();
                                            Intrinsics.h(item, "$this$item");
                                            if ((iIntValue & 17) == 16 && composer2.c()) {
                                                composer2.j();
                                            } else {
                                                Modifier modifierH2 = PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2);
                                                EverydayExtrasFinalGlanceContentItem.Button button2 = button;
                                                String str = button2.d;
                                                composer2.o(-1633490746);
                                                Function1 function12 = function1;
                                                boolean zN = composer2.n(function12) | composer2.I(button2);
                                                Object objG2 = composer2.G();
                                                if (zN || objG2 == Composer.Companion.f1624a) {
                                                    objG2 = new c(function12, button2, 0);
                                                    composer2.A(objG2);
                                                }
                                                composer2.l();
                                                StatefulButtonKt.b(str, str, modifierH2, statefulButtonState2, 0L, (Function0) objG2, composer2, KyberEngine.KyberPolyBytes, 16);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, 47917135), 3);
                                } else {
                                    final Function1 function12 = onCancelClick;
                                    LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt$FinalGlanceContent$1$1$1$3
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            LazyItemScope item = (LazyItemScope) obj2;
                                            Composer composer2 = (Composer) obj3;
                                            int iIntValue = ((Number) obj4).intValue();
                                            Intrinsics.h(item, "$this$item");
                                            if ((iIntValue & 17) == 16 && composer2.c()) {
                                                composer2.j();
                                            } else {
                                                Modifier modifierH2 = PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2);
                                                EverydayExtrasFinalGlanceContentItem.Button button2 = button;
                                                String str = button2.d;
                                                EverydayExtrasButtonStyle everydayExtrasButtonStyle2 = button2.g;
                                                composer2.o(-1633490746);
                                                Function1 function13 = function12;
                                                boolean zN = composer2.n(function13) | composer2.I(button2);
                                                Object objG2 = composer2.G();
                                                if (zN || objG2 == Composer.Companion.f1624a) {
                                                    objG2 = new c(function13, button2, 1);
                                                    composer2.A(objG2);
                                                }
                                                composer2.l();
                                                FooterButtonKt.b(str, everydayExtrasButtonStyle2, (Function0) objG2, modifierH2, composer2, 3072);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, 762985816), 3);
                                }
                            } else if (everydayExtrasFinalGlanceContentItem instanceof EverydayExtrasFinalGlanceContentItem.NoteTextItem) {
                                final EverydayExtrasFinalGlanceContentItem.NoteTextItem noteTextItem = (EverydayExtrasFinalGlanceContentItem.NoteTextItem) everydayExtrasFinalGlanceContentItem;
                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt$FinalGlanceContent$1$1$1$4
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        LazyItemScope item = (LazyItemScope) obj2;
                                        Composer composer2 = (Composer) obj3;
                                        int iIntValue = ((Number) obj4).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            final EverydayExtrasFinalGlanceContentItem.NoteTextItem noteTextItem2 = noteTextItem;
                                            CoreThemeKt.b(6, composer2, ComposableLambdaKt.c(-1460898765, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt$FinalGlanceContent$1$1$1$4.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj5, Object obj6) {
                                                    Composer composer3 = (Composer) obj5;
                                                    if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                                        composer3.j();
                                                    } else {
                                                        float f2 = 16;
                                                        MarkdownCompatKt.a(noteTextItem2.d, PaddingKt.i(SizeKt.e(Modifier.Companion.d, 1.0f), f2, 0, f2, 24), new MarkdownTextViewStyle((Density) composer3.x(CompositionLocalsKt.h), WxTheme.a(composer3).f(), WxTheme.b(composer3).n, new TextAlign(5), 16), null, true, new Color(CoreTheme.b(composer3).f4782a.d.b.f4798a), null, false, null, null, composer3, 24576, 968);
                                                    }
                                                    return Unit.f24250a;
                                                }
                                            }, composer2));
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -1682214602), 3);
                            } else {
                                if (!(everydayExtrasFinalGlanceContentItem instanceof EverydayExtrasFinalGlanceContentItem.TimelineBreakdown)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                final EverydayExtrasFinalGlanceContentItem.TimelineBreakdown timelineBreakdown = (EverydayExtrasFinalGlanceContentItem.TimelineBreakdown) everydayExtrasFinalGlanceContentItem;
                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt$FinalGlanceContent$1$1$1$5
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        LazyItemScope item = (LazyItemScope) obj2;
                                        Composer composer2 = (Composer) obj3;
                                        int iIntValue = ((Number) obj4).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            TimelineBreakdownUiKt.a(timelineBreakdown.d, composer2, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 1808337429), 3);
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifierH, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, 6, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(onCtaClick, onCancelClick, statefulButtonState, i) { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.b
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ StatefulButtonState g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    FinalGlanceModalBottomSheetKt.a(this.d, this.e, this.f, this.g, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final EverydayExtraFinalGlanceBottomSheetViewModel viewModel, ModalBottomSheetState modalBottomSheetState, Composer composer, int i) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(modalBottomSheetState, "modalBottomSheetState");
        ComposerImpl composerImplV = composer.v(177113352);
        int i2 = (composerImplV.I(viewModel) ? 4 : 2) | i | (composerImplV.I(modalBottomSheetState) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            int i3 = i2 & 112;
            boolean z = i3 == 32 || composerImplV.I(modalBottomSheetState);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                objG = new FinalGlanceModalBottomSheetKt$FinalGlanceModalBottomSheet$1$1(modalBottomSheetState, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG);
            ModalBottomSheetValue modalBottomSheetValueB = modalBottomSheetState.b();
            composerImplV.o(-1633490746);
            boolean zI = (i3 == 32 || composerImplV.I(modalBottomSheetState)) | composerImplV.I(viewModel);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new FinalGlanceModalBottomSheetKt$FinalGlanceModalBottomSheet$2$1(modalBottomSheetState, viewModel, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, modalBottomSheetValueB, (Function2) objG2);
            ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(-2141198822, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt$FinalGlanceModalBottomSheet$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheetLayout = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(5004770);
                        final EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel = viewModel;
                        boolean zI2 = composer2.I(everydayExtraFinalGlanceBottomSheetViewModel);
                        Object objG3 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                        if (zI2 || objG3 == composer$Companion$Empty$12) {
                            final int i4 = 0;
                            objG3 = new Function1() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    EverydayExtrasFinalGlanceContentItem.Button it = (EverydayExtrasFinalGlanceContentItem.Button) obj4;
                                    switch (i4) {
                                        case 0:
                                            Intrinsics.h(it, "it");
                                            EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel2 = everydayExtraFinalGlanceBottomSheetViewModel;
                                            everydayExtraFinalGlanceBottomSheetViewModel2.getClass();
                                            AnalyticsManager analyticsManager = everydayExtraFinalGlanceBottomSheetViewModel2.f;
                                            EdxFinalglanceAnalytics.Finalglance.Action.Companion companion = EdxFinalglanceAnalytics.Finalglance.Action.d;
                                            String label = it.d;
                                            companion.getClass();
                                            Intrinsics.h(label, "label");
                                            analyticsManager.g(new Event(label) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics$Finalglance$Action$Companion$buttonClick$1
                                                public final Object d;

                                                {
                                                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                                    spreadBuilder.b(EdxFinalglanceAnalytics.Finalglance.f);
                                                    a.z("event.Action", "bottomsheet_click", spreadBuilder, "event.Category", "Final Glance");
                                                    a.y("event.Label", String.valueOf(label), spreadBuilder);
                                                    ArrayList arrayList = spreadBuilder.f24269a;
                                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                }

                                                @Override // au.com.woolworths.analytics.Event
                                                /* renamed from: d */
                                                public final String getE() {
                                                    return "finalglance_bottomsheet_click";
                                                }

                                                public final boolean equals(Object obj5) {
                                                    if (!(obj5 instanceof Event)) {
                                                        return false;
                                                    }
                                                    Event event = (Event) obj5;
                                                    return "finalglance_bottomsheet_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                }

                                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                @Override // au.com.woolworths.analytics.Event
                                                public final Map getData() {
                                                    return this.d;
                                                }
                                            });
                                            everydayExtraFinalGlanceBottomSheetViewModel2.s6();
                                            break;
                                        default:
                                            Intrinsics.h(it, "it");
                                            EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel3 = everydayExtraFinalGlanceBottomSheetViewModel;
                                            if (((EverydayExtraFinalGlanceContract.ViewState) everydayExtraFinalGlanceBottomSheetViewModel3.h.getValue()).a()) {
                                                AnalyticsManager analyticsManager2 = everydayExtraFinalGlanceBottomSheetViewModel3.f;
                                                EdxFinalglanceAnalytics.Finalglance.Action.Companion companion2 = EdxFinalglanceAnalytics.Finalglance.Action.d;
                                                String label2 = it.d;
                                                companion2.getClass();
                                                Intrinsics.h(label2, "label");
                                                analyticsManager2.g(new Event(label2) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics$Finalglance$Action$Companion$buttonClick$1
                                                    public final Object d;

                                                    {
                                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                                        spreadBuilder.b(EdxFinalglanceAnalytics.Finalglance.f);
                                                        a.z("event.Action", "bottomsheet_click", spreadBuilder, "event.Category", "Final Glance");
                                                        a.y("event.Label", String.valueOf(label2), spreadBuilder);
                                                        ArrayList arrayList = spreadBuilder.f24269a;
                                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                    }

                                                    @Override // au.com.woolworths.analytics.Event
                                                    /* renamed from: d */
                                                    public final String getE() {
                                                        return "finalglance_bottomsheet_click";
                                                    }

                                                    public final boolean equals(Object obj5) {
                                                        if (!(obj5 instanceof Event)) {
                                                            return false;
                                                        }
                                                        Event event = (Event) obj5;
                                                        return "finalglance_bottomsheet_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                    }

                                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                    @Override // au.com.woolworths.analytics.Event
                                                    public final Map getData() {
                                                        return this.d;
                                                    }
                                                });
                                                everydayExtraFinalGlanceBottomSheetViewModel3.r6();
                                            }
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG3);
                        }
                        Function1 function1 = (Function1) objG3;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI3 = composer2.I(everydayExtraFinalGlanceBottomSheetViewModel);
                        Object objG4 = composer2.G();
                        if (zI3 || objG4 == composer$Companion$Empty$12) {
                            final int i5 = 1;
                            objG4 = new Function1() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    EverydayExtrasFinalGlanceContentItem.Button it = (EverydayExtrasFinalGlanceContentItem.Button) obj4;
                                    switch (i5) {
                                        case 0:
                                            Intrinsics.h(it, "it");
                                            EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel2 = everydayExtraFinalGlanceBottomSheetViewModel;
                                            everydayExtraFinalGlanceBottomSheetViewModel2.getClass();
                                            AnalyticsManager analyticsManager = everydayExtraFinalGlanceBottomSheetViewModel2.f;
                                            EdxFinalglanceAnalytics.Finalglance.Action.Companion companion = EdxFinalglanceAnalytics.Finalglance.Action.d;
                                            String label = it.d;
                                            companion.getClass();
                                            Intrinsics.h(label, "label");
                                            analyticsManager.g(new Event(label) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics$Finalglance$Action$Companion$buttonClick$1
                                                public final Object d;

                                                {
                                                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                                    spreadBuilder.b(EdxFinalglanceAnalytics.Finalglance.f);
                                                    a.z("event.Action", "bottomsheet_click", spreadBuilder, "event.Category", "Final Glance");
                                                    a.y("event.Label", String.valueOf(label), spreadBuilder);
                                                    ArrayList arrayList = spreadBuilder.f24269a;
                                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                }

                                                @Override // au.com.woolworths.analytics.Event
                                                /* renamed from: d */
                                                public final String getE() {
                                                    return "finalglance_bottomsheet_click";
                                                }

                                                public final boolean equals(Object obj5) {
                                                    if (!(obj5 instanceof Event)) {
                                                        return false;
                                                    }
                                                    Event event = (Event) obj5;
                                                    return "finalglance_bottomsheet_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                }

                                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                @Override // au.com.woolworths.analytics.Event
                                                public final Map getData() {
                                                    return this.d;
                                                }
                                            });
                                            everydayExtraFinalGlanceBottomSheetViewModel2.s6();
                                            break;
                                        default:
                                            Intrinsics.h(it, "it");
                                            EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel3 = everydayExtraFinalGlanceBottomSheetViewModel;
                                            if (((EverydayExtraFinalGlanceContract.ViewState) everydayExtraFinalGlanceBottomSheetViewModel3.h.getValue()).a()) {
                                                AnalyticsManager analyticsManager2 = everydayExtraFinalGlanceBottomSheetViewModel3.f;
                                                EdxFinalglanceAnalytics.Finalglance.Action.Companion companion2 = EdxFinalglanceAnalytics.Finalglance.Action.d;
                                                String label2 = it.d;
                                                companion2.getClass();
                                                Intrinsics.h(label2, "label");
                                                analyticsManager2.g(new Event(label2) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics$Finalglance$Action$Companion$buttonClick$1
                                                    public final Object d;

                                                    {
                                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                                        spreadBuilder.b(EdxFinalglanceAnalytics.Finalglance.f);
                                                        a.z("event.Action", "bottomsheet_click", spreadBuilder, "event.Category", "Final Glance");
                                                        a.y("event.Label", String.valueOf(label2), spreadBuilder);
                                                        ArrayList arrayList = spreadBuilder.f24269a;
                                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                    }

                                                    @Override // au.com.woolworths.analytics.Event
                                                    /* renamed from: d */
                                                    public final String getE() {
                                                        return "finalglance_bottomsheet_click";
                                                    }

                                                    public final boolean equals(Object obj5) {
                                                        if (!(obj5 instanceof Event)) {
                                                            return false;
                                                        }
                                                        Event event = (Event) obj5;
                                                        return "finalglance_bottomsheet_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                    }

                                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                    @Override // au.com.woolworths.analytics.Event
                                                    public final Map getData() {
                                                        return this.d;
                                                    }
                                                });
                                                everydayExtraFinalGlanceBottomSheetViewModel3.r6();
                                            }
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG4);
                        }
                        composer2.l();
                        FinalGlanceModalBottomSheetKt.c(everydayExtraFinalGlanceBottomSheetViewModel, function1, (Function1) objG4, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, modalBottomSheetState, BitmapDescriptorFactory.HUE_RED, 0L, 0L, true, ComposableSingletons$FinalGlanceModalBottomSheetKt.f6090a, composerImplV, 14156294 | ((i2 << 3) & 896), 58);
            if (modalBottomSheetState.d()) {
                composerImplV.o(5004770);
                boolean zI2 = composerImplV.I(viewModel);
                Object objG3 = composerImplV.G();
                if (zI2 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new androidx.lifecycle.a(viewModel, 25);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                BackHandlerKt.a(false, (Function0) objG3, composerImplV, 0, 1);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.d(viewModel, i, 18, modalBottomSheetState);
        }
    }

    public static final void c(final EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel, Function1 function1, Function1 function12, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(854147519);
        int i2 = i | (composerImplV.I(everydayExtraFinalGlanceBottomSheetViewModel) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.I(function12) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            EverydayExtraFinalGlanceContract.ViewState viewState = (EverydayExtraFinalGlanceContract.ViewState) FlowExtKt.a(everydayExtraFinalGlanceBottomSheetViewModel.h, composerImplV).getD();
            boolean z = viewState instanceof EverydayExtraFinalGlanceContract.ViewState.Loading;
            Modifier.Companion companion = Modifier.Companion.d;
            float f = f6091a;
            if (z) {
                composerImplV.o(-1772092787);
                Modifier modifierG = SizeKt.g(companion, f);
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                int i3 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
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
                LoadingUiKt.a(composerImplV, 0);
                composerImplV.V(true);
                composerImplV.V(false);
            } else {
                boolean z2 = viewState instanceof EverydayExtraFinalGlanceContract.ViewState.Content;
                BiasAlignment biasAlignment = Alignment.Companion.f1719a;
                if (z2) {
                    composerImplV.o(-1771810625);
                    Modifier modifierI = SizeKt.i(companion, 50, BitmapDescriptorFactory.HUE_RED, 2);
                    MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                    int i4 = composerImplV.P;
                    PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                    Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierI);
                    ComposeUiNode.e3.getClass();
                    Function0 function02 = ComposeUiNode.Companion.b;
                    composerImplV.i();
                    if (composerImplV.O) {
                        composerImplV.K(function02);
                    } else {
                        composerImplV.e();
                    }
                    Updater.b(composerImplV, measurePolicyD2, ComposeUiNode.Companion.g);
                    Updater.b(composerImplV, persistentCompositionLocalMapQ2, ComposeUiNode.Companion.f);
                    Function2 function22 = ComposeUiNode.Companion.j;
                    if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                        androidx.camera.core.impl.b.B(i4, composerImplV, i4, function22);
                    }
                    Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
                    EverydayExtraFinalGlanceContract.ViewState.Content content = (EverydayExtraFinalGlanceContract.ViewState.Content) viewState;
                    EverydayExtraFinalGlanceContent everydayExtraFinalGlanceContent = content.f6086a;
                    int iOrdinal = content.b.ordinal();
                    a(everydayExtraFinalGlanceContent, function1, function12, iOrdinal != 0 ? iOrdinal != 1 ? StatefulButtonState.f : StatefulButtonState.e : StatefulButtonState.d, composerImplV, i2 & 1008);
                    composerImplV.V(true);
                    composerImplV.V(false);
                } else {
                    if (!(viewState instanceof EverydayExtraFinalGlanceContract.ViewState.Error)) {
                        throw au.com.woolworths.android.onesite.a.w(497021588, composerImplV, false);
                    }
                    composerImplV.o(-1771390978);
                    Modifier modifierG2 = SizeKt.g(companion, f);
                    MeasurePolicy measurePolicyD3 = BoxKt.d(biasAlignment, false);
                    int i5 = composerImplV.P;
                    PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                    Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierG2);
                    ComposeUiNode.e3.getClass();
                    Function0 function03 = ComposeUiNode.Companion.b;
                    composerImplV.i();
                    if (composerImplV.O) {
                        composerImplV.K(function03);
                    } else {
                        composerImplV.e();
                    }
                    Updater.b(composerImplV, measurePolicyD3, ComposeUiNode.Companion.g);
                    Updater.b(composerImplV, persistentCompositionLocalMapQ3, ComposeUiNode.Companion.f);
                    Function2 function23 = ComposeUiNode.Companion.j;
                    if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                        androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
                    }
                    Updater.b(composerImplV, modifierD3, ComposeUiNode.Companion.d);
                    final EverydayExtraFinalGlanceContract.ViewState.Error error = (EverydayExtraFinalGlanceContract.ViewState.Error) viewState;
                    CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-527085502, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.FinalGlanceModalBottomSheetKt$SheetContent$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                FullPageMessage.Error error2 = error.f6087a;
                                composer2.o(5004770);
                                EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel2 = everydayExtraFinalGlanceBottomSheetViewModel;
                                boolean zI = composer2.I(everydayExtraFinalGlanceBottomSheetViewModel2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    FinalGlanceModalBottomSheetKt$SheetContent$3$1$1$1 finalGlanceModalBottomSheetKt$SheetContent$3$1$1$1 = new FinalGlanceModalBottomSheetKt$SheetContent$3$1$1$1(0, everydayExtraFinalGlanceBottomSheetViewModel2, EverydayExtraFinalGlanceBottomSheetViewModel.class, "retry", "retry()V", 0);
                                    composer2.A(finalGlanceModalBottomSheetKt$SheetContent$3$1$1$1);
                                    objG = finalGlanceModalBottomSheetKt$SheetContent$3$1$1$1;
                                }
                                composer2.l();
                                FullPageMessageUiKt.a(FullPageMessageSpec.Companion.a(error2, null, null, (Function0) ((KFunction) objG), composer2, 1572864, 30), null, null, composer2, 0, 6);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV));
                    composerImplV.V(true);
                    composerImplV.V(false);
                }
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(everydayExtraFinalGlanceBottomSheetViewModel, function1, function12, i, 4);
        }
    }
}
