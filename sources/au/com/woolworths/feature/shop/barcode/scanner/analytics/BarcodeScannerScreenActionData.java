package au.com.woolworths.feature.shop.barcode.scanner.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/analytics/BarcodeScannerScreenActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BarcodeScannerScreenActionData implements Action {
    public static final BarcodeScannerScreenActionData e;
    public static final BarcodeScannerScreenActionData f;
    public static final BarcodeScannerScreenActionData g;
    public static final BarcodeScannerScreenActionData h;
    public static final BarcodeScannerScreenActionData i;
    public static final BarcodeScannerScreenActionData j;
    public static final BarcodeScannerScreenActionData k;
    public static final /* synthetic */ BarcodeScannerScreenActionData[] l;
    public static final /* synthetic */ EnumEntries m;
    public final Screen d = Screens.f;

    static {
        BarcodeScannerScreenActionData barcodeScannerScreenActionData = new BarcodeScannerScreenActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerScreenActionData.NETWORK_ERROR
            public final Category n = Category.u;
            public final String o = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        e = barcodeScannerScreenActionData;
        BarcodeScannerScreenActionData barcodeScannerScreenActionData2 = new BarcodeScannerScreenActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerScreenActionData.NETWORK_ERROR_DISMISSED
            public final Category n = Category.m;
            public final String o = "Network Error: OK";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        f = barcodeScannerScreenActionData2;
        BarcodeScannerScreenActionData barcodeScannerScreenActionData3 = new BarcodeScannerScreenActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerScreenActionData.SERVER_ERROR
            public final Category n = Category.u;
            public final String o = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        g = barcodeScannerScreenActionData3;
        BarcodeScannerScreenActionData barcodeScannerScreenActionData4 = new BarcodeScannerScreenActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerScreenActionData.SERVER_ERROR_DISMISSED
            public final Category n = Category.m;
            public final String o = "Server Error: OK";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        h = barcodeScannerScreenActionData4;
        BarcodeScannerScreenActionData barcodeScannerScreenActionData5 = new BarcodeScannerScreenActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerScreenActionData.PRODUCT_FOUND
            public final Category n = Category.i;
            public final String o = "Product Found";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        i = barcodeScannerScreenActionData5;
        BarcodeScannerScreenActionData barcodeScannerScreenActionData6 = new BarcodeScannerScreenActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerScreenActionData.PRODUCT_NOT_FOUND
            public final Category n = Category.u;
            public final String o = "Product Not Found";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        j = barcodeScannerScreenActionData6;
        BarcodeScannerScreenActionData barcodeScannerScreenActionData7 = new BarcodeScannerScreenActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerScreenActionData.PRODUCT_NOT_FOUND_DISMISSED
            public final Category n = Category.m;
            public final String o = "Product Not Found: OK";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        k = barcodeScannerScreenActionData7;
        BarcodeScannerScreenActionData[] barcodeScannerScreenActionDataArr = {barcodeScannerScreenActionData, barcodeScannerScreenActionData2, barcodeScannerScreenActionData3, barcodeScannerScreenActionData4, barcodeScannerScreenActionData5, barcodeScannerScreenActionData6, barcodeScannerScreenActionData7};
        l = barcodeScannerScreenActionDataArr;
        m = EnumEntriesKt.a(barcodeScannerScreenActionDataArr);
    }

    public BarcodeScannerScreenActionData(String str, int i2) {
    }

    public static BarcodeScannerScreenActionData valueOf(String str) {
        return (BarcodeScannerScreenActionData) Enum.valueOf(BarcodeScannerScreenActionData.class, str);
    }

    public static BarcodeScannerScreenActionData[] values() {
        return (BarcodeScannerScreenActionData[]) l.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
