package au.com.woolworths.feature.shop.inbox.ui.component;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.AccentColors;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.WoolworthsColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.compose.filter.f;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"inbox_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CategoryTagKt {

    /* renamed from: a, reason: collision with root package name */
    public static final PaddingValuesImpl f7298a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[InboxMessage.Category.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InboxMessage.Category.Companion companion = InboxMessage.Category.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InboxMessage.Category.Companion companion2 = InboxMessage.Category.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        float f = 6;
        float f2 = 2;
        f7298a = new PaddingValuesImpl(f, f2, f, f2);
    }

    public static final void a(InboxMessage.Category category, Modifier modifier, Composer composer, int i) {
        int i2;
        long j;
        Intrinsics.h(category, "category");
        ComposerImpl composerImplV = composer.v(-661189299);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(category.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            String str = category.d;
            int iOrdinal = category.ordinal();
            if (iOrdinal == 0) {
                j = WoolworthsColors.b;
            } else if (iOrdinal == 1) {
                j = RewardsColors.b;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j = AccentColors.c;
            }
            b(str, j, composerImplV, 48);
            modifier = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(category, i, 7, modifier);
        }
    }

    public static final void b(final String text, final long j, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.h(text, "text");
        ComposerImpl composerImplV = composer.v(-1993273525);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        int i5 = i2;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i4 == 0) {
            i3 = (composerImplV.n(companion) ? 32 : 16) | i5;
        } else {
            i3 = i5;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.s(j) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            SurfaceKt.a(companion, RoundedCornerShapeKt.b(4), 0L, j, BorderStrokeKt.a(j, 1), BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-1771242097, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.component.CategoryTagKt$Tag$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        Modifier modifierD = ComposedModifierKt.d(composer2, companion2);
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
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        TextKt.b(text, PaddingKt.e(companion2, CategoryTagKt.f7298a), j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).r, composer2, 48, 0, 65528);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 3) & 14) | 1572864 | ((i3 << 3) & 7168), 36);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(text, j, i);
        }
    }
}
