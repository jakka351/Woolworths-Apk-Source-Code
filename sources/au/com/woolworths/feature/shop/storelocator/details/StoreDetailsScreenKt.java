package au.com.woolworths.feature.shop.storelocator.details;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.TextColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import au.com.woolworths.feature.shop.recipes.details.ui.i;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import au.com.woolworths.feature.shop.storelocator.details.models.StoreExtKt;
import au.com.woolworths.foundation.shop.storelocator.models.LocationDivision;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpOption;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpType;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.TradingHours;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/details/StoreDetailsContract$ViewState;", "mutableViewState", "storelocator_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StoreDetailsScreenKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8144a = 0;

    static {
        new StoreDetailsContract.ViewState(null, new Store("1087", LocationDivision.d, "Bondi Beach Metro", "184 Campbell and Chesterfield Parade South, Bondi Beach, Sydney", -33.7038993d, 150.8756103d, "3.2", "0423 555 191", CollectionsKt.R("Liquor (Adjacent BWS)", "Wifi", "Cut on Demand", "Convenience Store", "Pick up", "Sushi Bar", "Metro", "Seafood", "Instore Bakery", "Coffee Shop"), CollectionsKt.R(new TradingHours("Today", "6am - 12am"), new TradingHours("Tomorrow", "6am - 12am"), new TradingHours("Friday", "6am - 12am"), new TradingHours("Saturday", "6am - 12am"), new TradingHours("Sunday", "9am - 6pm"), new TradingHours("Monday", "6am - 12am"), new TradingHours("Tuesday", "6am - 12am")), CollectionsKt.R(new PickUpType("1", PickUpOption.f, "In-store Pick Up", "Collect In-store from the service desk.", "PICKUP"), new PickUpType("2", PickUpOption.d, "Direct To Boot", "With Direct To Boot, a team member will bring your order to your car at the collection bay.", "PICKUP_DIRECT_TO_BOOT")), null, null, null, 14336), false, 1017);
    }

    public static final void a(int i, int i2, Composer composer, Modifier modifier, String str, String str2, Function0 function0) {
        ComposerImpl composerImplV = composer.v(1614365792);
        int i3 = i2 | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.r(i) ? 256 : 128) | (composerImplV.I(function0) ? 16384 : 8192);
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            boolean z = (57344 & i3) == 16384;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new k(7, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifier, false, null, null, (Function0) objG, 7);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            float f = 16;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(f), Alignment.Companion.k, composerImplV, 54);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
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
            Updater.b(composerImplV, modifierD2, function24);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = rowScopeInstance.a(companion, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 48);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierA);
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
            Updater.b(composerImplV, modifierD3, function24);
            TextKt.b(str, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).m, composerImplV, (i3 & 14) | 48, 0, 65532);
            TextKt.b(str2, null, TextColors.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, (i3 >> 3) & 14, 0, 65530);
            composerImplV.V(true);
            ImageKt.a(PainterResources_androidKt.a(i, (i3 >> 6) & 14, composerImplV), null, SizeKt.u(companion, 40), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
            composerImplV = composerImplV;
            composerImplV.V(true);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 390, 2, 0L, composerImplV, PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, i2, 0, modifier, str, str2, function0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    public static final void b(StoreDetailsContract.ViewState viewState, Composer composer, int i) {
        int i2;
        Object next;
        boolean zC;
        boolean zC2;
        boolean zC3;
        StatefulButtonState statefulButtonState;
        ?? r14;
        Object next2;
        boolean zC4;
        boolean zC5;
        boolean zC6;
        boolean zC7;
        StatefulButtonState statefulButtonState2;
        ComposerImpl composerImplV = composer.v(-1913733370);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Store store = viewState.b;
            Store store2 = viewState.b;
            String str = viewState.d;
            String str2 = viewState.c;
            if (store != null) {
                List list = store.n;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((PickUpType) next).e == PickUpOption.f) {
                            break;
                        }
                    }
                }
                PickUpType pickUpType = (PickUpType) next;
                String str3 = pickUpType != null ? pickUpType.f : null;
                if (str3 == null || StringsKt.D(str3)) {
                    str3 = null;
                }
                composerImplV.o(-851758564);
                Object obj = Composer.Companion.f1624a;
                if (str3 == null) {
                    r14 = 0;
                } else {
                    if (str != null) {
                        zC = Intrinsics.c(store2 != null ? StoreExtKt.b(store2) : null, str);
                    } else {
                        zC = false;
                    }
                    if (zC) {
                        statefulButtonState = StatefulButtonState.e;
                    } else {
                        if (str != null) {
                            zC2 = Intrinsics.c(store2 != null ? StoreExtKt.a(store2) : null, str);
                        } else {
                            zC2 = false;
                        }
                        if (zC2) {
                            statefulButtonState = StatefulButtonState.f;
                        } else {
                            if (str2 != null) {
                                zC3 = Intrinsics.c(store != null ? StoreExtKt.b(store) : null, str2);
                            } else {
                                zC3 = false;
                            }
                            statefulButtonState = zC3 ? StatefulButtonState.g : StatefulButtonState.d;
                        }
                    }
                    composerImplV.o(-1633490746);
                    boolean zI = composerImplV.I(store) | composerImplV.I(viewState);
                    Object objG = composerImplV.G();
                    if (zI || objG == obj) {
                        objG = new c(store, viewState, 0);
                        composerImplV.A(objG);
                    }
                    composerImplV.V(false);
                    r14 = 0;
                    j(str3, statefulButtonState, (Function0) objG, null, composerImplV, 0);
                }
                composerImplV.V(r14);
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it2.next();
                        if (((PickUpType) next2).e == PickUpOption.d) {
                            break;
                        }
                    }
                }
                PickUpType pickUpType2 = (PickUpType) next2;
                String str4 = pickUpType2 != null ? pickUpType2.f : null;
                if ((str4 == null || StringsKt.D(str4)) ? true : r14) {
                    str4 = null;
                }
                composerImplV.o(-851736176);
                if (str4 != null) {
                    if (str != null) {
                        zC5 = Intrinsics.c(store2 != null ? StoreExtKt.a(store2) : null, str);
                    } else {
                        zC5 = r14;
                    }
                    if (zC5) {
                        statefulButtonState2 = StatefulButtonState.e;
                    } else {
                        if (str != null) {
                            zC6 = Intrinsics.c(store2 != null ? StoreExtKt.b(store2) : null, str);
                        } else {
                            zC6 = r14;
                        }
                        if (zC6) {
                            statefulButtonState2 = StatefulButtonState.f;
                        } else {
                            if (str2 != null) {
                                zC7 = Intrinsics.c(store != null ? StoreExtKt.a(store) : null, str2);
                            } else {
                                zC7 = r14;
                            }
                            statefulButtonState2 = zC7 ? StatefulButtonState.g : StatefulButtonState.d;
                        }
                    }
                    composerImplV.o(-1633490746);
                    boolean zI2 = composerImplV.I(store) | composerImplV.I(viewState);
                    Object objG2 = composerImplV.G();
                    if (zI2 || objG2 == obj) {
                        objG2 = new c(store, viewState, 1);
                        composerImplV.A(objG2);
                    }
                    composerImplV.V(r14);
                    j(str4, statefulButtonState2, (Function0) objG2, null, composerImplV, 0);
                }
                composerImplV.V(r14);
                String str5 = viewState.f;
                if (str5 != null) {
                    zC4 = Intrinsics.c(store != null ? store.d : null, str5);
                } else {
                    zC4 = r14;
                }
                if (zC4) {
                    composerImplV.o(-1531435218);
                    f(composerImplV, r14);
                    composerImplV.V(r14);
                } else {
                    composerImplV.o(-1531370955);
                    if (!viewState.g) {
                        g(viewState, store, SizeKt.e(Modifier.Companion.d, 1.0f), composerImplV, (i2 & 14) | KyberEngine.KyberPolyBytes);
                    }
                    composerImplV.V(r14);
                }
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.foundation.a(i, 2, viewState);
        }
    }

    public static final void c(StoreDetailsContract.ViewState viewState, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(2110296961);
        if ((((composerImplV.I(viewState) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierF = PaddingKt.f(SizeKt.c, 64);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composerImplV, 54);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = 16;
            Modifier.Companion companion = Modifier.Companion.d;
            ImageKt.a(PainterResources_androidKt.a(R.drawable.empty_connection_error, 0, composerImplV), null, PaddingKt.f(companion, f), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.location_details_generic_error_heading), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).y, composerImplV, 0, 0, 65534);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.location_details_generic_error_message), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 4, BitmapDescriptorFactory.HUE_RED, f, 5), TextColors.b, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 48, 0, 65016);
            composerImplV = composerImplV;
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(viewState);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.myorders.details.infomodal.a(viewState, 14);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            TertiaryButtonKt.b((Function0) objG, null, false, null, ComposableSingletons$StoreDetailsScreenKt.f8134a, composerImplV, 24576, 14);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(viewState, i, 0);
        }
    }

    public static final void d(List list, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1696406395);
        if ((((composerImplV.I(list) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 48);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.facilities_title), PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).m, composerImplV, 48, 0, 65532);
            composerImplV.o(-1511622889);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TextKt.b((String) it.next(), null, TextColors.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, 0, 0, 65530);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(list, modifier, i, 1);
        }
    }

    public static final void e(StoreDetailsContract.ViewState viewState, Modifier modifier, Composer composer, int i) {
        String strH;
        boolean z;
        ComposerImpl composerImplV = composer.v(1379816563);
        int i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
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
            Store store = viewState.b;
            composerImplV.o(480190921);
            if (store == null) {
                z = false;
            } else {
                float f = 16;
                Modifier.Companion companion = Modifier.Companion.d;
                ImageKt.a(PainterResources_androidKt.a(R.drawable.wapple_store_details, 0, composerImplV), null, PaddingKt.f(companion, f), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 432, 120);
                TextKt.b(store.f, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).g, composerImplV, 0, 0, 65534);
                Modifier modifierH = PaddingKt.h(companion, 8, BitmapDescriptorFactory.HUE_RED, 2);
                String str = store.g;
                String str2 = store.j;
                if (str2 == null || (strH = YU.a.h(" • ", str2, " km")) == null) {
                    strH = "";
                }
                TextKt.b(YU.a.g(str, strH), modifierH, TextColors.b, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, 48, 0, 65016);
                composerImplV = composerImplV;
                SpacerKt.a(composerImplV, SizeKt.g(companion, f));
                b(viewState, composerImplV, i2 & 14);
                i(store, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 20, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composerImplV, 48);
                z = false;
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(viewState, i, 28, modifier);
        }
    }

    public static final void f(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1936797423);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierH = PaddingKt.h(BorderKt.a(SizeKt.e(companion, 1.0f), 1, ToneColors.j, RoundedCornerShapeKt.b(4)), BitmapDescriptorFactory.HUE_RED, 13, 1);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composerImplV, 54);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            IconKt.b(VectorResources_androidKt.b(R.drawable.ic_stateful_button_checked_tick, 6, composerImplV), null, SizeKt.q(companion, 16), WxTheme.a(composerImplV).h(), composerImplV, 432, 0);
            SpacerKt.a(composerImplV, SizeKt.u(companion, 10));
            String upperCase = "Store selected".toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            TextKt.b(upperCase, null, TextColors.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).o, composerImplV, 0, 0, 65530);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.modeselector.ui.b(i, 20);
        }
    }

    public static final void g(StoreDetailsContract.ViewState viewState, Store store, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-2008017406);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(store) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            String strC = StringResources_androidKt.c(composerImplV, R.string.set_as_my_store_text);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(viewState) | composerImplV.I(store);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new c(viewState, store);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            PrimaryButtonKt.a(strC, (Function0) objG, modifier2, false, false, null, null, null, null, composerImplV, i2 & 896, 1016);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(viewState, store, modifier, i, 28);
        }
    }

    public static final void h(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(2111094133);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
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
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.modeselector.ui.b(i, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(au.com.woolworths.foundation.shop.storelocator.pickup.models.Store r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, int r32) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt.i(au.com.woolworths.foundation.shop.storelocator.pickup.models.Store, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    public static final void j(String str, StatefulButtonState statefulButtonState, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(160556545);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.r(statefulButtonState.ordinal()) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128) | 3072;
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            String strB = StringResources_androidKt.b(R.string.pick_up_method_button_text, new Object[]{str}, composerImplV);
            String strB2 = StringResources_androidKt.b(R.string.selected_pick_up_method_button_text, new Object[]{str}, composerImplV);
            int i3 = ((i2 << 6) & 7168) | KyberEngine.KyberPolyBytes | ((i2 << 9) & 458752);
            Modifier.Companion companion = Modifier.Companion.d;
            StatefulButtonKt.b(strB, strB2, companion, statefulButtonState, 0L, function0, composerImplV, i3, 16);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(str, statefulButtonState, function0, modifier2, i, 0);
        }
    }

    public static final void k(final StoreDetailsContract.ViewState viewState, final Function0 onNavigateUp, Composer composer, int i) {
        ComposerImpl composerImpl;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-699683110);
        int i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onNavigateUp) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            final ScaffoldState scaffoldStateD = ScaffoldKt.d(null, composerImplV, 3);
            composerImpl = composerImplV;
            au.com.woolworths.design.wx.component.ScaffoldKt.a(SizeKt.c, scaffoldStateD, ComposableLambdaKt.c(-1795365707, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt$StoreDetailsScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        final Function0 function0 = onNavigateUp;
                        TopNavBarKt.b(StringResources_androidKt.c(composer2, R.string.store_details_screen_title), null, null, null, 0L, 0L, 0L, null, 2, ComposableLambdaKt.c(-2023930364, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt$StoreDetailsScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function0, null, false, 0L, composer3, 0, 56);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 905969664, 0, 1278);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0, 0L, 0L, null, null, ComposableLambdaKt.c(1257771779, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt$StoreDetailsScreen$2

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[StoreDetailsContract.PageState.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            StoreDetailsContract.PageState pageState = StoreDetailsContract.PageState.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            StoreDetailsContract.PageState pageState2 = StoreDetailsContract.PageState.d;
                            iArr[2] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        StoreDetailsContract.ViewState viewState2 = viewState;
                        int iOrdinal = viewState2.f8143a.ordinal();
                        if (iOrdinal == 0) {
                            composer2.o(1832872430);
                            StoreDetailsScreenKt.h(composer2, 0);
                            composer2.l();
                        } else if (iOrdinal == 1) {
                            composer2.o(1832874844);
                            StoreDetailsScreenKt.l(viewState2, composer2, 0);
                            composer2.l();
                        } else {
                            if (iOrdinal != 2) {
                                throw au.com.woolworths.android.onesite.a.x(composer2, 1832870027);
                            }
                            composer2.o(1832877333);
                            StoreDetailsScreenKt.c(viewState2, composer2, 0);
                            composer2.l();
                        }
                        Integer num = viewState2.e;
                        composer2.o(1832879778);
                        String strC = num == null ? null : StringResources_androidKt.c(composer2, num.intValue());
                        composer2.l();
                        composer2.o(-1746271574);
                        boolean zN = composer2.n(strC);
                        ScaffoldState scaffoldState = scaffoldStateD;
                        boolean zN2 = zN | composer2.n(scaffoldState) | composer2.I(viewState2);
                        Object objG = composer2.G();
                        if (zN2 || objG == Composer.Companion.f1624a) {
                            objG = new StoreDetailsScreenKt$StoreDetailsScreen$2$1$1(strC, viewState2, scaffoldState, null);
                            composer2.A(objG);
                        }
                        composer2.l();
                        EffectsKt.e(composer2, strC, (Function2) objG);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 390, 1016);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(viewState, i, 16, onNavigateUp);
        }
    }

    public static final void l(final StoreDetailsContract.ViewState viewState, Composer composer, int i) {
        Object obj;
        int i2;
        ComposerImpl composerImpl;
        List list;
        ComposerImpl composerImpl2;
        ComposerImpl composerImplV = composer.v(-312844106);
        int i3 = (composerImplV.I(viewState) ? 4 : 2) | i;
        if ((i3 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl2 = composerImplV;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = ScrollKt.b(SizeKt.e(companion, 1.0f), ScrollKt.a(composerImplV), true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            float f = 16;
            e(viewState, SizeKt.e(PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, f, f, 2), 1.0f), composerImplV, (i3 & 14) | 48);
            Store store = viewState.b;
            List list2 = store != null ? store.m : null;
            composerImplV.o(333929416);
            if (list2 != null) {
                m(list2, PaddingKt.f(companion, f), composerImplV, 48);
            }
            composerImplV.V(false);
            ComposerImpl composerImpl3 = composerImplV;
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 390, 2, 0L, composerImpl3, PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
            final String str = store != null ? store.k : null;
            composerImpl3.o(333940158);
            Object obj2 = Composer.Companion.f1624a;
            if (str == null) {
                obj = obj2;
                i2 = -1633490746;
            } else {
                Modifier modifierF = PaddingKt.f(companion, f);
                String strC = StringResources_androidKt.c(composerImpl3, R.string.phone_action_title);
                composerImpl3.o(-1633490746);
                boolean zI = composerImpl3.I(viewState) | composerImpl3.n(str);
                Object objG = composerImpl3.G();
                if (zI || objG == obj2) {
                    final int i5 = 0;
                    objG = new Function0() { // from class: au.com.woolworths.feature.shop.storelocator.details.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i6 = i5;
                            Unit unit = Unit.f24250a;
                            String str2 = str;
                            StoreDetailsContract.ViewState viewState2 = viewState;
                            switch (i6) {
                                case 0:
                                    int i7 = StoreDetailsScreenKt.f8144a;
                                    viewState2.h.invoke(new StoreDetailsContract.ViewAction.CallContactNumber(str2));
                                    break;
                                default:
                                    int i8 = StoreDetailsScreenKt.f8144a;
                                    viewState2.h.invoke(new StoreDetailsContract.ViewAction.ShowLocationInMap(str2));
                                    break;
                            }
                            return unit;
                        }
                    };
                    composerImpl3.A(objG);
                }
                composerImpl3.V(false);
                obj = obj2;
                i2 = -1633490746;
                a(R.drawable.ic_call, 3072, composerImpl3, modifierF, strC, str, (Function0) objG);
                composerImpl3 = composerImpl3;
            }
            composerImpl3.V(false);
            final String str2 = store != null ? store.g : null;
            composerImpl3.o(333953894);
            if (str2 == null) {
                composerImpl = composerImpl3;
            } else {
                Modifier modifierF2 = PaddingKt.f(companion, f);
                String strC2 = StringResources_androidKt.c(composerImpl3, R.string.address_action_title);
                composerImpl3.o(i2);
                boolean zI2 = composerImpl3.I(viewState) | composerImpl3.n(str2);
                Object objG2 = composerImpl3.G();
                if (zI2 || objG2 == obj) {
                    final int i6 = 1;
                    objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.storelocator.details.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i62 = i6;
                            Unit unit = Unit.f24250a;
                            String str22 = str2;
                            StoreDetailsContract.ViewState viewState2 = viewState;
                            switch (i62) {
                                case 0:
                                    int i7 = StoreDetailsScreenKt.f8144a;
                                    viewState2.h.invoke(new StoreDetailsContract.ViewAction.CallContactNumber(str22));
                                    break;
                                default:
                                    int i8 = StoreDetailsScreenKt.f8144a;
                                    viewState2.h.invoke(new StoreDetailsContract.ViewAction.ShowLocationInMap(str22));
                                    break;
                            }
                            return unit;
                        }
                    };
                    composerImpl3.A(objG2);
                }
                Function0 function02 = (Function0) objG2;
                composerImpl3.V(false);
                composerImpl = composerImpl3;
                a(R.drawable.ic_directions, 3072, composerImpl, modifierF2, strC2, str2, function02);
            }
            composerImpl.V(false);
            if (store == null || (list = store.l) == null || list.isEmpty()) {
                list = null;
            }
            composerImpl.o(333968355);
            if (list != null) {
                d(list, SizeKt.e(PaddingKt.f(companion, f), 1.0f), composerImpl, 48);
            }
            composerImpl.V(false);
            composerImpl2 = composerImpl;
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 390, 2, 0L, composerImpl2, PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
            composerImpl2.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(viewState, i, 1);
        }
    }

    public static final void m(List list, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(941056552);
        if ((((composerImplV.I(list) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String strC = StringResources_androidKt.c(composerImplV, R.string.trading_hours_title);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7);
            TextStyle textStyle = WxTheme.b(composerImplV).m;
            boolean z = false;
            Modifier.Companion companion2 = companion;
            TextKt.b(strC, modifierJ, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerImplV, 48, 0, 65532);
            composerImpl = composerImplV;
            composerImpl.o(1134976541);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TradingHours tradingHours = (TradingHours) it.next();
                Modifier modifierE = SizeKt.e(companion2, 1.0f);
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g, Alignment.Companion.j, composerImpl, 6);
                int i3 = composerImpl.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImpl.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImpl, modifierE);
                ComposeUiNode.e3.getClass();
                Function0 function02 = ComposeUiNode.Companion.b;
                composerImpl.i();
                if (composerImpl.O) {
                    composerImpl.K(function02);
                } else {
                    composerImpl.e();
                }
                Updater.b(composerImpl, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                Updater.b(composerImpl, persistentCompositionLocalMapQ2, ComposeUiNode.Companion.f);
                Function2 function22 = ComposeUiNode.Companion.j;
                if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i3))) {
                    androidx.camera.core.impl.b.B(i3, composerImpl, i3, function22);
                }
                Updater.b(composerImpl, modifierD2, ComposeUiNode.Companion.d);
                ComposerImpl composerImpl2 = composerImpl;
                String str = tradingHours.d;
                TextStyle textStyle2 = WxTheme.b(composerImpl2).l;
                long j = TextColors.b;
                TextKt.b(str, null, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle2, composerImpl2, 0, 0, 65530);
                TextKt.b(tradingHours.e, null, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImpl2).l, composerImpl2, 0, 0, 65530);
                composerImpl = composerImpl2;
                composerImpl.V(true);
                companion2 = companion2;
                z = false;
            }
            composerImpl.V(z);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(list, modifier, i, 2);
        }
    }
}
