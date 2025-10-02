package androidx.compose.foundation.text.selection;

import androidx.collection.MutableLongIntMap;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class SelectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1<T> implements Comparator {
    public final /* synthetic */ MutableLongIntMap d;

    public SelectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1(MutableLongIntMap mutableLongIntMap) {
        this.d = mutableLongIntMap;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        MutableLongIntMap mutableLongIntMap = this.d;
        return ComparisonsKt.a(Integer.valueOf(mutableLongIntMap.b(jLongValue)), Integer.valueOf(mutableLongIntMap.b(((Number) obj2).longValue())));
    }
}
