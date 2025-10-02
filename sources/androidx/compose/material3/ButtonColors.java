package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/ButtonColors;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ButtonColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1403a;
    public final long b;
    public final long c;
    public final long d;

    public ButtonColors(long j, long j2, long j3, long j4) {
        this.f1403a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) obj;
        return Color.c(this.f1403a, buttonColors.f1403a) && Color.c(this.b, buttonColors.b) && Color.c(this.c, buttonColors.c) && Color.c(this.d, buttonColors.d);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.d) + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.b(Long.hashCode(this.f1403a) * 31, 31, this.b), 31, this.c);
    }
}
