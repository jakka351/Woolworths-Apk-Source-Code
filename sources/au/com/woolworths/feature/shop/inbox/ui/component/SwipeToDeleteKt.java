package au.com.woolworths.feature.shop.inbox.ui.component;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.DismissDirection;
import androidx.compose.material.DismissState;
import androidx.compose.material.SwipeToDismissKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "alpha", "inbox_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SwipeToDeleteKt {
    public static final void a(final DismissState state, final ComposableLambdaImpl composableLambdaImpl, Modifier modifier, long j, long j2, final ComposableLambdaImpl composableLambdaImpl2, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        int i4;
        Modifier modifier3;
        final long jG;
        final long jE;
        ComposerImpl composerImpl;
        final long j3;
        final long j4;
        Intrinsics.h(state, "state");
        ComposerImpl composerImplV = composer.v(1572380543);
        int i5 = i | (composerImplV.n(state) ? 4 : 2);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | KyberEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i5 | (composerImplV.n(modifier2) ? 256 : 128);
        }
        int i7 = i3 | 9216;
        if ((74899 & i7) == 74898 && composerImplV.c()) {
            composerImplV.j();
            j3 = j;
            composerImpl = composerImplV;
            j4 = j2;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                i4 = i7 & (-64513);
                modifier3 = i6 != 0 ? Modifier.Companion.d : modifier2;
                jG = WxTheme.a(composerImplV).g();
                jE = WxTheme.a(composerImplV).e();
            } else {
                composerImplV.j();
                jE = j2;
                i4 = i7 & (-64513);
                modifier3 = modifier2;
                jG = j;
            }
            composerImplV.W();
            Set setI = SetsKt.i(DismissDirection.e);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new d(16);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            long j5 = jG;
            long j6 = jE;
            Modifier modifier4 = modifier3;
            SwipeToDismissKt.a(state, modifier4, setI, (Function1) objG, ComposableLambdaKt.c(1479798929, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.inbox.ui.component.SwipeToDeleteKt$SwipeToDelete$2
                /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0161  */
                @Override // kotlin.jvm.functions.Function3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
                    /*
                        Method dump skipped, instructions count: 528
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.inbox.ui.component.SwipeToDeleteKt$SwipeToDelete$2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerImplV), composableLambdaImpl2, composerImplV, (i4 & 14) | 28032 | ((i4 >> 3) & 112) | 196608);
            modifier2 = modifier4;
            composerImpl = composerImplV;
            j3 = j5;
            j4 = j6;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(composableLambdaImpl, modifier2, j3, j4, composableLambdaImpl2, i, i2) { // from class: au.com.woolworths.feature.shop.inbox.ui.component.b
                public final /* synthetic */ ComposableLambdaImpl e;
                public final /* synthetic */ Modifier f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ ComposableLambdaImpl i;
                public final /* synthetic */ int j;

                {
                    this.j = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(196657);
                    SwipeToDeleteKt.a(this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA, this.j);
                    return Unit.f24250a;
                }
            };
        }
    }
}
