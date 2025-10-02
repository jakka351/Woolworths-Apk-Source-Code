package com.medallia.digital.mobilesdk;

/* loaded from: classes.dex */
final class t0 {
    private static t0 c;

    /* renamed from: a, reason: collision with root package name */
    private ConfigurationContract f16707a;
    private ConfigurationUUID b;

    private t0() {
    }

    public static t0 c() {
        if (c == null) {
            c = new t0();
        }
        return c;
    }

    public ConfigurationContract a() {
        return this.f16707a;
    }

    public ConfigurationUUID b() {
        return this.b;
    }

    public void a(ConfigurationContract configurationContract) {
        this.f16707a = configurationContract;
    }

    public void a(ConfigurationUUID configurationUUID) {
        this.b = configurationUUID;
    }

    public void a(PropertyConfigurationContract propertyConfigurationContract) {
        this.f16707a.propertyConfiguration = propertyConfigurationContract;
    }
}
