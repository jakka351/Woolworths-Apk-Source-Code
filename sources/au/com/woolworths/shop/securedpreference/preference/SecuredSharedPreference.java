package au.com.woolworths.shop.securedpreference.preference;

import YU.a;
import android.content.SharedPreferences;
import au.com.woolworths.shop.securedpreference.encryption.AndroidBasedEncryptionProvider;
import au.com.woolworths.shop.securedpreference.encryption.EncryptionProvider;
import java.util.Map;
import java.util.Set;
import timber.log.Timber;

/* loaded from: classes4.dex */
public class SecuredSharedPreference implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12923a;
    public final EncryptionProvider b;

    public class SecuredEditor implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        public final SharedPreferences.Editor f12924a;

        public SecuredEditor() {
            this.f12924a = SecuredSharedPreference.this.f12923a.edit();
        }

        public final SharedPreferences.Editor a(String str, String str2) {
            String strB = SecuredSharedPreference.this.b.b(str2);
            Timber.f27013a.b(a.i("Encrypted value for ", str, " is ", strB), new Object[0]);
            return this.f12924a.putString(str, strB);
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            this.f12924a.apply();
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            return this.f12924a.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            return this.f12924a.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            return a(str, String.valueOf(z));
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f) {
            return a(str, String.valueOf(f));
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i) {
            return a(str, String.valueOf(i));
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j) {
            return a(str, String.valueOf(j));
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            return a(str, str2);
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set set) {
            return null;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            return this.f12924a.remove(str);
        }
    }

    public SecuredSharedPreference(SharedPreferences sharedPreferences, AndroidBasedEncryptionProvider androidBasedEncryptionProvider) {
        this.f12923a = sharedPreferences;
        this.b = androidBasedEncryptionProvider;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.f12923a.contains(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SecuredEditor();
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return null;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        String string = this.f12923a.getString(str, "");
        return string.length() == 0 ? z : Boolean.parseBoolean(this.b.a(string));
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        String string = this.f12923a.getString(str, "");
        return string.length() == 0 ? f : Float.parseFloat(this.b.a(string));
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        String string = this.f12923a.getString(str, "");
        return string.length() == 0 ? i : Integer.parseInt(this.b.a(string));
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        String string = this.f12923a.getString(str, "");
        return string.length() == 0 ? j : Long.parseLong(this.b.a(string));
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        String string = this.f12923a.getString(str, "");
        return string.length() == 0 ? str2 : this.b.a(string);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return null;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f12923a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f12923a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
