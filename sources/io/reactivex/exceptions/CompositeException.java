package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes7.dex */
public final class CompositeException extends RuntimeException {
    public final List d;
    public final String e;
    public Throwable f;

    public static final class CompositeExceptionCausalChain extends RuntimeException {
        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    public static abstract class PrintStreamOrWriter {
        public abstract void a(String str);
    }

    public static final class WrappedPrintStream extends PrintStreamOrWriter {

        /* renamed from: a, reason: collision with root package name */
        public final PrintStream f24222a;

        public WrappedPrintStream(PrintStream printStream) {
            this.f24222a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        public final void a(String str) {
            this.f24222a.println((Object) str);
        }
    }

    public static final class WrappedPrintWriter extends PrintStreamOrWriter {

        /* renamed from: a, reason: collision with root package name */
        public final PrintWriter f24223a;

        public WrappedPrintWriter(PrintWriter printWriter) {
            this.f24223a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        public final void a(String str) {
            this.f24223a.println((Object) str);
        }
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    public final void b(PrintStreamOrWriter printStreamOrWriter) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.d) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        printStreamOrWriter.a(sb.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f == null) {
                CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
                HashSet hashSet = new HashSet();
                CompositeExceptionCausalChain compositeExceptionCausalChain2 = compositeExceptionCausalChain;
                for (Throwable runtimeException : this.d) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        ArrayList arrayList = new ArrayList();
                        Throwable cause = runtimeException.getCause();
                        if (cause != null && cause != runtimeException) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Throwable th = (Throwable) it.next();
                            if (hashSet.contains(th)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th);
                            }
                        }
                        try {
                            compositeExceptionCausalChain2.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = compositeExceptionCausalChain2.getCause();
                        if (cause3 != null && compositeExceptionCausalChain2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            compositeExceptionCausalChain2 = cause3;
                        }
                    }
                }
                this.f = compositeExceptionCausalChain;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.e;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new WrappedPrintStream(printStream));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).d);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.d = listUnmodifiableList;
            this.e = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new WrappedPrintWriter(printWriter));
    }
}
