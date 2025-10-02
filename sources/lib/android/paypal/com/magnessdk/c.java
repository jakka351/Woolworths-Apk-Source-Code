package lib.android.paypal.com.magnessdk;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import com.salesforce.marketingcloud.storage.db.k;

/* loaded from: classes7.dex */
public final class c {

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        AUDIT_KEY("audit"),
        /* JADX INFO: Fake field, exist only in values array */
        FEATURE("type"),
        /* JADX INFO: Fake field, exist only in values array */
        PAYLOAD("payload"),
        /* JADX INFO: Fake field, exist only in values array */
        SENSOR_TYPE("t"),
        /* JADX INFO: Fake field, exist only in values array */
        SENSOR_PAYLOAD("p");

        public final String d;

        a(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public static final class b {

        public enum a {
            /* JADX INFO: Fake field, exist only in values array */
            MOBILE("MOBILE"),
            /* JADX INFO: Fake field, exist only in values array */
            WIFI("WIFI"),
            /* JADX INFO: Fake field, exist only in values array */
            VPN("VPN"),
            /* JADX INFO: Fake field, exist only in values array */
            BLUETOOTH("Bluetooth Tethering"),
            /* JADX INFO: Fake field, exist only in values array */
            WIFI_AWARE("WIFI AWARE"),
            /* JADX INFO: Fake field, exist only in values array */
            LOWPAN("LOW PAN"),
            /* JADX INFO: Fake field, exist only in values array */
            ETHERNET("Ethernet");

            public final String d;

            a(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: lib.android.paypal.com.magnessdk.c$b$b, reason: collision with other inner class name */
        public static final class EnumC0409b {
            public static final /* synthetic */ EnumC0409b[] d = {new EnumC0409b("EXCEPTION", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            EnumC0409b EF5;

            public static EnumC0409b valueOf(String str) {
                return (EnumC0409b) Enum.valueOf(EnumC0409b.class, str);
            }

            public static EnumC0409b[] values() {
                return (EnumC0409b[]) d.clone();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Network Setup Exception, Check PPNetworkEnvironment for details";
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$b$c, reason: collision with other inner class name */
        public enum EnumC0410c {
            /* JADX INFO: Fake field, exist only in values array */
            CMID_EXCEPTION_MESSAGE("PayPal-Client-Metadata-Id exceeds the maximum length allowed. This is your own unique identifier for the payload. If you do not pass in this value, a new PayPal-Client-Metadata-Id is generated per method call. ***Maximum length: 32 characters***"),
            /* JADX INFO: Fake field, exist only in values array */
            APPGUID_EXCEPTION_MESSAGE("Application’s Globally Unique Identifier (AppGUID) does not match the criteria, This is a string that identifies the merchant application that sets up Magnes on the mobile device. If the merchant app does not pass an AppGuid, Magnes creates one to identify the app. An AppGuid is an application identifier per-installation; that is, if a new instance of the app is installed on the mobile device, or the app is reinstalled, it will have a new AppGuid.\n ***AppGuid Criteria*** \n   Max length: 36 characters \n   Min Length: 30 characters \n   Regex: Letters, numbers and dashes only \n");

            public final String d;

            EnumC0410c(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }
    }

    /* renamed from: lib.android.paypal.com.magnessdk.c$c, reason: collision with other inner class name */
    public enum EnumC0411c {
        RAMP("ramp"),
        REMOTE("remote");

        public final String d;

        EnumC0411c(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public enum d {
        /* JADX INFO: Fake field, exist only in values array */
        ANDROID_ID(nnlllnn.nnlllln.w007700770077www),
        /* JADX INFO: Fake field, exist only in values array */
        APP_FIRST_INSTALL_TIME("app_first_install_time"),
        /* JADX INFO: Fake field, exist only in values array */
        APP_GUID("app_guid"),
        /* JADX INFO: Fake field, exist only in values array */
        APP_ID("app_id"),
        /* JADX INFO: Fake field, exist only in values array */
        APP_LAST_UPDATE_TIME("app_last_update_time"),
        /* JADX INFO: Fake field, exist only in values array */
        APP_VERSION(k.a.q),
        /* JADX INFO: Fake field, exist only in values array */
        COMP_VERSION("comp_version"),
        /* JADX INFO: Fake field, exist only in values array */
        CONF_URL("conf_url"),
        /* JADX INFO: Fake field, exist only in values array */
        CPU("cpu"),
        /* JADX INFO: Fake field, exist only in values array */
        DEVICE_MODEL("device_model"),
        /* JADX INFO: Fake field, exist only in values array */
        DEVICE_NAME(nnlllnn.nnlllln.ww0077w0077ww),
        /* JADX INFO: Fake field, exist only in values array */
        DISK("disk"),
        /* JADX INFO: Fake field, exist only in values array */
        EMULATOR_FLAGS("ef"),
        /* JADX INFO: Fake field, exist only in values array */
        GSF_ID("gsf_id"),
        /* JADX INFO: Fake field, exist only in values array */
        IN_TREATMENT("t"),
        /* JADX INFO: Fake field, exist only in values array */
        IS_EMULATOR("is_emulator"),
        /* JADX INFO: Fake field, exist only in values array */
        IS_ROOTED("is_rooted"),
        /* JADX INFO: Fake field, exist only in values array */
        MAC_ADDRS("mac_addrs"),
        /* JADX INFO: Fake field, exist only in values array */
        MAGNES_GUID("magnes_guid"),
        /* JADX INFO: Fake field, exist only in values array */
        MAGNES_SOURCE("magnes_source"),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_COLLECTIBLE_LIST("nc"),
        /* JADX INFO: Fake field, exist only in values array */
        NOTIF_TOKEN("notif_token"),
        /* JADX INFO: Fake field, exist only in values array */
        OS_TYPE("os_type"),
        /* JADX INFO: Fake field, exist only in values array */
        OS_VERSION("os_version"),
        /* JADX INFO: Fake field, exist only in values array */
        PAYLOAD_TYPE("payload_type"),
        /* JADX INFO: Fake field, exist only in values array */
        ROOTED_FLAGS("rf"),
        /* JADX INFO: Fake field, exist only in values array */
        SCREEN("screen"),
        /* JADX INFO: Fake field, exist only in values array */
        SENSOR_METADATA("smd"),
        /* JADX INFO: Fake field, exist only in values array */
        SMS_ENABLED("sms_enabled"),
        /* JADX INFO: Fake field, exist only in values array */
        SOURCE_APP_VERSION("source_app_version"),
        /* JADX INFO: Fake field, exist only in values array */
        SYSTEM("system"),
        /* JADX INFO: Fake field, exist only in values array */
        T("t"),
        /* JADX INFO: Fake field, exist only in values array */
        TOTAL_STORAGE_SPACE("total_storage_space"),
        /* JADX INFO: Fake field, exist only in values array */
        USER_AGENT("user_agent");

        public final String d;

        public enum a {
            /* JADX INFO: Fake field, exist only in values array */
            CORES("cores"),
            /* JADX INFO: Fake field, exist only in values array */
            MAX_FREQUENCY("maxFreq"),
            /* JADX INFO: Fake field, exist only in values array */
            MIN_FREQUENCY("minFreq");

            public final String d;

            a(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        public enum b {
            /* JADX INFO: Fake field, exist only in values array */
            TOTAL_SD("total_sd"),
            /* JADX INFO: Fake field, exist only in values array */
            TOTAL_UD("total");

            public final String d;

            b(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$d$c, reason: collision with other inner class name */
        public enum EnumC0412c {
            /* JADX INFO: Fake field, exist only in values array */
            ANDROID_SDK_BUILD_FOR_X86("Android SDK built for x86"),
            /* JADX INFO: Fake field, exist only in values array */
            ANDROID_X86("android_x86"),
            /* JADX INFO: Fake field, exist only in values array */
            ANDY("andy"),
            /* JADX INFO: Fake field, exist only in values array */
            ANDY_OS("AndyOS"),
            /* JADX INFO: Fake field, exist only in values array */
            ANDY_OSX("AndyOSX"),
            /* JADX INFO: Fake field, exist only in values array */
            DRIOD_4X("Driod4X"),
            /* JADX INFO: Fake field, exist only in values array */
            DROID_4X("Droid4X"),
            /* JADX INFO: Fake field, exist only in values array */
            GENERIC("generic"),
            /* JADX INFO: Fake field, exist only in values array */
            GENERIC_X86("generic_x86"),
            /* JADX INFO: Fake field, exist only in values array */
            GENY_MOTION("Genymotion"),
            /* JADX INFO: Fake field, exist only in values array */
            GOLDFISH("goldfish"),
            /* JADX INFO: Fake field, exist only in values array */
            GOODLE_SDK("google_sdk"),
            /* JADX INFO: Fake field, exist only in values array */
            SDK("sdk"),
            /* JADX INFO: Fake field, exist only in values array */
            UNKNOWN(com.salesforce.marketingcloud.messages.iam.j.h),
            /* JADX INFO: Fake field, exist only in values array */
            VBOX_86("vbox86"),
            /* JADX INFO: Fake field, exist only in values array */
            VBOX_86P("vbox86p"),
            /* JADX INFO: Fake field, exist only in values array */
            RANCHU("ranchu"),
            /* JADX INFO: Fake field, exist only in values array */
            REMIXEMU("remixemu"),
            /* JADX INFO: Fake field, exist only in values array */
            TTVM_X86("ttVM_x86");

            public final String d;

            EnumC0412c(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$d$d, reason: collision with other inner class name */
        public enum EnumC0413d {
            /* JADX INFO: Fake field, exist only in values array */
            DENSITY("density"),
            /* JADX INFO: Fake field, exist only in values array */
            DENSITY_DPI("densityDpi"),
            /* JADX INFO: Fake field, exist only in values array */
            HEIGHT("height"),
            /* JADX INFO: Fake field, exist only in values array */
            SCALE("scale"),
            /* JADX INFO: Fake field, exist only in values array */
            WIDTH("width"),
            /* JADX INFO: Fake field, exist only in values array */
            X_DPI("xdpi"),
            /* JADX INFO: Fake field, exist only in values array */
            Y_DPI("ydpi");

            public final String d;

            EnumC0413d(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        public enum e {
            /* JADX INFO: Fake field, exist only in values array */
            FIFO_MAX_EVENT_COUNT("mec"),
            /* JADX INFO: Fake field, exist only in values array */
            MAX_RANGE("mr"),
            /* JADX INFO: Fake field, exist only in values array */
            NAME("n"),
            /* JADX INFO: Fake field, exist only in values array */
            POWER("pwr"),
            /* JADX INFO: Fake field, exist only in values array */
            RESOLUTION("re"),
            /* JADX INFO: Fake field, exist only in values array */
            VENDOR("v"),
            /* JADX INFO: Fake field, exist only in values array */
            VERSION("ver");

            public final String d;

            e(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        public enum f {
            /* JADX INFO: Fake field, exist only in values array */
            VERSION("version"),
            /* JADX INFO: Fake field, exist only in values array */
            BOARD("board"),
            /* JADX INFO: Fake field, exist only in values array */
            BOOTLOADER("bootloader"),
            /* JADX INFO: Fake field, exist only in values array */
            CPU_ABI1("cpu_abi1"),
            /* JADX INFO: Fake field, exist only in values array */
            DISPLAY("display"),
            /* JADX INFO: Fake field, exist only in values array */
            RADIO("radio"),
            /* JADX INFO: Fake field, exist only in values array */
            FINGERPRINT("fingerprint"),
            /* JADX INFO: Fake field, exist only in values array */
            HARDWARE("hardware"),
            /* JADX INFO: Fake field, exist only in values array */
            MANUFACTURER("manufacturer"),
            /* JADX INFO: Fake field, exist only in values array */
            PRODUCT("product"),
            /* JADX INFO: Fake field, exist only in values array */
            TIME("time"),
            /* JADX INFO: Fake field, exist only in values array */
            SYSTEM_TYPE("system_type");

            public final String d;

            f(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        d(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public enum e {
        /* JADX INFO: Fake field, exist only in values array */
        BASE_STATION_ID("base_station_id"),
        /* JADX INFO: Fake field, exist only in values array */
        BATTERY("battery"),
        /* JADX INFO: Fake field, exist only in values array */
        BSSID("bssid"),
        /* JADX INFO: Fake field, exist only in values array */
        BSSID_ARRAY("bssid_array"),
        /* JADX INFO: Fake field, exist only in values array */
        C("c"),
        /* JADX INFO: Fake field, exist only in values array */
        CDMA_NETWORK_ID("cdma_network_id"),
        /* JADX INFO: Fake field, exist only in values array */
        CDMA_SYSTEM_ID("cdma_system_id"),
        /* JADX INFO: Fake field, exist only in values array */
        CELL_ID("cell_id"),
        /* JADX INFO: Fake field, exist only in values array */
        CONF_VERSION("conf_version"),
        /* JADX INFO: Fake field, exist only in values array */
        CONN_TYPE("conn_type"),
        /* JADX INFO: Fake field, exist only in values array */
        DC_ID("dc_id"),
        /* JADX INFO: Fake field, exist only in values array */
        DEVICE_ID(k.a.p),
        /* JADX INFO: Fake field, exist only in values array */
        DEVICE_UPTIME("device_uptime"),
        /* JADX INFO: Fake field, exist only in values array */
        DISK("disk"),
        /* JADX INFO: Fake field, exist only in values array */
        DS("ds"),
        /* JADX INFO: Fake field, exist only in values array */
        IP_ADDRESSES("ip_addresses"),
        /* JADX INFO: Fake field, exist only in values array */
        IP_ADDRS("ip_addrs"),
        /* JADX INFO: Fake field, exist only in values array */
        IS_DEV_MODE_ON("dmo"),
        /* JADX INFO: Fake field, exist only in values array */
        KNOWN_APPS("known_apps"),
        /* JADX INFO: Fake field, exist only in values array */
        LINKER_ID("linker_id"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_COUNTRY("locale_country"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_LANG("locale_lang"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCATION("location"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCATION_AREA_CODE("location_area_code"),
        /* JADX INFO: Fake field, exist only in values array */
        MEMORY("memory"),
        /* JADX INFO: Fake field, exist only in values array */
        MG_ID("mg_id"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_OPERATOR("network_operator"),
        /* JADX INFO: Fake field, exist only in values array */
        PHONE_TYPE("phone_type"),
        /* JADX INFO: Fake field, exist only in values array */
        PL("pl"),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY_SETTING("proxy_setting"),
        /* JADX INFO: Fake field, exist only in values array */
        RISK_COMP_SESSION_ID("risk_comp_session_id"),
        /* JADX INFO: Fake field, exist only in values array */
        ROAMING("roaming"),
        /* JADX INFO: Fake field, exist only in values array */
        SCREEN("screen"),
        /* JADX INFO: Fake field, exist only in values array */
        SERIAL_NUMBER("serial_number"),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_OPERATOR_NAME("sim_operator_name"),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_SERIAL_NUMBER("sim_serial_number"),
        /* JADX INFO: Fake field, exist only in values array */
        SR("sr"),
        /* JADX INFO: Fake field, exist only in values array */
        SSID("ssid"),
        /* JADX INFO: Fake field, exist only in values array */
        SUBSCRIBER_ID("subscriber_id"),
        /* JADX INFO: Fake field, exist only in values array */
        T("t"),
        /* JADX INFO: Fake field, exist only in values array */
        TIMESTAMP("timestamp"),
        /* JADX INFO: Fake field, exist only in values array */
        TZ("tz"),
        /* JADX INFO: Fake field, exist only in values array */
        TZ_NAME("tz_name"),
        /* JADX INFO: Fake field, exist only in values array */
        VPN_SETTING("VPN_setting");

        public final String d;

        public enum a {
            /* JADX INFO: Fake field, exist only in values array */
            CURRENT("current"),
            /* JADX INFO: Fake field, exist only in values array */
            LEVEL("level"),
            /* JADX INFO: Fake field, exist only in values array */
            METHOD("method"),
            /* JADX INFO: Fake field, exist only in values array */
            LOW_POWER("low_power"),
            /* JADX INFO: Fake field, exist only in values array */
            STATE("state"),
            /* JADX INFO: Fake field, exist only in values array */
            TEMP("temp"),
            /* JADX INFO: Fake field, exist only in values array */
            VOLTAGE("voltage");

            public final String d;

            a(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        public enum b {
            /* JADX INFO: Fake field, exist only in values array */
            FREE_SD("free_sd"),
            /* JADX INFO: Fake field, exist only in values array */
            FREE_UD("free"),
            /* JADX INFO: Fake field, exist only in values array */
            MOUNTED("mounted");

            public final String d;

            b(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        /* renamed from: lib.android.paypal.com.magnessdk.c$e$c, reason: collision with other inner class name */
        public enum EnumC0414c {
            /* JADX INFO: Fake field, exist only in values array */
            FREE("free"),
            /* JADX INFO: Fake field, exist only in values array */
            FREE_RUNTIME("free_runtime"),
            /* JADX INFO: Fake field, exist only in values array */
            MAX_RUNTIME("max_runtime"),
            /* JADX INFO: Fake field, exist only in values array */
            TOTAL("total"),
            /* JADX INFO: Fake field, exist only in values array */
            TOTAL_RUNTIME("total_runtime");

            public final String d;

            EnumC0414c(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        e(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public static final String[] f24891a = {"com.bignox.appcenter", "com.bluestacks.settings", "com.bluestacks.filemanager", "com.genymotion.superuser", "org.greatfruit.andy.ime", "com.kaopu001.tiantianserver", "com.tiantian.ime", "com.microvirt.installer", "com.android.ld.appstore", "com.ldmnq.launcher3", "com.jide.Appstore"};
        public static final String[] b = {"init.android_x86.rc", "ueventd.android_x86.rc", "fstab.android_x86", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc", "ueventd.android_x86_64.rc", "init.android_x86_64.rc", "fstab.goldfish", "init.goldfish.rc", "init.superuser.rc"};
        public static final String[] c = {"/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};
        public static final String[] d = {"/dev/socket/qemud", "/dev/qemu_pipe"};
        public static final String[] e = {"goldfish"};
        public static final String[] f = {"init.ranchu.rc", "init.remixos.rc", "init.andy.rc", "ueventd.andy.rc", "bin/genybaseband", "bin/genymotion-vbox-sf", "ueventd.nox.rc", "init.nox.rc", "/system/bin/noxd"};

        public static final class a {
        }
    }

    public enum g {
        /* JADX INFO: Fake field, exist only in values array */
        PRODUCTION("production"),
        /* JADX INFO: Fake field, exist only in values array */
        STAGE("stage");

        public final String d;

        g(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class h {
        public static final /* synthetic */ h[] d = {new h("NETWORKING", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        h EF5;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final /* synthetic */ a[] d = {new a("HTTP_CONNECT_TIMEOUT", 0), new a("HTTP_READ_TIMEOUT", 1), new a("READ_BYTE", 2)};

            /* JADX INFO: Fake field, exist only in values array */
            a EF5;

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) d.clone();
            }
        }

        public enum b {
            POST("POST"),
            GET("GET");

            public final String d;

            b(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: lib.android.paypal.com.magnessdk.c$h$c, reason: collision with other inner class name */
        public static final class EnumC0415c {
            public static final EnumC0415c d;
            public static final EnumC0415c e;
            public static final EnumC0415c f;
            public static final EnumC0415c g;
            public static final EnumC0415c h;
            public static final EnumC0415c i;
            public static final EnumC0415c j;
            public static final EnumC0415c k;
            public static final /* synthetic */ EnumC0415c[] l;

            static {
                EnumC0415c enumC0415c = new EnumC0415c("GET_REQUEST_STARTED", 0);
                d = enumC0415c;
                EnumC0415c enumC0415c2 = new EnumC0415c("GET_REQUEST_ERROR", 1);
                e = enumC0415c2;
                EnumC0415c enumC0415c3 = new EnumC0415c("GET_REQUEST_SUCCEEDED", 2);
                f = enumC0415c3;
                EnumC0415c enumC0415c4 = new EnumC0415c("POST_REQUEST_STARTED", 3);
                g = enumC0415c4;
                EnumC0415c enumC0415c5 = new EnumC0415c("POST_REQUEST_ERROR", 4);
                h = enumC0415c5;
                EnumC0415c enumC0415c6 = new EnumC0415c("POST_REQUEST_SUCCEEDED", 5);
                i = enumC0415c6;
                EnumC0415c enumC0415c7 = new EnumC0415c("HTTP_STATUS_FAILED", 6);
                j = enumC0415c7;
                EnumC0415c enumC0415c8 = new EnumC0415c("HTTP_STATUS_200", 7);
                k = enumC0415c8;
                l = new EnumC0415c[]{enumC0415c, enumC0415c2, enumC0415c3, enumC0415c4, enumC0415c5, enumC0415c6, enumC0415c7, enumC0415c8};
            }

            public static EnumC0415c valueOf(String str) {
                return (EnumC0415c) Enum.valueOf(EnumC0415c.class, str);
            }

            public static EnumC0415c[] values() {
                return (EnumC0415c[]) l.clone();
            }
        }

        public enum d {
            /* JADX INFO: Fake field, exist only in values array */
            AUDIT_JSON_URL("https://c.paypal.com/r/v1/device/mg-audit"),
            DEVICE_INFO_URL("https://c.paypal.com/r/v1/device/client-metadata"),
            PRODUCTION_BEACON_URL("https://b.stats.paypal.com/counter.cgi"),
            PRODUCTION_JSON_URL("https://c.paypal.com/r/v1/device/mg"),
            RAMP_CONFIG_URL("https://www.paypalobjects.com/rdaAssets/magnes/magnes_android_rac.json"),
            REMOTE_CONFIG_URL("https://www.paypalobjects.com/rdaAssets/magnes/magnes_android_rec.json"),
            /* JADX INFO: Fake field, exist only in values array */
            SANDBOX_DEVICE_INFO_URL("https://c.sandbox.paypal.com/r/v1/device/client-metadata"),
            /* JADX INFO: Fake field, exist only in values array */
            SANDBOX_AUDIT_JSON_URL("https://c.sandbox.paypal.com/r/v1/device/mg-audit"),
            /* JADX INFO: Fake field, exist only in values array */
            SANDBOX_PROD_JSON_URL("https://c.sandbox.paypal.com/r/v1/device/mg-audit");

            public final String d;

            d(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) d.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "MagnesNetworking";
        }
    }

    public enum i {
        /* JADX INFO: Fake field, exist only in values array */
        OPEN("o"),
        /* JADX INFO: Fake field, exist only in values array */
        EXCLUDED("e"),
        /* JADX INFO: Fake field, exist only in values array */
        MIN_VERSION("m"),
        /* JADX INFO: Fake field, exist only in values array */
        RAMP_THRESHOLD("r"),
        /* JADX INFO: Fake field, exist only in values array */
        APP_IDS("ai"),
        /* JADX INFO: Fake field, exist only in values array */
        APP_SOURCES("as"),
        /* JADX INFO: Fake field, exist only in values array */
        CONF_REFRESH_TIME_KEY("cr_ti");

        public final String d;

        i(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public enum j {
        /* JADX INFO: Fake field, exist only in values array */
        CONF_VERSION("conf_version"),
        /* JADX INFO: Fake field, exist only in values array */
        CONF_ENDPOINT_URL("endpoint_url"),
        /* JADX INFO: Fake field, exist only in values array */
        CONF_REFRESH_TIME_KEY("conf_refresh_time_interval"),
        /* JADX INFO: Fake field, exist only in values array */
        ANDROID_APPS_TO_CHECK("android_apps_to_check"),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_COLLECTABLE("nc"),
        /* JADX INFO: Fake field, exist only in values array */
        MG_ID("m"),
        /* JADX INFO: Fake field, exist only in values array */
        SENSOR_COLLECT_TIME("s");

        public final String d;

        j(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public enum k {
        KNOWN_ROOT_APPS_PACKAGES(0),
        SU_PATHS(1);

        public final String[] d;

        public enum a {
            /* JADX INFO: Fake field, exist only in values array */
            SU("su"),
            /* JADX INFO: Fake field, exist only in values array */
            BUSYBOX("busybox"),
            /* JADX INFO: Fake field, exist only in values array */
            MAGISK("magisk");

            public final String d;

            a(String str) {
                this.d = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.d;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {
            public static final b d;
            public static final b e;
            public static final b f;
            public static final b g;
            public static final b h;
            public static final b i;
            public static final b j;
            public static final /* synthetic */ b[] k;

            /* JADX INFO: Fake field, exist only in values array */
            b EF0;

            static {
                b bVar = new b("NUMBER_OF_ROOTED_FLAGS", 0);
                b bVar2 = new b("IS_TEST_KEYS_FOUND", 1);
                d = bVar2;
                b bVar3 = new b("IS_SU_FOUND", 2);
                e = bVar3;
                b bVar4 = new b("IS_SUPER_USER_APK_FOUND", 3);
                f = bVar4;
                b bVar5 = new b("DETECT_ROOT_MANAGEMENT_APPS", 4);
                g = bVar5;
                b bVar6 = new b("CHECK_FOR_BINARY_SU", 5);
                h = bVar6;
                b bVar7 = new b("CHECK_FOR_BINARY_BUSYBOX", 6);
                i = bVar7;
                b bVar8 = new b("CHECK_FOR_BINARY_MAGISK", 7);
                j = bVar8;
                k = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) k.clone();
            }
        }

        k(int i) {
            this.d = strArr;
        }
    }

    public enum l {
        /* JADX INFO: Fake field, exist only in values array */
        AC("ac"),
        /* JADX INFO: Fake field, exist only in values array */
        GY("gy"),
        /* JADX INFO: Fake field, exist only in values array */
        MG("mg");

        public final String d;

        l(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public enum m {
        /* JADX INFO: Fake field, exist only in values array */
        FLIGHT_TIME("flightTime"),
        /* JADX INFO: Fake field, exist only in values array */
        TELEMETRY_EVENTS("Events"),
        /* JADX INFO: Fake field, exist only in values array */
        TYPING_SPEED("ts"),
        /* JADX INFO: Fake field, exist only in values array */
        VIEW_ID("viewId"),
        /* JADX INFO: Fake field, exist only in values array */
        AUTO_COMPLETE_EVENT("wsac"),
        /* JADX INFO: Fake field, exist only in values array */
        BACKSPACE_EVENT("wsbs"),
        /* JADX INFO: Fake field, exist only in values array */
        CUT_EVENT("wsct"),
        /* JADX INFO: Fake field, exist only in values array */
        PRE_FILLED_EVENT("wspf"),
        /* JADX INFO: Fake field, exist only in values array */
        REGULAR_TYPING_EVENT("wsrt"),
        /* JADX INFO: Fake field, exist only in values array */
        FAILED_TO_CONVERT_TO_JSON("Failed to convert to JSON");

        public final String d;

        m(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public enum n {
        /* JADX INFO: Fake field, exist only in values array */
        TOUCH_EVENT("te"),
        /* JADX INFO: Fake field, exist only in values array */
        FORCE("f"),
        /* JADX INFO: Fake field, exist only in values array */
        RADIUS("r"),
        /* JADX INFO: Fake field, exist only in values array */
        TOUCH_LOCATION_X("x"),
        /* JADX INFO: Fake field, exist only in values array */
        TOUCH_LOCATION_Y("y"),
        /* JADX INFO: Fake field, exist only in values array */
        TOUCH_COUNT("tc"),
        /* JADX INFO: Fake field, exist only in values array */
        START_TIME("st"),
        /* JADX INFO: Fake field, exist only in values array */
        END_TIME("et"),
        /* JADX INFO: Fake field, exist only in values array */
        MAXIMUM_PRECISION("10000000d"),
        /* JADX INFO: Fake field, exist only in values array */
        UNINITIALIZED_TIME("-1000"),
        /* JADX INFO: Fake field, exist only in values array */
        MAXIMUM_EVENT_COUNT("400"),
        /* JADX INFO: Fake field, exist only in values array */
        MAXIMUM_TIME_ALLOWED("5000"),
        /* JADX INFO: Fake field, exist only in values array */
        MAXIMUM_TOUCH_COUNT("5");

        public final String d;

        n(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }
}
