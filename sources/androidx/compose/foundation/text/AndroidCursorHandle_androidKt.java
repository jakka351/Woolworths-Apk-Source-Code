package androidx.compose.foundation.text;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.runtime.ComposablesKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.DpSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidCursorHandle_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1101a;
    public static final float b;

    static {
        float f = 25;
        f1101a = f;
        b = (f * 2.0f) / 2.4142137f;
    }

    public static final void a(final OffsetProvider offsetProvider, final Modifier modifier, final long j, Composer composer, final int i, final int i2) {
        ComposerImpl composerImplV = composer.v(1776202187);
        int i3 = (composerImplV.n(offsetProvider) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16);
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= ((i2 & 4) == 0 && composerImplV.s(j)) ? 256 : 128;
        }
        if (composerImplV.z(i3 & 1, (i3 & 147) != 146)) {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                i3 &= -897;
                j = 9205357640488583168L;
            }
            composerImplV.W();
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((SemanticsPropertyReceiver) obj).b(SelectionHandlesKt.c, new SelectionHandleInfo(Handle.d, offsetProvider.a(), SelectionHandleAnchor.e, true));
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            final Modifier modifierB = SemanticsModifierKt.b(modifier, false, (Function1) objG);
            AndroidSelectionHandles_androidKt.a(offsetProvider, Alignment.Companion.b, ComposableLambdaKt.c(-1653527038, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long j2 = j;
                        if (j2 != 9205357640488583168L) {
                            composer2.o(1828931592);
                            Modifier modifierN = SizeKt.n(modifierB, DpSize.b(j2), DpSize.a(j2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.b, false);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, modifierN);
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
                                b.z(p, composer2, p, function2);
                            }
                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                            AndroidCursorHandle_androidKt.b(0, 1, composer2, null);
                            composer2.f();
                            composer2.l();
                        } else {
                            composer2.o(1829298756);
                            AndroidCursorHandle_androidKt.b(0, 0, composer2, modifierB);
                            composer2.l();
                        }
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, i4 | 432);
        } else {
            composerImplV.j();
        }
        final long j2 = j;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AndroidCursorHandle_androidKt.a(offsetProvider, modifier, j2, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, Composer composer, final Modifier modifier) {
        int i3;
        ComposerImpl composerImplV = composer.v(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (composerImplV.z(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            SpacerKt.a(composerImplV, ComposedModifierKt.a(SizeKt.r(modifier, b, f1101a), InspectableValueKt.a(), AndroidCursorHandle_androidKt$drawCursorHandle$1.h));
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$DefaultCursorHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AndroidCursorHandle_androidKt.b(RecomposeScopeImplKt.a(i | 1), i2, (Composer) obj, modifier);
                    return Unit.f24250a;
                }
            };
        }
    }
}
