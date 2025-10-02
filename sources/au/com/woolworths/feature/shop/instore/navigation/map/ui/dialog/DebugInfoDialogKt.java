package au.com.woolworths.feature.shop.instore.navigation.map.ui.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.homepage.presentation.lists.b;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Building;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.Meters;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InstoreLocationDetailsData;
import au.com.woolworths.product.models.ProductCard;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DebugInfoDialogKt {
    public static final void a(final InstoreMapContract.ViewState.DebugInfo debugInfo, final Function0 onDismissAction, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(debugInfo, "debugInfo");
        Intrinsics.h(onDismissAction, "onDismissAction");
        ComposerImpl composerImplV = composer.v(-833583691);
        if ((((composerImplV.I(debugInfo) ? 4 : 2) | i | (composerImplV.I(onDismissAction) ? 32 : 16) | KyberEngine.KyberPolyBytes) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(132725209, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.dialog.DebugInfoDialogKt$DebugInfoDialogue$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String string;
                    String str;
                    String strJ;
                    String str2;
                    String string2;
                    InStoreLocationData inStoreLocation;
                    InstoreLocationDetailsData details;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.debug_info);
                        InstoreMapContract.ViewState.DebugInfo debugInfo2 = debugInfo;
                        Intrinsics.h(debugInfo2, "<this>");
                        ProductCard productCard = debugInfo2.c;
                        OriientMap oriientMap = debugInfo2.g;
                        String str3 = debugInfo2.f7383a;
                        Store store = debugInfo2.b;
                        String str4 = store != null ? store.f : null;
                        String productId = productCard != null ? productCard.getProductId() : null;
                        String name = productCard != null ? productCard.getName() : null;
                        if (productCard == null || (inStoreLocation = productCard.getInStoreLocation()) == null || (details = inStoreLocation.getDetails()) == null) {
                            string = null;
                        } else {
                            double x = details.getX();
                            double y = details.getY();
                            StringBuilder sbN = a.n(x, " x=", " y=");
                            sbN.append(y);
                            string = sbN.toString();
                        }
                        OriientMetersCoordinate oriientMetersCoordinate = debugInfo2.d;
                        if (oriientMetersCoordinate != null) {
                            str = string;
                            strJ = YU.a.j("x=", Meters.a(oriientMetersCoordinate.f7344a), " y=", Meters.a(oriientMetersCoordinate.b), " ");
                        } else {
                            str = string;
                            strJ = null;
                        }
                        Building building = debugInfo2.e;
                        String str5 = building != null ? building.f7331a : null;
                        Floor floor = debugInfo2.f;
                        String str6 = floor != null ? floor.f7335a : null;
                        String str7 = oriientMap != null ? oriientMap.f7341a : null;
                        Double dValueOf = oriientMap != null ? Double.valueOf(oriientMap.c) : null;
                        Double dValueOf2 = oriientMap != null ? Double.valueOf(oriientMap.d) : null;
                        Double dValueOf3 = oriientMap != null ? Double.valueOf(oriientMap.e) : null;
                        if (oriientMap != null) {
                            str2 = strC;
                            double d = oriientMap.f.f7342a;
                            StringBuilder sbN2 = a.n(d, "x=", " y=");
                            sbN2.append(d);
                            string2 = sbN2.toString();
                        } else {
                            str2 = strC;
                            string2 = null;
                        }
                        StringBuilder sbV = YU.a.v("***********\nStore id: ", str3, " name: ", str4, "\nProduct id:");
                        a.B(sbV, productId, "\nname:", name, "\nsource location:");
                        a.B(sbV, str, "\nmap position: ", strJ, "\n***********\nBuilding: ");
                        a.B(sbV, str5, "\nFloor: ", str6, "\n***********\nMap name: ");
                        sbV.append(str7);
                        sbV.append("\n pixelToMeter: ");
                        sbV.append(dValueOf);
                        sbV.append("\nwidthMeters: ");
                        sbV.append(dValueOf2);
                        sbV.append("\nheightMeters: ");
                        sbV.append(dValueOf3);
                        sbV.append("\noffset:");
                        String strO = YU.a.o(sbV, string2, " ");
                        String strC2 = StringResources_androidKt.c(composer2, R.string.ok);
                        composer2.o(5004770);
                        Function0 function0 = onDismissAction;
                        boolean zN = composer2.n(function0);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new b(12, function0);
                            composer2.A(objG);
                        }
                        composer2.l();
                        AlertDialogKt.a(strO, strC2, Modifier.Companion.d, str2, null, null, (Function0) objG, composer2, 0, 48);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(debugInfo, onDismissAction, modifier2, i, 27);
        }
    }
}
