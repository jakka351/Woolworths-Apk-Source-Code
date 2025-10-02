package androidx.media3.datasource;

import com.google.common.base.Predicate;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Predicate {
    public final /* synthetic */ int d;

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.d) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                }
                break;
            default:
                if (((String) obj) != null) {
                }
                break;
        }
        return false;
    }
}
