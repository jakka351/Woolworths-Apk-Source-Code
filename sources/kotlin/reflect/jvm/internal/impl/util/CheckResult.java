package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes7.dex */
public abstract class CheckResult {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24639a;

    public static final class IllegalFunctionName extends CheckResult {
        public static final IllegalFunctionName b = new IllegalFunctionName(false);
    }

    public static final class IllegalSignature extends CheckResult {
    }

    public static final class SuccessCheck extends CheckResult {
        public static final SuccessCheck b = new SuccessCheck(true);
    }

    public CheckResult(boolean z) {
        this.f24639a = z;
    }
}
