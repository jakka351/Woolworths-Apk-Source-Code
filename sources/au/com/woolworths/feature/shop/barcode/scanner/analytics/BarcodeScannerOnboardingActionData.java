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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/barcode/scanner/analytics/BarcodeScannerOnboardingActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "barcode-scanner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BarcodeScannerOnboardingActionData implements Action {
    public static final BarcodeScannerOnboardingActionData e;
    public static final BarcodeScannerOnboardingActionData f;
    public static final BarcodeScannerOnboardingActionData g;
    public static final BarcodeScannerOnboardingActionData h;
    public static final BarcodeScannerOnboardingActionData i;
    public static final BarcodeScannerOnboardingActionData j;
    public static final BarcodeScannerOnboardingActionData k;
    public static final BarcodeScannerOnboardingActionData l;
    public static final /* synthetic */ BarcodeScannerOnboardingActionData[] m;
    public static final /* synthetic */ EnumEntries n;
    public final Screen d = Screens.e;

    static {
        BarcodeScannerOnboardingActionData barcodeScannerOnboardingActionData = new BarcodeScannerOnboardingActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerOnboardingActionData.ENABLE_CAMERA_ACCESS_CLICK
            public final Category o = Category.m;
            public final String p = "Enable Camera Access";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.o;
            }
        };
        e = barcodeScannerOnboardingActionData;
        BarcodeScannerOnboardingActionData barcodeScannerOnboardingActionData2 = new BarcodeScannerOnboardingActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerOnboardingActionData.CAMERA_PERMISSION_GRANTED_CLICK
            public final Category o = Category.m;
            public final String p = "Camera Permissions: Allow";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.o;
            }
        };
        f = barcodeScannerOnboardingActionData2;
        BarcodeScannerOnboardingActionData barcodeScannerOnboardingActionData3 = new BarcodeScannerOnboardingActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerOnboardingActionData.CAMERA_PERMISSION_DENIED_CLICK
            public final Category o = Category.m;
            public final String p = "Camera Permissions: Deny";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.o;
            }
        };
        g = barcodeScannerOnboardingActionData3;
        BarcodeScannerOnboardingActionData barcodeScannerOnboardingActionData4 = new BarcodeScannerOnboardingActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerOnboardingActionData.CAMERA_PERMISSION_DONT_ASK_CLICK
            public final Category o = Category.m;
            public final String p = "Camera Permissions: Don't ask again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.o;
            }
        };
        h = barcodeScannerOnboardingActionData4;
        BarcodeScannerOnboardingActionData barcodeScannerOnboardingActionData5 = new BarcodeScannerOnboardingActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerOnboardingActionData.CAMERA_PERMISSION_SETTINGS_CLICK
            public final Category o = Category.m;
            public final String p = "Camera Permissions: Settings";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.o;
            }
        };
        i = barcodeScannerOnboardingActionData5;
        BarcodeScannerOnboardingActionData barcodeScannerOnboardingActionData6 = new BarcodeScannerOnboardingActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerOnboardingActionData.CAMERA_PERMISSION_NOT_NOW_CLICK
            public final Category o = Category.m;
            public final String p = "Camera Permissions: Not Now";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.o;
            }
        };
        j = barcodeScannerOnboardingActionData6;
        BarcodeScannerOnboardingActionData barcodeScannerOnboardingActionData7 = new BarcodeScannerOnboardingActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerOnboardingActionData.PERMISSIONS_DIALOG
            public final Category o = Category.u;
            public final String p = "Camera Permissions";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.o;
            }
        };
        k = barcodeScannerOnboardingActionData7;
        BarcodeScannerOnboardingActionData barcodeScannerOnboardingActionData8 = new BarcodeScannerOnboardingActionData() { // from class: au.com.woolworths.feature.shop.barcode.scanner.analytics.BarcodeScannerOnboardingActionData.PERMISSIONS_RATIONALE_DIALOG
            public final Category o = Category.u;
            public final String p = "Camera Permissions Rationale";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.p;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.o;
            }
        };
        l = barcodeScannerOnboardingActionData8;
        BarcodeScannerOnboardingActionData[] barcodeScannerOnboardingActionDataArr = {barcodeScannerOnboardingActionData, barcodeScannerOnboardingActionData2, barcodeScannerOnboardingActionData3, barcodeScannerOnboardingActionData4, barcodeScannerOnboardingActionData5, barcodeScannerOnboardingActionData6, barcodeScannerOnboardingActionData7, barcodeScannerOnboardingActionData8};
        m = barcodeScannerOnboardingActionDataArr;
        n = EnumEntriesKt.a(barcodeScannerOnboardingActionDataArr);
    }

    public BarcodeScannerOnboardingActionData(String str, int i2) {
    }

    public static BarcodeScannerOnboardingActionData valueOf(String str) {
        return (BarcodeScannerOnboardingActionData) Enum.valueOf(BarcodeScannerOnboardingActionData.class, str);
    }

    public static BarcodeScannerOnboardingActionData[] values() {
        return (BarcodeScannerOnboardingActionData[]) m.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
