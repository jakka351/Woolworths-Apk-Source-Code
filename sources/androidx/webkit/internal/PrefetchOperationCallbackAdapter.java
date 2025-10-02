package androidx.webkit.internal;

import androidx.webkit.PrefetchException;
import androidx.webkit.PrefetchNetworkException;
import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;

/* loaded from: classes2.dex */
public class PrefetchOperationCallbackAdapter {

    /* renamed from: androidx.webkit.internal.PrefetchOperationCallbackAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements PrefetchOperationCallbackBoundaryInterface {
        @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
        public final void onFailure(int i, String str, int i2) {
            if (i == 1) {
                new PrefetchNetworkException(str);
                throw null;
            }
            new PrefetchException(str);
            throw null;
        }

        @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
        public final void onSuccess() {
            throw null;
        }
    }
}
