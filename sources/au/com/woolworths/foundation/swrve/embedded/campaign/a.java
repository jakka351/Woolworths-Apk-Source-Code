package au.com.woolworths.foundation.swrve.embedded.campaign;

import com.swrve.sdk.messaging.SwrveEmbeddedListener;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import java.util.HashMap;
import kotlin.collections.EmptyMap;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements SwrveEmbeddedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EmbeddedCampaignProcessor f8897a;

    @Override // com.swrve.sdk.messaging.SwrveEmbeddedListener
    public final void a(SwrveEmbeddedMessage swrveEmbeddedMessage, HashMap map) {
        Object value;
        EmbeddedCampaignProcessor embeddedCampaignProcessor = this.f8897a;
        if (((Boolean) embeddedCampaignProcessor.f8895a.invoke()).booleanValue()) {
            return;
        }
        MutableStateFlow mutableStateFlow = embeddedCampaignProcessor.b;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, CampaignProcessorState.a((CampaignProcessorState) value, swrveEmbeddedMessage, map == null ? EmptyMap.d : map, 4)));
        embeddedCampaignProcessor.a();
    }
}
