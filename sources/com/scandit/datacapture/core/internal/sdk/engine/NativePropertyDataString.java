package com.scandit.datacapture.core.internal.sdk.engine;

import android.support.v4.media.session.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.ArrayList;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativePropertyDataString {
    final String defaultValue;
    final ArrayList<String> supportedValues;

    public NativePropertyDataString(String str, ArrayList<String> arrayList) {
        this.defaultValue = str;
        this.supportedValues = arrayList;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public ArrayList<String> getSupportedValues() {
        return this.supportedValues;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativePropertyDataString{defaultValue=");
        sb.append(this.defaultValue);
        sb.append(",supportedValues=");
        return a.q("}", sb, this.supportedValues);
    }
}
