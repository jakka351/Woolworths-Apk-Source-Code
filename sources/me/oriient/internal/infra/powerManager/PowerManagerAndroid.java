package me.oriient.internal.infra.powerManager;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006*\u0001\u001a\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u000fR\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lme/oriient/internal/infra/powerManager/PowerManagerAndroid;", "Lme/oriient/internal/infra/powerManager/PowerManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Intent;", "batteryStatus", "", "updateStatus", "(Landroid/content/Intent;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isCharging", "Lkotlinx/coroutines/flow/MutableStateFlow;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isNetworkMetered", "", "batteryLevel", "getBatteryLevel", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "me/oriient/internal/infra/powerManager/b", "receiver", "Lme/oriient/internal/infra/powerManager/b;", "Companion", "me/oriient/internal/infra/powerManager/a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PowerManagerAndroid implements PowerManager {

    @NotNull
    private static final a Companion = new a();

    @NotNull
    private static final String TAG = "PowerManager";

    @NotNull
    private final MutableStateFlow<Float> batteryLevel;

    @NotNull
    private final MutableStateFlow<Boolean> isCharging;

    @NotNull
    private final MutableStateFlow<Boolean> isNetworkMetered;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @NotNull
    private final b receiver;

    public PowerManagerAndroid(@NotNull Context context) {
        Intrinsics.h(context, "context");
        Boolean bool = Boolean.FALSE;
        this.isCharging = StateFlowKt.a(bool);
        this.isNetworkMetered = StateFlowKt.a(bool);
        this.batteryLevel = StateFlowKt.a(Float.valueOf(-1.0f));
        this.logger = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
        b bVar = new b(this);
        this.receiver = bVar;
        updateStatus(context.registerReceiver(bVar, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStatus(Intent batteryStatus) {
        int intExtra = batteryStatus != null ? batteryStatus.getIntExtra("status", -1) : -1;
        boolean z = intExtra == 2 || intExtra == 5;
        if (z != ((Boolean) isCharging().getValue()).booleanValue()) {
            getLogger().d(TAG, "isCharging changed to " + z);
            isCharging().setValue(Boolean.valueOf(z));
        }
        float intExtra2 = batteryStatus != null ? (batteryStatus.getIntExtra("level", -1) * 100) / batteryStatus.getIntExtra("scale", -1) : -1.0f;
        if (intExtra2 == ((Number) getBatteryLevel().getValue()).floatValue()) {
            return;
        }
        getLogger().d(TAG, "batteryLevel changed to " + intExtra2);
        getBatteryLevel().setValue(Float.valueOf(intExtra2));
    }

    @Override // me.oriient.internal.infra.powerManager.PowerManager
    @NotNull
    public MutableStateFlow<Float> getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override // me.oriient.internal.infra.powerManager.PowerManager
    @NotNull
    public MutableStateFlow<Boolean> isCharging() {
        return this.isCharging;
    }

    @Override // me.oriient.internal.infra.powerManager.PowerManager
    @NotNull
    public MutableStateFlow<Boolean> isNetworkMetered() {
        return this.isNetworkMetered;
    }
}
