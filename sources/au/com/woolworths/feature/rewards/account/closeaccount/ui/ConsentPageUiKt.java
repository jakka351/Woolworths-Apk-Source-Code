package au.com.woolworths.feature.rewards.account.closeaccount.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.product.list.v2.ui.i;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccount;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccountConfirmation;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ConsentPageUiKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DeleteAccount f5695a = new DeleteAccount("Delete Account", "Are you sure you want to delete your account?", "**What will happen if I delete my account?**\n- Deleting your Everyday Rewards account will mean that your card will no longer work.\n- Second bullet point.\n- Third bullet point.\n\nThis is a [link]().", new ContentCta("Confirm and delete account", (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null), "I've read and understood these terms and conditions.", "");

    /* JADX WARN: Removed duplicated region for block: B:109:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final au.com.woolworths.feature.rewards.account.closeaccount.model.ConsentPage r28, androidx.compose.foundation.lazy.LazyListState r29, final java.lang.Boolean r30, final kotlin.jvm.functions.Function1 r31, kotlin.jvm.functions.Function1 r32, boolean r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.closeaccount.ui.ConsentPageUiKt.a(au.com.woolworths.feature.rewards.account.closeaccount.model.ConsentPage, androidx.compose.foundation.lazy.LazyListState, java.lang.Boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(DeleteAccountConfirmation page, LazyListState lazyListState, Function1 onCtaClick, Composer composer, int i, int i2) {
        int i3;
        LazyListState lazyListStateA;
        LazyListState lazyListState2;
        Intrinsics.h(page, "page");
        Intrinsics.h(onCtaClick, "onCtaClick");
        ComposerImpl composerImplV = composer.v(-445574181);
        int i4 = (composerImplV.I(page) ? 4 : 2) | i | (((i2 & 2) == 0 && composerImplV.n(lazyListState)) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onCtaClick) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            lazyListState2 = lazyListState;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if ((i2 & 2) != 0) {
                    i3 = i4 & (-113);
                    lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
                }
                composerImplV.W();
                a(page, lazyListStateA, null, null, onCtaClick, false, composerImplV, (i3 & 14) | 200064 | (i3 & 112) | ((i3 << 6) & 57344));
                lazyListState2 = lazyListStateA;
            } else {
                composerImplV.j();
                if ((i2 & 2) != 0) {
                    i4 &= -113;
                }
            }
            i3 = i4;
            lazyListStateA = lazyListState;
            composerImplV.W();
            a(page, lazyListStateA, null, null, onCtaClick, false, composerImplV, (i3 & 14) | 200064 | (i3 & 112) | ((i3 << 6) & 57344));
            lazyListState2 = lazyListStateA;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.base.rewards.account.ui.a(page, lazyListState2, onCtaClick, i, i2, 3);
        }
    }

    public static final void c(DeleteAccount page, boolean z, Function1 onConsentCheckedChange, Function1 onCtaClick, boolean z2, LazyListState lazyListState, Composer composer, int i, int i2) {
        LazyListState lazyListStateA;
        Intrinsics.h(page, "page");
        Intrinsics.h(onConsentCheckedChange, "onConsentCheckedChange");
        Intrinsics.h(onCtaClick, "onCtaClick");
        ComposerImpl composerImplV = composer.v(452309454);
        int i3 = (composerImplV.I(page) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(onConsentCheckedChange) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(onCtaClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.p(z2) ? 16384 : 8192;
        }
        int i4 = i3 | (((i2 & 32) == 0 && composerImplV.n(lazyListState)) ? 131072 : 65536);
        if ((74899 & i4) == 74898 && composerImplV.c()) {
            composerImplV.j();
            lazyListStateA = lazyListState;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if ((i2 & 32) != 0) {
                    lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
                    i4 &= -458753;
                }
                composerImplV.W();
                int i5 = (i4 & 14) | ((i4 >> 12) & 112);
                int i6 = i4 << 3;
                a(page, lazyListStateA, Boolean.valueOf(z), onConsentCheckedChange, onCtaClick, z2, composerImplV, (i6 & 896) | i5 | (i6 & 7168) | (57344 & i6) | (i6 & 458752));
            } else {
                composerImplV.j();
                if ((i2 & 32) != 0) {
                    i4 &= -458753;
                }
            }
            lazyListStateA = lazyListState;
            composerImplV.W();
            int i52 = (i4 & 14) | ((i4 >> 12) & 112);
            int i62 = i4 << 3;
            a(page, lazyListStateA, Boolean.valueOf(z), onConsentCheckedChange, onCtaClick, z2, composerImplV, (i62 & 896) | i52 | (i62 & 7168) | (57344 & i62) | (i62 & 458752));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(page, z, onConsentCheckedChange, onCtaClick, z2, lazyListStateA, i, i2);
        }
    }

    public static final void d(ContentCta contentCta, boolean z, boolean z2, Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-504364741);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(contentCta) ? 4 : 2) | i;
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
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
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
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, ToneColors.j, composerImplV, null);
            float f = 12;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            SpacerKt.c(columnScopeInstance, f, composerImplV, 54);
            Modifier modifierH = PaddingKt.h(SizeKt.e(companion, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2);
            StatefulButtonState statefulButtonState = z2 ? StatefulButtonState.e : z ? StatefulButtonState.d : StatefulButtonState.f;
            String label = contentCta.getLabel();
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 7168) == 2048) | composerImplV.I(contentCta);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new e(function1, contentCta, 0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            StatefulButtonKt.b(label, "", modifierH, statefulButtonState, 0L, (Function0) objG, composerImplV, 432, 16);
            composerImplV = composerImplV;
            SpacerKt.c(columnScopeInstance, f, composerImplV, 54);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(contentCta, z, z2, function1, i, 0);
        }
    }
}
