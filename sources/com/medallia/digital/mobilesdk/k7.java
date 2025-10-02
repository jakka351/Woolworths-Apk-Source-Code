package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class k7 {
    private static k7 d;

    /* renamed from: a, reason: collision with root package name */
    private j7 f16569a;
    private boolean b = true;
    private boolean c;

    private k7() {
    }

    public static k7 b() {
        if (d == null) {
            d = new k7();
        }
        return d;
    }

    public ArrayList<t1> a() {
        j7 j7Var = this.f16569a;
        if (j7Var != null) {
            return j7Var.b();
        }
        return null;
    }

    public boolean c() {
        j7 j7Var = this.f16569a;
        if (j7Var != null) {
            return j7Var.c();
        }
        return false;
    }

    public void a(ConfigurationContract configurationContract) {
        MedalliaDigitalBrainConfigurationContract medalliaDigitalBrain;
        if (configurationContract == null || configurationContract.getSdkConfiguration() == null || (medalliaDigitalBrain = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain()) == null) {
            return;
        }
        boolean zIsTREV2Enabled = medalliaDigitalBrain.isTREV2Enabled();
        this.f16569a = zIsTREV2Enabled ? new n7() : new m7();
        this.f16569a.a(this.b, this.c);
        a4.e(YU.a.o(new StringBuilder("TargetEvaluator "), zIsTREV2Enabled ? "V2" : "V1", " is running"));
    }

    public void b(ConfigurationContract configurationContract) {
        j7 j7Var = this.f16569a;
        if (j7Var != null) {
            j7Var.a(configurationContract);
        }
    }

    public void a(u1.b bVar) {
        j7 j7Var = this.f16569a;
        if (j7Var != null) {
            j7Var.a(bVar);
        }
    }

    public void a(boolean z) {
        j7 j7Var = this.f16569a;
        if (j7Var != null) {
            j7Var.a(z);
        } else {
            this.c = z;
        }
    }

    public void a(boolean z, boolean z2) {
        j7 j7Var = this.f16569a;
        if (j7Var == null || !z2) {
            this.b = z;
        } else {
            j7Var.b(z);
        }
    }
}
