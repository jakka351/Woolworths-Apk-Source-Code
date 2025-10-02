package au.com.woolworths.feature.shop.homepage.presentation.modeselector;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.Divider;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import au.com.woolworths.base.shopapp.modules.text.TextWithLinkApiData;
import au.com.woolworths.compose.utils.modifier.n;
import au.com.woolworths.design.core.ui.component.stable.button.g;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.feature.shop.homepage.data.HomeFulfilmentAnalytics;
import au.com.woolworths.feature.shop.homepage.data.HomeFulfilmentWindowButtonStyleType;
import au.com.woolworths.feature.shop.homepage.data.HomeFulfilmentWindowTileData;
import au.com.woolworths.feature.shop.homepage.data.HomeModeSelectorContainerData;
import au.com.woolworths.feature.shop.homepage.data.HomeOnlineShoppingModeVariantTileAnalytics;
import au.com.woolworths.feature.shop.homepage.data.HomeOnlineShoppingModeVariantTileData;
import au.com.woolworths.feature.shop.homepage.data.InStoreDetailsCardData;
import au.com.woolworths.shared.ui.compose.CoachmarkKt;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "tileHeightPx", "tileHeight", "homepage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ModeSelectorSubHeaderKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7251a = 44;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void a(TextWithAltApiData textWithAltApiData, Text text, TextWithAltApiData textWithAltApiData2, float f, final String str, Function0 function0, Composer composer, int i) {
        int i2;
        float f2;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        Modifier.Companion companion;
        MutableState mutableState;
        ?? r7;
        ComposerImpl composerImpl;
        Modifier.Companion companion2;
        ComposerImpl composerImpl2;
        boolean z;
        ComposerImpl composerImpl3;
        ComposerImpl composerImpl4;
        ComposerImpl composerImplV = composer.v(-1706424037);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(textWithAltApiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(text) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(textWithAltApiData2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            f2 = f;
            i2 |= composerImplV.q(f2) ? 2048 : 1024;
        } else {
            f2 = f;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function0) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl4 = composerImplV;
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion3 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion3);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            int i4 = i2;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Object objF = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD, function24, 1849434622);
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objF == composer$Companion$Empty$12) {
                objF = SnapshotStateKt.f(0);
                composerImplV.A(objF);
            }
            MutableState mutableState2 = (MutableState) objF;
            composerImplV.V(false);
            Object objG = composerImplV.G();
            if (objG == composer$Companion$Empty$12) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objG;
            Modifier modifierJ = PaddingKt.j(companion3, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            composerImplV.o(5004770);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$12) {
                objG2 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState2, 6);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierA = OnRemeasuredModifierKt.a(modifierJ, (Function1) objG2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, companion3);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            composerImplV.o(1495966038);
            if (text == null) {
                companion = companion3;
                mutableState = mutableState2;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                r7 = 0;
                composerImpl = composerImplV;
            } else {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                companion = companion3;
                mutableState = mutableState2;
                r7 = 0;
                TextKt.b(text.getText((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b)).toString(), PaddingKt.j(SizeKt.z(companion3, null, 3), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, 11), 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImplV).r, composerImplV, 48, 3120, 55292);
                composerImpl = composerImplV;
            }
            composerImpl.V(r7);
            String text2 = textWithAltApiData != null ? textWithAltApiData.getText() : null;
            composerImpl.o(1495984346);
            if (text2 == null || text2.length() == 0) {
                companion2 = companion;
                composerImpl2 = composerImpl;
            } else {
                Modifier.Companion companion4 = companion;
                Composer composer2 = composerImpl;
                companion2 = companion4;
                TextKt.b(text2.toString(), SizeKt.z(companion4, null, 3), 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImpl).s, composer2, 48, 3120, 55292);
                composerImpl2 = composer2;
            }
            composerImpl2.V(r7);
            composerImpl2.V(true);
            String text3 = textWithAltApiData2 != null ? textWithAltApiData2.getText() : null;
            composerImpl2.o(-705557701);
            if (text3 == null || text3.length() == 0) {
                z = true;
                composerImpl3 = composerImpl2;
            } else {
                Composer composer3 = composerImpl2;
                z = true;
                TextKt.b(text3.toString(), TestTagKt.a(SizeKt.z(companion2, null, 3), "CollectionLocationTile subtitle"), 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composerImpl2).r, composer3, 48, 3120, 55292);
                composerImpl3 = composer3;
            }
            composerImpl3.V(r7);
            composerImpl3.V(z);
            composerImpl3.o(1849434622);
            Object objG3 = composerImpl3.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$13 = composer$Companion$Empty$1;
            if (objG3 == composer$Companion$Empty$13) {
                objG3 = new PopupProperties(z, 14);
                composerImpl3.A(objG3);
            }
            PopupProperties popupProperties = (PopupProperties) objG3;
            composerImpl3.V(r7);
            composerImpl3.o(-1059704403);
            if (str != null) {
                long jIntValue = (((long) r7) << 32) | ((((Number) mutableState.getD()).intValue() + ((int) ((Density) composerImpl3.x(CompositionLocalsKt.h)).T1(5))) & 4294967295L);
                composerImpl3.o(-1633490746);
                boolean zI = composerImpl3.I(coroutineScope) | ((i4 & 458752) == 131072 ? z : r7);
                Object objG4 = composerImpl3.G();
                if (zI || objG4 == composer$Companion$Empty$13) {
                    objG4 = new b(coroutineScope, function0, 1);
                    composerImpl3.A(objG4);
                }
                composerImpl3.V(r7);
                AndroidPopup_androidKt.b(Alignment.Companion.b, jIntValue, (Function0) objG4, popupProperties, ComposableLambdaKt.c(1712758736, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderKt$CollectionLocationTile$1$3$2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer4 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer4.c()) {
                            composer4.j();
                        } else {
                            CoachmarkKt.b(BitmapDescriptorFactory.HUE_RED, 0, 6, composer4, null, str);
                        }
                        return Unit.f24250a;
                    }
                }, composerImpl3), composerImpl3, 27654);
            }
            composerImpl3.V(r7);
            composerImpl3.V(z);
            composerImpl4 = composerImpl3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl4.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new n(textWithAltApiData, text, textWithAltApiData2, f, str, function0, i, 1);
        }
    }

    public static final void b(HomeOnlineShoppingModeVariantTileData homeOnlineShoppingModeVariantTileData, Function0 function0, Composer composer, int i) {
        int i2;
        int i3;
        boolean z;
        ComposerImpl composerImpl;
        TextWithAltApiData textWithAltApiData;
        ComposerImpl composerImplV = composer.v(216272013);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(homeOnlineShoppingModeVariantTileData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = SizeKt.g(SizeKt.e(companion, 1.0f), f7251a);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            String text = (homeOnlineShoppingModeVariantTileData == null || (textWithAltApiData = homeOnlineShoppingModeVariantTileData.c) == null) ? null : textWithAltApiData.getText();
            composerImplV.o(-1888946371);
            boolean z2 = false;
            String str = text;
            if (str == null) {
                composerImpl = composerImplV;
                z = true;
            } else {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (objG == composer$Companion$Empty$1) {
                    objG = SnapshotStateKt.f(0);
                    composerImplV.A(objG);
                }
                MutableState mutableState = (MutableState) objG;
                Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
                if (objD == composer$Companion$Empty$1) {
                    objD = new au.com.woolworths.feature.shop.editorder.review.components.c(29);
                    composerImplV.A(objD);
                }
                composerImplV.V(false);
                Modifier modifierB = SemanticsModifierKt.b(companion, true, (Function1) objD);
                composerImplV.o(5004770);
                Object objG2 = composerImplV.G();
                if (objG2 == composer$Companion$Empty$1) {
                    i3 = i2;
                    objG2 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 7);
                    composerImplV.A(objG2);
                } else {
                    i3 = i2;
                }
                composerImplV.V(false);
                Modifier modifierX0 = OnRemeasuredModifierKt.a(modifierB, (Function1) objG2).x0(SizeKt.c);
                composerImplV.o(5004770);
                boolean z3 = (i3 & 112) == 32;
                Object objG3 = composerImplV.G();
                if (z3 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(5, function0);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                Modifier modifierD2 = ClickableKt.d(modifierX0, false, null, null, (Function0) objG3, 7);
                RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.e, vertical, composerImplV, 54);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierD2);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function02);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA2, function2);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
                }
                Updater.b(composerImplV, modifierD3, function24);
                Modifier modifierZ = SizeKt.z(PaddingKt.h(companion, 8, BitmapDescriptorFactory.HUE_RED, 2), null, 3);
                TextStyle textStyle = WxTheme.b(composerImplV).r;
                z = true;
                TextKt.b(str, modifierZ, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 2, false, 1, 0, null, textStyle, composerImplV, 48, 3120, 54780);
                composerImpl = composerImplV;
                composerImpl.V(true);
                z2 = false;
            }
            composerImpl.V(z2);
            composerImpl.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(homeOnlineShoppingModeVariantTileData, i, 4, function0);
        }
    }

    public static final void c(HomeFulfilmentWindowTileData homeFulfilmentWindowTileData, boolean z, Modifier modifier, Composer composer, int i) {
        int i2;
        Function2 function2;
        Function2 function22;
        Function2 function23;
        Function0 function0;
        boolean z2;
        Function2 function24;
        int i3;
        Modifier.Companion companion;
        final HomeFulfilmentWindowTileData homeFulfilmentWindowTileData2;
        String text;
        ComposerImpl composerImplV = composer.v(1637238224);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(homeFulfilmentWindowTileData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            homeFulfilmentWindowTileData2 = homeFulfilmentWindowTileData;
        } else {
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Center$1, Alignment.Companion.k, composerImplV, 54);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Function2 function25 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function25);
            Function2 function26 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function26);
            Function2 function27 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function27);
            }
            Function2 function28 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function28);
            Painter painterA = PainterResources_androidKt.a(R.drawable.ic_clock_placeholder, 0, composerImplV);
            Modifier.Companion companion2 = Modifier.Companion.d;
            if (z) {
                composerImplV.o(423396346);
                function24 = function25;
                function23 = function27;
                function22 = function28;
                function0 = function02;
                z2 = false;
                function2 = function26;
                ImageKt.a(painterA, null, SizeKt.q(PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8.0f, BitmapDescriptorFactory.HUE_RED, 11), 24.0f), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
                composerImplV.V(false);
                i3 = 54;
                companion = companion2;
            } else {
                function2 = function26;
                function22 = function28;
                function23 = function27;
                function0 = function02;
                z2 = false;
                composerImplV.o(423652809);
                Modifier modifierQ = SizeKt.q(PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8.0f, BitmapDescriptorFactory.HUE_RED, 11), 24.0f);
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) composerImplV.x(AndroidCompositionLocals_androidKt.b));
                builder.c = homeFulfilmentWindowTileData.b;
                ImageRequestsKt.a(builder);
                builder.j = CachePolicy.g;
                function24 = function25;
                i3 = 54;
                companion = companion2;
                SingletonAsyncImageKt.b(builder.a(), null, modifierQ, painterA, painterA, null, null, null, null, null, ContentScale.Companion.e, null, composerImplV, 432, 6, 31712);
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
            Modifier modifierZ = SizeKt.z(companion, null, 3);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Center$1, Alignment.Companion.m, composerImplV, i3);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierZ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function24);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function2);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function22);
            Modifier modifierZ2 = SizeKt.z(companion, null, 3);
            composerImplV.o(5004770);
            homeFulfilmentWindowTileData2 = homeFulfilmentWindowTileData;
            boolean zI = composerImplV.I(homeFulfilmentWindowTileData2);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                final int i6 = 0;
                objG = new Function1() { // from class: au.com.woolworths.feature.shop.homepage.presentation.modeselector.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i7 = i6;
                        Unit unit = Unit.f24250a;
                        HomeFulfilmentWindowTileData homeFulfilmentWindowTileData3 = homeFulfilmentWindowTileData2;
                        SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                        switch (i7) {
                            case 0:
                                float f = ModeSelectorSubHeaderKt.f7251a;
                                Intrinsics.h(semantics, "$this$semantics");
                                SemanticsPropertiesKt.k(semantics, homeFulfilmentWindowTileData3.d.getAltText());
                                break;
                            default:
                                float f2 = ModeSelectorSubHeaderKt.f7251a;
                                Intrinsics.h(semantics, "$this$semantics");
                                SemanticsPropertiesKt.k(semantics, homeFulfilmentWindowTileData3.e.getAltText());
                                break;
                        }
                        return unit;
                    }
                };
                composerImplV.A(objG);
            }
            composerImplV.V(z2);
            Modifier modifierB = SemanticsModifierKt.b(modifierZ2, z2, (Function1) objG);
            TextWithAltApiData textWithAltApiData = homeFulfilmentWindowTileData2.d;
            TextWithAltApiData textWithAltApiData2 = homeFulfilmentWindowTileData2.e;
            ComposerImpl composerImpl = composerImplV;
            TextKt.b(textWithAltApiData.getText(), modifierB, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).s, composerImpl, 0, 0, 65532);
            composerImplV = composerImpl;
            if (textWithAltApiData2 == null || (text = textWithAltApiData2.getText()) == null || text.length() <= 0) {
                text = null;
            }
            composerImplV.o(883161414);
            if (text != null) {
                Modifier modifierZ3 = SizeKt.z(companion, null, 3);
                composerImplV.o(5004770);
                boolean zI2 = composerImplV.I(homeFulfilmentWindowTileData2);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    final int i7 = 1;
                    objG2 = new Function1() { // from class: au.com.woolworths.feature.shop.homepage.presentation.modeselector.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i72 = i7;
                            Unit unit = Unit.f24250a;
                            HomeFulfilmentWindowTileData homeFulfilmentWindowTileData3 = homeFulfilmentWindowTileData2;
                            SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                            switch (i72) {
                                case 0:
                                    float f = ModeSelectorSubHeaderKt.f7251a;
                                    Intrinsics.h(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.k(semantics, homeFulfilmentWindowTileData3.d.getAltText());
                                    break;
                                default:
                                    float f2 = ModeSelectorSubHeaderKt.f7251a;
                                    Intrinsics.h(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.k(semantics, homeFulfilmentWindowTileData3.e.getAltText());
                                    break;
                            }
                            return unit;
                        }
                    };
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                TextKt.b(textWithAltApiData2.getText(), SemanticsModifierKt.b(modifierZ3, false, (Function1) objG2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, 0, 0, 65532);
                composerImplV = composerImplV;
            }
            android.support.v4.media.session.a.C(composerImplV, false, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(homeFulfilmentWindowTileData2, z, modifier, i, 7);
        }
    }

    public static final void d(InStoreDetailsCardData inStoreDetails, Function0 function0, Function0 function02, final String str, Function0 function03, Composer composer, int i) {
        int i2;
        int i3;
        Function0 function04;
        Function2 function2;
        Object obj;
        Modifier.Companion companion;
        RowScopeInstance rowScopeInstance;
        Function2 function22;
        Function2 function23;
        BiasAlignment.Vertical vertical;
        Function2 function24;
        boolean z;
        InStoreDetailsCardData inStoreDetailsCardData;
        boolean z2;
        boolean z3;
        Intrinsics.h(inStoreDetails, "inStoreDetails");
        ComposerImpl composerImplV = composer.v(862663950);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(inStoreDetails) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function03) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            inStoreDetailsCardData = inStoreDetails;
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierG = SizeKt.g(SizeKt.e(companion2, 1.0f), f7251a);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical2 = Alignment.Companion.k;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical2, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierG);
            ComposeUiNode.e3.getClass();
            Function0 function05 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function05);
            } else {
                composerImplV.e();
            }
            Function2 function25 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function25);
            Function2 function26 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function26);
            Function2 function27 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function27);
            }
            Function2 function28 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function28);
            TextWithLinkApiData textWithLinkApiData = inStoreDetails.f7198a;
            String label = textWithLinkApiData != null ? textWithLinkApiData.getLabel() : null;
            composerImplV.o(-155709060);
            Object obj2 = Composer.Companion.f1624a;
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f974a;
            if (label == null) {
                i3 = i2;
                function22 = function28;
                companion = companion2;
                function04 = function05;
                function24 = function26;
                function2 = function27;
                function23 = function25;
                obj = obj2;
                vertical = vertical2;
                z = false;
                rowScopeInstance = rowScopeInstance2;
            } else {
                String str2 = label;
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == obj2) {
                    objG = SnapshotStateKt.f(0);
                    composerImplV.A(objG);
                }
                MutableState mutableState = (MutableState) objG;
                i3 = i2;
                composerImplV.V(false);
                Object objG2 = composerImplV.G();
                if (objG2 == obj2) {
                    objG2 = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objG2;
                Modifier modifierA = rowScopeInstance2.a(companion2, 1.0f, true);
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function05);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function25);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function26);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    androidx.camera.core.impl.b.B(i5, composerImplV, i5, function27);
                }
                Object objF = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD2, function28, 1849434622);
                if (objF == obj2) {
                    objF = new d(0);
                    composerImplV.A(objF);
                }
                composerImplV.V(false);
                Modifier modifierB = SemanticsModifierKt.b(companion2, true, (Function1) objF);
                composerImplV.o(5004770);
                Object objG3 = composerImplV.G();
                if (objG3 == obj2) {
                    objG3 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 8);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                Modifier modifierX0 = OnRemeasuredModifierKt.a(modifierB, (Function1) objG3).x0(SizeKt.c);
                composerImplV.o(5004770);
                boolean z4 = (i3 & 112) == 32;
                Object objG4 = composerImplV.G();
                if (z4 || objG4 == obj2) {
                    objG4 = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(1, function0);
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                Modifier modifierD3 = ClickableKt.d(modifierX0, false, null, null, (Function0) objG4, 7);
                RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.e, vertical2, composerImplV, 54);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierD3);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function05);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA2, function25);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function26);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImplV, i6, function27);
                }
                Updater.b(composerImplV, modifierD4, function28);
                function04 = function05;
                function2 = function27;
                obj = obj2;
                companion = companion2;
                rowScopeInstance = rowScopeInstance2;
                function22 = function28;
                function23 = function25;
                vertical = vertical2;
                function24 = function26;
                TextKt.b(str2, SizeKt.z(rowScopeInstance2.a(companion2, 2.0f, false), null, 3), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 2, false, 1, 0, null, WxTheme.b(composerImplV).s, composerImplV, 0, 3120, 54780);
                composerImplV = composerImplV;
                IconKt.a(PainterResources_androidKt.a(R.drawable.ic_chevron_down, 0, composerImplV), null, PaddingKt.f(companion, 8), WxTheme.a(composerImplV).h(), composerImplV, 432, 0);
                Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, true);
                if (objD == obj) {
                    objD = new PopupProperties(true, 14);
                    composerImplV.A(objD);
                }
                PopupProperties popupProperties = (PopupProperties) objD;
                composerImplV.V(false);
                composerImplV.o(885226640);
                if (str == null) {
                    z = false;
                } else {
                    long jIntValue = (0 << 32) | ((((Number) mutableState.getD()).intValue() - ((int) ((Density) composerImplV.x(CompositionLocalsKt.h)).T1(r15))) & 4294967295L);
                    composerImplV.o(-1633490746);
                    boolean zI = composerImplV.I(coroutineScope) | ((i3 & 57344) == 16384);
                    Object objG5 = composerImplV.G();
                    if (zI || objG5 == obj) {
                        objG5 = new b(coroutineScope, function03, 0);
                        composerImplV.A(objG5);
                    }
                    composerImplV.V(false);
                    z = false;
                    AndroidPopup_androidKt.b(Alignment.Companion.b, jIntValue, (Function0) objG5, popupProperties, ComposableLambdaKt.c(149141225, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderKt$InstoreModeSelectorSubHeader$1$1$1$5$2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                CoachmarkKt.b(BitmapDescriptorFactory.HUE_RED, 0, 6, composer2, null, str);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV), composerImplV, 27654);
                    composerImplV = composerImplV;
                }
                composerImplV.V(z);
                composerImplV.V(true);
            }
            composerImplV.V(z);
            DividerKt.b(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composerImplV, SizeKt.g(companion, 28.0f));
            inStoreDetailsCardData = inStoreDetails;
            TextWithLinkApiData textWithLinkApiData2 = inStoreDetailsCardData.b;
            String label2 = textWithLinkApiData2 != null ? textWithLinkApiData2.getLabel() : null;
            composerImplV.o(-155630915);
            if (label2 == null) {
                z2 = false;
                z3 = true;
            } else {
                composerImplV.o(1849434622);
                Object objG6 = composerImplV.G();
                if (objG6 == obj) {
                    objG6 = new au.com.woolworths.feature.shop.editorder.review.components.c(28);
                    composerImplV.A(objG6);
                }
                composerImplV.V(false);
                Modifier modifierC = SizeKt.c(rowScopeInstance.a(SemanticsModifierKt.b(companion, true, (Function1) objG6), 1.0f, true), 1.0f);
                composerImplV.o(5004770);
                boolean z5 = (i3 & 896) == 256;
                Object objG7 = composerImplV.G();
                if (z5 || objG7 == obj) {
                    objG7 = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(2, function02);
                    composerImplV.A(objG7);
                }
                composerImplV.V(false);
                Modifier modifierD5 = ClickableKt.d(modifierC, false, null, null, (Function0) objG7, 7);
                RowMeasurePolicy rowMeasurePolicyA3 = RowKt.a(Arrangement.e, vertical, composerImplV, 54);
                int i7 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
                Modifier modifierD6 = ComposedModifierKt.d(composerImplV, modifierD5);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function04);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA3, function23);
                Updater.b(composerImplV, persistentCompositionLocalMapQ4, function24);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                    androidx.camera.core.impl.b.B(i7, composerImplV, i7, function2);
                }
                Updater.b(composerImplV, modifierD6, function22);
                ComposerImpl composerImpl = composerImplV;
                TextKt.b(label2, SizeKt.z(companion, null, 3), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 2, false, 1, 0, null, WxTheme.b(composerImplV).s, composerImpl, 48, 3120, 54780);
                composerImplV = composerImpl;
                z2 = false;
                IconKt.a(PainterResources_androidKt.a(R.drawable.ic_chevron_down, 0, composerImplV), null, PaddingKt.f(companion, 8), WxTheme.a(composerImplV).h(), composerImplV, 432, 0);
                z3 = true;
                composerImplV.V(true);
            }
            composerImplV.V(z2);
            composerImplV.V(z3);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(inStoreDetailsCardData, function0, function02, str, function03, i, 10);
        }
    }

    public static final void e(final boolean z, HomeModeSelectorContainerData homeModeSelectorContainerData, final Text text, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final CollectionMode collectionMode, final String str, final Function0 function05, final Function0 function06, Composer composer, final int i, final int i2) {
        Function0 function07;
        Function0 function08;
        String str2;
        int i3;
        int i4;
        final HomeModeSelectorContainerData homeModeSelectorContainerData2 = homeModeSelectorContainerData;
        Intrinsics.h(collectionMode, "collectionMode");
        ComposerImpl composerImplV = composer.v(1080598110);
        int i5 = (composerImplV.p(z) ? 4 : 2) | i | (composerImplV.I(homeModeSelectorContainerData2) ? 32 : 16) | (composerImplV.I(text) ? 256 : 128);
        if ((i & 3072) == 0) {
            function07 = function0;
            i5 |= composerImplV.I(function07) ? 2048 : 1024;
        } else {
            function07 = function0;
        }
        if ((i & 24576) == 0) {
            function08 = function02;
            i5 |= composerImplV.I(function08) ? 16384 : 8192;
        } else {
            function08 = function02;
        }
        if ((196608 & i) == 0) {
            i5 |= composerImplV.I(function03) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= composerImplV.I(function04) ? 1048576 : 524288;
        }
        int i6 = i5 | (composerImplV.I(collectionMode) ? 8388608 : 4194304);
        if ((100663296 & i) == 0) {
            str2 = str;
            i6 |= composerImplV.n(str2) ? 67108864 : 33554432;
        } else {
            str2 = str;
        }
        if ((805306368 & i) == 0) {
            i6 |= composerImplV.I(function05) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerImplV.I(function06) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i6 & 306783379) == 306783378 && (i3 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-927286393);
            if ((homeModeSelectorContainerData2 != null ? homeModeSelectorContainerData2.d : null) != null) {
                int i7 = i6 >> 15;
                i4 = i6;
                d(homeModeSelectorContainerData2.d, function03, function04, str2, function05, composerImplV, (i7 & 7168) | ((i6 >> 12) & 1008) | (i7 & 57344));
            } else {
                i4 = i6;
            }
            composerImplV.V(false);
            if ((homeModeSelectorContainerData2 != null ? homeModeSelectorContainerData2.f7193a : null) != null) {
                composerImplV.o(1319316878);
                int i8 = i4 >> 6;
                f(z, homeModeSelectorContainerData2, text, function07, function08, collectionMode, str, function05, composerImplV, (i4 & 65534) | (458752 & i8) | (3670016 & i8) | (i8 & 29360128));
                homeModeSelectorContainerData2 = homeModeSelectorContainerData2;
                composerImplV.V(false);
            } else {
                composerImplV.o(1319749948);
                b(homeModeSelectorContainerData2 != null ? homeModeSelectorContainerData2.e : null, function06, composerImplV, (i3 << 3) & 112);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.homepage.presentation.modeselector.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ModeSelectorSubHeaderKt.e(z, homeModeSelectorContainerData2, text, function0, function02, function03, function04, collectionMode, str, function05, function06, (Composer) obj, RecomposeScopeImplKt.a(i | 1), RecomposeScopeImplKt.a(i2));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void f(boolean z, HomeModeSelectorContainerData homeModeSelectorContainerData, Text text, Function0 function0, Function0 function02, CollectionMode collectionMode, String str, Function0 function03, Composer composer, int i) {
        HomeFulfilmentWindowButtonStyleType homeFulfilmentWindowButtonStyleType;
        Function2 function2;
        Function2 function22;
        boolean z2;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        RowScopeInstance rowScopeInstance;
        Function0 function04;
        Function2 function23;
        float f;
        HomeOnlineShoppingModeVariantTileData homeOnlineShoppingModeVariantTileData;
        HomeOnlineShoppingModeVariantTileData homeOnlineShoppingModeVariantTileData2;
        HomeFulfilmentWindowTileData homeFulfilmentWindowTileData;
        Intrinsics.h(collectionMode, "collectionMode");
        ComposerImpl composerImplV = composer.v(872209903);
        int i2 = (composerImplV.p(z) ? 4 : 2) | i | (composerImplV.I(homeModeSelectorContainerData) ? 32 : 16) | (composerImplV.I(text) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(collectionMode) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(str) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(function03) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierX = SizeKt.x(SizeKt.g(SizeKt.e(companion, 1.0f), f7251a), Alignment.Companion.k, false);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX);
            ComposeUiNode.e3.getClass();
            Function0 function05 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function05);
            } else {
                composerImplV.e();
            }
            Function2 function24 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function24);
            Function2 function25 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function25);
            Function2 function26 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function26);
            }
            Function2 function27 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function27);
            if (homeModeSelectorContainerData == null || (homeFulfilmentWindowTileData = homeModeSelectorContainerData.f7193a) == null || (homeFulfilmentWindowButtonStyleType = homeFulfilmentWindowTileData.f7191a) == null) {
                homeFulfilmentWindowButtonStyleType = HomeFulfilmentWindowButtonStyleType.f;
            }
            HomeFulfilmentWindowTileData homeFulfilmentWindowTileData2 = homeModeSelectorContainerData != null ? homeModeSelectorContainerData.f7193a : null;
            composerImplV.o(1870114881);
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f974a;
            if (homeFulfilmentWindowTileData2 == null) {
                function2 = function27;
                function22 = function25;
                z2 = false;
            } else {
                function2 = function27;
                function22 = function25;
                Modifier modifierA = rowScopeInstance2.a(SizeKt.c, 1.0f, true);
                Shape shape = homeFulfilmentWindowButtonStyleType.d;
                composerImplV.o(1870123815);
                long jB = homeFulfilmentWindowButtonStyleType == HomeFulfilmentWindowButtonStyleType.f ? Color.b(WxTheme.a(composerImplV).h(), 0.12f) : Color.j;
                composerImplV.V(false);
                Modifier modifierB = BackgroundKt.b(modifierA, jB, shape);
                composerImplV.o(5004770);
                boolean z3 = (i2 & 7168) == 2048;
                Object objG = composerImplV.G();
                if (z3 || objG == composer$Companion$Empty$12) {
                    objG = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(3, function0);
                    composerImplV.A(objG);
                }
                z2 = false;
                composerImplV.V(false);
                c(homeFulfilmentWindowTileData2, z, ClickableKt.d(modifierB, false, null, null, (Function0) objG, 7), composerImplV, (i2 << 3) & 112);
            }
            composerImplV.V(z2);
            composerImplV.o(1870136616);
            if ((homeModeSelectorContainerData != null ? homeModeSelectorContainerData.b : null) != null) {
                rowScopeInstance = rowScopeInstance2;
                function04 = function05;
                f = 1.0f;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                function23 = function26;
                DividerKt.b(BitmapDescriptorFactory.HUE_RED, 6, 6, 0L, composerImplV, SizeKt.g(companion, 28.0f));
            } else {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                rowScopeInstance = rowScopeInstance2;
                function04 = function05;
                function23 = function26;
                f = 1.0f;
            }
            composerImplV.V(z2);
            float f2 = collectionMode.equals(CollectionMode.InStore.d) ? BitmapDescriptorFactory.HUE_RED : 16.0f;
            Modifier modifierA2 = rowScopeInstance.a(SizeKt.c, f, true);
            composerImplV.o(5004770);
            boolean z4 = (i2 & 57344) == 16384 ? true : z2;
            Object objG2 = composerImplV.G();
            if (z4 || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.shop.homepage.presentation.lists.b(4, function02);
                composerImplV.A(objG2);
            }
            composerImplV.V(z2);
            Modifier modifierD2 = ClickableKt.d(modifierA2, false, null, null, (Function0) objG2, 7);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composerImplV, 54);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierD2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function04);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function24);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD3, function2);
            TextWithAltApiData textWithAltApiData = (homeModeSelectorContainerData == null || (homeOnlineShoppingModeVariantTileData2 = homeModeSelectorContainerData.e) == null) ? null : homeOnlineShoppingModeVariantTileData2.b;
            TextWithAltApiData textWithAltApiData2 = (homeModeSelectorContainerData == null || (homeOnlineShoppingModeVariantTileData = homeModeSelectorContainerData.e) == null) ? null : homeOnlineShoppingModeVariantTileData.c;
            int i5 = (i2 >> 3) & 112;
            int i6 = i2 >> 6;
            a(textWithAltApiData, text, textWithAltApiData2, f2, str, function03, composerImplV, i5 | (i6 & 57344) | (i6 & 458752));
            composerImplV = composerImplV;
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(z, homeModeSelectorContainerData, text, function0, function02, collectionMode, str, function03, i);
        }
    }

    public static final MockPreviewData g(HomeFulfilmentWindowTileData homeFulfilmentWindowTileData, boolean z) {
        return new MockPreviewData(new HomeModeSelectorContainerData(homeFulfilmentWindowTileData, z ? Divider.d : null, null, null, j(null, "407 Elizabeth Street")), null, "407 Elizabeth Street", new CollectionMode.Delivery(z ? DeliveryModeVariant.DeliveryNow : DeliveryModeVariant.DeliveryStandard), 14);
    }

    public static final MockPreviewData h(HomeFulfilmentWindowTileData homeFulfilmentWindowTileData) {
        return new MockPreviewData(new HomeModeSelectorContainerData(homeFulfilmentWindowTileData, null, null, null, j("Direct to boot", "Surry Hills")), "Direct to boot", "Surry Hills", null, 42);
    }

    public static HomeFulfilmentWindowTileData i(int i, String str, String str2) {
        HomeFulfilmentWindowButtonStyleType homeFulfilmentWindowButtonStyleType = HomeFulfilmentWindowButtonStyleType.e;
        if ((i & 1) != 0) {
            homeFulfilmentWindowButtonStyleType = HomeFulfilmentWindowButtonStyleType.f;
        }
        HomeFulfilmentWindowButtonStyleType homeFulfilmentWindowButtonStyleType2 = homeFulfilmentWindowButtonStyleType;
        if ((i & 8) != 0) {
            str2 = null;
        }
        TextWithAltApiData textWithAltApiData = new TextWithAltApiData(str, "");
        if (str2 == null) {
            str2 = "";
        }
        return new HomeFulfilmentWindowTileData(homeFulfilmentWindowButtonStyleType2, "", "", textWithAltApiData, new TextWithAltApiData(str2, ""), new HomeFulfilmentAnalytics("Select Delivery Window"));
    }

    public static final HomeOnlineShoppingModeVariantTileData j(String str, String str2) {
        String str3 = str == null ? "" : str;
        if (str == null) {
            str = "";
        }
        return new HomeOnlineShoppingModeVariantTileData("com.woolworths.shop://pickupStoreSelector", new TextWithAltApiData(str3, str), new TextWithAltApiData(str2, str2), new HomeOnlineShoppingModeVariantTileAnalytics("Edit Pick up Location"));
    }

    public static final HomeFulfilmentWindowTileData k() {
        return i(29, "Select a time", null);
    }
}
