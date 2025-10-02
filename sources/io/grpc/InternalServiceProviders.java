package io.grpc;

import io.grpc.ServiceProviders;

@Internal
/* loaded from: classes7.dex */
public final class InternalServiceProviders {

    public interface PriorityAccessor<T> extends ServiceProviders.PriorityAccessor<T> {
    }

    public static boolean a(ClassLoader classLoader) throws ClassNotFoundException {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
