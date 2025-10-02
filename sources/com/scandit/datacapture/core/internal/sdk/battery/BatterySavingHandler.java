package com.scandit.datacapture.core.internal.sdk.battery;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManagerImpl;
import com.scandit.datacapture.core.source.BatterySavingMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J3\u0010\n\u001a\u00020\u00072)\u0010\u000b\u001a%\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fj\u0004\u0018\u0001`\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingHandler;", "", "shouldSaveBattery", "", "getShouldSaveBattery", "()Z", "setBatterySavingMode", "", "batterySavingMode", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "setListener", "cameraBatterySavingListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingListener;", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BatterySavingHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f18656a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingHandler$Companion;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingHandler;", "defaultHandler", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f18656a = new Companion();

        private Companion() {
        }

        @NotNull
        public final BatterySavingHandler defaultHandler(@NotNull Context context) {
            Intrinsics.h(context, "context");
            BatterySavingManagerImpl.Companion companion = BatterySavingManagerImpl.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.g(applicationContext, "context.applicationContext");
            return new BatterySavingHandlerImpl(companion.sharedInstance(applicationContext));
        }
    }

    boolean getShouldSaveBattery();

    void setBatterySavingMode(@NotNull BatterySavingMode batterySavingMode);

    void setListener(@Nullable Function1<? super Boolean, Unit> cameraBatterySavingListener);
}
