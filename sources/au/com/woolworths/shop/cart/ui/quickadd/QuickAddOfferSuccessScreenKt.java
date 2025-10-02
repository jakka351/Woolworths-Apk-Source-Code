package au.com.woolworths.shop.cart.ui.quickadd;

import android.content.res.Resources;
import android.graphics.Color;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.Resources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.QuantityStepperWithAddButtonKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.button.f;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.e;
import au.com.woolworths.product.composeui.ProductCardHorizontalUiKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.shared.ui.compose.ConfettiKt;
import au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepType;
import au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepperKt;
import au.com.woolworths.shop.cart.domain.model.OfferProductList;
import au.com.woolworths.shop.cart.ui.productreview.h;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferContract;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nl.dionsegijn.konfetti.core.Party;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.emitter.Emitter;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class QuickAddOfferSuccessScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OfferProductList.Success.OfferType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OfferProductList.Success.OfferType offerType = OfferProductList.Success.OfferType.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OfferProductList.Success.OfferType offerType2 = OfferProductList.Success.OfferType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[OfferProductList.Success.Progress.ProgressStepType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OfferProductList.Success.Progress.ProgressStepType progressStepType = OfferProductList.Success.Progress.ProgressStepType.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OfferProductList.Success.Progress.ProgressStepType progressStepType2 = OfferProductList.Success.Progress.ProgressStepType.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OfferProductList.Success.Progress.ProgressStepType progressStepType3 = OfferProductList.Success.Progress.ProgressStepType.d;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                OfferProductList.Success.Progress.ProgressStepType progressStepType4 = OfferProductList.Success.Progress.ProgressStepType.d;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final void a(int i, Composer composer, Modifier modifier, String str) {
        String str2;
        ComposerImpl composerImplV = composer.v(1312842769);
        int i2 = (composerImplV.n(str) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            str2 = str;
        } else {
            str2 = str;
            SingletonAsyncImageKt.a(str2, null, SizeKt.q(modifier, 98), null, null, composerImplV, (i2 & 14) | 48, 2040);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(str2, modifier, i, 16);
        }
    }

    public static final void b(OfferProductList.Success success, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Composer composer, int i) {
        int i2;
        Function1 function15;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1468056875);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(success) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(map) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            function15 = function1;
            i2 |= composerImplV.I(function15) ? 256 : 128;
        } else {
            function15 = function1;
        }
        if ((i & 3072) == 0) {
            function16 = function12;
            i2 |= composerImplV.I(function16) ? 2048 : 1024;
        } else {
            function16 = function12;
        }
        if ((i & 24576) == 0) {
            function17 = function13;
            i2 |= composerImplV.I(function17) ? 16384 : 8192;
        } else {
            function17 = function13;
        }
        if ((196608 & i) == 0) {
            function18 = function14;
            i2 |= composerImplV.I(function18) ? 131072 : 65536;
        } else {
            function18 = function14;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(-1224400529);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(success) | composerImplV.I(map) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & 458752) == 131072);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                e eVar = new e(success, map, function15, function16, function17, function18);
                composerImplV.A(eVar);
                objG = eVar;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            LazyDslKt.b(null, null, null, false, null, null, null, false, null, (Function1) objG, composerImpl, 0, 511);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.tag.d(success, map, function1, function12, function13, function14, i, 16);
        }
    }

    public static final void c(final OfferProductList.Success success, Composer composer, final int i) throws Resources.NotFoundException {
        QuickAddOfferConfetti quickAddOfferConfetti;
        ComposerImpl composerImplV = composer.v(-416164361);
        if ((((composerImplV.I(success) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (!success.f10435a) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i2 = 0;
                    recomposeScopeImplX.d = new Function2(success, i, i2) { // from class: au.com.woolworths.shop.cart.ui.quickadd.c
                        public final /* synthetic */ int d;
                        public final /* synthetic */ OfferProductList.Success e;

                        {
                            this.d = i2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                            int i3 = this.d;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i3) {
                                case 0:
                                    QuickAddOfferSuccessScreenKt.c(this.e, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                                default:
                                    QuickAddOfferSuccessScreenKt.c(this.e, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            OfferProductList.Success.OfferType offerType = success.f;
            composerImplV.o(754458862);
            int iOrdinal = offerType.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                quickAddOfferConfetti = QuickAddOfferConfetti.e;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                quickAddOfferConfetti = QuickAddOfferConfetti.f;
            }
            composerImplV.V(false);
            composerImplV.o(764915499);
            String[] stringArray = Resources_androidKt.a(composerImplV).getStringArray(quickAddOfferConfetti.d);
            ArrayList arrayList = new ArrayList(stringArray.length);
            for (String str : stringArray) {
                arrayList.add(Integer.valueOf(Color.parseColor(str)));
            }
            Position.Relative relative = new Position.Relative(0.5d, 0.0d);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Emitter emitter = new Emitter(100L);
            EmitterConfig emitterConfig = new EmitterConfig();
            emitterConfig.f26642a = timeUnit.convert(emitter.f26641a, timeUnit);
            emitterConfig.b = (r1 / 100) / 1000.0f;
            List listQ = CollectionsKt.Q(new Party(45.0f, null, arrayList, null, relative, emitterConfig, 6843));
            composerImplV.V(false);
            ConfettiKt.a(listQ, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i3 = 1;
            recomposeScopeImplX2.d = new Function2(success, i, i3) { // from class: au.com.woolworths.shop.cart.ui.quickadd.c
                public final /* synthetic */ int d;
                public final /* synthetic */ OfferProductList.Success e;

                {
                    this.d = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    int i32 = this.d;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i32) {
                        case 0:
                            QuickAddOfferSuccessScreenKt.c(this.e, composer2, RecomposeScopeImplKt.a(1));
                            break;
                        default:
                            QuickAddOfferSuccessScreenKt.c(this.e, composer2, RecomposeScopeImplKt.a(1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(final OfferProductList.Success success, final Modifier modifier, Composer composer, int i) {
        OfferProductList.Success success2;
        ComposerImpl composerImplV = composer.v(-1373373581);
        int i2 = (composerImplV.I(success) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            success2 = success;
        } else {
            success2 = success;
            CrossfadeKt.b(success2, null, null, null, ComposableLambdaKt.c(-1228262003, new Function3<OfferProductList.Success, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt$Header$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j;
                    int i3;
                    ProgressStepType progressStepType;
                    OfferProductList.Success it = (OfferProductList.Success) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    composer2.o(1849434622);
                    Object objG = composer2.G();
                    if (objG == Composer.Companion.f1624a) {
                        objG = new h(2);
                        composer2.A(objG);
                    }
                    composer2.l();
                    Modifier modifierB = SemanticsModifierKt.b(modifier, true, (Function1) objG);
                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
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
                    String str = it.c;
                    Modifier.Companion companion = Modifier.Companion.d;
                    Modifier modifierE = SizeKt.e(companion, 1.0f);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
                    TextKt.b(str, columnScopeInstance.b(modifierE, horizontal), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).d.c.b, composer2, 0, 0, 65020);
                    Modifier modifierG = SizeKt.g(PaddingKt.g(companion, 28, 8), 4);
                    OfferProductList.Success.OfferType offerType = success.f;
                    composer2.o(888099665);
                    int iOrdinal = offerType.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        composer2.o(-1234705895);
                        j = CoreTheme.a(composer2).f4774a.b.b;
                        composer2.l();
                    } else {
                        if (iOrdinal != 2) {
                            throw au.com.woolworths.android.onesite.a.x(composer2, -1234710721);
                        }
                        composer2.o(-1234702601);
                        j = CoreTheme.a(composer2).b.f4775a.c;
                        composer2.l();
                    }
                    composer2.l();
                    OfferProductList.Success.Progress progress = it.e;
                    int i4 = progress.d;
                    long j2 = j;
                    int i5 = progress.b;
                    int iOrdinal2 = progress.c.ordinal();
                    if (iOrdinal2 == 0) {
                        i3 = 3;
                        progressStepType = ProgressStepType.d;
                    } else if (iOrdinal2 == 1) {
                        i3 = 3;
                        progressStepType = ProgressStepType.e;
                    } else if (iOrdinal2 != 2) {
                        i3 = 3;
                        if (iOrdinal2 == 3) {
                            progressStepType = ProgressStepType.g;
                        } else {
                            if (iOrdinal2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            progressStepType = ProgressStepType.h;
                        }
                    } else {
                        i3 = 3;
                        progressStepType = ProgressStepType.f;
                    }
                    ProgressStepperKt.a(modifierG, j2, i4, i5, progressStepType, false, null, composer2, 0, 96);
                    TextKt.b(it.d, columnScopeInstance.b(PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, 7), horizontal), CoreTheme.b(composer2).e.c.b, 0L, null, 0L, null, new TextAlign(i3), 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).f5120a.b.f5123a, composer2, 0, 0, 65016);
                    composer2.f();
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i2 & 14) | 24576, 14);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(success2, i, 18, modifier);
        }
    }

    public static final void e(final ProductCard productCard, Map map, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Composer composer, int i) {
        int i2;
        final Map map2;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1191360334);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            map2 = map;
            i2 |= composerImplV.I(map2) ? 32 : 16;
        } else {
            map2 = map;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            function05 = function0;
            i2 |= composerImplV.I(function05) ? 256 : 128;
        } else {
            function05 = function0;
        }
        if ((i & 3072) == 0) {
            function06 = function02;
            i2 |= composerImplV.I(function06) ? 2048 : 1024;
        } else {
            function06 = function02;
        }
        if ((i & 24576) == 0) {
            function07 = function03;
            i2 |= composerImplV.I(function07) ? 16384 : 8192;
        } else {
            function07 = function03;
        }
        if ((196608 & i) == 0) {
            function08 = function04;
            i2 |= composerImplV.I(function08) ? 131072 : 65536;
        } else {
            function08 = function04;
        }
        int i3 = i2;
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final Function0 function09 = function05;
            final Function0 function010 = function06;
            final Function0 function011 = function07;
            final Function0 function012 = function08;
            composerImpl = composerImplV;
            ProductCardHorizontalUiKt.a(productCard, false, false, PaddingKt.f(AnimationModifierKt.a(Modifier.Companion.d, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), null), 16), false, false, false, null, false, false, false, false, false, false, null, null, null, ComposableLambdaKt.c(-1774831716, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt$ProductCard$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ProductCard productCard2 = productCard;
                        ProductTrolleyData trolley = productCard2.getTrolley();
                        if (trolley != null) {
                            Double inTrolley = (Double) map2.get(productCard2.getProductId());
                            QuantityStepperWithAddButtonKt.a((inTrolley == null && (inTrolley = trolley.getInTrolley()) == null) ? 0.0d : inTrolley.doubleValue(), trolley.getMaximum(), function09, function010, function011, function012, SizeKt.u(Modifier.Companion.d, 168), trolley.getUnitLabel(), composer2, 1572864, 0);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, ProductCard.$stable | 432 | (i3 & 14), 12582912, 131056);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImpl, null);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.tag.d(productCard, map, function0, function02, function03, function04, i, 15);
        }
    }

    public static final void f(boolean z, QuickAddOfferContract.Content.Success content, Function1 onAddClick, Function1 onDecrementClick, Function1 onIncrementClick, Function1 onQuantityClick, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Intrinsics.h(content, "content");
        OfferProductList.Success success = content.f10533a;
        Intrinsics.h(onAddClick, "onAddClick");
        Intrinsics.h(onDecrementClick, "onDecrementClick");
        Intrinsics.h(onIncrementClick, "onIncrementClick");
        Intrinsics.h(onQuantityClick, "onQuantityClick");
        ComposerImpl composerImplV = composer.v(-114589367);
        if ((i & 6) == 0) {
            i3 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (composerImplV.I(content) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.I(onAddClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= composerImplV.I(onDecrementClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= composerImplV.I(onIncrementClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= composerImplV.I(onQuantityClick) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i4 = i5 | 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i5 | (composerImplV.n(modifier2) ? 1048576 : 524288);
        }
        int i7 = i4;
        if ((599187 & i7) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifier3 = i6 != 0 ? companion : modifier2;
            Modifier modifierX0 = modifier3.x0(SizeKt.c);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i8 = composerImplV.P;
            Modifier modifier4 = modifier3;
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i9 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i9))) {
                androidx.camera.core.impl.b.B(i9, composerImplV, i9, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            d(success, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 110, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composerImplV, 48);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
            int i10 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                androidx.camera.core.impl.b.B(i10, composerImplV, i10, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            b(content.f10533a, content.b, onAddClick, onDecrementClick, onIncrementClick, onQuantityClick, composerImplV, i7 & 524160);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            int i11 = i7 & 14;
            PullRefreshState pullRefreshStateA = PullRefreshStateKt.a(z, (Function0) objG, composerImplV, i11 | 48);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            BiasAlignment biasAlignment2 = Alignment.Companion.b;
            PullRefreshIndicatorKt.a(z, pullRefreshStateA, boxScopeInstance.g(companion, biasAlignment2), 0L, 0L, composerImplV, i11 | 64, 56);
            composerImplV.V(true);
            composerImplV.V(true);
            c(success, composerImplV, 0);
            a(0, composerImplV, boxScopeInstance.g(companion, biasAlignment2), success.b);
            composerImplV.V(true);
            modifier2 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(z, content, onAddClick, onDecrementClick, onIncrementClick, onQuantityClick, modifier2, i, i2);
        }
    }
}
