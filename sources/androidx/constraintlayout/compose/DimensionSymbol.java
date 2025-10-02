package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLString;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/DimensionSymbol;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DimensionSymbol {

    /* renamed from: a, reason: collision with root package name */
    public final String f2242a;
    public final String b;

    public DimensionSymbol(String str, String str2) {
        this.f2242a = str;
        this.b = str2;
    }

    public final CLElement a() {
        String str = this.f2242a;
        if (str != null) {
            return CLString.k(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.b + ". Using WrapContent.");
        return CLString.k("wrap");
    }
}
