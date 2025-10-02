package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ContextMenuArea_androidKt {
    public static final void a(final ContextMenuState contextMenuState, final Function0 function0, Modifier modifier, final Function1 function1, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(645832757);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(contextMenuState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(function1) ? 2048 : 1024;
        }
        if (composerImplV.z(i3 & 1, (i3 & 1171) != 1170)) {
            ContextMenuState.Status status = (ContextMenuState.Status) ((SnapshotMutableStateImpl) contextMenuState.f859a).getD();
            if (!(status instanceof ContextMenuState.Status.Open)) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(function0, function1, i) { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$1
                        public final /* synthetic */ Function0 i;
                        public final /* synthetic */ Lambda j;
                        public final /* synthetic */ int k;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                            this.j = (Lambda) function1;
                            this.k = i;
                        }

                        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Number) obj2).intValue();
                            ContextMenuArea_androidKt.a(this.h, this.i, Modifier.Companion.d, this.j, (Composer) obj, RecomposeScopeImplKt.a(this.k | 1));
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            boolean zN = composerImplV.n(status);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new ContextMenuPopupPositionProvider(IntOffsetKt.c(((ContextMenuState.Status.Open) status).f861a));
                composerImplV.A(objG);
            }
            ContextMenuUi_androidKt.d((ContextMenuPopupPositionProvider) objG, function0, function1, composerImplV, i3 & 8176);
            modifier = Modifier.Companion.d;
        } else {
            composerImplV.j();
        }
        final Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            recomposeScopeImplX2.d = new Function2<Composer, Integer, Unit>(function0, modifier2, function1, i) { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$2
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Modifier j;
                public final /* synthetic */ Lambda k;
                public final /* synthetic */ int l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                    this.k = (Lambda) function1;
                    this.l = i;
                }

                /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    ContextMenuArea_androidKt.a(this.h, this.i, this.j, this.k, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.foundation.contextmenu.ContextMenuState r17, final kotlin.jvm.functions.Function0 r18, final kotlin.jvm.functions.Function1 r19, androidx.compose.ui.Modifier r20, boolean r21, kotlin.jvm.functions.Function0 r22, final androidx.compose.runtime.internal.ComposableLambdaImpl r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt.b(androidx.compose.foundation.contextmenu.ContextMenuState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }
}
