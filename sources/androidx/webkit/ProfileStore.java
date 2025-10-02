package androidx.webkit;

import androidx.annotation.UiThread;
import androidx.webkit.internal.ProfileStoreImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.util.List;

@UiThread
/* loaded from: classes2.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (WebViewFeatureInternal.k.d()) {
            return ProfileStoreImpl.getInstance();
        }
        throw WebViewFeatureInternal.a();
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    Profile getOrCreateProfile(String str);

    Profile getProfile(String str);
}
