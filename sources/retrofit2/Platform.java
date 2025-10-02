package retrofit2;

import java.util.concurrent.Executor;
import retrofit2.BuiltInFactories;
import retrofit2.Reflection;

/* loaded from: classes2.dex */
final class Platform {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f26998a;
    public static final Reflection b;
    public static final BuiltInFactories c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f26998a = null;
            b = new Reflection();
            c = new BuiltInFactories();
        } else if (property.equals("Dalvik")) {
            f26998a = new AndroidMainExecutor();
            b = new Reflection.Android24();
            c = new BuiltInFactories.Java8();
        } else {
            f26998a = null;
            b = new Reflection.Java8();
            c = new BuiltInFactories.Java8();
        }
    }
}
