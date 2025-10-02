package leakcanary;

import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes7.dex */
final class AndroidLeakFixes$MEDIA_SESSION_LEGACY_HELPER$apply$1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() throws NoSuchMethodException, SecurityException {
        try {
            Class.forName("android.media.session.MediaSessionLegacyHelper").getDeclaredMethod("getHelper", Context.class);
            throw null;
        } catch (Exception unused) {
        }
    }
}
