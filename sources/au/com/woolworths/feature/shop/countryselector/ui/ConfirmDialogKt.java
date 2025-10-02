package au.com.woolworths.feature.shop.countryselector.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a;
import com.woolworths.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"country-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ConfirmDialogKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7042a;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7042a = iArr;
        }
    }

    public static final void a(Region region, boolean z, Function0 onConfirm, Function0 onDismiss, Composer composer, int i) {
        int i2;
        int iIntValue;
        Intrinsics.h(onConfirm, "onConfirm");
        Intrinsics.h(onDismiss, "onDismiss");
        ComposerImpl composerImplV = composer.v(-1390317032);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(region == null ? -1 : region.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onConfirm) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onDismiss) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if ((region != null ? WhenMappings.f7042a[region.ordinal()] : -1) == 1) {
                Integer numValueOf = Integer.valueOf(R.string.confirm_alert_logout_text_nz);
                if (!z) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : R.string.confirm_alert_guest_logout_text_nz;
            } else {
                Integer numValueOf2 = Integer.valueOf(R.string.confirm_alert_logout_text);
                if (!z) {
                    numValueOf2 = null;
                }
                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : R.string.confirm_alert_guest_logout_text;
            }
            String strC = StringResources_androidKt.c(composerImplV, iIntValue);
            String str = region != null ? region.e : null;
            if (str == null) {
                str = "";
            }
            String strB = StringResources_androidKt.b(R.string.confirm_alert_title_text, new Object[]{str}, composerImplV);
            String strC2 = StringResources_androidKt.c(composerImplV, R.string.confirm_alert_change_button_text);
            Locale locale = Locale.ROOT;
            String upperCase = strC2.toUpperCase(locale);
            Intrinsics.g(upperCase, "toUpperCase(...)");
            String upperCase2 = StringResources_androidKt.c(composerImplV, R.string.cancel).toUpperCase(locale);
            Intrinsics.g(upperCase2, "toUpperCase(...)");
            AlertDialogKt.a(strC, upperCase2, null, strB, upperCase, onConfirm, onDismiss, composerImplV, 4128768 & (i2 << 9), 4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(region, z, onConfirm, onDismiss, i, 9);
        }
    }
}
