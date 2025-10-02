package me.oriient.internal.infra.networkManager;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.utils.android.AndroidApiLevelChecker;
import me.oriient.internal.infra.utils.android.AndroidApiLevelCheckerImpl;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\u001b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lme/oriient/internal/infra/networkManager/NetworkManagerAndroid;", "Lme/oriient/internal/infra/networkManager/NetworkManager;", "Landroid/content/Context;", "context", "Lme/oriient/internal/infra/utils/android/AndroidApiLevelChecker;", "apiLevelChecker", "<init>", "(Landroid/content/Context;Lme/oriient/internal/infra/utils/android/AndroidApiLevelChecker;)V", "", "sentConnectionMeteredIfChanged", "()V", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isConnected", "Lkotlinx/coroutines/flow/MutableStateFlow;", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isConnectionMetered", "Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "setLogger", "(Lme/oriient/internal/infra/utils/core/Logger;)V", "me/oriient/internal/infra/networkManager/a", "connectivityCallback", "Lme/oriient/internal/infra/networkManager/a;", "me/oriient/internal/infra/networkManager/b", "connectivityReceiver", "Lme/oriient/internal/infra/networkManager/b;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkManagerAndroid implements NetworkManager {

    @NotNull
    private final a connectivityCallback;

    @NotNull
    private final ConnectivityManager connectivityManager;

    @NotNull
    private final b connectivityReceiver;

    @NotNull
    private final MutableStateFlow<Boolean> isConnected;

    @NotNull
    private final MutableStateFlow<Boolean> isConnectionMetered;

    @Nullable
    private Logger logger;

    public NetworkManagerAndroid(@NotNull Context context, @NotNull AndroidApiLevelChecker apiLevelChecker) {
        Intrinsics.h(context, "context");
        Intrinsics.h(apiLevelChecker, "apiLevelChecker");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.connectivityManager = connectivityManager;
        this.isConnected = StateFlowKt.a(Boolean.FALSE);
        this.isConnectionMetered = StateFlowKt.a(Boolean.valueOf(connectivityManager.isActiveNetworkMetered()));
        a aVar = new a(this);
        this.connectivityCallback = aVar;
        b bVar = new b(this);
        this.connectivityReceiver = bVar;
        if (apiLevelChecker.isNougatOrHigher()) {
            connectivityManager.registerDefaultNetworkCallback(aVar);
        } else {
            context.registerReceiver(bVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sentConnectionMeteredIfChanged() {
        boolean zIsActiveNetworkMetered = this.connectivityManager.isActiveNetworkMetered();
        if (zIsActiveNetworkMetered != ((Boolean) isConnectionMetered().getValue()).booleanValue()) {
            isConnectionMetered().setValue(Boolean.valueOf(zIsActiveNetworkMetered));
        }
    }

    @Override // me.oriient.internal.infra.networkManager.NetworkManager
    @Nullable
    public Logger getLogger() {
        return this.logger;
    }

    @Override // me.oriient.internal.infra.networkManager.NetworkManager
    public void setLogger(@Nullable Logger logger) {
        this.logger = logger;
    }

    @Override // me.oriient.internal.infra.networkManager.NetworkManager
    @NotNull
    public MutableStateFlow<Boolean> isConnected() {
        return this.isConnected;
    }

    @Override // me.oriient.internal.infra.networkManager.NetworkManager
    @NotNull
    public MutableStateFlow<Boolean> isConnectionMetered() {
        return this.isConnectionMetered;
    }

    public /* synthetic */ NetworkManagerAndroid(Context context, AndroidApiLevelChecker androidApiLevelChecker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new AndroidApiLevelCheckerImpl() : androidApiLevelChecker);
    }
}
