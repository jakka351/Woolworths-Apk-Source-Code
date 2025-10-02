package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.OperationCanceledException;
import androidx.core.os.CancellationSignal;

/* loaded from: classes2.dex */
public final class ContentResolverCompat {
    public static Cursor a(ContentResolver contentResolver, CancellationSignal cancellationSignal) throws Exception {
        android.os.CancellationSignal cancellationSignal2;
        if (cancellationSignal != null) {
            synchronized (cancellationSignal) {
                try {
                    if (cancellationSignal.c == null) {
                        android.os.CancellationSignal cancellationSignal3 = new android.os.CancellationSignal();
                        cancellationSignal.c = cancellationSignal3;
                        if (cancellationSignal.f2440a) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = cancellationSignal.c;
                } finally {
                }
            }
        } else {
            cancellationSignal2 = null;
        }
        try {
            return contentResolver.query(null, null, null, null, null, cancellationSignal2);
        } catch (Exception e) {
            if (e instanceof OperationCanceledException) {
                throw new androidx.core.os.OperationCanceledException();
            }
            throw e;
        }
    }
}
