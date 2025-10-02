package au.com.woolworths.shop.aem.components.ui.chatentrycard;

import androidx.collection.LruCache;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
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
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.CacheTextLayoutInput;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextLayoutCache;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.e;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import au.com.woolworths.shop.aem.components.model.chatentrycard.ChatEntryCard;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "currentIndex", "shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ChatEntryCardUiKt {
    public static final void a(final List list, Composer composer, int i) {
        boolean z;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-621680382);
        if (((i | (composerImplV.I(list) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
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
            composerImplV.o(-434384762);
            if (list.size() > 1) {
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(list);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new ChatEntryCardUiKt$SpecialPromptMarqueeTextField$1$1(list, mutableIntState, null);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, list, (Function2) objG2);
            }
            composerImplV.V(false);
            String str = (String) CollectionsKt.J(mutableIntState.d(), list);
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
                z = false;
                objG3 = new b(0);
                composerImplV.A(objG3);
            } else {
                z = false;
            }
            composerImplV.V(z);
            TextFieldKt.b("", (Function1) objG3, modifierE, false, true, null, null, ComposableLambdaKt.c(-916672281, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.chatentrycard.ChatEntryCardUiKt$SpecialPromptMarqueeTextField$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        int size = list.size();
                        String str3 = str2;
                        if (size > 1) {
                            composer2.o(-1181786109);
                            Modifier modifierB = ClipKt.b(Modifier.Companion.d);
                            composer2.o(1849434622);
                            Object objG4 = composer2.G();
                            if (objG4 == Composer.Companion.f1624a) {
                                objG4 = new b(1);
                                composer2.A(objG4);
                            }
                            composer2.l();
                            AnimatedContentKt.b(str3, modifierB, (Function1) objG4, null, null, null, ComposableSingletons$ChatEntryCardUiKt.f10214a, composer2, 1573296, 56);
                            composer2.l();
                        } else {
                            composer2.o(-1180945854);
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
            recomposeScopeImplX.d = new e(i, 4, list);
        }
    }

    public static final void b(final String str, final boolean z, final Painter betaIcon, final Modifier modifier, float f, float f2, float f3, TextStyle textStyle, long j, Composer composer, final int i) {
        int i2;
        final float f4;
        final float f5;
        TextStyle textStyle2;
        final long j2;
        final float f6;
        long j3;
        float f7;
        float f8;
        float f9;
        ComposerImpl composerImpl;
        final TextStyle textStyle3;
        final long j4;
        final float f10;
        final float f11;
        final float f12;
        Intrinsics.h(betaIcon, "betaIcon");
        ComposerImpl composerImplV = composer.v(1986732871);
        int i3 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(betaIcon) ? 256 : 128) | 39542784;
        if ((38347923 & i3) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            f11 = f;
            f12 = f2;
            f10 = f3;
            textStyle3 = textStyle;
            j4 = j;
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                i2 = i3 & (-264241153);
                f4 = 31;
                f5 = 14;
                textStyle2 = CoreTheme.f(composerImplV).d.c.d;
                j2 = CoreTheme.b(composerImplV).e.c.d;
                f6 = 8;
            } else {
                composerImplV.j();
                i2 = i3 & (-264241153);
                f4 = f;
                f5 = f2;
                f6 = f3;
                textStyle2 = textStyle;
                j2 = j;
            }
            composerImplV.W();
            if (z) {
                composerImplV.o(2110109767);
                FontFamily.Resolver resolver = (FontFamily.Resolver) composerImplV.x(CompositionLocalsKt.k);
                CompositionLocal compositionLocal = CompositionLocalsKt.h;
                Density density = (Density) composerImplV.x(compositionLocal);
                LayoutDirection layoutDirection = (LayoutDirection) composerImplV.x(CompositionLocalsKt.n);
                boolean zN = composerImplV.n(resolver) | composerImplV.n(density) | composerImplV.n(layoutDirection) | composerImplV.r(8);
                Object objG = composerImplV.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new TextMeasurer(resolver, density, layoutDirection, 8);
                    composerImplV.A(objG);
                }
                final TextMeasurer textMeasurer = (TextMeasurer) objG;
                final Density density2 = (Density) composerImplV.x(compositionLocal);
                final float fT1 = density2.T1(f6);
                final float fT12 = density2.T1(f4);
                final TextStyle textStyle4 = textStyle2;
                Function3<BoxWithConstraintsScope, Composer, Integer, Unit> function3 = new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.chatentrycard.ChatEntryCardUiKt$TitleBetaText$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        TextLayoutResult textLayoutResult;
                        CharSequence charSequenceSubSequence;
                        BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= composer2.n(BoxWithConstraints) ? 4 : 2;
                        }
                        if ((iIntValue & 19) == 18 && composer2.c()) {
                            composer2.j();
                        } else {
                            float fT13 = (density2.T1(BoxWithConstraints.f()) - fT12) - fT1;
                            composer2.o(-1633490746);
                            String strG = str;
                            boolean zN2 = composer2.n(strG) | composer2.q(fT13);
                            Object objG2 = composer2.G();
                            if (zN2 || objG2 == Composer.Companion.f1624a) {
                                AnnotatedString annotatedString = new AnnotatedString(strG);
                                long jB = ConstraintsKt.b((int) fT13, 0, 13);
                                boolean z2 = (1980 & 8) != 0;
                                int i4 = (1980 & 16) != 0 ? Integer.MAX_VALUE : 0;
                                int i5 = 1980 & 128;
                                TextMeasurer textMeasurer2 = textMeasurer;
                                LayoutDirection layoutDirection2 = i5 != 0 ? textMeasurer2.c : null;
                                Density density3 = (1980 & 256) != 0 ? textMeasurer2.b : null;
                                FontFamily.Resolver resolver2 = (1980 & 512) != 0 ? textMeasurer2.f2066a : null;
                                TextLayoutCache textLayoutCache = textMeasurer2.d;
                                TextStyle textStyle5 = textStyle4;
                                EmptyList emptyList = EmptyList.d;
                                TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle5, emptyList, i4, z2, 1, density3, layoutDirection2, resolver2, jB);
                                int i6 = i4;
                                TextLayoutResult textLayoutResult2 = null;
                                if (textLayoutCache != null) {
                                    CacheTextLayoutInput cacheTextLayoutInput = new CacheTextLayoutInput(textLayoutInput);
                                    LruCache lruCache = textLayoutCache.f2062a;
                                    if (lruCache != null) {
                                        textLayoutResult = (TextLayoutResult) lruCache.get(cacheTextLayoutInput);
                                    } else if (Intrinsics.c(textLayoutCache.b, cacheTextLayoutInput)) {
                                        textLayoutResult = textLayoutCache.c;
                                    }
                                    if (textLayoutResult != null && !textLayoutResult.b.f2045a.a()) {
                                        textLayoutResult2 = textLayoutResult;
                                    }
                                }
                                TextLayoutResult textLayoutResult3 = textLayoutResult2;
                                if (textLayoutResult3 != null) {
                                    objG2 = new TextLayoutResult(textLayoutInput, textLayoutResult3.b, ConstraintsKt.d(jB, (((int) Math.ceil(r1.e)) & 4294967295L) | (((int) Math.ceil(r1.d)) << 32)));
                                } else {
                                    MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, TextStyleKt.b(textStyle5, layoutDirection2), emptyList, density3, resolver2);
                                    int iJ = Constraints.j(jB);
                                    int iH = (z2 && Constraints.d(jB)) ? Constraints.h(jB) : Integer.MAX_VALUE;
                                    if (iJ != iH) {
                                        iH = RangesKt.c((int) Math.ceil(multiParagraphIntrinsics.c()), iJ, iH);
                                    }
                                    TextLayoutResult textLayoutResult4 = new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, Constraints.Companion.b(0, iH, 0, Constraints.g(jB)), i6, 1), ConstraintsKt.d(jB, (((int) Math.ceil(r22.e)) & 4294967295L) | (((int) Math.ceil(r22.d)) << 32)));
                                    if (textLayoutCache != null) {
                                        LruCache lruCache2 = textLayoutCache.f2062a;
                                        if (lruCache2 != null) {
                                            lruCache2.put(new CacheTextLayoutInput(textLayoutInput), textLayoutResult4);
                                        } else {
                                            textLayoutCache.b = new CacheTextLayoutInput(textLayoutInput);
                                            textLayoutCache.c = textLayoutResult4;
                                        }
                                    }
                                    objG2 = textLayoutResult4;
                                }
                                composer2.A(objG2);
                            }
                            composer2.l();
                            int iC = ((TextLayoutResult) objG2).b.c(0, true);
                            if (iC < strG.length()) {
                                String strT = StringsKt.t(3, StringsKt.f0(iC, strG));
                                int length = strT.length() - 1;
                                if (length >= 0) {
                                    while (true) {
                                        int i7 = length - 1;
                                        if (!CharsKt.c(strT.charAt(length))) {
                                            charSequenceSubSequence = strT.subSequence(0, length + 1);
                                            break;
                                        }
                                        if (i7 < 0) {
                                            break;
                                        }
                                        length = i7;
                                    }
                                    charSequenceSubSequence = "";
                                    strG = YU.a.g(charSequenceSubSequence.toString(), "...");
                                } else {
                                    charSequenceSubSequence = "";
                                    strG = YU.a.g(charSequenceSubSequence.toString(), "...");
                                }
                            }
                            Modifier.Companion companion = Modifier.Companion.d;
                            Modifier modifierE = SizeKt.e(companion, 1.0f);
                            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer2, 48);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
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
                            Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function2 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function2);
                            }
                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                            BasicTextKt.c(strG, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f6, BitmapDescriptorFactory.HUE_RED, 11), TextStyle.a(textStyle4, j2, 0L, null, null, 0L, 0L, null, null, 0, 16777214), null, 0, false, 1, 0, null, composer2, 1572864, 952);
                            ImageKt.a(betaIcon, "Beta", SizeKt.r(companion, f4, f5), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 48, 120);
                            composer2.f();
                        }
                        return Unit.f24250a;
                    }
                };
                textStyle2 = textStyle4;
                j3 = j2;
                f7 = f6;
                f8 = f4;
                f9 = f5;
                BoxWithConstraintsKt.a(modifier, null, false, ComposableLambdaKt.c(-918495306, function3, composerImplV), composerImplV, 3078, 6);
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else {
                j3 = j2;
                f7 = f6;
                f8 = f4;
                f9 = f5;
                composerImpl = composerImplV;
                composerImpl.o(2111712157);
                TextKt.a(str, textStyle2, SizeKt.e(modifier, 1.0f), j3, null, 0, 2, false, 1, null, composerImpl, (i2 & 14) | 102236160, 688);
                composerImpl.V(false);
            }
            textStyle3 = textStyle2;
            j4 = j3;
            f10 = f7;
            f11 = f8;
            f12 = f9;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, z, betaIcon, modifier, f11, f12, f10, textStyle3, j4, i) { // from class: au.com.woolworths.shop.aem.components.ui.chatentrycard.a
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Painter f;
                public final /* synthetic */ Modifier g;
                public final /* synthetic */ float h;
                public final /* synthetic */ float i;
                public final /* synthetic */ float j;
                public final /* synthetic */ TextStyle k;
                public final /* synthetic */ long l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(3073);
                    ChatEntryCardUiKt.b(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final ComposableLambdaImpl c(final ChatEntryCard chatEntryCard, final Function0 onChatEntryCardClick, final Modifier modifier, Composer composer) {
        Intrinsics.h(onChatEntryCardClick, "onChatEntryCardClick");
        composer.o(-1171597540);
        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-973800417, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.chatentrycard.ChatEntryCardUiKt$chatEntryCardUi$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                    composer2.j();
                } else {
                    final Function0 function0 = onChatEntryCardClick;
                    final ChatEntryCard chatEntryCard2 = chatEntryCard;
                    final Modifier modifier2 = modifier;
                    CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(-1021912765, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.chatentrycard.ChatEntryCardUiKt$chatEntryCardUi$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer3 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                composer3.j();
                            } else {
                                RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(16);
                                CoreElevation coreElevation = CoreTheme.c(composer3).f4876a;
                                Modifier modifierA = TestTagKt.a(modifier2, "chatentryCard");
                                composer3.o(5004770);
                                Function0 function02 = function0;
                                boolean zN = composer3.n(function02);
                                Object objG = composer3.G();
                                if (zN || objG == Composer.Companion.f1624a) {
                                    objG = new f(7, function02);
                                    composer3.A(objG);
                                }
                                composer3.l();
                                final ChatEntryCard chatEntryCard3 = chatEntryCard2;
                                CardKt.b((Function0) objG, modifierA, false, roundedCornerShapeB, 0L, 0L, 0L, 0L, coreElevation, null, null, ComposableLambdaKt.c(-609644098, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.chatentrycard.ChatEntryCardUiKt.chatEntryCardUi.1.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        Function0 function03;
                                        Function2 function2;
                                        ColumnScope Card = (ColumnScope) obj5;
                                        Composer composer4 = (Composer) obj6;
                                        int iIntValue = ((Number) obj7).intValue();
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
                                            Function0 function04 = ComposeUiNode.Companion.b;
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function04);
                                            } else {
                                                composer4.e();
                                            }
                                            Function2 function22 = ComposeUiNode.Companion.g;
                                            Updater.b(composer4, columnMeasurePolicyA, function22);
                                            Function2 function23 = ComposeUiNode.Companion.f;
                                            Updater.b(composer4, persistentCompositionLocalMapD, function23);
                                            Function2 function24 = ComposeUiNode.Companion.j;
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p))) {
                                                androidx.camera.core.impl.b.z(p, composer4, p, function24);
                                            }
                                            Function2 function25 = ComposeUiNode.Companion.d;
                                            Updater.b(composer4, modifierD, function25);
                                            long j = CoreTheme.b(composer4).e.f4848a.d;
                                            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
                                            float f = 8;
                                            Modifier modifierH = PaddingKt.h(BackgroundKt.b(companion, j, rectangleShapeKt$RectangleShape$1), f, BitmapDescriptorFactory.HUE_RED, 2);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
                                            Modifier modifierA2 = columnScopeInstance.a(modifierH, 1.0f, true);
                                            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer4, 0);
                                            int p2 = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer4.d();
                                            Modifier modifierD2 = ComposedModifierKt.d(composer4, modifierA2);
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function04);
                                            } else {
                                                composer4.e();
                                            }
                                            Updater.b(composer4, rowMeasurePolicyA, function22);
                                            Updater.b(composer4, persistentCompositionLocalMapD2, function23);
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p2))) {
                                                androidx.camera.core.impl.b.z(p2, composer4, p2, function24);
                                            }
                                            Updater.b(composer4, modifierD2, function25);
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                                            Modifier modifierF = PaddingKt.f(SizeKt.c(rowScopeInstance.a(companion, 1.5f, true), 1.0f), f);
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
                                                composer4.K(function04);
                                            } else {
                                                composer4.e();
                                            }
                                            Updater.b(composer4, columnMeasurePolicyA2, function22);
                                            Updater.b(composer4, persistentCompositionLocalMapD3, function23);
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p3))) {
                                                androidx.camera.core.impl.b.z(p3, composer4, p3, function24);
                                            }
                                            Updater.b(composer4, modifierD3, function25);
                                            ChatEntryCard chatEntryCard4 = chatEntryCard3;
                                            ChatEntryCardUiKt.b(chatEntryCard4.f10147a, Intrinsics.c(chatEntryCard4.c, Boolean.TRUE), PainterResources_androidKt.a(R.drawable.ic_chat_entry_bbs_beta, 0, composer4), SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 0L, composer4, 3072);
                                            TextKt.a(chatEntryCard4.b, CoreTheme.f(composer4).f5120a.c.f5124a, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composer4).e.c.d, null, 0, 2, false, 1, null, composer4, 102236544, 688);
                                            composer4.f();
                                            Modifier modifierA3 = rowScopeInstance.a(companion, 0.5f, true);
                                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.h, false);
                                            int p4 = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD4 = composer4.d();
                                            Modifier modifierD4 = ComposedModifierKt.d(composer4, modifierA3);
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                function03 = function04;
                                                composer4.K(function03);
                                            } else {
                                                function03 = function04;
                                                composer4.e();
                                            }
                                            Updater.b(composer4, measurePolicyD, function22);
                                            Updater.b(composer4, persistentCompositionLocalMapD4, function23);
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p4))) {
                                                function2 = function24;
                                                androidx.camera.core.impl.b.z(p4, composer4, p4, function2);
                                            } else {
                                                function2 = function24;
                                            }
                                            Updater.b(composer4, modifierD4, function25);
                                            composer4.o(1849434622);
                                            Object objG2 = composer4.G();
                                            if (objG2 == Composer.Companion.f1624a) {
                                                objG2 = new b(3);
                                                composer4.A(objG2);
                                            }
                                            composer4.l();
                                            Modifier modifierA4 = GraphicsLayerModifierKt.a(companion, (Function1) objG2);
                                            MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.f1719a, false);
                                            int p5 = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD5 = composer4.d();
                                            Modifier modifierD5 = ComposedModifierKt.d(composer4, modifierA4);
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function03);
                                            } else {
                                                composer4.e();
                                            }
                                            Updater.b(composer4, measurePolicyD2, function22);
                                            Updater.b(composer4, persistentCompositionLocalMapD5, function23);
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p5))) {
                                                androidx.camera.core.impl.b.z(p5, composer4, p5, function2);
                                            }
                                            Updater.b(composer4, modifierD5, function25);
                                            SingletonAsyncImageKt.a(chatEntryCard4.e, null, AspectRatioKt.a(companion, 1.0f), Alignment.Companion.b, ContentScale.Companion.f1880a, composer4, 1769904, 1944);
                                            composer4.f();
                                            composer4.f();
                                            composer4.f();
                                            Modifier modifierF2 = PaddingKt.f(columnScopeInstance.a(BackgroundKt.b(SizeKt.e(companion, 1.0f), CoreTheme.b(composer4).e.f4848a.b.c, rectangleShapeKt$RectangleShape$1), 1.0f, true), f);
                                            MeasurePolicy measurePolicyD3 = BoxKt.d(Alignment.Companion.e, false);
                                            int p6 = composer4.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD6 = composer4.d();
                                            Modifier modifierD6 = ComposedModifierKt.d(composer4, modifierF2);
                                            if (composer4.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer4.i();
                                            if (composer4.getO()) {
                                                composer4.K(function03);
                                            } else {
                                                composer4.e();
                                            }
                                            Updater.b(composer4, measurePolicyD3, function22);
                                            Updater.b(composer4, persistentCompositionLocalMapD6, function23);
                                            if (composer4.getO() || !Intrinsics.c(composer4.G(), Integer.valueOf(p6))) {
                                                androidx.camera.core.impl.b.z(p6, composer4, p6, function2);
                                            }
                                            Updater.b(composer4, modifierD6, function25);
                                            ChatEntryCardUiKt.a(chatEntryCard4.d, composer4, 0);
                                            composer4.f();
                                            composer4.f();
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer3), composer3, 0, 1780);
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
