package au.com.woolworths.foundation.rewards.common.ui.buttons;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.account.preferences.f;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyle;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyleKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FilterSelectorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f8578a;
    public static final float b;
    public static final float c = 32;
    public static final float d;

    static {
        float f = 4;
        f8578a = f;
        float f2 = 16;
        b = f2 - f;
        d = f2;
    }

    public static final void a(String str, final boolean z, Function0 function0, final String str2, Modifier modifier, Composer composer, int i) {
        String str3;
        int i2;
        long jH;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(382584790);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (composerImplV.n(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.p(false) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((i3 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(8);
            composerImplV.o(-1703194642);
            if (z) {
                composerImplV.o(-1703193251);
                jH = WxTheme.a(composerImplV).h();
                composerImplV.V(false);
            } else {
                composerImplV.o(-1703192692);
                boolean z2 = composerImplV.x(HomepageStyleKt.f8583a) == HomepageStyle.e;
                composerImplV.V(false);
                jH = z2 ? ToneColors.i : ToneColors.j;
            }
            composerImplV.V(false);
            final long j = MaterialTheme.c(composerImplV).j.f2068a.letterSpacing;
            final String str4 = str3;
            ButtonKt.a(function0, TestTagKt.a(SizeKt.g(PaddingKt.h(modifier, f8578a, BitmapDescriptorFactory.HUE_RED, 2), c), "ButtonTag"), false, null, null, roundedCornerShapeB, null, ButtonDefaults.a(jH, 0L, 0L, 0L, composerImplV, 0, 14), PaddingKt.a(d, BitmapDescriptorFactory.HUE_RED, 2), ComposableLambdaKt.c(-1342176794, new Function3<RowScope, Composer, Integer, Unit>(str2, str4, j, z) { // from class: au.com.woolworths.foundation.rewards.common.ui.buttons.FilterSelectorKt$FilterButton$1
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope Button = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(Button, "$this$Button");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(-1341708844);
                        composer2.l();
                        composer2.o(-1633490746);
                        String str5 = this.d;
                        boolean zN = composer2.n(str5) | composer2.n(null);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new f(str5, null, 2);
                            composer2.A(objG);
                        }
                        composer2.l();
                        TextKt.b(this.e, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG), 0L, 0L, null, this.f, null, null, 0L, 0, false, 1, 0, null, null, composer2, 0, 3072, 122748);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 6) & 14) | 905994240, 76);
            composerImpl = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.card.unlock.a(str, z, function0, str2, modifier, i, 4);
        }
    }

    public static final void b(final List list, Modifier modifier, final int i, final Function1 function1, final float f, float f2, Float f3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Float f4;
        int i5;
        Float f5;
        final float f6;
        final Float f7;
        Iterator it;
        boolean z;
        Modifier modifierA;
        ComposerImpl composerImplV = composer.v(1164270853);
        int i6 = i2 | (composerImplV.I(list) ? 4 : 2);
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 = i6 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i6 | (composerImplV.n(modifier2) ? 32 : 16);
        }
        int i8 = i4 | (composerImplV.r(i) ? 256 : 128) | (composerImplV.I(function1) ? 2048 : 1024);
        int i9 = 12804096 | i8;
        int i10 = i3 & 256;
        if (i10 != 0) {
            i5 = i8 | 113467392;
            f4 = f3;
        } else {
            f4 = f3;
            i5 = i9 | (composerImplV.n(f4) ? 67108864 : 33554432);
        }
        if ((38347923 & i5) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            f6 = f2;
            f7 = f4;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            if (i7 != 0) {
                modifier2 = companion;
            }
            if (i10 != 0) {
                f4 = null;
            }
            boolean zIsEmpty = list.isEmpty();
            float f8 = b;
            if (zIsEmpty) {
                f5 = f4;
            } else {
                Modifier modifierH = PaddingKt.h(IntrinsicKt.a(ScrollKt.b(SizeKt.e(modifier2, 1.0f), ScrollKt.a(composerImplV), false), IntrinsicSize.d), BitmapDescriptorFactory.HUE_RED, f, 1);
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
                int i11 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
                ComposeUiNode.e3.getClass();
                Function0 function0 = ComposeUiNode.Companion.b;
                composerImplV.i();
                f5 = f4;
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function2 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i11))) {
                    androidx.camera.core.impl.b.B(i11, composerImplV, i11, function2);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                SpacerKt.a(composerImplV, SizeKt.u(companion, f8));
                composerImplV.o(-445678074);
                Iterator it2 = list.iterator();
                int i12 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    String str = (String) next;
                    boolean z2 = i12 == i;
                    composerImplV.o(-1633490746);
                    boolean zR = ((i5 & 7168) == 2048) | composerImplV.r(i12);
                    Object objG = composerImplV.G();
                    if (zR || objG == Composer.Companion.f1624a) {
                        objG = new au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons.b(i12, 4, function1);
                        composerImplV.A(objG);
                    }
                    Function0 function02 = (Function0) objG;
                    composerImplV.V(false);
                    if (f5 != null) {
                        it = it2;
                        z = true;
                        modifierA = RowScopeInstance.f974a.a(companion, f5.floatValue(), true);
                    } else {
                        it = it2;
                        z = true;
                        modifierA = companion;
                    }
                    a(str, z2, function02, null, modifierA, composerImplV, 24576);
                    companion = companion;
                    i12 = i13;
                    it2 = it;
                }
                composerImplV.V(false);
                SpacerKt.a(composerImplV, SizeKt.u(companion, f8));
                composerImplV.V(true);
            }
            f6 = f8;
            f7 = f5;
        }
        final Modifier modifier3 = modifier2;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(list, modifier3, i, function1, f, f6, f7, i2, i3) { // from class: au.com.woolworths.foundation.rewards.common.ui.buttons.c
                public final /* synthetic */ Object d;
                public final /* synthetic */ Modifier e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ float h;
                public final /* synthetic */ float i;
                public final /* synthetic */ Float j;
                public final /* synthetic */ int k;

                {
                    this.k = i3;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1572865);
                    FilterSelectorKt.b(this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iA, this.k);
                    return Unit.f24250a;
                }
            };
        }
    }
}
