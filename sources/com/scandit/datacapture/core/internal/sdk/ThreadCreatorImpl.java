package com.scandit.datacapture.core.internal.sdk;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.internal.sdk.bar.Callable;
import com.scandit.internal.sdk.bar.HandlerThread;
import com.scandit.internal.sdk.bar.HandlerThreadCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ThreadCreatorImpl;", "Lcom/scandit/internal/sdk/bar/HandlerThreadCreator;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lcom/scandit/internal/sdk/bar/Callable;", "function", "Lcom/scandit/internal/sdk/bar/HandlerThread;", "create", "", "threadPriority", "<init>", "(I)V", "com/scandit/datacapture/core/internal/sdk/d", "com/scandit/datacapture/core/internal/sdk/e", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ThreadCreatorImpl extends HandlerThreadCreator {

    /* renamed from: a, reason: collision with root package name */
    private final int f18644a;

    public ThreadCreatorImpl(int i) {
        this.f18644a = i;
    }

    @Override // com.scandit.internal.sdk.bar.HandlerThreadCreator
    @NotNull
    public HandlerThread create(@NotNull String name, @NotNull Callable function) {
        Intrinsics.h(name, "name");
        Intrinsics.h(function, "function");
        return new e(name, function, this.f18644a);
    }
}
