package au.com.woolworths.feature.shop.account.ui.details.components;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.f;
import au.com.woolworths.feature.shop.account.model.details.AccountDetailsData;
import au.com.woolworths.feature.shop.account.model.details.AccountFeedItem;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corerow.ImageUtilKt;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountDetailsContentKt {
    public static final void a(AccountDetailsData data, Function1 onButtonClick, Composer composer, int i) {
        Function1 function1;
        Function1 function12;
        Intrinsics.h(data, "data");
        List list = data.f6575a;
        Intrinsics.h(onButtonClick, "onButtonClick");
        ComposerImpl composerImplV = composer.v(1424725790);
        int i2 = (composerImplV.I(data) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onButtonClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function1 = onButtonClick;
        } else {
            Modifier modifierB = ScrollKt.b(SizeKt.c, ScrollKt.a(composerImplV), true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(1561754949);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                AccountFeedItem accountFeedItem = (AccountFeedItem) obj;
                boolean z = i4 == 0;
                boolean z2 = i4 == list.size() - 1;
                if (accountFeedItem instanceof AccountFeedItem.AccountPersonalDetails) {
                    composerImplV.o(1358689323);
                    AccountFeedItem.AccountPersonalDetails accountPersonalDetails = (AccountFeedItem.AccountPersonalDetails) accountFeedItem;
                    b(accountPersonalDetails.f6579a, accountPersonalDetails.b, accountPersonalDetails.c, z, z2, composerImplV, 0);
                    composerImplV.V(false);
                } else if (accountFeedItem instanceof AccountFeedItem.AccountBusinessDetails) {
                    composerImplV.o(1359093067);
                    AccountFeedItem.AccountBusinessDetails accountBusinessDetails = (AccountFeedItem.AccountBusinessDetails) accountFeedItem;
                    b(accountBusinessDetails.f6576a, accountBusinessDetails.b, accountBusinessDetails.c, z, z2, composerImplV, 0);
                    composerImplV.V(false);
                } else if (accountFeedItem instanceof AccountFeedItem.AccountContactDetails) {
                    composerImplV.o(1359495819);
                    AccountFeedItem.AccountContactDetails accountContactDetails = (AccountFeedItem.AccountContactDetails) accountFeedItem;
                    b(accountContactDetails.f6577a, accountContactDetails.b, accountContactDetails.c, z, z2, composerImplV, 0);
                    composerImplV.V(false);
                } else if (accountFeedItem instanceof AccountFeedItem.AccountPreferences) {
                    composerImplV.o(1359895595);
                    AccountFeedItem.AccountPreferences accountPreferences = (AccountFeedItem.AccountPreferences) accountFeedItem;
                    b(accountPreferences.f6580a, accountPreferences.b, accountPreferences.c, z, z2, composerImplV, 0);
                    composerImplV.V(false);
                } else {
                    if (!(accountFeedItem instanceof AccountFeedItem.AccountFooter)) {
                        throw au.com.woolworths.android.onesite.a.w(-787456066, composerImplV, false);
                    }
                    composerImplV.o(1360288427);
                    boolean z3 = z2;
                    ComposerImpl composerImpl = composerImplV;
                    boolean z4 = z;
                    function12 = onButtonClick;
                    c(((AccountFeedItem.AccountFooter) accountFeedItem).f6578a, z4, z3, function12, composerImpl, ((i2 << 6) & 7168) | 8);
                    composerImplV = composerImpl;
                    composerImplV.V(false);
                    onButtonClick = function12;
                    i4 = i5;
                }
                function12 = onButtonClick;
                onButtonClick = function12;
                i4 = i5;
            }
            function1 = onButtonClick;
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(data, i, 18, function1);
        }
    }

    public static final void b(final String str, final String str2, final List list, final boolean z, final boolean z2, Composer composer, final int i) {
        float f;
        Modifier.Companion companion;
        int i2;
        ComposerImpl composerImplV = composer.v(-181454842);
        int i3 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.I(list) ? 256 : 128) | (composerImplV.p(z) ? 2048 : 1024) | (composerImplV.p(z2) ? 16384 : 8192);
        if ((i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f2 = z ? 16 : 24;
            Modifier.Companion companion2 = Modifier.Companion.d;
            SpacerKt.a(composerImplV, SizeKt.g(companion2, f2));
            float f3 = 16;
            TextKt.a(str, CoreTheme.f(composerImplV).e.f5133a.b, PaddingKt.j(companion2, f3, 8, f3, BitmapDescriptorFactory.HUE_RED, 8), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, i3 & 14, 1008);
            composerImplV.o(1715574152);
            if (str2 == null) {
                i2 = 24;
                f = f3;
                companion = companion2;
            } else {
                f = f3;
                companion = companion2;
                i2 = 24;
                TextKt.a(str2, CoreTheme.f(composerImplV).f5120a.b.f5123a, PaddingKt.j(companion2, f3, 4, f3, BitmapDescriptorFactory.HUE_RED, 8), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1008);
            }
            composerImplV.V(false);
            composerImplV.o(1715583101);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CoreRowModel coreRowModel = (CoreRowModel) it.next();
                String str3 = coreRowModel.d;
                String str4 = coreRowModel.f9998a;
                String str5 = coreRowModel.c;
                IconAsset iconAsset = coreRowModel.e;
                composerImplV.o(1715589469);
                CoreRowSpec.Image imageA = iconAsset == null ? null : ImageUtilKt.a(iconAsset, CoreRowSpec.ImageSize.f4756a, null, composerImplV, 6);
                composerImplV.V(false);
                IconAsset iconAsset2 = coreRowModel.b;
                composerImplV.o(1715592701);
                CoreRowSpec.Image imageA2 = iconAsset2 != null ? ImageUtilKt.a(iconAsset2, CoreRowSpec.ImageSize.f4756a, null, composerImplV, 6) : null;
                Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
                if (objD == Composer.Companion.f1624a) {
                    objD = new h(20);
                    composerImplV.A(objD);
                }
                composerImplV.V(false);
                SimpleRowKt.a(str3, (Function0) objD, null, str5, str4, imageA2, imageA, null, null, composerImplV, 48, 388);
            }
            composerImplV.V(false);
            SpacerKt.a(composerImplV, SizeKt.g(companion, z2 ? f : i2));
            if (!z2) {
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(str, str2, list, z, z2, i) { // from class: au.com.woolworths.feature.shop.account.ui.details.components.a
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ List f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    AccountDetailsContentKt.b(this.d, this.e, this.f, this.g, this.h, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(ButtonData buttonData, boolean z, boolean z2, Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1750592384);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(buttonData) : composerImplV.I(buttonData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float f = z ? 16 : 24;
            Modifier.Companion companion = Modifier.Companion.d;
            SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            float f2 = 16;
            Modifier modifierH = PaddingKt.h(SizeKt.e(companion, 1.0f), f2, BitmapDescriptorFactory.HUE_RED, 2);
            String str = buttonData.b;
            boolean z3 = buttonData.d;
            ImageVector imageVector = CoreTheme.e(composerImplV).e.p;
            composerImplV.o(-1633490746);
            boolean z4 = true;
            boolean z5 = (i2 & 7168) == 2048;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composerImplV.I(buttonData))) {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object objG = composerImplV.G();
            if (z6 || objG == Composer.Companion.f1624a) {
                objG = new b(function1, buttonData, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            PrimaryButtonKt.a(str, (Function0) objG, modifierH, z3, null, null, imageVector, null, composerImplV, KyberEngine.KyberPolyBytes, 176);
            SpacerKt.a(composerImplV, SizeKt.g(companion, z2 ? f2 : 24));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(buttonData, z, z2, function1, i, 1);
        }
    }
}
