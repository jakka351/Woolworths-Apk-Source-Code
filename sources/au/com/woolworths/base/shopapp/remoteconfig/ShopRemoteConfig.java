package au.com.woolworths.base.shopapp.remoteconfig;

import au.com.woolworths.android.onesite.remoteconfig.RemoteConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "Lau/com/woolworths/android/onesite/remoteconfig/RemoteConfig;", "", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ShopRemoteConfig implements RemoteConfig {
    public static final ShopRemoteConfig e;
    public static final ShopRemoteConfig f;
    public static final ShopRemoteConfig g;
    public static final ShopRemoteConfig h;
    public static final ShopRemoteConfig i;
    public static final ShopRemoteConfig j;
    public static final ShopRemoteConfig k;
    public static final ShopRemoteConfig l;
    public static final ShopRemoteConfig m;
    public static final ShopRemoteConfig n;
    public static final ShopRemoteConfig o;
    public static final ShopRemoteConfig p;
    public static final ShopRemoteConfig q;
    public static final ShopRemoteConfig r;
    public static final ShopRemoteConfig s;
    public static final ShopRemoteConfig t;
    public static final /* synthetic */ ShopRemoteConfig[] u;
    public static final /* synthetic */ EnumEntries v;
    public final String d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.BOTMANAGER_CONFIG", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BOTMANAGER_CONFIG extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "{\n    \"protected_paths\": [\n        \"/hermes/iris/v1/login/user\",\n        \"/hermes/iris/v1/scango/login\",\n        \"/hermes/iris/v1/graphql\",\n        \"/wow/v2/commerce/checkout/payment/digitalpay\",\n        \"/hermes/payment/v1/graphql\",\n        \"/wow/v2/commerce/token-exchange\"],\n    \"protected_graphql_operations\": []\n}";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.CHECKOUT_VOC_SURVEY_ALLOCATION", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CHECKOUT_VOC_SURVEY_ALLOCATION extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "50";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig$Companion;", "Lau/com/woolworths/android/onesite/remoteconfig/RemoteConfig$Values;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion implements RemoteConfig.Values {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.DEFAULT_PICK_UP_STORE_ADDRESS_ID", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DEFAULT_PICK_UP_STORE_ADDRESS_ID extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "10740794";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.GOOGLE_AD_LOADING_TIMEOUT", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GOOGLE_AD_LOADING_TIMEOUT extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "{}";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.HOME_HERO_BANNER_AUTOSCROLL_INTERVAL", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HOME_HERO_BANNER_AUTOSCROLL_INTERVAL extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "0";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.IN_STORE_GEO_LOCATION_MAX_DISTANCE_METERS", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IN_STORE_GEO_LOCATION_MAX_DISTANCE_METERS extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "50";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.IN_STORE_GEO_LOCATION_MIN_ACCURACY_METERS", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IN_STORE_GEO_LOCATION_MIN_ACCURACY_METERS extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "40";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.IN_STORE_GEO_LOCATION_NEARBY_STORES_MAX_LIMIT", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IN_STORE_GEO_LOCATION_NEARBY_STORES_MAX_LIMIT extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "3";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.IN_STORE_USER_PRESENCE_POLL_PERIOD_SEC", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IN_STORE_USER_PRESENCE_POLL_PERIOD_SEC extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "120";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.MARKETPLACE_PRODUCT_MINIMUM_PRODUCT_ID", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MARKETPLACE_PRODUCT_MINIMUM_PRODUCT_ID extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "1073741824";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.PICKUP_ORDER_LOCATION_TRACKING", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PICKUP_ORDER_LOCATION_TRACKING extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "{\n    \"tracking_interval_seconds\": 60\n}";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.PRODUCT_DETAILS_FETCH_NODE_MAX_RETRY", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PRODUCT_DETAILS_FETCH_NODE_MAX_RETRY extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "3";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.PRODUCT_LIST_FILTER_SAVE_STATE_CAP", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PRODUCT_LIST_FILTER_SAVE_STATE_CAP extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "500";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.SHOPPING_MODE_CONTENT", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SHOPPING_MODE_CONTENT extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "{\n\"modes\":[{\"id\": \"PICKUP\",\"variants\":[{\"id\": \"PICKUP\",\"title\": \"Pick up\",\"subtitle\": \"Collect in-store, from lockers or get Direct to Boot\",\"attributes\": [\"Order by 1pm for same day\"]}]},\n{\"id\": \"DELIVERY\",\"variants\":[{\"id\": \"DELIVERY\",\"title\": \"Delivery\",\"subtitle\": \"Schedule for later\",\"attributes\": [\"$50 minimum spend\", \"No item limit\", \"Contactless delivery to your door\"]},\n{\"id\": \"DELIVERY_NOW\",\"title\": \"Delivery Now\",\"subtitle\": \"Get it in 1-2 hours\",\"attributes\": [\"No minimum spend\", \"50 items limit\", \"Live tracking\"]}]},\n{\"id\": \"INSTORE\",\"variants\":[{\"id\": \"INSTORE\",\"title\": \"In-store\",\"subtitle\": \"Browse your local store\",\"attributes\": [\"See availability and specials\", \"Sort your list by aisle\", \"Search for products by aisle\"]}]}\n]}";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.SNG_MAX_INSTRUMENT", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SNG_MAX_INSTRUMENT extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "2";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.TOBACCO_BANNER_ALT_TEXT", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TOBACCO_BANNER_ALT_TEXT extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "Smoking causes lung disease that cannot be cured.";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig.TOBACCO_BANNER_URL", "Lau/com/woolworths/base/shopapp/remoteconfig/ShopRemoteConfig;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TOBACCO_BANNER_URL extends ShopRemoteConfig {
        @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
        public final String getDefaultValue() {
            return "https://wowprdmobileappaae.blob.core.windows.net/public-assets/banners/tobacco_warning_2024Q2.jpeg";
        }
    }

    static {
        BOTMANAGER_CONFIG botmanager_config = new BOTMANAGER_CONFIG("BOTMANAGER_CONFIG", 0, "s_botmanager_config");
        e = botmanager_config;
        DEFAULT_PICK_UP_STORE_ADDRESS_ID default_pick_up_store_address_id = new DEFAULT_PICK_UP_STORE_ADDRESS_ID("DEFAULT_PICK_UP_STORE_ADDRESS_ID", 1, "s_default_pickup_store_addressid");
        IN_STORE_GEO_LOCATION_MAX_DISTANCE_METERS in_store_geo_location_max_distance_meters = new IN_STORE_GEO_LOCATION_MAX_DISTANCE_METERS("IN_STORE_GEO_LOCATION_MAX_DISTANCE_METERS", 2, "s_instore_geo_location_max_distance_meters");
        f = in_store_geo_location_max_distance_meters;
        IN_STORE_GEO_LOCATION_MIN_ACCURACY_METERS in_store_geo_location_min_accuracy_meters = new IN_STORE_GEO_LOCATION_MIN_ACCURACY_METERS("IN_STORE_GEO_LOCATION_MIN_ACCURACY_METERS", 3, "s_instore_geo_location_min_accuracy_meters");
        g = in_store_geo_location_min_accuracy_meters;
        IN_STORE_GEO_LOCATION_NEARBY_STORES_MAX_LIMIT in_store_geo_location_nearby_stores_max_limit = new IN_STORE_GEO_LOCATION_NEARBY_STORES_MAX_LIMIT("IN_STORE_GEO_LOCATION_NEARBY_STORES_MAX_LIMIT", 4, "s_roaming_geofence_max_monitored");
        h = in_store_geo_location_nearby_stores_max_limit;
        IN_STORE_USER_PRESENCE_POLL_PERIOD_SEC in_store_user_presence_poll_period_sec = new IN_STORE_USER_PRESENCE_POLL_PERIOD_SEC("IN_STORE_USER_PRESENCE_POLL_PERIOD_SEC", 5, "s_instore_user_presence_poll_period_sec");
        i = in_store_user_presence_poll_period_sec;
        PICKUP_ORDER_LOCATION_TRACKING pickup_order_location_tracking = new PICKUP_ORDER_LOCATION_TRACKING("PICKUP_ORDER_LOCATION_TRACKING", 6, "s_pickup_order_location_tracking");
        j = pickup_order_location_tracking;
        PRODUCT_LIST_FILTER_SAVE_STATE_CAP product_list_filter_save_state_cap = new PRODUCT_LIST_FILTER_SAVE_STATE_CAP("PRODUCT_LIST_FILTER_SAVE_STATE_CAP", 7, "s_product_list_filter_save_state_cap");
        k = product_list_filter_save_state_cap;
        PRODUCT_DETAILS_FETCH_NODE_MAX_RETRY product_details_fetch_node_max_retry = new PRODUCT_DETAILS_FETCH_NODE_MAX_RETRY("PRODUCT_DETAILS_FETCH_NODE_MAX_RETRY", 8, "s_pdp_fetch_node_max_retry");
        l = product_details_fetch_node_max_retry;
        SHOPPING_MODE_CONTENT shopping_mode_content = new SHOPPING_MODE_CONTENT("SHOPPING_MODE_CONTENT", 9, "s_shopping_modes_info");
        SNG_MAX_INSTRUMENT sng_max_instrument = new SNG_MAX_INSTRUMENT("SNG_MAX_INSTRUMENT", 10, "maxInstruments");
        m = sng_max_instrument;
        GOOGLE_AD_LOADING_TIMEOUT google_ad_loading_timeout = new GOOGLE_AD_LOADING_TIMEOUT("GOOGLE_AD_LOADING_TIMEOUT", 11, "s_google_ad_loading_timeout_in_millis");
        n = google_ad_loading_timeout;
        HOME_HERO_BANNER_AUTOSCROLL_INTERVAL home_hero_banner_autoscroll_interval = new HOME_HERO_BANNER_AUTOSCROLL_INTERVAL("HOME_HERO_BANNER_AUTOSCROLL_INTERVAL", 12, "s_homepage_hero_banner_autoscroll_interval");
        o = home_hero_banner_autoscroll_interval;
        TOBACCO_BANNER_URL tobacco_banner_url = new TOBACCO_BANNER_URL("TOBACCO_BANNER_URL", 13, "s_tobacco_banner_url");
        p = tobacco_banner_url;
        TOBACCO_BANNER_ALT_TEXT tobacco_banner_alt_text = new TOBACCO_BANNER_ALT_TEXT("TOBACCO_BANNER_ALT_TEXT", 14, "s_tobacco_banner_alt_text");
        q = tobacco_banner_alt_text;
        CHECKOUT_VOC_SURVEY_ALLOCATION checkout_voc_survey_allocation = new CHECKOUT_VOC_SURVEY_ALLOCATION("CHECKOUT_VOC_SURVEY_ALLOCATION", 15, "s_checkout_voc_survey_allocation");
        r = checkout_voc_survey_allocation;
        MARKETPLACE_PRODUCT_MINIMUM_PRODUCT_ID marketplace_product_minimum_product_id = new MARKETPLACE_PRODUCT_MINIMUM_PRODUCT_ID("MARKETPLACE_PRODUCT_MINIMUM_PRODUCT_ID", 16, "s_market_place_product_min_id");
        s = marketplace_product_minimum_product_id;
        ShopRemoteConfig shopRemoteConfig = new ShopRemoteConfig() { // from class: au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig.MAGIC_MATCH_MAX_TEXT_ITEMS
            @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
            public final String getDefaultValue() {
                return "30";
            }
        };
        t = shopRemoteConfig;
        ShopRemoteConfig[] shopRemoteConfigArr = {botmanager_config, default_pick_up_store_address_id, in_store_geo_location_max_distance_meters, in_store_geo_location_min_accuracy_meters, in_store_geo_location_nearby_stores_max_limit, in_store_user_presence_poll_period_sec, pickup_order_location_tracking, product_list_filter_save_state_cap, product_details_fetch_node_max_retry, shopping_mode_content, sng_max_instrument, google_ad_loading_timeout, home_hero_banner_autoscroll_interval, tobacco_banner_url, tobacco_banner_alt_text, checkout_voc_survey_allocation, marketplace_product_minimum_product_id, shopRemoteConfig};
        u = shopRemoteConfigArr;
        v = EnumEntriesKt.a(shopRemoteConfigArr);
    }

    public ShopRemoteConfig(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ShopRemoteConfig valueOf(String str) {
        return (ShopRemoteConfig) Enum.valueOf(ShopRemoteConfig.class, str);
    }

    public static ShopRemoteConfig[] values() {
        return (ShopRemoteConfig[]) u.clone();
    }

    @Override // au.com.woolworths.android.onesite.remoteconfig.RemoteConfig
    /* renamed from: getKey, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
