package au.com.woolworths.feature.shared.force.upgrade.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.feature.product.list.compose.productfinder.g;
import au.com.woolworths.feature.shared.force.upgrade.UpdateDialogType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"force-upgrade_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class UpdateDialogKt {
    public static final void a(final UpdateDialogType updateDialogType, final Function2 onAppVersionUpdateClick, final Function2 onAppVersionUpdateIgnored, final Function2 onOsVersionUpdateClick, Function1 onOsVersionUpdateIgnored, Composer composer, int i) {
        Intrinsics.h(onAppVersionUpdateClick, "onAppVersionUpdateClick");
        Intrinsics.h(onAppVersionUpdateIgnored, "onAppVersionUpdateIgnored");
        Intrinsics.h(onOsVersionUpdateClick, "onOsVersionUpdateClick");
        Intrinsics.h(onOsVersionUpdateIgnored, "onOsVersionUpdateIgnored");
        ComposerImpl composerImplV = composer.v(2073530085);
        int i2 = i | (composerImplV.n(updateDialogType) ? 4 : 2) | (composerImplV.I(onAppVersionUpdateClick) ? 32 : 16) | (composerImplV.I(onAppVersionUpdateIgnored) ? 256 : 128) | (composerImplV.I(onOsVersionUpdateClick) ? 2048 : 1024) | (composerImplV.I(onOsVersionUpdateIgnored) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = updateDialogType instanceof UpdateDialogType.AppForceUpdate;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                composerImplV.o(-1979342864);
                UpdateDialogType.AppForceUpdate appForceUpdate = (UpdateDialogType.AppForceUpdate) updateDialogType;
                String str = appForceUpdate.f6507a;
                String str2 = appForceUpdate.b;
                String str3 = appForceUpdate.c;
                composerImplV.o(-1633490746);
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object objG = composerImplV.G();
                if (z2 || objG == composer$Companion$Empty$1) {
                    final int i3 = 0;
                    objG = new Function0() { // from class: au.com.woolworths.feature.shared.force.upgrade.ui.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    onAppVersionUpdateClick.invoke(Boolean.TRUE, ((UpdateDialogType.AppForceUpdate) updateDialogType).c);
                                    break;
                                case 1:
                                    onAppVersionUpdateClick.invoke(Boolean.FALSE, ((UpdateDialogType.AppFlexibleUpdate) updateDialogType).c);
                                    break;
                                case 2:
                                    UpdateDialogType.AppFlexibleUpdate appFlexibleUpdate = (UpdateDialogType.AppFlexibleUpdate) updateDialogType;
                                    String str4 = appFlexibleUpdate.d;
                                    if (str4 == null) {
                                        str4 = "Not now";
                                    }
                                    onAppVersionUpdateClick.invoke(str4, appFlexibleUpdate.e);
                                    break;
                                case 3:
                                    onAppVersionUpdateClick.invoke(Boolean.TRUE, ((UpdateDialogType.OsForceUpdate) updateDialogType).c);
                                    break;
                                default:
                                    onAppVersionUpdateClick.invoke(Boolean.FALSE, ((UpdateDialogType.OsFlexibleUpdate) updateDialogType).c);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                AlertDialogKt.a(str2, str3, null, str, null, null, (Function0) objG, composerImplV, 0, 52);
                composerImplV.V(false);
            } else if (updateDialogType instanceof UpdateDialogType.AppFlexibleUpdate) {
                composerImplV.o(-1978954124);
                UpdateDialogType.AppFlexibleUpdate appFlexibleUpdate = (UpdateDialogType.AppFlexibleUpdate) updateDialogType;
                String str4 = appFlexibleUpdate.f6506a;
                String str5 = appFlexibleUpdate.b;
                String strC = appFlexibleUpdate.d;
                composerImplV.o(-202380376);
                if (strC == null) {
                    strC = StringResources_androidKt.c(composerImplV, R.string.not_now);
                }
                composerImplV.V(false);
                String str6 = appFlexibleUpdate.c;
                composerImplV.o(-1633490746);
                int i4 = i2 & 14;
                boolean z3 = ((i2 & 112) == 32) | (i4 == 4);
                Object objG2 = composerImplV.G();
                if (z3 || objG2 == composer$Companion$Empty$1) {
                    final int i5 = 1;
                    objG2 = new Function0() { // from class: au.com.woolworths.feature.shared.force.upgrade.ui.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    onAppVersionUpdateClick.invoke(Boolean.TRUE, ((UpdateDialogType.AppForceUpdate) updateDialogType).c);
                                    break;
                                case 1:
                                    onAppVersionUpdateClick.invoke(Boolean.FALSE, ((UpdateDialogType.AppFlexibleUpdate) updateDialogType).c);
                                    break;
                                case 2:
                                    UpdateDialogType.AppFlexibleUpdate appFlexibleUpdate2 = (UpdateDialogType.AppFlexibleUpdate) updateDialogType;
                                    String str42 = appFlexibleUpdate2.d;
                                    if (str42 == null) {
                                        str42 = "Not now";
                                    }
                                    onAppVersionUpdateClick.invoke(str42, appFlexibleUpdate2.e);
                                    break;
                                case 3:
                                    onAppVersionUpdateClick.invoke(Boolean.TRUE, ((UpdateDialogType.OsForceUpdate) updateDialogType).c);
                                    break;
                                default:
                                    onAppVersionUpdateClick.invoke(Boolean.FALSE, ((UpdateDialogType.OsFlexibleUpdate) updateDialogType).c);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                Function0 function0 = (Function0) objG2;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean z4 = ((i2 & 896) == 256) | (i4 == 4);
                Object objG3 = composerImplV.G();
                if (z4 || objG3 == composer$Companion$Empty$1) {
                    final int i6 = 2;
                    objG3 = new Function0() { // from class: au.com.woolworths.feature.shared.force.upgrade.ui.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    onAppVersionUpdateIgnored.invoke(Boolean.TRUE, ((UpdateDialogType.AppForceUpdate) updateDialogType).c);
                                    break;
                                case 1:
                                    onAppVersionUpdateIgnored.invoke(Boolean.FALSE, ((UpdateDialogType.AppFlexibleUpdate) updateDialogType).c);
                                    break;
                                case 2:
                                    UpdateDialogType.AppFlexibleUpdate appFlexibleUpdate2 = (UpdateDialogType.AppFlexibleUpdate) updateDialogType;
                                    String str42 = appFlexibleUpdate2.d;
                                    if (str42 == null) {
                                        str42 = "Not now";
                                    }
                                    onAppVersionUpdateIgnored.invoke(str42, appFlexibleUpdate2.e);
                                    break;
                                case 3:
                                    onAppVersionUpdateIgnored.invoke(Boolean.TRUE, ((UpdateDialogType.OsForceUpdate) updateDialogType).c);
                                    break;
                                default:
                                    onAppVersionUpdateIgnored.invoke(Boolean.FALSE, ((UpdateDialogType.OsFlexibleUpdate) updateDialogType).c);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                AlertDialogKt.a(str5, strC, null, str4, str6, function0, (Function0) objG3, composerImplV, 0, 4);
                composerImplV.V(false);
            } else if (updateDialogType instanceof UpdateDialogType.OsForceUpdate) {
                composerImplV.o(-1978305263);
                UpdateDialogType.OsForceUpdate osForceUpdate = (UpdateDialogType.OsForceUpdate) updateDialogType;
                String str7 = osForceUpdate.f6509a;
                String str8 = osForceUpdate.b;
                String str9 = osForceUpdate.c;
                composerImplV.o(-1633490746);
                boolean z5 = ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
                Object objG4 = composerImplV.G();
                if (z5 || objG4 == composer$Companion$Empty$1) {
                    final int i7 = 3;
                    objG4 = new Function0() { // from class: au.com.woolworths.feature.shared.force.upgrade.ui.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i7) {
                                case 0:
                                    onOsVersionUpdateClick.invoke(Boolean.TRUE, ((UpdateDialogType.AppForceUpdate) updateDialogType).c);
                                    break;
                                case 1:
                                    onOsVersionUpdateClick.invoke(Boolean.FALSE, ((UpdateDialogType.AppFlexibleUpdate) updateDialogType).c);
                                    break;
                                case 2:
                                    UpdateDialogType.AppFlexibleUpdate appFlexibleUpdate2 = (UpdateDialogType.AppFlexibleUpdate) updateDialogType;
                                    String str42 = appFlexibleUpdate2.d;
                                    if (str42 == null) {
                                        str42 = "Not now";
                                    }
                                    onOsVersionUpdateClick.invoke(str42, appFlexibleUpdate2.e);
                                    break;
                                case 3:
                                    onOsVersionUpdateClick.invoke(Boolean.TRUE, ((UpdateDialogType.OsForceUpdate) updateDialogType).c);
                                    break;
                                default:
                                    onOsVersionUpdateClick.invoke(Boolean.FALSE, ((UpdateDialogType.OsFlexibleUpdate) updateDialogType).c);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG4);
                }
                composerImplV.V(false);
                AlertDialogKt.a(str8, str9, null, str7, null, null, (Function0) objG4, composerImplV, 0, 52);
                composerImplV.V(false);
            } else {
                if (!(updateDialogType instanceof UpdateDialogType.OsFlexibleUpdate)) {
                    throw au.com.woolworths.android.onesite.a.w(-202397464, composerImplV, false);
                }
                composerImplV.o(-1977919499);
                UpdateDialogType.OsFlexibleUpdate osFlexibleUpdate = (UpdateDialogType.OsFlexibleUpdate) updateDialogType;
                String str10 = osFlexibleUpdate.f6508a;
                String str11 = osFlexibleUpdate.b;
                String strC2 = osFlexibleUpdate.d;
                composerImplV.o(-202346968);
                if (strC2 == null) {
                    strC2 = StringResources_androidKt.c(composerImplV, R.string.not_now);
                }
                composerImplV.V(false);
                String str12 = osFlexibleUpdate.c;
                composerImplV.o(-1633490746);
                int i8 = i2 & 14;
                boolean z6 = (i8 == 4) | ((i2 & 7168) == 2048);
                Object objG5 = composerImplV.G();
                if (z6 || objG5 == composer$Companion$Empty$1) {
                    final int i9 = 4;
                    objG5 = new Function0() { // from class: au.com.woolworths.feature.shared.force.upgrade.ui.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i9) {
                                case 0:
                                    onOsVersionUpdateClick.invoke(Boolean.TRUE, ((UpdateDialogType.AppForceUpdate) updateDialogType).c);
                                    break;
                                case 1:
                                    onOsVersionUpdateClick.invoke(Boolean.FALSE, ((UpdateDialogType.AppFlexibleUpdate) updateDialogType).c);
                                    break;
                                case 2:
                                    UpdateDialogType.AppFlexibleUpdate appFlexibleUpdate2 = (UpdateDialogType.AppFlexibleUpdate) updateDialogType;
                                    String str42 = appFlexibleUpdate2.d;
                                    if (str42 == null) {
                                        str42 = "Not now";
                                    }
                                    onOsVersionUpdateClick.invoke(str42, appFlexibleUpdate2.e);
                                    break;
                                case 3:
                                    onOsVersionUpdateClick.invoke(Boolean.TRUE, ((UpdateDialogType.OsForceUpdate) updateDialogType).c);
                                    break;
                                default:
                                    onOsVersionUpdateClick.invoke(Boolean.FALSE, ((UpdateDialogType.OsFlexibleUpdate) updateDialogType).c);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG5);
                }
                Function0 function02 = (Function0) objG5;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean z7 = ((i2 & 57344) == 16384) | (i8 == 4);
                Object objG6 = composerImplV.G();
                if (z7 || objG6 == composer$Companion$Empty$1) {
                    objG6 = new au.com.woolworths.feature.rewards.card.overlay.ui.b(18, onOsVersionUpdateIgnored, updateDialogType);
                    composerImplV.A(objG6);
                }
                composerImplV.V(false);
                AlertDialogKt.a(str11, strC2, null, str10, str12, function02, (Function0) objG6, composerImplV, 0, 4);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(updateDialogType, onAppVersionUpdateClick, onAppVersionUpdateIgnored, onOsVersionUpdateClick, onOsVersionUpdateIgnored, i, 5);
        }
    }
}
