package au.com.woolworths.feature.shop.contentpage.ui;

import android.app.Activity;
import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.LocalActivityKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.compose.utils.modifier.ConditionalModifierKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.contentpage.ContentPageContract;
import au.com.woolworths.feature.shop.contentpage.ContentPageContractKt;
import au.com.woolworths.feature.shop.contentpage.ContentPageFullPageError;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageData;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageHeaderData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.tile.PromotionClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "topBarHeightDp", "", "contentPageYOffset", "content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentPageScreenKt {
    public static final void a(final State viewState, Flow actionFlow, Function0 function0, final Function2 function2, final Function1 function1, final Function2 function22, final Function1 onDynamicSizeCardImpression, final ProductClickListener productClickListener, final LazyListState lazyListState, final PullRefreshState pullRefreshState, final float f, final Function1 processActivityResult, final Function1 onLaunchProductDetails, Function1 function12, final Function1 launchProductOnMap, Modifier modifier, boolean z, Function1 function13, Function2 function23, Function2 function24, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, PromotionClickListener promotionClickListener, Function3 function3, Composer composer, final int i, final int i2, final int i3, final int i4) {
        int i5;
        Function2 function25;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ComposerImpl composerImpl;
        Activity activity;
        ManagedActivityResultLauncher managedActivityResultLauncher;
        ManagedActivityResultLauncher managedActivityResultLauncher2;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        Modifier.Companion companion;
        Function1 function111;
        ManagedActivityResultLauncher managedActivityResultLauncher3;
        Function1 function112;
        Function1 function113;
        boolean z2;
        SnackbarHostState snackbarHostState;
        int i13;
        Function1 function114;
        Function1 function115;
        int i14;
        boolean z3;
        Function1 function116;
        PromotionClickListener promotionClickListener2;
        Function1 function117;
        final Function0 function02;
        final Context context;
        Function1 function118;
        Function1 function119;
        ContentPageHeaderData contentPageHeaderData;
        Flow flow;
        final Modifier modifier2;
        Function2 function26;
        Function2 function27;
        final Function2 function28;
        final boolean z4;
        final Function1 function120;
        final Function1 function121;
        final Function1 function122;
        final Function3 function32;
        final Function1 function123;
        final Function1 function124;
        final PromotionClickListener promotionClickListener3;
        final Function2 function29;
        final Function1 function125;
        final Function1 function126;
        final Function1 function127;
        final Function1 eventSink = function12;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(actionFlow, "actionFlow");
        Intrinsics.h(onDynamicSizeCardImpression, "onDynamicSizeCardImpression");
        Intrinsics.h(productClickListener, "productClickListener");
        Intrinsics.h(lazyListState, "lazyListState");
        Intrinsics.h(processActivityResult, "processActivityResult");
        Intrinsics.h(onLaunchProductDetails, "onLaunchProductDetails");
        Intrinsics.h(eventSink, "eventSink");
        Intrinsics.h(launchProductOnMap, "launchProductOnMap");
        ComposerImpl composerImplV = composer.v(507063349);
        if ((i & 6) == 0) {
            i5 = i | (composerImplV.n(viewState) ? 4 : 2);
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= composerImplV.I(actionFlow) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function25 = function2;
            i5 |= composerImplV.I(function25) ? 2048 : 1024;
        } else {
            function25 = function2;
        }
        if ((i & 24576) == 0) {
            i5 |= composerImplV.I(function1) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i5 |= composerImplV.I(function22) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= composerImplV.I(onDynamicSizeCardImpression) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= composerImplV.I(productClickListener) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= composerImplV.n(lazyListState) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= (i & 1073741824) == 0 ? composerImplV.n(pullRefreshState) : composerImplV.I(pullRefreshState) ? 536870912 : 268435456;
        }
        int i15 = i5;
        if ((i2 & 6) == 0) {
            i6 = i2 | (composerImplV.q(f) ? 4 : 2);
        } else {
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= composerImplV.I(processActivityResult) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i6 |= composerImplV.I(onLaunchProductDetails) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= composerImplV.I(eventSink) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= composerImplV.I(launchProductOnMap) ? 16384 : 8192;
        }
        int i16 = i6 | 196608;
        int i17 = i4 & 65536;
        if (i17 != 0) {
            i16 = i6 | 1769472;
        } else if ((i2 & 1572864) == 0) {
            i16 |= composerImplV.p(z) ? 1048576 : 524288;
        }
        int i18 = i4 & 131072;
        if (i18 != 0) {
            i16 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i16 |= composerImplV.I(function13) ? 8388608 : 4194304;
        }
        int i19 = i4 & 262144;
        if (i19 != 0) {
            i16 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i16 |= composerImplV.I(function23) ? 67108864 : 33554432;
        }
        int i20 = i4 & 524288;
        if (i20 != 0) {
            i16 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i16 |= composerImplV.I(function24) ? 536870912 : 268435456;
        }
        int i21 = i4 & 1048576;
        if (i21 != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = i3 | (composerImplV.I(function14) ? 4 : 2);
        } else {
            i7 = i3;
        }
        int i22 = i4 & 2097152;
        if (i22 != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerImplV.I(function15) ? 32 : 16;
        }
        int i23 = i7;
        int i24 = i4 & 4194304;
        if (i24 != 0) {
            i8 = i16;
            i10 = i23 | KyberEngine.KyberPolyBytes;
            i9 = i3;
        } else {
            i8 = i16;
            i9 = i3;
            if ((i9 & KyberEngine.KyberPolyBytes) == 0) {
                i10 = i23 | (composerImplV.I(function16) ? 256 : 128);
            } else {
                i10 = i23;
            }
        }
        int i25 = i4 & 8388608;
        if (i25 != 0) {
            i11 = i10 | 3072;
        } else {
            int i26 = i10;
            if ((i9 & 3072) == 0) {
                i11 = i26 | (composerImplV.I(function17) ? 2048 : 1024);
            } else {
                i11 = i26;
            }
        }
        int i27 = i4 & 16777216;
        if (i27 != 0) {
            i12 = i11 | 24576;
        } else {
            int i28 = i11;
            if ((i9 & 24576) == 0) {
                i12 = i28 | (composerImplV.I(function18) ? 16384 : 8192);
            } else {
                i12 = i28;
            }
        }
        int i29 = i4 & 33554432;
        if (i29 != 0) {
            i12 |= 196608;
        } else if ((i9 & 196608) == 0) {
            i12 |= composerImplV.I(function19) ? 131072 : 65536;
        }
        int i30 = i4 & 67108864;
        if (i30 != 0) {
            i12 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            i12 |= composerImplV.I(function110) ? 1048576 : 524288;
        }
        int i31 = i4 & 134217728;
        if (i31 != 0) {
            i12 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            i12 |= composerImplV.I(promotionClickListener) ? 8388608 : 4194304;
        }
        int i32 = i4 & 268435456;
        if (i32 != 0) {
            i12 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i12 |= composerImplV.I(function3) ? 67108864 : 33554432;
        }
        if ((i15 & 306783379) == 306783378 && (i8 & 306783379) == 306783378 && (i12 & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            flow = actionFlow;
            modifier2 = modifier;
            z4 = z;
            function127 = function13;
            function29 = function23;
            function28 = function24;
            function120 = function14;
            function123 = function15;
            function126 = function16;
            function124 = function17;
            function121 = function18;
            function122 = function19;
            function125 = function110;
            promotionClickListener3 = promotionClickListener;
            function32 = function3;
            function02 = function0;
            composerImpl = composerImplV;
        } else {
            boolean z5 = i17 != 0 ? false : z;
            Function1 function128 = i18 != 0 ? null : function13;
            Function2 function210 = i19 != 0 ? null : function23;
            Function2 function211 = i20 != 0 ? null : function24;
            Function1 function129 = i21 != 0 ? null : function14;
            Function1 function130 = i22 != 0 ? null : function15;
            Function1 function131 = i24 != 0 ? null : function16;
            Function1 function132 = i25 != 0 ? null : function17;
            Function1 function133 = i27 != 0 ? null : function18;
            Function1 function134 = i29 != 0 ? null : function19;
            Function1 function135 = i30 != 0 ? null : function110;
            PromotionClickListener promotionClickListener4 = i31 != 0 ? null : promotionClickListener;
            Function3 function33 = i32 != 0 ? null : function3;
            Context context2 = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Object objX = composerImplV.x(LocalActivityKt.f65a);
            if (objX == null) {
                throw new IllegalArgumentException("Could not find activity!");
            }
            Activity activity2 = (Activity) objX;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            boolean z6 = z5;
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                objG = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objG);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$12) {
                objD = new SnackbarHostState();
                composerImplV.A(objD);
            }
            SnackbarHostState snackbarHostState2 = (SnackbarHostState) objD;
            composerImplV.V(false);
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            composerImplV.o(5004770);
            boolean z7 = (i8 & 112) == 32;
            Object objG2 = composerImplV.G();
            if (z7 || objG2 == composer$Companion$Empty$12) {
                objG2 = new c(11, processActivityResult);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            ManagedActivityResultLauncher managedActivityResultLauncherA = ActivityResultRegistryKt.a(startActivityForResult, (Function1) objG2, composerImplV, 0);
            ActivityResultContracts.StartActivityForResult startActivityForResult2 = new ActivityResultContracts.StartActivityForResult();
            composerImplV.o(5004770);
            int i33 = i15 & 896;
            boolean z8 = i33 == 256;
            Object objG3 = composerImplV.G();
            if (z8 || objG3 == composer$Companion$Empty$12) {
                objG3 = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j(4, function0);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            ManagedActivityResultLauncher managedActivityResultLauncherA2 = ActivityResultRegistryKt.a(startActivityForResult2, (Function1) objG3, composerImplV, 0);
            ActivityResultContracts.StartActivityForResult startActivityForResult3 = new ActivityResultContracts.StartActivityForResult();
            composerImplV.o(5004770);
            boolean z9 = i33 == 256;
            Object objG4 = composerImplV.G();
            if (z9 || objG4 == composer$Companion$Empty$12) {
                objG4 = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j(5, function0);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            ManagedActivityResultLauncher managedActivityResultLauncherA3 = ActivityResultRegistryKt.a(startActivityForResult3, (Function1) objG4, composerImplV, 0);
            ContentPageContract.ViewState viewState2 = (ContentPageContract.ViewState) viewState.getD();
            Intrinsics.h(viewState2, "<this>");
            boolean z10 = viewState2.d && viewState2.f6982a == null;
            Modifier.Companion companion2 = Modifier.Companion.d;
            if (z10) {
                composerImplV.o(527460854);
                Modifier modifierA = TestTagKt.a(SizeKt.c, "loading");
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                int p = composerImplV.getP();
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
                ComposeUiNode.e3.getClass();
                Function0 function03 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function03);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function212 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(p))) {
                    androidx.camera.core.impl.b.B(p, composerImplV, p, function212);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 31, 0L, 0L, composerImplV, null);
                composerImpl = composerImplV;
                composerImpl.V(true);
                composerImpl.V(false);
                activity = activity2;
                managedActivityResultLauncher = managedActivityResultLauncherA3;
                managedActivityResultLauncher2 = managedActivityResultLauncherA2;
                function02 = function0;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                companion = companion2;
                function111 = function129;
                managedActivityResultLauncher3 = managedActivityResultLauncherA;
                function112 = function132;
                function113 = function130;
                z2 = z6;
                snackbarHostState = snackbarHostState2;
                i13 = i8;
                function114 = function128;
                function115 = function133;
                i14 = 4;
                z3 = true;
                context = context2;
                function116 = function131;
                promotionClickListener2 = promotionClickListener4;
                function117 = function134;
            } else {
                composerImpl = composerImplV;
                ContentPageContract.ViewState viewState3 = (ContentPageContract.ViewState) viewState.getD();
                Intrinsics.h(viewState3, "<this>");
                if (viewState3.f6982a != null && viewState3.e == null) {
                    composerImpl.o(1956689484);
                    FillElement fillElement = SizeKt.c;
                    Modifier modifierX0 = fillElement.x0(pullRefreshState != null ? PullRefreshKt.a(companion2, pullRefreshState, true) : companion2);
                    MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.f1719a, false);
                    int p2 = composerImpl.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImpl.Q();
                    Modifier modifierD2 = ComposedModifierKt.d(composerImpl, modifierX0);
                    ComposeUiNode.e3.getClass();
                    Function0 function04 = ComposeUiNode.Companion.b;
                    composerImpl.i();
                    if (composerImpl.O) {
                        composerImpl.K(function04);
                    } else {
                        composerImpl.e();
                    }
                    Updater.b(composerImpl, measurePolicyD2, ComposeUiNode.Companion.g);
                    Updater.b(composerImpl, persistentCompositionLocalMapQ2, ComposeUiNode.Companion.f);
                    Function2 function213 = ComposeUiNode.Companion.j;
                    if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(p2))) {
                        androidx.camera.core.impl.b.B(p2, composerImpl, p2, function213);
                    }
                    Updater.b(composerImpl, modifierD2, ComposeUiNode.Companion.d);
                    ContentPageContract.ViewState viewState4 = (ContentPageContract.ViewState) viewState.getD();
                    Intrinsics.h(viewState4, "<this>");
                    ContentPageData contentPageData = viewState4.f6982a;
                    boolean z11 = !(((contentPageData == null || (contentPageHeaderData = contentPageData.f7020a) == null) ? null : contentPageHeaderData.b) != null && ContentPageContractKt.a(contentPageData) == null);
                    composerImpl.o(5004770);
                    boolean z12 = (i8 & 14) == 4;
                    Object objG5 = composerImpl.G();
                    if (z12 || objG5 == composer$Companion$Empty$12) {
                        objG5 = new au.com.woolworths.dynamic.page.ui.content.o(f, 3);
                        composerImpl.A(objG5);
                    }
                    composerImpl.V(false);
                    Modifier modifierB = ConditionalModifierKt.b(fillElement, z11, (Function1) objG5, null, 4);
                    composerImpl.o(-1746271574);
                    int i34 = i15 & 14;
                    boolean z13 = (i34 == 4) | ((i12 & 57344) == 16384);
                    Object objG6 = composerImpl.G();
                    if (z13 || objG6 == composer$Companion$Empty$12) {
                        function118 = function133;
                        objG6 = new androidx.lifecycle.compose.b(viewState, function118, mutableFloatState, 15);
                        composerImpl.A(objG6);
                    } else {
                        function118 = function133;
                    }
                    composerImpl.V(false);
                    Modifier modifierA2 = OnGloballyPositionedModifierKt.a(modifierB, (Function1) objG6);
                    ContentPageData contentPageData2 = ((ContentPageContract.ViewState) viewState.getD()).f6982a;
                    Intrinsics.e(contentPageData2);
                    List list = ((ContentPageContract.ViewState) viewState.getD()).m;
                    boolean z14 = ((ContentPageContract.ViewState) viewState.getD()).f;
                    boolean z15 = ((ContentPageContract.ViewState) viewState.getD()).l;
                    boolean z16 = ((ContentPageContract.ViewState) viewState.getD()).o;
                    VideoAdPlayerState videoAdPlayerState = ((ContentPageContract.ViewState) viewState.getD()).k;
                    composerImpl.o(5004770);
                    boolean z17 = (i8 & 29360128) == 8388608;
                    Object objG7 = composerImpl.G();
                    if (z17 || objG7 == composer$Companion$Empty$12) {
                        managedActivityResultLauncher2 = managedActivityResultLauncherA2;
                        function119 = function128;
                        objG7 = new c(12, function119);
                        composerImpl.A(objG7);
                    } else {
                        managedActivityResultLauncher2 = managedActivityResultLauncherA2;
                        function119 = function128;
                    }
                    Function1 function136 = (Function1) objG7;
                    composerImpl.V(false);
                    int i35 = i15 >> 12;
                    int i36 = i12 << 24;
                    int i37 = ((i8 >> 9) & 7168) | (i35 & 57344) | ((i15 << 9) & 3670016) | (i36 & 234881024) | (i36 & 1879048192);
                    int i38 = i12 << 6;
                    int i39 = (i35 & 8190) | (i38 & 57344) | (i38 & 458752) | ((i8 << 9) & 3670016) | ((i12 << 12) & 234881024) | ((i12 << 9) & 1879048192);
                    int i40 = i12 >> 12;
                    function114 = function119;
                    int i41 = (i40 & 57344) | ((i12 >> 15) & 14) | (i40 & 7168);
                    activity = activity2;
                    managedActivityResultLauncher = managedActivityResultLauncherA3;
                    composer$Companion$Empty$1 = composer$Companion$Empty$12;
                    function115 = function118;
                    managedActivityResultLauncher3 = managedActivityResultLauncherA;
                    function112 = function132;
                    z2 = z6;
                    i13 = i8;
                    function116 = function131;
                    function113 = function130;
                    companion = companion2;
                    promotionClickListener2 = promotionClickListener4;
                    function117 = function134;
                    function111 = function129;
                    ContentPageContentFeedKt.a(contentPageData2, z14, z15, z2, lazyListState, list, function25, function136, function111, function113, function1, function22, onDynamicSizeCardImpression, productClickListener, function116, function112, function12, videoAdPlayerState, function115, function135, function117, modifierA2, z16, promotionClickListener2, function33, composerImpl, i37, i39, i41);
                    eventSink = function12;
                    composerImpl = composerImpl;
                    composerImpl.o(-1691407868);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
                    if (pullRefreshState != null) {
                        PullRefreshIndicatorKt.a(ContentPageContractKt.b((ContentPageContract.ViewState) viewState.getD()), pullRefreshState, boxScopeInstance.g(companion, Alignment.Companion.b), 0L, 0L, composerImpl, ((i15 >> 24) & 112) | 64, 56);
                    }
                    composerImpl.V(false);
                    SnackbarHostKt.b(snackbarHostState2, PaddingKt.j(boxScopeInstance.g(companion, Alignment.Companion.h), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, 7), null, composerImpl, 6, 4);
                    snackbarHostState = snackbarHostState2;
                    composerImpl.o(-1633490746);
                    i14 = 4;
                    boolean z18 = ((i13 & 7168) == 2048) | (i34 == 4);
                    Object objG8 = composerImpl.G();
                    if (z18 || objG8 == composer$Companion$Empty$1) {
                        objG8 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(3, viewState, eventSink);
                        composerImpl.A(objG8);
                    }
                    composerImpl.V(false);
                    EffectsKt.c(Unit.f24250a, (Function1) objG8, composerImpl);
                    z3 = true;
                    composerImpl.V(true);
                    composerImpl.V(false);
                    function02 = function0;
                    context = context2;
                } else {
                    activity = activity2;
                    managedActivityResultLauncher = managedActivityResultLauncherA3;
                    managedActivityResultLauncher2 = managedActivityResultLauncherA2;
                    composer$Companion$Empty$1 = composer$Companion$Empty$12;
                    companion = companion2;
                    function111 = function129;
                    managedActivityResultLauncher3 = managedActivityResultLauncherA;
                    function112 = function132;
                    function113 = function130;
                    z2 = z6;
                    snackbarHostState = snackbarHostState2;
                    i13 = i8;
                    function114 = function128;
                    function115 = function133;
                    i14 = 4;
                    z3 = true;
                    function116 = function131;
                    promotionClickListener2 = promotionClickListener4;
                    function117 = function134;
                    if (((ContentPageContract.ViewState) viewState.getD()).e != null) {
                        composerImpl.o(531560201);
                        function02 = function0;
                        context = context2;
                        CoreThemeKt.c(6, composerImpl, ComposableLambdaKt.c(772166097, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt$ContentPage$3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer2;
                                FullPageMessageSpec fullPageMessageSpecG;
                                CharSequence text;
                                Composer composer3 = (Composer) obj;
                                if ((((Number) obj2).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ContentPageFullPageError contentPageFullPageError = ((ContentPageContract.ViewState) viewState.getD()).e;
                                    Intrinsics.e(contentPageFullPageError);
                                    if (contentPageFullPageError instanceof ContentPageFullPageError.ConnectionError) {
                                        composer3.o(-977715165);
                                        composer2 = composer3;
                                        fullPageMessageSpecG = FullPageMessageSpec.Companion.c(null, null, null, null, function02, composer2, 31);
                                        composer2.l();
                                    } else {
                                        composer2 = composer3;
                                        boolean z19 = contentPageFullPageError instanceof ContentPageFullPageError.ServerError;
                                        Context context3 = context;
                                        if (z19) {
                                            composer2.o(-977708192);
                                            ContentPageFullPageError.ServerError serverError = (ContentPageFullPageError.ServerError) contentPageFullPageError;
                                            Text text2 = serverError.f6986a;
                                            String string = (text2 == null || (text = text2.getText(context3)) == null) ? null : text.toString();
                                            composer2.o(-977706792);
                                            if (string == null) {
                                                string = StringResources_androidKt.c(composer2, R.string.default_server_error_description);
                                            }
                                            String str = string;
                                            composer2.l();
                                            composer2.o(-977697871);
                                            String strC = serverError.b.equals(Boolean.TRUE) ? StringResources_androidKt.c(composer2, R.string.try_again) : null;
                                            composer2.l();
                                            fullPageMessageSpecG = FullPageMessageSpec.Companion.f(null, null, null, str, strC, function02, composer2, 7);
                                            composer2 = composer2;
                                            composer2.l();
                                        } else if (contentPageFullPageError instanceof ContentPageFullPageError.GuestMode) {
                                            composer2.o(-977686559);
                                            ContentPageFullPageError.GuestMode guestMode = (ContentPageFullPageError.GuestMode) contentPageFullPageError;
                                            Painter painterA = PainterResources_androidKt.a(guestMode.f6984a, 0, composer2);
                                            String string2 = guestMode.d.getText(context3).toString();
                                            String string3 = guestMode.b.getText(context3).toString();
                                            String strC2 = StringResources_androidKt.c(composer2, guestMode.c);
                                            composer2.o(5004770);
                                            Function1 function137 = eventSink;
                                            boolean zN = composer2.n(function137);
                                            Object objG9 = composer2.G();
                                            if (zN || objG9 == Composer.Companion.f1624a) {
                                                objG9 = new au.com.woolworths.feature.product.list.v2.ui.f(12, function137);
                                                composer2.A(objG9);
                                            }
                                            composer2.l();
                                            fullPageMessageSpecG = FullPageMessageSpec.Companion.d(painterA, string2, string3, strC2, (Function0) objG9);
                                            composer2.l();
                                        } else {
                                            if (!(contentPageFullPageError instanceof ContentPageFullPageError.NoSavedRecipes)) {
                                                throw au.com.woolworths.android.onesite.a.x(composer2, -977717693);
                                            }
                                            composer2.o(-977666968);
                                            ContentPageFullPageError.NoSavedRecipes noSavedRecipes = (ContentPageFullPageError.NoSavedRecipes) contentPageFullPageError;
                                            fullPageMessageSpecG = FullPageMessageSpec.Companion.g(PainterResources_androidKt.a(noSavedRecipes.f6985a, 0, composer2), noSavedRecipes.c.getText(context3).toString(), noSavedRecipes.b.getText(context3).toString());
                                            composer2.l();
                                        }
                                    }
                                    FullPageMessageUiKt.a(fullPageMessageSpecG, Modifier.Companion.d, null, composer2, 0, 4);
                                }
                                return Unit.f24250a;
                            }
                        }, composerImpl));
                        composerImpl.V(false);
                    } else {
                        function02 = function0;
                        context = context2;
                        composerImpl.o(533599629);
                        composerImpl.V(false);
                    }
                }
            }
            ContentPageContract.Snackbar snackbar = ((ContentPageContract.ViewState) viewState.getD()).n;
            composerImpl.o(-1746271574);
            int i42 = i15 & 14;
            boolean zI = (i42 == i14 ? z3 : false) | composerImpl.I(context);
            Object objG9 = composerImpl.G();
            if (zI || objG9 == composer$Companion$Empty$1) {
                objG9 = new ContentPageScreenKt$ContentPage$4$1(viewState, snackbarHostState, context, null);
                composerImpl.A(objG9);
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, snackbar, (Function2) objG9);
            composerImpl.o(-1224400529);
            flow = actionFlow;
            Activity activity3 = activity;
            modifier2 = companion;
            ManagedActivityResultLauncher managedActivityResultLauncher4 = managedActivityResultLauncher3;
            boolean zI2 = ((i13 & 234881024) == 67108864) | composerImpl.I(flow) | composerImpl.I(activity3) | (i42 == 4) | composerImpl.I(managedActivityResultLauncher4) | ((1879048192 & i13) == 536870912) | ((i13 & 896) == 256);
            ManagedActivityResultLauncher managedActivityResultLauncher5 = managedActivityResultLauncher;
            ManagedActivityResultLauncher managedActivityResultLauncher6 = managedActivityResultLauncher2;
            boolean zI3 = zI2 | composerImpl.I(managedActivityResultLauncher5) | composerImpl.I(managedActivityResultLauncher6) | composerImpl.I(context) | ((i13 & 57344) == 16384);
            Object objG10 = composerImpl.G();
            if (zI3 || objG10 == composer$Companion$Empty$1) {
                Function2 function214 = function210;
                Function2 function215 = function211;
                objG10 = new ContentPageScreenKt$ContentPage$5$1(flow, activity3, function214, viewState, managedActivityResultLauncher4, function215, onLaunchProductDetails, managedActivityResultLauncher5, managedActivityResultLauncher6, context, launchProductOnMap, null);
                function26 = function214;
                function27 = function215;
                composerImpl.A(objG10);
            } else {
                function26 = function210;
                function27 = function211;
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, flow, (Function2) objG10);
            function28 = function27;
            z4 = z2;
            function120 = function111;
            function121 = function115;
            function122 = function117;
            function32 = function33;
            function123 = function113;
            function124 = function112;
            promotionClickListener3 = promotionClickListener2;
            function29 = function26;
            function125 = function135;
            function126 = function116;
            function127 = function114;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final Flow flow2 = flow;
            final Function0 function05 = function02;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.contentpage.ui.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    int iA3 = RecomposeScopeImplKt.a(i3);
                    ContentPageScreenKt.a(viewState, flow2, function05, function2, function1, function22, onDynamicSizeCardImpression, productClickListener, lazyListState, pullRefreshState, f, processActivityResult, onLaunchProductDetails, eventSink, launchProductOnMap, modifier2, z4, function127, function29, function28, function120, function123, function126, function124, function121, function122, function125, promotionClickListener3, function32, (Composer) obj, iA, iA2, iA3, i4);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0608 A[PHI: r0
  0x0608: PHI (r0v55 java.lang.String) = (r0v52 java.lang.String), (r0v64 java.lang.String) binds: [B:231:0x061d, B:222:0x0605] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.runtime.State r49, final kotlinx.coroutines.flow.Flow r50, final kotlin.jvm.functions.Function0 r51, final kotlin.jvm.functions.Function2 r52, final kotlin.jvm.functions.Function1 r53, final kotlin.jvm.functions.Function2 r54, kotlin.jvm.functions.Function0 r55, final kotlin.jvm.functions.Function1 r56, final kotlin.jvm.functions.Function0 r57, final boolean r58, final kotlin.jvm.functions.Function0 r59, final kotlin.jvm.functions.Function0 r60, final kotlin.jvm.functions.Function1 r61, final au.com.woolworths.product.tile.ProductClickListener r62, final kotlin.jvm.functions.Function1 r63, final kotlin.jvm.functions.Function1 r64, final kotlin.jvm.functions.Function1 r65, final kotlin.jvm.functions.Function1 r66, final kotlin.jvm.functions.Function1 r67, final boolean r68, final kotlin.jvm.functions.Function2 r69, final kotlin.jvm.functions.Function2 r70, final kotlin.jvm.functions.Function1 r71, final kotlin.jvm.functions.Function1 r72, final kotlin.jvm.functions.Function1 r73, final kotlin.jvm.functions.Function1 r74, final au.com.woolworths.product.tile.PromotionClickListener r75, androidx.compose.runtime.Composer r76, final int r77) {
        /*
            Method dump skipped, instructions count: 1855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ui.ContentPageScreenKt.b(androidx.compose.runtime.State, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, au.com.woolworths.product.tile.ProductClickListener, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, au.com.woolworths.product.tile.PromotionClickListener, androidx.compose.runtime.Composer, int):void");
    }
}
