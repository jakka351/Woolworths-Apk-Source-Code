package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/internal/DecodeHelper;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DecodeHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Parcel f927a;

    public DecodeHelper(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f927a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public final long a() {
        Parcel parcel = this.f927a;
        byte b = parcel.readByte();
        long j = b == 1 ? llqqqql.a00610061aaaa : b == 2 ? 8589934592L : 0L;
        return TextUnitType.a(j, 0L) ? TextUnit.c : TextUnitKt.e(j, parcel.readFloat());
    }
}
