package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzfcl {
    private String zza;

    public zzfcl(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1724546052) {
                if (iHashCode == 3059181 && strNextName.equals("code")) {
                    jsonReader.nextInt();
                } else {
                    jsonReader.skipValue();
                }
            } else if (strNextName.equals(lqlqqlq.mmm006Dm006Dm)) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.zza = strNextString;
    }

    public final String zza() {
        return this.zza;
    }
}
