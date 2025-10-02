package lib.android.paypal.com.magnessdk;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class MagnesSettings {

    /* renamed from: a, reason: collision with root package name */
    public int f24889a;
    public String b;
    public Context c;
    public boolean d;
    public Environment e;

    public static class Builder {
        public String b;
        public final Context c;

        /* renamed from: a, reason: collision with root package name */
        public int f24890a = 19;
        public Environment d = Environment.d;
        public boolean e = false;

        public Builder(@NonNull Context context) {
            this.c = context;
        }

        public final MagnesSettings a() {
            MagnesSettings magnesSettings = new MagnesSettings();
            magnesSettings.f24889a = this.f24890a;
            magnesSettings.b = this.b;
            magnesSettings.c = this.c;
            magnesSettings.e = this.d;
            magnesSettings.d = this.e;
            return magnesSettings;
        }
    }
}
