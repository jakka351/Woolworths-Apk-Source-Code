package com.salesforce.marketingcloud.sfmcsdk.components.utils;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH$J\b\u0010\r\u001a\u00020\fH\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/utils/NamedRunnable;", "Ljava/lang/Runnable;", "format", "", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "()Ljava/lang/String;", "execute", "", "run", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NamedRunnable implements Runnable {

    @NotNull
    private final String name;

    public NamedRunnable(@NotNull String format, @NotNull Object... args) {
        Intrinsics.h(format, "format");
        Intrinsics.h(args, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        this.name = "sdk_".concat(String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
    }

    public abstract void execute();

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // java.lang.Runnable
    public void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.name);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
