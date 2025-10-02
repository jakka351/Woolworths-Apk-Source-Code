package com.woolworths.scanlibrary.models.authentication;

import com.google.gson.annotations.SerializedName;
import com.woolworths.scanlibrary.models.device.DeviceInfo;

/* loaded from: classes7.dex */
public class Request {

    @SerializedName("banner")
    private String banner;

    @SerializedName("deviceinfo")
    private DeviceInfo deviceInfo;

    @SerializedName("password")
    private String password;

    @SerializedName("user_name")
    private String userName;

    public Request(String str, String str2, DeviceInfo deviceInfo) {
        this(str, str2, deviceInfo, Banner.ONLINE);
    }

    public String getBanner() {
        return this.banner;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserName() {
        return this.userName;
    }

    public Request(String str, String str2, DeviceInfo deviceInfo, Banner banner) {
        this.userName = str;
        this.password = str2;
        this.deviceInfo = deviceInfo;
        this.banner = banner.getBannerName();
    }
}
