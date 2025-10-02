package au.com.woolworths.android.onesite.app;

import au.com.woolworths.pay.sdk.models.config.Environment;
import com.woolworths.scanlibrary.di.module.ScanAndGoConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/app/ShopAppScanAndGoConfig;", "Lcom/woolworths/scanlibrary/di/module/ScanAndGoConfig;", "", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ShopAppScanAndGoConfig implements ScanAndGoConfig {
    public static final ShopAppScanAndGoConfig d;
    public static final ShopAppScanAndGoConfig e;
    public static final ShopAppScanAndGoConfig f;
    public static final ShopAppScanAndGoConfig g;
    public static final ShopAppScanAndGoConfig h;
    public static final /* synthetic */ ShopAppScanAndGoConfig[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        ShopAppScanAndGoConfig shopAppScanAndGoConfig = new ShopAppScanAndGoConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAppScanAndGoConfig.MOCK
            public final Environment k = Environment.LOCALHOST;
            public final String l = "";
            public final String m = "Gd7nAPRg2o1M0DO8sYhoOwkUXjPq7YIk";
            public final String n = "OTV1ZEQzb1g4MkpTY1VRMXF5QUNTT015c3lBbDkzR2I=";
            public final String o = "bkRsZmh4WVBVMFJrb0ZoRw==";
            public final String p = "";

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: b, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: c, reason: from getter */
            public final Environment getK() {
                return this.k;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: d, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: e, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: f, reason: from getter */
            public final String getO() {
                return this.o;
            }
        };
        d = shopAppScanAndGoConfig;
        ShopAppScanAndGoConfig shopAppScanAndGoConfig2 = new ShopAppScanAndGoConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAppScanAndGoConfig.DEV
            public final Environment k = Environment.WOOLWORTHS_DEV;
            public final String l = "https://dev.mobile-api.woolworths.com.au";
            public final String m = "Gd7nAPRg2o1M0DO8sYhoOwkUXjPq7YIk";
            public final String n = "OTV1ZEQzb1g4MkpTY1VRMXF5QUNTT015c3lBbDkzR2I=";
            public final String o = "bkRsZmh4WVBVMFJrb0ZoRw==";
            public final String p = "";

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: b, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: c, reason: from getter */
            public final Environment getK() {
                return this.k;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: d, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: e, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: f, reason: from getter */
            public final String getO() {
                return this.o;
            }
        };
        e = shopAppScanAndGoConfig2;
        ShopAppScanAndGoConfig shopAppScanAndGoConfig3 = new ShopAppScanAndGoConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAppScanAndGoConfig.SIT
            public final Environment k = Environment.WOOLWORTHS_TEST;
            public final String l = "https://test.mobile-api.woolworths.com.au";
            public final String m = "Gd7nAPRg2o1M0DO8sYhoOwkUXjPq7YIk";
            public final String n = "OTV1ZEQzb1g4MkpTY1VRMXF5QUNTT015c3lBbDkzR2I=";
            public final String o = "bkRsZmh4WVBVMFJrb0ZoRw==";
            public final String p = "";

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: b, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: c, reason: from getter */
            public final Environment getK() {
                return this.k;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: d, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: e, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: f, reason: from getter */
            public final String getO() {
                return this.o;
            }
        };
        f = shopAppScanAndGoConfig3;
        ShopAppScanAndGoConfig shopAppScanAndGoConfig4 = new ShopAppScanAndGoConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAppScanAndGoConfig.UAT
            public final Environment k = Environment.WOOLWORTHS_UAT;
            public final String l = "https://uat.mobile-api.woolworths.com.au";
            public final String m = "Gd7nAPRg2o1M0DO8sYhoOwkUXjPq7YIk";
            public final String n = "OTV1ZEQzb1g4MkpTY1VRMXF5QUNTT015c3lBbDkzR2I=";
            public final String o = "bkRsZmh4WVBVMFJrb0ZoRw==";
            public final String p = "";

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: b, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: c, reason: from getter */
            public final Environment getK() {
                return this.k;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: d, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: e, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: f, reason: from getter */
            public final String getO() {
                return this.o;
            }
        };
        g = shopAppScanAndGoConfig4;
        ShopAppScanAndGoConfig shopAppScanAndGoConfig5 = new ShopAppScanAndGoConfig() { // from class: au.com.woolworths.android.onesite.app.ShopAppScanAndGoConfig.PRODUCTION
            public final Environment k = Environment.PRODUCTION;
            public final String l = "https://api.woolworths.com.au";
            public final String m = "jFUxL8IGtkCyA1cIAYlkh30yfFb3GC47";
            public final String n = "ekJHRWY0SXhvb2hMZ21UQm9Pa1ExTzE1cjRGYjUwSmc=";
            public final String o = "QktBYmJQT0h6dVpKUzVzYw==";
            public final String p = "";

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: b, reason: from getter */
            public final String getP() {
                return this.p;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: c, reason: from getter */
            public final Environment getK() {
                return this.k;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: d, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: e, reason: from getter */
            public final String getN() {
                return this.n;
            }

            @Override // com.woolworths.scanlibrary.di.module.ScanAndGoConfig
            /* renamed from: f, reason: from getter */
            public final String getO() {
                return this.o;
            }
        };
        h = shopAppScanAndGoConfig5;
        ShopAppScanAndGoConfig[] shopAppScanAndGoConfigArr = {shopAppScanAndGoConfig, shopAppScanAndGoConfig2, shopAppScanAndGoConfig3, shopAppScanAndGoConfig4, shopAppScanAndGoConfig5};
        i = shopAppScanAndGoConfigArr;
        j = EnumEntriesKt.a(shopAppScanAndGoConfigArr);
    }

    public static ShopAppScanAndGoConfig valueOf(String str) {
        return (ShopAppScanAndGoConfig) Enum.valueOf(ShopAppScanAndGoConfig.class, str);
    }

    public static ShopAppScanAndGoConfig[] values() {
        return (ShopAppScanAndGoConfig[]) i.clone();
    }
}
