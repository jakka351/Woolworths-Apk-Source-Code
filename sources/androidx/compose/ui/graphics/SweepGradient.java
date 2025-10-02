package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SweepGradient extends ShaderBrush {
    public final List c;

    public SweepGradient(List list) {
        this.c = list;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    public final Shader b(long j) {
        long jB = SizeKt.b(j);
        List list = this.c;
        AndroidShader_androidKt.b(list, null);
        return new android.graphics.SweepGradient(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & 4294967295L)), AndroidShader_androidKt.a(list), (float[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SweepGradient) {
            return Offset.c(9205357640488583168L, 9205357640488583168L) && this.c.equals(((SweepGradient) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return androidx.camera.core.impl.b.d(Long.hashCode(9205357640488583168L) * 31, 31, this.c);
    }

    public final String toString() {
        return android.support.v4.media.session.a.t(YU.a.u("SweepGradient(", "", "colors="), this.c, ", stops=null)");
    }
}
