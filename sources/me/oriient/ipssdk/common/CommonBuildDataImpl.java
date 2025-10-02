package me.oriient.ipssdk.common;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.salesforce.marketingcloud.messages.iam.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010#\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013¨\u0006$"}, d2 = {"Lme/oriient/ipssdk/common/CommonBuildDataImpl;", "Lme/oriient/internal/infra/utils/core/BuildData;", "Lme/oriient/internal/infra/utils/android/ContextProvider;", "contextProvider", "", "debug", "<init>", "(Lme/oriient/internal/infra/utils/android/ContextProvider;Z)V", "a", "Z", "getDebug", "()Z", "b", "getAppDebug", "appDebug", "", "c", "Ljava/lang/String;", "getBundleId", "()Ljava/lang/String;", "bundleId", "d", "getVersionName", "versionName", "", "e", "D", "getVersionCode", "()D", "versionCode", "f", "getAppVersionCode", "appVersionCode", "g", "getAppVersionName", "appVersionName", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CommonBuildDataImpl implements BuildData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean debug;

    /* renamed from: b, reason: from kotlin metadata */
    private final boolean appDebug;

    /* renamed from: c, reason: from kotlin metadata */
    private final String bundleId;

    /* renamed from: d, reason: from kotlin metadata */
    private final String versionName;

    /* renamed from: e, reason: from kotlin metadata */
    private final double versionCode;

    /* renamed from: f, reason: from kotlin metadata */
    private final double appVersionCode;

    /* renamed from: g, reason: from kotlin metadata */
    private final String appVersionName;

    public CommonBuildDataImpl(@NotNull ContextProvider contextProvider, boolean z) throws PackageManager.NameNotFoundException {
        double longVersionCode;
        String versionName;
        PackageInfo packageInfo;
        Intrinsics.h(contextProvider, "contextProvider");
        this.debug = z;
        this.appDebug = (contextProvider.getContext().getApplicationInfo().flags & 2) != 0;
        String packageName = contextProvider.getContext().getPackageName();
        Intrinsics.g(packageName, "getPackageName(...)");
        this.bundleId = packageName;
        this.versionName = BuildConfig.LIB_VERSION_NAME;
        this.versionCode = 33.0d;
        try {
            packageInfo = contextProvider.getContext().getPackageManager().getPackageInfo(getBundleId(), 0);
            longVersionCode = packageInfo.getLongVersionCode();
        } catch (Exception unused) {
            longVersionCode = -1.0d;
        }
        try {
            versionName = packageInfo.versionName;
            Intrinsics.g(versionName, "versionName");
        } catch (Exception unused2) {
            ((Logger) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(Logger.class))).e("CommonBuildDataImpl", "failed to get package info for package " + getBundleId());
            versionName = j.h;
            this.appVersionCode = longVersionCode;
            this.appVersionName = versionName;
        }
        this.appVersionCode = longVersionCode;
        this.appVersionName = versionName;
    }

    @Override // me.oriient.internal.infra.utils.core.BuildData
    public boolean getAppDebug() {
        return this.appDebug;
    }

    @Override // me.oriient.internal.infra.utils.core.BuildData
    public double getAppVersionCode() {
        return this.appVersionCode;
    }

    @Override // me.oriient.internal.infra.utils.core.BuildData
    @NotNull
    public String getAppVersionName() {
        return this.appVersionName;
    }

    @Override // me.oriient.internal.infra.utils.core.BuildData
    @NotNull
    public String getBundleId() {
        return this.bundleId;
    }

    @Override // me.oriient.internal.infra.utils.core.BuildData
    public boolean getDebug() {
        return this.debug;
    }

    @Override // me.oriient.internal.infra.utils.core.BuildData
    public double getVersionCode() {
        return this.versionCode;
    }

    @Override // me.oriient.internal.infra.utils.core.BuildData
    @NotNull
    public String getVersionName() {
        return this.versionName;
    }
}
