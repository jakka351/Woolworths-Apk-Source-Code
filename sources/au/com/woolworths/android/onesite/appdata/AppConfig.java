package au.com.woolworths.android.onesite.appdata;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumConfigData;
import au.com.woolworths.android.onesite.braintree.MagnesEnvironment;
import au.com.woolworths.android.onesite.devicefingerprint.DeviceFingerprintConfigData;
import au.com.woolworths.android.onesite.mandy.MagicLinkConfigData;
import au.com.woolworths.android.onesite.notification.SwrveConfigData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/AppConfig;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AppConfig {
    String a();

    /* renamed from: b */
    String getN();

    TealiumConfigData c();

    default String d() {
        return b.o(getL(), getX(), a());
    }

    /* renamed from: e */
    SwrveConfigData getP();

    /* renamed from: f */
    String getV();

    /* renamed from: l */
    String getT();

    /* renamed from: m */
    DeviceFingerprintConfigData getU();

    /* renamed from: n */
    MagicLinkConfigData getD();

    /* renamed from: o */
    String getO();

    /* renamed from: p */
    String getM();

    /* renamed from: q */
    String getR();

    /* renamed from: r */
    String getL();

    /* renamed from: s */
    String getQ();

    /* renamed from: t */
    MagnesEnvironment getW();

    /* renamed from: u */
    String getY();

    String w();

    /* renamed from: x */
    String getX();

    /* renamed from: y */
    String getS();

    String z();
}
