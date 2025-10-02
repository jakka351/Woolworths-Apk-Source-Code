package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.icons.filled.CloseKt;
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
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.ButtonTextKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.data.ImageMapData;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.dialog.DeviceNotSupportedDialogKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.dialog.GenericNavigationIssuesDialogKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.dialog.NotInStoreDialogKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.positionlock.PositionLockProgressIndicatorKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.positionlock.PositionLockSuccessIndicatorKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.DirectionAndDistanceIndicatorData;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.MapProductCardKt;
import au.com.woolworths.foundation.shop.instore.navigation.productfinder.ProductFinderTitleKt;
import au.com.woolworths.product.models.ProductCard;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import dev.chrisbanes.snapper.LazyListKt;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import java.util.List;
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
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import ovh.plrapps.mapcompose.api.DefaultCanvasKt;
import ovh.plrapps.mapcompose.ui.state.MapState;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapContract$ViewState;", "viewState", "Landroidx/compose/ui/unit/Dp;", "endStateOffset", "Landroidx/compose/ui/graphics/ImageBitmap;", "imageBitmap", "instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstoreMapScreenKt {

    /* renamed from: a, reason: collision with root package name */
    public static final InstoreMapScreenKt$EmptyCallbacks$1 f7385a = new InstoreMapScreenKt$EmptyCallbacks$1();
    public static final List b = CollectionsKt.R(new Floor("1", "Floor 1", "F1", 0, "mapid", null), new Floor("2", "Floor 2", "F2", 1, "mapid", null));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[InstoreMapContract.ViewState.NavigationState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InstoreMapContract.ViewState.NavigationState navigationState = InstoreMapContract.ViewState.NavigationState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(final OriientError oriientError, final InstoreMapCallbacks instoreMapCallbacks, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1810641716);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(oriientError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(instoreMapCallbacks) : composerImplV.I(instoreMapCallbacks) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = oriientError instanceof OriientError.NoBarometerInMultiFloorBuilding;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            boolean z2 = true;
            if (z || (oriientError instanceof OriientError.MissingSensors)) {
                composerImplV.o(-332862699);
                composerImplV.o(-1633490746);
                int i3 = i2 & 112;
                boolean zI = (i3 == 32 || ((i2 & 64) != 0 && composerImplV.I(instoreMapCallbacks))) | composerImplV.I(oriientError);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    final int i4 = 2;
                    objG = new Function0() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i5 = i4;
                            Unit unit = Unit.f24250a;
                            OriientError oriientError2 = oriientError;
                            InstoreMapCallbacks instoreMapCallbacks2 = instoreMapCallbacks;
                            switch (i5) {
                                case 0:
                                    InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
                                    instoreMapCallbacks2.f(oriientError2);
                                    break;
                                case 1:
                                    InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$12 = InstoreMapScreenKt.f7385a;
                                    instoreMapCallbacks2.f(oriientError2);
                                    break;
                                default:
                                    InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$13 = InstoreMapScreenKt.f7385a;
                                    instoreMapCallbacks2.f(oriientError2);
                                    break;
                            }
                            return unit;
                        }
                    };
                    composerImplV.A(objG);
                }
                Function0 function0 = (Function0) objG;
                composerImplV.V(false);
                composerImplV.o(5004770);
                if (i3 != 32 && ((i2 & 64) == 0 || !composerImplV.I(instoreMapCallbacks))) {
                    z2 = false;
                }
                Object objG2 = composerImplV.G();
                if (z2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new a(instoreMapCallbacks, 1);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                DeviceNotSupportedDialogKt.a(0, composerImplV, null, function0, (Function0) objG2);
                composerImplV.V(false);
            } else if (oriientError instanceof OriientError.NotInStore) {
                composerImplV.o(-332536424);
                composerImplV.o(-1633490746);
                int i5 = i2 & 112;
                boolean zI2 = (i5 == 32 || ((i2 & 64) != 0 && composerImplV.I(instoreMapCallbacks))) | composerImplV.I(oriientError);
                Object objG3 = composerImplV.G();
                if (zI2 || objG3 == composer$Companion$Empty$1) {
                    final int i6 = 0;
                    objG3 = new Function0() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i52 = i6;
                            Unit unit = Unit.f24250a;
                            OriientError oriientError2 = oriientError;
                            InstoreMapCallbacks instoreMapCallbacks2 = instoreMapCallbacks;
                            switch (i52) {
                                case 0:
                                    InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
                                    instoreMapCallbacks2.f(oriientError2);
                                    break;
                                case 1:
                                    InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$12 = InstoreMapScreenKt.f7385a;
                                    instoreMapCallbacks2.f(oriientError2);
                                    break;
                                default:
                                    InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$13 = InstoreMapScreenKt.f7385a;
                                    instoreMapCallbacks2.f(oriientError2);
                                    break;
                            }
                            return unit;
                        }
                    };
                    composerImplV.A(objG3);
                }
                Function0 function02 = (Function0) objG3;
                composerImplV.V(false);
                composerImplV.o(5004770);
                if (i5 != 32 && ((i2 & 64) == 0 || !composerImplV.I(instoreMapCallbacks))) {
                    z2 = false;
                }
                Object objG4 = composerImplV.G();
                if (z2 || objG4 == composer$Companion$Empty$1) {
                    objG4 = new a(instoreMapCallbacks, 2);
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                NotInStoreDialogKt.a(0, composerImplV, null, function02, (Function0) objG4);
                composerImplV.V(false);
            } else {
                composerImplV.o(-332234484);
                composerImplV.o(-1633490746);
                int i7 = i2 & 112;
                boolean zI3 = (i7 == 32 || ((i2 & 64) != 0 && composerImplV.I(instoreMapCallbacks))) | composerImplV.I(oriientError);
                Object objG5 = composerImplV.G();
                if (zI3 || objG5 == composer$Companion$Empty$1) {
                    final int i8 = 1;
                    objG5 = new Function0() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i52 = i8;
                            Unit unit = Unit.f24250a;
                            OriientError oriientError2 = oriientError;
                            InstoreMapCallbacks instoreMapCallbacks2 = instoreMapCallbacks;
                            switch (i52) {
                                case 0:
                                    InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
                                    instoreMapCallbacks2.f(oriientError2);
                                    break;
                                case 1:
                                    InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$12 = InstoreMapScreenKt.f7385a;
                                    instoreMapCallbacks2.f(oriientError2);
                                    break;
                                default:
                                    InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$13 = InstoreMapScreenKt.f7385a;
                                    instoreMapCallbacks2.f(oriientError2);
                                    break;
                            }
                            return unit;
                        }
                    };
                    composerImplV.A(objG5);
                }
                Function0 function03 = (Function0) objG5;
                composerImplV.V(false);
                composerImplV.o(5004770);
                if (i7 != 32 && ((i2 & 64) == 0 || !composerImplV.I(instoreMapCallbacks))) {
                    z2 = false;
                }
                Object objG6 = composerImplV.G();
                if (z2 || objG6 == composer$Companion$Empty$1) {
                    objG6 = new a(instoreMapCallbacks, 3);
                    composerImplV.A(objG6);
                }
                composerImplV.V(false);
                GenericNavigationIssuesDialogKt.a(0, composerImplV, null, function03, (Function0) objG6);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(oriientError, i, 8, instoreMapCallbacks);
        }
    }

    public static final void b(InstoreMapActivity.AnonymousClass1.C01851.C01861 c01861, InstoreMapViewModel viewModel, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(1921411776);
        int i2 = (composerImplV.n(c01861) ? 4 : 2) | i | (composerImplV.I(viewModel) ? 32 : 16) | KyberEngine.KyberPolyBytes;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            ScaffoldState scaffoldStateD = ScaffoldKt.d(null, composerImplV, 3);
            Modifier.Companion companion = Modifier.Companion.d;
            c(c01861, (InstoreMapContract.ViewState) SnapshotStateKt.a(viewModel.s, composerImplV).getD(), scaffoldStateD, companion, composerImplV, (i2 & 14) | 3072, 0);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(c01861, viewModel, modifier2, i, 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks r26, final au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState r27, androidx.compose.material.ScaffoldState r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt.c(au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks, au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState, androidx.compose.material.ScaffoldState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState.Content r22, au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks r23, au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState r24, androidx.compose.ui.Modifier r25, boolean r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt.d(au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Content, au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks, au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks r38, final au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState.MapData r39, au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState.Content r40, boolean r41, androidx.compose.ui.Modifier r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt.e(au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks, au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$MapData, au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Content, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    public static final void f(MapState mapState, ImageMapData imageMapData, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-806186962);
        int i2 = (composerImplV.I(mapState) ? 4 : 2) | i | (composerImplV.I(imageMapData) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(null);
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(imageMapData);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new InstoreMapScreenKt$MapFromImage$1$1(imageMapData, mutableState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, imageMapData, (Function2) objG2);
            Modifier modifierA = ZIndexModifierKt.a(Modifier.Companion.d, -1.0f);
            composerImplV.o(5004770);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 10);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            DefaultCanvasKt.a(modifierA, mapState, (Function1) objG3, composerImplV, ((i2 << 3) & 112) | 448);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(mapState, i, 11, imageMapData);
        }
    }

    public static final void g(List list, ProductCard productCard, DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData, InstoreMapCallbacks instoreMapCallbacks, Modifier modifier, boolean z, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        boolean z2;
        boolean z3;
        Object instoreMapScreenKt$MapProductCardInteractionHolder$1$1;
        ComposerImpl composerImplV = composer.v(-1414964230);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(directionAndDistanceIndicatorData) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerImplV.n(instoreMapCallbacks) : composerImplV.I(instoreMapCallbacks) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.p(z) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            int size = list.size();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            boolean z4 = true;
            if (size == 1) {
                composerImplV.o(1904997074);
                composerImplV.o(5004770);
                if ((i3 & 7168) != 2048 && ((i3 & 4096) == 0 || !composerImplV.I(instoreMapCallbacks))) {
                    z4 = false;
                }
                Object objG = composerImplV.G();
                if (z4 || objG == composer$Companion$Empty$1) {
                    z3 = false;
                    instoreMapScreenKt$MapProductCardInteractionHolder$1$1 = new InstoreMapScreenKt$MapProductCardInteractionHolder$1$1(0, instoreMapCallbacks, InstoreMapCallbacks.class, "onShowDebugInfoClick", "onShowDebugInfoClick()V", 0);
                    composerImplV.A(instoreMapScreenKt$MapProductCardInteractionHolder$1$1);
                } else {
                    instoreMapScreenKt$MapProductCardInteractionHolder$1$1 = objG;
                    z3 = false;
                }
                composerImplV.V(z3);
                int i4 = i3 >> 3;
                l(productCard, directionAndDistanceIndicatorData, z, (Function0) ((KFunction) instoreMapScreenKt$MapProductCardInteractionHolder$1$1), modifier, composerImplV, ProductCard.$stable | (i4 & 14) | (i4 & 112) | ((i3 >> 9) & 896) | (i3 & 57344));
                composerImpl = composerImplV;
                composerImpl.V(z3);
            } else {
                composerImpl = composerImplV;
                composerImpl.o(1905346227);
                composerImpl.o(5004770);
                int i5 = i3 & 7168;
                boolean z5 = i5 == 2048 || ((i3 & 4096) != 0 && composerImpl.I(instoreMapCallbacks));
                Object objG2 = composerImpl.G();
                if (z5 || objG2 == composer$Companion$Empty$1) {
                    z2 = true;
                    objG2 = new InstoreMapScreenKt$MapProductCardInteractionHolder$2$1(1, instoreMapCallbacks, InstoreMapCallbacks.class, "onScrolledToProductCardIndex", "onScrolledToProductCardIndex(I)V", 0);
                    composerImpl.A(objG2);
                } else {
                    z2 = true;
                }
                KFunction kFunction = (KFunction) objG2;
                composerImpl.V(false);
                composerImpl.o(5004770);
                boolean z6 = (i5 == 2048 || ((i3 & 4096) != 0 && composerImpl.I(instoreMapCallbacks))) ? z2 : false;
                Object objG3 = composerImpl.G();
                if (z6 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new InstoreMapScreenKt$MapProductCardInteractionHolder$3$1(0, instoreMapCallbacks, InstoreMapCallbacks.class, "onShowDebugInfoClick", "onShowDebugInfoClick()V", 0);
                    composerImpl.A(objG3);
                }
                composerImpl.V(false);
                Function0 function0 = (Function0) ((KFunction) objG3);
                int i6 = i3 << 3;
                i((Function1) kFunction, list, productCard, directionAndDistanceIndicatorData, z, function0, modifier, composerImpl, (i6 & 7168) | (i6 & 112) | (ProductCard.$stable << 6) | (i6 & 896) | ((i3 >> 3) & 57344) | (3670016 & (i3 << 6)));
                composerImpl.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.d(list, productCard, directionAndDistanceIndicatorData, instoreMapCallbacks, modifier, z, i);
        }
    }

    public static final void h(final InstoreMapCallbacks instoreMapCallbacks, final InstoreMapContract.ViewState viewState, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1041142777);
        if ((((composerImplV.n(instoreMapCallbacks) ? 4 : 2) | i | (composerImplV.n(viewState) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, null, 4, ComposableLambdaKt.c(2124772669, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$MapTopBar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InstoreMapCallbacks instoreMapCallbacks2;
                    String str;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        AndroidWindowInsets androidWindowInsetsB = WindowInsets_androidKt.b(composer2);
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierH = PaddingKt.h(WindowInsetsPaddingKt.d(companion, androidWindowInsetsB), BitmapDescriptorFactory.HUE_RED, 6, 1);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.k, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierH);
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
                        ImageVector imageVectorA = CloseKt.a();
                        String strC = StringResources_androidKt.c(composer2, R.string.content_description_back_button);
                        long jH = WxTheme.a(composer2).h();
                        composer2.o(5004770);
                        InstoreMapCallbacks instoreMapCallbacks3 = instoreMapCallbacks;
                        boolean zI = composer2.I(instoreMapCallbacks3);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zI || objG == composer$Companion$Empty$1) {
                            InstoreMapScreenKt$MapTopBar$1$1$1$1 instoreMapScreenKt$MapTopBar$1$1$1$1 = new InstoreMapScreenKt$MapTopBar$1$1$1$1(0, instoreMapCallbacks3, InstoreMapCallbacks.class, "onCloseClick", "onCloseClick()V", 0);
                            instoreMapCallbacks2 = instoreMapCallbacks3;
                            composer2.A(instoreMapScreenKt$MapTopBar$1$1$1$1);
                            objG = instoreMapScreenKt$MapTopBar$1$1$1$1;
                        } else {
                            instoreMapCallbacks2 = instoreMapCallbacks3;
                        }
                        composer2.l();
                        IconButtonKt.c(imageVectorA, strC, (Function0) ((KFunction) objG), null, false, jH, composer2, 0, 24);
                        Modifier modifierA = RowScopeInstance.f974a.a(companion, 1.0f, true);
                        InstoreMapContract.ViewState.Content contentB = viewState.b();
                        if (contentB == null || (str = contentB.f7382a) == null) {
                            str = "";
                        }
                        ProductFinderTitleKt.b(0, 0, composer2, modifierA, str);
                        Painter painterA = PainterResources_androidKt.a(R.drawable.ic_comment, 0, composer2);
                        String strC2 = StringResources_androidKt.c(composer2, R.string.content_description_feedback_form);
                        long jH2 = WxTheme.a(composer2).h();
                        composer2.o(5004770);
                        boolean zI2 = composer2.I(instoreMapCallbacks2);
                        Object objG2 = composer2.G();
                        if (zI2 || objG2 == composer$Companion$Empty$1) {
                            InstoreMapScreenKt$MapTopBar$1$1$2$1 instoreMapScreenKt$MapTopBar$1$1$2$1 = new InstoreMapScreenKt$MapTopBar$1$1$2$1(0, instoreMapCallbacks2, InstoreMapCallbacks.class, "onShowFeedbackForm", "onShowFeedbackForm()V", 0);
                            composer2.A(instoreMapScreenKt$MapTopBar$1$1$2$1);
                            objG2 = instoreMapScreenKt$MapTopBar$1$1$2$1;
                        }
                        composer2.l();
                        IconButtonKt.b(painterA, strC2, (Function0) ((KFunction) objG2), null, false, jH2, composer2, 0, 24);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1769472, 31);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(instoreMapCallbacks, i, 12, viewState);
        }
    }

    public static final void i(Function1 function1, final List list, final ProductCard productCard, DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData, boolean z, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData2;
        boolean z2;
        Function0 function02;
        Modifier modifier2;
        LazyListState lazyListState;
        ComposerImpl composerImplV = composer.v(827342912);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(list) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            directionAndDistanceIndicatorData2 = directionAndDistanceIndicatorData;
            i2 |= composerImplV.n(directionAndDistanceIndicatorData2) ? 2048 : 1024;
        } else {
            directionAndDistanceIndicatorData2 = directionAndDistanceIndicatorData;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            function02 = function0;
            i2 |= composerImplV.I(function02) ? 131072 : 65536;
        } else {
            function02 = function0;
        }
        if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 1048576 : 524288;
        } else {
            modifier2 = modifier;
        }
        if ((i2 & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
            composerImplV.o(-1746271574);
            boolean zN = composerImplV.n(lazyListStateA) | composerImplV.I(list) | ((i2 & 14) == 4);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = new InstoreMapScreenKt$MultipleProductCardFooter$1$1(lazyListStateA, list, function1, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, lazyListStateA, (Function2) objG);
            composerImplV.o(-1746271574);
            int i3 = i2 & 896;
            boolean zI = composerImplV.I(list) | (i3 == 256 || ((i2 & 512) != 0 && composerImplV.I(productCard))) | composerImplV.n(lazyListStateA);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new InstoreMapScreenKt$MultipleProductCardFooter$2$1(list, productCard, lazyListStateA, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            int i4 = ProductCard.$stable;
            EffectsKt.e(composerImplV, productCard, (Function2) objG2);
            composerImplV.o(1849434622);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.feature.shared.instore.wifi.ui.b(23);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            SnapperFlingBehavior snapperFlingBehaviorA = LazyListKt.a(lazyListStateA, (Function2) objG3, composerImplV);
            composerImplV.o(-1224400529);
            boolean zI2 = ((3670016 & i2) == 1048576) | composerImplV.I(list) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | (i3 == 256 || ((i2 & 512) != 0 && composerImplV.I(productCard))) | ((i2 & 7168) == 2048);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$1) {
                lazyListState = lazyListStateA;
                final Function0 function03 = function02;
                final Modifier modifier3 = modifier2;
                final DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData3 = directionAndDistanceIndicatorData2;
                final boolean z3 = z2;
                Function1 function12 = new Function1() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyRow = (LazyListScope) obj;
                        InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
                        Intrinsics.h(LazyRow, "$this$LazyRow");
                        int i5 = 0;
                        for (Object obj2 : list) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            final ProductCard productCard2 = (ProductCard) obj2;
                            Integer numValueOf = Integer.valueOf(i5);
                            final Modifier modifier4 = modifier3;
                            final boolean z4 = z3;
                            final Function0 function04 = function03;
                            final ProductCard productCard3 = productCard;
                            final DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData4 = directionAndDistanceIndicatorData3;
                            LazyListScope.i(LazyRow, numValueOf, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$MultipleProductCardFooter$3$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    LazyItemScope item = (LazyItemScope) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue = ((Number) obj5).intValue();
                                    Intrinsics.h(item, "$this$item");
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= composer2.n(item) ? 4 : 2;
                                    }
                                    if ((iIntValue & 19) == 18 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        long j = Color.j;
                                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
                                        Modifier modifier5 = modifier4;
                                        float f = 16;
                                        float f2 = 8;
                                        Modifier modifierA = ShadowKt.a(PaddingKt.f(BackgroundKt.b(modifier5, j, rectangleShapeKt$RectangleShape$1), f), 2, RoundedCornerShapeKt.b(f2), false, 0L, 0L, 28);
                                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                        int p = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function05 = ComposeUiNode.Companion.b;
                                        if (composer2.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer2.i();
                                        if (composer2.getO()) {
                                            composer2.K(function05);
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
                                        Modifier modifierF = PaddingKt.f(InstoreMapScreenKt.m(0, composer2, BackgroundKt.b(item.d(modifier5, 0.7f), ToneColors.k, RoundedCornerShapeKt.b(f2)), function04, z4), f);
                                        ProductCard productCard4 = productCard2;
                                        MapProductCardKt.a(productCard4, modifierF, Intrinsics.c(productCard4, productCard3) ? directionAndDistanceIndicatorData4 : null, composer2, ProductCard.$stable, 0);
                                        composer2.f();
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 298357449), 2);
                            i5 = i6;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function12);
                objG4 = function12;
            } else {
                lazyListState = lazyListStateA;
            }
            composerImplV.V(false);
            LazyDslKt.d(null, lazyListState, null, false, null, null, snapperFlingBehaviorA, false, null, (Function1) objG4, composerImplV, 0, 445);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.legacy.compose.productsearch.a(function1, list, productCard, directionAndDistanceIndicatorData, z, function0, modifier, i);
        }
    }

    public static final void j(final InstoreMapContract.ViewState.NavigationState navigationState, Function0 onClick, Modifier modifier, Composer composer, int i) {
        String str;
        Intrinsics.h(navigationState, "navigationState");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(2068626397);
        int i2 = i | (composerImplV.r(navigationState.ordinal()) ? 4 : 2) | (composerImplV.I(onClick) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-19188524, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapScreenKt$NavigationButton$content$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[InstoreMapContract.ViewState.NavigationState.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            InstoreMapContract.ViewState.NavigationState navigationState = InstoreMapContract.ViewState.NavigationState.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope rowScope = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(rowScope, "<this>");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(rowScope) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        int iOrdinal = navigationState.ordinal();
                        if (iOrdinal == 0) {
                            composer2.o(-414556483);
                            IconKt.b(VectorResources_androidKt.b(R.drawable.ic_instore_nav, 6, composer2), null, null, 0L, composer2, 48, 12);
                            SpacerKt.d(rowScope, 4, composer2, (iIntValue & 14) | 48);
                            ButtonTextKt.b("Navigate", null, 0L, false, null, null, composer2, 6, 62);
                            composer2.l();
                        } else {
                            if (iOrdinal != 1) {
                                throw au.com.woolworths.android.onesite.a.x(composer2, -1260301386);
                            }
                            composer2.o(-414188823);
                            IconKt.b(VectorResources_androidKt.b(R.drawable.ic_instore_nav_solid, 6, composer2), null, null, 0L, composer2, 48, 12);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            Modifier modifierB = SizeKt.b(modifier, ButtonDefaults.c, BitmapDescriptorFactory.HUE_RED, 2);
            int iOrdinal = navigationState.ordinal();
            if (iOrdinal == 0) {
                str = "navigate_button_passive";
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "navigate_button_active";
            }
            float f = 14;
            ButtonKt.b(onClick, TestTagKt.a(modifierB, str), false, ButtonDefaults.b(2, 6, 30, composerImplV), null, BorderStrokeKt.a(Color.j, 0), null, new PaddingValuesImpl(f, f, f, f), composableLambdaImplC, composerImplV, ((i2 >> 3) & 14) | 907542528, 172);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(navigationState, onClick, modifier, i, 25);
        }
    }

    public static final void k(InstoreMapContract.ViewState.Content state, Function1 onTrackOriientAppEvent, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(state, "state");
        Intrinsics.h(onTrackOriientAppEvent, "onTrackOriientAppEvent");
        ComposerImpl composerImplV = composer.v(-1901666769);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onTrackOriientAppEvent) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(12), Alignment.Companion.n, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Double d = state.e;
            Float fValueOf = d != null ? Float.valueOf((float) d.doubleValue()) : null;
            composerImplV.o(-930949988);
            if (fValueOf != null) {
                PositionLockProgressIndicatorKt.a(StringResources_androidKt.c(composerImplV, R.string.request_position_lock), Float.valueOf(fValueOf.floatValue()), onTrackOriientAppEvent, null, null, composerImplV, (i2 << 3) & 896);
            }
            composerImplV.V(false);
            composerImplV.o(-930940960);
            if (state.m) {
                PositionLockSuccessIndicatorKt.a(null, composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(i, 17, state, modifier, onTrackOriientAppEvent);
        }
    }

    public static final void l(ProductCard productCard, DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData, boolean z, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        DirectionAndDistanceIndicatorData directionAndDistanceIndicatorData2;
        ComposerImpl composerImplV = composer.v(1679681163);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            directionAndDistanceIndicatorData2 = directionAndDistanceIndicatorData;
            i2 |= composerImplV.n(directionAndDistanceIndicatorData2) ? 32 : 16;
        } else {
            directionAndDistanceIndicatorData2 = directionAndDistanceIndicatorData;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(modifier) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = 16;
            float f2 = 8;
            Modifier modifierA = ShadowKt.a(PaddingKt.f(BackgroundKt.b(modifier, Color.j, RectangleShapeKt.f1779a), f), 2, RoundedCornerShapeKt.b(f2), false, 0L, 0L, 28);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
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
            MapProductCardKt.a(productCard, PaddingKt.f(m((i2 >> 3) & 1008, composerImplV, BackgroundKt.b(SizeKt.e(modifier, 1.0f), ToneColors.k, RoundedCornerShapeKt.b(f2)), function0, z), f), directionAndDistanceIndicatorData2, composerImplV, ((i2 << 3) & 896) | ProductCard.$stable | (i2 & 14), 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.a(productCard, directionAndDistanceIndicatorData, z, function0, modifier, i);
        }
    }

    public static final Modifier m(int i, Composer composer, Modifier modifier, Function0 function0, boolean z) {
        composer.o(-1990165263);
        composer.o(5004770);
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.p(z)) || (i & 48) == 32;
        Object objG = composer.G();
        if (z2 || objG == Composer.Companion.f1624a) {
            Modifier.Companion companion = Modifier.Companion.d;
            objG = z ? modifier.x0(ClickableKt.d(companion, false, null, null, function0, 7)) : modifier.x0(ClickableKt.b(companion, null, null, false, null, null, new au.com.woolworths.feature.shop.bundles.ui.a(2), 28));
            composer.A(objG);
        }
        Modifier modifier2 = (Modifier) objG;
        composer.l();
        composer.l();
        return modifier2;
    }
}
