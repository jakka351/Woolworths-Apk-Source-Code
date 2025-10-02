package au.com.woolworths.android.onesite.repository;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import com.google.gson.Gson;

/* loaded from: classes.dex */
public class PreferencesManagerImpl implements PreferencesManager {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f4588a;
    public Gson b;

    @Override // au.com.woolworths.android.onesite.repository.PreferencesManager
    public final String a() {
        return this.f4588a.getString("edr", null);
    }

    @Override // au.com.woolworths.android.onesite.repository.PreferencesManager
    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f4588a.edit();
        editorEdit.putString("last_config_version", str);
        editorEdit.apply();
    }

    @Override // au.com.woolworths.android.onesite.repository.PreferencesManager
    public final boolean c() {
        return this.f4588a.getBoolean("change_mode_hint", false);
    }

    @Override // au.com.woolworths.android.onesite.repository.PreferencesManager
    public final StoreLocatorResult.Store d() {
        return (StoreLocatorResult.Store) this.b.d(StoreLocatorResult.Store.class, this.f4588a.getString("instore", null));
    }

    @Override // au.com.woolworths.android.onesite.repository.PreferencesManager
    public final void e(StoreLocatorResult.Store store) {
        String strJ = this.b.j(store);
        SharedPreferences.Editor editorEdit = this.f4588a.edit();
        editorEdit.putString("instore", strJ);
        editorEdit.apply();
    }

    @Override // au.com.woolworths.android.onesite.repository.PreferencesManager
    public final boolean f() {
        return this.f4588a.getBoolean("mode_has_been_selected", false);
    }

    @Override // au.com.woolworths.android.onesite.repository.PreferencesManager
    public final LaunchManager.LaunchState g() {
        return LaunchManager.LaunchState.values()[this.f4588a.getInt("launch_state", 0)];
    }

    @Override // au.com.woolworths.android.onesite.repository.PreferencesManager
    public final void h() {
        SharedPreferences.Editor editorEdit = this.f4588a.edit();
        editorEdit.remove("mode_has_been_selected");
        editorEdit.apply();
    }

    @Override // au.com.woolworths.android.onesite.repository.PreferencesManager
    public final void i(LaunchManager.LaunchState launchState) {
        SharedPreferences.Editor editorEdit = this.f4588a.edit();
        editorEdit.putInt("launch_state", launchState.ordinal());
        editorEdit.apply();
    }

    @Override // au.com.woolworths.android.onesite.repository.PreferencesManager
    public final String j() {
        return this.f4588a.getString("last_config_version", "");
    }
}
