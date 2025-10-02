package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import android.adservices.signals.UpdateSignalsRequest;
import android.adservices.topics.EncryptedTopic;
import android.net.Uri;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ FetchAndJoinCustomAudienceRequest.Builder a() {
        return new FetchAndJoinCustomAudienceRequest.Builder((Uri) null);
    }

    public static /* synthetic */ UpdateSignalsRequest.Builder d() {
        return new UpdateSignalsRequest.Builder((Uri) null);
    }

    public static /* bridge */ /* synthetic */ EncryptedTopic f(Object obj) {
        return (EncryptedTopic) obj;
    }

    public static /* synthetic */ void i() {
    }
}
