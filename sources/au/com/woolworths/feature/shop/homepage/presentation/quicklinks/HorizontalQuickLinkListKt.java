package au.com.woolworths.feature.shop.homepage.presentation.quicklinks;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.compose.utils.graphics.ForwardingPainterKt;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.homepage.data.QuickLinkHorizontalListData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "topPadding", "homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HorizontalQuickLinkListKt {

    /* renamed from: a, reason: collision with root package name */
    public static final QuickLinkHorizontalListData f7253a;

    static {
        ActionType actionType = ActionType.e;
        f7253a = new QuickLinkHorizontalListData(CollectionsKt.R(new QuickLinkCard("Scan&Go", new ActionData("com.woolworths.shop://ScanAndGo", actionType, null, null), "Scan items as you go & check out fast", "", null, null, 48, null), new QuickLinkCard("Catalogue", new ActionData("com.woolworths.shop://catalogue", actionType, null, null), "Check weekly specials and save", "", null, null, 48, null)));
    }

    public static final void a(final QuickLinkCard quickLinkCard, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-591965274);
        int i2 = i | (composerImplV.I(quickLinkCard) ? 4 : 2) | KyberEngine.KyberPolyBytes;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            final Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierL = SizeKt.l(companion, 100, 124);
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(8);
            boolean z = true;
            float f = 1;
            composerImplV.o(-1633490746);
            if ((i2 & 14) != 4 && !composerImplV.I(quickLinkCard)) {
                z = false;
            }
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new a(quickLinkCard, function1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            CardKt.b((Function0) objG, modifierL, false, roundedCornerShapeB, 0L, 0L, null, f, null, ComposableLambdaKt.c(1818076300, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.quicklinks.HorizontalQuickLinkListKt$HorizontalQuickLinkCard$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f2 = 6;
                        float f3 = 16;
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierJ = PaddingKt.j(companion2, f2, f3, f2, BitmapDescriptorFactory.HUE_RED, 8);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer2, 48);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierJ);
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
                        Painter painterA = ForwardingPainterKt.a(PainterResources_androidKt.a(R.drawable.oval_placeholder, 0, composer2), ColorFilter.Companion.a(TintColors.e), null, 10);
                        QuickLinkCard quickLinkCard2 = quickLinkCard;
                        SingletonAsyncImageKt.b(quickLinkCard2.getImage(), null, SizeKt.q(companion2, 56), painterA, painterA, null, null, null, null, null, ContentScale.Companion.f1880a, null, composer2, 432, 6, 31712);
                        composer2.o(1849434622);
                        Object objG2 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (objG2 == composer$Companion$Empty$1) {
                            objG2 = SnapshotStateKt.f(new Dp(f3));
                            composer2.A(objG2);
                        }
                        MutableState mutableState = (MutableState) objG2;
                        composer2.l();
                        Modifier modifierJ2 = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, ((Dp) mutableState.getD()).d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                        TextStyle textStyle = WxTheme.b(composer2).s;
                        String title = quickLinkCard2.getTitle();
                        TextAlign textAlign = new TextAlign(3);
                        composer2.o(5004770);
                        Object objG3 = composer2.G();
                        if (objG3 == composer$Companion$Empty$1) {
                            objG3 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 9);
                            composer2.A(objG3);
                        }
                        composer2.l();
                        TextKt.b(title, modifierJ2, 0L, 0L, null, 0L, null, textAlign, 0L, 2, false, 2, 0, (Function1) objG3, textStyle, composer2, 0, 199728, 22012);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 817889280, 372);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(quickLinkCard, function1, modifier2, i, 21);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.feature.shop.homepage.data.QuickLinkHorizontalListData r17, final kotlin.jvm.functions.Function1 r18, kotlin.jvm.functions.Function1 r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.homepage.presentation.quicklinks.HorizontalQuickLinkListKt.b(au.com.woolworths.feature.shop.homepage.data.QuickLinkHorizontalListData, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
