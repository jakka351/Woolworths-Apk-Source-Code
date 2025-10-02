package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class CrashlyticsWorkers$Companion$checkBlockingThread$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((CrashlyticsWorkers.Companion) this.receiver).getClass();
        String strA = CrashlyticsWorkers.Companion.a();
        Intrinsics.g(strA, "<get-threadName>(...)");
        return Boolean.valueOf(StringsKt.o(strA, "Firebase Blocking Thread #", false));
    }
}
