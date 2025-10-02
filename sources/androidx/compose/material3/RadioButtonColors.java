package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/RadioButtonColors;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RadioButtonColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1474a;
    public final long b;
    public final long c;
    public final long d;

    public RadioButtonColors(long j, long j2, long j3, long j4) {
        this.f1474a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) obj;
        return Color.c(this.f1474a, radioButtonColors.f1474a) && Color.c(this.b, radioButtonColors.b) && Color.c(this.c, radioButtonColors.c) && Color.c(this.d, radioButtonColors.d);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.d) + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(Long.hashCode(this.f1474a) * 31, 31, this.b), 31, this.c);
    }
}
