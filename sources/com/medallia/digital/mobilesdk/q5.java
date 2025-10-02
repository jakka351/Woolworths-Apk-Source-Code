package com.medallia.digital.mobilesdk;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.Display;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class q5 extends w1<b> {
    private ComponentCallbacks2 g;

    public class a implements ComponentCallbacks2 {
        public a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            q5 q5Var;
            b bVarO;
            try {
                int i = i4.c().b().getResources().getConfiguration().orientation;
                if (i == 1 || i == 2) {
                    q5Var = q5.this;
                    bVarO = q5Var.o();
                } else {
                    q5Var = q5.this;
                    bVarO = b.Unknown;
                }
                q5Var.a((q5) bVarO);
                Locale locale = Locale.US;
                a4.b("Collectors > Orientation : " + q5.this.f().toString());
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
        }
    }

    public enum b {
        Portrait(0),
        PortraitUpsidedown(2),
        LandscapeLeft(1),
        LandscapeRight(3),
        Unknown(-1);


        /* renamed from: a, reason: collision with root package name */
        private final int f16647a;

        b(int i) {
            this.f16647a = i;
        }

        public int a() {
            return this.f16647a;
        }

        public static b a(int i) {
            for (b bVar : values()) {
                if (bVar.a() == i) {
                    return bVar;
                }
            }
            return Unknown;
        }
    }

    public q5(n0 n0Var) {
        super(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b o() {
        try {
            Display displayF = this.f.f();
            return displayF != null ? b.a(displayF.getRotation()) : b.Unknown;
        } catch (Exception unused) {
            return b.Unknown;
        }
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.y;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void k() {
        super.k();
        if (f() != null) {
            Locale locale = Locale.US;
            a4.b(YU.a.A("Collectors > Orientation : ", f().toString()));
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void l() {
        super.l();
        if (h()) {
            this.g = new a();
            i4.c().b().registerComponentCallbacks(this.g);
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void m() {
        super.m();
        try {
            if (this.g != null) {
                i4.c().b().unregisterComponentCallbacks(this.g);
            }
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b j() {
        return o();
    }
}
