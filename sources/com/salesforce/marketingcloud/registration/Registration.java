package com.salesforce.marketingcloud.registration;

import android.text.TextUtils;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.internal.m;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@MCKeep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B½\u0001\b\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\u0010\u001dJ\r\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0002\b&J\r\u0010\f\u001a\u00020\bH\u0007¢\u0006\u0002\b'J\u0019\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001cH\u0007¢\u0006\u0002\b(J\u000e\u0010)\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b*J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u001aHÆ\u0003J\u0015\u00104\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001cHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\t\u0010;\u001a\u00020\u000eHÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\b=Jß\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001cHÆ\u0001J\r\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0002\b?J\u0013\u0010@\u001a\u00020\u000e2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0006HÖ\u0001J\r\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0002\bCJ\r\u0010\u0018\u001a\u00020\bH\u0007¢\u0006\u0002\bDJ\r\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0002\bEJ\r\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0002\bFJ\r\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0002\bGJ\r\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\bHJ\r\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0002\bIJ\r\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0002\bJJ\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\bKJ\u000f\u0010\n\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\bLJ\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007¢\u0006\u0002\bMJ\r\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0002\bNJ\r\u0010O\u001a\u00020\u0003H\u0000¢\u0006\u0002\bPJ\t\u0010Q\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0017\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001eR\u0013\u0010\f\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001eR\u001f\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001c8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001fR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001eR\u0013\u0010\t\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001eR\u0013\u0010\r\u001a\u00020\u000e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010 R\u0013\u0010\u0016\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001eR\u001c\u0010\u0005\u001a\u00020\u00068\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0013\u0010\u0018\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001eR\u0013\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0013\u0010\u0015\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001eR\u0013\u0010\u0011\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001eR\u0013\u0010\u0010\u001a\u00020\u000e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010 R\u0013\u0010\u0012\u001a\u00020\u000e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010 R\u0013\u0010\u000b\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001eR\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010%R\u0013\u0010\u0013\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\"¨\u0006R"}, d2 = {"Lcom/salesforce/marketingcloud/registration/Registration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "id", "", "signedString", "", "deviceId", "systemToken", lllqqql.cc006300630063cc, "appVersion", k.a.f, "", "locationEnabled", "proximityEnabled", "platformVersion", "pushEnabled", "timeZone", "contactKey", k.a.b, k.a.m, "appId", k.a.n, k.a.g, "", k.a.h, "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;)V", "()Ljava/lang/String;", "()Ljava/util/Map;", "()Z", "-id", "()I", "setId$sdk_release", "(I)V", "()Ljava/util/Set;", "-deprecated_appId", "-deprecated_appVersion", "-deprecated_attributes", "component1", "component1$sdk_release", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "-deprecated_contactKey", "copy", "-deprecated_deviceId", "equals", "other", "hashCode", "-deprecated_hwid", "-deprecated_locale", "-deprecated_locationEnabled", "-deprecated_platform", "-deprecated_platformVersion", "-deprecated_proximityEnabled", "-deprecated_pushEnabled", "-deprecated_sdkVersion", "-deprecated_signedString", "-deprecated_systemToken", "-deprecated_tags", "-deprecated_timeZone", "toJson", "toJson$sdk_release", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class Registration {

    @NotNull
    private final String appId;

    @NotNull
    private final String appVersion;

    @NotNull
    private final Map<String, String> attributes;

    @Nullable
    private final String contactKey;

    @NotNull
    private final String deviceId;
    private final boolean dst;

    @NotNull
    private final String hwid;
    private int id;

    @NotNull
    private final String locale;
    private final boolean locationEnabled;

    @NotNull
    private final String platform;

    @NotNull
    private final String platformVersion;
    private final boolean proximityEnabled;
    private final boolean pushEnabled;

    @NotNull
    private final String sdkVersion;

    @Nullable
    private final String signedString;

    @Nullable
    private final String systemToken;

    @NotNull
    private final Set<String> tags;
    private final int timeZone;

    public Registration(int i, @Nullable String str, @NotNull String deviceId, @Nullable String str2, @NotNull String sdkVersion, @NotNull String appVersion, boolean z, boolean z2, boolean z3, @NotNull String platformVersion, boolean z4, int i2, @Nullable String str3, @NotNull String platform, @NotNull String hwid, @NotNull String appId, @NotNull String locale, @NotNull Set<String> tags, @NotNull Map<String, String> attributes) {
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(sdkVersion, "sdkVersion");
        Intrinsics.h(appVersion, "appVersion");
        Intrinsics.h(platformVersion, "platformVersion");
        Intrinsics.h(platform, "platform");
        Intrinsics.h(hwid, "hwid");
        Intrinsics.h(appId, "appId");
        Intrinsics.h(locale, "locale");
        Intrinsics.h(tags, "tags");
        Intrinsics.h(attributes, "attributes");
        this.id = i;
        this.signedString = str;
        this.deviceId = deviceId;
        this.systemToken = str2;
        this.sdkVersion = sdkVersion;
        this.appVersion = appVersion;
        this.dst = z;
        this.locationEnabled = z2;
        this.proximityEnabled = z3;
        this.platformVersion = platformVersion;
        this.pushEnabled = z4;
        this.timeZone = i2;
        this.contactKey = str3;
        this.platform = platform;
        this.hwid = hwid;
        this.appId = appId;
        this.locale = locale;
        this.tags = tags;
        this.attributes = attributes;
    }

    public static /* synthetic */ Registration copy$default(Registration registration, int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, boolean z4, int i2, String str7, String str8, String str9, String str10, String str11, Set set, Map map, int i3, Object obj) {
        Map map2;
        Set set2;
        int i4 = (i3 & 1) != 0 ? registration.id : i;
        String str12 = (i3 & 2) != 0 ? registration.signedString : str;
        String str13 = (i3 & 4) != 0 ? registration.deviceId : str2;
        String str14 = (i3 & 8) != 0 ? registration.systemToken : str3;
        String str15 = (i3 & 16) != 0 ? registration.sdkVersion : str4;
        String str16 = (i3 & 32) != 0 ? registration.appVersion : str5;
        boolean z5 = (i3 & 64) != 0 ? registration.dst : z;
        boolean z6 = (i3 & 128) != 0 ? registration.locationEnabled : z2;
        boolean z7 = (i3 & 256) != 0 ? registration.proximityEnabled : z3;
        String str17 = (i3 & 512) != 0 ? registration.platformVersion : str6;
        boolean z8 = (i3 & 1024) != 0 ? registration.pushEnabled : z4;
        int i5 = (i3 & 2048) != 0 ? registration.timeZone : i2;
        String str18 = (i3 & 4096) != 0 ? registration.contactKey : str7;
        String str19 = (i3 & 8192) != 0 ? registration.platform : str8;
        int i6 = i4;
        String str20 = (i3 & 16384) != 0 ? registration.hwid : str9;
        String str21 = (i3 & 32768) != 0 ? registration.appId : str10;
        String str22 = (i3 & 65536) != 0 ? registration.locale : str11;
        Set set3 = (i3 & 131072) != 0 ? registration.tags : set;
        if ((i3 & 262144) != 0) {
            set2 = set3;
            map2 = registration.attributes;
        } else {
            map2 = map;
            set2 = set3;
        }
        return registration.copy(i6, str12, str13, str14, str15, str16, z5, z6, z7, str17, z8, i5, str18, str19, str20, str21, str22, set2, map2);
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_appId, reason: not valid java name and from getter */
    public final String getAppId() {
        return this.appId;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_appVersion, reason: not valid java name and from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_attributes, reason: not valid java name */
    public final Map<String, String> m242deprecated_attributes() {
        return this.attributes;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_contactKey, reason: not valid java name and from getter */
    public final String getContactKey() {
        return this.contactKey;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_deviceId, reason: not valid java name and from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_hwid, reason: not valid java name and from getter */
    public final String getHwid() {
        return this.hwid;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_locale, reason: not valid java name and from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_locationEnabled, reason: not valid java name and from getter */
    public final boolean getLocationEnabled() {
        return this.locationEnabled;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_platform, reason: not valid java name and from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_platformVersion, reason: not valid java name and from getter */
    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_proximityEnabled, reason: not valid java name and from getter */
    public final boolean getProximityEnabled() {
        return this.proximityEnabled;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_pushEnabled, reason: not valid java name and from getter */
    public final boolean getPushEnabled() {
        return this.pushEnabled;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_sdkVersion, reason: not valid java name and from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_signedString, reason: not valid java name and from getter */
    public final String getSignedString() {
        return this.signedString;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_systemToken, reason: not valid java name and from getter */
    public final String getSystemToken() {
        return this.systemToken;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_tags, reason: not valid java name */
    public final Set<String> m255deprecated_tags() {
        return this.tags;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_timeZone, reason: not valid java name and from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    @JvmName
    /* renamed from: -id, reason: not valid java name and from getter */
    public final int getId() {
        return this.id;
    }

    @JvmName
    @NotNull
    public final String appId() {
        return this.appId;
    }

    @JvmName
    @NotNull
    public final String appVersion() {
        return this.appVersion;
    }

    @JvmName
    @NotNull
    public final Map<String, String> attributes() {
        return this.attributes;
    }

    public final int component1$sdk_release() {
        return this.id;
    }

    @NotNull
    public final String component10() {
        return this.platformVersion;
    }

    public final boolean component11() {
        return this.pushEnabled;
    }

    public final int component12() {
        return this.timeZone;
    }

    @Nullable
    public final String component13() {
        return this.contactKey;
    }

    @NotNull
    public final String component14() {
        return this.platform;
    }

    @NotNull
    public final String component15() {
        return this.hwid;
    }

    @NotNull
    public final String component16() {
        return this.appId;
    }

    @NotNull
    public final String component17() {
        return this.locale;
    }

    @NotNull
    public final Set<String> component18() {
        return this.tags;
    }

    @NotNull
    public final Map<String, String> component19() {
        return this.attributes;
    }

    @Nullable
    public final String component2() {
        return this.signedString;
    }

    @NotNull
    public final String component3() {
        return this.deviceId;
    }

    @Nullable
    public final String component4() {
        return this.systemToken;
    }

    @NotNull
    public final String component5() {
        return this.sdkVersion;
    }

    @NotNull
    public final String component6() {
        return this.appVersion;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDst() {
        return this.dst;
    }

    public final boolean component8() {
        return this.locationEnabled;
    }

    public final boolean component9() {
        return this.proximityEnabled;
    }

    @JvmName
    @Nullable
    public final String contactKey() {
        return this.contactKey;
    }

    @NotNull
    public final Registration copy(int id, @Nullable String signedString, @NotNull String deviceId, @Nullable String systemToken, @NotNull String sdkVersion, @NotNull String appVersion, boolean dst, boolean locationEnabled, boolean proximityEnabled, @NotNull String platformVersion, boolean pushEnabled, int timeZone, @Nullable String contactKey, @NotNull String platform, @NotNull String hwid, @NotNull String appId, @NotNull String locale, @NotNull Set<String> tags, @NotNull Map<String, String> attributes) {
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(sdkVersion, "sdkVersion");
        Intrinsics.h(appVersion, "appVersion");
        Intrinsics.h(platformVersion, "platformVersion");
        Intrinsics.h(platform, "platform");
        Intrinsics.h(hwid, "hwid");
        Intrinsics.h(appId, "appId");
        Intrinsics.h(locale, "locale");
        Intrinsics.h(tags, "tags");
        Intrinsics.h(attributes, "attributes");
        return new Registration(id, signedString, deviceId, systemToken, sdkVersion, appVersion, dst, locationEnabled, proximityEnabled, platformVersion, pushEnabled, timeZone, contactKey, platform, hwid, appId, locale, tags, attributes);
    }

    @JvmName
    @NotNull
    public final String deviceId() {
        return this.deviceId;
    }

    @JvmName
    public final boolean dst() {
        return this.dst;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Registration)) {
            return false;
        }
        Registration registration = (Registration) other;
        return this.id == registration.id && Intrinsics.c(this.signedString, registration.signedString) && Intrinsics.c(this.deviceId, registration.deviceId) && Intrinsics.c(this.systemToken, registration.systemToken) && Intrinsics.c(this.sdkVersion, registration.sdkVersion) && Intrinsics.c(this.appVersion, registration.appVersion) && this.dst == registration.dst && this.locationEnabled == registration.locationEnabled && this.proximityEnabled == registration.proximityEnabled && Intrinsics.c(this.platformVersion, registration.platformVersion) && this.pushEnabled == registration.pushEnabled && this.timeZone == registration.timeZone && Intrinsics.c(this.contactKey, registration.contactKey) && Intrinsics.c(this.platform, registration.platform) && Intrinsics.c(this.hwid, registration.hwid) && Intrinsics.c(this.appId, registration.appId) && Intrinsics.c(this.locale, registration.locale) && Intrinsics.c(this.tags, registration.tags) && Intrinsics.c(this.attributes, registration.attributes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.signedString;
        int iC = androidx.camera.core.impl.b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.deviceId);
        String str2 = this.systemToken;
        int iC2 = androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.sdkVersion), 31, this.appVersion);
        boolean z = this.dst;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iC2 + i) * 31;
        boolean z2 = this.locationEnabled;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.proximityEnabled;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int iC3 = androidx.camera.core.impl.b.c((i4 + i5) * 31, 31, this.platformVersion);
        boolean z4 = this.pushEnabled;
        int iA = androidx.camera.core.impl.b.a(this.timeZone, (iC3 + (z4 ? 1 : z4 ? 1 : 0)) * 31, 31);
        String str3 = this.contactKey;
        return this.attributes.hashCode() + ((this.tags.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c((iA + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.platform), 31, this.hwid), 31, this.appId), 31, this.locale)) * 31);
    }

    @JvmName
    @NotNull
    public final String hwid() {
        return this.hwid;
    }

    @JvmName
    @NotNull
    public final String locale() {
        return this.locale;
    }

    @JvmName
    public final boolean locationEnabled() {
        return this.locationEnabled;
    }

    @JvmName
    @NotNull
    public final String platform() {
        return this.platform;
    }

    @JvmName
    @NotNull
    public final String platformVersion() {
        return this.platformVersion;
    }

    @JvmName
    public final boolean proximityEnabled() {
        return this.proximityEnabled;
    }

    @JvmName
    public final boolean pushEnabled() {
        return this.pushEnabled;
    }

    @JvmName
    @NotNull
    public final String sdkVersion() {
        return this.sdkVersion;
    }

    public final void setId$sdk_release(int i) {
        this.id = i;
    }

    @JvmName
    @Nullable
    public final String signedString() {
        return this.signedString;
    }

    @JvmName
    @Nullable
    public final String systemToken() {
        return this.systemToken;
    }

    @JvmName
    @NotNull
    public final Set<String> tags() {
        return this.tags;
    }

    @JvmName
    public final int timeZone() {
        return this.timeZone;
    }

    @NotNull
    public final JSONObject toJson$sdk_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("signedString", this.signedString);
        jSONObject.put("deviceID", this.deviceId);
        String str = this.systemToken;
        if (str != null) {
            jSONObject.put("device_Token", str);
        }
        jSONObject.put("sdk_Version", this.sdkVersion);
        jSONObject.put("app_Version", this.appVersion);
        jSONObject.put("dST", this.dst);
        jSONObject.put("location_Enabled", this.locationEnabled);
        jSONObject.put("proximity_Enabled", this.proximityEnabled);
        jSONObject.put("platform_Version", this.platformVersion);
        jSONObject.put("push_Enabled", this.pushEnabled);
        jSONObject.put("timeZone", String.valueOf(this.timeZone));
        String str2 = this.contactKey;
        if (str2 != null) {
            jSONObject.put("subscriberKey", str2);
        }
        jSONObject.put(k.a.b, this.platform);
        jSONObject.put(k.a.m, this.hwid);
        jSONObject.put("etAppId", this.appId);
        jSONObject.put(k.a.n, this.locale);
        jSONObject.put(k.a.g, new JSONArray((Collection) new TreeSet(this.tags)));
        Map<String, String> map = this.attributes;
        Intrinsics.h(map, "<this>");
        jSONObject.put(k.a.h, m.a(new TreeMap(map)));
        return jSONObject;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.signedString;
        String str2 = this.deviceId;
        String str3 = this.systemToken;
        String str4 = this.sdkVersion;
        String str5 = this.appVersion;
        boolean z = this.dst;
        boolean z2 = this.locationEnabled;
        boolean z3 = this.proximityEnabled;
        String str6 = this.platformVersion;
        boolean z4 = this.pushEnabled;
        int i2 = this.timeZone;
        String str7 = this.contactKey;
        String str8 = this.platform;
        String str9 = this.hwid;
        String str10 = this.appId;
        String str11 = this.locale;
        Set<String> set = this.tags;
        Map<String, String> map = this.attributes;
        StringBuilder sbP = androidx.constraintlayout.core.state.a.p("Registration(id=", i, ", signedString=", str, ", deviceId=");
        androidx.constraintlayout.core.state.a.B(sbP, str2, ", systemToken=", str3, ", sdkVersion=");
        androidx.constraintlayout.core.state.a.B(sbP, str4, ", appVersion=", str5, ", dst=");
        au.com.woolworths.android.onesite.a.D(sbP, z, ", locationEnabled=", z2, ", proximityEnabled=");
        au.com.woolworths.android.onesite.a.y(", platformVersion=", str6, ", pushEnabled=", sbP, z3);
        sbP.append(z4);
        sbP.append(", timeZone=");
        sbP.append(i2);
        sbP.append(", contactKey=");
        androidx.constraintlayout.core.state.a.B(sbP, str7, ", platform=", str8, ", hwid=");
        androidx.constraintlayout.core.state.a.B(sbP, str9, ", appId=", str10, ", locale=");
        sbP.append(str11);
        sbP.append(", tags=");
        sbP.append(set);
        sbP.append(", attributes=");
        sbP.append(map);
        sbP.append(")");
        return sbP.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ Registration(int r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, boolean r31, java.lang.String r32, boolean r33, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.util.Set r40, java.util.Map r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r22 = this;
            r0 = r42
            r1 = r0 & 1
            if (r1 == 0) goto L9
            r1 = 0
            r3 = r1
            goto Lb
        L9:
            r3 = r23
        Lb:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L12
            r6 = r2
            goto L14
        L12:
            r6 = r26
        L14:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L3c
            r15 = r2
            r4 = r24
            r5 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r20 = r40
            r21 = r41
            r2 = r22
            goto L60
        L3c:
            r15 = r35
            r2 = r22
            r4 = r24
            r5 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r20 = r40
            r21 = r41
        L60:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.registration.Registration.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Set, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public Registration(@NotNull JSONObject json) throws JSONException, NumberFormatException {
        String str;
        Object objValueOf;
        String string;
        Intrinsics.h(json, "json");
        String strOptString = json.optString("signedString");
        Intrinsics.g(strOptString, "optString(...)");
        String strB = m.b(strOptString);
        String string2 = json.getString("deviceID");
        Intrinsics.g(string2, "getString(...)");
        String strOptString2 = json.optString("device_Token");
        Intrinsics.g(strOptString2, "optString(...)");
        String strB2 = m.b(strOptString2);
        String string3 = json.getString("sdk_Version");
        Intrinsics.g(string3, "getString(...)");
        String string4 = json.getString("app_Version");
        Intrinsics.g(string4, "getString(...)");
        boolean z = json.getBoolean("dST");
        boolean z2 = json.getBoolean("location_Enabled");
        boolean z3 = json.getBoolean("proximity_Enabled");
        String string5 = json.getString("platform_Version");
        Intrinsics.g(string5, "getString(...)");
        boolean z4 = json.getBoolean("push_Enabled");
        String string6 = json.getString("timeZone");
        Intrinsics.g(string6, "getString(...)");
        int i = Integer.parseInt(string6);
        String strI = com.google.android.gms.common.api.internal.a.i(json, "subscriberKey", "optString(...)");
        String string7 = json.getString(k.a.b);
        Intrinsics.g(string7, "getString(...)");
        String string8 = json.getString(k.a.m);
        Intrinsics.g(string8, "getString(...)");
        String string9 = json.getString("etAppId");
        Intrinsics.g(string9, "getString(...)");
        String string10 = json.getString(k.a.n);
        Intrinsics.g(string10, "getString(...)");
        JSONArray jSONArray = json.getJSONArray(k.a.g);
        Intrinsics.g(jSONArray, "getJSONArray(...)");
        IntRange intRangeO = RangesKt.o(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeO, 10));
        IntProgressionIterator it = intRangeO.iterator();
        while (it.f) {
            int iNextInt = it.nextInt();
            IntProgressionIterator intProgressionIterator = it;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            String str2 = string2;
            String str3 = strB2;
            KClass kClassB = reflectionFactory.b(String.class);
            String str4 = string3;
            if (kClassB.equals(reflectionFactory.b(JSONObject.class))) {
                objValueOf = jSONArray.getJSONObject(iNextInt);
                if (objValueOf == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = string4;
            } else {
                str = string4;
                if (kClassB.equals(reflectionFactory.b(Integer.TYPE))) {
                    objValueOf = Integer.valueOf(jSONArray.getInt(iNextInt));
                } else if (kClassB.equals(reflectionFactory.b(Double.TYPE))) {
                    objValueOf = Double.valueOf(jSONArray.getDouble(iNextInt));
                } else if (kClassB.equals(reflectionFactory.b(Long.TYPE))) {
                    objValueOf = Long.valueOf(jSONArray.getLong(iNextInt));
                } else if (kClassB.equals(reflectionFactory.b(Boolean.TYPE))) {
                    objValueOf = Boolean.valueOf(jSONArray.getBoolean(iNextInt));
                } else if (kClassB.equals(reflectionFactory.b(String.class))) {
                    string = jSONArray.getString(iNextInt);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    arrayList.add(string);
                    it = intProgressionIterator;
                    string2 = str2;
                    strB2 = str3;
                    string3 = str4;
                    string4 = str;
                } else {
                    objValueOf = jSONArray.get(iNextInt);
                    if (objValueOf == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            }
            string = (String) objValueOf;
            arrayList.add(string);
            it = intProgressionIterator;
            string2 = str2;
            strB2 = str3;
            string3 = str4;
            string4 = str;
        }
        String str5 = string2;
        String str6 = strB2;
        String str7 = string3;
        String str8 = string4;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!TextUtils.isEmpty((String) next)) {
                arrayList2.add(next);
            }
        }
        Set setL0 = CollectionsKt.L0(arrayList2);
        JSONArray jSONArray2 = json.getJSONArray(k.a.h);
        Intrinsics.g(jSONArray2, "getJSONArray(...)");
        this(0, strB, str5, str6, str7, str8, z, z2, z3, string5, z4, i, strI, string7, string8, string9, string10, setL0, m.b(jSONArray2));
    }
}
