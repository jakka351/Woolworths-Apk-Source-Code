package androidx.compose.foundation.layout;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FlowLayoutKt {
    public static final void a(final Modifier modifier, final Arrangement.Horizontal horizontal, final Arrangement.Vertical vertical, final int i, final FlowRowOverflow flowRowOverflow, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i2) {
        int i3;
        FlowRowOverflow flowRowOverflow2;
        boolean z;
        ComposerImpl composerImplV = composer.v(-218661582);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.n(horizontal) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(vertical) ? 256 : 128;
        }
        int i4 = i2 & 3072;
        BiasAlignment.Vertical vertical2 = Alignment.Companion.j;
        if (i4 == 0) {
            i3 |= composerImplV.n(vertical2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.r(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerImplV.r(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            flowRowOverflow2 = flowRowOverflow;
            i3 |= composerImplV.n(flowRowOverflow2) ? 1048576 : 524288;
        } else {
            flowRowOverflow2 = flowRowOverflow;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl) ? 8388608 : 4194304;
        }
        int i5 = i3;
        if (composerImplV.z(i5 & 1, (i5 & 4793491) != 4793490)) {
            int i6 = i5 & 3670016;
            boolean z2 = i6 == 1048576;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            Object obj = objG;
            if (z2 || objG == composer$Companion$Empty$1) {
                flowRowOverflow2.getClass();
                FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.d;
                FlowLayoutOverflowState flowLayoutOverflowState = new FlowLayoutOverflowState();
                flowLayoutOverflowState.f960a = -1;
                composerImplV.A(flowLayoutOverflowState);
                obj = flowLayoutOverflowState;
            }
            FlowLayoutOverflowState flowLayoutOverflowState2 = (FlowLayoutOverflowState) obj;
            int i7 = i5 >> 3;
            boolean zN = ((((57344 & i7) ^ 24576) > 16384 && composerImplV.r(Integer.MAX_VALUE)) || (i7 & 24576) == 16384) | ((((i7 & 14) ^ 6) > 4 && composerImplV.n(horizontal)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && composerImplV.n(vertical)) || (i7 & 48) == 32) | ((((i7 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composerImplV.n(vertical2)) || (i7 & KyberEngine.KyberPolyBytes) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && composerImplV.r(i)) || (i7 & 3072) == 2048) | composerImplV.n(flowLayoutOverflowState2);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                z = true;
                FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getD(), new CrossAxisAlignment.VerticalCrossAxisAlignment(vertical2), vertical.getD(), i, Integer.MAX_VALUE, flowLayoutOverflowState2);
                composerImplV.A(flowMeasurePolicy);
                objG2 = flowMeasurePolicy;
            } else {
                z = true;
            }
            FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) objG2;
            boolean z3 = ((i5 & 29360128) == 8388608 ? z : false) | (i6 == 1048576 ? z : false) | ((i5 & 458752) == 131072 ? z : false);
            Object objG3 = composerImplV.G();
            Object obj2 = objG3;
            if (z3 || objG3 == composer$Companion$Empty$1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Composer composer2 = (Composer) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                            composableLambdaImpl.invoke(FlowRowScopeInstance.f965a, composer2, 6);
                        } else {
                            composer2.j();
                        }
                        return Unit.f24250a;
                    }
                }, z, 702094978));
                flowRowOverflow.getClass();
                FlowLayoutOverflow.OverflowType overflowType2 = FlowLayoutOverflow.OverflowType.d;
                composerImplV.A(arrayList);
                obj2 = arrayList;
            }
            ComposableLambdaImpl composableLambdaImplB = LayoutKt.b((List) obj2);
            boolean zN2 = composerImplV.n(flowMeasurePolicy2);
            Object objG4 = composerImplV.G();
            if (zN2 || objG4 == composer$Companion$Empty$1) {
                objG4 = new MultiContentMeasurePolicyImpl(flowMeasurePolicy2);
                composerImplV.A(objG4);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG4;
            int i8 = composerImplV.P;
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
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                b.B(i8, composerImplV, i8, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            a.y(0, composableLambdaImplB, composerImplV, z);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    FlowLayoutKt.a(modifier, horizontal, vertical, i, flowRowOverflow, composableLambdaImpl, (Composer) obj3, RecomposeScopeImplKt.a(i2 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.Modifier r18, androidx.compose.foundation.layout.Arrangement.Horizontal r19, androidx.compose.foundation.layout.Arrangement.Vertical r20, androidx.compose.ui.Alignment.Vertical r21, int r22, int r23, final androidx.compose.runtime.internal.ComposableLambdaImpl r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.b(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final long c(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j, Function1 function1) {
        if (RowColumnImplKt.b(RowColumnImplKt.a(measurable)) == BitmapDescriptorFactory.HUE_RED) {
            RowColumnParentData rowColumnParentDataA = RowColumnImplKt.a(measurable);
            if (((rowColumnParentDataA == null || rowColumnParentDataA.d == null) ? null : Float.valueOf(BitmapDescriptorFactory.HUE_RED)) == null) {
                Placeable placeableC0 = measurable.c0(j);
                function1.invoke(placeableC0);
                return IntIntPair.a(flowLineMeasurePolicy.j(placeableC0), flowLineMeasurePolicy.g(placeableC0));
            }
        }
        int iA0 = flowLineMeasurePolicy.getF962a() ? measurable.a0(Integer.MAX_VALUE) : measurable.T(Integer.MAX_VALUE);
        return IntIntPair.a(iA0, flowLineMeasurePolicy.getF962a() ? measurable.T(iA0) : measurable.a0(iA0));
    }
}
