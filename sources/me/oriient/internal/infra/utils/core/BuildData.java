package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/infra/utils/core/BuildData;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "appDebug", "", "getAppDebug", "()Z", "appVersionCode", "", "getAppVersionCode", "()D", "appVersionName", "", "getAppVersionName", "()Ljava/lang/String;", "bundleId", "getBundleId", "debug", "getDebug", "versionCode", "getVersionCode", "versionName", "getVersionName", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BuildData extends DiProvidable {
    boolean getAppDebug();

    double getAppVersionCode();

    @NotNull
    String getAppVersionName();

    @NotNull
    String getBundleId();

    boolean getDebug();

    double getVersionCode();

    @NotNull
    String getVersionName();
}
