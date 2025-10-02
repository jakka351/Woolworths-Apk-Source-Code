package au.com.woolworths.android.onesite.appdata;

import android.content.SharedPreferences;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/AppConfigurationInteractorImpl;", "Lau/com/woolworths/android/onesite/appdata/AppConfigurationInteractor;", "Companion", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AppConfigurationInteractorImpl implements AppConfigurationInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4222a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/AppConfigurationInteractorImpl$Companion;", "", "", "DEVICE_ID", "Ljava/lang/String;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public AppConfigurationInteractorImpl(SharedPreferences sharedPreferences) {
        this.f4222a = sharedPreferences;
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor
    public final void a(String str) {
        SharedPreferences.Editor editorEdit = this.f4222a.edit();
        editorEdit.putString(k.a.p, str);
        editorEdit.apply();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor
    public final String getDeviceId() {
        String string = this.f4222a.getString(k.a.p, null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        a(string2);
        Intrinsics.g(string2, "also(...)");
        return string2;
    }
}
