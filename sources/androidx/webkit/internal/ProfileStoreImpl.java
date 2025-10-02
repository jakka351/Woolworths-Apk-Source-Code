package androidx.webkit.internal;

import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class ProfileStoreImpl implements ProfileStore {
    public static ProfileStoreImpl b;

    /* renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f3852a;

    public ProfileStoreImpl(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f3852a = profileStoreBoundaryInterface;
    }

    public static ProfileStore getInstance() {
        if (b == null) {
            b = new ProfileStoreImpl(WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.f3860a.getProfileStore());
        }
        return b;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (WebViewFeatureInternal.k.d()) {
            return this.f3852a.deleteProfile(str);
        }
        throw WebViewFeatureInternal.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (WebViewFeatureInternal.k.d()) {
            return this.f3852a.getAllProfileNames();
        }
        throw WebViewFeatureInternal.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final Profile getOrCreateProfile(String str) {
        if (WebViewFeatureInternal.k.d()) {
            return new ProfileImpl((ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.a(ProfileBoundaryInterface.class, this.f3852a.getOrCreateProfile(str)));
        }
        throw WebViewFeatureInternal.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final Profile getProfile(String str) {
        if (!WebViewFeatureInternal.k.d()) {
            throw WebViewFeatureInternal.a();
        }
        InvocationHandler profile = this.f3852a.getProfile(str);
        if (profile != null) {
            return new ProfileImpl((ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.a(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }
}
