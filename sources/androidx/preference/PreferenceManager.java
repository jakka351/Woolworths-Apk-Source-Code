package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class PreferenceManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3604a;
    public long b = 0;
    public SharedPreferences c = null;
    public SharedPreferences.Editor d;
    public boolean e;
    public final String f;
    public PreferenceScreen g;
    public Object h;
    public Object i;
    public Object j;

    /* loaded from: classes2.dex */
    public interface OnDisplayPreferenceDialogListener {
        void O0(DialogPreference dialogPreference);
    }

    /* loaded from: classes2.dex */
    public interface OnNavigateToScreenListener {
        void l0(PreferenceScreen preferenceScreen);
    }

    /* loaded from: classes2.dex */
    public interface OnPreferenceTreeClickListener {
        boolean Y(Preference preference);
    }

    /* loaded from: classes2.dex */
    public static abstract class PreferenceComparisonCallback {
    }

    /* loaded from: classes2.dex */
    public static class SimplePreferenceComparisonCallback extends PreferenceComparisonCallback {
    }

    @RestrictTo
    public PreferenceManager(@NonNull Context context) {
        this.f3604a = context;
        this.f = context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor a() {
        if (!this.e) {
            return b().edit();
        }
        if (this.d == null) {
            this.d = b().edit();
        }
        return this.d;
    }

    public final SharedPreferences b() {
        if (this.c == null) {
            this.c = this.f3604a.getSharedPreferences(this.f, 0);
        }
        return this.c;
    }
}
