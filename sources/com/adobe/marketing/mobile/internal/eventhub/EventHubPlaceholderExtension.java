package com.adobe.marketing.mobile.internal.eventhub;

import com.adobe.marketing.mobile.Extension;
import com.adobe.marketing.mobile.ExtensionApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventHubPlaceholderExtension;", "Lcom/adobe/marketing/mobile/Extension;", "Lcom/adobe/marketing/mobile/ExtensionApi;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/ExtensionApi;)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class EventHubPlaceholderExtension extends Extension {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventHubPlaceholderExtension(@NotNull ExtensionApi extensionApi) {
        super(extensionApi);
        Intrinsics.h(extensionApi, "extensionApi");
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final String a() {
        return "EventHub";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final String c() {
        return "com.adobe.module.eventhub";
    }

    @Override // com.adobe.marketing.mobile.Extension
    public final String d() {
        return "3.3.1";
    }
}
