package com.woolworths.scanlibrary.util.device;

import com.woolworths.scanlibrary.models.device.DeviceInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/util/device/DeviceInfoProvider;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DeviceInfoProvider {
    String a();

    void b(String str);

    DeviceInfo c();

    void d();

    String getAppId();

    String getAppVersion();

    int getAppVersionCode();

    String getAppVersionName();

    String getDeviceId();

    void getDeviceModel();

    String getOsVersion();
}
