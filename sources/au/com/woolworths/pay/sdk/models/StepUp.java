package au.com.woolworths.pay.sdk.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;
import java.io.Serializable;
import java.net.URL;

@Keep
/* loaded from: classes4.dex */
public class StepUp implements Serializable {

    @JSONField
    private boolean mandatory = false;

    @NonNull
    @JSONField
    private URL url = null;

    @NonNull
    public URL getURL() {
        return this.url;
    }

    public boolean isMandatory() {
        return this.mandatory;
    }

    @NonNull
    public String toString() {
        return "{mandatory: " + this.mandatory + ", url: " + this.url + "}";
    }
}
