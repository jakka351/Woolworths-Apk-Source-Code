package me.oriient.internal.infra.utils.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.Keep;
import com.salesforce.marketingcloud.messages.iam.j;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.OsData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\nH\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001c"}, d2 = {"Lme/oriient/internal/infra/utils/android/OsDataImpl;", "Lme/oriient/internal/infra/utils/core/OsData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "apiLevel", "", "getApiLevel", "()I", "manufacturer", "", "getManufacturer", "()Ljava/lang/String;", "model", "getModel", "osType", "getOsType", "osVersion", "getOsVersion", "getCarrierName", "getConnectionType", "getConnectionTypeDescription", "type", "getDeviceDescription", "getLocale", "getMobileSubTypeDescription", "subtype", "getUserCountryByNetwork", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OsDataImpl implements OsData {
    private final int apiLevel;

    @NotNull
    private final Context context;

    @NotNull
    private final String manufacturer;

    @NotNull
    private final String model;

    @NotNull
    private final String osType;

    @NotNull
    private final String osVersion;

    public OsDataImpl(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.context = context;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.g(MANUFACTURER, "MANUFACTURER");
        this.manufacturer = MANUFACTURER;
        String MODEL = Build.MODEL;
        Intrinsics.g(MODEL, "MODEL");
        this.model = MODEL;
        this.apiLevel = Build.VERSION.SDK_INT;
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.g(RELEASE, "RELEASE");
        this.osVersion = RELEASE;
        this.osType = "android";
    }

    private final String getConnectionTypeDescription(int type) {
        return type != 0 ? type != 1 ? String.valueOf(type) : "Wifi" : "Mobile";
    }

    private final String getMobileSubTypeDescription(int subtype) {
        switch (subtype) {
            case 0:
                return j.h;
            case 1:
                return "GPRS (2G ~ 100 kbps)";
            case 2:
                return "EDGE (3G ~ 50-100 kbps)";
            case 3:
                return "UMTS (3G ~ 400-7000 kbps)";
            case 4:
                return "CDMA (3G ~ 14-64 kbps)";
            case 5:
                return "EVDO_0 (3G ~ 400-1000 kbps)";
            case 6:
                return "EVDO_A (3G ~ 600-1400 kbps)";
            case 7:
                return "1xRTT (3G ~ 50-100 kbps)";
            case 8:
                return "HSDPA (3G  ~ 2-14 Mbps)";
            case 9:
                return "HSUPA (3G ~ 1-23 Mbps)";
            case 10:
                return "HSPA (3G ~ 700-1700 kbps)";
            case 11:
                return "IDEN (MIRS-PTT ~ 25 kbps)";
            case 12:
                return "EVDO_B (3G ~ 5 Mbps)";
            case 13:
                return "LTE (4G ~ 10+ Mbps)";
            case 14:
                return "EHRPD (3G ~ 1-2 Mbps)";
            case 15:
                return "HSPAP (3G ~ 10-20 Mbps)";
            case 16:
                return "GSM (2G ~ 10 kbps)";
            case 17:
                return "TD_SCDMA (3G ~ 1-2 Mbps)";
            case 18:
                return "IWLAN (Mobile over Wifi ~ ?)";
            case 19:
            default:
                return String.valueOf(subtype);
            case 20:
                return "5G New Radio (100-400 Mbps)";
        }
    }

    @Override // me.oriient.internal.infra.utils.core.OsData
    public int getApiLevel() {
        return this.apiLevel;
    }

    @Override // me.oriient.internal.infra.utils.core.OsData
    @NotNull
    public String getCarrierName() {
        Object systemService = this.context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? j.h : networkOperatorName;
    }

    @Override // me.oriient.internal.infra.utils.core.OsData
    @NotNull
    public String getConnectionType() {
        NetworkInfo activeNetworkInfo;
        Object systemService = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return j.h;
        }
        int type = activeNetworkInfo.getType();
        String connectionTypeDescription = getConnectionTypeDescription(type);
        if (type != 0) {
            return connectionTypeDescription;
        }
        StringBuilder sbT = YU.a.t(connectionTypeDescription, " - ");
        sbT.append(getMobileSubTypeDescription(activeNetworkInfo.getSubtype()));
        return sbT.toString();
    }

    @Override // me.oriient.internal.infra.utils.core.OsData
    @NotNull
    public String getDeviceDescription() {
        return Build.MANUFACTURER + ' ' + Build.MODEL;
    }

    @Override // me.oriient.internal.infra.utils.core.OsData
    @Nullable
    public String getLocale() {
        try {
            return this.context.getResources().getConfiguration().getLocales().get(0).getISO3Country();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // me.oriient.internal.infra.utils.core.OsData
    @NotNull
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override // me.oriient.internal.infra.utils.core.OsData
    @NotNull
    public String getModel() {
        return this.model;
    }

    @Override // me.oriient.internal.infra.utils.core.OsData
    @NotNull
    public String getOsType() {
        return this.osType;
    }

    @Override // me.oriient.internal.infra.utils.core.OsData
    @NotNull
    public String getOsVersion() {
        return this.osVersion;
    }

    @Override // me.oriient.internal.infra.utils.core.OsData
    @Nullable
    public String getUserCountryByNetwork() {
        String networkCountryIso;
        try {
            Object systemService = this.context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager != null) {
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (simCountryIso != null && simCountryIso.length() == 2) {
                    Locale US = Locale.US;
                    Intrinsics.g(US, "US");
                    String lowerCase = simCountryIso.toLowerCase(US);
                    Intrinsics.g(lowerCase, "toLowerCase(...)");
                    return lowerCase;
                }
                if (telephonyManager.getPhoneType() != 2 && (networkCountryIso = telephonyManager.getNetworkCountryIso()) != null && networkCountryIso.length() == 2) {
                    Locale US2 = Locale.US;
                    Intrinsics.g(US2, "US");
                    String lowerCase2 = networkCountryIso.toLowerCase(US2);
                    Intrinsics.g(lowerCase2, "toLowerCase(...)");
                    return lowerCase2;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
