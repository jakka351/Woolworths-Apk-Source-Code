package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J\b\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0007H&J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0007H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/infra/utils/core/OsData;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "apiLevel", "", "getApiLevel", "()I", "manufacturer", "", "getManufacturer", "()Ljava/lang/String;", "model", "getModel", "osType", "getOsType", "osVersion", "getOsVersion", "getCarrierName", "getConnectionType", "getDeviceDescription", "getLocale", "getUserCountryByNetwork", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OsData extends DiProvidable {
    int getApiLevel();

    @NotNull
    String getCarrierName();

    @NotNull
    String getConnectionType();

    @NotNull
    String getDeviceDescription();

    @Nullable
    String getLocale();

    @NotNull
    String getManufacturer();

    @NotNull
    String getModel();

    @NotNull
    String getOsType();

    @NotNull
    String getOsVersion();

    @Nullable
    String getUserCountryByNetwork();
}
