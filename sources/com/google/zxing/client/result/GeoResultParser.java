package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class GeoResultParser extends ResultParser {
    static {
        Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);
    }
}
