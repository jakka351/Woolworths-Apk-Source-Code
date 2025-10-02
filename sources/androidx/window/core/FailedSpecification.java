package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/core/FailedSpecification;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/window/core/SpecificationComputer;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FailedSpecification<T> extends SpecificationComputer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3870a;
    public final String b;
    public final Logger c;
    public final SpecificationComputer.VerificationMode d;
    public final WindowStrictModeException e;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
        }
    }

    public FailedSpecification(Object value, String str, Logger logger, SpecificationComputer.VerificationMode verificationMode) {
        Intrinsics.h(value, "value");
        this.f3870a = value;
        this.b = str;
        this.c = logger;
        this.d = verificationMode;
        String message = SpecificationComputer.b(value, str);
        Intrinsics.h(message, "message");
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(message);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        Intrinsics.g(stackTrace, "stackTrace");
        Object[] array = ArraysKt.A(2, stackTrace).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) array);
        this.e = windowStrictModeException;
    }

    @Override // androidx.window.core.SpecificationComputer
    /* renamed from: a */
    public final Object getF3871a() throws WindowStrictModeException {
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            throw this.e;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        this.c.a(SpecificationComputer.b(this.f3870a, this.b));
        return null;
    }

    @Override // androidx.window.core.SpecificationComputer
    public final SpecificationComputer c(String str, Function1 function1) {
        return this;
    }
}
