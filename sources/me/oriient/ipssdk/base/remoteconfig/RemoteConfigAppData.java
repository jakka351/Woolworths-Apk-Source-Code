package me.oriient.ipssdk.base.remoteconfig;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.db.k;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002STBÍ\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cB¥\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001dJ\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u000eHÆ\u0003J\t\u0010E\u001a\u00020\u000eHÆ\u0003JË\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010G\u001a\u00020\u000e2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\t\u0010J\u001a\u00020\u0005HÖ\u0001J&\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QHÁ\u0001¢\u0006\u0002\bRR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010)R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010)R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001f¨\u0006U"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigAppData;", "", "seen1", "", "ipsDomain", "", "spaceId", "apiKey", "appVersionCode", "", "appVersionName", "bundleId", "deviceId", "isSdkDebug", "", "isAppDebug", "sdkType", "osType", "osVersion", "osApiLevel", "sdkVersionName", "sdkVersionCode", "deviceManufacturer", "deviceModel", "country", k.a.n, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getAppVersionCode", "()D", "getAppVersionName", "getBundleId", "getCountry", "getDeviceId", "getDeviceManufacturer", "getDeviceModel", "getIpsDomain", "()Z", "getLocale", "getOsApiLevel", "()I", "getOsType", "getOsVersion", "getSdkType", "getSdkVersionCode", "getSdkVersionName", "getSpaceId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_base", "$serializer", "Companion", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class RemoteConfigAppData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String apiKey;
    private final double appVersionCode;

    @NotNull
    private final String appVersionName;

    @NotNull
    private final String bundleId;

    @Nullable
    private final String country;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String deviceManufacturer;

    @NotNull
    private final String deviceModel;

    @NotNull
    private final String ipsDomain;
    private final boolean isAppDebug;
    private final boolean isSdkDebug;

    @Nullable
    private final String locale;
    private final int osApiLevel;

    @NotNull
    private final String osType;

    @NotNull
    private final String osVersion;

    @NotNull
    private final String sdkType;
    private final double sdkVersionCode;

    @NotNull
    private final String sdkVersionName;

    @NotNull
    private final String spaceId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigAppData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigAppData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<RemoteConfigAppData> serializer() {
            return RemoteConfigAppData$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ RemoteConfigAppData(int i, String str, String str2, String str3, double d, String str4, String str5, String str6, boolean z, boolean z2, String str7, String str8, String str9, int i2, String str10, double d2, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if (131071 != (i & 131071)) {
            PluginExceptionsKt.a(i, 131071, RemoteConfigAppData$$serializer.INSTANCE.getB());
            throw null;
        }
        this.ipsDomain = str;
        this.spaceId = str2;
        this.apiKey = str3;
        this.appVersionCode = d;
        this.appVersionName = str4;
        this.bundleId = str5;
        this.deviceId = str6;
        this.isSdkDebug = z;
        this.isAppDebug = z2;
        this.sdkType = str7;
        this.osType = str8;
        this.osVersion = str9;
        this.osApiLevel = i2;
        this.sdkVersionName = str10;
        this.sdkVersionCode = d2;
        this.deviceManufacturer = str11;
        this.deviceModel = str12;
        if ((131072 & i) == 0) {
            this.country = null;
        } else {
            this.country = str13;
        }
        if ((i & 262144) == 0) {
            this.locale = null;
        } else {
            this.locale = str14;
        }
    }

    public static /* synthetic */ RemoteConfigAppData copy$default(RemoteConfigAppData remoteConfigAppData, String str, String str2, String str3, double d, String str4, String str5, String str6, boolean z, boolean z2, String str7, String str8, String str9, int i, String str10, double d2, String str11, String str12, String str13, String str14, int i2, Object obj) {
        String str15;
        String str16;
        String str17 = (i2 & 1) != 0 ? remoteConfigAppData.ipsDomain : str;
        String str18 = (i2 & 2) != 0 ? remoteConfigAppData.spaceId : str2;
        String str19 = (i2 & 4) != 0 ? remoteConfigAppData.apiKey : str3;
        double d3 = (i2 & 8) != 0 ? remoteConfigAppData.appVersionCode : d;
        String str20 = (i2 & 16) != 0 ? remoteConfigAppData.appVersionName : str4;
        String str21 = (i2 & 32) != 0 ? remoteConfigAppData.bundleId : str5;
        String str22 = (i2 & 64) != 0 ? remoteConfigAppData.deviceId : str6;
        boolean z3 = (i2 & 128) != 0 ? remoteConfigAppData.isSdkDebug : z;
        boolean z4 = (i2 & 256) != 0 ? remoteConfigAppData.isAppDebug : z2;
        String str23 = (i2 & 512) != 0 ? remoteConfigAppData.sdkType : str7;
        String str24 = (i2 & 1024) != 0 ? remoteConfigAppData.osType : str8;
        String str25 = (i2 & 2048) != 0 ? remoteConfigAppData.osVersion : str9;
        int i3 = (i2 & 4096) != 0 ? remoteConfigAppData.osApiLevel : i;
        String str26 = str17;
        String str27 = (i2 & 8192) != 0 ? remoteConfigAppData.sdkVersionName : str10;
        double d4 = (i2 & 16384) != 0 ? remoteConfigAppData.sdkVersionCode : d2;
        String str28 = (i2 & 32768) != 0 ? remoteConfigAppData.deviceManufacturer : str11;
        String str29 = (i2 & 65536) != 0 ? remoteConfigAppData.deviceModel : str12;
        String str30 = str28;
        String str31 = (i2 & 131072) != 0 ? remoteConfigAppData.country : str13;
        if ((i2 & 262144) != 0) {
            str16 = str31;
            str15 = remoteConfigAppData.locale;
        } else {
            str15 = str14;
            str16 = str31;
        }
        return remoteConfigAppData.copy(str26, str18, str19, d3, str20, str21, str22, z3, z4, str23, str24, str25, i3, str27, d4, str30, str29, str16, str15);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_base(RemoteConfigAppData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.ipsDomain);
        output.p(serialDesc, 1, self.spaceId);
        output.p(serialDesc, 2, self.apiKey);
        output.G(serialDesc, 3, self.appVersionCode);
        output.p(serialDesc, 4, self.appVersionName);
        output.p(serialDesc, 5, self.bundleId);
        output.p(serialDesc, 6, self.deviceId);
        output.o(serialDesc, 7, self.isSdkDebug);
        output.o(serialDesc, 8, self.isAppDebug);
        output.p(serialDesc, 9, self.sdkType);
        output.p(serialDesc, 10, self.osType);
        output.p(serialDesc, 11, self.osVersion);
        output.C(12, self.osApiLevel, serialDesc);
        output.p(serialDesc, 13, self.sdkVersionName);
        output.G(serialDesc, 14, self.sdkVersionCode);
        output.p(serialDesc, 15, self.deviceManufacturer);
        output.p(serialDesc, 16, self.deviceModel);
        if (output.q(serialDesc, 17) || self.country != null) {
            output.w(serialDesc, 17, StringSerializer.f24821a, self.country);
        }
        if (!output.q(serialDesc, 18) && self.locale == null) {
            return;
        }
        output.w(serialDesc, 18, StringSerializer.f24821a, self.locale);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIpsDomain() {
        return this.ipsDomain;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getSdkType() {
        return this.sdkType;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getOsType() {
        return this.osType;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component13, reason: from getter */
    public final int getOsApiLevel() {
        return this.osApiLevel;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getSdkVersionName() {
        return this.sdkVersionName;
    }

    /* renamed from: component15, reason: from getter */
    public final double getSdkVersionCode() {
        return this.sdkVersionCode;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: component4, reason: from getter */
    public final double getAppVersionCode() {
        return this.appVersionCode;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAppVersionName() {
        return this.appVersionName;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsSdkDebug() {
        return this.isSdkDebug;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsAppDebug() {
        return this.isAppDebug;
    }

    @NotNull
    public final RemoteConfigAppData copy(@NotNull String ipsDomain, @NotNull String spaceId, @NotNull String apiKey, double appVersionCode, @NotNull String appVersionName, @NotNull String bundleId, @NotNull String deviceId, boolean isSdkDebug, boolean isAppDebug, @NotNull String sdkType, @NotNull String osType, @NotNull String osVersion, int osApiLevel, @NotNull String sdkVersionName, double sdkVersionCode, @NotNull String deviceManufacturer, @NotNull String deviceModel, @Nullable String country, @Nullable String locale) {
        Intrinsics.h(ipsDomain, "ipsDomain");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(appVersionName, "appVersionName");
        Intrinsics.h(bundleId, "bundleId");
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(sdkType, "sdkType");
        Intrinsics.h(osType, "osType");
        Intrinsics.h(osVersion, "osVersion");
        Intrinsics.h(sdkVersionName, "sdkVersionName");
        Intrinsics.h(deviceManufacturer, "deviceManufacturer");
        Intrinsics.h(deviceModel, "deviceModel");
        return new RemoteConfigAppData(ipsDomain, spaceId, apiKey, appVersionCode, appVersionName, bundleId, deviceId, isSdkDebug, isAppDebug, sdkType, osType, osVersion, osApiLevel, sdkVersionName, sdkVersionCode, deviceManufacturer, deviceModel, country, locale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteConfigAppData)) {
            return false;
        }
        RemoteConfigAppData remoteConfigAppData = (RemoteConfigAppData) other;
        return Intrinsics.c(this.ipsDomain, remoteConfigAppData.ipsDomain) && Intrinsics.c(this.spaceId, remoteConfigAppData.spaceId) && Intrinsics.c(this.apiKey, remoteConfigAppData.apiKey) && Double.compare(this.appVersionCode, remoteConfigAppData.appVersionCode) == 0 && Intrinsics.c(this.appVersionName, remoteConfigAppData.appVersionName) && Intrinsics.c(this.bundleId, remoteConfigAppData.bundleId) && Intrinsics.c(this.deviceId, remoteConfigAppData.deviceId) && this.isSdkDebug == remoteConfigAppData.isSdkDebug && this.isAppDebug == remoteConfigAppData.isAppDebug && Intrinsics.c(this.sdkType, remoteConfigAppData.sdkType) && Intrinsics.c(this.osType, remoteConfigAppData.osType) && Intrinsics.c(this.osVersion, remoteConfigAppData.osVersion) && this.osApiLevel == remoteConfigAppData.osApiLevel && Intrinsics.c(this.sdkVersionName, remoteConfigAppData.sdkVersionName) && Double.compare(this.sdkVersionCode, remoteConfigAppData.sdkVersionCode) == 0 && Intrinsics.c(this.deviceManufacturer, remoteConfigAppData.deviceManufacturer) && Intrinsics.c(this.deviceModel, remoteConfigAppData.deviceModel) && Intrinsics.c(this.country, remoteConfigAppData.country) && Intrinsics.c(this.locale, remoteConfigAppData.locale);
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    public final double getAppVersionCode() {
        return this.appVersionCode;
    }

    @NotNull
    public final String getAppVersionName() {
        return this.appVersionName;
    }

    @NotNull
    public final String getBundleId() {
        return this.bundleId;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final String getIpsDomain() {
        return this.ipsDomain;
    }

    @Nullable
    public final String getLocale() {
        return this.locale;
    }

    public final int getOsApiLevel() {
        return this.osApiLevel;
    }

    @NotNull
    public final String getOsType() {
        return this.osType;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getSdkType() {
        return this.sdkType;
    }

    public final double getSdkVersionCode() {
        return this.sdkVersionCode;
    }

    @NotNull
    public final String getSdkVersionName() {
        return this.sdkVersionName;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    public int hashCode() {
        int iC = androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(android.support.v4.media.session.a.a(this.sdkVersionCode, androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.a(this.osApiLevel, androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(android.support.v4.media.session.a.a(this.appVersionCode, androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.ipsDomain.hashCode() * 31, 31, this.spaceId), 31, this.apiKey), 31), 31, this.appVersionName), 31, this.bundleId), 31, this.deviceId), 31, this.isSdkDebug), 31, this.isAppDebug), 31, this.sdkType), 31, this.osType), 31, this.osVersion), 31), 31, this.sdkVersionName), 31), 31, this.deviceManufacturer), 31, this.deviceModel);
        String str = this.country;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.locale;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isAppDebug() {
        return this.isAppDebug;
    }

    public final boolean isSdkDebug() {
        return this.isSdkDebug;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfigAppData(ipsDomain=");
        sb.append(this.ipsDomain);
        sb.append(", spaceId=");
        sb.append(this.spaceId);
        sb.append(", apiKey=");
        sb.append(this.apiKey);
        sb.append(", appVersionCode=");
        sb.append(this.appVersionCode);
        sb.append(", appVersionName=");
        sb.append(this.appVersionName);
        sb.append(", bundleId=");
        sb.append(this.bundleId);
        sb.append(", deviceId=");
        sb.append(this.deviceId);
        sb.append(", isSdkDebug=");
        sb.append(this.isSdkDebug);
        sb.append(", isAppDebug=");
        sb.append(this.isAppDebug);
        sb.append(", sdkType=");
        sb.append(this.sdkType);
        sb.append(", osType=");
        sb.append(this.osType);
        sb.append(", osVersion=");
        sb.append(this.osVersion);
        sb.append(", osApiLevel=");
        sb.append(this.osApiLevel);
        sb.append(", sdkVersionName=");
        sb.append(this.sdkVersionName);
        sb.append(", sdkVersionCode=");
        sb.append(this.sdkVersionCode);
        sb.append(", deviceManufacturer=");
        sb.append(this.deviceManufacturer);
        sb.append(", deviceModel=");
        sb.append(this.deviceModel);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", locale=");
        return androidx.camera.core.impl.b.r(sb, this.locale, ')');
    }

    public RemoteConfigAppData(@NotNull String ipsDomain, @NotNull String spaceId, @NotNull String apiKey, double d, @NotNull String appVersionName, @NotNull String bundleId, @NotNull String deviceId, boolean z, boolean z2, @NotNull String sdkType, @NotNull String osType, @NotNull String osVersion, int i, @NotNull String sdkVersionName, double d2, @NotNull String deviceManufacturer, @NotNull String deviceModel, @Nullable String str, @Nullable String str2) {
        Intrinsics.h(ipsDomain, "ipsDomain");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(appVersionName, "appVersionName");
        Intrinsics.h(bundleId, "bundleId");
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(sdkType, "sdkType");
        Intrinsics.h(osType, "osType");
        Intrinsics.h(osVersion, "osVersion");
        Intrinsics.h(sdkVersionName, "sdkVersionName");
        Intrinsics.h(deviceManufacturer, "deviceManufacturer");
        Intrinsics.h(deviceModel, "deviceModel");
        this.ipsDomain = ipsDomain;
        this.spaceId = spaceId;
        this.apiKey = apiKey;
        this.appVersionCode = d;
        this.appVersionName = appVersionName;
        this.bundleId = bundleId;
        this.deviceId = deviceId;
        this.isSdkDebug = z;
        this.isAppDebug = z2;
        this.sdkType = sdkType;
        this.osType = osType;
        this.osVersion = osVersion;
        this.osApiLevel = i;
        this.sdkVersionName = sdkVersionName;
        this.sdkVersionCode = d2;
        this.deviceManufacturer = deviceManufacturer;
        this.deviceModel = deviceModel;
        this.country = str;
        this.locale = str2;
    }

    public /* synthetic */ RemoteConfigAppData(String str, String str2, String str3, double d, String str4, String str5, String str6, boolean z, boolean z2, String str7, String str8, String str9, int i, String str10, double d2, String str11, String str12, String str13, String str14, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, str4, str5, str6, z, z2, str7, str8, str9, i, str10, d2, str11, str12, (i2 & 131072) != 0 ? null : str13, (i2 & 262144) != 0 ? null : str14);
    }
}
