package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Immutable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ResistanceConfig;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@Immutable
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ResistanceConfig {

    /* renamed from: a, reason: collision with root package name */
    public final float f1313a;
    public final float b;
    public final float c;

    public ResistanceConfig(float f, float f2, float f3) {
        this.f1313a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) obj;
        return this.f1313a == resistanceConfig.f1313a && this.b == resistanceConfig.b && this.c == resistanceConfig.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + a.b(this.b, Float.hashCode(this.f1313a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResistanceConfig(basis=");
        sb.append(this.f1313a);
        sb.append(", factorAtMin=");
        sb.append(this.b);
        sb.append(", factorAtMax=");
        return a.r(sb, this.c, ')');
    }
}
