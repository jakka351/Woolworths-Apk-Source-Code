package com.braintreepayments.api;

import java.lang.Thread;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/braintreepayments/api/CrashReporter;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Cause", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class CrashReporter implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f13718a;
    public Thread.UncaughtExceptionHandler b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/CrashReporter$Cause;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface Cause {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/braintreepayments/api/CrashReporter$Companion;", "", "", "CAUSE_RELATED_TO_BRAINTREE", "I", "CAUSE_RELATED_TO_PAYPAL", "CAUSE_UNKNOWN", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public CrashReporter(BraintreeClient braintreeClient) {
        this.f13718a = new WeakReference(braintreeClient);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void uncaughtException(java.lang.Thread r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            java.lang.String r0 = "thread"
            kotlin.jvm.internal.Intrinsics.h(r7, r0)
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.h(r8, r0)
            java.lang.ref.WeakReference r0 = r6.f13718a
            java.lang.Object r0 = r0.get()
            com.braintreepayments.api.BraintreeClient r0 = (com.braintreepayments.api.BraintreeClient) r0
            if (r0 != 0) goto L24
            java.lang.Thread$UncaughtExceptionHandler r0 = r6.b
            if (r0 == 0) goto L1b
            r0.uncaughtException(r7, r8)
        L1b:
            java.lang.Thread$UncaughtExceptionHandler r7 = r6.b
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r7)
            r7 = 0
            r6.b = r7
            return
        L24:
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r1)
            r8.printStackTrace(r2)
            java.lang.String r2 = r1.toString()
            java.lang.String r3 = "stringWriter.toString()"
            kotlin.jvm.internal.Intrinsics.g(r2, r3)
            java.lang.String r4 = "com.braintreepayments"
            r5 = 0
            boolean r2 = kotlin.text.StringsKt.o(r2, r4, r5)
            if (r2 == 0) goto L44
            goto L53
        L44:
            java.lang.String r1 = r1.toString()
            kotlin.jvm.internal.Intrinsics.g(r1, r3)
            java.lang.String r2 = "com.paypal"
            boolean r1 = kotlin.text.StringsKt.o(r1, r2, r5)
            if (r1 == 0) goto L66
        L53:
            com.braintreepayments.api.AuthorizationLoader r1 = r0.d
            com.braintreepayments.api.Authorization r1 = r1.f13699a
            if (r1 == 0) goto L66
            com.braintreepayments.api.b r2 = new com.braintreepayments.api.b
            r2.<init>(r0, r1)
            com.braintreepayments.api.b r1 = new com.braintreepayments.api.b
            r1.<init>(r0, r2)
            r0.b(r1)
        L66:
            java.lang.Thread$UncaughtExceptionHandler r0 = r6.b
            if (r0 == 0) goto L6d
            r0.uncaughtException(r7, r8)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.CrashReporter.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
