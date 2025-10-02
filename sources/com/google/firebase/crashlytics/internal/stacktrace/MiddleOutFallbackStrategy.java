package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes.dex */
public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final StackTraceTrimmingStrategy[] f15401a;
    public final MiddleOutStrategy b = new MiddleOutStrategy();

    public MiddleOutFallbackStrategy(StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.f15401a = stackTraceTrimmingStrategyArr;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.f15401a) {
            if (stackTraceElementArrA.length <= 1024) {
                break;
            }
            stackTraceElementArrA = stackTraceTrimmingStrategy.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > 1024 ? this.b.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
