package au.com.woolworths.sdui.legacy.broadcastbanner.designcoreadapter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.compose.utils.graphics.ForwardingPainterKt;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.banners.broadcastbanner.a;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerDataKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerType;
import au.com.woolworths.foundation.shop.instore.presence.presentation.b;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BroadcastBannerKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10001a;

        static {
            int[] iArr = new int[BroadcastBannerType.values().length];
            try {
                iArr[BroadcastBannerType.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BroadcastBannerType.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BroadcastBannerType.REWARDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10001a = iArr;
        }
    }

    public static final void a(BroadcastBannerData data, Function1 onBannerActionClicked, Function1 onDismissClicked, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType broadcastBannerType;
        Function0 function0;
        boolean z;
        BroadcastBannerSpec.Action action;
        Modifier modifier3;
        Intrinsics.h(data, "data");
        Intrinsics.h(onBannerActionClicked, "onBannerActionClicked");
        Intrinsics.h(onDismissClicked, "onDismissClicked");
        ComposerImpl composerImplV = composer.v(701727414);
        int i4 = i | (composerImplV.I(data) ? 4 : 2);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 2048 : 1024);
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.d : modifier2;
            Painter painterA = ForwardingPainterKt.a(PainterResources_androidKt.a(R.drawable.wapple_grey, 0, composerImplV), ColorFilter.Companion.a(CoreTheme.b(composerImplV).e.c.c.f4855a), null, 10);
            int i6 = WhenMappings.f10001a[data.getType().ordinal()];
            if (i6 == 1) {
                broadcastBannerType = au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType.d;
            } else if (i6 == 2) {
                broadcastBannerType = au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType.f;
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                broadcastBannerType = au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerType.g;
            }
            String title = data.getTitle();
            String imageUrl = data.getImageUrl();
            composerImplV.o(50202381);
            boolean zA = BroadcastBannerDataKt.a(data);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zA) {
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(data);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    objG = new a(onDismissClicked, data, 3);
                    composerImplV.A(objG);
                }
                function0 = (Function0) objG;
                composerImplV.V(false);
            } else {
                function0 = null;
            }
            composerImplV.V(false);
            String subtitle = data.getSubtitle();
            String actionLabel = data.getActionLabel();
            composerImplV.o(50207724);
            if (actionLabel == null) {
                z = false;
                action = null;
            } else {
                composerImplV.o(-1633490746);
                boolean zI2 = composerImplV.I(data);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new a(onBannerActionClicked, data, 4);
                    composerImplV.A(objG2);
                }
                z = false;
                composerImplV.V(false);
                action = new BroadcastBannerSpec.Action(false, actionLabel, (Function0) objG2);
            }
            composerImplV.V(z);
            au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerKt.a(broadcastBannerType, title, imageUrl, modifier4, painterA, null, function0, subtitle, action, composerImplV, i3 & 7168, 32);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(data, onBannerActionClicked, onDismissClicked, modifier3, i, i2, 4);
        }
    }
}
