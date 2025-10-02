package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FloatingActionButtonKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1288a = 56;
    public static final float b = 48;
    public static final float c = 20;

    public static final void a(final Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, Composer composer, final int i) {
        final Modifier modifier2;
        final Shape roundedCornerShape;
        final long j3;
        final long j4;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        long jF;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        int i2;
        Modifier modifier3;
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$PreviewActivity_androidKt.f2165a;
        ComposerImpl composerImplV = composer.v(-1555720195);
        int i3 = i | (composerImplV.I(function0) ? 32 : 16) | 38366592;
        if (composerImplV.z(i3 & 1, (38347923 & i3) != 38347922)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                RoundedCornerShape roundedCornerShape2 = MaterialTheme.b(composerImplV).f1321a;
                CornerSize cornerSizeA = CornerSizeKt.a(50);
                roundedCornerShape2.getClass();
                roundedCornerShape = new RoundedCornerShape(cornerSizeA, cornerSizeA, cornerSizeA, cornerSizeA);
                jF = MaterialTheme.a(composerImplV).f();
                long jB = ColorsKt.b(jF, composerImplV);
                int i4 = 15 & 1;
                float f = BitmapDescriptorFactory.HUE_RED;
                float f2 = i4 != 0 ? 6 : 0.0f;
                if ((15 & 2) != 0) {
                    f = 12;
                }
                float f3 = 8;
                float f4 = 8;
                boolean zQ = ((((24576 & 14) ^ 6) > 4 && composerImplV.q(f2)) || (24576 & 6) == 4) | ((((24576 & 112) ^ 48) > 32 && composerImplV.q(f)) || (24576 & 48) == 32) | composerImplV.q(f3) | composerImplV.q(f4);
                Object objG = composerImplV.G();
                if (zQ || objG == Composer.Companion.f1624a) {
                    objG = new DefaultFloatingActionButtonElevation(f2, f, f3, f4);
                    composerImplV.A(objG);
                }
                floatingActionButtonElevation3 = (DefaultFloatingActionButtonElevation) objG;
                i2 = i3 & (-268369921);
                modifier3 = Modifier.Companion.d;
                j4 = jB;
            } else {
                composerImplV.j();
                i2 = i3 & (-268369921);
                modifier3 = modifier;
                roundedCornerShape = shape;
                jF = j;
                j4 = j2;
                floatingActionButtonElevation3 = floatingActionButtonElevation;
            }
            composerImplV.W();
            float f5 = b;
            Modifier modifier4 = modifier3;
            long j5 = jF;
            floatingActionButtonElevation2 = floatingActionButtonElevation3;
            j3 = j5;
            b(function0, SizeKt.t(modifier4, f5, f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), roundedCornerShape, j3, j4, floatingActionButtonElevation2, ComposableLambdaKt.c(1418981691, new FloatingActionButtonKt$ExtendedFloatingActionButton$1(2), composerImplV), composerImplV, 12583296 | ((i2 >> 3) & 14), 0);
            modifier2 = modifier4;
        } else {
            composerImplV.j();
            modifier2 = modifier;
            roundedCornerShape = shape;
            j3 = j;
            j4 = j2;
            floatingActionButtonElevation2 = floatingActionButtonElevation;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(function0, modifier2, roundedCornerShape, j3, j4, floatingActionButtonElevation2, i) { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Modifier i;
                public final /* synthetic */ Shape j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ FloatingActionButtonElevation m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    ComposableLambdaImpl composableLambdaImpl2 = ComposableSingletons$PreviewActivity_androidKt.f2165a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    ((Number) obj2).intValue();
                    ComposableLambdaImpl composableLambdaImpl2 = ComposableSingletons$PreviewActivity_androidKt.f2165a;
                    FloatingActionButtonKt.a(this.h, this.i, this.j, this.k, this.l, this.m, composer2, RecomposeScopeImplKt.a(7));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final kotlin.jvm.functions.Function0 r18, final androidx.compose.ui.Modifier r19, final androidx.compose.ui.graphics.Shape r20, final long r21, long r23, final androidx.compose.material.FloatingActionButtonElevation r25, final androidx.compose.runtime.internal.ComposableLambdaImpl r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.b(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material.FloatingActionButtonElevation, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }
}
