package com.salesforce.marketingcloud;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.salesforce.marketingcloud.notifications.NotificationCustomizationOptions;
import com.salesforce.marketingcloud.proximity.ProximityNotificationCustomizationOptions;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleConfig;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MCKeep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002YZB§\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0002\u0010\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b!J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0000H\u0001¢\u0006\u0002\b$J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b%J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u0012HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000e\u0010.\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b/J\u000e\u00100\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b1J\u000e\u00102\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b3J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003JÏ\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001J\r\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0002\b=J\u0013\u0010>\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010?HÖ\u0003J\r\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0002\b@J\t\u0010A\u001a\u00020BHÖ\u0001J\r\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0002\bCJ \u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0016J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bLJ\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\bMJ\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bNJ\r\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\bOJ\r\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0002\bPJ\r\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0002\bQJ\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\bRJ\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bSJ\u0006\u0010T\u001a\u00020UJ\t\u0010V\u001a\u00020\u0003HÖ\u0001J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\bWJ\r\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0002\bXR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001bR\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001cR\u0016\u0010\u0017\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001bR\u0016\u0010\u0018\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001bR\u0013\u0010\u000f\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001cR\u0013\u0010\n\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001cR\u0013\u0010\u000b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0013\u0010\u000e\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u0011\u001a\u00020\u00128\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001dR\u0013\u0010\f\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u0016\u0010\u0019\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001bR\u0013\u0010\r\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001bR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001fR\u0013\u0010\u0010\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001c¨\u0006["}, d2 = {"Lcom/salesforce/marketingcloud/MarketingCloudConfig;", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModuleConfig;", "applicationId", "", "accessToken", "senderId", "marketingCloudServerUrl", "mid", "analyticsEnabled", "", "geofencingEnabled", "inboxEnabled", "piAnalyticsEnabled", "proximityEnabled", "markMessageReadOnInboxNotificationOpen", "delayRegistrationUntilContactKeyIsSet", "useLegacyPiIdentifier", "notificationCustomizationOptions", "Lcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;", "proximityNotificationCustomizationOptions", "Lcom/salesforce/marketingcloud/proximity/ProximityNotificationCustomizationOptions;", "urlHandler", "Lcom/salesforce/marketingcloud/UrlHandler;", "appPackageName", "appVersionName", "predictiveIntelligenceServerUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;Lcom/salesforce/marketingcloud/proximity/ProximityNotificationCustomizationOptions;Lcom/salesforce/marketingcloud/UrlHandler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "()Z", "()Lcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;", "()Lcom/salesforce/marketingcloud/proximity/ProximityNotificationCustomizationOptions;", "()Lcom/salesforce/marketingcloud/UrlHandler;", "-deprecated_accessToken", "-deprecated_analyticsEnabled", "applicationChanged", "other", "-applicationChanged", "-deprecated_applicationId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component17$sdk_release", "component18", "component18$sdk_release", "component19", "component19$sdk_release", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "-deprecated_delayRegistrationUntilContactKeyIsSet", "equals", "", "-deprecated_geofencingEnabled", "hashCode", "", "-deprecated_inboxEnabled", "init", "", "context", "Landroid/content/Context;", "components", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkComponents;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleReadyListener;", "-deprecated_markMessageReadOnInboxNotificationOpen", "-deprecated_marketingCloudServerUrl", "-deprecated_mid", "-deprecated_notificationCustomizationOptions", "-deprecated_piAnalyticsEnabled", "-deprecated_proximityEnabled", "-deprecated_proximityNotificationCustomizationOptions", "-deprecated_senderId", "toBuilder", "Lcom/salesforce/marketingcloud/MarketingCloudConfig$Builder;", "toString", "-deprecated_urlHandler", "-deprecated_useLegacyPiIdentifier", "Builder", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MarketingCloudConfig extends PushModuleConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = g.a("MarketingCloudConfig");

    @NotNull
    private final String accessToken;
    private final boolean analyticsEnabled;

    @NotNull
    private final String appPackageName;

    @NotNull
    private final String appVersionName;

    @NotNull
    private final String applicationId;
    private final boolean delayRegistrationUntilContactKeyIsSet;
    private final boolean geofencingEnabled;
    private final boolean inboxEnabled;
    private final boolean markMessageReadOnInboxNotificationOpen;

    @NotNull
    private final String marketingCloudServerUrl;

    @Nullable
    private final String mid;

    @NotNull
    private final NotificationCustomizationOptions notificationCustomizationOptions;
    private final boolean piAnalyticsEnabled;

    @NotNull
    private final String predictiveIntelligenceServerUrl;
    private final boolean proximityEnabled;

    @Nullable
    private final ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions;

    @Nullable
    private final String senderId;

    @Nullable
    private final UrlHandler urlHandler;
    private final boolean useLegacyPiIdentifier;

    @MCKeep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001CB\t\b\u0010¢\u0006\u0004\b>\u0010?B\u0011\b\u0010\u0012\u0006\u0010@\u001a\u000201¢\u0006\u0004\b>\u0010AJ#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0082\bJ!\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0082\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0012J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020#J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0012J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0012J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0012J\u0017\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0002H\u0007¢\u0006\u0004\b,\u0010-J\u000e\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00103R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00103R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00103R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00103R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00104R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00104R\u0016\u0010\u0019\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00104R\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00104R\u0016\u00106\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00104R\u0018\u00108\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010<R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00103¨\u0006D"}, d2 = {"Lcom/salesforce/marketingcloud/MarketingCloudConfig$Builder;", "", "", "value", "Lkotlin/Function0;", "lazyMessage", "checkNotEmpty", "checkNotNullOrEmpty", "applicationId", "setApplicationId", "accessToken", "setAccessToken", "senderId", "setSenderId", "marketingCloudServerUrl", "setMarketingCloudServerUrl", "mid", "setMid", "", "analyticsEnabled", "setAnalyticsEnabled", "geofenceEnabled", "setGeofencingEnabled", "inboxEnabled", "setInboxEnabled", "piAnalyticsEnabled", "setPiAnalyticsEnabled", "proximityEnabled", "setProximityEnabled", "Lcom/salesforce/marketingcloud/proximity/ProximityNotificationCustomizationOptions;", "options", "setProximityNotificationOptions", "Lcom/salesforce/marketingcloud/UrlHandler;", "urlHandler", "setUrlHandler", "Lcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;", "setNotificationCustomizationOptions", "useLegacyPiIdentifier", "setUseLegacyPiIdentifier", "markRead", "setMarkMessageReadOnInboxNotificationOpen", "delay", "setDelayRegistrationUntilContactKeyIsSet", "url", "-setPredictiveIntelligenceServerUrl", "(Ljava/lang/String;)Lcom/salesforce/marketingcloud/MarketingCloudConfig$Builder;", "setPredictiveIntelligenceServerUrl", "Landroid/content/Context;", "context", "Lcom/salesforce/marketingcloud/MarketingCloudConfig;", "build", "Ljava/lang/String;", "Z", "geofencingEnabled", "markMessageReadOnInboxNotificationOpen", "delayRegistrationUntilContactKeyIsSet", "notificationCustomizationOptions", "Lcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;", "proximityNotificationCustomizationOptions", "Lcom/salesforce/marketingcloud/proximity/ProximityNotificationCustomizationOptions;", "Lcom/salesforce/marketingcloud/UrlHandler;", "predictiveIntelligenceServerUrl", "<init>", "()V", MlModel.MODEL_FILE_SUFFIX, "(Lcom/salesforce/marketingcloud/MarketingCloudConfig;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class Builder {
        private static final int ACCESS_TOKEN_LENGTH = 24;

        @NotNull
        private static final String INITIAL_PI_VALUE = "";

        @NotNull
        private static final String TSE_ERROR_MSG = "An App Endpoint (the Marketing Cloud Server URL) is required in order to configure the SDK. See http://salesforce-marketingcloud.github.io/MarketingCloudSDK-Android for more information.";

        @Nullable
        private String accessToken;
        private boolean analyticsEnabled;

        @Nullable
        private String applicationId;
        private boolean delayRegistrationUntilContactKeyIsSet;
        private boolean geofencingEnabled;
        private boolean inboxEnabled;
        private boolean markMessageReadOnInboxNotificationOpen;

        @Nullable
        private String marketingCloudServerUrl;

        @Nullable
        private String mid;

        @Nullable
        private NotificationCustomizationOptions notificationCustomizationOptions;
        private boolean piAnalyticsEnabled;

        @NotNull
        private String predictiveIntelligenceServerUrl;
        private boolean proximityEnabled;

        @Nullable
        private ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions;

        @Nullable
        private String senderId;

        @Nullable
        private UrlHandler urlHandler;
        private boolean useLegacyPiIdentifier;

        @NotNull
        private static final Regex APP_ID_REGEX = new Regex("[0-9a-f]{8}-[a-f0-9]{4}-4[a-f0-9]{3}-[89aAbB][a-f0-9]{3}-[a-f0-9]{12}");

        public Builder() {
            this.markMessageReadOnInboxNotificationOpen = true;
            this.useLegacyPiIdentifier = true;
            this.predictiveIntelligenceServerUrl = "";
        }

        private final String checkNotEmpty(String value, Function0<? extends Object> lazyMessage) {
            if (value == null || TextUtils.getTrimmedLength(value) != 0) {
                return value;
            }
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }

        private final String checkNotNullOrEmpty(String value, Function0<? extends Object> lazyMessage) {
            if (value == null || TextUtils.getTrimmedLength(value) == 0) {
                throw new IllegalStateException(lazyMessage.invoke().toString());
            }
            return value;
        }

        @RestrictTo
        @JvmName
        @NotNull
        /* renamed from: -setPredictiveIntelligenceServerUrl, reason: not valid java name */
        public final Builder m83setPredictiveIntelligenceServerUrl(@NotNull String url) {
            Intrinsics.h(url, "url");
            this.predictiveIntelligenceServerUrl = url;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.salesforce.marketingcloud.MarketingCloudConfig build(@org.jetbrains.annotations.NotNull android.content.Context r24) {
            /*
                Method dump skipped, instructions count: 285
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.MarketingCloudConfig.Builder.build(android.content.Context):com.salesforce.marketingcloud.MarketingCloudConfig");
        }

        @NotNull
        public final Builder setAccessToken(@NotNull String accessToken) {
            Intrinsics.h(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        @NotNull
        public final Builder setAnalyticsEnabled(boolean analyticsEnabled) {
            this.analyticsEnabled = analyticsEnabled;
            return this;
        }

        @NotNull
        public final Builder setApplicationId(@NotNull String applicationId) {
            Intrinsics.h(applicationId, "applicationId");
            this.applicationId = applicationId;
            return this;
        }

        @NotNull
        public final Builder setDelayRegistrationUntilContactKeyIsSet(boolean delay) {
            this.delayRegistrationUntilContactKeyIsSet = delay;
            return this;
        }

        @NotNull
        public final Builder setGeofencingEnabled(boolean geofenceEnabled) {
            this.geofencingEnabled = geofenceEnabled;
            return this;
        }

        @NotNull
        public final Builder setInboxEnabled(boolean inboxEnabled) {
            this.inboxEnabled = inboxEnabled;
            return this;
        }

        @NotNull
        public final Builder setMarkMessageReadOnInboxNotificationOpen(boolean markRead) {
            this.markMessageReadOnInboxNotificationOpen = markRead;
            return this;
        }

        @NotNull
        public final Builder setMarketingCloudServerUrl(@NotNull String marketingCloudServerUrl) {
            Intrinsics.h(marketingCloudServerUrl, "marketingCloudServerUrl");
            this.marketingCloudServerUrl = marketingCloudServerUrl;
            return this;
        }

        @NotNull
        public final Builder setMid(@NotNull String mid) {
            Intrinsics.h(mid, "mid");
            this.mid = mid;
            return this;
        }

        @NotNull
        public final Builder setNotificationCustomizationOptions(@NotNull NotificationCustomizationOptions options) {
            Intrinsics.h(options, "options");
            this.notificationCustomizationOptions = options;
            return this;
        }

        @NotNull
        public final Builder setPiAnalyticsEnabled(boolean piAnalyticsEnabled) {
            this.piAnalyticsEnabled = piAnalyticsEnabled;
            return this;
        }

        @NotNull
        public final Builder setProximityEnabled(boolean proximityEnabled) {
            this.proximityEnabled = proximityEnabled;
            return this;
        }

        @NotNull
        public final Builder setProximityNotificationOptions(@NotNull ProximityNotificationCustomizationOptions options) {
            Intrinsics.h(options, "options");
            this.proximityNotificationCustomizationOptions = options;
            return this;
        }

        @NotNull
        public final Builder setSenderId(@NotNull String senderId) {
            Intrinsics.h(senderId, "senderId");
            this.senderId = senderId;
            return this;
        }

        @NotNull
        public final Builder setUrlHandler(@NotNull UrlHandler urlHandler) {
            Intrinsics.h(urlHandler, "urlHandler");
            this.urlHandler = urlHandler;
            return this;
        }

        @NotNull
        public final Builder setUseLegacyPiIdentifier(boolean useLegacyPiIdentifier) {
            this.useLegacyPiIdentifier = useLegacyPiIdentifier;
            return this;
        }

        public Builder(@NotNull MarketingCloudConfig config) {
            Intrinsics.h(config, "config");
            this.markMessageReadOnInboxNotificationOpen = true;
            this.useLegacyPiIdentifier = true;
            this.applicationId = config.applicationId();
            this.accessToken = config.accessToken();
            this.senderId = config.senderId();
            this.marketingCloudServerUrl = config.marketingCloudServerUrl();
            this.mid = config.mid();
            this.analyticsEnabled = config.analyticsEnabled();
            this.geofencingEnabled = config.geofencingEnabled();
            this.inboxEnabled = config.inboxEnabled();
            this.piAnalyticsEnabled = config.piAnalyticsEnabled();
            this.proximityEnabled = config.proximityEnabled();
            this.markMessageReadOnInboxNotificationOpen = config.markMessageReadOnInboxNotificationOpen();
            this.delayRegistrationUntilContactKeyIsSet = config.delayRegistrationUntilContactKeyIsSet();
            this.useLegacyPiIdentifier = config.useLegacyPiIdentifier();
            this.notificationCustomizationOptions = config.notificationCustomizationOptions();
            this.proximityNotificationCustomizationOptions = config.proximityNotificationCustomizationOptions();
            this.urlHandler = config.urlHandler();
            this.predictiveIntelligenceServerUrl = config.predictiveIntelligenceServerUrl();
        }
    }

    @MCKeep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/salesforce/marketingcloud/MarketingCloudConfig$Companion;", "", "()V", "TAG", "", "builder", "Lcom/salesforce/marketingcloud/MarketingCloudConfig$Builder;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class a extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InitializationStatus f16827a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InitializationStatus initializationStatus) {
            super(0);
            this.f16827a = initializationStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "InitializationStatus: " + this.f16827a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingCloudConfig(@NotNull String applicationId, @NotNull String accessToken, @Nullable String str, @NotNull String marketingCloudServerUrl, @Nullable String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @NotNull NotificationCustomizationOptions notificationCustomizationOptions, @Nullable ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions, @Nullable UrlHandler urlHandler, @NotNull String appPackageName, @NotNull String appVersionName, @NotNull String predictiveIntelligenceServerUrl) {
        super(applicationId);
        Intrinsics.h(applicationId, "applicationId");
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(marketingCloudServerUrl, "marketingCloudServerUrl");
        Intrinsics.h(notificationCustomizationOptions, "notificationCustomizationOptions");
        Intrinsics.h(appPackageName, "appPackageName");
        Intrinsics.h(appVersionName, "appVersionName");
        Intrinsics.h(predictiveIntelligenceServerUrl, "predictiveIntelligenceServerUrl");
        this.applicationId = applicationId;
        this.accessToken = accessToken;
        this.senderId = str;
        this.marketingCloudServerUrl = marketingCloudServerUrl;
        this.mid = str2;
        this.analyticsEnabled = z;
        this.geofencingEnabled = z2;
        this.inboxEnabled = z3;
        this.piAnalyticsEnabled = z4;
        this.proximityEnabled = z5;
        this.markMessageReadOnInboxNotificationOpen = z6;
        this.delayRegistrationUntilContactKeyIsSet = z7;
        this.useLegacyPiIdentifier = z8;
        this.notificationCustomizationOptions = notificationCustomizationOptions;
        this.proximityNotificationCustomizationOptions = proximityNotificationCustomizationOptions;
        this.urlHandler = urlHandler;
        this.appPackageName = appPackageName;
        this.appVersionName = appVersionName;
        this.predictiveIntelligenceServerUrl = predictiveIntelligenceServerUrl;
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ MarketingCloudConfig copy$default(MarketingCloudConfig marketingCloudConfig, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, NotificationCustomizationOptions notificationCustomizationOptions, ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions, UrlHandler urlHandler, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11 = (i & 1) != 0 ? marketingCloudConfig.applicationId : str;
        String str12 = (i & 2) != 0 ? marketingCloudConfig.accessToken : str2;
        String str13 = (i & 4) != 0 ? marketingCloudConfig.senderId : str3;
        String str14 = (i & 8) != 0 ? marketingCloudConfig.marketingCloudServerUrl : str4;
        String str15 = (i & 16) != 0 ? marketingCloudConfig.mid : str5;
        boolean z9 = (i & 32) != 0 ? marketingCloudConfig.analyticsEnabled : z;
        boolean z10 = (i & 64) != 0 ? marketingCloudConfig.geofencingEnabled : z2;
        boolean z11 = (i & 128) != 0 ? marketingCloudConfig.inboxEnabled : z3;
        boolean z12 = (i & 256) != 0 ? marketingCloudConfig.piAnalyticsEnabled : z4;
        boolean z13 = (i & 512) != 0 ? marketingCloudConfig.proximityEnabled : z5;
        boolean z14 = (i & 1024) != 0 ? marketingCloudConfig.markMessageReadOnInboxNotificationOpen : z6;
        boolean z15 = (i & 2048) != 0 ? marketingCloudConfig.delayRegistrationUntilContactKeyIsSet : z7;
        boolean z16 = (i & 4096) != 0 ? marketingCloudConfig.useLegacyPiIdentifier : z8;
        NotificationCustomizationOptions notificationCustomizationOptions2 = (i & 8192) != 0 ? marketingCloudConfig.notificationCustomizationOptions : notificationCustomizationOptions;
        String str16 = str11;
        ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions2 = (i & 16384) != 0 ? marketingCloudConfig.proximityNotificationCustomizationOptions : proximityNotificationCustomizationOptions;
        UrlHandler urlHandler2 = (i & 32768) != 0 ? marketingCloudConfig.urlHandler : urlHandler;
        String str17 = (i & 65536) != 0 ? marketingCloudConfig.appPackageName : str6;
        String str18 = (i & 131072) != 0 ? marketingCloudConfig.appVersionName : str7;
        if ((i & 262144) != 0) {
            str10 = str18;
            str9 = marketingCloudConfig.predictiveIntelligenceServerUrl;
        } else {
            str9 = str8;
            str10 = str18;
        }
        return marketingCloudConfig.copy(str16, str12, str13, str14, str15, z9, z10, z11, z12, z13, z14, z15, z16, notificationCustomizationOptions2, proximityNotificationCustomizationOptions2, urlHandler2, str17, str10, str9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(ModuleReadyListener listener, InitializationStatus it) {
        Intrinsics.h(listener, "$listener");
        Intrinsics.h(it, "it");
        g.e(g.f16896a, TAG, null, new a(it), 2, null);
        MarketingCloudSdk.requestSdk(new l(listener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1$lambda$0(ModuleReadyListener listener, MarketingCloudSdk sdk) {
        Intrinsics.h(listener, "$listener");
        Intrinsics.h(sdk, "sdk");
        listener.ready(sdk);
    }

    @JvmName
    /* renamed from: -applicationChanged, reason: not valid java name */
    public final boolean m66applicationChanged(@NotNull MarketingCloudConfig other) {
        Intrinsics.h(other, "other");
        return (Intrinsics.c(this.applicationId, other.applicationId) && Intrinsics.c(this.accessToken, other.accessToken)) ? false : true;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_accessToken, reason: not valid java name and from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_analyticsEnabled, reason: not valid java name and from getter */
    public final boolean getAnalyticsEnabled() {
        return this.analyticsEnabled;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_applicationId, reason: not valid java name and from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_delayRegistrationUntilContactKeyIsSet, reason: not valid java name and from getter */
    public final boolean getDelayRegistrationUntilContactKeyIsSet() {
        return this.delayRegistrationUntilContactKeyIsSet;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_geofencingEnabled, reason: not valid java name and from getter */
    public final boolean getGeofencingEnabled() {
        return this.geofencingEnabled;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_inboxEnabled, reason: not valid java name and from getter */
    public final boolean getInboxEnabled() {
        return this.inboxEnabled;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_markMessageReadOnInboxNotificationOpen, reason: not valid java name and from getter */
    public final boolean getMarkMessageReadOnInboxNotificationOpen() {
        return this.markMessageReadOnInboxNotificationOpen;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_marketingCloudServerUrl, reason: not valid java name and from getter */
    public final String getMarketingCloudServerUrl() {
        return this.marketingCloudServerUrl;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_mid, reason: not valid java name and from getter */
    public final String getMid() {
        return this.mid;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_notificationCustomizationOptions, reason: not valid java name and from getter */
    public final NotificationCustomizationOptions getNotificationCustomizationOptions() {
        return this.notificationCustomizationOptions;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_piAnalyticsEnabled, reason: not valid java name and from getter */
    public final boolean getPiAnalyticsEnabled() {
        return this.piAnalyticsEnabled;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_proximityEnabled, reason: not valid java name and from getter */
    public final boolean getProximityEnabled() {
        return this.proximityEnabled;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_proximityNotificationCustomizationOptions, reason: not valid java name and from getter */
    public final ProximityNotificationCustomizationOptions getProximityNotificationCustomizationOptions() {
        return this.proximityNotificationCustomizationOptions;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_senderId, reason: not valid java name and from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_urlHandler, reason: not valid java name and from getter */
    public final UrlHandler getUrlHandler() {
        return this.urlHandler;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_useLegacyPiIdentifier, reason: not valid java name and from getter */
    public final boolean getUseLegacyPiIdentifier() {
        return this.useLegacyPiIdentifier;
    }

    @JvmName
    @NotNull
    public final String accessToken() {
        return this.accessToken;
    }

    @JvmName
    public final boolean analyticsEnabled() {
        return this.analyticsEnabled;
    }

    @JvmName
    @NotNull
    /* renamed from: appPackageName, reason: from getter */
    public final String getAppPackageName() {
        return this.appPackageName;
    }

    @JvmName
    @NotNull
    /* renamed from: appVersionName, reason: from getter */
    public final String getAppVersionName() {
        return this.appVersionName;
    }

    @JvmName
    @NotNull
    public final String applicationId() {
        return this.applicationId;
    }

    @NotNull
    public final String component1() {
        return this.applicationId;
    }

    public final boolean component10() {
        return this.proximityEnabled;
    }

    public final boolean component11() {
        return this.markMessageReadOnInboxNotificationOpen;
    }

    public final boolean component12() {
        return this.delayRegistrationUntilContactKeyIsSet;
    }

    public final boolean component13() {
        return this.useLegacyPiIdentifier;
    }

    @NotNull
    public final NotificationCustomizationOptions component14() {
        return this.notificationCustomizationOptions;
    }

    @Nullable
    public final ProximityNotificationCustomizationOptions component15() {
        return this.proximityNotificationCustomizationOptions;
    }

    @Nullable
    public final UrlHandler component16() {
        return this.urlHandler;
    }

    @NotNull
    public final String component17$sdk_release() {
        return this.appPackageName;
    }

    @NotNull
    public final String component18$sdk_release() {
        return this.appVersionName;
    }

    @NotNull
    /* renamed from: component19$sdk_release, reason: from getter */
    public final String getPredictiveIntelligenceServerUrl() {
        return this.predictiveIntelligenceServerUrl;
    }

    @NotNull
    public final String component2() {
        return this.accessToken;
    }

    @Nullable
    public final String component3() {
        return this.senderId;
    }

    @NotNull
    public final String component4() {
        return this.marketingCloudServerUrl;
    }

    @Nullable
    public final String component5() {
        return this.mid;
    }

    public final boolean component6() {
        return this.analyticsEnabled;
    }

    public final boolean component7() {
        return this.geofencingEnabled;
    }

    public final boolean component8() {
        return this.inboxEnabled;
    }

    public final boolean component9() {
        return this.piAnalyticsEnabled;
    }

    @NotNull
    public final MarketingCloudConfig copy(@NotNull String applicationId, @NotNull String accessToken, @Nullable String senderId, @NotNull String marketingCloudServerUrl, @Nullable String mid, boolean analyticsEnabled, boolean geofencingEnabled, boolean inboxEnabled, boolean piAnalyticsEnabled, boolean proximityEnabled, boolean markMessageReadOnInboxNotificationOpen, boolean delayRegistrationUntilContactKeyIsSet, boolean useLegacyPiIdentifier, @NotNull NotificationCustomizationOptions notificationCustomizationOptions, @Nullable ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions, @Nullable UrlHandler urlHandler, @NotNull String appPackageName, @NotNull String appVersionName, @NotNull String predictiveIntelligenceServerUrl) {
        Intrinsics.h(applicationId, "applicationId");
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(marketingCloudServerUrl, "marketingCloudServerUrl");
        Intrinsics.h(notificationCustomizationOptions, "notificationCustomizationOptions");
        Intrinsics.h(appPackageName, "appPackageName");
        Intrinsics.h(appVersionName, "appVersionName");
        Intrinsics.h(predictiveIntelligenceServerUrl, "predictiveIntelligenceServerUrl");
        return new MarketingCloudConfig(applicationId, accessToken, senderId, marketingCloudServerUrl, mid, analyticsEnabled, geofencingEnabled, inboxEnabled, piAnalyticsEnabled, proximityEnabled, markMessageReadOnInboxNotificationOpen, delayRegistrationUntilContactKeyIsSet, useLegacyPiIdentifier, notificationCustomizationOptions, proximityNotificationCustomizationOptions, urlHandler, appPackageName, appVersionName, predictiveIntelligenceServerUrl);
    }

    @JvmName
    public final boolean delayRegistrationUntilContactKeyIsSet() {
        return this.delayRegistrationUntilContactKeyIsSet;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketingCloudConfig)) {
            return false;
        }
        MarketingCloudConfig marketingCloudConfig = (MarketingCloudConfig) other;
        return Intrinsics.c(this.applicationId, marketingCloudConfig.applicationId) && Intrinsics.c(this.accessToken, marketingCloudConfig.accessToken) && Intrinsics.c(this.senderId, marketingCloudConfig.senderId) && Intrinsics.c(this.marketingCloudServerUrl, marketingCloudConfig.marketingCloudServerUrl) && Intrinsics.c(this.mid, marketingCloudConfig.mid) && this.analyticsEnabled == marketingCloudConfig.analyticsEnabled && this.geofencingEnabled == marketingCloudConfig.geofencingEnabled && this.inboxEnabled == marketingCloudConfig.inboxEnabled && this.piAnalyticsEnabled == marketingCloudConfig.piAnalyticsEnabled && this.proximityEnabled == marketingCloudConfig.proximityEnabled && this.markMessageReadOnInboxNotificationOpen == marketingCloudConfig.markMessageReadOnInboxNotificationOpen && this.delayRegistrationUntilContactKeyIsSet == marketingCloudConfig.delayRegistrationUntilContactKeyIsSet && this.useLegacyPiIdentifier == marketingCloudConfig.useLegacyPiIdentifier && Intrinsics.c(this.notificationCustomizationOptions, marketingCloudConfig.notificationCustomizationOptions) && Intrinsics.c(this.proximityNotificationCustomizationOptions, marketingCloudConfig.proximityNotificationCustomizationOptions) && Intrinsics.c(this.urlHandler, marketingCloudConfig.urlHandler) && Intrinsics.c(this.appPackageName, marketingCloudConfig.appPackageName) && Intrinsics.c(this.appVersionName, marketingCloudConfig.appVersionName) && Intrinsics.c(this.predictiveIntelligenceServerUrl, marketingCloudConfig.predictiveIntelligenceServerUrl);
    }

    @JvmName
    public final boolean geofencingEnabled() {
        return this.geofencingEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iC = androidx.camera.core.impl.b.c(this.applicationId.hashCode() * 31, 31, this.accessToken);
        String str = this.senderId;
        int iC2 = androidx.camera.core.impl.b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.marketingCloudServerUrl);
        String str2 = this.mid;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.analyticsEnabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.geofencingEnabled;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.inboxEnabled;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.piAnalyticsEnabled;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.proximityEnabled;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.markMessageReadOnInboxNotificationOpen;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.delayRegistrationUntilContactKeyIsSet;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z8 = this.useLegacyPiIdentifier;
        int iHashCode2 = (this.notificationCustomizationOptions.hashCode() + ((i14 + (z8 ? 1 : z8 ? 1 : 0)) * 31)) * 31;
        ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions = this.proximityNotificationCustomizationOptions;
        int iHashCode3 = (iHashCode2 + (proximityNotificationCustomizationOptions == null ? 0 : proximityNotificationCustomizationOptions.hashCode())) * 31;
        UrlHandler urlHandler = this.urlHandler;
        return this.predictiveIntelligenceServerUrl.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c((iHashCode3 + (urlHandler != null ? urlHandler.hashCode() : 0)) * 31, 31, this.appPackageName), 31, this.appVersionName);
    }

    @JvmName
    public final boolean inboxEnabled() {
        return this.inboxEnabled;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.Config
    public void init(@NotNull Context context, @NotNull SFMCSdkComponents components, @NotNull ModuleReadyListener listener) {
        Intrinsics.h(context, "context");
        Intrinsics.h(components, "components");
        Intrinsics.h(listener, "listener");
        MarketingCloudSdk.b(context, this, components, new l(listener));
    }

    @JvmName
    public final boolean markMessageReadOnInboxNotificationOpen() {
        return this.markMessageReadOnInboxNotificationOpen;
    }

    @JvmName
    @NotNull
    public final String marketingCloudServerUrl() {
        return this.marketingCloudServerUrl;
    }

    @JvmName
    @Nullable
    public final String mid() {
        return this.mid;
    }

    @JvmName
    @NotNull
    public final NotificationCustomizationOptions notificationCustomizationOptions() {
        return this.notificationCustomizationOptions;
    }

    @JvmName
    public final boolean piAnalyticsEnabled() {
        return this.piAnalyticsEnabled;
    }

    @JvmName
    @NotNull
    public final String predictiveIntelligenceServerUrl() {
        return this.predictiveIntelligenceServerUrl;
    }

    @JvmName
    public final boolean proximityEnabled() {
        return this.proximityEnabled;
    }

    @JvmName
    @Nullable
    public final ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions() {
        return this.proximityNotificationCustomizationOptions;
    }

    @JvmName
    @Nullable
    public final String senderId() {
        return this.senderId;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    @NotNull
    public String toString() {
        String str = this.applicationId;
        String str2 = this.accessToken;
        String str3 = this.senderId;
        String str4 = this.marketingCloudServerUrl;
        String str5 = this.mid;
        boolean z = this.analyticsEnabled;
        boolean z2 = this.geofencingEnabled;
        boolean z3 = this.inboxEnabled;
        boolean z4 = this.piAnalyticsEnabled;
        boolean z5 = this.proximityEnabled;
        boolean z6 = this.markMessageReadOnInboxNotificationOpen;
        boolean z7 = this.delayRegistrationUntilContactKeyIsSet;
        boolean z8 = this.useLegacyPiIdentifier;
        NotificationCustomizationOptions notificationCustomizationOptions = this.notificationCustomizationOptions;
        ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions = this.proximityNotificationCustomizationOptions;
        UrlHandler urlHandler = this.urlHandler;
        String str6 = this.appPackageName;
        String str7 = this.appVersionName;
        String str8 = this.predictiveIntelligenceServerUrl;
        StringBuilder sbV = YU.a.v("MarketingCloudConfig(applicationId=", str, ", accessToken=", str2, ", senderId=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", marketingCloudServerUrl=", str4, ", mid=");
        au.com.woolworths.dynamic.page.ui.content.d.A(str5, ", analyticsEnabled=", ", geofencingEnabled=", sbV, z);
        au.com.woolworths.android.onesite.a.D(sbV, z2, ", inboxEnabled=", z3, ", piAnalyticsEnabled=");
        au.com.woolworths.android.onesite.a.D(sbV, z4, ", proximityEnabled=", z5, ", markMessageReadOnInboxNotificationOpen=");
        au.com.woolworths.android.onesite.a.D(sbV, z6, ", delayRegistrationUntilContactKeyIsSet=", z7, ", useLegacyPiIdentifier=");
        sbV.append(z8);
        sbV.append(", notificationCustomizationOptions=");
        sbV.append(notificationCustomizationOptions);
        sbV.append(", proximityNotificationCustomizationOptions=");
        sbV.append(proximityNotificationCustomizationOptions);
        sbV.append(", urlHandler=");
        sbV.append(urlHandler);
        sbV.append(", appPackageName=");
        androidx.constraintlayout.core.state.a.B(sbV, str6, ", appVersionName=", str7, ", predictiveIntelligenceServerUrl=");
        return YU.a.o(sbV, str8, ")");
    }

    @JvmName
    @Nullable
    public final UrlHandler urlHandler() {
        return this.urlHandler;
    }

    @JvmName
    public final boolean useLegacyPiIdentifier() {
        return this.useLegacyPiIdentifier;
    }
}
