package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;

/* loaded from: classes7.dex */
public final class InvalidModuleExceptionKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ModuleCapability f24335a = new ModuleCapability("InvalidModuleNotifier");

    public static final void a(ModuleDescriptorImpl moduleDescriptorImpl) {
        InvalidModuleNotifier invalidModuleNotifier = (InvalidModuleNotifier) moduleDescriptorImpl.T(f24335a);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.a();
            return;
        }
        String message = "Accessing invalid module descriptor " + moduleDescriptorImpl;
        Intrinsics.h(message, "message");
        throw new InvalidModuleException(message);
    }
}
