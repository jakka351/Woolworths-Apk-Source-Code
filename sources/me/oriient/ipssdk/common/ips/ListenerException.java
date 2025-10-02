package me.oriient.ipssdk.common.ips;

import androidx.annotation.Keep;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0012H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/common/ips/ListenerException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "listenerName", "", "origin", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "stackTrace", "Ljava/util/ArrayList;", "Ljava/lang/StackTraceElement;", "getStackTrace", "", "()[Ljava/lang/StackTraceElement;", "printStackTrace", "", "s", "Ljava/io/PrintStream;", "Ljava/io/PrintWriter;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListenerException extends RuntimeException {

    @NotNull
    private final ArrayList<StackTraceElement> stackTrace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenerException(@NotNull String listenerName, @NotNull Throwable origin) {
        super("Exception caught in client listener of type: " + listenerName + ": original exception: " + origin.getClass().getSimpleName() + ": " + origin.getMessage());
        Intrinsics.h(listenerName, "listenerName");
        Intrinsics.h(origin, "origin");
        this.stackTrace = new ArrayList<>();
        StackTraceElement[] stackTrace = super.getStackTrace();
        Intrinsics.g(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.R(Arrays.copyOf(stackTrace, stackTrace.length)));
        StackTraceElement[] stackTrace2 = origin.getStackTrace();
        Intrinsics.g(stackTrace2, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace2) {
            if (!arrayList.contains(stackTraceElement)) {
                this.stackTrace.add(stackTraceElement);
            }
        }
    }

    @Override // java.lang.Throwable
    @NotNull
    public StackTraceElement[] getStackTrace() {
        Object[] array = this.stackTrace.toArray(new StackTraceElement[this.stackTrace.size()]);
        Intrinsics.g(array, "toArray(...)");
        return (StackTraceElement[]) array;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintWriter s) {
        Intrinsics.h(s, "s");
        synchronized (s) {
            s.println(getMessage());
            Iterator<StackTraceElement> it = this.stackTrace.iterator();
            while (it.hasNext()) {
                s.println("\tat " + it.next());
            }
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintStream s) {
        Intrinsics.h(s, "s");
        synchronized (s) {
            s.println(getMessage());
            Iterator<StackTraceElement> it = this.stackTrace.iterator();
            while (it.hasNext()) {
                s.println("\tat " + it.next());
            }
        }
    }
}
