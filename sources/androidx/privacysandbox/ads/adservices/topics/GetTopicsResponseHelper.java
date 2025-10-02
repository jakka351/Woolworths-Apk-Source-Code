package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.measurement.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponseHelper;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RestrictTo
/* loaded from: classes2.dex */
public final class GetTopicsResponseHelper {
    public static GetTopicsResponse a(android.adservices.topics.GetTopicsResponse response) {
        Intrinsics.h(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicI = a.i(it.next());
            arrayList.add(new Topic(topicI.getTaxonomyVersion(), topicI.getModelVersion(), topicI.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            android.adservices.topics.EncryptedTopic encryptedTopicF = androidx.privacysandbox.ads.adservices.customaudience.a.f(it2.next());
            byte[] encryptedTopic = encryptedTopicF.getEncryptedTopic();
            Intrinsics.g(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicF.getKeyIdentifier();
            Intrinsics.g(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicF.getEncapsulatedKey();
            Intrinsics.g(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new EncryptedTopic(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new GetTopicsResponse(arrayList, arrayList2);
    }
}
