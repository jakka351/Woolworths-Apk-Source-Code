package com.scandit.datacapture.core.internal.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import com.scandit.datacapture.core.internal.sdk.lifecycle.AppLifecycleListener;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/AppAndroidEnvironment;", "Lcom/scandit/datacapture/core/internal/sdk/AndroidEnvironment;", "Landroid/content/Context;", "context", "", "getInstallerInfo", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "Lcom/scandit/datacapture/core/internal/sdk/lifecycle/AppLifecycleListener;", "a", "Lkotlin/Lazy;", "getAppLifecycleListener", "()Lcom/scandit/datacapture/core/internal/sdk/lifecycle/AppLifecycleListener;", "appLifecycleListener", "", "b", "getSupportedAbis", "()[Ljava/lang/String;", "supportedAbis", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SuppressLint
/* loaded from: classes.dex */
public final class AppAndroidEnvironment implements AndroidEnvironment {
    public static Context applicationContext;

    @NotNull
    public static final AppAndroidEnvironment INSTANCE = new AppAndroidEnvironment();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final Lazy appLifecycleListener = LazyKt.b(a.f18645a);

    /* renamed from: b, reason: from kotlin metadata */
    private static final Lazy supportedAbis = LazyKt.b(b.f18655a);

    private AppAndroidEnvironment() {
    }

    @Override // com.scandit.datacapture.core.internal.sdk.AndroidEnvironment
    @NotNull
    public AppLifecycleListener getAppLifecycleListener() {
        return (AppLifecycleListener) appLifecycleListener.getD();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.AndroidEnvironment
    @NotNull
    public Context getApplicationContext() {
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        Intrinsics.p("applicationContext");
        throw null;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.AndroidEnvironment
    @Nullable
    public String getInstallerInfo(@NotNull Context context) {
        Intrinsics.h(context, "context");
        return Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInitiatingPackageName() : context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }

    @Override // com.scandit.datacapture.core.internal.sdk.AndroidEnvironment
    @NotNull
    public String[] getSupportedAbis() {
        Object value = supportedAbis.getD();
        Intrinsics.g(value, "<get-supportedAbis>(...)");
        return (String[]) value;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.AndroidEnvironment
    public void setApplicationContext(@NotNull Context context) {
        Intrinsics.h(context, "<set-?>");
        applicationContext = context;
    }
}
