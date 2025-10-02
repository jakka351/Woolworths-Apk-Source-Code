package au.com.woolworths.android.onesite.deeplink;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SupportedLinksHelper$getSupportedLinks$$inlined$compareBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare((String) obj, (String) obj2);
    }
}
