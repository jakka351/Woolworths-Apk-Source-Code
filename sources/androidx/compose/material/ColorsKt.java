package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ColorsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f1254a = new StaticProvidableCompositionLocal(ColorsKt$LocalColors$1.h);

    public static final long a(Colors colors, long j) {
        long jE = colors.e();
        MutableState mutableState = colors.i;
        MutableState mutableState2 = colors.h;
        if (!Color.c(j, jE) && !Color.c(j, ((Color) ((SnapshotMutableStateImpl) colors.b).getD()).f1766a)) {
            if (!Color.c(j, colors.f()) && !Color.c(j, ((Color) ((SnapshotMutableStateImpl) colors.d).getD()).f1766a)) {
                return Color.c(j, colors.b()) ? ((Color) ((SnapshotMutableStateImpl) colors.j).getD()).f1766a : Color.c(j, colors.g()) ? colors.d() : Color.c(j, colors.c()) ? ((Color) ((SnapshotMutableStateImpl) colors.l).getD()).f1766a : Color.k;
            }
            return ((Color) ((SnapshotMutableStateImpl) mutableState).getD()).f1766a;
        }
        return ((Color) ((SnapshotMutableStateImpl) mutableState2).getD()).f1766a;
    }

    public static final long b(long j, Composer composer) {
        composer.o(-702388415);
        long jA = a(MaterialTheme.a(composer), j);
        if (jA == 16) {
            jA = ((Color) composer.x(ContentColorKt.f1261a)).f1766a;
        }
        composer.l();
        return jA;
    }
}
