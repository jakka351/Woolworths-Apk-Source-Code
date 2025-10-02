package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.legacy.a0;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.BulletedListItem;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.RewardsSecurePreference;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListModel;
import au.com.woolworths.foundation.rewards.common.ui.iconlist.RewardsIconListUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"redemption-settings_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SecurePreferenceUIKt {
    public static final void a(String str, String str2, boolean z, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-308597761);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.n(str2) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128) | (composerImplV.n(modifier) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
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
            composerImplV.o(563510858);
            if (z) {
                TextKt.b(str, null, 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImplV, i2 & 14, 0, 65022);
                SpacerKt.c(ColumnScopeInstance.f948a, 12, composerImplV, 54);
            }
            composerImplV.V(false);
            TextKt.b(str2, null, WxTheme.a(composerImplV).f(), 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, (i2 >> 3) & 14, 0, 65018);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(i, 0, str, str2, modifier, z);
        }
    }

    public static final void b(final RewardsSecurePreference data, boolean z, final Function1 onCheckChanged, Modifier modifier, Composer composer, int i) {
        final boolean z2;
        ComposerImpl composerImpl;
        Modifier modifier2;
        Intrinsics.h(data, "data");
        Intrinsics.h(onCheckChanged, "onCheckChanged");
        ComposerImpl composerImplV = composer.v(2086235535);
        int i2 = (composerImplV.I(data) ? 4 : 2) | i;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onCheckChanged) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            z2 = z;
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            composerImplV.o(-1746271574);
            boolean zI = ((i3 & 896) == 256) | composerImplV.I(data);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                z2 = z;
                objG = new Function1() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        final boolean z3 = z2;
                        final RewardsSecurePreference rewardsSecurePreference = data;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.SecurePreferenceUIKt$SecurePreferenceUi$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    boolean z4 = z3;
                                    float f = z4 ? 24 : 16;
                                    RewardsSecurePreference rewardsSecurePreference2 = rewardsSecurePreference;
                                    SecurePreferenceUIKt.a(rewardsSecurePreference2.f6465a, rewardsSecurePreference2.b, z4, PaddingKt.h(PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 16, BitmapDescriptorFactory.HUE_RED, 2), composer2, 0);
                                    SpacerKt.a(24, composer2, 6);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1983504156), 3);
                        ArrayList<BulletedListItem> arrayList = rewardsSecurePreference.c;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                        for (BulletedListItem bulletedListItem : arrayList) {
                            arrayList2.add(new RewardsIconListModel.Item.Ordered(bulletedListItem.f6464a, bulletedListItem.b, bulletedListItem.c, null));
                        }
                        RewardsIconListUiKt.b(LazyColumn, new RewardsIconListModel.Content(null, CollectionsKt.G0(arrayList2)), PaddingKt.a(16, BitmapDescriptorFactory.HUE_RED, 2), new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.c(14), new a0(25));
                        final Function1 function1 = onCheckChanged;
                        LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.SecurePreferenceUIKt$SecurePreferenceUi$1$1$4
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                LazyItemScope item = (LazyItemScope) obj2;
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Number) obj4).intValue();
                                Intrinsics.h(item, "$this$item");
                                if ((iIntValue & 17) == 16 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    float f = 16;
                                    SpacerKt.a(f, composer2, 6);
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    BoxKt.a(BackgroundKt.b(SizeKt.g(SizeKt.e(companion, 1.0f), 8), ToneColors.j, RectangleShapeKt.f1779a), composer2, 0);
                                    SpacerKt.a(24, composer2, 6);
                                    LockToggleKt.a(rewardsSecurePreference.d, function1, PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), composer2, PreferenceToggleData.$stable | KyberEngine.KyberPolyBytes);
                                    SpacerKt.a(f, composer2, 6);
                                }
                                return Unit.f24250a;
                            }
                        }, true, 1797240475), 3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            } else {
                z2 = z;
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            composerImpl = composerImplV;
            LazyDslKt.b(companion, null, null, false, null, null, null, false, null, (Function1) objG, composerImpl, 6, 510);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(data, z2, onCheckChanged, modifier2, i, 7);
        }
    }
}
