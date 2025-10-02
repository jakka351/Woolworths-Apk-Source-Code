package androidx.work.impl;

import androidx.work.Logger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnfinishedWorkListenerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3934a;
    public static final long b;

    static {
        String strG = Logger.g("UnfinishedWorkListener");
        Intrinsics.g(strG, "tagWithPrefix(\"UnfinishedWorkListener\")");
        f3934a = strG;
        b = TimeUnit.HOURS.toMillis(1L);
    }
}
