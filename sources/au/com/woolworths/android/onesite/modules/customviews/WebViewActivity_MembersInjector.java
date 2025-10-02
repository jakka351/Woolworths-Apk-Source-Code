package au.com.woolworths.android.onesite.modules.customviews;

import au.com.woolworths.android.onesite.network.SharedHeaders;
import au.com.woolworths.android.onesite.webview.ReleaseSquadHeaderInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class WebViewActivity_MembersInjector implements MembersInjector<WebViewActivity> {
    public static void a(WebViewActivity webViewActivity, SharedHeaders sharedHeaders) {
        webViewActivity.B = sharedHeaders;
    }

    public static void b(WebViewActivity webViewActivity, ReleaseSquadHeaderInteractor releaseSquadHeaderInteractor) {
        webViewActivity.C = releaseSquadHeaderInteractor;
    }
}
