package androidx.appcompat.app;

import android.content.Context;
import android.location.LocationManager;

/* loaded from: classes2.dex */
class TwilightManager {
    public static TwilightManager d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f110a;
    public final LocationManager b;
    public final TwilightState c = new TwilightState();

    public static class TwilightState {

        /* renamed from: a, reason: collision with root package name */
        public boolean f111a;
        public long b;
    }

    public TwilightManager(Context context, LocationManager locationManager) {
        this.f110a = context;
        this.b = locationManager;
    }

    public static TwilightManager a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new TwilightManager(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }
}
