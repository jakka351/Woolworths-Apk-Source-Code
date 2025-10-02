package androidx.compose.ui.graphics.vector;

import android.support.v4.media.session.a;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class VectorComposeKt {
    public static final void a(final String str, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final List list, ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        final ComposableLambdaImpl composableLambdaImpl2;
        ComposerImpl composerImplV = composer.v(-213417674);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.q(f) ? 32 : 16) | (composerImplV.q(f2) ? 256 : 128) | (composerImplV.q(f3) ? 2048 : 1024) | (composerImplV.q(f4) ? 16384 : 8192) | (composerImplV.q(f5) ? 131072 : 65536) | (composerImplV.q(f6) ? 1048576 : 524288) | (composerImplV.q(f7) ? 8388608 : 4194304) | (composerImplV.I(list) ? 67108864 : 33554432);
        if (composerImplV.z(i2 & 1, (306783379 & i2) != 306783378)) {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            if (!(composerImplV.f1625a instanceof VectorApplier)) {
                ComposablesKt.b();
                throw null;
            }
            composerImplV.w0();
            if (composerImplV.O) {
                composerImplV.K(VectorComposeKt$Group$1.h);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, str, VectorComposeKt$Group$2$1.h);
            Updater.b(composerImplV, Float.valueOf(f), VectorComposeKt$Group$2$2.h);
            Updater.b(composerImplV, Float.valueOf(f2), VectorComposeKt$Group$2$3.h);
            Updater.b(composerImplV, Float.valueOf(f3), VectorComposeKt$Group$2$4.h);
            Updater.b(composerImplV, Float.valueOf(f4), VectorComposeKt$Group$2$5.h);
            Updater.b(composerImplV, Float.valueOf(f5), VectorComposeKt$Group$2$6.h);
            Updater.b(composerImplV, Float.valueOf(f6), VectorComposeKt$Group$2$7.h);
            Updater.b(composerImplV, Float.valueOf(f7), VectorComposeKt$Group$2$8.h);
            Updater.b(composerImplV, list, VectorComposeKt$Group$2$9.h);
            composableLambdaImpl2 = composableLambdaImpl;
            a.y(6, composableLambdaImpl2, composerImplV, true);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(str, f, f2, f3, f4, f5, f6, f7, list, composableLambdaImpl2, i) { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                public final /* synthetic */ String h;
                public final /* synthetic */ float i;
                public final /* synthetic */ float j;
                public final /* synthetic */ float k;
                public final /* synthetic */ float l;
                public final /* synthetic */ float m;
                public final /* synthetic */ float n;
                public final /* synthetic */ float o;
                public final /* synthetic */ List p;
                public final /* synthetic */ ComposableLambdaImpl q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(805306369);
                    VectorComposeKt.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final List list, final int i, final String str, final Brush brush, final float f, final Brush brush2, final float f2, final float f3, final int i2, final int i3, final float f4, final float f5, final float f6, final float f7, Composer composer, final int i4) {
        ComposerImpl composerImplV = composer.v(-1478270750);
        int i5 = i4 | (composerImplV.I(list) ? 4 : 2) | (composerImplV.r(i) ? 32 : 16) | (composerImplV.n(str) ? 256 : 128) | (composerImplV.n(brush) ? 2048 : 1024) | (composerImplV.q(f) ? 16384 : 8192) | (composerImplV.n(brush2) ? 131072 : 65536) | (composerImplV.q(f2) ? 1048576 : 524288) | (composerImplV.q(f3) ? 8388608 : 4194304) | (composerImplV.r(i2) ? 67108864 : 33554432) | (composerImplV.r(i3) ? 536870912 : 268435456);
        if (!composerImplV.z(i5 & 1, ((i5 & 306783379) == 306783378 && (((((composerImplV.q(f4) ? (char) 4 : (char) 2) | (composerImplV.q(f5) ? ' ' : (char) 16)) | (composerImplV.q(f6) ? (char) 256 : (char) 128)) | (composerImplV.q(f7) ? (char) 2048 : (char) 1024)) & 1171) == 1170) ? false : true)) {
            composerImplV.j();
        } else {
            if (!(composerImplV.f1625a instanceof VectorApplier)) {
                ComposablesKt.b();
                throw null;
            }
            composerImplV.w0();
            if (composerImplV.O) {
                composerImplV.K(VectorComposeKt$Path$1.h);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, str, VectorComposeKt$Path$2$1.h);
            Updater.b(composerImplV, list, VectorComposeKt$Path$2$2.h);
            Updater.b(composerImplV, new PathFillType(i), VectorComposeKt$Path$2$3.h);
            Updater.b(composerImplV, brush, VectorComposeKt$Path$2$4.h);
            Updater.b(composerImplV, Float.valueOf(f), VectorComposeKt$Path$2$5.h);
            Updater.b(composerImplV, brush2, VectorComposeKt$Path$2$6.h);
            Updater.b(composerImplV, Float.valueOf(f2), VectorComposeKt$Path$2$7.h);
            Updater.b(composerImplV, Float.valueOf(f3), VectorComposeKt$Path$2$8.h);
            Updater.b(composerImplV, new StrokeJoin(i3), VectorComposeKt$Path$2$9.h);
            Updater.b(composerImplV, new StrokeCap(i2), VectorComposeKt$Path$2$10.h);
            Updater.b(composerImplV, Float.valueOf(f4), VectorComposeKt$Path$2$11.h);
            Updater.b(composerImplV, Float.valueOf(f5), VectorComposeKt$Path$2$12.h);
            Updater.b(composerImplV, Float.valueOf(f6), VectorComposeKt$Path$2$13.h);
            Updater.b(composerImplV, Float.valueOf(f7), VectorComposeKt$Path$2$14.h);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(list, i, str, brush, f, brush2, f2, f3, i2, i3, f4, f5, f6, f7, i4) { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
                public final /* synthetic */ List h;
                public final /* synthetic */ int i;
                public final /* synthetic */ String j;
                public final /* synthetic */ Brush k;
                public final /* synthetic */ float l;
                public final /* synthetic */ Brush m;
                public final /* synthetic */ float n;
                public final /* synthetic */ float o;
                public final /* synthetic */ int p;
                public final /* synthetic */ int q;
                public final /* synthetic */ float r;
                public final /* synthetic */ float s;
                public final /* synthetic */ float t;
                public final /* synthetic */ float u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    VectorComposeKt.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
