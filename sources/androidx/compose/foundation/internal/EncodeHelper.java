package androidx.compose.foundation.internal;

import android.os.Parcel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/internal/EncodeHelper;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class EncodeHelper {

    /* renamed from: a, reason: collision with root package name */
    public Parcel f928a;

    public final void a(byte b) {
        this.f928a.writeByte(b);
    }

    public final void b(float f) {
        this.f928a.writeFloat(f);
    }

    public final void c(long j) {
        long jB = TextUnit.b(j);
        byte b = 0;
        if (!TextUnitType.a(jB, 0L)) {
            if (TextUnitType.a(jB, llqqqql.a00610061aaaa)) {
                b = 1;
            } else if (TextUnitType.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        a(b);
        if (TextUnitType.a(TextUnit.b(j), 0L)) {
            return;
        }
        b(TextUnit.c(j));
    }
}
