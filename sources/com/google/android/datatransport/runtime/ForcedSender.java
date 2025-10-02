package com.google.android.datatransport.runtime;

import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;

/* loaded from: classes2.dex */
public final class ForcedSender {
    public static void a(Transport transport) {
        if (transport instanceof TransportImpl) {
            TransportRuntime.a().d.a(((TransportImpl) transport).f14443a.e(Priority.f), 1);
        } else {
            String strConcat = "TRuntime.".concat("ForcedSender");
            if (Log.isLoggable(strConcat, 5)) {
                Log.w(strConcat, String.format("Expected instance of `TransportImpl`, got `%s`.", transport));
            }
        }
    }
}
