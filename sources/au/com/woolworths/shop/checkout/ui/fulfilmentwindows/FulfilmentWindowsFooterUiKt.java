package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import androidx.camera.core.impl.b;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.v2.ui.d;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowSlotSelectionInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsFooterIconData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FooterData;", "previousFooterData", "", "isVisible", "Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowSlotSelectionInfo;", "targetState", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FulfilmentWindowsFooterUiKt {
    public static final void a(FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo, boolean z, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1683912370);
        int i2 = (composerImplV.n(fulfilmentWindowSlotSelectionInfo) ? 4 : 2) | i | (composerImplV.p(z) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
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
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = SnapshotStateKt.f(null);
                composerImplV.A(objD);
            }
            final MutableState mutableState2 = (MutableState) objD;
            composerImplV.V(false);
            composerImplV.o(962893701);
            if (z) {
                composerImplV.o(-1746271574);
                boolean z2 = (i2 & 14) == 4;
                Object objG2 = composerImplV.G();
                if (z2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new FulfilmentWindowsFooterUiKt$FulfilmentWindowSlotSelectionInfoUi$1$1(fulfilmentWindowSlotSelectionInfo, mutableState, mutableState2, null);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, fulfilmentWindowSlotSelectionInfo, (Function2) objG2);
            } else {
                mutableState2.setValue(fulfilmentWindowSlotSelectionInfo);
                mutableState.setValue(Boolean.TRUE);
            }
            composerImplV.V(false);
            boolean zBooleanValue = ((Boolean) mutableState.getD()).booleanValue();
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new d(4);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EnterTransition enterTransitionB = EnterExitTransitionKt.n(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), (Function1) objG3).b(EnterExitTransitionKt.e(null, 3));
            composerImplV.o(1849434622);
            Object objG4 = composerImplV.G();
            if (objG4 == composer$Companion$Empty$1) {
                objG4 = new d(4);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            AnimatedVisibilityKt.d(zBooleanValue, null, enterTransitionB, EnterExitTransitionKt.q(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), (Function1) objG4).b(EnterExitTransitionKt.f(null, 3)), null, ComposableLambdaKt.c(-1881104858, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFooterUiKt$FulfilmentWindowSlotSelectionInfoUi$4

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f10788a;

                    static {
                        int[] iArr = new int[FulfilmentWindowsFooterIconData.values().length];
                        try {
                            iArr[FulfilmentWindowsFooterIconData.GREEN_DELIVERY.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[FulfilmentWindowsFooterIconData.PARTNER_DELIVERY.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[FulfilmentWindowsFooterIconData.d.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        f10788a = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo2 = (FulfilmentWindowSlotSelectionInfo) mutableState2.getD();
                    if (fulfilmentWindowSlotSelectionInfo2 != null) {
                        Modifier.Companion companion = Modifier.Companion.d;
                        float f = 16;
                        Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
                        Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Center$1, vertical, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierJ);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        Integer numValueOf = null;
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
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        int i3 = WhenMappings.f10788a[fulfilmentWindowSlotSelectionInfo2.b.ordinal()];
                        if (i3 == 1) {
                            numValueOf = Integer.valueOf(R.drawable.ic_green_delivery);
                        } else if (i3 == 2) {
                            numValueOf = 2131231503;
                        } else if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.o(-1578355498);
                        if (numValueOf != null) {
                            ImageKt.a(PainterResources_androidKt.a(numValueOf.intValue(), 0, composer2), null, SizeKt.q(RowScopeInstance.f974a.b(companion, vertical), 32), null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 48, 120);
                        }
                        composer2.l();
                        String str = fulfilmentWindowSlotSelectionInfo2.f10609a;
                        composer2.o(-1578344693);
                        if (str != null) {
                            MarkdownCompatKt.a(str, PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), new MarkdownTextViewStyle((Density) composer2.x(CompositionLocalsKt.h), WxTheme.a(composer2).c(), WxTheme.b(composer2).l, (TextAlign) null, 24), null, false, null, null, false, null, null, composer2, 48, 1016);
                            composer2 = composer2;
                        }
                        composer2.l();
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 200064, 18);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.internal.a(i, 2, fulfilmentWindowSlotSelectionInfo, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.shop.checkout.domain.model.FooterData r15, androidx.compose.ui.Modifier r16, boolean r17, final kotlin.jvm.functions.Function1 r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFooterUiKt.b(au.com.woolworths.shop.checkout.domain.model.FooterData, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
