package com.medallia.digital.mobilesdk;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* loaded from: classes.dex */
enum c8 {
    Fade("fade"),
    SlideDown("slideDown"),
    SlideUp("slideUp"),
    SlideLeft("slideLeft"),
    SlideRight("slideRight"),
    None(DevicePublicKeyStringDef.NONE);


    /* renamed from: a, reason: collision with root package name */
    private final String f16410a;

    c8(String str) {
        this.f16410a = str;
    }

    public static c8 a(String str) {
        if (str == null) {
            return Fade;
        }
        for (c8 c8Var : values()) {
            if (c8Var.a().equals(str)) {
                return c8Var;
            }
        }
        a4.f("Unsupported transition type");
        return Fade;
    }

    public String a() {
        return this.f16410a;
    }
}
