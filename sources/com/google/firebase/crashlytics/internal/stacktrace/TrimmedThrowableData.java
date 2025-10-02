package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.Stack;

/* loaded from: classes6.dex */
public class TrimmedThrowableData {

    /* renamed from: a, reason: collision with root package name */
    public final String f15402a;
    public final String b;
    public final StackTraceElement[] c;
    public final TrimmedThrowableData d;

    public TrimmedThrowableData(String str, String str2, StackTraceElement[] stackTraceElementArr, TrimmedThrowableData trimmedThrowableData) {
        this.f15402a = str;
        this.b = str2;
        this.c = stackTraceElementArr;
        this.d = trimmedThrowableData;
    }

    public static TrimmedThrowableData a(Throwable th, MiddleOutFallbackStrategy middleOutFallbackStrategy) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        TrimmedThrowableData trimmedThrowableData = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            trimmedThrowableData = new TrimmedThrowableData(th2.getLocalizedMessage(), th2.getClass().getName(), middleOutFallbackStrategy.a(th2.getStackTrace()), trimmedThrowableData);
        }
        return trimmedThrowableData;
    }
}
