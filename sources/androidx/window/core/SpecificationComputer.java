package androidx.window.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/core/SpecificationComputer;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Companion", "VerificationMode", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SpecificationComputer<T> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/core/SpecificationComputer$Companion;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static SpecificationComputer a(Object obj, VerificationMode verificationMode) {
            Intrinsics.h(obj, "<this>");
            return new ValidSpecification(obj, verificationMode, AndroidLogger.f3868a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/core/SpecificationComputer$VerificationMode;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class VerificationMode {
        public static final VerificationMode d;
        public static final /* synthetic */ VerificationMode[] e;

        /* JADX INFO: Fake field, exist only in values array */
        VerificationMode EF0;

        static {
            VerificationMode verificationMode = new VerificationMode("STRICT", 0);
            VerificationMode verificationMode2 = new VerificationMode("LOG", 1);
            VerificationMode verificationMode3 = new VerificationMode("QUIET", 2);
            d = verificationMode3;
            e = new VerificationMode[]{verificationMode, verificationMode2, verificationMode3};
        }

        public static VerificationMode valueOf(String str) {
            return (VerificationMode) Enum.valueOf(VerificationMode.class, str);
        }

        public static VerificationMode[] values() {
            return (VerificationMode[]) e.clone();
        }
    }

    public static String b(Object value, String str) {
        Intrinsics.h(value, "value");
        return str + " value: " + value;
    }

    /* renamed from: a */
    public abstract Object getF3871a();

    public abstract SpecificationComputer c(String str, Function1 function1);
}
