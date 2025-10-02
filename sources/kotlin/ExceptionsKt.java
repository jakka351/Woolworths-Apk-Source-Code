package kotlin;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"kotlin/ExceptionsKt__ExceptionsKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes7.dex */
public final class ExceptionsKt extends ExceptionsKt__ExceptionsKt {
    public static void a(Throwable th, Throwable exception) {
        Intrinsics.h(th, "<this>");
        Intrinsics.h(exception, "exception");
        if (th != exception) {
            PlatformImplementationsKt.f24258a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        Intrinsics.h(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
