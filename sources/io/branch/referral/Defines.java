package io.branch.referral;

import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.checkout.models.CouponResponse;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import com.salesforce.marketingcloud.config.a;
import com.salesforce.marketingcloud.storage.db.k;

/* loaded from: classes7.dex */
public class Defines {

    /* loaded from: classes.dex */
    public enum HeaderKey {
        RequestId("X-Branch-Request-Id"),
        /* JADX INFO: Fake field, exist only in values array */
        SendCloseRequest("X-Branch-Send-Close-Request");

        public final String d;

        HeaderKey(String str) {
            this.d = str;
        }

        public final String a() {
            return this.d;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public enum IntentKeys {
        /* JADX INFO: Fake field, exist only in values array */
        BranchData("branch_data"),
        /* JADX INFO: Fake field, exist only in values array */
        ForceNewBranchSession("branch_force_new_session"),
        /* JADX INFO: Fake field, exist only in values array */
        BranchLinkUsed("branch_used"),
        /* JADX INFO: Fake field, exist only in values array */
        BranchURI("branch"),
        /* JADX INFO: Fake field, exist only in values array */
        AutoDeepLinked("io.branch.sdk.auto_linked");

        public final String d;

        IntentKeys(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public enum Jsonkey {
        /* JADX INFO: Fake field, exist only in values array */
        RandomizedBundleToken("randomized_bundle_token"),
        /* JADX INFO: Fake field, exist only in values array */
        Identity("identity"),
        /* JADX INFO: Fake field, exist only in values array */
        RandomizedDeviceToken("randomized_device_token"),
        /* JADX INFO: Fake field, exist only in values array */
        SessionID("session_id"),
        /* JADX INFO: Fake field, exist only in values array */
        LinkClickID("link_click_id"),
        /* JADX INFO: Fake field, exist only in values array */
        GoogleSearchInstallReferrer("google_search_install_referrer"),
        /* JADX INFO: Fake field, exist only in values array */
        GooglePlayInstallReferrer("install_referrer_extras"),
        /* JADX INFO: Fake field, exist only in values array */
        ClickedReferrerTimeStamp("clicked_referrer_ts"),
        /* JADX INFO: Fake field, exist only in values array */
        Gclid("gclid"),
        /* JADX INFO: Fake field, exist only in values array */
        IsDeeplinkGclid("is_deeplink_gclid"),
        /* JADX INFO: Fake field, exist only in values array */
        ReferrerGclid("referrer_gclid"),
        /* JADX INFO: Fake field, exist only in values array */
        ReferringUrlQueryParameters("bnc_referringUrlQueryParameters"),
        /* JADX INFO: Fake field, exist only in values array */
        InstallBeginTimeStamp("install_begin_ts"),
        /* JADX INFO: Fake field, exist only in values array */
        BranchLinkUsed("branch_used"),
        /* JADX INFO: Fake field, exist only in values array */
        ReferringBranchIdentity("referring_branch_identity"),
        /* JADX INFO: Fake field, exist only in values array */
        BranchIdentity("branch_identity"),
        /* JADX INFO: Fake field, exist only in values array */
        BranchKey("branch_key"),
        /* JADX INFO: Fake field, exist only in values array */
        BranchData("branch_data"),
        /* JADX INFO: Fake field, exist only in values array */
        PlayAutoInstalls("play-auto-installs"),
        /* JADX INFO: Fake field, exist only in values array */
        UTMCampaign("utm_campaign"),
        /* JADX INFO: Fake field, exist only in values array */
        UTMMedium("utm_medium"),
        /* JADX INFO: Fake field, exist only in values array */
        InitialReferrer("initial_referrer"),
        /* JADX INFO: Fake field, exist only in values array */
        Bucket("bucket"),
        /* JADX INFO: Fake field, exist only in values array */
        DefaultBucket("default"),
        /* JADX INFO: Fake field, exist only in values array */
        Amount("amount"),
        /* JADX INFO: Fake field, exist only in values array */
        CalculationType("calculation_type"),
        /* JADX INFO: Fake field, exist only in values array */
        Location("location"),
        /* JADX INFO: Fake field, exist only in values array */
        Type("type"),
        /* JADX INFO: Fake field, exist only in values array */
        CreationSource("creation_source"),
        /* JADX INFO: Fake field, exist only in values array */
        Prefix("prefix"),
        /* JADX INFO: Fake field, exist only in values array */
        Expiration("expiration"),
        /* JADX INFO: Fake field, exist only in values array */
        Event("event"),
        /* JADX INFO: Fake field, exist only in values array */
        Metadata("metadata"),
        /* JADX INFO: Fake field, exist only in values array */
        CommerceData("commerce_data"),
        /* JADX INFO: Fake field, exist only in values array */
        Total("total"),
        /* JADX INFO: Fake field, exist only in values array */
        Unique("unique"),
        /* JADX INFO: Fake field, exist only in values array */
        Length("length"),
        /* JADX INFO: Fake field, exist only in values array */
        Direction("direction"),
        /* JADX INFO: Fake field, exist only in values array */
        BeginAfterID("begin_after_id"),
        /* JADX INFO: Fake field, exist only in values array */
        Link("link"),
        /* JADX INFO: Fake field, exist only in values array */
        ReferringData("referring_data"),
        /* JADX INFO: Fake field, exist only in values array */
        ReferringLink("referring_link"),
        /* JADX INFO: Fake field, exist only in values array */
        IsFullAppConv("is_full_app_conversion"),
        /* JADX INFO: Fake field, exist only in values array */
        Data("data"),
        /* JADX INFO: Fake field, exist only in values array */
        OS("os"),
        /* JADX INFO: Fake field, exist only in values array */
        HardwareID("hardware_id"),
        /* JADX INFO: Fake field, exist only in values array */
        AndroidID(nnlllnn.nnlllln.w007700770077www),
        /* JADX INFO: Fake field, exist only in values array */
        UnidentifiedDevice("unidentified_device"),
        /* JADX INFO: Fake field, exist only in values array */
        HardwareIDType("hardware_id_type"),
        /* JADX INFO: Fake field, exist only in values array */
        HardwareIDTypeVendor("vendor_id"),
        /* JADX INFO: Fake field, exist only in values array */
        HardwareIDTypeRandom("random"),
        /* JADX INFO: Fake field, exist only in values array */
        IsHardwareIDReal("is_hardware_id_real"),
        /* JADX INFO: Fake field, exist only in values array */
        AnonID("anon_id"),
        /* JADX INFO: Fake field, exist only in values array */
        AppVersion(k.a.q),
        /* JADX INFO: Fake field, exist only in values array */
        APILevel("os_version"),
        /* JADX INFO: Fake field, exist only in values array */
        Country("country"),
        /* JADX INFO: Fake field, exist only in values array */
        Language("language"),
        /* JADX INFO: Fake field, exist only in values array */
        Update("update"),
        /* JADX INFO: Fake field, exist only in values array */
        OriginalInstallTime("first_install_time"),
        /* JADX INFO: Fake field, exist only in values array */
        FirstInstallTime("latest_install_time"),
        /* JADX INFO: Fake field, exist only in values array */
        LastUpdateTime("latest_update_time"),
        /* JADX INFO: Fake field, exist only in values array */
        PreviousUpdateTime("previous_update_time"),
        /* JADX INFO: Fake field, exist only in values array */
        URIScheme("uri_scheme"),
        /* JADX INFO: Fake field, exist only in values array */
        AppLinks("app_links"),
        /* JADX INFO: Fake field, exist only in values array */
        AppIdentifier("app_identifier"),
        /* JADX INFO: Fake field, exist only in values array */
        LinkIdentifier("link_identifier"),
        /* JADX INFO: Fake field, exist only in values array */
        GoogleAdvertisingID("google_advertising_id"),
        /* JADX INFO: Fake field, exist only in values array */
        AAID("aaid"),
        /* JADX INFO: Fake field, exist only in values array */
        FireAdId("fire_ad_id"),
        /* JADX INFO: Fake field, exist only in values array */
        OpenAdvertisingID("oaid"),
        /* JADX INFO: Fake field, exist only in values array */
        LATVal("lat_val"),
        /* JADX INFO: Fake field, exist only in values array */
        LimitedAdTracking("limit_ad_tracking"),
        /* JADX INFO: Fake field, exist only in values array */
        limitFacebookTracking("limit_facebook_tracking"),
        /* JADX INFO: Fake field, exist only in values array */
        Debug("debug"),
        /* JADX INFO: Fake field, exist only in values array */
        Brand("brand"),
        /* JADX INFO: Fake field, exist only in values array */
        Model("model"),
        /* JADX INFO: Fake field, exist only in values array */
        ScreenDpi("screen_dpi"),
        /* JADX INFO: Fake field, exist only in values array */
        ScreenHeight("screen_height"),
        /* JADX INFO: Fake field, exist only in values array */
        ScreenWidth("screen_width"),
        /* JADX INFO: Fake field, exist only in values array */
        WiFi("wifi"),
        /* JADX INFO: Fake field, exist only in values array */
        LocalIP("local_ip"),
        /* JADX INFO: Fake field, exist only in values array */
        UserData("user_data"),
        /* JADX INFO: Fake field, exist only in values array */
        AdvertisingIDs("advertising_ids"),
        /* JADX INFO: Fake field, exist only in values array */
        DeveloperIdentity("developer_identity"),
        /* JADX INFO: Fake field, exist only in values array */
        UserAgent("user_agent"),
        /* JADX INFO: Fake field, exist only in values array */
        SDK("sdk"),
        /* JADX INFO: Fake field, exist only in values array */
        SdkVersion(k.a.r),
        /* JADX INFO: Fake field, exist only in values array */
        UIMode("ui_mode"),
        /* JADX INFO: Fake field, exist only in values array */
        InstallMetadata("install_metadata"),
        /* JADX INFO: Fake field, exist only in values array */
        LATDAttributionWindow("attribution_window"),
        /* JADX INFO: Fake field, exist only in values array */
        Clicked_Branch_Link("+clicked_branch_link"),
        /* JADX INFO: Fake field, exist only in values array */
        IsFirstSession("+is_first_session"),
        /* JADX INFO: Fake field, exist only in values array */
        AndroidDeepLinkPath("$android_deeplink_path"),
        /* JADX INFO: Fake field, exist only in values array */
        DeepLinkPath("$deeplink_path"),
        /* JADX INFO: Fake field, exist only in values array */
        AndroidAppLinkURL("android_app_link_url"),
        /* JADX INFO: Fake field, exist only in values array */
        AndroidPushNotificationKey("branch"),
        /* JADX INFO: Fake field, exist only in values array */
        AndroidPushIdentifier("push_identifier"),
        /* JADX INFO: Fake field, exist only in values array */
        CanonicalIdentifier("$canonical_identifier"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentTitle("$og_title"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentDesc("$og_description"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentImgUrl("$og_image_url"),
        /* JADX INFO: Fake field, exist only in values array */
        CanonicalUrl("$canonical_url"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentType("$content_type"),
        /* JADX INFO: Fake field, exist only in values array */
        PublicallyIndexable("$publicly_indexable"),
        /* JADX INFO: Fake field, exist only in values array */
        LocallyIndexable("$locally_indexable"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentKeyWords("$keywords"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentExpiryTime("$exp_date"),
        /* JADX INFO: Fake field, exist only in values array */
        Params("params"),
        /* JADX INFO: Fake field, exist only in values array */
        SharedLink("$shared_link"),
        /* JADX INFO: Fake field, exist only in values array */
        ShareError("$share_error"),
        /* JADX INFO: Fake field, exist only in values array */
        SharedChannel("$shared_channel"),
        /* JADX INFO: Fake field, exist only in values array */
        URLSource("android"),
        /* JADX INFO: Fake field, exist only in values array */
        External_Intent_URI("external_intent_uri"),
        /* JADX INFO: Fake field, exist only in values array */
        External_Intent_Extra("external_intent_extra"),
        /* JADX INFO: Fake field, exist only in values array */
        Last_Round_Trip_Time("lrtt"),
        /* JADX INFO: Fake field, exist only in values array */
        Branch_Round_Trip_Time("brtt"),
        /* JADX INFO: Fake field, exist only in values array */
        Branch_Instrumentation("instrumentation"),
        /* JADX INFO: Fake field, exist only in values array */
        Queue_Wait_Time("qwt"),
        /* JADX INFO: Fake field, exist only in values array */
        InstantDeepLinkSession("instant_dl_session"),
        /* JADX INFO: Fake field, exist only in values array */
        Path(a.j),
        /* JADX INFO: Fake field, exist only in values array */
        ViewList("view_list"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentActionView("view"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentPath("content_path"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentNavPath("content_nav_path"),
        /* JADX INFO: Fake field, exist only in values array */
        ReferralLink("referral_link"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentData("content_data"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentEvents("events"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentAnalyticsMode("content_analytics_mode"),
        /* JADX INFO: Fake field, exist only in values array */
        Environment("environment"),
        /* JADX INFO: Fake field, exist only in values array */
        InstantApp("INSTANT_APP"),
        /* JADX INFO: Fake field, exist only in values array */
        NativeApp("FULL_APP"),
        /* JADX INFO: Fake field, exist only in values array */
        CustomerEventAlias("customer_event_alias"),
        /* JADX INFO: Fake field, exist only in values array */
        TransactionID("transaction_id"),
        /* JADX INFO: Fake field, exist only in values array */
        Currency("currency"),
        /* JADX INFO: Fake field, exist only in values array */
        Revenue("revenue"),
        /* JADX INFO: Fake field, exist only in values array */
        Shipping("shipping"),
        /* JADX INFO: Fake field, exist only in values array */
        Tax("tax"),
        /* JADX INFO: Fake field, exist only in values array */
        Coupon(CouponResponse.Discount.COUPON),
        /* JADX INFO: Fake field, exist only in values array */
        Affiliation("affiliation"),
        /* JADX INFO: Fake field, exist only in values array */
        Description(lqlqqlq.mmm006Dm006Dm),
        /* JADX INFO: Fake field, exist only in values array */
        SearchQuery("search_query"),
        /* JADX INFO: Fake field, exist only in values array */
        AdType("ad_type"),
        /* JADX INFO: Fake field, exist only in values array */
        CPUType("cpu_type"),
        /* JADX INFO: Fake field, exist only in values array */
        DeviceBuildId("build"),
        /* JADX INFO: Fake field, exist only in values array */
        Locale(k.a.n),
        /* JADX INFO: Fake field, exist only in values array */
        ConnectionType("connection_type"),
        /* JADX INFO: Fake field, exist only in values array */
        DeviceCarrier("device_carrier"),
        /* JADX INFO: Fake field, exist only in values array */
        PluginName("plugin_name"),
        /* JADX INFO: Fake field, exist only in values array */
        PluginVersion("plugin_version"),
        /* JADX INFO: Fake field, exist only in values array */
        OSVersionAndroid("os_version_android"),
        /* JADX INFO: Fake field, exist only in values array */
        Name(AppMeasurementSdk.ConditionalUserProperty.NAME),
        /* JADX INFO: Fake field, exist only in values array */
        CustomData("custom_data"),
        /* JADX INFO: Fake field, exist only in values array */
        EventData("event_data"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentItems("content_items"),
        /* JADX INFO: Fake field, exist only in values array */
        ContentSchema("$content_schema"),
        /* JADX INFO: Fake field, exist only in values array */
        Price("$price"),
        /* JADX INFO: Fake field, exist only in values array */
        PriceCurrency("$currency"),
        /* JADX INFO: Fake field, exist only in values array */
        Quantity("$quantity"),
        /* JADX INFO: Fake field, exist only in values array */
        SKU("$sku"),
        /* JADX INFO: Fake field, exist only in values array */
        ProductName("$product_name"),
        /* JADX INFO: Fake field, exist only in values array */
        ProductBrand("$product_brand"),
        /* JADX INFO: Fake field, exist only in values array */
        ProductCategory("$product_category"),
        /* JADX INFO: Fake field, exist only in values array */
        ProductVariant("$product_variant"),
        /* JADX INFO: Fake field, exist only in values array */
        Rating("$rating"),
        /* JADX INFO: Fake field, exist only in values array */
        RatingAverage("$rating_average"),
        /* JADX INFO: Fake field, exist only in values array */
        RatingCount("$rating_count"),
        /* JADX INFO: Fake field, exist only in values array */
        RatingMax("$rating_max"),
        /* JADX INFO: Fake field, exist only in values array */
        AddressStreet("$address_street"),
        /* JADX INFO: Fake field, exist only in values array */
        AddressCity("$address_city"),
        /* JADX INFO: Fake field, exist only in values array */
        AddressRegion("$address_region"),
        /* JADX INFO: Fake field, exist only in values array */
        AddressCountry("$address_country"),
        /* JADX INFO: Fake field, exist only in values array */
        AddressPostalCode("$address_postal_code"),
        /* JADX INFO: Fake field, exist only in values array */
        Latitude("$latitude"),
        /* JADX INFO: Fake field, exist only in values array */
        Longitude("$longitude"),
        /* JADX INFO: Fake field, exist only in values array */
        ImageCaptions("$image_captions"),
        /* JADX INFO: Fake field, exist only in values array */
        Condition("$condition"),
        /* JADX INFO: Fake field, exist only in values array */
        CreationTimestamp("$creation_timestamp"),
        /* JADX INFO: Fake field, exist only in values array */
        TrackingDisabled("tracking_disabled"),
        /* JADX INFO: Fake field, exist only in values array */
        DisableAdNetworkCallouts("disable_ad_network_callouts"),
        /* JADX INFO: Fake field, exist only in values array */
        PartnerData("partner_data"),
        /* JADX INFO: Fake field, exist only in values array */
        Instant("instant"),
        /* JADX INFO: Fake field, exist only in values array */
        QRCodeTag("qr-code"),
        /* JADX INFO: Fake field, exist only in values array */
        CodeColor("code_color"),
        /* JADX INFO: Fake field, exist only in values array */
        BackgroundColor("background_color"),
        /* JADX INFO: Fake field, exist only in values array */
        Width("width"),
        /* JADX INFO: Fake field, exist only in values array */
        Margin("margin"),
        /* JADX INFO: Fake field, exist only in values array */
        ImageFormat("image_format"),
        /* JADX INFO: Fake field, exist only in values array */
        CenterLogo("center_logo_url"),
        /* JADX INFO: Fake field, exist only in values array */
        QRCodeSettings("qr_code_settings"),
        /* JADX INFO: Fake field, exist only in values array */
        QRCodeData("data"),
        /* JADX INFO: Fake field, exist only in values array */
        QRCodeBranchKey("branch_key"),
        /* JADX INFO: Fake field, exist only in values array */
        QRCodeResponseString("QRCodeString"),
        /* JADX INFO: Fake field, exist only in values array */
        App_Store("app_store"),
        /* JADX INFO: Fake field, exist only in values array */
        Google_Play_Store("PlayStore"),
        /* JADX INFO: Fake field, exist only in values array */
        Huawei_App_Gallery("AppGallery"),
        /* JADX INFO: Fake field, exist only in values array */
        Samsung_Galaxy_Store("GalaxyStore"),
        /* JADX INFO: Fake field, exist only in values array */
        Xiaomi_Get_Apps("GetApps"),
        /* JADX INFO: Fake field, exist only in values array */
        Meta_Install_Referrer("Meta"),
        /* JADX INFO: Fake field, exist only in values array */
        DMA_EEA("dma_eea"),
        /* JADX INFO: Fake field, exist only in values array */
        DMA_Ad_Personalization("dma_ad_personalization"),
        /* JADX INFO: Fake field, exist only in values array */
        DMA_Ad_User_Data("dma_ad_user_data"),
        /* JADX INFO: Fake field, exist only in values array */
        Is_Meta_Click_Through("is_meta_ct");

        public final String d;

        Jsonkey(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public enum LinkParam {
        Tags(k.a.g),
        Alias("alias"),
        Type("type"),
        Duration("duration"),
        Channel("channel"),
        Feature("feature"),
        Stage("stage"),
        Campaign(NotificationResult.Notification.CAMPAIGN),
        /* JADX INFO: Fake field, exist only in values array */
        Data("data"),
        /* JADX INFO: Fake field, exist only in values array */
        URL("url");

        public final String d;

        LinkParam(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public enum PreinstallKey {
        campaign("preinstall_campaign"),
        partner("preinstall_partner");

        public final String d;

        PreinstallKey(String str) {
            this.d = str;
        }

        public final String a() {
            return this.d;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public enum RequestPath {
        GetURL("v1/url"),
        /* JADX INFO: Fake field, exist only in values array */
        GetApp("v1/app-link-settings"),
        RegisterInstall("v1/install"),
        RegisterOpen("v1/open"),
        ContentEvent("v1/content-events"),
        TrackStandardEvent("v2/event/standard"),
        TrackCustomEvent("v2/event/custom"),
        /* JADX INFO: Fake field, exist only in values array */
        GetLATD("v1/cpid/latd"),
        /* JADX INFO: Fake field, exist only in values array */
        QRCode("v1/qr-code");

        public final String d;

        RequestPath(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }
}
