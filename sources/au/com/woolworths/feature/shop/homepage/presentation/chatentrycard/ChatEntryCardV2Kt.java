package au.com.woolworths.feature.shop.homepage.presentation.chatentrycard;

import androidx.camera.core.impl.b;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.experimental.chip.e;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.internal.a;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.editorder.review.components.c;
import au.com.woolworths.feature.shop.homepage.data.ChatEntryCardCta;
import au.com.woolworths.feature.shop.homepage.data.ChatEntryCardV2;
import au.com.woolworths.feature.shop.homepage.data.ChatEntryElement;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "currentIndex", "homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ChatEntryCardV2Kt {
    public static final void a(final ArrayList arrayList, Modifier modifier, final Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1102505449);
        if (((i | (composerImplV.I(arrayList) ? 4 : 2) | 48 | (composerImplV.I(function1) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 8;
            Modifier modifierJ = PaddingKt.j(PaddingKt.h(BackgroundKt.b(SizeKt.e(companion, 1.0f), CoreTheme.b(composerImplV).e.f4848a.d, RectangleShapeKt.f1779a), f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, 7);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
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
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            FlowLayoutKt.b(modifierE, null, Arrangement.g(f), null, 0, 0, ComposableLambdaKt.c(716834562, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.chatentrycard.ChatEntryCardV2Kt$SelectionPromptsSection$1$1
                /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FlowRowScope FlowRow = (FlowRowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(FlowRow, "$this$FlowRow");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        for (final ChatEntryCardCta chatEntryCardCta : arrayList) {
                            final String str = (String) chatEntryCardCta.b.get(0);
                            RoundedCornerShape roundedCornerShapeA = RoundedCornerShapeKt.a(50);
                            CoreElevation coreElevation = CoreTheme.c(composer2).c;
                            Modifier modifierG = SizeKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), 40);
                            composer2.o(-1633490746);
                            Object obj4 = function1;
                            boolean zN = composer2.n(obj4) | composer2.I(chatEntryCardCta);
                            Object objG = composer2.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new n(7, obj4, chatEntryCardCta);
                                composer2.A(objG);
                            }
                            composer2.l();
                            SurfaceKt.b(ClickableKt.d(modifierG, false, null, null, (Function0) objG, 7), roundedCornerShapeA, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(900667083, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.chatentrycard.ChatEntryCardV2Kt$SelectionPromptsSection$1$1$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    Composer composer3 = (Composer) obj5;
                                    if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                        composer3.j();
                                    } else {
                                        Arrangement$Start$1 arrangement$Start$12 = Arrangement.f934a;
                                        float f2 = 16;
                                        Modifier.Companion companion2 = Modifier.Companion.d;
                                        Modifier modifierH = PaddingKt.h(companion2, f2, BitmapDescriptorFactory.HUE_RED, 2);
                                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$12, Alignment.Companion.k, composer3, 54);
                                        int p = composer3.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                        Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierH);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function02 = ComposeUiNode.Companion.b;
                                        if (composer3.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer3.i();
                                        if (composer3.getO()) {
                                            composer3.K(function02);
                                        } else {
                                            composer3.e();
                                        }
                                        Updater.b(composer3, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                                        Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                        Function2 function22 = ComposeUiNode.Companion.j;
                                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                            b.z(p, composer3, p, function22);
                                        }
                                        Updater.b(composer3, modifierD2, ComposeUiNode.Companion.d);
                                        SingletonAsyncImageKt.a(chatEntryCardCta.f7183a, null, SizeKt.q(PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, 11), f2), null, null, composer3, 432, 2040);
                                        TextKt.a(str, CoreTheme.f(composer3).f5120a.c.f5124a, SizeKt.e(companion2, 1.0f), CoreTheme.b(composer3).e.c.d, null, 0, 2, false, 1, null, composer3, 102236544, 688);
                                        composer3.f();
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 28);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1573254, 58);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a((Object) arrayList, modifier2, function1, i, 19);
        }
    }

    public static final void b(final ArrayList arrayList, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1919953691);
        if (((i | (composerImplV.I(arrayList) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotIntStateKt.a(0);
                composerImplV.A(objG);
            }
            MutableIntState mutableIntState = (MutableIntState) objG;
            composerImplV.V(false);
            composerImplV.o(1760448425);
            if (arrayList.size() > 1) {
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(arrayList);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new ChatEntryCardV2Kt$SpecialPromptMarqueeTextField$1$1(arrayList, mutableIntState, null);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, arrayList, (Function2) objG2);
            }
            composerImplV.V(false);
            String str = (String) CollectionsKt.J(mutableIntState.d(), arrayList);
            if (str == null) {
                str = "";
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f1339a;
            final String str2 = str;
            TextFieldColors textFieldColorsG = TextFieldDefaults.g(CoreTheme.b(composerImplV).d.d.d.b, Color.f, 0L, 0L, 0L, 0L, 0L, 0L, composerImplV, 2097146);
            Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(16);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new c(7);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            TextFieldKt.b("", (Function1) objG3, modifierE, false, true, null, null, ComposableLambdaKt.c(1648160074, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.chatentrycard.ChatEntryCardV2Kt$SpecialPromptMarqueeTextField$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        int size = arrayList.size();
                        String str3 = str2;
                        if (size > 1) {
                            composer2.o(270705856);
                            Modifier modifierB = ClipKt.b(Modifier.Companion.d);
                            composer2.o(1849434622);
                            Object objG4 = composer2.G();
                            if (objG4 == Composer.Companion.f1624a) {
                                objG4 = new c(9);
                                composer2.A(objG4);
                            }
                            composer2.l();
                            AnimatedContentKt.b(str3, modifierB, (Function1) objG4, null, null, null, ComposableSingletons$ChatEntryCardV2Kt.f7247a, composer2, 1573296, 56);
                            composer2.l();
                        } else {
                            composer2.o(271546111);
                            TextKt.a(str3, CoreTheme.f(composer2).f5120a.c.f5124a, null, CoreTheme.b(composer2).d.d.d.b, null, 3, 2, false, 1, null, composer2, 102236160, 660);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, false, null, null, null, true, 0, 0, null, roundedCornerShapeB, textFieldColorsG, composerImplV, 12610998, 24576, 245600);
            composerImpl = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(i, 27, arrayList);
        }
    }

    public static final ComposableLambdaImpl c(final ChatEntryCardV2 chatEntryCardV2, final Function1 onCtaClick, final Modifier modifier, Composer composer) {
        Intrinsics.h(onCtaClick, "onCtaClick");
        composer.o(1513650052);
        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-1066394809, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.chatentrycard.ChatEntryCardV2Kt$chatEntryCardV2$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                    composer2.j();
                } else {
                    final Modifier modifier2 = modifier;
                    final Function1 function1 = onCtaClick;
                    final ChatEntryCardV2 chatEntryCardV22 = chatEntryCardV2;
                    CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(-1117378197, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.chatentrycard.ChatEntryCardV2Kt$chatEntryCardV2$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer3 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                composer3.j();
                            } else {
                                final ChatEntryCardV2 chatEntryCardV23 = chatEntryCardV22;
                                List list = chatEntryCardV23.d;
                                final ArrayList arrayList = new ArrayList();
                                for (Object obj5 : list) {
                                    if (((ChatEntryCardCta) obj5).c == ChatEntryElement.e) {
                                        arrayList.add(obj5);
                                    }
                                }
                                RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(16);
                                CoreElevation coreElevation = CoreTheme.c(composer3).f4876a;
                                Modifier modifierA = TestTagKt.a(modifier2, "chatEntryCardV2");
                                composer3.o(1849434622);
                                Object objG = composer3.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (objG == composer$Companion$Empty$1) {
                                    objG = InteractionSourceKt.a();
                                    composer3.A(objG);
                                }
                                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
                                Object objE = au.com.woolworths.android.onesite.a.e(composer3, 1849434622);
                                if (objE == composer$Companion$Empty$1) {
                                    objE = new h(20);
                                    composer3.A(objE);
                                }
                                composer3.l();
                                Modifier modifierB = ClickableKt.b(modifierA, mutableInteractionSource, null, false, null, null, (Function0) objE, 28);
                                final Function1 function12 = function1;
                                CardKt.a(modifierB, roundedCornerShapeB, 0L, 0L, coreElevation, null, ComposableLambdaKt.c(692558104, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.chatentrycard.ChatEntryCardV2Kt.chatEntryCardV2.1.1.3
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) throws Throwable {
                                        Throwable th;
                                        ColumnScope Card = (ColumnScope) obj6;
                                        Composer composer4 = (Composer) obj7;
                                        int iIntValue = ((Number) obj8).intValue();
                                        Intrinsics.h(Card, "$this$Card");
                                        if ((iIntValue & 17) == 16 && composer4.c()) {
                                            composer4.j();
                                        } else {
                                            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
                                            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
                                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composer4, 0);
                                            int p = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer4.d();
                                            Modifier.Companion companion = Modifier.Companion.d;
                                            Modifier modifierD = ComposedModifierKt.d(composer4, companion);
                                            ComposeUiNode.e3.getClass();
                                            Function0 function0 = ComposeUiNode.Companion.b;
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function0);
                                            } else {
                                                composer4.e();
                                            }
                                            Function2 function2 = ComposeUiNode.Companion.g;
                                            Updater.b(composer4, columnMeasurePolicyA, function2);
                                            Function2 function22 = ComposeUiNode.Companion.f;
                                            Updater.b(composer4, persistentCompositionLocalMapD, function22);
                                            Function2 function23 = ComposeUiNode.Companion.j;
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p))) {
                                                b.z(p, composer4, p, function23);
                                            }
                                            Function2 function24 = ComposeUiNode.Companion.d;
                                            Updater.b(composer4, modifierD, function24);
                                            long j = CoreTheme.b(composer4).e.f4848a.d;
                                            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
                                            float f = 8;
                                            Modifier modifierG = PaddingKt.g(BackgroundKt.b(companion, j, rectangleShapeKt$RectangleShape$1), f, f);
                                            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                                            BiasAlignment.Vertical vertical = Alignment.Companion.k;
                                            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composer4, 48);
                                            int p2 = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer4.d();
                                            Modifier modifierD2 = ComposedModifierKt.d(composer4, modifierG);
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function0);
                                            } else {
                                                composer4.e();
                                            }
                                            Updater.b(composer4, rowMeasurePolicyA, function2);
                                            Updater.b(composer4, persistentCompositionLocalMapD2, function22);
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p2))) {
                                                b.z(p2, composer4, p2, function23);
                                            }
                                            Updater.b(composer4, modifierD2, function24);
                                            ChatEntryCardV2 chatEntryCardV24 = chatEntryCardV23;
                                            SingletonAsyncImageKt.a(chatEntryCardV24.e, null, ClipKt.a(SizeKt.q(companion, 36), RoundedCornerShapeKt.f1100a), null, ContentScale.Companion.f1880a, composer4, 1572912, 1976);
                                            Modifier modifierF = PaddingKt.f(companion, f);
                                            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.e, horizontal, composer4, 54);
                                            int p3 = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer4.d();
                                            Modifier modifierD3 = ComposedModifierKt.d(composer4, modifierF);
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function0);
                                            } else {
                                                composer4.e();
                                            }
                                            Updater.b(composer4, columnMeasurePolicyA2, function2);
                                            Updater.b(composer4, persistentCompositionLocalMapD3, function22);
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p3))) {
                                                b.z(p3, composer4, p3, function23);
                                            }
                                            Updater.b(composer4, modifierD3, function24);
                                            Modifier modifierE = SizeKt.e(companion, 1.0f);
                                            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composer4, 48);
                                            int p4 = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer4.d();
                                            Modifier modifierD4 = ComposedModifierKt.d(composer4, modifierE);
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function0);
                                            } else {
                                                composer4.e();
                                            }
                                            Updater.b(composer4, rowMeasurePolicyA2, function2);
                                            Updater.b(composer4, persistentCompositionLocalMapD4, function22);
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p4))) {
                                                b.z(p4, composer4, p4, function23);
                                            }
                                            Updater.b(composer4, modifierD4, function24);
                                            String str = chatEntryCardV24.f7184a;
                                            TextStyle textStyle = CoreTheme.f(composer4).d.c.d;
                                            long j2 = CoreTheme.b(composer4).e.c.d;
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                                            TextKt.a(str, textStyle, rowScopeInstance.a(companion, 1.0f, true), j2, null, 0, 2, false, 1, null, composer4, 102236160, 688);
                                            composer4.o(-447789501);
                                            if (Intrinsics.c(chatEntryCardV24.c, Boolean.TRUE)) {
                                                SpacerKt.a(composer4, SizeKt.u(companion, 4));
                                                ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_chat_entry_bbs_beta, 0, composer4), "Beta", rowScopeInstance.b(companion, Alignment.Companion.j), null, null, BitmapDescriptorFactory.HUE_RED, null, composer4, 48, 120);
                                            }
                                            composer4.l();
                                            composer4.f();
                                            TextKt.a(chatEntryCardV24.b, CoreTheme.f(composer4).f5120a.c.f5124a, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composer4).e.c.d, null, 0, 2, false, 1, null, composer4, 102236544, 688);
                                            composer4.f();
                                            composer4.f();
                                            List list2 = chatEntryCardV24.d;
                                            ArrayList arrayList2 = new ArrayList();
                                            for (Object obj9 : list2) {
                                                if (((ChatEntryCardCta) obj9).c == ChatEntryElement.d) {
                                                    arrayList2.add(obj9);
                                                }
                                            }
                                            composer4.o(660228939);
                                            boolean zIsEmpty = arrayList2.isEmpty();
                                            Function1 function13 = function12;
                                            if (zIsEmpty) {
                                                th = null;
                                            } else {
                                                th = null;
                                                ChatEntryCardV2Kt.a(arrayList2, null, function13, composer4, 0);
                                            }
                                            composer4.l();
                                            composer4.o(660238999);
                                            ArrayList arrayList3 = arrayList;
                                            if (!arrayList3.isEmpty()) {
                                                Modifier modifierF2 = PaddingKt.f(BackgroundKt.b(SizeKt.e(companion, 1.0f), CoreTheme.b(composer4).e.f4848a.b.c, rectangleShapeKt$RectangleShape$1), f);
                                                composer4.o(-1633490746);
                                                boolean zN = composer4.n(function13) | composer4.I(arrayList3);
                                                Object objG2 = composer4.G();
                                                if (zN || objG2 == Composer.Companion.f1624a) {
                                                    objG2 = new n(8, function13, arrayList3);
                                                    composer4.A(objG2);
                                                }
                                                composer4.l();
                                                Modifier modifierD5 = ClickableKt.d(modifierF2, false, null, null, (Function0) objG2, 7);
                                                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                                                int p5 = composer4.getP();
                                                PersistentCompositionLocalMap persistentCompositionLocalMapD5 = composer4.d();
                                                Modifier modifierD6 = ComposedModifierKt.d(composer4, modifierD5);
                                                ComposeUiNode.e3.getClass();
                                                Function0 function02 = ComposeUiNode.Companion.b;
                                                if (composer4.w() == null) {
                                                    ComposablesKt.b();
                                                    throw th;
                                                }
                                                composer4.i();
                                                if (composer4.getO()) {
                                                    composer4.K(function02);
                                                } else {
                                                    composer4.e();
                                                }
                                                Updater.b(composer4, measurePolicyD, ComposeUiNode.Companion.g);
                                                Updater.b(composer4, persistentCompositionLocalMapD5, ComposeUiNode.Companion.f);
                                                Function2 function25 = ComposeUiNode.Companion.j;
                                                if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p5))) {
                                                    b.z(p5, composer4, p5, function25);
                                                }
                                                Updater.b(composer4, modifierD6, ComposeUiNode.Companion.d);
                                                ArrayList arrayList4 = new ArrayList();
                                                Iterator it = arrayList3.iterator();
                                                while (it.hasNext()) {
                                                    CollectionsKt.h((Iterable) ((ChatEntryCardCta) it.next()).b, arrayList4);
                                                }
                                                ChatEntryCardV2Kt.b(arrayList4, composer4, 0);
                                                composer4.f();
                                            }
                                            composer4.l();
                                            composer4.f();
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer3), composer3, 1572864, 44);
                            }
                            return Unit.f24250a;
                        }
                    }, composer2));
                }
                return Unit.f24250a;
            }
        }, composer);
        composer.l();
        return composableLambdaImplC;
    }
}
