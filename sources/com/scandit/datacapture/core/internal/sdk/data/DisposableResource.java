package com.scandit.datacapture.core.internal.sdk.data;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0013B)\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003R$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/data/DisposableResource;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/scandit/datacapture/core/internal/sdk/data/Subscription;", "start", "", "<set-?>", "c", "I", "getCounter$scandit_capture_core", "()I", "counter", "Lkotlin/Function0;", "factory", "Lkotlin/Function1;", "", "tearDown", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "com/scandit/datacapture/core/internal/sdk/data/a", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DisposableResource<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f18694a;
    private final Function1 b;

    /* renamed from: c, reason: from kotlin metadata */
    private int counter;
    private Object d;
    private final Object e;

    public DisposableResource(@NotNull Function0<? extends T> factory, @NotNull Function1<? super T, Unit> tearDown) {
        Intrinsics.h(factory, "factory");
        Intrinsics.h(tearDown, "tearDown");
        this.f18694a = factory;
        this.b = tearDown;
        this.e = new Object();
    }

    /* renamed from: getCounter$scandit_capture_core, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    @NotNull
    public final Subscription<T> start() {
        synchronized (this.e) {
            int i = this.counter + 1;
            this.counter = i;
            if (i == 1) {
                this.d = this.f18694a.invoke();
            }
        }
        return new a(this);
    }
}
