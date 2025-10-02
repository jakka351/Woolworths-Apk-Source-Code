package com.adobe.mobile;

import org.json.JSONObject;

/* loaded from: classes4.dex */
final class MessageTemplatePii extends MessageTemplateCallback {
    @Override // com.adobe.mobile.MessageTemplateCallback, com.adobe.mobile.Message
    public final boolean f(JSONObject jSONObject) {
        if (!super.f(jSONObject)) {
            return false;
        }
        if (this.r.length() > 0 && this.r.toLowerCase().trim().startsWith("https")) {
            return true;
        }
        StaticMethods.I("Data Callback - Unable to create data callback %s, templateurl is empty or does not use https for request", this.f13268a);
        return false;
    }

    @Override // com.adobe.mobile.MessageTemplateCallback
    public final ThirdPartyQueue q() {
        return PiiQueue.q();
    }

    @Override // com.adobe.mobile.MessageTemplateCallback
    public final String r() {
        return "PII";
    }
}
